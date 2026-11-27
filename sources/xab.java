// default package

import android.app.Activity;
import android.app.Dialog;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class xab extends e {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rbb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xab(rbb rbbVar, byte b) {
        super(null);
        this.a = b;
        switch (b) {
            case 1:
                this.b = rbbVar;
                super(null);
                this.currentAccount = rbbVar.c;
                break;
            default:
                this.b = rbbVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Activity getParentActivity() {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
        }
        return rbbVar.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                return new pu0(rbbVar.a, (byte) 8);
            default:
                return new pu0(rbbVar.a, (byte) 9);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        byte b = this.a;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean presentFragment(e eVar) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(eVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
