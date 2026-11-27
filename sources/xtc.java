// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class xtc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xtc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ytc ytcVar = ((duc) obj).c;
                ytcVar.requestFocus();
                hl.E3(ytcVar);
                break;
            default:
                exc excVar = (exc) obj;
                excVar.a.c(!r3.b(), true);
                excVar.c.setEnabled(excVar.a.b());
                excVar.c.animate().alpha(excVar.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
