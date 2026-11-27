// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.FrameDecryptor;
import org.webrtc.FrameEncryptor;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpParameters;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ye9 implements vt3, lf9, ncc, oj3, fd, qy9, yl9, cg0, nl0, on5, NativeLifecycleLock.NativePointerRunnable, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativeDisposer, t69, ta9, s69, k6b, pg2, if7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ye9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // oj3
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override // if7
    public final void a(String str) {
        c6b storiesController;
        eja ejaVar = ((ega) this.b).d;
        storiesController = ejaVar.getStoriesController();
        storiesController.q(ejaVar.m1, str, new yfa(ejaVar, (byte) 1));
    }

    @Override // pg2
    public final void b() {
        nea neaVar = (nea) this.b;
        float progress = 1.0f - (neaVar.d.getProgress() * 0.143f);
        de0 de0Var = neaVar.a;
        de0Var.setScaleX(progress);
        de0Var.setScaleY(progress);
        neaVar.invalidate();
    }

    @Override // vt3
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                rf9 rf9Var = (rf9) obj;
                dg9 dg9Var = rf9Var.d;
                mk0 mk0Var = rf9Var.f;
                if (mk0Var != null) {
                    mk0Var.s = true;
                    mk0Var.r = dg9Var.r2;
                }
                if (mk0Var != null) {
                    TL_iv.PageBlock pageBlock = mk0Var.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = mm9.f(dg9Var.getText());
                    }
                }
                yh9 yh9Var = rf9Var.h;
                if (yh9Var != null && rf9Var.f != null) {
                    yh9Var.a.X3();
                    break;
                }
                break;
            case 7:
                ((pl9) obj).g();
                break;
            default:
                xl9 xl9Var = (xl9) obj;
                mk0 mk0Var2 = xl9Var.a;
                if (mk0Var2 != null) {
                    mk0Var2.s = true;
                    mk0Var2.r = xl9Var.r.r2;
                }
                xl9Var.w();
                xh9 xh9Var = xl9Var.F;
                if (xh9Var != null && xl9Var.a != null) {
                    xh9Var.a.X3();
                    break;
                }
                break;
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$setParameters$4;
        Boolean lambda$setDirection$5;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 17:
                lambda$setParameters$4 = RtpSender.lambda$setParameters$4((RtpParameters) obj, j);
                return lambda$setParameters$4;
            default:
                lambda$setDirection$5 = RtpTransceiver.lambda$setDirection$5((RtpTransceiver.RtpTransceiverDirection) obj, j);
                return lambda$setDirection$5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0125  */
    @Override // s69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, int i, View view) {
        long j;
        t2a t2aVar = (t2a) this.b;
        LinkedHashMap linkedHashMap = t2aVar.g2;
        s2a s2aVar = t2aVar.T1;
        HashSet hashSet = t2aVar.Z1;
        if (view instanceof skb) {
            linkedHashMap.clear();
            t2aVar.e1(true);
        } else if (view instanceof e3a) {
            e3a e3aVar = (e3a) view;
            TLRPC.User user = e3aVar.getUser();
            TLRPC.Chat chat = e3aVar.getChat();
            long j2 = user != null ? user.id : -chat.id;
            if (hashSet.contains(Long.valueOf(j2))) {
                hashSet.remove(Long.valueOf(j2));
            } else {
                hashSet.add(Long.valueOf(j2));
                Long valueOf = Long.valueOf(j2);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && t2aVar.m2 == 1) || (hashSet.size() == on0.g() + 1 && t2aVar.m2 == 2)) {
                hashSet.remove(Long.valueOf(j2));
                t2aVar.g1();
                return;
            }
            s2aVar.b(true, hashSet, new o2a(t2aVar, (byte) 1), null);
            t2aVar.j1(true, false);
            if (chat == null || xc2.t0(chat) || !hashSet.contains(Long.valueOf(j2))) {
                j = 1;
                if (chat != null) {
                    t2aVar.Z0();
                }
            } else {
                Context context = t2aVar.r1.getContext();
                vnb vnbVar = t2aVar.J0;
                j = 1;
                kt ktVar = new kt((Object) t2aVar, j2, (byte) 29);
                o2a o2aVar = new o2a(t2aVar, (byte) 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                boolean V = xc2.V(chat);
                String M0 = ob6.M0(V ? 2131753390 : 2131753388, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(V ? 2131753389 : 2131753387, null);
                alertDialog$Builder.j(ob6.M0(2131754479, "Add"), new o(atomicBoolean, o2aVar, (byte) 19));
                alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), new vr9((byte) 16));
                alertDialog$Builder.i(new gf(atomicBoolean, ktVar, (byte) 4));
                alertDialog$Builder.o();
            }
            if (view instanceof v2a) {
                return;
            }
            long hashCode = ((v2a) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == on0.i() + j && t2aVar.m2 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                t2aVar.g1();
                return;
            }
            s2aVar.b(true, hashSet, new o2a(t2aVar, (byte) 3), t2aVar.f2);
            if (TextUtils.isEmpty(t2aVar.i2)) {
                t2aVar.j1(true, false);
                return;
            }
            t2aVar.i2 = null;
            s2aVar.setText("");
            t2aVar.j1(false, false);
            t2aVar.j1(true, true);
            return;
        }
        j = 1;
        if (view instanceof v2a) {
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeDisposer
    public final void dispose(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 18:
                ((RtpSender) obj).lambda$dispose$8(j);
                break;
            default:
                ((RtpTransceiver) obj).lambda$dispose$10(j);
                break;
        }
    }

    @Override // t69
    public final boolean e(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 21:
                aw9 aw9Var = (aw9) obj;
                ox0 ox0Var = aw9Var.c;
                r47 E = ox0Var.E(i);
                aw9 aw9Var2 = (aw9) ox0Var.d;
                if (E == null) {
                    return false;
                }
                if (!aw9Var.J.u()) {
                    aw9Var.J.e();
                    ox0Var.l(0, aw9Var2.r);
                }
                if (aw9Var.J.u()) {
                    aw9Var.J.h(E, view, 0);
                    if (!aw9Var.J.u()) {
                        ox0Var.l(0, aw9Var2.r);
                    }
                    qg4 qg4Var = aw9Var.K;
                    int e1 = E.e1();
                    qg4Var.a = r47.B0(E.k);
                    qg4Var.b = e1;
                }
                return true;
            default:
                return ((k2a) obj).a1(i, view);
        }
    }

    @Override // k6b
    public final void f(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 26:
                y3a y3aVar = (y3a) obj;
                if (y3aVar != null) {
                    y3aVar.c();
                    break;
                }
                break;
            default:
                v5b v5bVar = (v5b) obj;
                if (z) {
                    v5bVar.p(30, false);
                    break;
                }
                break;
        }
    }

    @Override // qy9
    public final void g(float f) {
        r47 r47Var = ((ck9) this.b).X;
        if (r47Var == null) {
            return;
        }
        r47Var.b0 = f;
        MediaController.z().k0(r47Var, f);
    }

    @Override // lf9
    public final fu5 i(dg9 dg9Var) {
        return fu5.I((yg9) ((j09) this.b).b, dg9Var);
    }

    public final void j(int i) {
        ze9 ze9Var = (ze9) this.b;
        ze9Var.c = i;
        ze9Var.e(i);
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((pi9[]) this.b)[0] == null || !(view instanceof km9)) {
            return;
        }
        ((km9) view).A();
    }

    @Override // nl0
    public final int l(vnb vnbVar, boolean z) {
        return ((IntSupplier) this.b).getAsInt();
    }

    public final void m(Canvas canvas) {
        dr9 dr9Var = (dr9) this.b;
        Paint paint = dr9Var.K;
        RectF rectF = dr9Var.d;
        dr9Var.d(canvas);
        er9 er9Var = dr9Var.P;
        FrameLayout frameLayout = er9Var.h;
        TextureView textureView = er9Var.n;
        if (frameLayout.getVisibility() != 0 || frameLayout.getWidth() <= 0) {
            return;
        }
        canvas.save();
        canvas.translate(frameLayout.getLeft(), frameLayout.getTop());
        canvas.concat(frameLayout.getMatrix());
        float L = (1.0f - er9Var.U) * hl.L(12.0f);
        rectF.set(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight());
        canvas.clipRect(rectF);
        paint.setColor(-16777216);
        canvas.drawRoundRect(rectF, L, L, paint);
        if (textureView.isAvailable() && textureView.isAttachedToWindow()) {
            canvas.translate(textureView.getLeft(), textureView.getTop());
            canvas.concat(textureView.getMatrix());
            textureView.draw(canvas);
        }
        canvas.restore();
    }

    @Override // ta9
    public final void n(long j, ey7 ey7Var) {
        ivd.a(j, ey7Var, ((oz9) this.b).c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (uc7.s1(k5.a(r3).a).C(r0, r24, null, null) != false) goto L22;
     */
    @Override // oj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        long j;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                bj9 bj9Var = (bj9) obj;
                if (arrayList.isEmpty() || ((jf7) arrayList.get(0)).a <= 0) {
                    return false;
                }
                bj9Var.run(((jf7) arrayList.get(0)).a);
                uj3Var.finishFragment();
                return true;
            default:
                bj3 bj3Var = (bj3) obj;
                int i3 = bj3Var.K0;
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = bj3Var.C0;
                Iterator it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((r47) hashMap.get((qg4) it.next()));
                }
                hashMap.clear();
                bj3Var.S(false);
                if (arrayList.size() > 1 || ((jf7) arrayList.get(0)).a == yac.h(k5.a(i3).a).e() || charSequence != null) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        long j2 = ((jf7) arrayList.get(i4)).a;
                        if (charSequence != null) {
                            j = j2;
                            r7a.B(k5.a(i3).a).q0(p7a.b(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j = j2;
                        }
                        r7a.B(k5.a(i3).a).p0(arrayList2, j, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    uj3Var.finishFragment();
                } else {
                    long j3 = ((jf7) arrayList.get(0)).a;
                    Bundle l = bs2.l("scrollToTopOnResume", true);
                    if (!wf3.B(j3)) {
                        if (wf3.D(j3)) {
                            l.putLong("user_id", j3);
                        } else {
                            l.putLong("chat_id", -j3);
                        }
                        break;
                    } else {
                        l.putInt("enc_id", (int) (j3 & 4294967295L));
                    }
                    zu1 zu1Var = new zu1(l);
                    uj3Var.presentFragment(zu1Var, true);
                    zu1Var.cc(arrayList2);
                }
                return true;
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                RtpReceiver.lambda$setFrameDecryptor$5((FrameDecryptor) obj, j);
                break;
            default:
                RtpSender.lambda$setFrameEncryptor$7((FrameEncryptor) obj, j);
                break;
        }
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        byte b = this.a;
        return false;
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        gr9 gr9Var = (gr9) this.b;
        if (!z || z2) {
            return;
        }
        gr9Var.a();
    }

    @Override // fd
    public final void w(id idVar, int i) {
        ((lb7) this.b).run();
    }

    @Override // qy9
    public final void h(float f) {
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
