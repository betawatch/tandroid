// default package

import android.graphics.Color;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pl0 extends nl0 {
    public final /* synthetic */ wjb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(wjb wjbVar, wjb wjbVar2) {
        super(wjbVar);
        this.s = wjbVar2;
    }

    @Override // nl0, al0
    public final int L() {
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
    public final int j0() {
        wjb wjbVar = this.s;
        if (bkb.g1(wjbVar)) {
            return bkb.v0(bkb.va, wjbVar);
        }
        return 0;
    }

    @Override // nl0, al0
    public final int m0() {
        int a = a(this.d);
        wjb wjbVar = this.s;
        if (!bkb.g1(wjbVar) || Color.alpha(bkb.v0(bkb.va, wjbVar)) == 0) {
            return a;
        }
        return 0;
    }
}
