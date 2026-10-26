package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s6 extends org.telegram.ui.ActionBar.k3 {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ s6(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(i10, context, u6Var, z10);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public boolean canDismissWithTouchOutside() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return super.canDismissWithTouchOutside();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public void onThemeColorsChanged() {
        switch (this.b) {
            case 1:
                super.onThemeColorsChanged();
                try {
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.h5);
                    if (this.navBarColor != themedColor) {
                        fixNavigationBar(themedColor);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                super.onThemeColorsChanged();
                break;
        }
    }

    public /* synthetic */ s6(Context context, boolean z10) {
        super(context, z10);
    }
}
