// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf implements ed, vc7, pc3, jl3, z97, j1c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wf(y0b y0bVar, i8c i8cVar, Context context, boolean z) {
        this.a = (byte) 8;
        this.d = y0bVar;
        this.e = i8cVar;
        this.c = context;
        this.b = z;
    }

    @Override // z97
    public final boolean b(TLRPC.TL_error tL_error) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean[] zArr = (boolean[]) this.d;
        d dVar = (d) this.e;
        RectF rectF = ProfileActivity.Z6;
        return profileActivity.D2(zArr, this.b, dVar, tL_error);
    }

    @Override // jl3
    public final void c(TLRPC.TL_error tL_error, String str) {
        jm3 jm3Var = (jm3) this.c;
        kl3 kl3Var = (kl3) this.d;
        kl3 kl3Var2 = (kl3) this.e;
        if (jm3Var.r != 4) {
            return;
        }
        if (str != null) {
            gl.d3(new mg3(jm3Var, str, kl3Var2, (byte) 8), Math.max(0L, (jm3Var.V + 1200) - SystemClock.uptimeMillis()));
            return;
        }
        jm3Var.r = (byte) 3;
        jm3Var.K = kl3Var;
        jm3Var.F.f(false);
        jm3Var.j(0L, 240L);
        if (!this.b) {
            jm3Var.J = null;
        }
        jm3Var.w.d(kl3Var.a(), false);
        jm3Var.w.setRevert(jm3Var.J != null);
        jm3Var.D(false);
        jm3.G(tL_error);
    }

    @Override // j1c
    public final void e(Exception exc) {
        f89 f89Var = (f89) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        b80 b80Var = (b80) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new lw8(f89Var, countDownLatch, (byte) 15)).start();
            ExecutorService executorService = u8c.a;
            boolean z2 = false;
            try {
                long j = 2000000000;
                long nanoTime = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(j, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            j = nanoTime - System.nanoTime();
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        taskCompletionSource.trySetResult(b80Var);
    }

    @Override // pc3
    public final w59 j(int i, sxb sxbVar, int[] iArr) {
        sc3 sc3Var = (sc3) this.c;
        nc3 nc3Var = (nc3) this.d;
        int[] iArr2 = (int[]) this.e;
        sc3Var.getClass();
        ic3 ic3Var = new ic3(sc3Var, nc3Var);
        int i2 = iArr2[i];
        jm5 p = mm5.p();
        for (int i3 = 0; i3 < sxbVar.a; i3++) {
            p.c(new jc3(i, sxbVar, i3, nc3Var, iArr[i3], this.b, ic3Var, i2));
        }
        return p.f();
    }

    @Override // vc7
    public final void run(long j) {
        xm2 xm2Var = (xm2) this.c;
        hd hdVar = (hd) this.d;
        String str = (String) this.e;
        hdVar.dismiss();
        if (j == 0) {
            return;
        }
        xm2Var.b = -j;
        xm2Var.c = xm2Var.getMessagesController().K0(Long.valueOf(j));
        xm2Var.Y(str, this.b);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                Context context = (Context) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                vs2 vs2Var = (vs2) this.e;
                if (!z) {
                    atomicBoolean.set(true);
                    vs2Var.accept(Boolean.TRUE);
                    break;
                } else {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                        context.startActivity(intent);
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
            case 1:
                mu1 mu1Var = (mu1) this.c;
                na7 na7Var = (na7) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z2 = this.b;
                mu1Var.getClass();
                na7Var.z2 = 1;
                na7.c1().edit().putInt("secretWebpage2", mu1Var.getMessagesController().z2).commit();
                mu1Var.Z5 = null;
                mu1Var.jb(charSequence, z2);
                break;
            case 7:
                boolean z3 = this.b;
                d97 d97Var = (d97) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ve9 ve9Var = (ve9) this.e;
                int i2 = ve9Var.b;
                if (!z3) {
                    d97Var.run();
                    break;
                } else {
                    String trim = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        TL_iv.pageBlockButtonRow d = ve9Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i2 < 0 || i2 >= d.buttons.size()) ? null : d.buttons.get(i2);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d2 = ve9Var.d();
                            TL_keyboard.PageButton pageButton2 = (d2 == null || i2 < 0 || i2 >= d2.buttons.size()) ? null : d2.buttons.get(i2);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            ve9Var.a(trim, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
            default:
                y0b y0bVar = (y0b) this.d;
                i8c i8cVar = (i8c) this.e;
                Context context2 = (Context) this.c;
                boolean z4 = this.b;
                String trim2 = y0bVar.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(gl.I3(trim2.toString()))) {
                    gl.t1(y0bVar);
                    hd hdVar2 = new hd(3, z4 ? null : new f53(), context2);
                    hdVar2.q(250L);
                    i8cVar.a(trim2, new f28((Object) hdVar2, (Object) hdVar, (Object) y0bVar, (byte) 10));
                    break;
                } else {
                    y0bVar.setErrorText(".");
                    gl.A3(-6.0f, y0bVar, null);
                    pw0.E.a();
                    gl.E3(y0bVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wf(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ wf(d dVar, gk7 gk7Var, CharSequence charSequence, boolean z, byte b) {
        this.a = b;
        this.c = dVar;
        this.d = gk7Var;
        this.e = charSequence;
        this.b = z;
    }

    public /* synthetic */ wf(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
