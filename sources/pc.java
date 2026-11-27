// default package

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
