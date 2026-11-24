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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wg implements ee, xe7, ce3, um3, ac7, j3c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wg(a3b a3bVar, jac jacVar, Context context, boolean z) {
        this.a = (byte) 8;
        this.d = a3bVar;
        this.e = jacVar;
        this.c = context;
        this.b = z;
    }

    @Override // ac7
    public final boolean b(TLRPC.TL_error tL_error) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean[] zArr = (boolean[]) this.d;
        d dVar = (d) this.e;
        RectF rectF = ProfileActivity.e7;
        return profileActivity.G2(zArr, this.b, dVar, tL_error);
    }

    @Override // um3
    public final void c(TLRPC.TL_error tL_error, String str) {
        un3 un3Var = (un3) this.c;
        vm3 vm3Var = (vm3) this.d;
        vm3 vm3Var2 = (vm3) this.e;
        if (un3Var.r != 4) {
            return;
        }
        if (str != null) {
            gm.d3(new pz2(un3Var, str, vm3Var2, (byte) 10), Math.max(0L, (un3Var.V + 1200) - SystemClock.uptimeMillis()));
            return;
        }
        un3Var.r = (byte) 3;
        un3Var.K = vm3Var;
        un3Var.F.f(false);
        un3Var.j(0L, 240L);
        if (!this.b) {
            un3Var.J = null;
        }
        un3Var.w.d(vm3Var.a(), false);
        un3Var.w.setRevert(un3Var.J != null);
        un3Var.D(false);
        un3.G(tL_error);
    }

    @Override // j3c
    public final void d(Exception exc) {
        ha9 ha9Var = (ha9) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        b90 b90Var = (b90) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new ey8(ha9Var, countDownLatch, (byte) 17)).start();
            ExecutorService executorService = vac.a;
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
        taskCompletionSource.trySetResult(b90Var);
    }

    @Override // ce3
    public final y79 n(int i, uzb uzbVar, int[] iArr) {
        fe3 fe3Var = (fe3) this.c;
        ae3 ae3Var = (ae3) this.d;
        int[] iArr2 = (int[]) this.e;
        fe3Var.getClass();
        vd3 vd3Var = new vd3(fe3Var, ae3Var);
        int i2 = iArr2[i];
        jo5 p = mo5.p();
        for (int i3 = 0; i3 < uzbVar.a; i3++) {
            p.c(new wd3(i, uzbVar, i3, ae3Var, iArr[i3], this.b, vd3Var, i2));
        }
        return p.f();
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                Context context = (Context) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                gu2 gu2Var = (gu2) this.e;
                if (!z) {
                    atomicBoolean.set(true);
                    gu2Var.accept(Boolean.TRUE);
                    break;
                } else {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                        context.startActivity(intent);
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
            case 1:
                yv1 yv1Var = (yv1) this.c;
                oc7 oc7Var = (oc7) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z2 = this.b;
                yv1Var.getClass();
                oc7Var.z2 = 1;
                oc7.d1().edit().putInt("secretWebpage2", yv1Var.getMessagesController().z2).commit();
                yv1Var.Z5 = null;
                yv1Var.tb(charSequence, z2);
                break;
            case 7:
                boolean z3 = this.b;
                eb7 eb7Var = (eb7) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                zg9 zg9Var = (zg9) this.e;
                int i2 = zg9Var.b;
                if (!z3) {
                    eb7Var.run();
                    break;
                } else {
                    String trim = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        TL_iv.pageBlockButtonRow d = zg9Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i2 < 0 || i2 >= d.buttons.size()) ? null : d.buttons.get(i2);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d2 = zg9Var.d();
                            TL_keyboard.PageButton pageButton2 = (d2 == null || i2 < 0 || i2 >= d2.buttons.size()) ? null : d2.buttons.get(i2);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            zg9Var.a(trim, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
            default:
                a3b a3bVar = (a3b) this.d;
                jac jacVar = (jac) this.e;
                Context context2 = (Context) this.c;
                boolean z4 = this.b;
                String trim2 = a3bVar.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(gm.I3(trim2.toString()))) {
                    gm.t1(a3bVar);
                    he heVar2 = new he(3, z4 ? null : new r63(), context2);
                    heVar2.q(250L);
                    jacVar.a(trim2, new i48((Object) heVar2, (Object) heVar, (Object) a3bVar, (byte) 10));
                    break;
                } else {
                    a3bVar.setErrorText(".");
                    gm.A3(-6.0f, a3bVar, null);
                    xx0.E.a();
                    gm.E3(a3bVar);
                    break;
                }
                break;
        }
    }

    @Override // xe7
    public final void run(long j) {
        io2 io2Var = (io2) this.c;
        he heVar = (he) this.d;
        String str = (String) this.e;
        heVar.dismiss();
        if (j == 0) {
            return;
        }
        io2Var.b = -j;
        io2Var.c = io2Var.getMessagesController().L0(Long.valueOf(j));
        io2Var.Z(str, this.b);
    }

    public /* synthetic */ wg(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ wg(d dVar, jm7 jm7Var, CharSequence charSequence, boolean z, byte b) {
        this.a = b;
        this.c = dVar;
        this.d = jm7Var;
        this.e = charSequence;
        this.b = z;
    }

    public /* synthetic */ wg(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
