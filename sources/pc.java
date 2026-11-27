// default package

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
