package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w20 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w20(Object obj, org.telegram.ui.ActionBar.s1 s1Var, EditTextBoldCursor editTextBoldCursor, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = s1Var;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((c30) this.d).b.u1(null, this.b, this.c, true);
                break;
            default:
                ((x20) this.d).p1.b.u1(null, this.b, this.c, true);
                break;
        }
    }
}
