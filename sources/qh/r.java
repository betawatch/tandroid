package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jg.h1;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.web.v1;
import org.telegram.ui.x11;
import ph.x1;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class r extends FrameLayout implements us {
    public static final long[] K = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter L = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public TLRPC.TL_messages_stickerSet D;
    public boolean E;
    public boolean F;
    public final HashSet G;
    public final HashSet H;
    public ArrayList I;
    public boolean J;
    public final int a;
    public final f0 b;
    public final m c;
    public final s4.r d;
    public final k e;
    public final vj0 f;
    public final q h;
    public final ArrayList n;
    public int r;
    public int s;
    public boolean w;
    public final boolean x;
    public int y;

    public r(Context context, int i10, f0 f0Var) {
        super(context);
        g0 g0Var = (g0) this;
        k kVar = new k(g0Var);
        this.e = kVar;
        this.n = new ArrayList();
        this.r = 7;
        this.y = -1711276033;
        this.G = new HashSet();
        this.H = new HashSet();
        this.a = i10;
        this.b = f0Var;
        this.x = d20.i(i10).q();
        m mVar = new m(context, null);
        this.c = mVar;
        s4.r rVar = new s4.r(this.r);
        this.d = rVar;
        rVar.O = new h1(g0Var, 14);
        mVar.setLayoutManager(rVar);
        vj0 vj0Var = new vj0(mVar, rVar);
        this.f = vj0Var;
        vj0Var.i = new x11(g0Var, 1);
        mVar.setAdapter(kVar);
        mVar.setSelectorDrawableColor(0);
        mVar.setOnItemClickListener(new ag.y0(f0Var, 11));
        mVar.setItemAnimator(null);
        mVar.setOverScrollMode(2);
        mVar.setVerticalScrollBarEnabled(false);
        mVar.setClipToPadding(false);
        mVar.j(new bu0(g0Var, 15));
        addView(mVar, b6.c(-1.0f, -1));
        q qVar = new q(g0Var, context);
        this.h = qVar;
        addView(qVar, b6.e(-1, 36, 48));
        e();
    }

    public static void b(Canvas canvas, Drawable drawable) {
        boolean d = d(drawable);
        if (d) {
            drawable.setColorFilter(L);
        }
        drawable.draw(canvas);
        if (d) {
            drawable.setColorFilter(null);
        }
    }

    public static boolean d(Drawable drawable) {
        return (drawable instanceof f5) && jj.C4(((f5) drawable).e);
    }

    public final ArrayList a() {
        if (this.I == null) {
            this.I = new ArrayList();
            for (String str : vp.r1(this.a).f7.getString("qrAppliedEmoji", "").split(",")) {
                try {
                    if (!str.isEmpty()) {
                        this.I.add(Long.valueOf(Long.parseLong(str)));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return this.I;
    }

    public final int c() {
        int R;
        m mVar = this.c;
        int paddingTop = mVar.getPaddingTop();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = -1;
        for (int i12 = 0; i12 < mVar.getChildCount(); i12++) {
            View childAt = mVar.getChildAt(i12);
            this.d.getClass();
            int z10 = s4.n0.z(childAt);
            if (z10 >= paddingTop && z10 < i10 && (R = RecyclerView.R(childAt)) != -1) {
                i11 = R;
                i10 = z10;
            }
        }
        if (i11 != -1) {
            return i11;
        }
        return 0;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.x0 && objArr.length > 0) {
            Object obj = objArr[0];
            if ((obj instanceof Integer) && ((Integer) obj).intValue() != 5) {
                return;
            }
        }
        e();
    }

    public final void e() {
        String str;
        String str2;
        long j10;
        long j11;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        String str3;
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        int i10;
        HashSet hashSet;
        TLRPC.Document document;
        String str4;
        HashSet hashSet2;
        ArrayList<TLRPC.Document> arrayList4;
        int i11 = this.a;
        ui b02 = ui.b0(i11);
        ArrayList<o> arrayList5 = this.n;
        arrayList5.clear();
        ArrayList arrayList6 = new ArrayList();
        ArrayList s02 = b02.s0(5);
        int size = s02.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i13 >= size) {
                break;
            }
            Object obj = s02.get(i13);
            i13++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null && tL_messages_stickerSet.documents != null) {
                ArrayList arrayList7 = new ArrayList();
                ArrayList<TLRPC.Document> arrayList8 = tL_messages_stickerSet.documents;
                int size2 = arrayList8.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.Document document2 = arrayList8.get(i14);
                    i14++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null && "application/x-tgsticker".equals(document3.mime_type)) {
                        arrayList7.add(document3);
                    }
                }
                if (!arrayList7.isEmpty()) {
                    arrayList6.add(new o(2, tL_messages_stickerSet.set.title, arrayList7));
                }
            }
        }
        int i15 = 4;
        if (this.D == null && !this.E) {
            this.E = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet l02 = ui.b0(i11).l0(tL_inputStickerSetShortName, null, false, true, new ph.h1(this, i15));
            if (l02 != null && (arrayList4 = l02.documents) != null && !arrayList4.isEmpty()) {
                this.D = l02;
            }
        }
        ArrayList arrayList9 = new ArrayList(21);
        HashSet hashSet3 = this.H;
        hashSet3.clear();
        if (this.D != null || this.F) {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.D;
            if (tL_messages_stickerSet2 != null && (arrayList3 = tL_messages_stickerSet2.documents) != null) {
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    TLRPC.Document document4 = arrayList3.get(i16);
                    i16++;
                    TLRPC.Document document5 = document4;
                    String str5 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.id), document5);
                    }
                    str = str5;
                }
            }
            str2 = str;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.D;
            if (tL_messages_stickerSet3 != null && (arrayList = tL_messages_stickerSet3.packs) != null) {
                int size4 = arrayList.size();
                int i17 = 0;
                while (i17 < size4) {
                    TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i17);
                    i17++;
                    TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                    j10 = 0;
                    if (tL_stickerPack2 != null && (str3 = tL_stickerPack2.emoticon) != null && str3.replace("️", "").equals("❄") && (arrayList2 = tL_stickerPack2.documents) != null && !arrayList2.isEmpty()) {
                        j11 = tL_stickerPack2.documents.get(0).longValue();
                        break;
                    }
                }
            }
            j10 = 0;
            j11 = 0;
            int i18 = 0;
            for (int i19 = 21; i18 < i19; i19 = 21) {
                long j12 = (i18 == 4 && j11 != j10 && hashMap.containsKey(Long.valueOf(j11))) ? j11 : K[i18];
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j12));
                if (document6 == null) {
                    document6 = f5.e(i11, j12);
                }
                if (document6 != null) {
                    arrayList9.add(document6);
                    hashSet3.add(Long.valueOf(document6.id));
                } else if (this.G.add(Long.valueOf(j12))) {
                    f5.g(i11).b(j12, new c5() { // from class: qh.h
                        @Override // org.telegram.ui.Components.c5
                        public final void a(TLRPC.Document document7) {
                            org.telegram.messenger.i0.g3(new v1(12, r.this, document7));
                        }
                    });
                }
                i18++;
            }
        } else {
            for (int i20 = 0; i20 < 21; i20++) {
                arrayList9.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        }
        if (!arrayList9.isEmpty()) {
            arrayList5.add(new o(0, cd.L0(2131746512, null), arrayList9));
        }
        ArrayList arrayList10 = new ArrayList();
        HashSet hashSet4 = new HashSet();
        int i21 = this.r * 3;
        ArrayList a2 = a();
        int i22 = 0;
        while (i22 < a2.size() && arrayList10.size() < i21) {
            long longValue = ((Long) a2.get(i22)).longValue();
            int size5 = arrayList9.size();
            int i23 = i12;
            while (true) {
                if (i23 >= size5) {
                    hashSet = hashSet4;
                    document = null;
                    break;
                }
                Object obj2 = arrayList9.get(i23);
                i23++;
                document = (TLRPC.Document) obj2;
                hashSet = hashSet4;
                if (document.id == longValue) {
                    break;
                } else {
                    hashSet4 = hashSet;
                }
            }
            if (document == null) {
                document = f5.e(i11, longValue);
            }
            if (document != null) {
                str4 = str2;
                if (str4.equals(document.mime_type)) {
                    hashSet2 = hashSet;
                    if (hashSet2.add(Long.valueOf(document.id))) {
                        arrayList10.add(document);
                    }
                    i22++;
                    str2 = str4;
                    hashSet4 = hashSet2;
                    i12 = 0;
                }
            } else {
                str4 = str2;
            }
            hashSet2 = hashSet;
            i22++;
            str2 = str4;
            hashSet4 = hashSet2;
            i12 = 0;
        }
        HashSet hashSet5 = hashSet4;
        String str6 = str2;
        int i24 = 0;
        while (true) {
            ArrayList arrayList11 = k6.i;
            if (i24 >= arrayList11.size() || arrayList10.size() >= i21) {
                break;
            }
            String str7 = (String) arrayList11.get(i24);
            if (str7 != null && str7.startsWith("animated_")) {
                try {
                    TLRPC.Document e = f5.e(i11, Long.parseLong(str7.substring(9)));
                    if ((e != null && str6.equals(e.mime_type)) && hashSet5.add(Long.valueOf(e.id))) {
                        arrayList10.add(e);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i24++;
        }
        if (arrayList10.isEmpty()) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList5.add(new o(1, cd.L0(2131746376, null), arrayList10));
        }
        arrayList5.addAll(arrayList6);
        int size6 = arrayList5.size();
        int i25 = 0;
        int i26 = 0;
        while (i26 < size6) {
            o oVar = arrayList5.get(i26);
            i26++;
            o oVar2 = oVar;
            oVar2.d = i25;
            i25 += oVar2.c.size() + (oVar2.b != null ? i10 : 0);
        }
        this.s = i25;
        this.e.f();
        q qVar = this.h;
        qVar.setSections(arrayList5);
        qVar.a(f(c()), false);
    }

    public final int f(int i10) {
        ArrayList arrayList = this.n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o) arrayList.get(size)).d <= i10) {
                return size;
            }
        }
        return 0;
    }

    public m getGrid() {
        return this.c;
    }

    public q getTabs() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.a;
        zs.f(i10).c(this, zs.x0);
        zs.f(i10).c(this, zs.B0);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        zs.f(i10).n(this, zs.x0);
        zs.f(i10).n(this, zs.B0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m mVar = this.c;
        int max = Math.max(5, ((i10 - mVar.getPaddingLeft()) - mVar.getPaddingRight()) / org.telegram.messenger.i0.L(46.0f));
        if (max != this.r) {
            this.r = max;
            this.d.y1(max);
            post(new x1(this, 2));
        }
    }

    public void setHeaderColor(int i10) {
        if (this.y == i10) {
            return;
        }
        this.y = i10;
        int i11 = 0;
        while (true) {
            m mVar = this.c;
            if (i11 >= mVar.getChildCount()) {
                return;
            }
            View childAt = mVar.getChildAt(i11);
            if (childAt instanceof n) {
                ((n) childAt).a.setTextColor(i10);
            }
            i11++;
        }
    }
}
