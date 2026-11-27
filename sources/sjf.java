// default package

import android.media.MediaDrmException;
import android.text.Editable;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class sjf implements s8a, tq2, bde, e30, bx2, d64, tw8, l12, mu8, peb, dgc {
    public static sjf b;
    public final /* synthetic */ byte a;
    public static final sjf c = new sjf(1);
    public static final sjf d = new sjf(2);
    public static final l9a e = new l9a(null, null, null, null, null);
    public static final /* synthetic */ sjf f = new sjf(3);
    public static final sjf h = new sjf(4);
    public static final sjf n = new sjf(5);
    public static final sjf r = new sjf(6);
    public static final sjf s = new sjf(7);
    public static final sjf w = new sjf(8);
    public static final sjf x = new sjf(9);
    public static final sjf y = new sjf(10);
    public static final sjf E = new sjf(11);
    public static final sjf F = new sjf(12);

    public /* synthetic */ sjf(byte b2) {
        this.a = b2;
    }

    public static x76 G(j99 j99Var) {
        no5 listIterator = j99Var.listIterator(0);
        while (listIterator.hasNext()) {
            if (((ft6) listIterator.next()).b == null) {
                return fne.b(new UnsupportedOperationException());
            }
        }
        return fne.c(j99Var);
    }

    public static synchronized void S() {
        synchronized (sjf.class) {
            if (b == null) {
                b = new sjf((byte) 0);
            }
        }
    }

    public final void A(m34 m34Var) {
        m34Var.a(iaf.class, gle.a);
        m34Var.a(rhf.class, w2f.a);
        m34Var.a(laf.class, jle.a);
        m34Var.a(saf.class, vle.a);
        m34Var.a(naf.class, ple.a);
        m34Var.a(qaf.class, zle.a);
        m34Var.a(m6f.class, aee.a);
        m34Var.a(j6f.class, vde.a);
        m34Var.a(r8f.class, eje.a);
        m34Var.a(pgf.class, o0f.a);
        m34Var.a(h6f.class, pde.a);
        m34Var.a(f6f.class, kde.a);
        m34Var.a(cdf.class, ate.a);
        m34Var.a(vif.class, uhe.a);
        m34Var.a(g8f.class, gie.a);
        m34Var.a(s5f.class, ohe.a);
        m34Var.a(ddf.class, gte.a);
        m34Var.a(mgf.class, a0f.a);
        m34Var.a(ngf.class, f0f.a);
        m34Var.a(kgf.class, wze.a);
        m34Var.a(bbf.class, mne.a);
        m34Var.a(tif.class, k9e.a);
        m34Var.a(cbf.class, qne.a);
        m34Var.a(qdf.class, uue.a);
        m34Var.a(fef.class, eve.a);
        m34Var.a(tdf.class, bve.a);
        m34Var.a(sdf.class, yue.a);
        m34Var.a(sef.class, exe.a);
        m34Var.a(uef.class, jxe.a);
        m34Var.a(xef.class, qxe.a);
        m34Var.a(vef.class, lxe.a);
        m34Var.a(abf.class, ine.a);
        m34Var.a(yef.class, wxe.a);
        m34Var.a(aff.class, yxe.a);
        m34Var.a(bff.class, cye.a);
        m34Var.a(dff.class, hye.a);
        m34Var.a(jff.class, tye.a);
        m34Var.a(hff.class, xye.a);
        m34Var.a(ref.class, dwe.a);
        m34Var.a(z8f.class, dke.a);
        m34Var.a(oef.class, nwe.a);
        m34Var.a(mef.class, hwe.a);
        m34Var.a(pef.class, axe.a);
        m34Var.a(ogf.class, j0f.a);
        m34Var.a(aif.class, r3f.a);
        m34Var.a(e5f.class, cbe.a);
        m34Var.a(z4f.class, dae.a);
        m34Var.a(k4f.class, v9e.a);
        m34Var.a(c5f.class, iae.a);
        m34Var.a(k5f.class, pbe.a);
        m34Var.a(g5f.class, jbe.a);
        m34Var.a(m5f.class, vbe.a);
        m34Var.a(p5f.class, bce.a);
        m34Var.a(r5f.class, gce.a);
        m34Var.a(t5f.class, nce.a);
        m34Var.a(v5f.class, rce.a);
        m34Var.a(nyd.class, o8e.a);
        m34Var.a(azd.class, a9e.a);
        m34Var.a(tyd.class, v8e.a);
        m34Var.a(v8f.class, tje.a);
        m34Var.a(n6f.class, gee.a);
        m34Var.a(cpd.class, jzd.a);
        m34Var.a(wod.class, ozd.a);
        m34Var.a(u7f.class, pge.a);
        m34Var.a(lpd.class, uzd.a);
        m34Var.a(hpd.class, zzd.a);
        m34Var.a(lsd.class, z1e.a);
        m34Var.a(ord.class, c2e.a);
        m34Var.a(wpd.class, d0e.a);
        m34Var.a(qpd.class, i0e.a);
        m34Var.a(ptd.class, d3e.a);
        m34Var.a(mtd.class, s3e.a);
        m34Var.a(mud.class, o4e.a);
        m34Var.a(fud.class, t4e.a);
        m34Var.a(hyd.class, c8e.a);
        m34Var.a(pxd.class, i8e.a);
        m34Var.a(yud.class, z4e.a);
        m34Var.a(sud.class, f5e.a);
        m34Var.a(jvd.class, k5e.a);
        m34Var.a(cvd.class, r6e.a);
        m34Var.a(lif.class, x0f.a);
        m34Var.a(cif.class, lee.a);
        m34Var.a(hif.class, cne.a);
        m34Var.a(gif.class, vme.a);
        m34Var.a(eif.class, yhe.a);
        m34Var.a(kif.class, v0f.a);
        m34Var.a(iif.class, t0f.a);
        m34Var.a(mif.class, i1f.a);
        m34Var.a(fif.class, kje.a);
        m34Var.a(sif.class, y3f.a);
        m34Var.a(qif.class, c4f.a);
        m34Var.a(oif.class, u3f.a);
        m34Var.a(rgf.class, n1f.a);
        m34Var.a(t8f.class, pje.a);
        m34Var.a(b9f.class, ike.a);
        m34Var.a(j4f.class, p9e.a);
        m34Var.a(h8f.class, lie.a);
        m34Var.a(x8f.class, xje.a);
        m34Var.a(w7f.class, hhe.a);
        m34Var.a(s6f.class, yee.a);
        m34Var.a(u6f.class, efe.a);
        m34Var.a(p6f.class, tee.a);
        m34Var.a(x6f.class, kfe.a);
        m34Var.a(xaf.class, sme.a);
        m34Var.a(vaf.class, dme.a);
        m34Var.a(qod.class, fzd.a);
        m34Var.a(vhf.class, g3f.a);
        m34Var.a(yhf.class, m3f.a);
        m34Var.a(whf.class, j3f.a);
        m34Var.a(g4f.class, f9e.a);
        m34Var.a(d6f.class, gde.a);
        m34Var.a(a6f.class, ade.a);
        m34Var.a(y5f.class, vce.a);
        m34Var.a(xcf.class, lse.a);
        m34Var.a(adf.class, vse.a);
        m34Var.a(zcf.class, rse.a);
        m34Var.a(jrd.class, o1e.a);
        m34Var.a(drd.class, v1e.a);
        m34Var.a(fdf.class, jte.a);
        m34Var.a(jdf.class, zte.a);
        m34Var.a(gdf.class, pte.a);
        m34Var.a(idf.class, vte.a);
        m34Var.a(vsd.class, h2e.a);
        m34Var.a(rsd.class, n2e.a);
        m34Var.a(xgf.class, f2f.a);
        m34Var.a(wgf.class, c2f.a);
        m34Var.a(shf.class, z2f.a);
        m34Var.a(thf.class, d3f.a);
        m34Var.a(gef.class, lve.a);
        m34Var.a(lef.class, zve.a);
        m34Var.a(ief.class, pve.a);
        m34Var.a(jef.class, tve.a);
        m34Var.a(l8f.class, yie.a);
        m34Var.a(ytd.class, z3e.a);
        m34Var.a(ttd.class, f4e.a);
        m34Var.a(j8f.class, sie.a);
        m34Var.a(a8f.class, cie.a);
        m34Var.a(ldf.class, eue.a);
        m34Var.a(pdf.class, pue.a);
        m34Var.a(ndf.class, lue.a);
        m34Var.a(itd.class, q2e.a);
        m34Var.a(dtd.class, x2e.a);
        m34Var.a(icf.class, fqe.a);
        m34Var.a(kcf.class, jqe.a);
        m34Var.a(lcf.class, nqe.a);
        m34Var.a(nqd.class, w0e.a);
        m34Var.a(v9.class, b1e.a);
        m34Var.a(tbf.class, qpe.a);
        m34Var.a(ubf.class, vpe.a);
        m34Var.a(hcf.class, bqe.a);
        m34Var.a(eqd.class, m0e.a);
        m34Var.a(zpd.class, r0e.a);
        m34Var.a(ncf.class, sqe.a);
        m34Var.a(ocf.class, uqe.a);
        m34Var.a(qcf.class, yqe.a);
        m34Var.a(rcf.class, bre.a);
        m34Var.a(yqd.class, f1e.a);
        m34Var.a(sqd.class, k1e.a);
        m34Var.a(tgf.class, t1f.a);
        m34Var.a(sgf.class, v1f.a);
        m34Var.a(d9f.class, nke.a);
        m34Var.a(i9f.class, xke.a);
        m34Var.a(f9f.class, ske.a);
        m34Var.a(k9f.class, ble.a);
        m34Var.a(kff.class, bze.a);
        m34Var.a(mff.class, gze.a);
        m34Var.a(tl2.class, h7e.a);
        m34Var.a(awd.class, l7e.a);
        m34Var.a(ygf.class, i2f.a);
        m34Var.a(eff.class, kye.a);
        m34Var.a(gff.class, oye.a);
        m34Var.a(uvd.class, w6e.a);
        m34Var.a(nvd.class, a7e.a);
        m34Var.a(ugf.class, y1f.a);
        m34Var.a(rbf.class, aoe.a);
        m34Var.a(qbf.class, lpe.a);
        m34Var.a(lbf.class, zoe.a);
        m34Var.a(kbf.class, toe.a);
        m34Var.a(nbf.class, cpe.a);
        m34Var.a(obf.class, hpe.a);
        m34Var.a(jbf.class, poe.a);
        m34Var.a(ebf.class, vne.a);
        m34Var.a(hbf.class, loe.a);
        m34Var.a(gbf.class, goe.a);
        m34Var.a(ucf.class, dse.a);
        m34Var.a(g7f.class, ege.a);
        m34Var.a(tcf.class, vre.a);
        m34Var.a(wcf.class, gse.a);
        m34Var.a(d7f.class, age.a);
        m34Var.a(j7f.class, jge.a);
        m34Var.a(qgf.class, k1f.a);
        m34Var.a(off.class, kze.a);
        m34Var.a(ehf.class, t2f.a);
        m34Var.a(cgf.class, tze.a);
        m34Var.a(zff.class, oze.a);
        m34Var.a(bhf.class, m2f.a);
        m34Var.a(ixd.class, p7e.a);
        m34Var.a(ywd.class, w7e.a);
        m34Var.a(chf.class, p2f.a);
        m34Var.a(b7f.class, qfe.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(6:30|31|32|33|(1:35)|28)|24|25|26))|43|6|7|(0)(0)|24|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r7 != r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        android.util.Log.w("FirebaseSessions", "Error getting Firebase installation id .", r7);
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(ri4 ri4Var, ax2 ax2Var) {
        nq5 nq5Var;
        int i;
        ri4 ri4Var2;
        ?? r8;
        if (ax2Var instanceof nq5) {
            nq5Var = (nq5) ax2Var;
            int i2 = nq5Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                nq5Var.d = i2 - TLObject.FLAG_31;
                Object obj = nq5Var.b;
                i = nq5Var.d;
                String str = "";
                vx2 vx2Var = vx2.a;
                if (i != 0) {
                    ixe.b(obj);
                    qi4 qi4Var = (qi4) ri4Var;
                    Task f2 = qi4Var.f();
                    try {
                        f2.getClass();
                        nq5Var.a = qi4Var;
                        nq5Var.d = 1;
                        Object a = xze.a(f2, nq5Var);
                        if (a != vx2Var) {
                            ri4Var = qi4Var;
                            obj = a;
                        }
                    } catch (Exception e2) {
                        ri4Var = qi4Var;
                        e = e2;
                        Log.w("FirebaseSessions", "Error getting authentication token.", e);
                        ri4Var2 = ri4Var;
                        r8 = "";
                        Task e3 = ((qi4) ri4Var2).e();
                        e3.getClass();
                        nq5Var.a = r8;
                        nq5Var.d = 2;
                        obj = xze.a(e3, nq5Var);
                        ri4Var = r8;
                    }
                    return vx2Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r82 = (String) nq5Var.a;
                    ixe.b(obj);
                    ri4Var = r82;
                    String str2 = (String) obj;
                    ?? r83 = ri4Var;
                    if (str2 != null) {
                        str = str2;
                        r83 = ri4Var;
                    }
                    return new oq5(str, r83);
                }
                ri4 ri4Var3 = (ri4) nq5Var.a;
                ixe.b(obj);
                ri4Var = ri4Var3;
                String str3 = ((z90) obj).a;
                str3.getClass();
                ri4 ri4Var4 = ri4Var;
                r8 = str3;
                ri4Var2 = ri4Var4;
                Task e32 = ((qi4) ri4Var2).e();
                e32.getClass();
                nq5Var.a = r8;
                nq5Var.d = 2;
                obj = xze.a(e32, nq5Var);
                ri4Var = r8;
            }
        }
        nq5Var = new nq5(this, ax2Var);
        Object obj2 = nq5Var.b;
        i = nq5Var.d;
        String str4 = "";
        vx2 vx2Var2 = vx2.a;
        if (i != 0) {
        }
        String str32 = ((z90) obj2).a;
        str32.getClass();
        ri4 ri4Var42 = ri4Var;
        r8 = str32;
        ri4Var2 = ri4Var42;
        Task e322 = ((qi4) ri4Var2).e();
        e322.getClass();
        nq5Var.a = r8;
        nq5Var.d = 2;
        obj2 = xze.a(e322, nq5Var);
        ri4Var = r8;
    }

    @Override // l12
    public final boolean E0() {
        byte b2 = this.a;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0084 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(List list, r73 r73Var, ax2 ax2Var) {
        w63 w63Var;
        int i;
        List list2;
        Iterator it;
        p89 p89Var;
        Throwable th;
        if (ax2Var instanceof w63) {
            w63Var = (w63) ax2Var;
            int i2 = w63Var.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                w63Var.e = i2 - TLObject.FLAG_31;
                Object obj = w63Var.c;
                i = w63Var.e;
                Object obj2 = vx2.a;
                if (i != 0) {
                    ixe.b(obj);
                    ArrayList arrayList = new ArrayList();
                    y63 y63Var = new y63(list, arrayList, null);
                    w63Var.a = arrayList;
                    w63Var.e = 1;
                    if (r73Var.a(y63Var, w63Var) != obj2) {
                        list2 = arrayList;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = w63Var.b;
                    p89Var = (p89) w63Var.a;
                    try {
                        ixe.b(obj);
                    } catch (Throwable th2) {
                        Object obj3 = p89Var.a;
                        if (obj3 == null) {
                            p89Var.a = th2;
                        } else {
                            kke.a((Throwable) obj3, th2);
                        }
                    }
                    while (it.hasNext()) {
                        ur4 ur4Var = (ur4) it.next();
                        w63Var.a = p89Var;
                        w63Var.b = it;
                        w63Var.e = 2;
                        if (ur4Var.invoke(w63Var) == obj2) {
                            return obj2;
                        }
                    }
                    th = (Throwable) p89Var.a;
                    if (th == null) {
                        return f9c.a;
                    }
                    throw th;
                }
                list2 = (List) w63Var.a;
                ixe.b(obj);
                p89 p89Var2 = new p89();
                it = list2.iterator();
                p89Var = p89Var2;
                while (it.hasNext()) {
                }
                th = (Throwable) p89Var.a;
                if (th == null) {
                }
            }
        }
        w63Var = new w63(this, ax2Var);
        Object obj4 = w63Var.c;
        i = w63Var.e;
        Object obj22 = vx2.a;
        if (i != 0) {
        }
        p89 p89Var22 = new p89();
        it = list2.iterator();
        p89Var = p89Var22;
        while (it.hasNext()) {
        }
        th = (Throwable) p89Var.a;
        if (th == null) {
        }
    }

    @Override // l12
    public final void O0(vq0 vq0Var) {
        byte b2 = this.a;
        vq0Var.run();
    }

    @Override // l12
    public final void R() {
        byte b2 = this.a;
    }

    @Override // l12
    public final void V() {
        byte b2 = this.a;
    }

    @Override // d64
    public final Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 3:
                return new hz5((tae) am2Var.a(tae.class), (q54) am2Var.a(q54.class));
            default:
                return new l8d();
        }
    }

    @Override // e30
    public final void c(String str) {
        if (f11.a) {
            cc4.b("AudioRecorderV2 ".concat(str));
        }
    }

    @Override // d64
    public final c64 d() {
        throw new IllegalStateException();
    }

    @Override // s8a
    public final Object e() {
        return e;
    }

    @Override // l12
    public final void e0(Object obj) {
        byte b2 = this.a;
    }

    @Override // l12
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        byte b2 = this.a;
    }

    @Override // d64
    public final or4 g(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // uw8
    public final Object get() {
        return srb.a;
    }

    @Override // d64
    public final byte[] h() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // d64
    public final void i(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // l12
    public final void i0(TLRPC.User user) {
        byte b2 = this.a;
    }

    @Override // peb
    public final boolean j(ko4 ko4Var) {
        return false;
    }

    @Override // d64
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // s8a
    public final void n(Object obj, o8c o8cVar) {
        byte[] bytes = qw5.d.b(l9a.Companion.serializer(), (l9a) obj).getBytes(kk1.a);
        bytes.getClass();
        o8cVar.a.write(bytes);
    }

    @Override // l12
    public final boolean o() {
        byte b2 = this.a;
        return false;
    }

    @Override // s8a
    public final Object q(FileInputStream fileInputStream) {
        try {
            qw5 qw5Var = qw5.d;
            String str = new String(sud.b(fileInputStream), kk1.a);
            sjf sjfVar = qw5Var.b;
            return (l9a) qw5Var.a(l9a.Companion.serializer(), str);
        } catch (Exception e2) {
            throw new zx2("Cannot parse session configs", e2);
        }
    }

    @Override // d64
    public final void r(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // peb
    public final reb s(ko4 ko4Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // e30
    public final void t(String str, Throwable th) {
        cc4.e("AudioRecorderV2 ".concat(str), th);
    }

    @Override // d64
    public final b64 u(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // d64
    public final int v() {
        return 1;
    }

    @Override // peb
    public final int y(ko4 ko4Var) {
        return 1;
    }

    @Override // d64
    public final boolean z(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        byte b2 = this.a;
    }

    @Override // bde
    public final lfe zzb(Class cls) {
        if (!s6e.class.isAssignableFrom(cls)) {
            lq5.j("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (lfe) s6e.h(cls.asSubclass(s6e.class)).d(3);
        } catch (Exception e2) {
            grb.j("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // bde
    public final boolean zzc(Class cls) {
        return s6e.class.isAssignableFrom(cls);
    }

    private final void H() {
    }

    private final void J() {
    }

    private final void M() {
    }

    private final void N() {
    }

    @Override // mu8
    public final void I() {
    }

    @Override // dgc
    public final void onFirstFrameRendered() {
    }

    @Override // dgc
    public final void p() {
    }

    @Override // d64
    public final void release() {
    }

    @Override // dgc
    public final void w() {
    }

    private final void E(TLRPC.User user) {
    }

    private final void F(TLRPC.User user) {
    }

    private final void K(Object obj) {
    }

    private final void L(Object obj) {
    }

    @Override // dgc
    public final void a(ggc ggcVar) {
    }

    @Override // d64
    public final void k(byte[] bArr) {
    }

    @Override // d64
    public final void m(wz4 wz4Var) {
    }

    @Override // mu8
    public final void f(int i, Serializable serializable) {
    }

    @Override // d64
    public final void x(byte[] bArr, ig8 ig8Var) {
    }

    private final void P(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    private final void Q(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    private final void C(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }

    private final void D(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
