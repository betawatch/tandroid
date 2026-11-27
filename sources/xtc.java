// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
