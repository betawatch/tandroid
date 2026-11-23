package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements p4.c0, p4.b1, h2.j {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override // h2.j
    public void accept(Object obj) {
        p4.h1 h1Var = (p4.h1) obj;
        switch (this.a) {
            case 26:
                h1Var.C0();
                break;
            case 27:
                h1Var.b();
                break;
            default:
                h1Var.h0();
                break;
        }
    }

    @Override // p4.c0
    public void b(p4.u uVar, int i7) {
        switch (this.a) {
            case 21:
                uVar.getClass();
                break;
            case 22:
                uVar.c(i7);
                break;
            default:
                uVar.getClass();
                break;
        }
    }

    @Override // p4.b1
    public Object j(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 24:
                d0Var.getClass();
                throw new ClassCastException();
            case 25:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                return d0Var.n(vVar);
        }
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
    }

    public /* synthetic */ f(String str, int i7, int i10, p4.q qVar) {
        this.a = 25;
    }

    public /* synthetic */ f(boolean z10, p4.j1 j1Var, Bundle bundle) {
        this.a = 29;
    }
}
