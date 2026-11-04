package xg;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import b8.ke;
import ci.h3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d2.o1;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f31;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements p1, gj0, xh.a, z2.k, Continuation, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0123  */
    @Override // org.telegram.ui.Components.gj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f10, float f11, int i3, View view) {
        long j10;
        w0 w0Var = (w0) this.b;
        LinkedHashMap linkedHashMap = w0Var.e2;
        v0 v0Var = w0Var.R1;
        HashSet hashSet = w0Var.X1;
        int i10 = 3;
        if (view instanceof l8) {
            linkedHashMap.clear();
            w0Var.i1(true);
        } else if (view instanceof bh.p) {
            bh.p pVar = (bh.p) view;
            TLRPC.User user = pVar.getUser();
            TLRPC.Chat chat = pVar.getChat();
            long j11 = user != null ? user.id : -chat.id;
            j10 = 1;
            if (hashSet.contains(Long.valueOf(j11))) {
                hashSet.remove(Long.valueOf(j11));
            } else {
                hashSet.add(Long.valueOf(j11));
                Long valueOf = Long.valueOf(j11);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && w0Var.k2 == 1) || (hashSet.size() == s.f() + 1 && w0Var.k2 == 2)) {
                hashSet.remove(Long.valueOf(j11));
                w0Var.k1();
                return;
            }
            v0Var.b(true, hashSet, new r0(w0Var, 1), null);
            w0Var.n1(true, false);
            if (chat != null && !t3.t0(chat) && hashSet.contains(Long.valueOf(j11))) {
                Context context = w0Var.p1.getContext();
                e6 e6Var = w0Var.J0;
                f31 f31Var = new f31(w0Var, j11, i10);
                r0 r0Var = new r0(w0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                boolean V = t3.V(chat);
                String M0 = bd.M0(V ? 2131753397 : 2131753395, null);
                s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = bd.M0(V ? 2131753396 : 2131753394, null);
                alertDialog$Builder.k(bd.M0(2131754486, "Add"), new na1(22, atomicBoolean, r0Var));
                alertDialog$Builder.h(bd.M0(2131752589, "Cancel"), new u9.j(20));
                alertDialog$Builder.j(new h3(18, atomicBoolean, f31Var));
                alertDialog$Builder.p();
            } else if (chat != null) {
                w0Var.e1();
            }
            if (view instanceof bh.c) {
                return;
            }
            long hashCode = ((bh.c) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == hp.s1(h10.t0).q0 + j10 && w0Var.k2 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                w0Var.k1();
                return;
            }
            v0Var.b(true, hashSet, new r0(w0Var, 3), w0Var.d2);
            if (TextUtils.isEmpty(w0Var.g2)) {
                w0Var.n1(true, false);
                return;
            }
            w0Var.g2 = null;
            v0Var.setText("");
            w0Var.n1(false, false);
            w0Var.n1(true, true);
            return;
        }
        j10 = 1;
        if (view instanceof bh.c) {
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // z2.k
    public g9.s1 c(int i3, o1 o1Var, int[] iArr) {
        z2.i iVar = (z2.i) this.b;
        g9.f0 p10 = g9.i0.p();
        for (int i10 = 0; i10 < o1Var.a; i10++) {
            p10.c(new z2.f(i3, o1Var, i10, iVar, iArr[i10]));
        }
        return p10.f();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    c0.e1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 1:
                ((rn) this.b).run();
                break;
            default:
                ((r0) this.b).run();
                break;
        }
    }

    @Override // xh.a
    public void h(Canvas canvas, int i3) {
        xh.h hVar = (xh.h) this.b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + org.telegram.messenger.g0.L(30.0f));
        hVar.e(canvas, true, i3);
        canvas.restore();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 9:
                za.x.b((Intent) this.b);
                break;
            case 10:
                ((za.z) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Exception exception;
        switch (this.a) {
            case 6:
                ((CountDownLatch) this.b).countDown();
                return null;
            case 7:
                ke keVar = (ke) this.b;
                keVar.getClass();
                if (task.isSuccessful() || (exception = task.getException()) == null || TextUtils.isEmpty(exception.getMessage()) || !exception.getMessage().contains("FID_ALREADY_USED:")) {
                    return task;
                }
                Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
                ((ua.d) ((ua.e) keVar.d)).c.F().delete();
                return keVar.G();
            default:
                ((l2.e) this.b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
