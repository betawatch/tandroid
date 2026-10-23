package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class r6 extends org.telegram.ui.ActionBar.h3 {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ r6(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(i10, context, g6Var, z10);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public boolean canDismissWithTouchOutside() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return super.canDismissWithTouchOutside();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public void onThemeColorsChanged() {
        switch (this.b) {
            case 1:
                super.onThemeColorsChanged();
                try {
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.h5);
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

    public /* synthetic */ r6(Context context, boolean z10) {
        super(context, z10);
    }
}
