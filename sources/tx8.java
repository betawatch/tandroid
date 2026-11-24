// default package

import android.app.Activity;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class tx8 extends FrameLayout implements jm7 {
    public static final long[] L = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter M = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public TLRPC.TL_messages_stickerSet E;
    public boolean F;
    public boolean G;
    public final HashSet H;
    public final HashSet I;
    public ArrayList J;
    public boolean K;
    public final int a;
    public final fy8 b;
    public final ox8 c;
    public final q55 d;
    public final mx8 e;
    public final cw6 f;
    public final sx8 h;
    public final ArrayList n;
    public int r;
    public int s;
    public boolean w;
    public final boolean x;
    public int y;

    public tx8(Activity activity, int i, fy8 fy8Var) {
        super(activity);
        gy8 gy8Var = (gy8) this;
        mx8 mx8Var = new mx8(gy8Var);
        this.e = mx8Var;
        this.n = new ArrayList();
        this.r = 7;
        this.y = -1711276033;
        this.H = new HashSet();
        this.I = new HashSet();
        this.a = i;
        this.b = fy8Var;
        this.x = z8c.h(i).p();
        ox8 ox8Var = new ox8(activity, null);
        this.c = ox8Var;
        q55 q55Var = new q55(this.r);
        this.d = q55Var;
        q55Var.O = new zr1(gy8Var, (byte) 13);
        ox8Var.setLayoutManager(q55Var);
        cw6 cw6Var = new cw6(ox8Var, q55Var);
        this.f = cw6Var;
        cw6Var.r = new qw3(gy8Var, (byte) 1);
        ox8Var.setAdapter(mx8Var);
        ox8Var.setSelectorDrawableColor(0);
        ox8Var.setOnItemClickListener(new kg4(fy8Var, (byte) 29));
        ox8Var.setItemAnimator(null);
        ox8Var.setOverScrollMode(2);
        ox8Var.setVerticalScrollBarEnabled(false);
        ox8Var.setClipToPadding(false);
        ox8Var.j(new so7(gy8Var, (byte) 8));
        addView(ox8Var, qoe.c(-1.0f, -1));
        sx8 sx8Var = new sx8(gy8Var, activity);
        this.h = sx8Var;
        addView(sx8Var, qoe.e(-1, 36, 48));
        e();
    }

    public static void b(Canvas canvas, Drawable drawable) {
        boolean d = d(drawable);
        if (d) {
            drawable.setColorFilter(M);
        }
        drawable.draw(canvas);
        if (d) {
            drawable.setColorFilter(null);
        }
    }

    public static boolean d(Drawable drawable) {
        return (drawable instanceof vm) && k47.B4(((vm) drawable).e);
    }

    public final ArrayList a() {
        if (this.J == null) {
            this.J = new ArrayList();
            for (String str : oc7.r1(this.a).X3.getString("qrAppliedEmoji", "").split(",")) {
                try {
                    if (!str.isEmpty()) {
                        this.J.add(Long.valueOf(Long.parseLong(str)));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return this.J;
    }

    public final int c() {
        int R;
        ox8 ox8Var = this.c;
        int paddingTop = ox8Var.getPaddingTop();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = -1;
        for (int i3 = 0; i3 < ox8Var.getChildCount(); i3++) {
            View childAt = ox8Var.getChildAt(i3);
            this.d.getClass();
            int y = f69.y(childAt);
            if (y >= paddingTop && y < i && (R = RecyclerView.R(childAt)) != -1) {
                i2 = R;
                i = y;
            }
        }
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.x0 && objArr.length > 0) {
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
        long j;
        long j2;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        int i;
        ArrayList arrayList4;
        int i2;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList5;
        int i3 = this.a;
        hs6 d0 = hs6.d0(i3);
        ArrayList<qx8> arrayList6 = this.n;
        arrayList6.clear();
        ArrayList arrayList7 = new ArrayList();
        ArrayList t0 = d0.t0(5);
        int size = t0.size();
        int i4 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i4 >= size) {
                break;
            }
            Object obj = t0.get(i4);
            i4++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null && tL_messages_stickerSet.documents != null) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Document> arrayList9 = tL_messages_stickerSet.documents;
                int size2 = arrayList9.size();
                int i5 = 0;
                while (i5 < size2) {
                    TLRPC.Document document2 = arrayList9.get(i5);
                    i5++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null && "application/x-tgsticker".equals(document3.mime_type)) {
                        arrayList8.add(document3);
                    }
                }
                if (!arrayList8.isEmpty()) {
                    arrayList7.add(new qx8(2, tL_messages_stickerSet.set.title, arrayList8));
                }
            }
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet m0 = hs6.d0(i3).m0(tL_inputStickerSetShortName, null, false, true, new ci7(this, (byte) 20));
            if (m0 != null && (arrayList5 = m0.documents) != null && !arrayList5.isEmpty()) {
                this.E = m0;
            }
        }
        ArrayList arrayList10 = new ArrayList(21);
        HashSet hashSet = this.I;
        hashSet.clear();
        if (this.E != null || this.G) {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.E;
            if (tL_messages_stickerSet2 != null && (arrayList3 = tL_messages_stickerSet2.documents) != null) {
                int size3 = arrayList3.size();
                int i6 = 0;
                while (i6 < size3) {
                    TLRPC.Document document4 = arrayList3.get(i6);
                    i6++;
                    TLRPC.Document document5 = document4;
                    String str3 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.id), document5);
                    }
                    str = str3;
                }
            }
            str2 = str;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.E;
            if (tL_messages_stickerSet3 != null && (arrayList = tL_messages_stickerSet3.packs) != null) {
                int size4 = arrayList.size();
                int i7 = 0;
                while (i7 < size4) {
                    TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i7);
                    i7++;
                    TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                    if (tL_stickerPack2 != null) {
                        j = 0;
                        String str4 = tL_stickerPack2.emoticon;
                        if (str4 != null && str4.replace("️", "").equals("❄") && (arrayList2 = tL_stickerPack2.documents) != null && !arrayList2.isEmpty()) {
                            j2 = tL_stickerPack2.documents.get(0).longValue();
                            break;
                        }
                    }
                }
            }
            j = 0;
            j2 = 0;
            int i8 = 0;
            while (i8 < 21) {
                long j3 = (i8 == 4 && j2 != j && hashMap.containsKey(Long.valueOf(j2))) ? j2 : L[i8];
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j3));
                if (document6 == null) {
                    document6 = vm.e(i3, j3);
                }
                if (document6 != null) {
                    arrayList10.add(document6);
                    hashSet.add(Long.valueOf(document6.id));
                } else if (this.H.add(Long.valueOf(j3))) {
                    vm.g(i3).b(j3, new a47(this, (byte) 1));
                }
                i8++;
            }
        } else {
            for (int i9 = 0; i9 < 21; i9++) {
                arrayList10.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        }
        if (!arrayList10.isEmpty()) {
            arrayList6.add(new qx8(0, jb6.M0(2131746230, null), arrayList10));
        }
        ArrayList arrayList11 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        int i10 = this.r * 3;
        ArrayList a = a();
        int i11 = 0;
        while (i11 < a.size() && arrayList11.size() < i10) {
            long longValue = ((Long) a.get(i11)).longValue();
            int size5 = arrayList10.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size5) {
                    arrayList4 = a;
                    i2 = i11;
                    document = null;
                    break;
                }
                Object obj2 = arrayList10.get(i12);
                i12++;
                document = (TLRPC.Document) obj2;
                arrayList4 = a;
                i2 = i11;
                if (document.id == longValue) {
                    break;
                }
                a = arrayList4;
                i11 = i2;
            }
            if (document == null) {
                document = vm.e(i3, longValue);
            }
            if (document != null && str2.equals(document.mime_type) && hashSet2.add(Long.valueOf(document.id))) {
                arrayList11.add(document);
            }
            i11 = i2 + 1;
            a = arrayList4;
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList12 = gw3.i;
            if (i13 >= arrayList12.size() || arrayList11.size() >= i10) {
                break;
            }
            String str5 = (String) arrayList12.get(i13);
            if (str5 != null && str5.startsWith("animated_")) {
                try {
                    TLRPC.Document e = vm.e(i3, Long.parseLong(str5.substring(9)));
                    if ((e != null && str2.equals(e.mime_type)) && hashSet2.add(Long.valueOf(e.id))) {
                        arrayList11.add(e);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i13++;
        }
        if (arrayList11.isEmpty()) {
            i = 1;
        } else {
            i = 1;
            arrayList6.add(new qx8(1, jb6.M0(2131746094, null), arrayList11));
        }
        arrayList6.addAll(arrayList7);
        int size6 = arrayList6.size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size6) {
            qx8 qx8Var = arrayList6.get(i14);
            i14++;
            qx8 qx8Var2 = qx8Var;
            qx8Var2.d = i15;
            i15 += qx8Var2.c.size() + (qx8Var2.b != null ? i : 0);
        }
        this.s = i15;
        this.e.f();
        sx8 sx8Var = this.h;
        sx8Var.setSections(arrayList6);
        sx8Var.a(f(c()), false);
    }

    public final int f(int i) {
        ArrayList arrayList = this.n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((qx8) arrayList.get(size)).d <= i) {
                return size;
            }
        }
        return 0;
    }

    public ox8 getGrid() {
        return this.c;
    }

    public sx8 getTabs() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        nm7.f(i).b(this, nm7.x0);
        nm7.f(i).b(this, nm7.B0);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        nm7.f(i).n(this, nm7.x0);
        nm7.f(i).n(this, nm7.B0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ox8 ox8Var = this.c;
        int max = Math.max(5, ((i - ox8Var.getPaddingLeft()) - ox8Var.getPaddingRight()) / gm.L(46.0f));
        if (max != this.r) {
            this.r = max;
            this.d.x1(max);
            post(new jx8(this));
        }
    }

    public void setHeaderColor(int i) {
        if (this.y == i) {
            return;
        }
        this.y = i;
        int i2 = 0;
        while (true) {
            ox8 ox8Var = this.c;
            if (i2 >= ox8Var.getChildCount()) {
                return;
            }
            View childAt = ox8Var.getChildAt(i2);
            if (childAt instanceof px8) {
                ((px8) childAt).a.setTextColor(i);
            }
            i2++;
        }
    }
}
