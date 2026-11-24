// default package

import android.graphics.Color;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pl0 extends nl0 {
    public final /* synthetic */ wjb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(wjb wjbVar, wjb wjbVar2) {
        super(wjbVar);
        this.s = wjbVar2;
    }

    @Override // nl0, al0
    public final int K() {
        int a = a(this.c);
        wjb wjbVar = this.s;
        if (!bkb.g1(wjbVar) || Color.alpha(bkb.v0(bkb.va, wjbVar)) == 0) {
            return a;
        }
        return 0;
    }

    @Override // nl0, al0
    public final float U0() {
        return gl.N(0.6f);
    }

    @Override // nl0, al0
    public final int a1() {
        wjb wjbVar = this.s;
        if (bkb.g1(wjbVar)) {
            return bkb.v0(bkb.xa, wjbVar);
        }
        return 0;
    }

    @Override // nl0
    public final float b() {
        return bkb.g1(this.s) ? gl.N(1.0f) : this.r;
    }

    @Override // nl0, al0
    public final int b0() {
        wjb wjbVar = this.s;
        if (bkb.g1(wjbVar)) {
            return bkb.v0(bkb.va, wjbVar);
        }
        return 0;
    }

    @Override // nl0
    public final float c() {
        return bkb.g1(this.s) ? gl.N(2.25f) : this.n;
    }

    @Override // nl0, al0
    public final int d1() {
        wjb wjbVar = this.s;
        return bkb.g1(wjbVar) ? bkb.v0(bkb.wa, wjbVar) : a(this.b);
    }

    @Override // nl0, al0
    public final int k0() {
        int a = a(this.d);
        wjb wjbVar = this.s;
        if (!bkb.g1(wjbVar) || Color.alpha(bkb.v0(bkb.va, wjbVar)) == 0) {
            return a;
        }
        return 0;
    }
}
