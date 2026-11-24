// default package

import android.content.Context;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vo3 {
    public static final int[] F = {1000, 2000, 5000, 10000};
    public static final String[][] G = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public final to3 A;
    public long B;
    public final to3 C;
    public long D;
    public long E;
    public final Context a;
    public final long b;
    public final uo3 c;
    public final boolean d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final bp3 f;
    public boolean g;
    public boolean h;
    public int i;
    public ArrayList j;
    public ln3 k;
    public in3 l;
    public boolean m;
    public jn3 n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public ln3 w;
    public String x;
    public int y;
    public int z;

    public vo3(Context context, int i, long j, boolean z, uo3 uo3Var) {
        bp3 bp3Var = new bp3();
        this.f = bp3Var;
        this.j = new ArrayList();
        this.o = "";
        this.A = new to3(this, (byte) 0);
        this.C = new to3(this, (byte) 1);
        this.a = context.getApplicationContext();
        this.b = j;
        this.d = z;
        this.c = uo3Var;
        bp3Var.g = new wa3((byte) 16);
    }

    public final String a() {
        String[] strArr = DictationLid.d;
        in3 in3Var = this.l;
        gn3[] gn3VarArr = DictationAsr.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = (ArrayList) in3Var.d;
        if (arrayList != null) {
            linkedHashSet.addAll(arrayList);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!linkedHashSet.contains(str) && DictationAsr.K(str, in3Var, false, true) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        return TextUtils.join(",", linkedHashSet);
    }

    public final void b(Runnable runnable, long j) {
        this.E += j;
        this.e.postAtTime(new rd3(this, runnable, (byte) 24), SystemClock.uptimeMillis() + this.E);
    }

    public final void c() {
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        jn3 jn3Var = this.n;
        if (jn3Var != null) {
            jn3Var.l = true;
        }
        ln3 ln3Var = this.k;
        if (ln3Var != null) {
            ln3Var.d();
            this.k = null;
        }
    }

    public final void d(String str) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        jn3 jn3Var = this.n;
        if (jn3Var != null) {
            jn3Var.l = true;
        }
        ln3 ln3Var = this.k;
        if (ln3Var != null) {
            ln3Var.d();
            this.k = null;
        }
        String m = this.m ? this.o : this.f.m();
        StringBuilder p = wi8.p("finish error=", str, " sessions=");
        p.append(this.i);
        p.append(" chars=");
        p.append(m.length());
        Log.d("Dictation", p.toString());
        this.c.a(m, str);
    }

    public final void e() {
        jn3 jn3Var = this.n;
        if (jn3Var != null) {
            jn3Var.o = new mo3(this, (byte) 2);
            jn3Var.k = true;
        } else {
            ln3 ln3Var = this.k;
            if (ln3Var != null) {
                ln3Var.d();
            }
        }
    }

    public final void f(int i, String str) {
        boolean z;
        if (this.h) {
            return;
        }
        bp3 bp3Var = this.f;
        boolean g = bp3Var.g(i);
        StringBuilder l = hg9.l(i, "session ", " final ");
        l.append(bp3.b(str));
        ts2.w(l, g ? "" : " (stale)", "Dictation");
        if (g) {
            if (bp3Var.g(i)) {
                String m = bp3Var.m();
                String trim = str.trim();
                if (!trim.isEmpty()) {
                    ArrayList n = bp3.n(trim);
                    ArrayList n2 = bp3.n(bp3Var.b);
                    if (n2.isEmpty() || !bp3.l(n, n2, Math.min(3, n2.size()))) {
                        bp3Var.a(trim, bp3Var.d);
                    } else {
                        bp3Var.b = "";
                        bp3Var.c = trim;
                    }
                }
                bp3Var.c("final");
                z = !m.equals(bp3Var.m());
            } else {
                StringBuilder l2 = hg9.l(i, "session ", " STALE final ignored (current ");
                l2.append(bp3Var.e);
                l2.append(", open ");
                l2.append(bp3Var.f);
                l2.append("): ");
                l2.append(bp3.b(str));
                bp3Var.i(l2.toString());
                z = false;
            }
            if (z) {
                this.c.e(bp3Var.m());
            }
            if (this.g) {
                d(null);
            }
        }
    }

    public final void g(int i, String str) {
        if (this.h) {
            return;
        }
        bp3 bp3Var = this.f;
        boolean z = false;
        if (bp3Var.g(i)) {
            String m = bp3Var.m();
            String trim = str.trim();
            if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                z = true;
            }
            bp3Var.a(trim, z);
            z = !m.equals(bp3Var.m());
        } else {
            StringBuilder l = hg9.l(i, "session ", " STALE partial ignored (current ");
            l.append(bp3Var.e);
            l.append(", open ");
            l.append(bp3Var.f);
            l.append("): ");
            l.append(bp3.b(str));
            bp3Var.i(l.toString());
        }
        if (!z || this.g) {
            return;
        }
        this.c.e(bp3Var.m());
    }

    public final void h() {
        int state;
        AudioRecord audioRecord;
        if (this.d || this.k != null || this.h) {
            return;
        }
        ln3 ln3Var = this.w;
        if (ln3Var != null) {
            this.k = ln3Var;
            ln3Var.g = new qo3(this, (byte) 0);
            this.l = DictationAsr.V(bo3.c(this.a, this.b));
            return;
        }
        in3 V = DictationAsr.V(bo3.c(this.a, this.b));
        this.l = V;
        if (V != null) {
            ln3 ln3Var2 = new ln3();
            this.k = ln3Var2;
            qo3 qo3Var = new qo3(this, (byte) 1);
            try {
                AudioRecord audioRecord2 = new AudioRecord(6, od1.AUDIO_CONTENT_SAMPLING_RATE, 16, 2, Math.max(AudioRecord.getMinBufferSize(od1.AUDIO_CONTENT_SAMPLING_RATE, 16, 2), 12800));
                ln3Var2.e = audioRecord2;
                state = audioRecord2.getState();
                audioRecord = ln3Var2.e;
            } catch (Exception e) {
                Log.e("Dictation", "audio capture", e);
                AudioRecord audioRecord3 = ln3Var2.e;
                if (audioRecord3 != null) {
                    audioRecord3.release();
                }
                ln3Var2.e = null;
            }
            if (state != 1) {
                audioRecord.release();
                ln3Var2.e = null;
                Log.d("Dictation", "own audio capture unavailable");
                this.k = null;
                return;
            }
            audioRecord.startRecording();
            Thread thread = new Thread(new rd3(ln3Var2, qo3Var, (byte) 18), "DictationAudio");
            ln3Var2.f = thread;
            thread.start();
        }
    }

    public final void i(final in3 in3Var) {
        final int i = this.p + 1;
        this.p = i;
        this.l = in3Var;
        DictationAsr.i0((gn3) in3Var.b, false, new hn3() { // from class: oo3
            @Override // hn3
            public final void a(boolean z) {
                vo3 vo3Var = vo3.this;
                int i2 = i;
                in3 in3Var2 = in3Var;
                if (vo3Var.h || i2 != vo3Var.p) {
                    return;
                }
                if (!z) {
                    vo3Var.d("speech model download failed");
                    return;
                }
                jn3 jn3Var = vo3Var.n;
                if (jn3Var != null) {
                    jn3Var.l = true;
                }
                jn3 jn3Var2 = new jn3(vo3Var.k, in3Var2, new yg(vo3Var, i2, in3Var2, (byte) 4));
                vo3Var.n = jn3Var2;
                new Thread(new bi3(jn3Var2, (byte) 14), "DictationAsr").start();
                if (vo3Var.g) {
                    vo3Var.e();
                }
            }
        });
    }

    public final void j(String str) {
        gn3 L;
        if (this.h || !this.m || this.k == null || (L = DictationAsr.L(str)) == null) {
            return;
        }
        this.q = false;
        this.e.removeCallbacks(this.A);
        k(str);
        i(new in3((Object) L, (Object) str, (Object) this.j, (byte) 0));
    }

    public final void k(String str) {
        if (str != null) {
            String str2 = this.x;
            HashMap hashMap = bo3.a;
            if (str2 == null ? false : Locale.forLanguageTag(str.replace('_', '-')).getLanguage().equals(Locale.forLanguageTag(str2.replace('_', '-')).getLanguage())) {
                return;
            }
            this.x = str;
            this.c.g(str);
        }
    }

    public final void l() {
        String str;
        byte b;
        String[] strArr;
        long j;
        StringBuilder sb = new StringBuilder("start ");
        boolean z = this.d;
        sb.append(z ? "SIMULATED" : "real");
        sb.append(" sdk=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(" locale=");
        sb.append(Locale.getDefault());
        char c = ' ';
        if (this.k != null) {
            str = " (captured " + (this.k.c() / 32) + " ms already)";
        } else {
            str = "";
        }
        ts2.w(sb, str, "Dictation");
        final byte b2 = 0;
        Handler handler = this.e;
        final byte b3 = 1;
        if (!z) {
            if (this.k == null) {
                h();
            }
            long j2 = this.b;
            Context context = this.a;
            this.j = bo3.c(context, j2);
            if (this.l == null) {
                d("speech recognition unavailable");
                return;
            }
            if (this.k == null) {
                d("microphone error");
                return;
            }
            this.m = true;
            boolean x = DictationAsr.x();
            this.q = x;
            if (x) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.x()) {
                    DictationLid.a(context);
                }
                String string = oc7.d1().getString("tinylid_lang", null);
                in3 X = string != null ? DictationAsr.X(string, this.l, false) : null;
                if (X != null) {
                    this.l = X;
                }
                handler.postDelayed(this.A, 700L);
            } else {
                k(this.l.t());
            }
            StringBuilder sb2 = new StringBuilder("tinyasr route: ");
            sb2.append(this.l);
            sb2.append(" (candidates ");
            sb2.append(this.j);
            sb2.append(", last sure ");
            ExecutorService executorService2 = DictationLid.a;
            sb2.append(oc7.d1().getString("tinylid_lang", null));
            sb2.append(")");
            Log.d("Dictation", sb2.toString());
            i(this.l);
            return;
        }
        this.D = SystemClock.elapsedRealtime();
        long j3 = 0;
        this.E = 0L;
        handler.post(this.C);
        b(new jd((byte) 10), 500L);
        int i = 0;
        while (i < 5) {
            final int i2 = i + 1;
            String[] strArr2 = G[i];
            String str2 = strArr2[b2];
            final String str3 = strArr2[b3];
            b(new Runnable(this) { // from class: ro3
                public final /* synthetic */ vo3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b4 = b2;
                    boolean z2 = true;
                    int i3 = i2;
                    vo3 vo3Var = this.b;
                    switch (b4) {
                        case 0:
                            vo3Var.i = i3;
                            bp3 bp3Var = vo3Var.f;
                            if (bp3Var.f) {
                                bp3Var.c("superseded");
                            }
                            bp3Var.e = i3;
                            bp3Var.f = true;
                            bp3Var.b = "";
                            bp3Var.c = "";
                            bp3Var.d = false;
                            bp3Var.i("session " + i3 + " begin");
                            Log.d("Dictation", "session " + i3 + " start (simulated)");
                            break;
                        default:
                            bp3 bp3Var2 = vo3Var.f;
                            if (!vo3Var.h) {
                                if (!bp3Var2.g(i3) && i3 != vo3Var.i) {
                                    z2 = false;
                                }
                                ts2.w(hg9.l(i3, "session ", " no match"), z2 ? "" : " (stale, ignored)", "Dictation");
                                if (z2) {
                                    bp3Var2.f(i3, "no match");
                                    vo3Var.c.e(bp3Var2.m());
                                    if (vo3Var.g) {
                                        vo3Var.d(null);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, i == 0 ? j3 : 140L);
            final byte b4 = 3;
            if (i == 2) {
                b(new mo3(this, (byte) 3), 60L);
            }
            if (str2.equals("~")) {
                b(new Runnable(this) { // from class: ro3
                    public final /* synthetic */ vo3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b3;
                        boolean z2 = true;
                        int i3 = i2;
                        vo3 vo3Var = this.b;
                        switch (b42) {
                            case 0:
                                vo3Var.i = i3;
                                bp3 bp3Var = vo3Var.f;
                                if (bp3Var.f) {
                                    bp3Var.c("superseded");
                                }
                                bp3Var.e = i3;
                                bp3Var.f = true;
                                bp3Var.b = "";
                                bp3Var.c = "";
                                bp3Var.d = false;
                                bp3Var.i("session " + i3 + " begin");
                                Log.d("Dictation", "session " + i3 + " start (simulated)");
                                break;
                            default:
                                bp3 bp3Var2 = vo3Var.f;
                                if (!vo3Var.h) {
                                    if (!bp3Var2.g(i3) && i3 != vo3Var.i) {
                                        z2 = false;
                                    }
                                    ts2.w(hg9.l(i3, "session ", " no match"), z2 ? "" : " (stale, ignored)", "Dictation");
                                    if (z2) {
                                        bp3Var2.f(i3, "no match");
                                        vo3Var.c.e(bp3Var2.m());
                                        if (vo3Var.g) {
                                            vo3Var.d(null);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, 5000L);
                b = b3;
            } else {
                String[] split = str2.split(" \\| ");
                int length = split.length;
                int i3 = b2;
                while (i3 < length) {
                    String[] split2 = split[i3].split(" ");
                    StringBuilder sb3 = new StringBuilder();
                    int i4 = b2;
                    while (i4 < split2.length) {
                        if (i4 > 0) {
                            sb3.append(c);
                        }
                        sb3.append(split2[i4]);
                        final String sb4 = sb3.toString();
                        if (i == 3) {
                            strArr = split2;
                            j = split2[i4].equals("now") ? (byte) 300 : split2[i4].equals("text") ? (byte) 800 : split2[i4].equals("word") ? (byte) 1100 : split2[i4].equals("pause") ? (byte) 1500 : b2;
                        } else {
                            strArr = split2;
                            j = 0;
                        }
                        int i5 = i;
                        long length2 = (strArr[i4].length() * 24) + j + 170 + ((long) (Math.random() * 60.0d));
                        if (strArr[i4].equals("feature") || strArr[i4].equals("office")) {
                            final String concat = sb4.substring(0, sb4.length() - strArr[i4].length()).concat(strArr[i4].equals("feature") ? "feet" : "offers");
                            final byte b5 = 1;
                            b(new Runnable(this) { // from class: no3
                                public final /* synthetic */ vo3 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    String str4 = concat;
                                    int i6 = i2;
                                    vo3 vo3Var = this.b;
                                    switch (b6) {
                                        case 0:
                                            vo3Var.f(i6, str4);
                                            break;
                                        case 1:
                                            vo3Var.B = SystemClock.elapsedRealtime() + 400;
                                            vo3Var.g(i6, str4);
                                            break;
                                        case 2:
                                            vo3Var.g(i6, str4);
                                            break;
                                        default:
                                            vo3Var.B = SystemClock.elapsedRealtime() + 400;
                                            vo3Var.g(i6, str4);
                                            break;
                                    }
                                }
                            }, length2);
                            final byte b6 = 2;
                            b(new Runnable(this) { // from class: no3
                                public final /* synthetic */ vo3 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b62 = b6;
                                    String str4 = sb4;
                                    int i6 = i2;
                                    vo3 vo3Var = this.b;
                                    switch (b62) {
                                        case 0:
                                            vo3Var.f(i6, str4);
                                            break;
                                        case 1:
                                            vo3Var.B = SystemClock.elapsedRealtime() + 400;
                                            vo3Var.g(i6, str4);
                                            break;
                                        case 2:
                                            vo3Var.g(i6, str4);
                                            break;
                                        default:
                                            vo3Var.B = SystemClock.elapsedRealtime() + 400;
                                            vo3Var.g(i6, str4);
                                            break;
                                    }
                                }
                            }, 180L);
                        } else {
                            b(new Runnable(this) { // from class: no3
                                public final /* synthetic */ vo3 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b62 = b4;
                                    String str4 = sb4;
                                    int i6 = i2;
                                    vo3 vo3Var = this.b;
                                    switch (b62) {
                                        case 0:
                                            vo3Var.f(i6, str4);
                                            break;
                                        case 1:
                                            vo3Var.B = SystemClock.elapsedRealtime() + 400;
                                            vo3Var.g(i6, str4);
                                            break;
                                        case 2:
                                            vo3Var.g(i6, str4);
                                            break;
                                        default:
                                            vo3Var.B = SystemClock.elapsedRealtime() + 400;
                                            vo3Var.g(i6, str4);
                                            break;
                                    }
                                }
                            }, length2);
                        }
                        i4++;
                        split2 = strArr;
                        i = i5;
                        b2 = 0;
                        c = ' ';
                    }
                    b(new jd((byte) 10), 650L);
                    i3++;
                    i = i;
                    b2 = 0;
                    c = ' ';
                }
                b = 1;
                if (str3.startsWith("!")) {
                    str3 = str3.substring(1);
                }
                final byte b7 = 0;
                b(new Runnable(this) { // from class: no3
                    public final /* synthetic */ vo3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b62 = b7;
                        String str4 = str3;
                        int i6 = i2;
                        vo3 vo3Var = this.b;
                        switch (b62) {
                            case 0:
                                vo3Var.f(i6, str4);
                                break;
                            case 1:
                                vo3Var.B = SystemClock.elapsedRealtime() + 400;
                                vo3Var.g(i6, str4);
                                break;
                            case 2:
                                vo3Var.g(i6, str4);
                                break;
                            default:
                                vo3Var.B = SystemClock.elapsedRealtime() + 400;
                                vo3Var.g(i6, str4);
                                break;
                        }
                    }
                }, 900L);
            }
            i = i2;
            b3 = b;
            b2 = 0;
            c = ' ';
            j3 = 0;
        }
        b(new mo3(this, b3), 1300L);
    }

    public final void m() {
        ln3 ln3Var;
        if (this.h) {
            return;
        }
        this.g = true;
        Log.d("Dictation", "stop requested (session " + this.i + ")");
        if (this.d) {
            Handler handler = this.e;
            handler.removeCallbacksAndMessages(null);
            this.f.f(this.i, "stop");
            this.c.e(this.f.m());
            handler.postDelayed(new mo3(this, (byte) 0), 350L);
            return;
        }
        if (!this.m) {
            d(null);
            return;
        }
        if (!this.q || this.s || this.t || DictationLid.c == 0 || (ln3Var = this.k) == null) {
            e();
            return;
        }
        this.t = true;
        int i = this.p;
        ln3Var.d();
        ln3 ln3Var2 = this.k;
        DictationLid.h(500, new ji((Object) this, i, (byte) 7), a(), ln3Var2.b(0, ln3Var2.c()));
    }
}
