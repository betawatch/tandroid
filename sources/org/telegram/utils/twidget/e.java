package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p4.c0, p4.a1, h2.j {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override // h2.j
    public void accept(Object obj) {
        p4.g1 g1Var = (p4.g1) obj;
        switch (this.a) {
            case 25:
                g1Var.B0();
                break;
            case 26:
                g1Var.b();
                break;
            case 27:
                g1Var.g0();
                break;
            default:
                g1Var.C0();
                break;
        }
    }

    @Override // p4.c0
    public void b(p4.u uVar, int i7) {
        switch (this.a) {
            case 20:
                uVar.getClass();
                break;
            case 21:
                uVar.c(i7);
                break;
            default:
                uVar.getClass();
                break;
        }
    }

    @Override // p4.a1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 23:
                d0Var.getClass();
                throw new ClassCastException();
            case 24:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                return d0Var.n(vVar);
        }
    }

    public /* synthetic */ e(Object obj, int i7) {
        this.a = i7;
    }

    public /* synthetic */ e(String str, int i7, int i10, p4.q qVar) {
        this.a = 24;
    }

    public /* synthetic */ e(boolean z10, p4.i1 i1Var, Bundle bundle) {
        this.a = 28;
    }
}
