package u7;

import c8.qc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class r extends s {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ s e;

    public r(s sVar, int i7, int i10) {
        this.e = sVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        qc.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // u7.p
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // u7.p
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // u7.p
    public final boolean k() {
        return true;
    }

    @Override // u7.p
    public final Object[] l() {
        return this.e.l();
    }

    @Override // u7.s, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final s subList(int i7, int i10) {
        qc.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
