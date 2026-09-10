package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.b9;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.uc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.bq0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ic1;
import org.telegram.ui.m20;
import org.telegram.ui.zp0;
import xh.r8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class m0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public t E;
    public int F;
    public boolean G;
    public long H;
    public final m20 I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public t0 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final u V;
    public pc W;
    public final View a;
    public jc a0;
    public final FrameLayout b;
    public nc b0;
    public final zp0 c;
    public ic c0;
    public final s4.c0 d;
    public final u d0;
    public final x e;
    public ValueAnimator e0;
    public final ic1 f;
    public boolean f0;
    public final u g0;
    public final s4.c0 h;
    public final j61 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap v;
    public long w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r6v3, types: [zh.w] */
    public m0(Context context, u7 u7Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new m20();
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.T = new ArrayList();
        final o1 o1Var = (o1) this;
        this.V = new u(o1Var, 0);
        this.d0 = new u(o1Var, 1);
        this.f0 = false;
        this.g0 = new u(o1Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        zp0 zp0Var = new zp0(o1Var, context, 3);
        this.c = zp0Var;
        zp0Var.setWillNotDraw(false);
        s4.c0 c0Var = new s4.c0(1, true);
        this.d = c0Var;
        zp0Var.setLayoutManager(c0Var);
        final int i11 = 0;
        x xVar = new x(o1Var, zp0Var, context, i10, new Utilities.Callback2() { // from class: zh.w
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                o1 o1Var2 = o1Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = o1Var2.r;
                        t0 t0Var = o1Var2.P;
                        long j3 = t0Var == null ? 0L : t0Var.j();
                        o1Var2.H = j3;
                        while (i13 < arrayList2.size()) {
                            k0 k0Var = (k0) arrayList2.get(i13);
                            if (k0Var.b || !k0Var.e || k0Var.g >= j3) {
                                int i14 = e0.a;
                                v51 J = v51.J(e0.class);
                                J.G = k0Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = o1Var2.s;
                        while (i13 < arrayList3.size()) {
                            l0 l0Var = (l0) arrayList3.get(i13);
                            int i15 = i0.a;
                            v51 J2 = v51.J(i0.class);
                            J2.G = l0Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b());
        this.e = xVar;
        zp0Var.setAdapter(xVar);
        xVar.r = false;
        zp0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        zp0Var.setClipToPadding(false);
        addView(zp0Var, w7.a6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        zp0Var.setOnItemClickListener(new b9(o1Var, viewGroup, u7Var, 3));
        y yVar = new y(o1Var);
        yVar.m = false;
        yVar.C = false;
        wr wrVar = wr.h;
        yVar.o(wrVar);
        yVar.n(280L);
        yVar.D = 14L;
        zp0Var.setItemAnimator(yVar);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new org.telegram.ui.web.c(o1Var, 24));
        ic1 ic1Var = new ic1(context, 13, null);
        this.f = ic1Var;
        ic1Var.setWillNotDraw(false);
        s4.c0 c0Var2 = new s4.c0(0, false);
        this.h = c0Var2;
        ic1Var.setLayoutManager(c0Var2);
        final int i12 = 1;
        j61 j61Var = new j61(ic1Var, context, i10, 0, false, new Utilities.Callback2() { // from class: zh.w
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i122 = i12;
                int i13 = 0;
                o1 o1Var2 = o1Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i122) {
                    case 0:
                        ArrayList arrayList2 = o1Var2.r;
                        t0 t0Var = o1Var2.P;
                        long j3 = t0Var == null ? 0L : t0Var.j();
                        o1Var2.H = j3;
                        while (i13 < arrayList2.size()) {
                            k0 k0Var = (k0) arrayList2.get(i13);
                            if (k0Var.b || !k0Var.e || k0Var.g >= j3) {
                                int i14 = e0.a;
                                v51 J = v51.J(e0.class);
                                J.G = k0Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = o1Var2.s;
                        while (i13 < arrayList3.size()) {
                            l0 l0Var = (l0) arrayList3.get(i13);
                            int i15 = i0.a;
                            v51 J2 = v51.J(i0.class);
                            J2.G = l0Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = j61Var;
        ic1Var.setAdapter(j61Var);
        j61Var.r = false;
        ic1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ic1Var.setClipToPadding(false);
        addView(ic1Var, w7.a6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        ic1Var.setOnItemClickListener(new th.e(o1Var, 21));
        z zVar = new z();
        zVar.m = false;
        zVar.C = false;
        zVar.o(wrVar);
        zVar.n(350L);
        ic1Var.setItemAnimator(zVar);
        u(false);
    }

    public static Integer a(m0 m0Var, Long l4) {
        m0Var.d0.run();
        m0Var.R = l4.longValue();
        pc M = new wc(m0Var.b, new b()).M(m0Var.getStarsToastTitle(), m0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.r = false;
        M.k(true);
        m0Var.R = 0L;
        m0Var.S = true;
        int o9 = m0Var.o(new TLRPC.TL_textWithEntities(), l4.longValue());
        t0 t0Var = m0Var.P;
        long j3 = t0Var != null ? t0Var.j() : 0L;
        if (m0Var.getDefaultPeerId() == m0Var.M && m0Var.f()) {
            z10 = true;
        }
        return (l4.longValue() >= j3 || z10) ? Integer.valueOf(o9) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        t0 t0Var = this.P;
        if (t0Var != null && t0Var.l()) {
            if (this.P.v == null ? false : !r1.messages_enabled) {
                return this.M;
            }
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.N).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        zp0 zp0Var = this.c;
        int height = zp0Var.getHeight();
        for (int i10 = 0; i10 < zp0Var.getChildCount(); i10++) {
            height = Math.min(zp0Var.getChildAt(i10).getTop(), height);
        }
        return zp0Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.R)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i10 = (int) (0 + this.R);
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            if (((TL_phone.groupCallDonor) this.T.get(i11)).my) {
                i10 = (int) (i10 + ((TL_phone.groupCallDonor) this.T.get(i11)).stars);
            }
        }
        return i10;
    }

    public final void b() {
        this.R = 0L;
        h(getDefaultPeerId());
        f1 f1Var = ((o1) this).i0.Z1;
        e1 e1Var = f1Var.a;
        e1Var.c(f1Var);
        e1Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        k0 k0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.r;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                k0Var = null;
                break;
            } else {
                if (((k0) arrayList.get(i11)).a == i10) {
                    k0Var = (k0) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (k0Var == null) {
            return;
        }
        if (k0Var.a < 0 && k0Var.e) {
            long j3 = k0Var.g;
            if (j3 > 0) {
                this.Q -= j3;
                j();
            }
        }
        int i12 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((l0) arrayList2.get(i12)).f.contains(k0Var)) {
                ((l0) arrayList2.get(i12)).f.remove(k0Var);
                if (((l0) arrayList2.get(i12)).f.isEmpty()) {
                    arrayList2.remove(i12);
                    z10 = true;
                } else {
                    ((l0) arrayList2.get(i12)).c();
                    m();
                }
            } else {
                i12++;
            }
        }
        arrayList.remove(i11);
        this.e.N(true);
        if (z10) {
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList2, new sg.p(this, 21));
            this.n.N(true);
            t();
            u(true);
        }
    }

    public final f0 d(int i10) {
        f0 f0Var;
        k0 k0Var;
        int i11 = 0;
        while (true) {
            zp0 zp0Var = this.c;
            if (i11 >= zp0Var.getChildCount()) {
                return null;
            }
            View childAt = zp0Var.getChildAt(i11);
            if ((childAt instanceof f0) && (k0Var = (f0Var = (f0) childAt).K) != null && k0Var.a == i10) {
                return f0Var;
            }
            i11++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.liveStoryMessageUpdate) {
            int i12 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (!(tLObject instanceof TL_update.TL_updateGroupCallMessage)) {
                if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                    TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                    TLRPC.InputGroupCall inputGroupCall = this.O;
                    if (inputGroupCall == null || inputGroupCall.id != longValue) {
                        return;
                    }
                    ArrayList<Integer> arrayList = tL_updateDeleteGroupCallMessages.messages;
                    int size = arrayList.size();
                    while (i12 < size) {
                        Integer num = arrayList.get(i12);
                        i12++;
                        c(num.intValue());
                    }
                    return;
                }
                return;
            }
            TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
            TLRPC.InputGroupCall inputGroupCall2 = this.O;
            if (inputGroupCall2 != null && inputGroupCall2.id == longValue) {
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i13 = groupCallMessage.date;
                int i14 = groupCallMessage.id;
                boolean z10 = groupCallMessage.from_admin;
                long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                l(i13, i14, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        zp0 zp0Var = this.c;
        if (view != zp0Var) {
            return super.drawChild(canvas, view, j3);
        }
        if (zp0Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.K - zp0Var.getTop()) + zp0Var.getY();
        canvas.saveLayerAlpha(zp0Var.getX(), zp0Var.getY(), zp0Var.getX() + zp0Var.getWidth(), zp0Var.getY() + zp0Var.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((zp0Var.getY() + zp0Var.getHeight()) - max, getListViewTop()) * (1.0f - zp0Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
        m20 m20Var = this.I;
        m20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (zp0Var.getY() + zp0Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), zp0Var.getHeight() + zp0Var.getBottom());
        m20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return drawChild;
    }

    public final int e(long j3) {
        return ((Integer) Map.-EL.getOrDefault(this.v, Long.valueOf(j3), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.M) {
            return false;
        }
        long j3 = this.M;
        int i10 = this.N;
        if (j3 >= 0) {
            return j3 == UserConfig.getInstance(i10).getClientUserId();
        }
        t0 t0Var = this.P;
        if (t0Var == null || (inputGroupCall = this.O) == null || inputGroupCall.id != t0Var.g() || (groupCall = this.P.v) == null || !groupCall.creator) {
            return ChatObject.canManageCalls(MessagesController.getInstance(i10).getChat(Long.valueOf(-this.M)));
        }
        return true;
    }

    public final boolean g() {
        return this.f0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        zp0 zp0Var = this.c;
        int height = zp0Var.getHeight();
        for (int i10 = 0; i10 < zp0Var.getChildCount(); i10++) {
            height = Math.min(zp0Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.r.size();
    }

    public long getStarsCount() {
        return this.Q + this.R;
    }

    public int getUnreadMessagesCount() {
        int i10 = 0;
        if (this.F < 0) {
            return 0;
        }
        t0 t0Var = this.P;
        long j3 = t0Var == null ? 0L : t0Var.j();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            k0 k0Var = (k0) arrayList.get(i10);
            int i12 = k0Var.a;
            if (i12 >= 0 && i12 > this.F && (k0Var.b || !k0Var.e || k0Var.g >= j3)) {
                i11++;
            }
            i10++;
        }
    }

    public abstract void h(long j3);

    public abstract void i(int i10, int i11, long j3);

    public abstract void j();

    public final void k(boolean z10) {
        this.d0.run();
        ArrayList arrayList = new ArrayList();
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i10);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long clientUserId = UserConfig.getInstance(this.N).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        bq0 bq0Var = new bq0(2);
        r8 r8Var = new r8(getContext(), this.N, this.M, null, null, arrayList, !z10, true, clientUserId, bq0Var);
        o1 o1Var = (o1) this;
        r8Var.N = o1Var;
        r8Var.P = new th.e(o1Var, 20);
        r8Var.show();
    }

    public final void l(int i10, int i11, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        l0 l0Var;
        boolean z12;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i13 >= arrayList.size()) {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                k0 k0Var = new k0();
                k0Var.d = i10;
                k0Var.b = z10;
                k0Var.c = j3;
                k0Var.f = tL_textWithEntities;
                k0Var.g = j10;
                k0Var.a = i11;
                k0Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = o.b(i14, (int) k0Var.g, 0);
                long j11 = k0Var.g;
                ArrayList arrayList2 = this.s;
                if (j11 > 0 && b10 > 0 && currentTime - k0Var.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            l0Var = null;
                            break;
                        } else {
                            if (((l0) arrayList2.get(i15)).b == j3) {
                                l0Var = (l0) arrayList2.get(i15);
                                break;
                            }
                            i15++;
                        }
                    }
                    if (l0Var == null) {
                        l0Var = new l0();
                        ArrayList arrayList3 = new ArrayList();
                        l0Var.f = arrayList3;
                        l0Var.a = i14;
                        l0Var.b = j3;
                        arrayList3.add(k0Var);
                        arrayList2.add(0, l0Var);
                        z12 = true;
                    } else {
                        l0Var.f.add(k0Var);
                        this.f.e1();
                        z12 = false;
                    }
                    l0Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new sg.p(this, 21));
                    if (!z11) {
                        this.n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && k0Var.e) {
                    long j12 = k0Var.g;
                    if (j12 > 0) {
                        this.Q += j12;
                        j();
                    }
                }
                if (k0Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (k0Var.a < ((k0) arrayList.get(size)).a) {
                            i12 = size + 1;
                            break;
                        }
                    }
                }
                i12 = 0;
                arrayList.add(i12, k0Var);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.c.canScrollVertically(1) || k0Var.a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = k0Var.a;
                    if (i16 > 0) {
                        this.F = i16;
                    }
                }
                invalidate();
                o1 o1Var = (o1) this;
                a aVar = o1Var.i0.X1;
                if (aVar != null) {
                    aVar.setCount(o1Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && k0Var.g > 0) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= this.T.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.T.get(i17)).peer_id) == k0Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i17);
                                break;
                            }
                            i17++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = UserConfig.getInstance(i14).getClientUserId() == k0Var.c;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(k0Var.c);
                        groupcalldonor.stars = 0L;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((l0) arrayList2.get(i18)).b == k0Var.c) {
                                ((l0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((l0) arrayList2.get(i18)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j13 = groupcalldonor.stars;
                    long j14 = k0Var.g;
                    long j15 = j13 + j14;
                    groupcalldonor.stars = j15;
                    i((int) j15, (int) j14, k0Var.c);
                }
                t();
                if (z11) {
                    u uVar = this.g0;
                    AndroidUtilities.cancelRunOnUIThread(uVar);
                    AndroidUtilities.runOnUIThread(uVar, 100L);
                }
                t0 t0Var = this.P;
                if (t0Var != null) {
                    t0Var.U = arrayList;
                    t0Var.V = arrayList2;
                    return;
                }
                return;
            }
            if (((k0) arrayList.get(i13)).a == i11) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void m() {
        int i10;
        t tVar = this.E;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            l0 l0Var = (l0) obj;
            ArrayList arrayList2 = l0Var.f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                k0 k0Var = (k0) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (k0Var.g > 0) {
                    i12 = Math.min(i12, k0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, o.b(l0Var.a, (int) k0Var.g, 0) + k0Var.d);
                } else {
                    i10 = i15;
                }
                arrayList = arrayList3;
                currentTime = i10;
            }
            j3 = Math.min(j3, Math.max(0, i13 - r19) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j3 >= Long.MAX_VALUE) {
            return;
        }
        t tVar2 = new t(this, 1);
        this.E = tVar2;
        AndroidUtilities.runOnUIThread(tVar2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i10;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.N;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j10 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i11).getInputPeer(j3);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: zh.s
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                m0 m0Var = m0.this;
                int i12 = newMessageId;
                if (!z11) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new uc(m0Var, i12, tL_error, j10, j3, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateMessageID.class);
                int size = findUpdatesAndRemove.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = findUpdatesAndRemove.get(i13);
                    i13++;
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                    if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                        int i14 = tL_updateMessageID.id;
                        ArrayList arrayList = m0Var.r;
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj2 = arrayList.get(i15);
                                i15++;
                                k0 k0Var = (k0) obj2;
                                if (k0Var.a == i12) {
                                    k0Var.a = i14;
                                    break;
                                }
                            }
                        }
                    }
                }
                MessagesController.getInstance(m0Var.N).processUpdates(updates, false);
            }
        });
        if (this.T != null && j10 > 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= this.T.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.T.get(i12)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i12);
                    break;
                }
                i12++;
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j10;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = MessagesController.getInstance(i11).getPeer(j3);
                groupcalldonor2.stars = j10;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j3 == this.M || f()) {
            i10 = newMessageId;
            z10 = true;
        } else {
            i10 = newMessageId;
            z10 = false;
        }
        l(currentTime, i10, z10, j3, tL_textWithEntities, j10, false);
        int i13 = i10;
        q(false, true);
        return i13;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j3) {
        return n(getDefaultPeerId(), tL_textWithEntities, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.O != null) {
            u uVar = this.V;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.O != null) {
            AndroidUtilities.cancelRunOnUIThread(this.V);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p() {
        pc pcVar = this.W;
        u uVar = this.d0;
        if (pcVar == null || !pcVar.l) {
            b bVar = new b();
            jc jcVar = new jc(getContext(), bVar);
            this.a0 = jcVar;
            jcVar.c(R.raw.stars_topup, new String[0]);
            this.a0.b.setText(getStarsToastTitle());
            nc ncVar = new nc(getContext(), bVar, true, false);
            this.b0 = ncVar;
            ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.b0.a = new t((o1) this, 0);
            ic icVar = new ic(getContext(), bVar);
            this.c0 = icVar;
            icVar.b = 5000L;
            icVar.setColor(bVar.F0(org.telegram.ui.ActionBar.j6.Gi));
            this.b0.addView(this.c0, w7.a6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.b0.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.a0.setButton(this.b0);
            pc f7 = pc.f(this.b, this.a0, -1);
            this.W = f7;
            f7.r = false;
            f7.k(true);
            this.W.v = uVar;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.a0.b.setText(getStarsToastTitle());
        this.a0.c.setText(getStarsToastSubtitle());
        this.c0.b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(uVar);
        AndroidUtilities.runOnUIThread(uVar, 5000L);
        long j3 = this.R;
        f1 f1Var = ((o1) this).i0.Z1;
        e1 e1Var = f1Var.a;
        e1Var.c(f1Var);
        if (e1Var.s) {
            e1Var.s = false;
            e1Var.a(1.0f, null);
        }
        ArrayList arrayList = e1Var.e;
        while (arrayList.size() > 4) {
            ((hj0) arrayList.remove(0)).C(true);
        }
        int[] iArr = e1Var.f;
        hj0 hj0Var = new hj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        hj0Var.v0 = e1Var;
        hj0Var.J(true);
        hj0Var.K(0);
        hj0Var.start();
        arrayList.add(hj0Var);
        e1Var.invalidate();
        org.telegram.ui.Components.n6 n6Var = e1Var.c;
        n6Var.b();
        n6Var.q(hc.b.l(j3, ',', new StringBuilder("+")), true, true);
        c1 c1Var = e1Var.d;
        AndroidUtilities.cancelRunOnUIThread(c1Var);
        AndroidUtilities.runOnUIThread(c1Var, 1500L);
        f1Var.getLocationInWindow(f1Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f1Var.y < 100) {
            f1Var.E += 0.5f;
        } else {
            f1Var.E = Utilities.clamp(1.0f - ((r10 - 100) / 200.0f), 1.0f, 0.0f) * f1Var.E;
            LaunchActivity.b0((f1Var.getWidth() / 2.0f) + r0[0], (f1Var.getHeight() / 2.0f) + r0[1], Utilities.clamp(f1Var.E, 0.9f, 0.3f));
            f1Var.E = 0.0f;
            f1Var.y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j3, TLRPC.InputGroupCall inputGroupCall) {
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.O;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.id) != (inputGroupCall != null ? inputGroupCall.id : 0L)) {
            this.r.clear();
            z10 = true;
            this.e.N(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.O;
        int i10 = this.N;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.M = j3;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.d0.run();
            u uVar = this.V;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(uVar);
                return z10;
            }
            uVar.run();
        }
        return z10;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.K - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.G = z10;
    }

    public void setLivePlayer(t0 t0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.P == null;
        this.P = t0Var;
        if (!z10 || t0Var == null || (arrayList = t0Var.U) == null || (arrayList2 = t0Var.V) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(t0Var.U);
        arrayList4.addAll(t0Var.V);
        this.e.N(true);
        ConnectionsManager.getInstance(this.N).getCurrentTime();
        Collections.sort(arrayList4, new sg.p(this, 21));
        this.n.N(true);
        u(false);
    }

    public final void t() {
        j0 j0Var;
        l0 l0Var;
        f0 f0Var;
        k0 k0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new sg.p(22));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = TLObject.FLAG_31;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) obj;
            int i14 = (int) groupcalldonor.stars;
            if (i14 != i11) {
                i12++;
                i11 = i14;
            }
            if (i12 > 3) {
                break;
            } else {
                hashMap.put(Long.valueOf(DialogObject.getPeerDialogId(groupcalldonor.peer_id)), Integer.valueOf(i12));
            }
        }
        int i15 = 0;
        while (true) {
            zp0 zp0Var = this.c;
            if (i15 >= zp0Var.getChildCount()) {
                break;
            }
            View childAt = zp0Var.getChildAt(i15);
            if ((childAt instanceof f0) && (k0Var = (f0Var = (f0) childAt).K) != null) {
                int e = e(k0Var.c);
                k0 k0Var2 = f0Var.K;
                if (e != k0Var2.h) {
                    k0Var2.h = e;
                    f0Var.set(k0Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            k0 k0Var3 = (k0) arrayList3.get(i16);
            int e7 = e(k0Var3.c);
            if (e7 != k0Var3.h) {
                k0Var3.h = e7;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            ic1 ic1Var = this.f;
            if (i17 >= ic1Var.getChildCount()) {
                break;
            }
            View childAt2 = ic1Var.getChildAt(i17);
            if ((childAt2 instanceof j0) && (l0Var = (j0Var = (j0) childAt2).f) != null) {
                int e10 = e(l0Var.b);
                l0 l0Var2 = j0Var.f;
                if (e10 != l0Var2.e) {
                    l0Var2.e = e10;
                    j0Var.set(l0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i10 >= arrayList4.size()) {
                return;
            }
            l0 l0Var3 = (l0) arrayList4.get(i10);
            int e11 = e(l0Var3.b);
            if (e11 != l0Var3.e) {
                l0Var3.e = e11;
            }
            i10++;
        }
    }

    public final void u(boolean z10) {
        ArrayList arrayList = this.s;
        if (z10 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        zp0 zp0Var = this.c;
        ic1 ic1Var = this.f;
        if (z10) {
            ViewPropertyAnimator translationY = zp0Var.animate().translationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f));
            wr wrVar = wr.h;
            translationY.setInterpolator(wrVar).setUpdateListener(new qg.o(this, 16)).setDuration(420L).start();
            ic1Var.animate().translationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.J ? 1.0f : 0.0f).setInterpolator(wrVar).setDuration(420L).start();
            return;
        }
        zp0Var.setTranslationY(!isEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        ic1Var.setTranslationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f));
        ic1Var.setAlpha(this.J ? 1.0f : 0.0f);
        invalidate();
    }
}
