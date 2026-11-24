// default package

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wx3 {
    public static final Object i = new Object();
    public static volatile wx3 j;
    public final ReentrantReadWriteLock a;
    public final st b;
    public volatile byte c;
    public final Handler d;
    public final sk e;
    public final vx3 f;
    public final boolean g;
    public final xb3 h;

    public wx3(sn4 sn4Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        vx3 vx3Var = sn4Var.a;
        this.f = vx3Var;
        boolean z = sn4Var.b;
        this.g = z;
        this.h = sn4Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new st(0);
        sk skVar = new sk(this);
        this.e = skVar;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                vx3Var.c(new sx3(skVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static wx3 a() {
        wx3 wx3Var;
        synchronized (i) {
            wx3Var = j;
            if (!(wx3Var != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return wx3Var;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.g)) {
            dq9.m("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = (byte) 0;
            this.a.writeLock().unlock();
            sk skVar = this.e;
            wx3 wx3Var = (wx3) skVar.b;
            try {
                wx3Var.f.c(new sx3(skVar));
            } catch (Throwable th) {
                wx3Var.d(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new ux3(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0163, code lost:
    
        if (r0 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0168, code lost:
    
        ((qma) r13).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x016e, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0166, code lost:
    
        if (r0 == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[Catch: all -> 0x016f, TryCatch #0 {all -> 0x016f, blocks: (B:28:0x0054, B:30:0x0075, B:32:0x007f, B:34:0x0082, B:36:0x0086, B:38:0x0096, B:40:0x0099, B:44:0x00a6, B:46:0x00ac, B:51:0x00cb, B:73:0x00d6, B:77:0x00e4, B:78:0x00ee, B:63:0x00ff, B:66:0x0106, B:54:0x010b, B:56:0x0116, B:84:0x011d, B:86:0x0121, B:88:0x0129, B:90:0x012d, B:93:0x0135, B:96:0x0143, B:97:0x0149, B:99:0x0159, B:114:0x0050, B:116:0x005d, B:118:0x0061, B:120:0x006e), top: B:113:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(int i2, int i3, CharSequence charSequence) {
        int i4;
        y5c[] y5cVarArr;
        x7c x7cVar = null;
        if (!(b() == 1)) {
            dq9.m("Not initialized yet");
            return null;
        }
        if (i2 < 0) {
            u36.j("start cannot be negative");
            return null;
        }
        if (i3 < 0) {
            u36.j("end cannot be negative");
            return null;
        }
        if (!(i2 <= i3)) {
            u36.j("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            u36.j("start should be < than charSequence length");
            return null;
        }
        if (!(i3 <= charSequence.length())) {
            u36.j("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() != 0 && i2 != i3) {
            hi2 hi2Var = (hi2) this.e.a;
            hi2Var.getClass();
            boolean z = charSequence instanceof qma;
            if (z) {
                ((qma) charSequence).a();
            } else {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, y5c.class) <= i3) {
                            x7cVar = new x7c(charSequence);
                        }
                        if (x7cVar != null && (y5cVarArr = (y5c[]) x7cVar.b.getSpans(i2, i3, y5c.class)) != null && y5cVarArr.length > 0) {
                            for (y5c y5cVar : y5cVarArr) {
                                int spanStart = x7cVar.b.getSpanStart(y5cVar);
                                int spanEnd = x7cVar.b.getSpanEnd(y5cVar);
                                if (spanStart != i3) {
                                    x7cVar.removeSpan(y5cVar);
                                }
                                i2 = Math.min(spanStart, i2);
                                i3 = Math.max(spanEnd, i3);
                            }
                        }
                        if (i2 == i3 && i2 < charSequence.length()) {
                            dz3 dz3Var = new dz3((tf7) ((e7a) hi2Var.b).c);
                            int codePointAt = Character.codePointAt(charSequence, i2);
                            x7c x7cVar2 = x7cVar;
                            int i5 = 0;
                            loop1: while (true) {
                                i4 = i2;
                                while (i2 < i3 && i5 < Integer.MAX_VALUE) {
                                    int a = dz3Var.a(codePointAt);
                                    if (a == 1) {
                                        i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                                        if (i4 < i3) {
                                            codePointAt = Character.codePointAt(charSequence, i4);
                                        }
                                        i2 = i4;
                                    } else if (a == 2) {
                                        i2 += Character.charCount(codePointAt);
                                        if (i2 < i3) {
                                            codePointAt = Character.codePointAt(charSequence, i2);
                                        }
                                    } else if (a == 3) {
                                        if (!hi2Var.A(charSequence, i4, i2, ((tf7) dz3Var.f).b)) {
                                            if (x7cVar2 == null) {
                                                x7cVar2 = new x7c((Spannable) new SpannableString(charSequence));
                                            }
                                            x7cVar2.setSpan(new y5c(((tf7) dz3Var.f).b), i4, i2, 33);
                                            i5++;
                                        }
                                    }
                                }
                            }
                            if (dz3Var.a == 2 && ((tf7) dz3Var.e).b != null && ((dz3Var.c > 1 || dz3Var.d()) && i5 < Integer.MAX_VALUE && !hi2Var.A(charSequence, i4, i2, ((tf7) dz3Var.e).b))) {
                                if (x7cVar2 == null) {
                                    x7cVar2 = new x7c(charSequence);
                                }
                                x7cVar2.setSpan(new y5c(((tf7) dz3Var.e).b), i4, i2, 33);
                            }
                            if (x7cVar2 != null) {
                                return x7cVar2.b;
                            }
                        }
                    }
                } finally {
                    if (z) {
                        ((qma) charSequence).b();
                    }
                }
            }
            x7cVar = new x7c((Spannable) charSequence);
            if (x7cVar != null) {
                while (r6 < r5) {
                }
            }
            if (i2 == i3) {
            }
        }
        return charSequence;
    }

    public final void f(tx3 tx3Var) {
        nte.a(tx3Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new ux3(Arrays.asList(tx3Var), this.c, null));
            } else {
                this.b.add(tx3Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
