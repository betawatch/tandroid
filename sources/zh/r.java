package zh;

import ai.q1;
import ai.wa;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ei.k1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.r5;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public abstract class r extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final long[] K = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter L = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public boolean E;
    public boolean F;
    public final HashSet G;
    public final HashSet H;
    public ArrayList I;
    public boolean J;
    public final int a;
    public final c0 b;
    public final m c;
    public final s4.s d;
    public final k e;
    public final ll0 f;
    public final q h;
    public final ArrayList n;
    public int r;
    public int s;
    public boolean v;
    public final boolean w;
    public int x;
    public TLRPC.TL_messages_stickerSet y;

    public r(Context context, int i10, c0 c0Var) {
        super(context);
        d0 d0Var = (d0) this;
        k kVar = new k(d0Var);
        this.e = kVar;
        this.n = new ArrayList();
        this.r = 7;
        this.x = -1711276033;
        this.G = new HashSet();
        this.H = new HashSet();
        this.a = i10;
        this.b = c0Var;
        this.w = UserConfig.getInstance(i10).isPremium();
        m mVar = new m(context, null);
        this.c = mVar;
        s4.s sVar = new s4.s(this.r);
        this.d = sVar;
        sVar.O = new q1(d0Var, 9);
        mVar.setLayoutManager(sVar);
        ll0 ll0Var = new ll0(mVar, sVar);
        this.f = ll0Var;
        ll0Var.i = new k1(d0Var, 2);
        mVar.setAdapter(kVar);
        mVar.setSelectorDrawableColor(0);
        mVar.setOnItemClickListener(new wa(c0Var, 25));
        mVar.setItemAnimator(null);
        mVar.setOverScrollMode(2);
        mVar.setVerticalScrollBarEnabled(false);
        mVar.setClipToPadding(false);
        mVar.j(new kv(d0Var, 26));
        addView(mVar, z5.d(-1.0f, -1));
        q qVar = new q(d0Var, context);
        this.h = qVar;
        addView(qVar, z5.e(-1, 36, 48));
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
        return (drawable instanceof r5) && MessageObject.isTextColorEmoji(((r5) drawable).e);
    }

    public final ArrayList a() {
        if (this.I == null) {
            this.I = new ArrayList();
            for (String str : MessagesController.getMainSettings(this.a).getString("qrAppliedEmoji", "").split(",")) {
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad && objArr.length > 0) {
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
        ArrayList arrayList4;
        int i11;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList5;
        int i12 = this.a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        ArrayList<o> arrayList6 = this.n;
        arrayList6.clear();
        ArrayList arrayList7 = new ArrayList();
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
        int size = stickerSets.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i14 >= size) {
                break;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i14);
            i14++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set != null && tL_messages_stickerSet2.documents != null) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Document> arrayList9 = tL_messages_stickerSet2.documents;
                int size2 = arrayList9.size();
                int i15 = 0;
                while (i15 < size2) {
                    TLRPC.Document document2 = arrayList9.get(i15);
                    i15++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null && "application/x-tgsticker".equals(document3.mime_type)) {
                        arrayList8.add(document3);
                    }
                }
                if (!arrayList8.isEmpty()) {
                    arrayList7.add(new o(2, tL_messages_stickerSet2.set.title, arrayList8));
                }
            }
        }
        if (this.y == null && !this.E) {
            this.E = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, null, false, true, new g(this, 0));
            if (stickerSet != null && (arrayList5 = stickerSet.documents) != null && !arrayList5.isEmpty()) {
                this.y = stickerSet;
            }
        }
        ArrayList arrayList10 = new ArrayList(21);
        HashSet hashSet = this.H;
        hashSet.clear();
        if (this.y != null || this.F) {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.y;
            if (tL_messages_stickerSet3 != null && (arrayList3 = tL_messages_stickerSet3.documents) != null) {
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    TLRPC.Document document4 = arrayList3.get(i16);
                    i16++;
                    TLRPC.Document document5 = document4;
                    String str4 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.id), document5);
                    }
                    str = str4;
                }
            }
            str2 = str;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.y;
            if (tL_messages_stickerSet4 != null && (arrayList = tL_messages_stickerSet4.packs) != null) {
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
            while (i18 < 21) {
                long j12 = (i18 == 4 && j11 != j10 && hashMap.containsKey(Long.valueOf(j11))) ? j11 : K[i18];
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j12));
                if (document6 == null) {
                    document6 = r5.f(i12, j12);
                }
                if (document6 != null) {
                    arrayList10.add(document6);
                    hashSet.add(Long.valueOf(document6.id));
                } else if (this.G.add(Long.valueOf(j12))) {
                    r5.h(i12).b(j12, new o5() { // from class: zh.h
                        @Override // org.telegram.ui.Components.o5
                        public final void a(TLRPC.Document document7) {
                            AndroidUtilities.runOnUIThread(new uf.c(20, r.this, document7));
                        }
                    });
                }
                i18++;
            }
        } else {
            for (int i19 = 0; i19 < 21; i19++) {
                arrayList10.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        }
        if (!arrayList10.isEmpty()) {
            arrayList6.add(new o(0, LocaleController.getString(R.string.QrEmojiPresets), arrayList10));
        }
        ArrayList arrayList11 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        int i20 = this.r * 3;
        ArrayList a2 = a();
        int i21 = 0;
        while (i21 < a2.size() && arrayList11.size() < i20) {
            long longValue = ((Long) a2.get(i21)).longValue();
            int size5 = arrayList10.size();
            int i22 = i13;
            while (true) {
                if (i22 >= size5) {
                    arrayList4 = a2;
                    i11 = i21;
                    document = null;
                    break;
                }
                Object obj = arrayList10.get(i22);
                i22++;
                document = (TLRPC.Document) obj;
                arrayList4 = a2;
                i11 = i21;
                if (document.id == longValue) {
                    break;
                }
                a2 = arrayList4;
                i21 = i11;
            }
            if (document == null) {
                document = r5.f(i12, longValue);
            }
            if (document != null && str2.equals(document.mime_type) && hashSet2.add(Long.valueOf(document.id))) {
                arrayList11.add(document);
            }
            i21 = i11 + 1;
            a2 = arrayList4;
            i13 = 0;
        }
        int i23 = 0;
        while (true) {
            ArrayList<String> arrayList12 = Emoji.recentEmoji;
            if (i23 >= arrayList12.size() || arrayList11.size() >= i20) {
                break;
            }
            String str5 = arrayList12.get(i23);
            if (str5 != null && str5.startsWith("animated_")) {
                try {
                    TLRPC.Document f7 = r5.f(i12, Long.parseLong(str5.substring(9)));
                    if ((f7 != null && str2.equals(f7.mime_type)) && hashSet2.add(Long.valueOf(f7.id))) {
                        arrayList11.add(f7);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i23++;
        }
        if (arrayList11.isEmpty()) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList6.add(new o(1, LocaleController.getString(R.string.RecentlyUsed), arrayList11));
        }
        arrayList6.addAll(arrayList7);
        int size6 = arrayList6.size();
        int i24 = 0;
        int i25 = 0;
        while (i25 < size6) {
            o oVar = arrayList6.get(i25);
            i25++;
            o oVar2 = oVar;
            oVar2.d = i24;
            i24 += oVar2.c.size() + (oVar2.b != null ? i10 : 0);
        }
        this.s = i24;
        this.e.l();
        q qVar = this.h;
        qVar.setSections(arrayList6);
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
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m mVar = this.c;
        int max = Math.max(5, ((i10 - mVar.getPaddingLeft()) - mVar.getPaddingRight()) / AndroidUtilities.dp(46.0f));
        if (max != this.r) {
            this.r = max;
            this.d.y1(max);
            post(new tg.p(this, 22));
        }
    }

    public void setHeaderColor(int i10) {
        if (this.x == i10) {
            return;
        }
        this.x = i10;
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
