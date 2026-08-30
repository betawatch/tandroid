package uf;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ m(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                q.d = null;
                View view = this.b;
                if (view != null) {
                    view.requestFocus();
                    break;
                }
                break;
            default:
                m1.h = null;
                View view2 = this.b;
                if (view2 != null) {
                    view2.requestFocus();
                    break;
                }
                break;
        }
    }
}
