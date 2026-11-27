// default package

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ tc a;
    public final /* synthetic */ qc b;

    public pc(qc qcVar, tc tcVar) {
        this.b = qcVar;
        this.a = tcVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        qc qcVar = this.b;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) qcVar.m;
        tc tcVar = this.a;
        onClickListener.onClick(tcVar.b, i);
        if (qcVar.a) {
            return;
        }
        tcVar.b.dismiss();
    }
}
