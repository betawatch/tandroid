package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wi extends org.telegram.ui.Components.s30 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(i9, context, b6Var, z10);
        this.E = i10;
    }

    @Override // org.telegram.ui.Components.s30
    public int c() {
        switch (this.E) {
            case 0:
                return AndroidUtilities.dp(56.0f) / 2;
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        switch (this.E) {
            case 1:
                super.setVisibility(i9);
                if (i9 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                super.setVisibility(i9);
                if (i9 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 3:
                super.setVisibility(i9);
                if (i9 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }
}
