// default package

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class snc implements bo3 {
    public static boolean p0;
    public static final HashMap q0 = new HashMap();
    public volatile char E;
    public volatile byte F;
    public volatile boolean G;
    public String H;
    public final onc I;
    public String[] J;
    public boolean K;
    public knc L;
    public long O;
    public long P;
    public boolean U;
    public co3 V;
    public m7 Y;
    public int Z;
    public final Context a;
    public int a0;
    public final c b;
    public float b0;
    public sm3 d;
    public int d0;
    public ekb e;
    public co3 f;
    public String g0;
    public vnc h;
    public int h0;
    public String i0;
    public boolean j0;
    public boolean k0;
    public final lnc l0;
    public final onc m0;
    public String n0;
    public final lnc o0;
    public long r;
    public long s;
    public volatile long w;
    public volatile long x;
    public volatile int y;
    public byte c = 0;
    public String n = "";
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public float Q = 0.0f;
    public float R = 1.0f;
    public float S = 0.0f;
    public float T = 1.0f;
    public final float[] W = new float[3];
    public final onc X = new onc(this, 1);
    public String c0 = "";
    public final int[] e0 = new int[2];
    public final int[] f0 = new int[2];

    public snc(Context context, c cVar) {
        byte b = 0;
        this.I = new onc(this, b);
        byte b2 = 2;
        this.l0 = new lnc(this, b);
        this.m0 = new onc(this, b2);
        this.o0 = new lnc(this, b2);
        this.a = context;
        this.b = cVar;
    }

    public static ArrayList x(String[] strArr, boolean z, pcc pccVar) {
        pcc pccVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            int i2 = i + 1;
            nm3 N = DictationAsr.N(str);
            String[] d = N != null ? N.d(str) : new String[0];
            if (d.length < 2) {
                arrayList.add(null);
                pccVar2 = pccVar;
            } else {
                String i0 = DictationAsr.i0(N, str);
                ArrayList arrayList2 = new ArrayList();
                int i3 = -1;
                for (int i4 = 0; i4 < d.length; i4++) {
                    arrayList2.add(bn3.R(d[i4]));
                    if (!z && DictationAsr.A(str) && d[i4].equals(i0)) {
                        i3 = i4;
                    }
                }
                pccVar2 = pccVar;
                arrayList.add(new pnc(bn3.S(i0), arrayList2, i3, new zo2((Object) str, (Object) d, (Object) pccVar2, i2, (byte) 8)));
            }
            pccVar = pccVar2;
            i = i2;
        }
        return arrayList;
    }

    @Override // bo3
    public final void a(String str, String str2) {
        if (this.c == 2) {
            if (!str.isEmpty()) {
                this.n = str;
            }
            StringBuilder p = ik8.p("recogniser ended error=", str2, " chars=");
            p.append(this.n.length());
            p.append(" (the voice recording goes on)");
            Log.d("VoiceLive", p.toString());
            this.f = null;
            if (r2f.a == this) {
                r2f.a = null;
            }
            this.d = null;
            this.e = null;
            boolean isEmpty = TextUtils.isEmpty(this.n.trim());
            vnc vncVar = this.h;
            if (isEmpty) {
                if (vncVar != null) {
                    vncVar.m();
                }
            } else if (vncVar != null) {
                vncVar.setText(this.n);
                this.h.setListening(false);
            }
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        ArrayList arrayList2 = this.N;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    public final void c() {
        String e0 = DictationAsr.e0();
        if (e0 != null) {
            String L = bn3.L(e0);
            vnc vncVar = this.h;
            if (vncVar != null) {
                vncVar.setLanguage(L);
            }
            knc kncVar = this.L;
            if (kncVar == null || !this.K) {
                return;
            }
            this.n0 = L;
            kncVar.setLanguage(L);
        }
    }

    @Override // bo3
    public final void e(float f) {
        if (this.c == 2) {
            if (this.K) {
                knc kncVar = this.L;
                if (kncVar != null) {
                    kncVar.setLevel(f);
                    return;
                }
                return;
            }
            vnc vncVar = this.h;
            if (vncVar != null) {
                vncVar.setLevel(f);
            }
        }
    }

    @Override // bo3
    public final void f(String str) {
        h(-1, str);
    }

    public final void g() {
        ArrayList arrayList = this.M;
        ArrayList arrayList2 = this.N;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    @Override // bo3
    public final void h(int i, String str) {
        if (this.c == 2) {
            if (str == null) {
                str = "";
            }
            this.n = str;
            vnc vncVar = this.h;
            if (vncVar != null) {
                vncVar.t(i, str);
            }
        }
    }

    @Override // bo3
    public final void i(String str) {
        String L = str == null ? null : bn3.L(str);
        vnc vncVar = this.h;
        if (vncVar != null && this.c == 2) {
            vncVar.setLanguage(L);
        }
        knc kncVar = this.L;
        if (kncVar != null && this.K && this.c == 2) {
            this.n0 = L;
            kncVar.setLanguage(L);
        }
    }

    public final boolean[] j(ArrayList arrayList, float f, float f2) {
        boolean[] zArr = new boolean[arrayList.size()];
        if (this.c == 4) {
            long j = this.P;
            if (j > 0 && (f > 0.001f || f2 < 0.999f)) {
                float f3 = j;
                long j2 = (long) (f * f3);
                long j3 = (long) (f2 * f3);
                int i = 0;
                long j4 = 0;
                while (i < arrayList.size()) {
                    long j5 = ((rnc) arrayList.get(i)).b;
                    long max = ((((rnc) arrayList.get(i)).c >= 0 ? ((rnc) arrayList.get(i)).c : Math.max(j4, j5 - 900)) + j5) / 2;
                    zArr[i] = max < j2 || max > j3;
                    i++;
                    j4 = j5;
                }
            }
        }
        return zArr;
    }

    public final void k(String str, boolean z) {
        vnc vncVar;
        knc kncVar;
        knc kncVar2;
        byte b = this.c;
        if (b == 0 && this.h == null && this.L == null) {
            return;
        }
        boolean z2 = this.K && b == 4 && this.b.c() && ("chat paused".equals(str) || "destroy".equals(str));
        if (this.K && this.c != 0 && !z2) {
            q0.remove(s());
        }
        if (this.c != 0) {
            StringBuilder p = ik8.p("dispose (", str, ") state=");
            byte b2 = this.c;
            p.append(b2 == 2 ? "live" : b2 == 3 ? "review" : b2 == 4 ? "paused" : "buffering");
            p.append(" chars=");
            p.append(this.n.length());
            p.append(" chunks=");
            p.append(this.y);
            Log.d("VoiceLive", p.toString());
        }
        this.c = (byte) 0;
        this.H = null;
        hl.r(this.X);
        co3 co3Var = this.V;
        if (co3Var != null) {
            co3Var.c();
            this.V = null;
        }
        l(true);
        if (z2) {
            if (this.V == null) {
                g();
            }
            qnc qncVar = new qnc();
            ArrayList arrayList = qncVar.a;
            ArrayList arrayList2 = this.M;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                rnc rncVar = (rnc) obj;
                rnc rncVar2 = new rnc(rncVar.a, rncVar.b);
                rncVar2.c = rncVar.c;
                arrayList.add(rncVar2);
            }
            ArrayList arrayList3 = this.N;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                rnc rncVar3 = (rnc) obj2;
                rnc rncVar4 = new rnc(rncVar3.a, rncVar3.b);
                rncVar4.c = rncVar3.c;
                arrayList.add(rncVar4);
            }
            qncVar.b = this.P;
            qncVar.c = this.Q;
            qncVar.d = this.R;
            qncVar.e = this.g0;
            qncVar.g = this.h0;
            qncVar.f = this.i0;
            qncVar.h = this.j0;
            qncVar.i = this.n0;
            q0.put(s(), qncVar);
            StringBuilder sb = new StringBuilder("field: kept for the chat (");
            sb.append(arrayList.size());
            sb.append(" words");
            sb.append(this.g0 != null ? ", styled / edited" : "");
            sb.append(")");
            Log.d("VoiceLive", sb.toString());
        }
        this.g0 = null;
        this.i0 = null;
        this.k0 = false;
        if (!z || (kncVar2 = this.L) == null || !kncVar2.R) {
            this.b.g(Float.NaN, 0.0f);
        }
        if (z && (kncVar = this.L) != null && kncVar.R) {
            kncVar.R = false;
            kncVar.f0 = -1;
            kncVar.invalidate();
        }
        hl.r(this.I);
        DictationAsr.V(this.o0);
        hl.r(this.m0);
        hl.r(this.l0);
        if (r2f.a == this) {
            r2f.a = null;
        }
        co3 co3Var2 = this.f;
        if (co3Var2 != null) {
            co3Var2.c();
            this.f = null;
        }
        sm3 sm3Var = this.d;
        if (sm3Var != null) {
            sm3Var.d();
            this.d = null;
        }
        this.e = null;
        if (!z || (vncVar = this.h) == null) {
            return;
        }
        vncVar.m();
    }

    public final void l(boolean z) {
        m7 m7Var = this.Y;
        if (m7Var == null) {
            return;
        }
        this.Y = null;
        String obj = m7Var.getText() == null ? this.n : m7Var.getText().toString();
        this.n = obj;
        this.g0 = obj.trim();
        this.h0 = b().size();
        if (z && this.L != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.n);
            this.L.D(arrayList, null, false);
        }
        if (m7Var.hasFocus()) {
            hl.t1(m7Var);
        }
        hl.B2(m7Var);
    }

    public final void m(Object obj) {
        if (obj == null || this.k0 || this.L == null) {
            return;
        }
        if (this.Y != null) {
            l(false);
        }
        String str = this.i0;
        if (str == null) {
            str = this.n.trim();
            this.i0 = str;
            this.j0 = this.g0 != null;
        }
        if (str.isEmpty()) {
            return;
        }
        this.k0 = true;
        this.L.setBusy(true);
        StringBuilder sb = new StringBuilder("field: style ");
        c cVar = this.b;
        cVar.getClass();
        sb.append(obj instanceof cm3 ? ((cm3) obj).a() : null);
        sb.append(" in place on ");
        sb.append(str.length());
        sb.append(" chars");
        Log.d("VoiceLive", sb.toString());
        cVar.f(obj, str, new cz3(this, SystemClock.uptimeMillis(), (byte) 3));
    }

    public final void n(String str) {
        boolean z = this.c == 4;
        k(str, false);
        knc kncVar = this.L;
        if (kncVar == null) {
            return;
        }
        hl.d3(new vlc(this, kncVar, (byte) 2), z ? 470L : 60L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(ByteBuffer byteBuffer, int i, int i2, int i3) {
        sm3 sm3Var = this.d;
        ekb ekbVar = this.e;
        if (sm3Var == null || ekbVar == null) {
            return;
        }
        this.E = i2;
        this.F = i3;
        this.y++;
        this.w += i;
        int c = ekbVar.c(byteBuffer, i, i2);
        if (ekbVar.b <= 0) {
            if (this.G) {
                return;
            }
            this.G = true;
            Log.w("VoiceLive", "recorder rate " + i2 + " Hz isn't a multiple of 16 kHz: no transcript");
            return;
        }
        if (c > 0) {
            this.x += c;
            byte[] bArr = (byte[]) ekbVar.g;
            if (c > 0) {
                synchronized (sm3Var.a) {
                    if (sm3Var.d) {
                        return;
                    }
                    sm3Var.a(c, bArr);
                    int i4 = c / 2;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = i5 << 1;
                        double d = (short) ((bArr[i6] & 255) | (bArr[i6 + 1] << 8));
                        sm3Var.h = (d * d) + sm3Var.h;
                    }
                    int i7 = sm3Var.i + i4;
                    sm3Var.i = i7;
                    if (i7 >= 1600) {
                        double sqrt = Math.sqrt(sm3Var.h / Math.max(1, i7));
                        sm3Var.h = 0.0d;
                        sm3Var.i = 0;
                        xn3 xn3Var = sm3Var.g;
                        if (xn3Var != null) {
                            xn3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
                        }
                    }
                }
            }
        }
    }

    public final void p(co3 co3Var, String str, int i) {
        if (co3Var == this.f || co3Var == this.V) {
            if (!this.K) {
                h(i, str);
                return;
            }
            byte b = this.c;
            if (b == 2 || b == 4) {
                w(co3Var, str);
                q();
            }
        }
    }

    public final void q() {
        String str;
        int i;
        ArrayList b = b();
        m7 m7Var = this.Y;
        int i2 = 0;
        if (m7Var != null) {
            Editable text = m7Var.getText();
            if (text != null) {
                int i3 = this.a0;
                if (i3 < 0 || this.c0.length() + i3 != text.length() || !text.toString().substring(this.a0).equals(this.c0)) {
                    this.Z = Math.min(this.d0, b.size());
                    this.a0 = text.length();
                    this.c0 = "";
                }
                if (this.Z > b.size()) {
                    this.Z = b.size();
                }
                this.d0 = b.size();
                StringBuilder sb = new StringBuilder();
                for (int i4 = this.Z; i4 < b.size(); i4++) {
                    if (sb.length() > 0) {
                        sb.append(' ');
                    }
                    sb.append(((rnc) b.get(i4)).a);
                }
                if (sb.length() == 0 && this.c0.isEmpty()) {
                    return;
                }
                if (sb.length() > 0 && (i = this.a0) > 0 && !Character.isWhitespace(text.charAt(i - 1))) {
                    i2 = 1;
                }
                if (sb.length() != 0) {
                    str = (i2 != 0 ? " " : "") + ((Object) sb);
                }
                if (str.equals(this.c0)) {
                    return;
                }
                text.replace(this.a0, text.length(), str);
                this.c0 = str;
                return;
            }
            return;
        }
        if (this.g0 != null) {
            if (this.h0 > b.size()) {
                this.h0 = b.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.g0);
            StringBuilder sb2 = new StringBuilder(this.g0);
            for (int i5 = this.h0; i5 < b.size(); i5++) {
                arrayList.add(((rnc) b.get(i5)).a);
                sb2.append(' ');
                sb2.append(((rnc) b.get(i5)).a);
            }
            this.n = sb2.toString();
            knc kncVar = this.L;
            if (kncVar != null) {
                kncVar.D(arrayList, null, false);
                return;
            }
            return;
        }
        boolean[] j = j(b, this.Q, this.R);
        boolean[] j2 = this.U ? j(b, this.S, this.T) : null;
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(b.size());
        boolean[] zArr = new boolean[b.size()];
        int i6 = 0;
        while (i2 < b.size()) {
            if (j2 == null || !j2[i2] || !j[i2]) {
                arrayList2.add(((rnc) b.get(i2)).a);
                int i7 = i6 + 1;
                zArr[i6] = j[i2];
                if (!j[i2]) {
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append(((rnc) b.get(i2)).a);
                }
                i6 = i7;
            }
            i2++;
        }
        this.n = sb3.toString();
        knc kncVar2 = this.L;
        if (kncVar2 != null) {
            kncVar2.D(arrayList2, Arrays.copyOf(zArr, i6), this.U);
        }
    }

    public final void r() {
        c cVar = this.b;
        wma wmaVar = cVar.a.b2;
        if (wmaVar == null) {
            return;
        }
        if (this.L == null) {
            this.L = new knc(this.a, cVar.a.K4, new lyc(this, wmaVar));
        }
        View a = cVar.a();
        if (this.L.getParent() != wmaVar) {
            hl.B2(this.L);
            int indexOfChild = (a == null || a.getParent() != wmaVar) ? -1 : wmaVar.indexOfChild(a);
            knc kncVar = this.L;
            if (indexOfChild >= 0) {
                wmaVar.addView(kncVar, indexOfChild, tre.c(-1.0f, -1));
            } else {
                wmaVar.addView(kncVar, tre.c(-1.0f, -1));
            }
        }
        this.L.K();
        this.L.setPaused(false);
        this.L.setListening(true);
        q();
        this.L.F();
        Log.d("VoiceLive", "field shown");
    }

    public final String s() {
        StringBuilder sb = new StringBuilder();
        c cVar = this.b;
        sb.append(cVar.a.R);
        sb.append(":");
        sb.append(cVar.a.F3);
        return sb.toString();
    }

    public final void t() {
        String[] strArr = DictationAsr.E() ? bn3.K0 : null;
        this.J = strArr;
        vnc vncVar = this.h;
        if (vncVar != null) {
            vncVar.setDetected(strArr);
        }
        knc kncVar = this.L;
        if (kncVar != null) {
            kncVar.setDetected(this.J);
        }
        k7b k7bVar = new k7b(this);
        ChatActivityEnterView chatActivityEnterView = this.b.a;
        co3 co3Var = new co3(this.a, chatActivityEnterView.R, chatActivityEnterView.F3, false, k7bVar);
        k7bVar.b = co3Var;
        this.f = co3Var;
        co3Var.w = this.d;
        co3Var.l();
    }

    public final void u() {
        byte b;
        String str;
        String str2;
        long j;
        qnc qncVar;
        long j2;
        byte b2 = this.c;
        if (b2 != 3) {
            String str3 = "VoiceLive";
            if (b2 == 0 && uc7.e1().getBoolean("design_voice_live_field", true) && !this.b.d() && this.b.c() && (qncVar = (qnc) q0.get(s())) != null) {
                onc oncVar = this.m0;
                onc oncVar2 = this.X;
                float[] fArr = this.W;
                this.K = true;
                ArrayList arrayList = this.M;
                arrayList.clear();
                ArrayList arrayList2 = qncVar.a;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    rnc rncVar = (rnc) arrayList2.get(i);
                    rnc rncVar2 = new rnc(rncVar.a, rncVar.b);
                    rncVar2.c = rncVar.c;
                    arrayList.add(rncVar2);
                }
                long j3 = 0;
                this.N.clear();
                this.P = qncVar.b;
                this.g0 = qncVar.e;
                this.h0 = Math.min(qncVar.g, arrayList.size());
                this.i0 = qncVar.f;
                this.j0 = qncVar.h;
                this.n0 = qncVar.i;
                this.c = (byte) 4;
                this.Q = 0.0f;
                this.R = 1.0f;
                this.U = false;
                boolean z = qncVar.c > 0.001f || qncVar.d < 0.999f;
                boolean z2 = this.b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f);
                if (z && !z2 && this.P > 0) {
                    float f = qncVar.c;
                    this.Q = f;
                    float f2 = qncVar.d;
                    this.R = f2;
                    boolean[] j4 = j(arrayList, f, f2);
                    float f3 = this.Q;
                    float f4 = this.P;
                    long j5 = (long) (f3 * f4);
                    long j6 = (long) (this.R * f4);
                    ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        if (j4[i2]) {
                            j2 = j6;
                        } else {
                            rnc rncVar3 = (rnc) arrayList.get(i2);
                            j2 = j6;
                            long j7 = j3;
                            rncVar3.b = Math.max(j7, rncVar3.b - j5);
                            long j8 = rncVar3.c;
                            if (j8 >= j7) {
                                rncVar3.c = Math.max(j7, j8 - j5);
                            }
                            arrayList3.add(rncVar3);
                        }
                        i2++;
                        j6 = j2;
                        j3 = 0;
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayList3);
                    this.P = Math.max(0L, j6 - j5);
                    this.Q = 0.0f;
                    this.R = 1.0f;
                } else if (z2) {
                    this.Q = fArr[0];
                    this.R = fArr[1];
                }
                Log.d("VoiceLive", "field: back with the chat (" + arrayList.size() + " words, " + this.P + " ms)");
                r();
                knc kncVar = this.L;
                if (kncVar != null) {
                    kncVar.setListening(false);
                    this.L.setPaused(true);
                    this.L.setRevertShown(this.i0 != null);
                    knc kncVar2 = this.L;
                    kncVar2.F();
                    kncVar2.W = 1.0f;
                    boolean z3 = kncVar2.T;
                    kncVar2.a0 = z3 ? 1.0f : 0.0f;
                    kncVar2.U0 = z3 ? 1.0f : 0.0f;
                    kncVar2.b0 = 0.0f;
                    kncVar2.F0 = -1.0f;
                    kncVar2.invalidate();
                    this.L.setLanguage(this.n0);
                    c();
                }
                q();
                hl.r(oncVar2);
                hl.d3(oncVar2, 50L);
                hl.r(oncVar);
                hl.d3(oncVar, 250L);
                return;
            }
            byte b3 = this.c;
            c cVar = this.b;
            if (b3 == 4) {
                if (!cVar.d()) {
                    if (this.b.c()) {
                        return;
                    }
                    k("draft gone", true);
                    return;
                }
                hl.r(this.X);
                co3 co3Var = this.V;
                if (co3Var != null) {
                    this.V = null;
                    co3Var.c();
                    g();
                }
                g();
                float f5 = this.Q;
                long j9 = this.P;
                float f6 = j9;
                long j10 = (long) (f5 * f6);
                float f7 = this.R;
                long j11 = (long) (f6 * f7);
                if (j9 <= 0 || (f5 <= 0.001f && f7 >= 0.999f)) {
                    this.O = j9;
                    Log.d("VoiceLive", "field: resumed at " + this.O + " ms");
                } else {
                    boolean[] j12 = j(this.M, f5, f7);
                    ArrayList arrayList4 = new ArrayList();
                    int i3 = 0;
                    while (i3 < this.M.size()) {
                        if (j12[i3]) {
                            j = j10;
                        } else {
                            rnc rncVar4 = (rnc) this.M.get(i3);
                            j = j10;
                            rncVar4.b = Math.max(0L, rncVar4.b - j);
                            long j13 = rncVar4.c;
                            if (j13 >= 0) {
                                rncVar4.c = Math.max(0L, j13 - j);
                            }
                            arrayList4.add(rncVar4);
                        }
                        i3++;
                        j10 = j;
                    }
                    long j14 = j10;
                    this.M.clear();
                    this.M.addAll(arrayList4);
                    this.O = Math.max(0L, j11 - j14);
                    StringBuilder o = ik8.o(j14, "field: resumed after a trim ", "..");
                    o.append(j11);
                    o.append(" ms, ");
                    o.append(this.M.size());
                    o.append(" words kept");
                    Log.d("VoiceLive", o.toString());
                }
                this.Q = 0.0f;
                this.R = 1.0f;
                this.U = false;
                if (this.g0 != null) {
                    this.h0 = this.M.size();
                }
                if (this.Y != null) {
                    int size2 = this.M.size();
                    this.d0 = size2;
                    this.Z = size2;
                    this.a0 = this.Y.length();
                    this.c0 = "";
                }
                this.d = new sm3();
                this.e = new ekb((byte) 1);
                r2f.a = this;
                this.c = (byte) 2;
                t();
                knc kncVar3 = this.L;
                if (kncVar3 != null) {
                    kncVar3.setPaused(false);
                    this.L.setListening(true);
                }
                c();
                DictationAsr.V(this.o0);
                DictationAsr.i(this.o0);
                v();
                q();
                hl.r(this.m0);
                hl.d3(this.m0, 250L);
                return;
            }
            ChatActivityEnterView chatActivityEnterView = cVar.a;
            if (!o2f.a()) {
                if (this.c != 0) {
                    k("unavailable", true);
                    return;
                }
                return;
            }
            if (!this.b.d()) {
                if (this.K && this.c == 2) {
                    c cVar2 = this.b;
                    cVar2.getClass();
                    if ((MediaController.z().J() || cVar2.a.Q3 != null) && this.b.c()) {
                        onc oncVar3 = this.X;
                        this.c = (byte) 4;
                        hl.r(this.l0);
                        this.P = this.O + (this.d != null ? r2.c() / 32 : 0L);
                        if (r2f.a == this) {
                            r2f.a = null;
                        }
                        co3 co3Var2 = this.f;
                        if (co3Var2 != null) {
                            this.V = co3Var2;
                            this.f = null;
                            sm3 sm3Var = this.d;
                            if (sm3Var != null) {
                                sm3Var.d();
                            }
                            this.V.m();
                        } else {
                            g();
                        }
                        this.d = null;
                        this.e = null;
                        this.Q = 0.0f;
                        this.R = 1.0f;
                        this.U = false;
                        Log.d("VoiceLive", "field: paused at " + this.P + " ms, " + (this.N.size() + this.M.size()) + " words");
                        knc kncVar4 = this.L;
                        if (kncVar4 != null) {
                            kncVar4.setListening(false);
                            this.L.setPaused(true);
                        }
                        q();
                        hl.r(oncVar3);
                        hl.d3(oncVar3, 50L);
                        return;
                    }
                }
                if (this.c != 0) {
                    k("not recording", true);
                    return;
                }
                return;
            }
            if (this.c == 0) {
                if (p0) {
                    str = "VoiceLive";
                } else {
                    p0 = true;
                    StringBuilder sb = new StringBuilder("resampler self-test (expect 1000Hz≈0dB, 12000Hz<-50dB): ");
                    StringBuilder sb2 = new StringBuilder();
                    int[] iArr = {1000, 12000};
                    int i4 = 0;
                    while (i4 < 2) {
                        int i5 = iArr[i4];
                        ekb ekbVar = new ekb((byte) 1);
                        ByteBuffer allocate = ByteBuffer.allocate(19200);
                        int i6 = 0;
                        while (i6 < 9600) {
                            int i7 = i4;
                            short sin = (short) (Math.sin(((i5 * 6.283185307179586d) * i6) / 48000.0d) * 16000.0d);
                            int i8 = i6 << 1;
                            allocate.put(i8, (byte) sin);
                            allocate.put(i8 + 1, (byte) (sin >> 8));
                            i6++;
                            str3 = str3;
                            i4 = i7;
                        }
                        int i9 = i4;
                        String str4 = str3;
                        int c = ekbVar.c(allocate, 19200, 48000);
                        byte[] bArr = (byte[]) ekbVar.g;
                        double d = 0.0d;
                        int i10 = 0;
                        for (int i11 = jn7.d3; i11 < c / 2; i11++) {
                            int i12 = i11 << 1;
                            double d2 = (short) ((bArr[i12] & 255) | (bArr[i12 + 1] << 8));
                            d += d2 * d2;
                            i10++;
                        }
                        double log10 = Math.log10(Math.max(1.0E-9d, Math.sqrt(d / Math.max(1, i10)) / 11313.708498984759d)) * 20.0d;
                        sb2.append(i5);
                        sb2.append("Hz=");
                        sb2.append(String.format(Locale.US, "%.1f", Double.valueOf(log10)));
                        sb2.append("dB ");
                        i4 = i9 + 1;
                        str3 = str4;
                    }
                    sb.append(sb2.toString().trim());
                    str = str3;
                    Log.d(str, sb.toString());
                }
                this.d = new sm3();
                this.e = new ekb((byte) 1);
                this.x = 0L;
                this.w = 0L;
                this.y = 0;
                this.E = (char) 0;
                this.F = (byte) 0;
                this.G = false;
                this.n = "";
                this.K = uc7.e1().getBoolean("design_voice_live_field", true);
                this.M.clear();
                this.N.clear();
                this.O = 0L;
                this.Q = 0.0f;
                this.R = 1.0f;
                this.U = false;
                this.r = SystemClock.elapsedRealtime();
                b = 1;
                this.c = (byte) 1;
                r2f.a = this;
                hl.r(this.m0);
                hl.d3(this.m0, 250L);
                Log.d(str, "buffering: recorder tap on");
            } else {
                b = 1;
                str = "VoiceLive";
            }
            if (this.c == b && this.b.a.W0()) {
                this.c = (byte) 2;
                this.n0 = null;
                this.s = SystemClock.elapsedRealtime();
                StringBuilder sb3 = new StringBuilder("locked → live: buffered ");
                sb3.append((this.d.c() * 1000) / 32000);
                sb3.append(" ms, chunks=");
                sb3.append(this.y);
                sb3.append(" rate=");
                sb3.append((int) this.E);
                sb3.append(" source=");
                byte b4 = this.F;
                sb3.append(b4 == 1 ? "MediaController" : b4 == 2 ? "AudioRecorderV2" : "none");
                sb3.append(" (");
                sb3.append(this.s - this.r);
                sb3.append(" ms since start)");
                Log.d(str, sb3.toString());
                t();
                if (this.K) {
                    r();
                } else {
                    c cVar3 = this.b;
                    wma wmaVar = cVar3.a.b2;
                    if (wmaVar != null) {
                        if (this.h == null) {
                            this.h = new vnc(this.a, cVar3.a.K4, this);
                        }
                        View a = cVar3.a();
                        int indexOfChild = (a == null || a.getParent() != wmaVar) ? -1 : wmaVar.indexOfChild(a);
                        if (this.h.getParent() != wmaVar || (indexOfChild >= 0 && wmaVar.indexOfChild(this.h) != indexOfChild - 1)) {
                            hl.B2(this.h);
                            int indexOfChild2 = (a == null || a.getParent() != wmaVar) ? -1 : wmaVar.indexOfChild(a);
                            vnc vncVar = this.h;
                            if (indexOfChild2 >= 0) {
                                wmaVar.addView(vncVar, indexOfChild2, tre.e(-1, -1, 80));
                            } else {
                                wmaVar.addView(vncVar, tre.e(-1, -1, 80));
                                Log.w(str, "composer isn't a direct child of the root: overlay on top");
                            }
                        }
                        vnc vncVar2 = this.h;
                        ChatActivityEnterView chatActivityEnterView2 = cVar3.a;
                        int i13 = aob.Pe;
                        int i14 = ChatActivityEnterView.X7;
                        vncVar2.setAccent(chatActivityEnterView2.J0(i13) | (-16777216));
                        vnc vncVar3 = this.h;
                        TextPaint textPaint = vncVar3.c;
                        int i15 = aob.d6;
                        vnb vnbVar = vncVar3.b;
                        vncVar3.h0 = hl.B(aob.v0(i15, vnbVar)) < 0.5f;
                        int v0 = aob.v0(aob.G6, vnbVar) | (-16777216);
                        vncVar3.i0 = v0;
                        textPaint.setColor(v0);
                        int i16 = vncVar3.i0;
                        vnc.Z1 = i16;
                        boolean z4 = vncVar3.h0;
                        int i17 = vncVar3.j0;
                        vnc.Y1 = z4 ? vm2.f(0.12f, i17, -1) : vm2.f(0.32f, i17, i16);
                        vnc.a2 = hl.L(7.0f);
                        vncVar3.d.setColor(aob.p1(vncVar3.h0 ? 0.42f : 0.36f, vncVar3.i0));
                        vncVar3.k0 = Build.VERSION.SDK_INT >= 31 && xea.o() != 0;
                        vncVar3.r = 0;
                        vncVar3.s.setColor(vncVar3.h0 ? 0 : 335544320);
                        vncVar3.l0 = "";
                        vncVar3.z1 = -1;
                        vncVar3.m0 = null;
                        vncVar3.p0.clear();
                        vncVar3.V0 = true;
                        vncVar3.E0 = 0.0f;
                        vncVar3.D0 = 0.0f;
                        vncVar3.F0 = 0.0f;
                        vncVar3.G0 = 0.0f;
                        vncVar3.I0 = -1.0f;
                        vncVar3.H0 = -1.0f;
                        vncVar3.K0 = -1.0f;
                        vncVar3.M0 = false;
                        vncVar3.setStyleIcon(null);
                        vncVar3.N0 = false;
                        vncVar3.Q0 = false;
                        vncVar3.y1 = null;
                        vncVar3.Q1 = false;
                        vncVar3.A1 = false;
                        vncVar3.E1 = null;
                        vncVar3.F1.clear();
                        textPaint.setShader(null);
                        vncVar3.T0 = 0L;
                        vncVar3.U0 = 0.0f;
                        vncVar3.B0 = true;
                        vncVar3.Y0 = 0.0f;
                        vncVar3.Z0 = 0.0f;
                        vncVar3.a1 = true;
                        vncVar3.b1 = 1.0f;
                        vncVar3.c1 = 0.0f;
                        vncVar3.m1 = -1;
                        Arrays.fill(vncVar3.n1, 0.0f);
                        vncVar3.O = null;
                        vncVar3.P = 0.0f;
                        vncVar3.Q = 0.0f;
                        vncVar3.W = false;
                        vncVar3.R.setEmpty();
                        vncVar3.setPlaceholder(null);
                        vncVar3.q0 = true;
                        vncVar3.s0 = SystemClock.uptimeMillis();
                        vncVar3.u0 = 0L;
                        vncVar3.g0 = 0L;
                        vncVar3.setVisibility(0);
                        vncVar3.invalidate();
                        Log.d(str, "overlay shown at index " + wmaVar.indexOfChild(this.h) + "/" + wmaVar.getChildCount());
                    }
                }
                vnc vncVar4 = this.h;
                if (vncVar4 != null) {
                    vncVar4.setDetected(this.J);
                }
                knc kncVar5 = this.L;
                if (kncVar5 != null) {
                    kncVar5.setDetected(this.J);
                }
                knc kncVar6 = this.L;
                if (kncVar6 != null && this.K && (str2 = this.n0) != null) {
                    kncVar6.setLanguage(str2);
                }
                c();
                DictationAsr.V(this.o0);
                DictationAsr.i(this.o0);
                v();
                hl.d3(this.l0, 1500L);
            }
        }
    }

    public final void v() {
        String a0 = DictationAsr.L(new long[2]) ? ob6.a0(null, null, 2131744980, Long.valueOf(Math.round(r1[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(r1[1] / 1048576.0d)))) : null;
        vnc vncVar = this.h;
        if (vncVar != null) {
            vncVar.setPlaceholder(a0);
        }
        knc kncVar = this.L;
        if (kncVar == null || !this.K) {
            return;
        }
        kncVar.setPlaceholder(a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[LOOP:1: B:23:0x0086->B:25:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(co3 co3Var, String str) {
        int i;
        int min;
        long j;
        long max;
        int length;
        int i2;
        int[] iArr;
        long j2;
        long j3;
        int i3;
        long j4;
        int i4;
        String[] split = str == null ? new String[0] : str.trim().split("\\s+");
        int i5 = 0;
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                i5++;
            }
        }
        qm3 qm3Var = co3Var.n;
        int i6 = qm3Var != null ? qm3Var.m : -1;
        if (i6 < 0) {
            sm3 sm3Var = this.d;
            if (sm3Var == null) {
                i = 0;
                long max2 = Math.max(0L, i - 350) + this.O;
                min = Math.min(this.N.size(), i5);
                int i7 = 1;
                if (min <= 0) {
                    max = ((rnc) this.N.get(min - 1)).b;
                    j = 0;
                } else {
                    boolean isEmpty = this.M.isEmpty();
                    long j5 = this.O;
                    if (isEmpty) {
                        j = 0;
                        max = j5;
                    } else {
                        j = 0;
                        max = Math.max(j5, ((rnc) c00.g(1, this.M)).b);
                    }
                }
                int i8 = i5 - min;
                while (this.N.size() > i5) {
                    qd4.v(1, this.N);
                }
                length = split.length;
                i2 = 0;
                int i9 = 0;
                int i10 = 0;
                while (i2 < length) {
                    String str3 = split[i2];
                    if (str3.isEmpty()) {
                        j4 = max2;
                        j3 = j;
                        i3 = i10;
                        i4 = length;
                    } else {
                        j3 = j;
                        if (i9 < min) {
                            ((rnc) this.N.get(i9)).a = str3;
                            j4 = max2;
                            i3 = i10;
                            i4 = length;
                        } else {
                            i3 = i10 + 1;
                            j4 = max2;
                            i4 = length;
                            this.N.add(new rnc(str3, Math.max(max, (((Math.max(max2, max) - max) * i3) / Math.max(i7, i8)) + max)));
                        }
                        i9++;
                    }
                    i2++;
                    length = i4;
                    max2 = j4;
                    i7 = 1;
                    i10 = i3;
                    j = j3;
                }
                long j6 = j;
                qm3 qm3Var2 = co3Var.n;
                iArr = qm3Var2 == null ? qm3Var2.g : null;
                if (iArr != null || iArr.length < 4 || str == null) {
                    return;
                }
                int length2 = split.length;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i11 < length2) {
                    String str4 = split[i11];
                    if (str4.isEmpty()) {
                        j2 = j6;
                    } else {
                        int indexOf = str.indexOf(str4, i12);
                        if (indexOf < 0) {
                            return;
                        }
                        int length3 = str4.length() + indexOf;
                        long j7 = -1;
                        long j8 = -1;
                        while (true) {
                            int i15 = i14 + 3;
                            if (i15 >= iArr.length || iArr[i14 + 1] > length3) {
                                break;
                            }
                            if (iArr[i14] >= indexOf) {
                                if (j8 < j6) {
                                    j8 = iArr[i14 + 2];
                                }
                                j7 = iArr[i15];
                            }
                            i14 += 4;
                        }
                        if (j7 < j6 || i13 >= this.N.size()) {
                            j2 = j6;
                        } else {
                            rnc rncVar = (rnc) this.N.get(i13);
                            long j9 = this.O;
                            rncVar.b = j7 + j9;
                            j2 = j6;
                            rncVar.c = Math.max(j2, j8) + j9;
                        }
                        i13++;
                        i12 = length3;
                    }
                    i11++;
                    j6 = j2;
                }
                return;
            }
            i6 = sm3Var.c();
        }
        i = i6 / 32;
        long max22 = Math.max(0L, i - 350) + this.O;
        min = Math.min(this.N.size(), i5);
        int i72 = 1;
        if (min <= 0) {
        }
        int i82 = i5 - min;
        while (this.N.size() > i5) {
        }
        length = split.length;
        i2 = 0;
        int i92 = 0;
        int i102 = 0;
        while (i2 < length) {
        }
        long j62 = j;
        qm3 qm3Var22 = co3Var.n;
        if (qm3Var22 == null) {
        }
        if (iArr != null) {
        }
    }

    @Override // bo3
    public final void d(String[] strArr, float[] fArr, int i) {
    }
}
