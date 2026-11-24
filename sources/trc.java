// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class trc implements po6, ts4, rw6 {
    public static final int[] f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public trc(Context context, th8 th8Var, final y70 y70Var, boolean z, int i, ylb ylbVar) {
        int i2;
        final byte b = 1;
        final byte b2 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z ? R.drawable.popup_fixed_alert : 0, 0, ylbVar, context);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.d = y70Var;
        if (th8Var != null) {
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, jb6.M0(2131753721, null), false, ylbVar).setOnClickListener(new w70(th8Var, (byte) 0));
        }
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, jb6.M0(2131753846, null), false, ylbVar).setOnClickListener(new View.OnClickListener(this) { // from class: x70
            public final /* synthetic */ trc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                y70 y70Var2 = y70Var;
                trc trcVar = this.b;
                switch (b3) {
                    case 0:
                        trcVar.o();
                        y70Var2.l(86400, 70);
                        break;
                    case 1:
                        trcVar.o();
                        y70Var2.l(604800, 70);
                        break;
                    case 2:
                        trcVar.o();
                        y70Var2.l(2678400, 70);
                        break;
                    default:
                        trcVar.o();
                        y70Var2.l(0, 71);
                        break;
                }
            }
        });
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, jb6.M0(2131753843, null), false, ylbVar).setOnClickListener(new View.OnClickListener(this) { // from class: x70
            public final /* synthetic */ trc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                y70 y70Var2 = y70Var;
                trc trcVar = this.b;
                switch (b3) {
                    case 0:
                        trcVar.o();
                        y70Var2.l(86400, 70);
                        break;
                    case 1:
                        trcVar.o();
                        y70Var2.l(604800, 70);
                        break;
                    case 2:
                        trcVar.o();
                        y70Var2.l(2678400, 70);
                        break;
                    default:
                        trcVar.o();
                        y70Var2.l(0, 71);
                        break;
                }
            }
        });
        final byte b3 = 2;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, jb6.M0(2131753845, null), false, ylbVar).setOnClickListener(new View.OnClickListener(this) { // from class: x70
            public final /* synthetic */ trc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                y70 y70Var2 = y70Var;
                trc trcVar = this.b;
                switch (b32) {
                    case 0:
                        trcVar.o();
                        y70Var2.l(86400, 70);
                        break;
                    case 1:
                        trcVar.o();
                        y70Var2.l(604800, 70);
                        break;
                    case 2:
                        trcVar.o();
                        y70Var2.l(2678400, 70);
                        break;
                    default:
                        trcVar.o();
                        y70Var2.l(0, 71);
                        break;
                }
            }
        });
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i == 1 ? jb6.M0(2131753828, null) : jb6.M0(2131753829, null), false, ylbVar).setOnClickListener(new ef(this, context, i, ylbVar, y70Var));
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, jb6.M0(2131753827, null), false, ylbVar);
        this.c = c;
        final byte b4 = 3;
        c.setOnClickListener(new View.OnClickListener(this) { // from class: x70
            public final /* synthetic */ trc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b4;
                y70 y70Var2 = y70Var;
                trc trcVar = this.b;
                switch (b32) {
                    case 0:
                        trcVar.o();
                        y70Var2.l(86400, 70);
                        break;
                    case 1:
                        trcVar.o();
                        y70Var2.l(604800, 70);
                        break;
                    case 2:
                        trcVar.o();
                        y70Var2.l(2678400, 70);
                        break;
                    default:
                        trcVar.o();
                        y70Var2.l(0, 71);
                        break;
                }
            }
        });
        byte b5 = 8;
        if (i != 1) {
            if (ylbVar != null) {
                int i3 = cmb.p7;
                w00 w00Var = new w00(b5);
                w00 w00Var2 = new w00((byte) 9);
                int P = anb.P(i3, -1, 0, 0.0f, null);
                w00Var2.e(P, c);
                umb w = anb.w(100, c);
                w.c(i3, -1, 0, 0.0f, null);
                w.n = w00Var;
                w.o = w00Var2;
                w.m = false;
                w.g = P;
                i2 = 1;
                if (i == i2) {
                    j8 j8Var = new j8(context, ylbVar);
                    anb.h(cmb.G8, ylbVar, j8Var);
                    j8Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var, qoe.o(-1, 8));
                    l66 l66Var = new l66(context, null);
                    this.e = l66Var;
                    l66Var.setTag(R.id.fit_width_tag, 1);
                    l66Var.setPadding(gm.L(13.0f), 0, gm.L(13.0f), gm.L(8.0f));
                    l66Var.setTextSize(1, 13.0f);
                    anb.X(l66Var, cmb.D8, null);
                    l66Var.setMovementMethod(LinkMovementMethod.getInstance());
                    anb.G(l66Var, cmb.I6, null);
                    l66Var.setText(jb6.M0(2131753813, null));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(l66Var, qoe.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    return;
                }
                return;
            }
            int i4 = cmb.p7;
            c.c(i4, i4);
        }
        i2 = 1;
        if (i == i2) {
        }
    }

    public final void A(float f2, float f3) {
        float f4 = gm.p;
        k(f2, f3, y(0.0f, 6.2831855f), y(0.0f, 28.0f) * f4, y(1.5f, 3.5f) * f4, y(0.35f, 0.6f), 2.0f);
    }

    public final void B(int i) {
        if (System.currentTimeMillis() - this.a < 200) {
            gm.c3(new eh((Object) this, i, (byte) 7));
            return;
        }
        a8 a8Var = (a8) this.c;
        if (i == 0) {
            a8Var.setVisibility(8);
        } else {
            a8Var.setVisibility(0);
        }
    }

    public final void C() {
        long j;
        Uri uri;
        jt6 jt6Var;
        Uri uri2;
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        cf8 cf8Var = tx6Var.t;
        bt6 S0 = cf8Var.S0();
        jt6 U0 = cf8Var.U0();
        long j2 = -9223372036854775807L;
        if ((!cf8Var.m0(16) || !cf8Var.P0()) && cf8Var.m0(16)) {
            j2 = cf8Var.getDuration();
        }
        String str = S0 != null ? S0.a : "";
        Bitmap bitmap = null;
        Uri uri3 = (S0 == null || (uri2 = S0.f.a) == null) ? null : uri2;
        if (Objects.equals((jt6) this.b, U0) && Objects.equals((String) this.c, str) && Objects.equals((Uri) this.d, uri3) && this.a == j2) {
            return;
        }
        this.c = str;
        this.d = uri3;
        this.b = U0;
        this.a = j2;
        t76 F = tx6Var.m.F(U0);
        if (F != null) {
            ly6Var.u = null;
            if (!F.isDone()) {
                j = j2;
                uri = uri3;
                jt6Var = U0;
                trc trcVar = new trc(this, jt6Var, str, uri, j);
                str = str;
                ly6Var.u = trcVar;
                Handler handler = tx6Var.l;
                Objects.requireNonNull(handler);
                F.b(new us4((Object) F, (Object) trcVar, (byte) 0), new g50(handler, (byte) 1));
                ly6Var.p.O(j26.b(jt6Var, str, uri, j, bitmap));
            }
            try {
                bitmap = (Bitmap) kke.a(F);
            } catch (CancellationException | ExecutionException e) {
                ncd.f("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
            }
        }
        j = j2;
        uri = uri3;
        jt6Var = U0;
        ly6Var.p.O(j26.b(jt6Var, str, uri, j, bitmap));
    }

    public final void D(bqb bqbVar) {
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        if (!ly6Var.l0() || bqbVar.p()) {
            ly6Var.p.Q(null);
            return;
        }
        int i = j26.a;
        ArrayList arrayList = new ArrayList();
        aqb aqbVar = new aqb();
        for (int i2 = 0; i2 < bqbVar.o(); i2++) {
            arrayList.add(bqbVar.m(i2, aqbVar, 0L).b);
        }
        ArrayList arrayList2 = new ArrayList();
        jy6 jy6Var = new jy6(this, new AtomicInteger(0), arrayList, arrayList2, (byte) 0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr = ((bt6) arrayList.get(i3)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                jy6Var.run();
            } else {
                t76 N = tx6Var.m.N(bArr);
                arrayList2.add(N);
                Handler handler = tx6Var.l;
                Objects.requireNonNull(handler);
                N.b(jy6Var, new g50(handler, (byte) 1));
            }
        }
    }

    @Override // rw6
    public final void a(int i, r7a r7aVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean isEmpty = bundle.isEmpty();
        Bundle bundle2 = r7aVar.c;
        if (isEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        lx6 lx6Var = ((ly6) this.e).p;
        String str = r7aVar.b;
        lx6Var.getClass();
        if (TextUtils.isEmpty(str)) {
            u36.j("event cannot be null or empty");
        } else {
            ((bx6) lx6Var.b).a.sendSessionEvent(str, bundle);
        }
    }

    @Override // rw6
    public final void f(int i, ne8 ne8Var) {
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        cf8 cf8Var = tx6Var.t;
        byte b = cf8Var.m0(20) ? (byte) 4 : (byte) 0;
        if (ly6Var.v != b) {
            ly6Var.v = b;
            ((bx6) ly6Var.p.b).a.setFlags(b | 3);
        }
        ly6Var.q0(cf8Var);
    }

    @Override // rw6
    public final void i(int i, n8a n8aVar, boolean z, boolean z2, int i2) {
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        ly6Var.q0(tx6Var.t);
    }

    @Override // ts4
    public final void j(Throwable th) {
        if (this != ((ly6) ((trc) this.e).e).u) {
            return;
        }
        ncd.f("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    public final src k(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            this.a = SystemClock.uptimeMillis();
        }
        src srcVar = new src();
        srcVar.l = 1.0f;
        srcVar.a = f2;
        srcVar.b = f3;
        double d = f4;
        srcVar.c = ((float) Math.cos(d)) * f5;
        srcVar.d = ((float) Math.sin(d)) * f5;
        srcVar.e = f6;
        srcVar.f = f7;
        srcVar.g = f8;
        srcVar.k = f[((Random) this.c).nextInt(6)];
        srcVar.h = y(0.0f, 90.0f);
        srcVar.i = y(-180.0f, 180.0f);
        arrayList.add(srcVar);
        return srcVar;
    }

    public final void l(float f2, float f3) {
        float f4 = gm.p;
        for (int i = 0; i < 28; i++) {
            k(f2, f3, y(0.0f, 6.2831855f), y(60.0f, 300.0f) * f4, y(2.5f, 6.0f) * f4, y(0.5f, 0.9f), 3.0f);
        }
    }

    public final boolean m() {
        return ((rcc) this.b).V;
    }

    public final void n(long j, float f2) {
        File file = (File) this.c;
        rcc rccVar = (rcc) this.b;
        if (rccVar.V) {
            return;
        }
        long length = j < 0 ? file.length() : j;
        if (rccVar.X || this.a != length) {
            this.a = length;
            MediaController mediaController = (MediaController) this.e;
            oo6 oo6Var = (oo6) this.d;
            String[] strArr = MediaController.W1;
            rcc rccVar2 = oo6Var.b;
            boolean z = rccVar2.W;
            if (z) {
                rccVar2.W = false;
            }
            gm.c3(new en6(mediaController, false, false, oo6Var, file, f2, 0L, z, length));
        }
    }

    public final void o() {
        ((y70) this.d).dismiss();
        this.a = System.currentTimeMillis();
    }

    @Override // ts4
    public final void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ly6 ly6Var = (ly6) ((trc) this.e).e;
        if (this != ly6Var.u) {
            return;
        }
        ly6Var.p.O(j26.b((jt6) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        tx6 tx6Var = ly6Var.j;
        hac.X(tx6Var.o, new nx6(tx6Var, (byte) 0));
    }

    public final void p(Canvas canvas) {
        Paint paint = (Paint) this.d;
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, (uptimeMillis - this.a) / 1000.0f);
        this.a = uptimeMillis;
        ArrayList arrayList = (ArrayList) this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            src srcVar = (src) arrayList.get(size);
            float f2 = srcVar.j + min;
            srcVar.j = f2;
            if (f2 >= 0.0f) {
                if (f2 >= srcVar.f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-srcVar.g) * min);
                    float f3 = srcVar.c * exp;
                    srcVar.c = f3;
                    float f4 = srcVar.d * exp;
                    srcVar.d = f4;
                    srcVar.a = (f3 * min) + srcVar.a;
                    srcVar.b = (f4 * min) + srcVar.b;
                    srcVar.h = (srcVar.i * min) + srcVar.h;
                    float f5 = srcVar.j / srcVar.f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f5 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f5) * srcVar.l;
                    float B = mlb.B(f5, 0.5f, 1.0f, srcVar.e);
                    int save = canvas.save();
                    canvas.translate(srcVar.a, srcVar.b);
                    canvas.rotate(srcVar.h);
                    canvas.scale(B, B);
                    paint.setColor(srcVar.k);
                    paint.setAlpha(Math.round(20.4f * min2));
                    canvas.drawCircle(0.0f, 0.0f, 1.4f, paint);
                    paint.setAlpha(Math.round(min2 * 255.0f));
                    canvas.drawPath((Path) this.e, paint);
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    public final boolean q() {
        return !((ArrayList) this.b).isEmpty();
    }

    public final void r() {
        ly6 ly6Var = (ly6) this.e;
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        cf8 cf8Var = tx6Var.t;
        cf8Var.H().getClass();
        ((bx6) ly6Var.p.b).a.setPlaybackToLocal((cf8Var.m0(21) ? cf8Var.F() : o00.i).b());
    }

    public final void s(bt6 bt6Var) {
        C();
        ly6 ly6Var = (ly6) this.e;
        lx6 lx6Var = ly6Var.p;
        if (bt6Var == null) {
            ((bx6) lx6Var.b).a.setRatingType(0);
        } else {
            ((bx6) lx6Var.b).a.setRatingType(j26.e(bt6Var.d.i));
        }
        tx6 tx6Var = ly6Var.j;
        tx6Var.t();
        ly6Var.q0(tx6Var.t);
    }

    public final void t(int i, cf8 cf8Var) {
        ly6 ly6Var = (ly6) this.e;
        x(cf8Var.T0());
        u(cf8Var.m0(18) ? cf8Var.g0() : jt6.M);
        cf8Var.U0();
        C();
        w(cf8Var.F0());
        v(cf8Var.x0());
        cf8Var.H();
        r();
        byte b = cf8Var.m0(20) ? (byte) 4 : (byte) 0;
        if (ly6Var.v != b) {
            ly6Var.v = b;
            ((bx6) ly6Var.p.b).a.setFlags(b | 3);
        }
        s(cf8Var.S0());
    }

    public final void u(jt6 jt6Var) {
        ly6 ly6Var = (ly6) this.e;
        lx6 lx6Var = ly6Var.p;
        CharSequence queueTitle = ((to6) ((lj4) lx6Var.c).a).a.getQueueTitle();
        CharSequence charSequence = jt6Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        if (!ly6Var.l0()) {
            charSequence = null;
        }
        ((bx6) lx6Var.b).a.setQueueTitle(charSequence);
    }

    public final void v(int i) {
        lx6 lx6Var = ((ly6) this.e).p;
        int i2 = j26.a;
        byte b = 0;
        if (i != 0) {
            if (i == 1) {
                b = 1;
            } else if (i != 2) {
                ncd.f("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
            } else {
                b = 2;
            }
        }
        bx6 bx6Var = (bx6) lx6Var.b;
        if (bx6Var.j != b) {
            bx6Var.j = b;
            synchronized (bx6Var.d) {
                int beginBroadcast = bx6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = bx6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((gk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).g(b);
                        } catch (RemoteException | SecurityException e) {
                            ncd.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void w(boolean z) {
        lx6 lx6Var = ((ly6) this.e).p;
        int i = j26.a;
        bx6 bx6Var = (bx6) lx6Var.b;
        if (bx6Var.k != z) {
            bx6Var.k = z ? 1 : 0;
            synchronized (bx6Var.d) {
                int beginBroadcast = bx6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = bx6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((gk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).i(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            ncd.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void x(bqb bqbVar) {
        D(bqbVar);
        C();
    }

    public final float y(float f2, float f3) {
        return td4.A(f3, f2, ((Random) this.c).nextFloat(), f2);
    }

    public final void z() {
        ((ArrayList) this.b).clear();
        float f2 = gm.p;
        for (int i = 0; i < 48; i++) {
            int i2 = -1;
            while (i2 <= 1) {
                trc trcVar = this;
                src k = trcVar.k(0.0f, (this.y(-3.0f, 3.0f) * f2) + 0.0f, this.y(-0.6f, 0.6f) + (i2 < 0 ? 3.1415927f : 0.0f), this.y(150.0f, 310.0f) * f2, this.y(1.3f, 3.2f) * f2, this.y(0.65f, 1.05f), 1.8f);
                k.k = -6562049;
                k.l = trcVar.y(0.3f, 1.0f);
                k.j = (-i) * 0.006f;
                i2 += 2;
                this = trcVar;
            }
        }
    }

    @Override // rw6
    public final void e() {
    }

    @Override // rw6
    public final void b(int i) {
    }

    @Override // rw6
    public final void d(int i, q26 q26Var) {
    }

    @Override // rw6
    public final void g(int i, q8a q8aVar) {
    }

    @Override // rw6
    public final void c(int i, int i2, int i3) {
    }

    @Override // rw6
    public final void h(int i, ye8 ye8Var, ne8 ne8Var, boolean z, boolean z2) {
    }

    public trc() {
        this.b = new ArrayList();
        this.c = new Random();
        this.d = new Paint(1);
        Path path = new Path();
        this.e = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public trc(ly6 ly6Var) {
        this.e = ly6Var;
        this.b = jt6.M;
        this.c = "";
        this.a = -9223372036854775807L;
    }

    public trc(trc trcVar, jt6 jt6Var, String str, Uri uri, long j) {
        this.e = trcVar;
        this.b = jt6Var;
        this.c = str;
        this.d = uri;
        this.a = j;
    }

    public trc(MediaController mediaController, rcc rccVar, File file, oo6 oo6Var) {
        this.e = mediaController;
        this.b = rccVar;
        this.c = file;
        this.d = oo6Var;
        this.a = 0L;
    }
}
