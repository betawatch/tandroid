// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sz1 extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public ViewGroup E;
    public wq1 F;
    public da4 G;
    public boolean H;
    public boolean I;
    public ViewTreeObserver J;
    public final boolean a;
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final LongSparseArray e;
    public final go1 f;
    public na4 h;
    public final zg2 n;
    public zu1 r;
    public r47 s;
    public long w;
    public boolean x;
    public String y;

    public sz1(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new LongSparseArray();
        this.f = new go1(this, (byte) 18);
        this.n = new zg2((byte) 2);
        this.a = xea.c1;
    }

    public final void a(r47 r47Var, String str, String str2, String str3, boolean z) {
        r47 r47Var2 = r47Var;
        long[] g = (r47Var2 == null || r47.B0(r47Var2.k) != this.w) ? null : g(r47Var);
        if (g == null) {
            return;
        }
        long j = r47Var2.k.grouped_id;
        boolean z2 = true;
        int i = (int) g[1];
        zh6 zh6Var = this.r.P6;
        int i2 = i;
        for (int i3 = 0; j != 0 && i3 < zh6Var.m(); i3++) {
            m47 m47Var = (m47) zh6Var.n(i3);
            if (!m47Var.d.isEmpty() && ((r47) m47Var.d.get(0)).k.grouped_id == j) {
                i2 = Math.min(i2, d(m47Var));
            }
        }
        TLRPC.Chat M0 = uc7.s1(this.r.getCurrentAccount()).M0(Long.valueOf(-g[0]));
        long j2 = 0;
        long j3 = g[0];
        if (M0 != null && !M0.min) {
            j2 = M0.access_hash;
        }
        String str4 = this.y;
        ty0 ty0Var = this.r.yb;
        ha4 ha4Var = new ha4(j3, j2, i2, str, str2, str4, ty0Var != null ? ty0Var.a(i2, j) : null, ea4.g(this.r.getCurrentAccount()), Utilities.b.nextLong());
        if (!this.x) {
            ha4Var.k = this.w;
            ha4Var.l = r47Var2.e1();
        }
        if (!z) {
            r47Var2 = null;
        }
        this.s = r47Var2;
        na4 na4Var = this.h;
        boolean equals = str.equals("open_media");
        if (!z && (!PhotoViewer.C0() || !PhotoViewer.q0().V0())) {
            z2 = false;
        }
        na4Var.a(ha4Var, equals, z2);
        ea4.c(this.r.getCurrentAccount(), ha4Var, str3);
        h(100L);
    }

    public final void b(final r47 r47Var, String str) {
        final byte b = 0;
        final byte b2 = 1;
        final String b3 = vke.b(str, str != null && m01.h(str));
        if (b3 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            zg2 zg2Var = this.n;
            if (str == null || !str.equals((String) zg2Var.c) || uptimeMillis - zg2Var.b >= 1000) {
                zg2Var.c = str;
                zg2Var.b = uptimeMillis;
                if ("iv".equals(b3)) {
                    final String uri = m01.C(Uri.parse(str)).toString();
                    qx6 qx6Var = ea4.g;
                    Runnable runnable = new Runnable(this) { // from class: qz1
                        public final /* synthetic */ sz1 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (b) {
                                case 0:
                                    this.b.a(r47Var, "open_iv", null, uri, false);
                                    break;
                                default:
                                    this.b.a(r47Var, "open_link", uri, null, false);
                                    break;
                            }
                        }
                    };
                    qx6Var.b = str;
                    qx6Var.c = runnable;
                    return;
                }
                if (!"external".equals(b3)) {
                    a(r47Var, "open_link", b3, null, false);
                    return;
                }
                qx6 qx6Var2 = ea4.g;
                Runnable runnable2 = new Runnable(this) { // from class: qz1
                    public final /* synthetic */ sz1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b2) {
                            case 0:
                                this.b.a(r47Var, "open_iv", null, b3, false);
                                break;
                            default:
                                this.b.a(r47Var, "open_link", b3, null, false);
                                break;
                        }
                    }
                };
                qx6Var2.b = str;
                qx6Var2.c = runnable2;
            }
        }
    }

    public final void c(zu1 zu1Var, long j, ViewGroup viewGroup, wq1 wq1Var) {
        this.r = zu1Var;
        this.w = j;
        this.E = viewGroup;
        this.F = wq1Var;
        this.h = new na4(new su3((byte) 21), new y94(ea4.i(zu1Var.getCurrentAccount()), (byte) 0));
        boolean V = xc2.V(zu1Var.e);
        this.x = V;
        String str = j == yac.h(zu1Var.getCurrentAccount()).e() ? "saved" : j > 0 ? lbc.v(zu1Var.h()) ? "bot" : "chat" : V ? "channel" : zu1Var.v4 ? "discussion" : "group";
        this.y = str;
        if (str.equals("saved")) {
            return;
        }
        this.G = new da4(zu1Var.getCurrentAccount(), this.y);
    }

    public final int d(m47 m47Var) {
        ArrayList arrayList = m47Var.d;
        int size = arrayList.size();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            long[] g = g((r47) obj);
            if (g != null) {
                i = (int) Math.min(i, g[1]);
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [wb2] */
    public final void e() {
        LongSparseArray longSparseArray;
        int i;
        int i2;
        float f;
        View view;
        byte b;
        long e1;
        m47 m47Var;
        wb2 wb2Var;
        m47 m47Var2;
        int i3;
        m47 m47Var3;
        int i4;
        float[] fArr;
        float f2;
        int i5;
        int i6;
        int i7;
        wb2 wb2Var2;
        if (this.E == null || this.F == null || this.G == null) {
            return;
        }
        zu1 zu1Var = this.r;
        long[] jArr = null;
        if (zu1Var.yb != null) {
            int currentAccount = zu1Var.getCurrentAccount();
            zu1 zu1Var2 = this.r;
            ty0 ty0Var = zu1Var2.yb;
            if (ea4.a.a.get(Integer.valueOf(currentAccount)) != zu1Var2 || ea4.c > ty0Var.b) {
                this.r.yb = null;
            }
        }
        LongSparseArray longSparseArray2 = this.e;
        longSparseArray2.clear();
        int childCount = this.F.getChildCount();
        char c = 0;
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = this.F.getChildAt(i8);
            ?? r9 = childAt instanceof wb2 ? (wb2) childAt : jArr;
            r47 messageObject = r9 != 0 ? r9.getMessageObject() : jArr;
            long[] g = (messageObject == null || r47.B0(messageObject.k) != this.w) ? jArr : g(messageObject);
            if (g != null) {
                ViewGroup viewGroup = this.E;
                RectF rectF = this.d;
                if (yic.c(childAt, viewGroup, rectF)) {
                    long j = messageObject.k.grouped_id;
                    if (j != 0) {
                        view = childAt;
                        e1 = j;
                        f = 0.0f;
                        b = 1;
                    } else {
                        f = 0.0f;
                        view = childAt;
                        b = 1;
                        e1 = messageObject.e1();
                    }
                    rz1 rz1Var = (rz1) longSparseArray2.get(e1);
                    if (rz1Var == null) {
                        long e12 = j != 0 ? j : messageObject.e1();
                        rz1 rz1Var2 = new rz1();
                        longSparseArray2.put(e12, rz1Var2);
                        rz1Var2.a.set(rectF);
                        rz1Var2.c = j;
                        rz1Var2.d = g[c];
                        rz1Var2.e = messageObject.e1();
                        rz1Var = rz1Var2;
                    }
                    HashMap hashMap = rz1Var.j;
                    rz1Var.a.union(rectF);
                    rz1Var.f = (int) Math.min(rz1Var.f, g[b]);
                    m47 currentMessagesGroup = r9.getCurrentMessagesGroup();
                    j47 currentPosition = r9.getCurrentPosition();
                    if (j != 0) {
                        if (rz1Var.i == null) {
                            ArrayList arrayList = new ArrayList();
                            zh6 zh6Var = this.r.P6;
                            int i9 = 0;
                            wb2 wb2Var3 = r9;
                            while (i9 < zh6Var.m()) {
                                m47 m47Var4 = (m47) zh6Var.n(i9);
                                if (arrayList.contains(m47Var4) || m47Var4.d.isEmpty()) {
                                    i7 = childCount;
                                    wb2Var2 = wb2Var3;
                                } else {
                                    i7 = childCount;
                                    wb2Var2 = wb2Var3;
                                    if (((r47) m47Var4.d.get(0)).k.grouped_id == rz1Var.c) {
                                        arrayList.add(m47Var4);
                                    }
                                }
                                i9++;
                                childCount = i7;
                                wb2Var3 = wb2Var2;
                            }
                            i = childCount;
                            wb2Var = wb2Var3;
                            if (currentMessagesGroup != null && !currentMessagesGroup.d.isEmpty() && !arrayList.contains(currentMessagesGroup)) {
                                arrayList.add(currentMessagesGroup);
                            }
                            rz1Var.i = new float[0];
                            if (!arrayList.isEmpty()) {
                                Collections.sort(arrayList, new jz0(this, b));
                                rz1Var.f = Math.min(rz1Var.f, d((m47) arrayList.get(0)));
                                int size = arrayList.size();
                                int i10 = 0;
                                float f3 = 1.0f;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    ArrayList arrayList2 = ((m47) obj).e;
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        Object obj2 = arrayList2.get(i11);
                                        i11++;
                                        int i12 = size;
                                        float f4 = ((j47) obj2).s;
                                        if (f4 > f) {
                                            f3 = f4;
                                        }
                                        size = i12;
                                    }
                                }
                                int size3 = arrayList.size();
                                int i13 = 0;
                                while (i13 < size3) {
                                    Object obj3 = arrayList.get(i13);
                                    i13++;
                                    m47 m47Var5 = (m47) obj3;
                                    int length = rz1Var.i.length;
                                    hashMap.put(m47Var5, Integer.valueOf(length));
                                    ArrayList arrayList3 = m47Var5.e;
                                    if (arrayList3.isEmpty()) {
                                        i3 = size3;
                                        m47Var3 = currentMessagesGroup;
                                        float[] copyOf = Arrays.copyOf(rz1Var.i, length + 1);
                                        rz1Var.i = copyOf;
                                        r47 r47Var = (r47) m47Var5.d.get(0);
                                        if (r47Var.U2() || r47Var.I3()) {
                                            fArr = copyOf;
                                            i4 = i8;
                                            f2 = 100.0f;
                                        } else {
                                            fArr = copyOf;
                                            i4 = i8;
                                            TLRPC.PhotoSize w = xb4.w(r47Var.p0, hl.Y0(false), false, null, false);
                                            f2 = ((w == null || (i5 = w.w) <= 0 || (i6 = w.h) <= 0) ? 1.0f : Math.min(1.0f, (i6 * 0.98280096f) / i5)) * f3;
                                        }
                                        fArr[length] = f2;
                                    } else {
                                        i3 = size3;
                                        m47Var3 = currentMessagesGroup;
                                        i4 = i8;
                                    }
                                    int size4 = arrayList3.size();
                                    int i14 = 0;
                                    while (i14 < size4) {
                                        Object obj4 = arrayList3.get(i14);
                                        i14++;
                                        int i15 = ((j47) obj4).d + length;
                                        float[] fArr2 = rz1Var.i;
                                        int i16 = size4;
                                        if (i15 >= fArr2.length) {
                                            rz1Var.i = Arrays.copyOf(fArr2, i15 + 1);
                                        }
                                        size4 = i16;
                                    }
                                    int size5 = arrayList3.size();
                                    int i17 = 0;
                                    while (i17 < size5) {
                                        Object obj5 = arrayList3.get(i17);
                                        i17++;
                                        j47 j47Var = (j47) obj5;
                                        int i18 = j47Var.c;
                                        int i19 = size5;
                                        while (true) {
                                            if (i18 <= j47Var.d) {
                                                float[] fArr3 = rz1Var.i;
                                                int i20 = length + i18;
                                                float f5 = fArr3[i20];
                                                int i21 = i17;
                                                float f6 = j47Var.f;
                                                float f7 = j47Var.s;
                                                if (f7 <= f) {
                                                    f7 = 1.0f;
                                                }
                                                fArr3[i20] = Math.max(f5, (f7 * f6) / ((r2 - j47Var.c) + 1));
                                                i18++;
                                                i17 = i21;
                                            }
                                        }
                                        size5 = i19;
                                    }
                                    size3 = i3;
                                    currentMessagesGroup = m47Var3;
                                    i8 = i4;
                                }
                            }
                            m47Var = currentMessagesGroup;
                            i2 = i8;
                        } else {
                            i = childCount;
                            m47Var = currentMessagesGroup;
                            i2 = i8;
                            wb2Var = r9;
                        }
                        if (m47Var == null) {
                            int e13 = messageObject.e1();
                            Iterator it = hashMap.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    m47Var2 = null;
                                    break;
                                }
                                m47 m47Var6 = (m47) it.next();
                                ArrayList arrayList4 = m47Var6.d;
                                int size6 = arrayList4.size();
                                int i22 = 0;
                                while (i22 < size6) {
                                    Object obj6 = arrayList4.get(i22);
                                    i22++;
                                    if (((r47) obj6).e1() == e13) {
                                        m47Var2 = m47Var6;
                                        break;
                                    }
                                }
                            }
                        } else {
                            m47Var2 = m47Var;
                        }
                        Integer num = m47Var2 != null ? (Integer) hashMap.get(m47Var2) : null;
                        if (num != null && (currentPosition != null || m47Var2.e.isEmpty())) {
                            ImageReceiver photoImage = wb2Var.getPhotoImage();
                            boolean z = !m47Var2.i && !messageObject.U2() && !messageObject.I3() && photoImage.O0 > f && photoImage.M0 >= f && photoImage.x() <= ((float) view.getHeight());
                            float f8 = rectF.top;
                            if (z) {
                                f8 += photoImage.M0;
                            }
                            rz1Var.b.union(rectF.left, f8, rectF.right, z ? photoImage.O0 + f8 : rectF.bottom);
                            rz1Var.g = Math.min(rz1Var.g, num.intValue() + (currentPosition != null ? currentPosition.c : (byte) 0));
                            rz1Var.h = Math.max(rz1Var.h, num.intValue() + (currentPosition != null ? currentPosition.d : (byte) 0));
                        }
                        i8 = i2 + 1;
                        childCount = i;
                        jArr = null;
                        c = 0;
                    }
                }
            }
            i = childCount;
            i2 = i8;
            i8 = i2 + 1;
            childCount = i;
            jArr = null;
            c = 0;
        }
        ArrayList arrayList5 = new ArrayList();
        int i23 = 0;
        while (i23 < longSparseArray2.size()) {
            rz1 rz1Var3 = (rz1) longSparseArray2.valueAt(i23);
            int i24 = rz1Var3.h;
            RectF rectF2 = rz1Var3.a;
            if (i24 >= 0) {
                float f9 = rectF2.top;
                float f10 = rectF2.bottom;
                RectF rectF3 = rz1Var3.b;
                float f11 = rectF3.top;
                float f12 = rectF3.bottom;
                float[] fArr4 = rz1Var3.i;
                int i25 = rz1Var3.g;
                longSparseArray = longSparseArray2;
                float f13 = 0.0f;
                float f14 = 0.0f;
                float f15 = 0.0f;
                for (int i26 = 0; i26 < fArr4.length; i26++) {
                    if (i26 < i25) {
                        f14 += fArr4[i26];
                    } else if (i26 > i24) {
                        f15 += fArr4[i26];
                    } else {
                        f13 += fArr4[i26];
                    }
                }
                float f16 = f13 > 0.0f ? (f12 - f11) / f13 : 0.0f;
                float[] fArr5 = {Math.min(f9, f11 - (f14 * f16)), Math.max(f10, (f15 * f16) + f12)};
                rectF2.top = fArr5[0];
                rectF2.bottom = fArr5[1];
            } else {
                longSparseArray = longSparseArray2;
            }
            long j2 = rz1Var3.d;
            int i27 = rz1Var3.f;
            long j3 = rz1Var3.c;
            float f17 = rectF2.top;
            float f18 = rectF2.bottom;
            RectF rectF4 = this.c;
            float f19 = rectF4.top;
            float f20 = rectF4.bottom;
            ty0 ty0Var2 = this.r.yb;
            ga4 a = vke.a(j2, i27, j3, f17, f18, f19, f20, ty0Var2 != null ? ty0Var2.a(i27, j3) : null);
            if (a != null) {
                if (!this.x) {
                    a.a = this.w;
                    a.b = rz1Var3.e;
                }
                arrayList5.add(a);
            }
            i23++;
            longSparseArray2 = longSparseArray;
        }
        this.G.a.d(arrayList5);
        if (this.a) {
            invalidate();
        }
    }

    public final void f() {
        da4 da4Var = this.G;
        if (da4Var != null) {
            da4Var.a.e();
        }
        this.h.d(SystemClock.uptimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long[] g(r47 r47Var) {
        long j;
        TLRPC.MessageFwdHeader messageFwdHeader = r47Var.k.fwd_from;
        if (messageFwdHeader != null) {
            TLRPC.Peer peer = messageFwdHeader.from_id;
            if (peer instanceof TLRPC.TL_peerChannel) {
                j = peer.channel_id;
                if (r47Var.e1() > 0) {
                    boolean z = this.x;
                    long j2 = this.w;
                    int e1 = r47Var.e1();
                    int i = messageFwdHeader != null ? messageFwdHeader.channel_post : 0;
                    if (z) {
                        return new long[]{j2, e1};
                    }
                    if (j != 0 && i != 0) {
                        return new long[]{-j, i};
                    }
                }
                return null;
            }
        }
        j = 0;
        if (r47Var.e1() > 0) {
        }
        return null;
    }

    public final void h(long j) {
        if (this.I) {
            return;
        }
        this.I = true;
        hl.d3(this.f, j);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.J = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.J.addOnGlobalLayoutListener(this);
        this.J.addOnScrollChangedListener(this);
        h(100L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.J.removeOnPreDrawListener(this);
            this.J.removeOnGlobalLayoutListener(this);
            this.J.removeOnScrollChangedListener(this);
        }
        this.J = null;
        hl.r(this.f);
        this.I = false;
        da4 da4Var = this.G;
        if (da4Var != null) {
            da4Var.a.b(false);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.a) {
            return;
        }
        canvas.drawRect(this.c, aob.Im);
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.e;
            if (i >= longSparseArray.size()) {
                return;
            }
            canvas.drawRect(((rz1) longSparseArray.valueAt(i)).a, aob.Jm);
            i++;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.H = true;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.b;
        this.c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.H) {
            return true;
        }
        e();
        this.H = false;
        if (this.e.size() <= 0) {
            return true;
        }
        h(100L);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.H = true;
    }
}
