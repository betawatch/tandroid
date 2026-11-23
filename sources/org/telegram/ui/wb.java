package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc b;

    public /* synthetic */ wb(qc qcVar, int i7) {
        this.a = i7;
        this.b = qcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        qc qcVar = this.b;
        switch (i7) {
            case 0:
                qc.Z(qcVar);
                break;
            default:
                org.telegram.messenger.f3.n(null, 2131752248, org.telegram.ui.Components.lc.b0(qcVar), R.raw.done, 36);
                break;
        }
    }
}
