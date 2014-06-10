package ro.brucelee.xposed.recenttasksram;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XSharedPreferences;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class RecentTasksRam implements IXposedHookLoadPackage {

	public static final String PACKAGE_NAME = RecentTasksRam.class.getPackage().getName();
    public static String MODULE_PATH = null;
    private static XSharedPreferences prefs;
	
    @Override
    public void handleLoadPackage(LoadPackageParam lpparam) throws Throwable {
        if (lpparam.packageName.equals(ModClearAllRecents.PACKAGE_NAME)) {
            ModClearAllRecents.init(prefs, lpparam.classLoader);
        }
    }
}
