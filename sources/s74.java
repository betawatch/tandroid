// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class s74 implements TextView.OnEditorActionListener {
    public final /* synthetic */ r74 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ k27 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ hd[] e;
    public final /* synthetic */ View f;
    public final /* synthetic */ v74 g;

    public s74(v74 v74Var, r74 r74Var, int i, k27 k27Var, boolean z, hd[] hdVarArr, View view) {
        this.g = v74Var;
        this.a = r74Var;
        this.b = i;
        this.c = k27Var;
        this.d = z;
        this.e = hdVarArr;
        this.f = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        r74 r74Var = this.a;
        if (r74Var.getText().toString().length() > this.b) {
            gl.z3(r74Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {r74Var.getText()};
        v74 v74Var = this.g;
        tL_textWithEntities.entities = hq6.d0(v74Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        v74Var.a(this.c, tL_textWithEntities, this.d);
        hd[] hdVarArr = this.e;
        hd hdVar = hdVarArr[0];
        if (hdVar != null) {
            hdVar.dismiss();
        }
        if (hdVarArr[0] == v74.i) {
            v74.i = null;
        }
        View view = this.f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
