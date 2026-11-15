package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                org.telegram.messenger.k5.n(null, 2131752260, org.telegram.ui.Components.cc.a0(qcVar), R.raw.done, 36);
                break;
        }
    }
}
