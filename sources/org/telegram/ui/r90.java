package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r90 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ r90(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.r2 lastFragment;
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.q0.getLastFragment()) != null && !(lastFragment instanceof wb0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(lastFragment);
                    org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.y6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    p80 p80Var = new p80(launchActivity, 10);
                    b02.getClass();
                    Context X = b02.X();
                    org.telegram.ui.ActionBar.u6 u6Var = b02.c;
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(X, u6Var);
                    ncVar.a.setImageDrawable(baVar);
                    ncVar.b.setText(string);
                    ncVar.c.setText(formatString);
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(b02.X(), u6Var, true);
                    ocVar.e(string2);
                    ocVar.b = p80Var;
                    ncVar.setButton(ocVar);
                    org.telegram.ui.Components.qc b10 = b02.b(ncVar, 2750);
                    b10.j = 5000;
                    b10.j();
                    break;
                }
                break;
            default:
                Pattern pattern = LaunchActivity.D1;
                MessagesController.getInstance(launchActivity.O).openApp((TLRPC.User) obj, 0);
                break;
        }
    }
}
