package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
