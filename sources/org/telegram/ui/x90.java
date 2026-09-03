package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x90 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ x90(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.p2 lastFragment;
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.n0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.n0.getLastFragment()) != null && !(lastFragment instanceof fc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(lastFragment);
                    org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.k6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    y80 y80Var = new y80(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.g6 g6Var = a02.c;
                    org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(W, g6Var);
                    fcVar.a.setImageDrawable(r9Var);
                    fcVar.b.setText(string);
                    fcVar.c.setText(formatString);
                    org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(a02.W(), g6Var, true);
                    gcVar.e(string2);
                    gcVar.a = y80Var;
                    fcVar.setButton(gcVar);
                    org.telegram.ui.Components.ic b10 = a02.b(fcVar, 2750);
                    b10.j = 5000;
                    b10.j();
                    break;
                }
                break;
            default:
                Pattern pattern = LaunchActivity.y1;
                MessagesController.getInstance(launchActivity.L).openApp((TLRPC.User) obj, 0);
                break;
        }
    }
}
