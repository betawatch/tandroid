// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.io.File;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class pi9 extends q9c {
    public static final ArrayList A4 = new ArrayList();
    public boolean A3;
    public float B3;
    public float C3;
    public float D3;
    public float E3;
    public View F3;
    public m72 G3;
    public boolean H3;
    public boolean I3;
    public boolean J3;
    public boolean K3;
    public TL_iv.pageTableCell L3;
    public TL_iv.pageTableCell M3;
    public long N3;
    public float O3;
    public float P3;
    public boolean Q3;
    public ch9 R3;
    public int S3;
    public dg9 T3;
    public final o72 U3;
    public ArrayList V3;
    public int W3;
    public int X3;
    public int Y3;
    public boolean Z3;
    public mk0 a4;
    public boolean b4;
    public final hi9 c4;
    public final nh9 d4;
    public final ii9 e4;
    public final ji9 f4;
    public final ki9 g4;
    public final IdentityHashMap h4;
    public final IdentityHashMap i4;
    public mk0 j4;
    public mk0 k4;
    public final li9 l4;
    public final vh9 m4;
    public final int n3;
    public final wh9 n4;
    public final vnb o3;
    public final xh9 o4;
    public final ni9 p3;
    public final yh9 p4;
    public r47 q3;
    public xl9 q4;
    public boolean r3;
    public fu5 r4;
    public TL_iv.RichMessage s3;
    public int s4;
    public final ArrayList t3;
    public int t4;
    public final HashMap u3;
    public final oh9 u4;
    public final di9 v3;
    public final zh9 v4;
    public final lmb w3;
    public final k09 w4;
    public int x3;
    public final ArrayList x4;
    public int y3;
    public ab9 y4;
    public int z3;
    public int z4;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pi9(Context context, int i, vnb vnbVar, ni9 ni9Var) {
        super(context, i, 0, false, new hj8(r2, (byte) 12), new ye9(r2, r12), null, vnbVar);
        byte b = 3;
        this.r3 = true;
        this.t3 = new ArrayList();
        this.u3 = new HashMap();
        this.x3 = -1;
        this.y3 = -1;
        this.z3 = 0;
        this.U3 = new o72(this, b);
        this.Z3 = true;
        this.c4 = new hi9(this);
        this.d4 = new nh9(this);
        this.e4 = new ii9(this);
        this.f4 = new ji9(this);
        this.g4 = new ki9(this);
        this.h4 = new IdentityHashMap();
        this.i4 = new IdentityHashMap();
        this.l4 = new li9(this);
        this.m4 = new vh9(this);
        this.n4 = new wh9(this);
        this.o4 = new xh9(this);
        this.p4 = new yh9(this);
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = new oh9(this);
        this.v4 = new zh9(this);
        k09 k09Var = new k09(this, (byte) 4);
        this.w4 = k09Var;
        this.x4 = new ArrayList();
        this.z4 = -1;
        pi9[] pi9VarArr = {this};
        this.n3 = i;
        this.o3 = vnbVar;
        this.p3 = ni9Var;
        this.g3.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        F1(new hj8(this, (byte) 13), false);
        setReorderLongPressEnabled(false);
        A1(true);
        di9 di9Var = new di9(this, ni9Var);
        this.v3 = di9Var;
        di9Var.Q(this);
        di9Var.z0 = this.f3;
        lmb m = di9Var.m(context);
        this.w3 = m;
        hl.B2(m);
        di9Var.D = new fi9(this, ni9Var);
        j(new bj1(this, ni9Var, (byte) 11));
        this.R3 = new ch9(k09Var);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || y3(pageBlock);
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockButtonRow) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    public static boolean C3(mk0 mk0Var) {
        return mk0Var != null && !mk0Var.i && !u3(mk0Var) && (mk0Var.b instanceof TL_iv.pageBlockParagraph) && mk0Var.c == 0 && mk0Var.d == 0 && !mk0Var.e && mk0Var.k.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void G2(mk0 mk0Var, ArrayList arrayList) {
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        TL_iv.PageBlock pageBlock = mk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            p07 p07Var = mk0Var.g;
            if (p07Var == null || !p07Var.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock2 = mk0Var.b;
            if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                if (pageBlock2.caption == null) {
                    pageBlock2.caption = new TL_iv.PageCaption();
                    mk0Var.b.caption.text = new TL_iv.textEmpty();
                    mk0Var.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(mk0Var.b);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            p07 p07Var2 = mk0Var.g;
            if (p07Var2 == null || !p07Var2.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock3 = mk0Var.b;
            if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                if (pageBlock3.caption == null) {
                    pageBlock3.caption = new TL_iv.PageCaption();
                    mk0Var.b.caption.text = new TL_iv.textEmpty();
                    mk0Var.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(mk0Var.b);
                return;
            }
            return;
        }
        boolean y3 = y3(pageBlock);
        TL_iv.PageBlock pageBlock4 = mk0Var.b;
        if (y3) {
            ArrayList d3 = d3(pageBlock4);
            List O3 = O3(mk0Var);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i = 0; d3 != null && i < d3.size() && i < O3.size(); i++) {
                TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) d3.get(i);
                if (((p07) O3.get(i)).b()) {
                    if ((pageBlock5 instanceof TL_iv.pageBlockPhoto ? ((TL_iv.pageBlockPhoto) pageBlock5).photo_id : pageBlock5 instanceof TL_iv.pageBlockVideo ? ((TL_iv.pageBlockVideo) pageBlock5).video_id : 0L) != 0) {
                        if9.d(pageBlock5);
                        arrayList2.add(pageBlock5);
                    }
                }
            }
            if (arrayList2.size() < 2) {
                if (arrayList2.size() == 1) {
                    arrayList.add(arrayList2.get(0));
                    return;
                }
                return;
            }
            if (mk0Var.b instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                pageblockslideshow.items = arrayList2;
                pageblockslideshow.caption = mk0Var.b.caption;
                pageblockcollage = pageblockslideshow;
            } else {
                TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                pageblockcollage2.items = arrayList2;
                pageblockcollage2.caption = mk0Var.b.caption;
                pageblockcollage = pageblockcollage2;
            }
            if9.d(pageblockcollage);
            arrayList.add(pageblockcollage);
            return;
        }
        if (pageBlock4 instanceof TL_iv.pageBlockAudio) {
            p07 p07Var3 = mk0Var.g;
            if (p07Var3 == null || !p07Var3.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock6 = mk0Var.b;
            if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                if (pageBlock6.caption == null) {
                    pageBlock6.caption = new TL_iv.PageCaption();
                    mk0Var.b.caption.text = new TL_iv.textEmpty();
                    mk0Var.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(mk0Var.b);
                return;
            }
            return;
        }
        if (pageBlock4 instanceof TL_iv.pageBlockDocument) {
            p07 p07Var4 = mk0Var.g;
            if (p07Var4 != null && (document = p07Var4.h) != null) {
                ((TL_iv.pageBlockDocument) pageBlock4).document_id = document.id;
            }
            if (p07Var4 == null || !p07Var4.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = mk0Var.b;
            if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                if9.d(pageBlock7);
                arrayList.add(mk0Var.b);
                return;
            }
            return;
        }
        if (pageBlock4 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock4;
            int i2 = gj9.N;
            if (pageblockmap.geo instanceof TLRPC.TL_geoPoint) {
                if (pageblockmap.caption == null) {
                    TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                    pageblockmap.caption = pageCaption;
                    pageCaption.text = new TL_iv.textEmpty();
                    pageblockmap.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(pageblockmap);
                return;
            }
            return;
        }
        if (pageBlock4 instanceof TL_iv.pageBlockMath) {
            if (TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock4).source)) {
                return;
            }
            arrayList.add(mk0Var.b);
            return;
        }
        if (!(pageBlock4 instanceof TL_iv.pageBlockTable)) {
            if (!(pageBlock4 instanceof TL_iv.pageBlockButtonRow)) {
                arrayList.add(pageBlock4);
                return;
            }
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock4;
            ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(pageblockbuttonrow);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock4;
        if (pageblocktable.title == null) {
            pageblocktable.title = new TL_iv.textEmpty();
        }
        if (pageblocktable.rows != null) {
            for (int i3 = 0; i3 < pageblocktable.rows.size(); i3++) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i3);
                if (pagetablerow.cells != null) {
                    for (int i4 = 0; i4 < pagetablerow.cells.size(); i4++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i4);
                        if (pagetablecell.text == null) {
                            ajb.c(pagetablecell, "");
                        } else {
                            pagetablecell.flags |= 128;
                        }
                        int i5 = pagetablecell.colspan;
                        int i6 = pagetablecell.flags;
                        int i7 = i5 > 1 ? i6 | 2 : i6 & (-3);
                        pagetablecell.flags = i7;
                        pagetablecell.flags = pagetablecell.rowspan > 1 ? i7 | 4 : i7 & (-5);
                    }
                }
            }
        }
        if (S4(pageblocktable)) {
            arrayList.add(pageblocktable);
        }
    }

    public static boolean H2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static void I2(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.text == null) {
                pageBlock.text = new TL_iv.textEmpty();
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (pageblockpreformatted.language == null) {
                    pageblockpreformatted.language = "";
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.caption == null) {
                    pageblockpullquote.caption = new TL_iv.textEmpty();
                }
            }
        }
    }

    public static void K2(ArrayList arrayList, ArrayList arrayList2, int i, boolean z, int i2, boolean z2, boolean z3) {
        boolean z4 = false;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i3);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z4) {
                        P1(arrayList, null, i, i2, z2, z3);
                        z4 = true;
                    }
                    L2(arrayList, pageBlock, i + 1);
                } else if (z4) {
                    arrayList.add(new mk0(pageBlock, i, z ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        P1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i, i2, z2, z3);
                    } else {
                        mk0 mk0Var = new mk0(pageBlock, i, i2);
                        mk0Var.e = z2;
                        mk0Var.f = z3;
                        arrayList.add(mk0Var);
                    }
                    z4 = true;
                }
            }
        }
        if (z4) {
            return;
        }
        P1(arrayList, null, i, i2, z2, z3);
    }

    public static TL_iv.PageBlock K3(mk0 mk0Var, p07 p07Var) {
        boolean y3 = y3(mk0Var.b);
        TL_iv.PageBlock pageBlock = mk0Var.b;
        if (!y3) {
            return pageBlock;
        }
        ArrayList d3 = d3(pageBlock);
        ArrayList arrayList = mk0Var.h;
        int indexOf = arrayList != null ? arrayList.indexOf(p07Var) : -1;
        if (indexOf < 0 || d3 == null || indexOf >= d3.size()) {
            return null;
        }
        return (TL_iv.PageBlock) d3.get(indexOf);
    }

    public static void L2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i) {
        int i2 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i2 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i2);
                i2++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    P1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    K2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i, false, 0, pageListItem2.checkbox, pageListItem2.checked);
                }
            }
            return;
        }
        ArrayList<TL_iv.PageListOrderedItem> arrayList3 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
        int size2 = arrayList3.size();
        int i3 = 1;
        while (i2 < size2) {
            TL_iv.PageListOrderedItem pageListOrderedItem = arrayList3.get(i2);
            i2++;
            TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
            if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                P1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i, i3, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i4 = i3;
                K2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i, true, i4, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                i3 = i4;
            }
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0126, code lost:
    
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        r22.L();
        r12 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void L3(pi9[] pi9VarArr, ArrayList arrayList, l9c l9cVar) {
        int i;
        boolean z;
        ArrayList arrayList2;
        int i2;
        boolean z2;
        int i3;
        pi9 pi9Var = pi9VarArr[0];
        if (pi9Var != null) {
            ArrayList arrayList3 = pi9Var.t3;
            pi9Var.W1();
            ArrayList arrayList4 = pi9Var.x4;
            arrayList4.clear();
            HashMap hashMap = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = 1;
                if (i4 >= arrayList3.size()) {
                    break;
                }
                mk0 mk0Var = (mk0) arrayList3.get(i4);
                boolean z3 = mk0Var.i;
                ArrayList arrayList5 = mk0Var.k;
                if (!z3) {
                    for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                        Map.-EL.merge(hashMap, (Long) arrayList5.get(i6), 1, new yz0((byte) 1));
                    }
                    if (mk0Var.b instanceof TL_iv.pageBlockParagraph) {
                        i5++;
                    }
                }
                i4++;
            }
            boolean z4 = i5 == 1;
            ArrayList arrayList6 = new ArrayList();
            int i7 = -1;
            int i8 = 0;
            int i9 = 0;
            int i10 = -1;
            mk0 mk0Var2 = null;
            while (i8 < arrayList3.size()) {
                mk0 mk0Var3 = (mk0) arrayList3.get(i8);
                boolean z5 = mk0Var3.i;
                ArrayList arrayList7 = mk0Var3.k;
                if (z5) {
                    int i11 = i10 != i7 ? i : 0;
                    if (!arrayList6.isEmpty()) {
                        qd4.v(i, arrayList6);
                    }
                    if (i10 == i7 || arrayList6.size() >= i10) {
                        if (i11 == 0) {
                            if (i9 != 0) {
                                l9cVar.L();
                                i9 = 0;
                            }
                            int i12 = sf9.b;
                            b8c K = b8c.K(sf9.class);
                            K.H = mk0Var3;
                            arrayList.add(K);
                            arrayList4.add(mk0Var3);
                        }
                        z = z4;
                        arrayList2 = arrayList6;
                        i2 = i;
                    } else {
                        z = z4;
                        arrayList2 = arrayList6;
                        i2 = i;
                        i10 = i7;
                    }
                } else {
                    int i13 = i10 != i7 ? i : 0;
                    if (u3(mk0Var3)) {
                        if (i13 == 0) {
                            boolean z6 = ((TL_iv.pageBlockDetails) mk0Var3.b).open;
                            if (!arrayList6.isEmpty() || z6) {
                                if (i9 != 0) {
                                    l9cVar.L();
                                    i9 = 0;
                                }
                            } else if (i9 == 0) {
                                l9cVar.M();
                                i9 = i;
                            }
                            yh9 yh9Var = pi9Var.p4;
                            int i14 = qf9.b;
                            b8c K2 = b8c.K(qf9.class);
                            K2.H = mk0Var3;
                            K2.I = yh9Var;
                            arrayList.add(K2);
                            arrayList4.add(mk0Var3);
                            if (!z6) {
                                i10 = arrayList6.size() + 1;
                            }
                        }
                        arrayList6.add(mk0Var3);
                    } else if (i13 == 0) {
                        if (mk0Var2 != null) {
                            ArrayList arrayList8 = mk0Var2.k;
                            int size = arrayList8.size();
                            int i15 = 0;
                            while (true) {
                                z = z4;
                                if (i15 >= size || i15 >= arrayList7.size()) {
                                    break;
                                }
                                arrayList2 = arrayList6;
                                if (!((Long) arrayList8.get(i15)).equals(arrayList7.get(i15))) {
                                    break;
                                }
                                i15++;
                                z4 = z;
                                arrayList6 = arrayList2;
                            }
                            int i16 = size - 1;
                            while (i16 >= i15) {
                                Long l = (Long) arrayList8.get(i16);
                                l.getClass();
                                Integer num = (Integer) hashMap.get(l);
                                if (num != null) {
                                    i3 = i15;
                                    if (num.intValue() >= 2 || i16 > 0 || pi9Var.u3.containsKey(l)) {
                                    }
                                } else {
                                    i3 = i15;
                                }
                                i16--;
                                i15 = i3;
                            }
                        } else {
                            z = z4;
                            arrayList2 = arrayList6;
                        }
                        if (mk0Var2 != null) {
                            pi9Var.p3(mk0Var2, arrayList7, hashMap, arrayList);
                        }
                        if (arrayList2.isEmpty()) {
                            if (i9 == 0) {
                                l9cVar.M();
                                i9 = 1;
                            }
                        } else if (i9 != 0) {
                            l9cVar.L();
                            i9 = 0;
                        }
                        TL_iv.PageBlock pageBlock = mk0Var3.b;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            nh9 nh9Var = pi9Var.d4;
                            int i17 = uf9.b;
                            b8c K3 = b8c.K(uf9.class);
                            K3.H = mk0Var3;
                            K3.I = nh9Var;
                            arrayList.add(K3);
                        } else if (A3(pageBlock)) {
                            ii9 ii9Var = pi9Var.e4;
                            int i18 = lj9.b;
                            b8c K4 = b8c.K(lj9.class);
                            K4.d = (int) mk0Var3.a;
                            K4.H = mk0Var3;
                            K4.I = ii9Var;
                            arrayList.add(K4);
                        } else {
                            TL_iv.PageBlock pageBlock2 = mk0Var3.b;
                            if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                ji9 ji9Var = pi9Var.f4;
                                int i19 = we9.b;
                                b8c K5 = b8c.K(we9.class);
                                K5.H = mk0Var3;
                                K5.I = ji9Var;
                                arrayList.add(K5);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                ki9 ki9Var = pi9Var.g4;
                                int i20 = wf9.b;
                                b8c K6 = b8c.K(wf9.class);
                                K6.H = mk0Var3;
                                K6.I = ki9Var;
                                arrayList.add(K6);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                li9 li9Var = pi9Var.l4;
                                int i21 = fj9.b;
                                b8c K7 = b8c.K(fj9.class);
                                K7.H = mk0Var3;
                                K7.I = li9Var;
                                arrayList.add(K7);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                vh9 vh9Var = pi9Var.m4;
                                int i22 = hj9.b;
                                b8c K8 = b8c.K(hj9.class);
                                K8.H = mk0Var3;
                                K8.I = vh9Var;
                                arrayList.add(K8);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                xh9 xh9Var = pi9Var.o4;
                                int i23 = vl9.b;
                                b8c K9 = b8c.K(vl9.class);
                                K9.H = mk0Var3;
                                K9.I = xh9Var;
                                arrayList.add(K9);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                hi9 hi9Var = pi9Var.c4;
                                int i24 = ef9.b;
                                b8c K10 = b8c.K(ef9.class);
                                K10.H = mk0Var3;
                                K10.I = hi9Var;
                                arrayList.add(K10);
                            } else {
                                mk0Var3.p = i8 == 0;
                                mk0Var3.q = z && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                if (arrayList3.size() == 2) {
                                    i2 = 1;
                                    if (i8 == 1 && (mk0Var3.b instanceof TL_iv.pageBlockParagraph) && (((mk0) arrayList3.get(0)).b instanceof TL_iv.pageBlockHeading1)) {
                                        z2 = true;
                                        zh9 zh9Var = pi9Var.v4;
                                        int i25 = im9.b;
                                        b8c K11 = b8c.K(im9.class);
                                        K11.H = mk0Var3;
                                        K11.I = zh9Var;
                                        K11.s = z2;
                                        arrayList.add(K11);
                                        arrayList4.add(mk0Var3);
                                        mk0Var2 = mk0Var3;
                                    }
                                } else {
                                    i2 = 1;
                                }
                                z2 = false;
                                zh9 zh9Var2 = pi9Var.v4;
                                int i252 = im9.b;
                                b8c K112 = b8c.K(im9.class);
                                K112.H = mk0Var3;
                                K112.I = zh9Var2;
                                K112.s = z2;
                                arrayList.add(K112);
                                arrayList4.add(mk0Var3);
                                mk0Var2 = mk0Var3;
                            }
                        }
                        i2 = 1;
                        arrayList4.add(mk0Var3);
                        mk0Var2 = mk0Var3;
                    }
                    z = z4;
                    arrayList2 = arrayList6;
                    i2 = i;
                }
                i8++;
                i = i2;
                z4 = z;
                arrayList6 = arrayList2;
                i7 = -1;
            }
            int i26 = i;
            if (i9 != 0) {
                l9cVar.L();
            }
            if (mk0Var2 != null) {
                pi9Var.p3(mk0Var2, A4, hashMap, arrayList);
            }
            int i27 = 0;
            while (i27 < arrayList4.size()) {
                mk0 mk0Var4 = (mk0) arrayList4.get(i27);
                mk0Var4.n = false;
                mk0Var4.o = false;
                mk0Var4.l = 0;
                mk0Var4.m = 0;
                int size2 = mk0Var4.k.size();
                if (size2 != 0) {
                    mk0 mk0Var5 = i27 > 0 ? (mk0) arrayList4.get(i27 - 1) : null;
                    int i28 = i27 + 1;
                    mk0 mk0Var6 = i28 < arrayList4.size() ? (mk0) arrayList4.get(i28) : null;
                    mk0Var4.l = size2 - n4(mk0Var4, mk0Var5);
                    int n4 = size2 - n4(mk0Var4, mk0Var6);
                    mk0Var4.m = n4;
                    mk0Var4.n = mk0Var4.l > 0 ? i26 : 0;
                    mk0Var4.o = n4 > 0 ? i26 : 0;
                }
                i27++;
            }
        }
    }

    public static List O3(mk0 mk0Var) {
        if (mk0Var == null) {
            return Collections.EMPTY_LIST;
        }
        if (y3(mk0Var.b)) {
            ArrayList arrayList = mk0Var.h;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        p07 p07Var = mk0Var.g;
        return p07Var != null ? Collections.singletonList(p07Var) : Collections.EMPTY_LIST;
    }

    public static void P1(ArrayList arrayList, TL_iv.RichText richText, int i, int i2, boolean z, boolean z2) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        mk0 mk0Var = new mk0(pageblockparagraph, i, i2);
        mk0Var.e = z;
        mk0Var.f = z2;
        arrayList.add(mk0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dg9 P3(View view) {
        if (view instanceof km9) {
            return ((km9) view).getEditText();
        }
        if (view instanceof jf9) {
            return ((jf9) view).getCaptionEditText();
        }
        if (view instanceof rf9) {
            return ((rf9) view).getEditText();
        }
        return null;
    }

    public static TL_iv.PageBlock Q3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return new TL_iv.pageBlockHeading1();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return new TL_iv.pageBlockHeading2();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return new TL_iv.pageBlockHeading3();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return new TL_iv.pageBlockHeading4();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return new TL_iv.pageBlockHeading5();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return new TL_iv.pageBlockHeading6();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return new TL_iv.pageBlockBlockquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return new TL_iv.pageBlockPullquote();
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            return pageBlock instanceof TL_iv.pageBlockFooter ? new TL_iv.pageBlockFooter() : new TL_iv.pageBlockParagraph();
        }
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.language = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        return pageblockpreformatted;
    }

    public static xl9 R2(dg9 dg9Var) {
        for (ViewParent parent = dg9Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof xl9) {
                return (xl9) parent;
            }
        }
        return null;
    }

    public static p07 R3(no6 no6Var, String str) {
        p07 p07Var = new p07();
        p07Var.b = no6Var.b;
        p07Var.e = str;
        p07Var.j = no6Var.F;
        p07Var.k = no6Var.G;
        String str2 = no6Var.h;
        boolean z = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        p07Var.l = z ? 0 : no6Var.J;
        p07Var.m = z ? 0 : no6Var.K;
        p07Var.a = (byte) 1;
        p07Var.f = 0.0f;
        return p07Var;
    }

    public static boolean S4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(mm9.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                if (!ajb.g(pagetablerow.cells.get(i2)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void T2(ArrayList arrayList, ArrayList arrayList2, java.util.Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    L2(arrayList, pageBlock, 1);
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                    if (pageblockdetails.title == null) {
                        pageblockdetails.title = new TL_iv.textEmpty();
                    }
                    arrayList.add(new mk0(pageblockdetails, 0, 0));
                    int size2 = arrayList.size();
                    T2(arrayList, pageblockdetails.blocks, map);
                    if (arrayList.size() == size2) {
                        arrayList.add(new mk0(new TL_iv.pageBlockParagraph(), 0, 0));
                    }
                    mk0 mk0Var = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                    mk0Var.i = true;
                    arrayList.add(mk0Var);
                } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    long a = mf9.a();
                    T2(arrayList, pageblockblockquoteblocks.blocks, map);
                    for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                        ((mk0) arrayList.get(size3)).k.add(0, Long.valueOf(a));
                    }
                    if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                        map.put(Long.valueOf(a), pageblockblockquoteblocks.caption);
                    }
                } else {
                    arrayList.add(new mk0(pageBlock, 0, 0));
                }
            }
        }
    }

    public static FrameLayout T4(xl9 xl9Var, boolean z) {
        am9 m;
        ajb model = xl9Var.getModel();
        if (model != null) {
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i2 = z ? -1 : Integer.MAX_VALUE;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : xl9Var.getSelectedCells()) {
                int a = model.a(pagetablecell2);
                int o = z ? (ajb.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z ? o < i2 || (o == i2 && a < i) : o > i2 || (o == i2 && a < i)) {
                    pagetablecell = pagetablecell2;
                    i = a;
                    i2 = o;
                }
            }
            if (pagetablecell != null && (m = xl9Var.getGrid().m(pagetablecell)) != null) {
                return m;
            }
        }
        return xl9Var;
    }

    public static ArrayList U2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        T2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static ArrayList d3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static int[] f5(xl9 xl9Var) {
        ajb ajbVar = xl9Var.G;
        for (int size = ajbVar != null ? ajbVar.g.size() : 0; size >= 0; size--) {
            dg9 n = xl9Var.n(size);
            int length = n != null ? n.length() : 0;
            if (length > 0) {
                return new int[]{size, length};
            }
        }
        return null;
    }

    public static boolean i3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || A3(pageBlock);
    }

    public static boolean i4(dg9 dg9Var, float f, float f2) {
        if (dg9Var != null && dg9Var.getVisibility() == 0) {
            dg9Var.getLocationOnScreen(new int[2]);
            float f3 = f - r1[0];
            float f4 = f2 - r1[1];
            if (f3 >= 0.0f && f4 >= 0.0f && f3 <= dg9Var.getWidth() && f4 <= dg9Var.getHeight()) {
                int offsetForPosition = dg9Var.getOffsetForPosition(f3, f4);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                dg9Var.P();
                dg9Var.setSelection(Math.max(0, Math.min(offsetForPosition, dg9Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int m4(int i, mk0 mk0Var, boolean z) {
        if (mk0Var == null) {
            return hl.L(2.0f);
        }
        return uh9.y(16.0f, Math.max(0, i - (mk0Var.k.size() - (z ? mk0Var.l : mk0Var.m))), hl.L(2.0f));
    }

    public static int n4(mk0 mk0Var, mk0 mk0Var2) {
        ArrayList arrayList = mk0Var.k;
        int i = 0;
        if (mk0Var2 == null) {
            return 0;
        }
        ArrayList arrayList2 = mk0Var2.k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i < min && ((Long) arrayList.get(i)).equals(arrayList2.get(i))) {
            i++;
        }
        return i;
    }

    public static boolean s3(int i) {
        return i == 21 || i == 22 || i == 19 || i == 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setEditTextsLocked(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof km9) {
                ((km9) childAt).setLocked(z);
            } else if (childAt instanceof xl9) {
                ((xl9) childAt).setLocked(z);
            } else if (childAt instanceof jf9) {
                ((jf9) childAt).getCaptionEditText().setLocked(z);
            } else if (childAt instanceof rf9) {
                ((rf9) childAt).setLocked(z);
            } else if (childAt instanceof vf9) {
                childAt.invalidate();
            }
        }
    }

    public static int t2(int i) {
        if (i == 4) {
            return 114971;
        }
        if (i == 16384) {
            return 32772;
        }
        return i == 32768 ? 16388 : 4;
    }

    public static boolean u3(mk0 mk0Var) {
        return mk0Var != null && (mk0Var.b instanceof TL_iv.pageBlockDetails);
    }

    public static boolean w3(TL_iv.PageBlock pageBlock) {
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || B3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !km9.y(pageBlock).isEmpty()) ? false : true;
    }

    public static boolean x3(TL_iv.PageBlock pageBlock) {
        return (B3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    public static boolean y3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public final mk0 A2() {
        int i;
        mk0 B4;
        mk0 N2 = N2();
        if (N2 != null) {
            return N2;
        }
        di9 di9Var = this.v3;
        if (di9Var == null || (i = di9Var.p0) < 0 || (B4 = B4(i)) == null) {
            return null;
        }
        return B4;
    }

    public final void A4() {
        byte b = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ze9) {
                ze9 ze9Var = (ze9) childAt;
                ze9Var.b.a(ze9Var.a, new ye9(ze9Var, b));
            }
        }
        invalidate();
    }

    public final void B2() {
        ArrayList arrayList;
        di9 di9Var = this.v3;
        int i = di9Var.p0;
        int i2 = di9Var.r0;
        int i3 = di9Var.s0;
        if (T1(i, i2, i3, di9Var.u0, new String[]{""})) {
            return;
        }
        if (i > i3) {
            i3 = i;
            i = i3;
        }
        ArrayList arrayList2 = new ArrayList();
        byte b = 0;
        int max = Math.max(0, i);
        while (true) {
            arrayList = this.t3;
            if (max > i3) {
                break;
            }
            ArrayList arrayList3 = this.x4;
            if (max >= arrayList3.size()) {
                break;
            }
            mk0 mk0Var = (mk0) arrayList3.get(max);
            if (mk0Var.t == 0 && arrayList.indexOf(mk0Var) >= 0) {
                arrayList2.add(mk0Var);
            }
            max++;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        int indexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new mk0(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap hashMap = this.u3;
        if (!hashMap.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                hashSet.addAll(((mk0) arrayList.get(i4)).k);
            }
            hashMap.keySet().retainAll(hashSet);
        }
        u2();
        T3();
        u4();
        di9Var.e(false);
        this.g3.O(false);
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        post(new jh9(this, (mk0) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), b));
    }

    public final mk0 B4(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.x4;
        if (i < arrayList.size()) {
            return (mk0) arrayList.get(i);
        }
        return null;
    }

    public final boolean C2() {
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            di9Var.e(false);
            return true;
        }
        if (this.q4 == null) {
            return false;
        }
        J2();
        return true;
    }

    public final void C4() {
        ArrayList arrayList = this.t3;
        arrayList.clear();
        arrayList.add(new mk0(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new mk0(new TL_iv.pageBlockParagraph(), 0, 0));
        this.g3.O(false);
    }

    public final void D2() {
        di9 di9Var = this.v3;
        if (di9Var != null) {
            di9Var.e(true);
        }
        J2();
        k3();
        IdentityHashMap identityHashMap = this.h4;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((sj9) it.next()).b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.i4;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((oj9) it2.next()).a();
        }
        identityHashMap2.clear();
    }

    public final boolean D3() {
        int i;
        mk0 B4;
        di9 di9Var = this.v3;
        return di9Var != null && di9Var.w() && (i = di9Var.p0) == di9Var.s0 && i >= 0 && i < this.x4.size() && di9Var.q0 == 1 && di9Var.t0 == 1 && (B4 = B4(i)) != null && km9.n(B4.b);
    }

    public final View D4(int i) {
        if (i < 0) {
            return null;
        }
        return this.f3.m(i);
    }

    @Override // q9c
    public final boolean E1() {
        return this.b4;
    }

    public final int E2(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (u3((mk0) arrayList.get(i3))) {
                i2++;
            } else if (((mk0) arrayList.get(i3)).i) {
                i2--;
            }
        }
        return i2;
    }

    public final boolean E3(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i2 < arrayList.size() && i <= i2) {
                boolean z = false;
                while (i <= i2) {
                    mk0 mk0Var = (mk0) arrayList.get(i);
                    if (!mk0Var.i && !u3(mk0Var)) {
                        if (!mk0Var.k.isEmpty() || km9.n(mk0Var.b)) {
                            z = true;
                        }
                    }
                    i++;
                }
                return z;
            }
        }
        return false;
    }

    public final int[] E4() {
        ArrayList arrayList = this.t3;
        di9 di9Var = this.v3;
        if (di9Var == null || !di9Var.w()) {
            mk0 N2 = N2();
            int indexOf = N2 != null ? arrayList.indexOf(N2) : -1;
            if (indexOf >= 0) {
                return new int[]{indexOf, indexOf};
            }
            return null;
        }
        int indexOf2 = arrayList.indexOf(B4(di9Var.p0));
        int indexOf3 = arrayList.indexOf(B4(di9Var.s0));
        if (indexOf2 < 0 || indexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(indexOf2, indexOf3), Math.max(indexOf2, indexOf3)};
    }

    public final dg9 F2(int i) {
        if (!u3(B4(i))) {
            return null;
        }
        View D4 = D4(i);
        if (D4 instanceof rf9) {
            return ((rf9) D4).getEditText();
        }
        return null;
    }

    public final boolean F3() {
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            int i = di9Var.p0;
            int i2 = di9Var.s0;
            if (i >= 0 && i2 >= 0 && i2 >= i) {
                boolean z = false;
                while (i <= i2) {
                    mk0 B4 = B4(i);
                    if (B4 != null) {
                        if (z3(B4.b)) {
                            z = true;
                        }
                    }
                    i++;
                }
                return z;
            }
        }
        return false;
    }

    public final boolean F4() {
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            if (I3()) {
                int i = di9Var.p0;
                int i2 = di9Var.q0;
                int i3 = di9Var.t0;
                int i4 = di9Var.r0;
                int i5 = di9Var.u0;
                int i6 = i2;
                while (i6 <= i3) {
                    dg9 R4 = R4(i, i6);
                    if (R4 != null) {
                        int length = R4.length();
                        int i7 = i6 == i2 ? i4 : 0;
                        int i8 = i6 == i3 ? i5 : length;
                        if (i2 == i3) {
                            i7 = Math.min(i4, i5);
                            i8 = Math.max(i4, i5);
                        }
                        if (Math.max(0, Math.min(i7, length)) < Math.max(0, Math.min(i8, length))) {
                            return true;
                        }
                    }
                    i6++;
                }
            } else if (v3()) {
                dg9 F2 = F2(di9Var.p0);
                if (F2 != null && Math.max(0, Math.min(Math.min(di9Var.r0, di9Var.u0), F2.length())) < Math.max(0, Math.min(Math.max(di9Var.r0, di9Var.u0), F2.length()))) {
                    return true;
                }
            } else if (t3()) {
                dg9 p2 = p2(di9Var.p0);
                if (p2 != null) {
                    int i9 = di9Var.r0;
                    int i10 = di9Var.u0;
                    if (Math.max(0, Math.min(Math.min(i9, i10), p2.length())) < Math.max(0, Math.min(Math.max(i9, i10), p2.length()))) {
                        return true;
                    }
                }
            } else {
                boolean D3 = D3();
                int i11 = di9Var.p0;
                if (D3) {
                    dg9 l4 = l4(i11);
                    if (l4 != null) {
                        int i12 = di9Var.r0;
                        int i13 = di9Var.u0;
                        if (Math.max(0, Math.min(Math.min(i12, i13), l4.length())) < Math.max(0, Math.min(Math.max(i12, i13), l4.length()))) {
                            return true;
                        }
                    }
                } else {
                    int i14 = di9Var.s0;
                    int i15 = di9Var.r0;
                    int i16 = di9Var.u0;
                    if (i11 >= 0 && i14 >= 0 && i14 >= i11 && i14 < this.x4.size()) {
                        int i17 = i11;
                        while (i17 <= i14) {
                            mk0 B4 = B4(i17);
                            if (B4 != null) {
                                if (B4.t == 0) {
                                    TL_iv.PageBlock pageBlock = B4.b;
                                    if (!x3(pageBlock)) {
                                        continue;
                                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                        continue;
                                    }
                                }
                                int e2 = e2(i17);
                                if (Math.max(0, Math.min(i17 == i11 ? i15 : 0, e2)) < Math.max(0, Math.min(i17 == i14 ? i16 : e2, e2))) {
                                    return true;
                                }
                            }
                            i17++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // q9c
    public final void G1() {
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0059 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G3(int i, int i2, int i3, int i4, int i5) {
        int length;
        int g;
        int A;
        int max;
        int max2;
        if (v3()) {
            dg9 F2 = F2(i2);
            return (F2 == null || (max = Math.max(0, Math.min(Math.min(i3, i5), F2.length()))) >= (max2 = Math.max(0, Math.min(Math.max(i3, i5), F2.length()))) || (F2.c(max, max2) & i) == 0) ? false : true;
        }
        if (!D3()) {
            int i6 = i2;
            boolean z = false;
            while (i6 <= i4) {
                mk0 B4 = B4(i6);
                if (B4 != null) {
                    TL_iv.PageBlock pageBlock = B4.b;
                    if (x3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int e2 = e2(i6);
                        int i7 = i6 == i2 ? i3 : 0;
                        int i8 = i6 == i4 ? i5 : e2;
                        int max3 = Math.max(0, Math.min(i7, e2));
                        int max4 = Math.max(0, Math.min(i8, e2));
                        if (max3 >= max4) {
                            continue;
                        } else {
                            km9 r2 = r2(i6);
                            if (r2 != null ? (r2.getStyleDelegate().c(max3, max4) & i) != 0 : mm9.i(max3, max4, i, km9.z(B4(i6).b))) {
                                z = true;
                            }
                        }
                    }
                }
                i6++;
            }
            return z;
        }
        dg9 l4 = l4(i2);
        if (l4 == null || (g = uh9.g(i3, i5, (length = l4.length()), 0)) >= (A = qu6.A(i3, i5, length, 0)) || (l4.c(g, A) & i) == 0) {
        }
    }

    public final int[] G4() {
        di9 di9Var = this.v3;
        if (di9Var == null) {
            return null;
        }
        int i = di9Var.p0;
        int i2 = di9Var.s0;
        if (i < 0 || i2 < 0) {
            return null;
        }
        mk0 B4 = B4(i);
        mk0 B42 = B4(i2);
        if (B4 == null || B42 == null) {
            return null;
        }
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B42);
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            indexOf = indexOf2;
            indexOf2 = indexOf;
        }
        return new int[]{indexOf, indexOf2};
    }

    @Override // q9c
    public final void H1() {
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.L();
        }
        A4();
    }

    public final boolean H3(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        boolean z = false;
        while (i7 <= i5) {
            dg9 R4 = R4(i2, i7);
            if (R4 != null) {
                int length = R4.length();
                int i8 = i7 == i3 ? i4 : 0;
                int i9 = i7 == i5 ? i6 : length;
                if (i3 == i5) {
                    i8 = Math.min(i4, i6);
                    i9 = Math.max(i4, i6);
                }
                int max = Math.max(0, Math.min(i8, length));
                int max2 = Math.max(0, Math.min(i9, length));
                if (max >= max2) {
                    continue;
                } else {
                    if ((R4.c(max, max2) & i) == 0) {
                        return false;
                    }
                    z = true;
                }
            }
            i7++;
        }
        return z;
    }

    public final void H4(dg9 dg9Var) {
        dg9Var.d2 = this.r3;
        dg9Var.D(new m72(this, (byte) 4));
    }

    @Override // q9c
    public final void I1(f89 f89Var) {
        ni9 ni9Var = this.p3;
        if (ni9Var == null || f89Var == null) {
            return;
        }
        View view = f89Var.a;
        view.getLocationOnScreen(new int[2]);
        view.getWidth();
        this.b4 = ni9Var.a(view.getHeight() + r1[1]);
    }

    public final boolean I3() {
        di9 di9Var = this.v3;
        if (di9Var == null || !di9Var.w()) {
            return false;
        }
        int i = di9Var.p0;
        int i2 = di9Var.s0;
        mk0 B4 = B4(i);
        return i == i2 && B4 != null && (B4.b instanceof TL_iv.pageBlockTable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (r8 > 1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0203 A[LOOP:12: B:134:0x01fd->B:136:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0462 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x048b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b4 A[LOOP:17: B:216:0x04b2->B:217:0x04b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c5 A[LOOP:18: B:220:0x04c3->B:221:0x04c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0489 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x048f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0465 A[EDGE_INSN: B:294:0x0465->B:181:0x0465 BREAK  A[LOOP:13: B:168:0x0441->B:286:0x0441], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0 A[LOOP:3: B:41:0x00ba->B:43:0x00c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120 A[LOOP:6: B:70:0x011a->B:72:0x0120, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0138  */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I4(xl9 xl9Var) {
        int i;
        int i2;
        HashSet hashSet;
        Iterator<TL_iv.pageTableCell> it;
        boolean z;
        HashSet hashSet2;
        Iterator<TL_iv.pageTableCell> it2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        fu5 fu5Var;
        int i8;
        int L;
        int i9;
        int[] iArr;
        FrameLayout T4;
        ?? r1;
        int i10;
        int i11;
        boolean z5;
        Iterator it3;
        Iterator it4;
        int i12;
        int i13;
        int i14;
        int i15;
        final int i16;
        final int i17;
        boolean z6;
        String M0;
        String str;
        int i18;
        String str2;
        final ?? r9;
        int i19;
        int i20;
        HashSet hashSet3;
        Iterator<TL_iv.pageTableCell> it5;
        boolean equals;
        final xl9 xl9Var2 = xl9Var;
        final ajb model = xl9Var2.getModel();
        LinkedHashSet linkedHashSet = xl9Var2.I;
        if (model != null) {
            TL_iv.pageBlockTable pageblocktable = model.a;
            Set<TL_iv.pageTableCell> selectedCells = xl9Var2.getSelectedCells();
            if (selectedCells.isEmpty()) {
                return;
            }
            int size = selectedCells.size();
            int i21 = 1;
            if (size >= 2) {
                int i22 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i23 = Integer.MAX_VALUE;
                int i24 = -1;
                int i25 = -1;
                for (TL_iv.pageTableCell pagetablecell : selectedCells) {
                    int b = model.b(pagetablecell);
                    int a = model.a(pagetablecell);
                    int o = ajb.o(pagetablecell);
                    int i26 = pagetablecell.colspan;
                    if (i26 == 0) {
                        i26 = 1;
                    }
                    i22 = Math.min(i22, b);
                    i23 = Math.min(i23, a);
                    i24 = Math.max(i24, (b + o) - 1);
                    i25 = Math.max(i25, (a + i26) - 1);
                }
                HashSet hashSet4 = new HashSet();
                loop1: while (i22 <= i24) {
                    for (int i27 = i23; i27 <= i25; i27++) {
                        if (i22 < 0 || i27 < 0 || i22 >= model.b || i27 >= model.c) {
                            equals = false;
                            break loop1;
                        }
                        hashSet4.add(model.d[i22][i27]);
                    }
                    i22++;
                }
                equals = hashSet4.equals(new HashSet(selectedCells));
                if (equals) {
                    i = 1;
                    if (size == 1) {
                        TL_iv.pageTableCell next = selectedCells.iterator().next();
                        if (ajb.n(next) <= 1) {
                            int i28 = next.rowspan;
                            if (i28 == 0) {
                                i28 = 1;
                            }
                        }
                        i2 = 1;
                        hashSet = new HashSet();
                        it = selectedCells.iterator();
                        while (it.hasNext()) {
                            hashSet.add(Integer.valueOf(model.b(it.next())));
                        }
                        if (!hashSet.isEmpty()) {
                            Iterator it6 = hashSet.iterator();
                            loop4: while (it6.hasNext()) {
                                int intValue = ((Integer) it6.next()).intValue();
                                if (intValue >= 0 && intValue < model.b) {
                                    for (int i29 = 0; i29 < model.c; i29++) {
                                        if (model.e[intValue][i29] == intValue && selectedCells.contains(model.d[intValue][i29])) {
                                        }
                                    }
                                }
                            }
                            z = true;
                            hashSet2 = new HashSet();
                            it2 = selectedCells.iterator();
                            while (it2.hasNext()) {
                                hashSet2.add(Integer.valueOf(model.a(it2.next())));
                            }
                            if (!hashSet2.isEmpty()) {
                                Iterator it7 = hashSet2.iterator();
                                loop7: while (it7.hasNext()) {
                                    int intValue2 = ((Integer) it7.next()).intValue();
                                    if (intValue2 >= 0 && intValue2 < model.c) {
                                        for (int i30 = 0; i30 < model.b; i30++) {
                                            if (model.f[i30][intValue2] == intValue2 && selectedCells.contains(model.d[i30][intValue2])) {
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                if (!selectedCells.isEmpty() || model.b <= 0 || model.c <= 0) {
                                    z3 = false;
                                } else {
                                    HashSet hashSet5 = new HashSet();
                                    for (int i31 = 0; i31 < model.b; i31++) {
                                        for (int i32 = 0; i32 < model.c; i32++) {
                                            hashSet5.add(model.d[i31][i32]);
                                        }
                                    }
                                    z3 = hashSet5.equals(new HashSet(selectedCells));
                                }
                                z4 = z3 || (model.b == 1 && model.c == 1);
                                if (z || z3) {
                                    i3 = 1;
                                } else {
                                    HashSet hashSet6 = new HashSet();
                                    Iterator<TL_iv.pageTableCell> it8 = selectedCells.iterator();
                                    while (it8.hasNext()) {
                                        hashSet6.add(Integer.valueOf(model.b(it8.next())));
                                        i21 = i21;
                                    }
                                    i3 = i21;
                                    if (hashSet6.size() < model.b) {
                                        i4 = i3;
                                        if (z2 && !z3) {
                                            hashSet3 = new HashSet();
                                            it5 = selectedCells.iterator();
                                            while (it5.hasNext()) {
                                                hashSet3.add(Integer.valueOf(model.a(it5.next())));
                                            }
                                            if (hashSet3.size() < model.c) {
                                                i5 = i3;
                                                i6 = (z4 || !z2 || model.c >= uc7.s1(this.n3).k4.k0.f()) ? 0 : i3;
                                                i7 = (z4 || !z) ? 0 : i3;
                                                fu5Var = this.r4;
                                                i8 = i;
                                                if (fu5Var != null) {
                                                    this.r4 = null;
                                                    fu5Var.u();
                                                }
                                                L = hl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                                                FrameLayout T42 = T4(xl9Var2, false);
                                                i9 = i5;
                                                iArr = new int[2];
                                                T42.getLocationOnScreen(iArr);
                                                if ((iArr[i3] - L) - hl.L(8.0f) >= hl.L(8.0f) + hl.m) {
                                                    T4 = T42;
                                                    r1 = i3;
                                                } else {
                                                    boolean z7 = i3;
                                                    T4 = T4(xl9Var2, z7);
                                                    r1 = z7;
                                                }
                                                final fu5 O = this.p3.O(T4);
                                                O.s = (short) 0;
                                                O.t = false;
                                                O.f0 = r1;
                                                LinearLayout linearLayout = new LinearLayout(getContext());
                                                linearLayout.setMinimumWidth(hl.L(208.0f));
                                                linearLayout.setOrientation(r1);
                                                TextView textView = new TextView(getContext());
                                                i10 = i2;
                                                i11 = i4;
                                                qd4.u(12.0f, 2131754050, 1, textView, null);
                                                textView.setGravity(17);
                                                int i33 = aob.y6;
                                                vnb vnbVar = this.o3;
                                                yob.X(textView, i33, vnbVar);
                                                linearLayout.addView(textView, tre.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                LinearLayout linearLayout2 = new LinearLayout(getContext());
                                                boolean z8 = z;
                                                linearLayout2.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                                                linearLayout2.setOrientation(0);
                                                linearLayout.addView(linearLayout2, tre.r(-2, -2, 17));
                                                ug9 ug9Var = new ug9(R.drawable.iv_align_horiz_left, vnbVar, getContext());
                                                ug9Var.e = (byte) 4;
                                                ug9Var.updateColors();
                                                ug9Var.b();
                                                int i34 = aob.G8;
                                                ug9Var.c(i34);
                                                linearLayout2.addView(ug9Var, tre.o(32, 32));
                                                ug9 ug9Var2 = new ug9(R.drawable.iv_align_horiz_middle, vnbVar, getContext());
                                                ug9Var2.e = (byte) 4;
                                                ug9Var2.updateColors();
                                                ug9Var2.b();
                                                ug9Var2.c(i34);
                                                linearLayout2.addView(ug9Var2, tre.o(32, 32));
                                                ug9 ug9Var3 = new ug9(R.drawable.iv_align_horiz_right, vnbVar, getContext());
                                                ug9Var3.e = (byte) 4;
                                                ug9Var3.updateColors();
                                                ug9Var3.b();
                                                ug9Var3.c(i34);
                                                final ug9[] ug9VarArr = {ug9Var, ug9Var2, ug9Var3};
                                                boolean z9 = z2;
                                                linearLayout2.addView(ug9Var3, tre.o(32, 32));
                                                z5 = z3;
                                                linearLayout2.addView(new Space(getContext()), tre.o(8, 0));
                                                ug9 ug9Var4 = new ug9(R.drawable.iv_align_vert_top, vnbVar, getContext());
                                                ug9Var4.e = (byte) 4;
                                                ug9Var4.updateColors();
                                                ug9Var4.b();
                                                ug9Var4.c(i34);
                                                linearLayout2.addView(ug9Var4, tre.o(32, 32));
                                                ug9 ug9Var5 = new ug9(R.drawable.iv_align_vert_middle, vnbVar, getContext());
                                                ug9Var5.e = (byte) 4;
                                                ug9Var5.updateColors();
                                                ug9Var5.b();
                                                ug9Var5.c(i34);
                                                linearLayout2.addView(ug9Var5, tre.o(32, 32));
                                                ug9 ug9Var6 = new ug9(R.drawable.iv_align_vert_bottom, vnbVar, getContext());
                                                ug9Var6.e = (byte) 4;
                                                ug9Var6.updateColors();
                                                ug9Var6.b();
                                                ug9Var6.c(i34);
                                                final ug9[] ug9VarArr2 = {ug9Var4, ug9Var5, ug9Var6};
                                                linearLayout2.addView(ug9Var6, tre.o(32, 32));
                                                O.p(linearLayout);
                                                it3 = linkedHashSet.iterator();
                                                int i35 = -1;
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                        break;
                                                    }
                                                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) it3.next();
                                                    if (pagetablecell2 != null) {
                                                        if (pagetablecell2.align_right) {
                                                            i20 = 2;
                                                        } else if (pagetablecell2.align_center) {
                                                            i20 = 1;
                                                        }
                                                        if (i35 == -1) {
                                                            if (i35 != i20) {
                                                                i35 = -1;
                                                                break;
                                                            }
                                                        } else {
                                                            i35 = i20;
                                                        }
                                                    }
                                                    i20 = 0;
                                                    if (i35 == -1) {
                                                    }
                                                }
                                                it4 = linkedHashSet.iterator();
                                                int i36 = -1;
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                        i12 = i36;
                                                        break;
                                                    }
                                                    TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) it4.next();
                                                    if (pagetablecell3 != null) {
                                                        if (pagetablecell3.valign_bottom) {
                                                            i19 = 2;
                                                        } else if (pagetablecell3.valign_middle) {
                                                            i19 = 1;
                                                        }
                                                        if (i36 == -1) {
                                                            if (i36 != i19) {
                                                                i12 = -1;
                                                                break;
                                                            }
                                                        } else {
                                                            i36 = i19;
                                                        }
                                                    }
                                                    i19 = 0;
                                                    if (i36 == -1) {
                                                    }
                                                }
                                                i13 = 0;
                                                while (i13 < 3) {
                                                    ug9VarArr[i13].setSelected(i13 == i35);
                                                    i13++;
                                                }
                                                i15 = 0;
                                                while (i15 < 3) {
                                                    ug9VarArr2[i15].setSelected(i15 == i12);
                                                    i15++;
                                                }
                                                for (i16 = 0; i16 < 3; i16++) {
                                                    final byte b2 = 0;
                                                    ug9VarArr[i16].setOnClickListener(new View.OnClickListener() { // from class: gh9
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            byte b3 = b2;
                                                            ug9[] ug9VarArr3 = ug9VarArr;
                                                            int i37 = i16;
                                                            xl9 xl9Var3 = xl9Var2;
                                                            switch (b3) {
                                                                case 0:
                                                                    zl9 zl9Var = xl9Var3.w;
                                                                    Iterator it9 = xl9Var3.I.iterator();
                                                                    while (it9.hasNext()) {
                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                        ajb.k(pagetablecell4, i37);
                                                                        am9 m = zl9Var.m(pagetablecell4);
                                                                        if (m != null && m.b != null) {
                                                                            m.a();
                                                                            m.invalidate();
                                                                        }
                                                                    }
                                                                    zl9Var.invalidate();
                                                                    xh9 xh9Var = xl9Var3.F;
                                                                    if (xh9Var != null && xl9Var3.a != null) {
                                                                        xh9Var.a();
                                                                    }
                                                                    int i38 = 0;
                                                                    while (i38 < 3) {
                                                                        ug9VarArr3[i38].setSelected(i38 == i37);
                                                                        i38++;
                                                                    }
                                                                    break;
                                                                default:
                                                                    zl9 zl9Var2 = xl9Var3.w;
                                                                    Iterator it10 = xl9Var3.I.iterator();
                                                                    while (it10.hasNext()) {
                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                        ajb.m(pagetablecell5, i37);
                                                                        am9 m2 = zl9Var2.m(pagetablecell5);
                                                                        if (m2 != null && m2.b != null) {
                                                                            m2.a();
                                                                            m2.invalidate();
                                                                        }
                                                                    }
                                                                    zl9Var2.invalidate();
                                                                    xh9 xh9Var2 = xl9Var3.F;
                                                                    if (xh9Var2 != null && xl9Var3.a != null) {
                                                                        xh9Var2.a();
                                                                    }
                                                                    int i39 = 0;
                                                                    while (i39 < 3) {
                                                                        ug9VarArr3[i39].setSelected(i39 == i37);
                                                                        i39++;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                i17 = 0;
                                                for (i14 = 3; i17 < i14; i14 = 3) {
                                                    final byte b3 = 1;
                                                    ug9VarArr2[i17].setOnClickListener(new View.OnClickListener() { // from class: gh9
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            byte b32 = b3;
                                                            ug9[] ug9VarArr3 = ug9VarArr2;
                                                            int i37 = i17;
                                                            xl9 xl9Var3 = xl9Var2;
                                                            switch (b32) {
                                                                case 0:
                                                                    zl9 zl9Var = xl9Var3.w;
                                                                    Iterator it9 = xl9Var3.I.iterator();
                                                                    while (it9.hasNext()) {
                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                        ajb.k(pagetablecell4, i37);
                                                                        am9 m = zl9Var.m(pagetablecell4);
                                                                        if (m != null && m.b != null) {
                                                                            m.a();
                                                                            m.invalidate();
                                                                        }
                                                                    }
                                                                    zl9Var.invalidate();
                                                                    xh9 xh9Var = xl9Var3.F;
                                                                    if (xh9Var != null && xl9Var3.a != null) {
                                                                        xh9Var.a();
                                                                    }
                                                                    int i38 = 0;
                                                                    while (i38 < 3) {
                                                                        ug9VarArr3[i38].setSelected(i38 == i37);
                                                                        i38++;
                                                                    }
                                                                    break;
                                                                default:
                                                                    zl9 zl9Var2 = xl9Var3.w;
                                                                    Iterator it10 = xl9Var3.I.iterator();
                                                                    while (it10.hasNext()) {
                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                        ajb.m(pagetablecell5, i37);
                                                                        am9 m2 = zl9Var2.m(pagetablecell5);
                                                                        if (m2 != null && m2.b != null) {
                                                                            m2.a();
                                                                            m2.invalidate();
                                                                        }
                                                                    }
                                                                    zl9Var2.invalidate();
                                                                    xh9 xh9Var2 = xl9Var3.F;
                                                                    if (xh9Var2 != null && xl9Var3.a != null) {
                                                                        xh9Var2.a();
                                                                    }
                                                                    int i39 = 0;
                                                                    while (i39 < 3) {
                                                                        ug9VarArr3[i39].setSelected(i39 == i37);
                                                                        i39++;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    i17++;
                                                }
                                                O.n(true);
                                                O.Y = jn7.l3;
                                                if (!linkedHashSet.isEmpty()) {
                                                    Iterator it9 = linkedHashSet.iterator();
                                                    while (it9.hasNext()) {
                                                        if (!((TL_iv.pageTableCell) it9.next()).header) {
                                                        }
                                                    }
                                                    z6 = true;
                                                    if (!z6) {
                                                        M0 = ob6.M0(2131753988, null);
                                                    } else if (z5 || !(size <= 1 || z9 || z8)) {
                                                        M0 = ob6.M0(2131754016, null);
                                                    } else {
                                                        if (z9) {
                                                            i18 = 2131754015;
                                                            str = null;
                                                        } else {
                                                            str = null;
                                                            i18 = z8 ? 2131754014 : 2131754017;
                                                        }
                                                        M0 = ob6.M0(i18, str);
                                                    }
                                                    O.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new yn6((Object) this, (Object) xl9Var2, z6, (byte) 17), false);
                                                    if (i8 == 0) {
                                                        str2 = null;
                                                        final byte b4 = 2;
                                                        O.b(R.drawable.iv_table_merge, ob6.M0(2131753993, null), new Runnable(this) { // from class: hh9
                                                            public final /* synthetic */ pi9 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
                                                            
                                                                if (r4 > 1) goto L75;
                                                             */
                                                            @Override // java.lang.Runnable
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void run() {
                                                                pi9 pi9Var;
                                                                boolean z10;
                                                                int b5;
                                                                ArrayList arrayList;
                                                                byte b6 = b4;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                pi9 pi9Var2 = this.b;
                                                                switch (b6) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = xl9Var3.I;
                                                                        if (xl9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            pi9Var = pi9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b7 = xl9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b7));
                                                                                i37 = Math.min(i37, b7);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ajb ajbVar = xl9Var3.G;
                                                                            ajbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                pi9Var = pi9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ajbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ajbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ajbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ajbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ajbVar.a.rows.clear();
                                                                                    ajbVar.i();
                                                                                    pi9Var = pi9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ajbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b8 = ajbVar.b(pagetablecell4);
                                                                                        int a2 = ajbVar.a(pagetablecell4);
                                                                                        int o2 = ajb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        pi9 pi9Var3 = pi9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b8; i44 < b8 + o2 && i44 < ajbVar.b; i44++) {
                                                                                            if (!zArr2[i44]) {
                                                                                                if (i43 < 0) {
                                                                                                    i43 = i44;
                                                                                                }
                                                                                                i42++;
                                                                                            }
                                                                                        }
                                                                                        if (i43 >= 0) {
                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i43], a2, i42, i41});
                                                                                        }
                                                                                        zArr = zArr2;
                                                                                        pi9Var2 = pi9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    pi9Var = pi9Var2;
                                                                                    ajbVar.j(identityHashMap, i38);
                                                                                    ajbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z10) {
                                                                                xl9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        pi9Var.J2();
                                                                        break;
                                                                    case 1:
                                                                        mk0 row = xl9Var3.getRow();
                                                                        pi9Var2.J2();
                                                                        if (row != null) {
                                                                            ch9 ch9Var = pi9Var2.R3;
                                                                            if (ch9Var != null) {
                                                                                ch9Var.d();
                                                                            }
                                                                            pi9Var2.t4(row);
                                                                            ch9 ch9Var2 = pi9Var2.R3;
                                                                            if (ch9Var2 != null) {
                                                                                ch9Var2.h();
                                                                            }
                                                                            ni9 ni9Var = pi9Var2.p3;
                                                                            if (ni9Var != null) {
                                                                                ni9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = xl9Var3.I;
                                                                        if (xl9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, xl9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, xl9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ajb ajbVar2 = xl9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ajbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ajbVar2.a(pagetablecell6);
                                                                                        int o3 = ajb.o(pagetablecell6);
                                                                                        int i51 = pagetablecell6.colspan;
                                                                                        if (i51 == 0) {
                                                                                            i51 = 1;
                                                                                        }
                                                                                        i47 = Math.min(i47, b9);
                                                                                        i48 = Math.min(i48, a3);
                                                                                        i49 = Math.max(i49, (b9 + o3) - 1);
                                                                                        i50 = Math.max(i50, (a3 + i51) - 1);
                                                                                        c = c2;
                                                                                    }
                                                                                    HashSet hashSet9 = new HashSet();
                                                                                    int i52 = i47;
                                                                                    while (true) {
                                                                                        if (i52 <= i49) {
                                                                                            for (int i53 = i48; i53 <= i50; i53++) {
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ajbVar2.b && i53 < ajbVar2.c) {
                                                                                                    hashSet9.add(ajbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new jz0(ajbVar2, (byte) 9));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ajb.g((TL_iv.pageTableCell) obj2);
                                                                                                if (g.isEmpty()) {
                                                                                                    arrayList = arrayList3;
                                                                                                } else {
                                                                                                    if (sb.length() > 0) {
                                                                                                        arrayList = arrayList3;
                                                                                                        sb.append("\n");
                                                                                                    } else {
                                                                                                        arrayList = arrayList3;
                                                                                                    }
                                                                                                    sb.append(g);
                                                                                                }
                                                                                                arrayList3 = arrayList;
                                                                                            }
                                                                                            TL_iv.pageTableCell pagetablecell7 = ajbVar2.d[i47][i48];
                                                                                            int i55 = (i50 - i48) + 1;
                                                                                            int i56 = (i49 - i47) + 1;
                                                                                            if (i55 <= 1) {
                                                                                                i55 = 0;
                                                                                            }
                                                                                            pagetablecell7.colspan = i55;
                                                                                            if (i56 <= 1) {
                                                                                                i56 = 0;
                                                                                            }
                                                                                            pagetablecell7.rowspan = i56;
                                                                                            int i57 = pagetablecell7.flags;
                                                                                            int i58 = i55 > 0 ? i57 | 2 : i57 & (-3);
                                                                                            pagetablecell7.flags = i58;
                                                                                            pagetablecell7.flags = i56 > 0 ? i58 | 4 : i58 & (-5);
                                                                                            ajb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b5 = ajbVar2.b(pagetablecell8)) >= 0 && b5 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b5).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ajbVar2.i();
                                                                                            xl9Var3.x();
                                                                                            xl9Var3.w.invalidate();
                                                                                            xl9Var3.s(i45, i46);
                                                                                            xl9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ajb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = xl9Var3.G.b(pagetablecell9);
                                                                            int a4 = xl9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (xl9Var3.G.p(pagetablecell9)) {
                                                                                xl9Var3.x();
                                                                                xl9Var3.w.invalidate();
                                                                                xl9Var3.s(b10, a4);
                                                                                xl9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 4:
                                                                        xl9Var3.h(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 5:
                                                                        xl9Var3.h(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 6:
                                                                        xl9Var3.j(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 7:
                                                                        xl9Var3.j(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = xl9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ajb ajbVar3 = xl9Var3.G;
                                                                            ajbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ajbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ajbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ajbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ajbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ajbVar3.a.rows.clear();
                                                                                    ajbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ajbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ajbVar3.b(pagetablecell10);
                                                                                        int a6 = ajbVar3.a(pagetablecell10);
                                                                                        int o4 = ajb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ajbVar3.c; i67++) {
                                                                                            if (!zArr3[i67]) {
                                                                                                if (i66 < 0) {
                                                                                                    i66 = i67;
                                                                                                }
                                                                                                i65++;
                                                                                            }
                                                                                        }
                                                                                        if (i66 >= 0) {
                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b11, iArr5[i66], o4, i65});
                                                                                        }
                                                                                        iArr4 = iArr5;
                                                                                    }
                                                                                    ajbVar3.j(identityHashMap2, ajbVar3.b);
                                                                                    ajbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z11) {
                                                                                xl9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (i10 != 0) {
                                                        final byte b5 = 3;
                                                        O.b(R.drawable.iv_table_unmerge, ob6.M0(2131753985, str2), new Runnable(this) { // from class: hh9
                                                            public final /* synthetic */ pi9 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
                                                            
                                                                if (r4 > 1) goto L75;
                                                             */
                                                            @Override // java.lang.Runnable
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void run() {
                                                                pi9 pi9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b6 = b5;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                pi9 pi9Var2 = this.b;
                                                                switch (b6) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = xl9Var3.I;
                                                                        if (xl9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            pi9Var = pi9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b7 = xl9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b7));
                                                                                i37 = Math.min(i37, b7);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ajb ajbVar = xl9Var3.G;
                                                                            ajbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                pi9Var = pi9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ajbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ajbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ajbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ajbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ajbVar.a.rows.clear();
                                                                                    ajbVar.i();
                                                                                    pi9Var = pi9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ajbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b8 = ajbVar.b(pagetablecell4);
                                                                                        int a2 = ajbVar.a(pagetablecell4);
                                                                                        int o2 = ajb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        pi9 pi9Var3 = pi9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b8; i44 < b8 + o2 && i44 < ajbVar.b; i44++) {
                                                                                            if (!zArr2[i44]) {
                                                                                                if (i43 < 0) {
                                                                                                    i43 = i44;
                                                                                                }
                                                                                                i42++;
                                                                                            }
                                                                                        }
                                                                                        if (i43 >= 0) {
                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i43], a2, i42, i41});
                                                                                        }
                                                                                        zArr = zArr2;
                                                                                        pi9Var2 = pi9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    pi9Var = pi9Var2;
                                                                                    ajbVar.j(identityHashMap, i38);
                                                                                    ajbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z10) {
                                                                                xl9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        pi9Var.J2();
                                                                        break;
                                                                    case 1:
                                                                        mk0 row = xl9Var3.getRow();
                                                                        pi9Var2.J2();
                                                                        if (row != null) {
                                                                            ch9 ch9Var = pi9Var2.R3;
                                                                            if (ch9Var != null) {
                                                                                ch9Var.d();
                                                                            }
                                                                            pi9Var2.t4(row);
                                                                            ch9 ch9Var2 = pi9Var2.R3;
                                                                            if (ch9Var2 != null) {
                                                                                ch9Var2.h();
                                                                            }
                                                                            ni9 ni9Var = pi9Var2.p3;
                                                                            if (ni9Var != null) {
                                                                                ni9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = xl9Var3.I;
                                                                        if (xl9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, xl9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, xl9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ajb ajbVar2 = xl9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ajbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ajbVar2.a(pagetablecell6);
                                                                                        int o3 = ajb.o(pagetablecell6);
                                                                                        int i51 = pagetablecell6.colspan;
                                                                                        if (i51 == 0) {
                                                                                            i51 = 1;
                                                                                        }
                                                                                        i47 = Math.min(i47, b9);
                                                                                        i48 = Math.min(i48, a3);
                                                                                        i49 = Math.max(i49, (b9 + o3) - 1);
                                                                                        i50 = Math.max(i50, (a3 + i51) - 1);
                                                                                        c = c2;
                                                                                    }
                                                                                    HashSet hashSet9 = new HashSet();
                                                                                    int i52 = i47;
                                                                                    while (true) {
                                                                                        if (i52 <= i49) {
                                                                                            for (int i53 = i48; i53 <= i50; i53++) {
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ajbVar2.b && i53 < ajbVar2.c) {
                                                                                                    hashSet9.add(ajbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new jz0(ajbVar2, (byte) 9));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ajb.g((TL_iv.pageTableCell) obj2);
                                                                                                if (g.isEmpty()) {
                                                                                                    arrayList = arrayList3;
                                                                                                } else {
                                                                                                    if (sb.length() > 0) {
                                                                                                        arrayList = arrayList3;
                                                                                                        sb.append("\n");
                                                                                                    } else {
                                                                                                        arrayList = arrayList3;
                                                                                                    }
                                                                                                    sb.append(g);
                                                                                                }
                                                                                                arrayList3 = arrayList;
                                                                                            }
                                                                                            TL_iv.pageTableCell pagetablecell7 = ajbVar2.d[i47][i48];
                                                                                            int i55 = (i50 - i48) + 1;
                                                                                            int i56 = (i49 - i47) + 1;
                                                                                            if (i55 <= 1) {
                                                                                                i55 = 0;
                                                                                            }
                                                                                            pagetablecell7.colspan = i55;
                                                                                            if (i56 <= 1) {
                                                                                                i56 = 0;
                                                                                            }
                                                                                            pagetablecell7.rowspan = i56;
                                                                                            int i57 = pagetablecell7.flags;
                                                                                            int i58 = i55 > 0 ? i57 | 2 : i57 & (-3);
                                                                                            pagetablecell7.flags = i58;
                                                                                            pagetablecell7.flags = i56 > 0 ? i58 | 4 : i58 & (-5);
                                                                                            ajb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ajbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ajbVar2.i();
                                                                                            xl9Var3.x();
                                                                                            xl9Var3.w.invalidate();
                                                                                            xl9Var3.s(i45, i46);
                                                                                            xl9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ajb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = xl9Var3.G.b(pagetablecell9);
                                                                            int a4 = xl9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (xl9Var3.G.p(pagetablecell9)) {
                                                                                xl9Var3.x();
                                                                                xl9Var3.w.invalidate();
                                                                                xl9Var3.s(b10, a4);
                                                                                xl9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 4:
                                                                        xl9Var3.h(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 5:
                                                                        xl9Var3.h(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 6:
                                                                        xl9Var3.j(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 7:
                                                                        xl9Var3.j(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = xl9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ajb ajbVar3 = xl9Var3.G;
                                                                            ajbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ajbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ajbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ajbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ajbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ajbVar3.a.rows.clear();
                                                                                    ajbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ajbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ajbVar3.b(pagetablecell10);
                                                                                        int a6 = ajbVar3.a(pagetablecell10);
                                                                                        int o4 = ajb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ajbVar3.c; i67++) {
                                                                                            if (!zArr3[i67]) {
                                                                                                if (i66 < 0) {
                                                                                                    i66 = i67;
                                                                                                }
                                                                                                i65++;
                                                                                            }
                                                                                        }
                                                                                        if (i66 >= 0) {
                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b11, iArr5[i66], o4, i65});
                                                                                        }
                                                                                        iArr4 = iArr5;
                                                                                    }
                                                                                    ajbVar3.j(identityHashMap2, ajbVar3.b);
                                                                                    ajbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z11) {
                                                                                xl9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                    }
                                                    if (i6 != 0) {
                                                        final byte b6 = 4;
                                                        O.b(R.drawable.iv_table_insert_left, ob6.M0(2131754003, str2), new Runnable(this) { // from class: hh9
                                                            public final /* synthetic */ pi9 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
                                                            
                                                                if (r4 > 1) goto L75;
                                                             */
                                                            @Override // java.lang.Runnable
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void run() {
                                                                pi9 pi9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b6;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                pi9 pi9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = xl9Var3.I;
                                                                        if (xl9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            pi9Var = pi9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b7 = xl9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b7));
                                                                                i37 = Math.min(i37, b7);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ajb ajbVar = xl9Var3.G;
                                                                            ajbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                pi9Var = pi9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ajbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ajbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ajbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ajbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ajbVar.a.rows.clear();
                                                                                    ajbVar.i();
                                                                                    pi9Var = pi9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ajbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b8 = ajbVar.b(pagetablecell4);
                                                                                        int a2 = ajbVar.a(pagetablecell4);
                                                                                        int o2 = ajb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        pi9 pi9Var3 = pi9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b8; i44 < b8 + o2 && i44 < ajbVar.b; i44++) {
                                                                                            if (!zArr2[i44]) {
                                                                                                if (i43 < 0) {
                                                                                                    i43 = i44;
                                                                                                }
                                                                                                i42++;
                                                                                            }
                                                                                        }
                                                                                        if (i43 >= 0) {
                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i43], a2, i42, i41});
                                                                                        }
                                                                                        zArr = zArr2;
                                                                                        pi9Var2 = pi9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    pi9Var = pi9Var2;
                                                                                    ajbVar.j(identityHashMap, i38);
                                                                                    ajbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z10) {
                                                                                xl9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        pi9Var.J2();
                                                                        break;
                                                                    case 1:
                                                                        mk0 row = xl9Var3.getRow();
                                                                        pi9Var2.J2();
                                                                        if (row != null) {
                                                                            ch9 ch9Var = pi9Var2.R3;
                                                                            if (ch9Var != null) {
                                                                                ch9Var.d();
                                                                            }
                                                                            pi9Var2.t4(row);
                                                                            ch9 ch9Var2 = pi9Var2.R3;
                                                                            if (ch9Var2 != null) {
                                                                                ch9Var2.h();
                                                                            }
                                                                            ni9 ni9Var = pi9Var2.p3;
                                                                            if (ni9Var != null) {
                                                                                ni9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = xl9Var3.I;
                                                                        if (xl9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, xl9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, xl9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ajb ajbVar2 = xl9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ajbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ajbVar2.a(pagetablecell6);
                                                                                        int o3 = ajb.o(pagetablecell6);
                                                                                        int i51 = pagetablecell6.colspan;
                                                                                        if (i51 == 0) {
                                                                                            i51 = 1;
                                                                                        }
                                                                                        i47 = Math.min(i47, b9);
                                                                                        i48 = Math.min(i48, a3);
                                                                                        i49 = Math.max(i49, (b9 + o3) - 1);
                                                                                        i50 = Math.max(i50, (a3 + i51) - 1);
                                                                                        c = c2;
                                                                                    }
                                                                                    HashSet hashSet9 = new HashSet();
                                                                                    int i52 = i47;
                                                                                    while (true) {
                                                                                        if (i52 <= i49) {
                                                                                            for (int i53 = i48; i53 <= i50; i53++) {
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ajbVar2.b && i53 < ajbVar2.c) {
                                                                                                    hashSet9.add(ajbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new jz0(ajbVar2, (byte) 9));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ajb.g((TL_iv.pageTableCell) obj2);
                                                                                                if (g.isEmpty()) {
                                                                                                    arrayList = arrayList3;
                                                                                                } else {
                                                                                                    if (sb.length() > 0) {
                                                                                                        arrayList = arrayList3;
                                                                                                        sb.append("\n");
                                                                                                    } else {
                                                                                                        arrayList = arrayList3;
                                                                                                    }
                                                                                                    sb.append(g);
                                                                                                }
                                                                                                arrayList3 = arrayList;
                                                                                            }
                                                                                            TL_iv.pageTableCell pagetablecell7 = ajbVar2.d[i47][i48];
                                                                                            int i55 = (i50 - i48) + 1;
                                                                                            int i56 = (i49 - i47) + 1;
                                                                                            if (i55 <= 1) {
                                                                                                i55 = 0;
                                                                                            }
                                                                                            pagetablecell7.colspan = i55;
                                                                                            if (i56 <= 1) {
                                                                                                i56 = 0;
                                                                                            }
                                                                                            pagetablecell7.rowspan = i56;
                                                                                            int i57 = pagetablecell7.flags;
                                                                                            int i58 = i55 > 0 ? i57 | 2 : i57 & (-3);
                                                                                            pagetablecell7.flags = i58;
                                                                                            pagetablecell7.flags = i56 > 0 ? i58 | 4 : i58 & (-5);
                                                                                            ajb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ajbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ajbVar2.i();
                                                                                            xl9Var3.x();
                                                                                            xl9Var3.w.invalidate();
                                                                                            xl9Var3.s(i45, i46);
                                                                                            xl9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ajb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = xl9Var3.G.b(pagetablecell9);
                                                                            int a4 = xl9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (xl9Var3.G.p(pagetablecell9)) {
                                                                                xl9Var3.x();
                                                                                xl9Var3.w.invalidate();
                                                                                xl9Var3.s(b10, a4);
                                                                                xl9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 4:
                                                                        xl9Var3.h(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 5:
                                                                        xl9Var3.h(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 6:
                                                                        xl9Var3.j(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 7:
                                                                        xl9Var3.j(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = xl9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ajb ajbVar3 = xl9Var3.G;
                                                                            ajbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ajbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ajbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ajbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ajbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ajbVar3.a.rows.clear();
                                                                                    ajbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ajbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ajbVar3.b(pagetablecell10);
                                                                                        int a6 = ajbVar3.a(pagetablecell10);
                                                                                        int o4 = ajb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ajbVar3.c; i67++) {
                                                                                            if (!zArr3[i67]) {
                                                                                                if (i66 < 0) {
                                                                                                    i66 = i67;
                                                                                                }
                                                                                                i65++;
                                                                                            }
                                                                                        }
                                                                                        if (i66 >= 0) {
                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b11, iArr5[i66], o4, i65});
                                                                                        }
                                                                                        iArr4 = iArr5;
                                                                                    }
                                                                                    ajbVar3.j(identityHashMap2, ajbVar3.b);
                                                                                    ajbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z11) {
                                                                                xl9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                        final byte b7 = 5;
                                                        O.b(R.drawable.iv_table_insert_right, ob6.M0(2131754002, str2), new Runnable(this) { // from class: hh9
                                                            public final /* synthetic */ pi9 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
                                                            
                                                                if (r4 > 1) goto L75;
                                                             */
                                                            @Override // java.lang.Runnable
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void run() {
                                                                pi9 pi9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b7;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                pi9 pi9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = xl9Var3.I;
                                                                        if (xl9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            pi9Var = pi9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = xl9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ajb ajbVar = xl9Var3.G;
                                                                            ajbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                pi9Var = pi9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ajbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ajbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ajbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ajbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ajbVar.a.rows.clear();
                                                                                    ajbVar.i();
                                                                                    pi9Var = pi9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ajbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b8 = ajbVar.b(pagetablecell4);
                                                                                        int a2 = ajbVar.a(pagetablecell4);
                                                                                        int o2 = ajb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        pi9 pi9Var3 = pi9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b8; i44 < b8 + o2 && i44 < ajbVar.b; i44++) {
                                                                                            if (!zArr2[i44]) {
                                                                                                if (i43 < 0) {
                                                                                                    i43 = i44;
                                                                                                }
                                                                                                i42++;
                                                                                            }
                                                                                        }
                                                                                        if (i43 >= 0) {
                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i43], a2, i42, i41});
                                                                                        }
                                                                                        zArr = zArr2;
                                                                                        pi9Var2 = pi9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    pi9Var = pi9Var2;
                                                                                    ajbVar.j(identityHashMap, i38);
                                                                                    ajbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z10) {
                                                                                xl9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        pi9Var.J2();
                                                                        break;
                                                                    case 1:
                                                                        mk0 row = xl9Var3.getRow();
                                                                        pi9Var2.J2();
                                                                        if (row != null) {
                                                                            ch9 ch9Var = pi9Var2.R3;
                                                                            if (ch9Var != null) {
                                                                                ch9Var.d();
                                                                            }
                                                                            pi9Var2.t4(row);
                                                                            ch9 ch9Var2 = pi9Var2.R3;
                                                                            if (ch9Var2 != null) {
                                                                                ch9Var2.h();
                                                                            }
                                                                            ni9 ni9Var = pi9Var2.p3;
                                                                            if (ni9Var != null) {
                                                                                ni9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = xl9Var3.I;
                                                                        if (xl9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, xl9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, xl9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ajb ajbVar2 = xl9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ajbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ajbVar2.a(pagetablecell6);
                                                                                        int o3 = ajb.o(pagetablecell6);
                                                                                        int i51 = pagetablecell6.colspan;
                                                                                        if (i51 == 0) {
                                                                                            i51 = 1;
                                                                                        }
                                                                                        i47 = Math.min(i47, b9);
                                                                                        i48 = Math.min(i48, a3);
                                                                                        i49 = Math.max(i49, (b9 + o3) - 1);
                                                                                        i50 = Math.max(i50, (a3 + i51) - 1);
                                                                                        c = c2;
                                                                                    }
                                                                                    HashSet hashSet9 = new HashSet();
                                                                                    int i52 = i47;
                                                                                    while (true) {
                                                                                        if (i52 <= i49) {
                                                                                            for (int i53 = i48; i53 <= i50; i53++) {
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ajbVar2.b && i53 < ajbVar2.c) {
                                                                                                    hashSet9.add(ajbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new jz0(ajbVar2, (byte) 9));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ajb.g((TL_iv.pageTableCell) obj2);
                                                                                                if (g.isEmpty()) {
                                                                                                    arrayList = arrayList3;
                                                                                                } else {
                                                                                                    if (sb.length() > 0) {
                                                                                                        arrayList = arrayList3;
                                                                                                        sb.append("\n");
                                                                                                    } else {
                                                                                                        arrayList = arrayList3;
                                                                                                    }
                                                                                                    sb.append(g);
                                                                                                }
                                                                                                arrayList3 = arrayList;
                                                                                            }
                                                                                            TL_iv.pageTableCell pagetablecell7 = ajbVar2.d[i47][i48];
                                                                                            int i55 = (i50 - i48) + 1;
                                                                                            int i56 = (i49 - i47) + 1;
                                                                                            if (i55 <= 1) {
                                                                                                i55 = 0;
                                                                                            }
                                                                                            pagetablecell7.colspan = i55;
                                                                                            if (i56 <= 1) {
                                                                                                i56 = 0;
                                                                                            }
                                                                                            pagetablecell7.rowspan = i56;
                                                                                            int i57 = pagetablecell7.flags;
                                                                                            int i58 = i55 > 0 ? i57 | 2 : i57 & (-3);
                                                                                            pagetablecell7.flags = i58;
                                                                                            pagetablecell7.flags = i56 > 0 ? i58 | 4 : i58 & (-5);
                                                                                            ajb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ajbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ajbVar2.i();
                                                                                            xl9Var3.x();
                                                                                            xl9Var3.w.invalidate();
                                                                                            xl9Var3.s(i45, i46);
                                                                                            xl9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ajb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = xl9Var3.G.b(pagetablecell9);
                                                                            int a4 = xl9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (xl9Var3.G.p(pagetablecell9)) {
                                                                                xl9Var3.x();
                                                                                xl9Var3.w.invalidate();
                                                                                xl9Var3.s(b10, a4);
                                                                                xl9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 4:
                                                                        xl9Var3.h(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 5:
                                                                        xl9Var3.h(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 6:
                                                                        xl9Var3.j(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 7:
                                                                        xl9Var3.j(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = xl9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ajb ajbVar3 = xl9Var3.G;
                                                                            ajbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ajbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ajbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ajbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ajbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ajbVar3.a.rows.clear();
                                                                                    ajbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ajbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ajbVar3.b(pagetablecell10);
                                                                                        int a6 = ajbVar3.a(pagetablecell10);
                                                                                        int o4 = ajb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ajbVar3.c; i67++) {
                                                                                            if (!zArr3[i67]) {
                                                                                                if (i66 < 0) {
                                                                                                    i66 = i67;
                                                                                                }
                                                                                                i65++;
                                                                                            }
                                                                                        }
                                                                                        if (i66 >= 0) {
                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b11, iArr5[i66], o4, i65});
                                                                                        }
                                                                                        iArr4 = iArr5;
                                                                                    }
                                                                                    ajbVar3.j(identityHashMap2, ajbVar3.b);
                                                                                    ajbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z11) {
                                                                                xl9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                    }
                                                    if (i7 != 0) {
                                                        final byte b8 = 6;
                                                        O.b(R.drawable.iv_table_insert_top, ob6.M0(2131754005, str2), new Runnable(this) { // from class: hh9
                                                            public final /* synthetic */ pi9 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
                                                            
                                                                if (r4 > 1) goto L75;
                                                             */
                                                            @Override // java.lang.Runnable
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void run() {
                                                                pi9 pi9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b8;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                pi9 pi9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = xl9Var3.I;
                                                                        if (xl9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            pi9Var = pi9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = xl9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ajb ajbVar = xl9Var3.G;
                                                                            ajbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                pi9Var = pi9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ajbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ajbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ajbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ajbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ajbVar.a.rows.clear();
                                                                                    ajbVar.i();
                                                                                    pi9Var = pi9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ajbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ajbVar.b(pagetablecell4);
                                                                                        int a2 = ajbVar.a(pagetablecell4);
                                                                                        int o2 = ajb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        pi9 pi9Var3 = pi9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ajbVar.b; i44++) {
                                                                                            if (!zArr2[i44]) {
                                                                                                if (i43 < 0) {
                                                                                                    i43 = i44;
                                                                                                }
                                                                                                i42++;
                                                                                            }
                                                                                        }
                                                                                        if (i43 >= 0) {
                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i43], a2, i42, i41});
                                                                                        }
                                                                                        zArr = zArr2;
                                                                                        pi9Var2 = pi9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    pi9Var = pi9Var2;
                                                                                    ajbVar.j(identityHashMap, i38);
                                                                                    ajbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z10) {
                                                                                xl9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        pi9Var.J2();
                                                                        break;
                                                                    case 1:
                                                                        mk0 row = xl9Var3.getRow();
                                                                        pi9Var2.J2();
                                                                        if (row != null) {
                                                                            ch9 ch9Var = pi9Var2.R3;
                                                                            if (ch9Var != null) {
                                                                                ch9Var.d();
                                                                            }
                                                                            pi9Var2.t4(row);
                                                                            ch9 ch9Var2 = pi9Var2.R3;
                                                                            if (ch9Var2 != null) {
                                                                                ch9Var2.h();
                                                                            }
                                                                            ni9 ni9Var = pi9Var2.p3;
                                                                            if (ni9Var != null) {
                                                                                ni9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = xl9Var3.I;
                                                                        if (xl9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, xl9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, xl9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ajb ajbVar2 = xl9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ajbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ajbVar2.a(pagetablecell6);
                                                                                        int o3 = ajb.o(pagetablecell6);
                                                                                        int i51 = pagetablecell6.colspan;
                                                                                        if (i51 == 0) {
                                                                                            i51 = 1;
                                                                                        }
                                                                                        i47 = Math.min(i47, b9);
                                                                                        i48 = Math.min(i48, a3);
                                                                                        i49 = Math.max(i49, (b9 + o3) - 1);
                                                                                        i50 = Math.max(i50, (a3 + i51) - 1);
                                                                                        c = c2;
                                                                                    }
                                                                                    HashSet hashSet9 = new HashSet();
                                                                                    int i52 = i47;
                                                                                    while (true) {
                                                                                        if (i52 <= i49) {
                                                                                            for (int i53 = i48; i53 <= i50; i53++) {
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ajbVar2.b && i53 < ajbVar2.c) {
                                                                                                    hashSet9.add(ajbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new jz0(ajbVar2, (byte) 9));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ajb.g((TL_iv.pageTableCell) obj2);
                                                                                                if (g.isEmpty()) {
                                                                                                    arrayList = arrayList3;
                                                                                                } else {
                                                                                                    if (sb.length() > 0) {
                                                                                                        arrayList = arrayList3;
                                                                                                        sb.append("\n");
                                                                                                    } else {
                                                                                                        arrayList = arrayList3;
                                                                                                    }
                                                                                                    sb.append(g);
                                                                                                }
                                                                                                arrayList3 = arrayList;
                                                                                            }
                                                                                            TL_iv.pageTableCell pagetablecell7 = ajbVar2.d[i47][i48];
                                                                                            int i55 = (i50 - i48) + 1;
                                                                                            int i56 = (i49 - i47) + 1;
                                                                                            if (i55 <= 1) {
                                                                                                i55 = 0;
                                                                                            }
                                                                                            pagetablecell7.colspan = i55;
                                                                                            if (i56 <= 1) {
                                                                                                i56 = 0;
                                                                                            }
                                                                                            pagetablecell7.rowspan = i56;
                                                                                            int i57 = pagetablecell7.flags;
                                                                                            int i58 = i55 > 0 ? i57 | 2 : i57 & (-3);
                                                                                            pagetablecell7.flags = i58;
                                                                                            pagetablecell7.flags = i56 > 0 ? i58 | 4 : i58 & (-5);
                                                                                            ajb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ajbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ajbVar2.i();
                                                                                            xl9Var3.x();
                                                                                            xl9Var3.w.invalidate();
                                                                                            xl9Var3.s(i45, i46);
                                                                                            xl9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ajb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = xl9Var3.G.b(pagetablecell9);
                                                                            int a4 = xl9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (xl9Var3.G.p(pagetablecell9)) {
                                                                                xl9Var3.x();
                                                                                xl9Var3.w.invalidate();
                                                                                xl9Var3.s(b10, a4);
                                                                                xl9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 4:
                                                                        xl9Var3.h(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 5:
                                                                        xl9Var3.h(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 6:
                                                                        xl9Var3.j(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 7:
                                                                        xl9Var3.j(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = xl9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ajb ajbVar3 = xl9Var3.G;
                                                                            ajbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ajbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ajbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ajbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ajbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ajbVar3.a.rows.clear();
                                                                                    ajbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ajbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ajbVar3.b(pagetablecell10);
                                                                                        int a6 = ajbVar3.a(pagetablecell10);
                                                                                        int o4 = ajb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ajbVar3.c; i67++) {
                                                                                            if (!zArr3[i67]) {
                                                                                                if (i66 < 0) {
                                                                                                    i66 = i67;
                                                                                                }
                                                                                                i65++;
                                                                                            }
                                                                                        }
                                                                                        if (i66 >= 0) {
                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b11, iArr5[i66], o4, i65});
                                                                                        }
                                                                                        iArr4 = iArr5;
                                                                                    }
                                                                                    ajbVar3.j(identityHashMap2, ajbVar3.b);
                                                                                    ajbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z11) {
                                                                                xl9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                        final byte b9 = 7;
                                                        O.b(R.drawable.iv_table_insert_bottom, ob6.M0(2131754004, str2), new Runnable(this) { // from class: hh9
                                                            public final /* synthetic */ pi9 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
                                                            
                                                                if (r4 > 1) goto L75;
                                                             */
                                                            @Override // java.lang.Runnable
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void run() {
                                                                pi9 pi9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b9;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                pi9 pi9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = xl9Var3.I;
                                                                        if (xl9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            pi9Var = pi9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = xl9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ajb ajbVar = xl9Var3.G;
                                                                            ajbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                pi9Var = pi9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ajbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ajbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ajbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ajbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ajbVar.a.rows.clear();
                                                                                    ajbVar.i();
                                                                                    pi9Var = pi9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ajbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ajbVar.b(pagetablecell4);
                                                                                        int a2 = ajbVar.a(pagetablecell4);
                                                                                        int o2 = ajb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        pi9 pi9Var3 = pi9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ajbVar.b; i44++) {
                                                                                            if (!zArr2[i44]) {
                                                                                                if (i43 < 0) {
                                                                                                    i43 = i44;
                                                                                                }
                                                                                                i42++;
                                                                                            }
                                                                                        }
                                                                                        if (i43 >= 0) {
                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i43], a2, i42, i41});
                                                                                        }
                                                                                        zArr = zArr2;
                                                                                        pi9Var2 = pi9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    pi9Var = pi9Var2;
                                                                                    ajbVar.j(identityHashMap, i38);
                                                                                    ajbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z10) {
                                                                                xl9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        pi9Var.J2();
                                                                        break;
                                                                    case 1:
                                                                        mk0 row = xl9Var3.getRow();
                                                                        pi9Var2.J2();
                                                                        if (row != null) {
                                                                            ch9 ch9Var = pi9Var2.R3;
                                                                            if (ch9Var != null) {
                                                                                ch9Var.d();
                                                                            }
                                                                            pi9Var2.t4(row);
                                                                            ch9 ch9Var2 = pi9Var2.R3;
                                                                            if (ch9Var2 != null) {
                                                                                ch9Var2.h();
                                                                            }
                                                                            ni9 ni9Var = pi9Var2.p3;
                                                                            if (ni9Var != null) {
                                                                                ni9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = xl9Var3.I;
                                                                        if (xl9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, xl9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, xl9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ajb ajbVar2 = xl9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b92 = ajbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ajbVar2.a(pagetablecell6);
                                                                                        int o3 = ajb.o(pagetablecell6);
                                                                                        int i51 = pagetablecell6.colspan;
                                                                                        if (i51 == 0) {
                                                                                            i51 = 1;
                                                                                        }
                                                                                        i47 = Math.min(i47, b92);
                                                                                        i48 = Math.min(i48, a3);
                                                                                        i49 = Math.max(i49, (b92 + o3) - 1);
                                                                                        i50 = Math.max(i50, (a3 + i51) - 1);
                                                                                        c = c2;
                                                                                    }
                                                                                    HashSet hashSet9 = new HashSet();
                                                                                    int i52 = i47;
                                                                                    while (true) {
                                                                                        if (i52 <= i49) {
                                                                                            for (int i53 = i48; i53 <= i50; i53++) {
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ajbVar2.b && i53 < ajbVar2.c) {
                                                                                                    hashSet9.add(ajbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new jz0(ajbVar2, (byte) 9));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ajb.g((TL_iv.pageTableCell) obj2);
                                                                                                if (g.isEmpty()) {
                                                                                                    arrayList = arrayList3;
                                                                                                } else {
                                                                                                    if (sb.length() > 0) {
                                                                                                        arrayList = arrayList3;
                                                                                                        sb.append("\n");
                                                                                                    } else {
                                                                                                        arrayList = arrayList3;
                                                                                                    }
                                                                                                    sb.append(g);
                                                                                                }
                                                                                                arrayList3 = arrayList;
                                                                                            }
                                                                                            TL_iv.pageTableCell pagetablecell7 = ajbVar2.d[i47][i48];
                                                                                            int i55 = (i50 - i48) + 1;
                                                                                            int i56 = (i49 - i47) + 1;
                                                                                            if (i55 <= 1) {
                                                                                                i55 = 0;
                                                                                            }
                                                                                            pagetablecell7.colspan = i55;
                                                                                            if (i56 <= 1) {
                                                                                                i56 = 0;
                                                                                            }
                                                                                            pagetablecell7.rowspan = i56;
                                                                                            int i57 = pagetablecell7.flags;
                                                                                            int i58 = i55 > 0 ? i57 | 2 : i57 & (-3);
                                                                                            pagetablecell7.flags = i58;
                                                                                            pagetablecell7.flags = i56 > 0 ? i58 | 4 : i58 & (-5);
                                                                                            ajb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ajbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ajbVar2.i();
                                                                                            xl9Var3.x();
                                                                                            xl9Var3.w.invalidate();
                                                                                            xl9Var3.s(i45, i46);
                                                                                            xl9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ajb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = xl9Var3.G.b(pagetablecell9);
                                                                            int a4 = xl9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (xl9Var3.G.p(pagetablecell9)) {
                                                                                xl9Var3.x();
                                                                                xl9Var3.w.invalidate();
                                                                                xl9Var3.s(b10, a4);
                                                                                xl9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 4:
                                                                        xl9Var3.h(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 5:
                                                                        xl9Var3.h(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 6:
                                                                        xl9Var3.j(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 7:
                                                                        xl9Var3.j(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = xl9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ajb ajbVar3 = xl9Var3.G;
                                                                            ajbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ajbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ajbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ajbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ajbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ajbVar3.a.rows.clear();
                                                                                    ajbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ajbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ajbVar3.b(pagetablecell10);
                                                                                        int a6 = ajbVar3.a(pagetablecell10);
                                                                                        int o4 = ajb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ajbVar3.c; i67++) {
                                                                                            if (!zArr3[i67]) {
                                                                                                if (i66 < 0) {
                                                                                                    i66 = i67;
                                                                                                }
                                                                                                i65++;
                                                                                            }
                                                                                        }
                                                                                        if (i66 >= 0) {
                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b11, iArr5[i66], o4, i65});
                                                                                        }
                                                                                        iArr4 = iArr5;
                                                                                    }
                                                                                    ajbVar3.j(identityHashMap2, ajbVar3.b);
                                                                                    ajbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z11) {
                                                                                xl9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                    }
                                                    if (i9 == 0) {
                                                        String M02 = ob6.M0(2131754032, str2);
                                                        final byte b10 = 8;
                                                        Runnable runnable = new Runnable(this) { // from class: hh9
                                                            public final /* synthetic */ pi9 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
                                                            
                                                                if (r4 > 1) goto L75;
                                                             */
                                                            @Override // java.lang.Runnable
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void run() {
                                                                pi9 pi9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b10;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                pi9 pi9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = xl9Var3.I;
                                                                        if (xl9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            pi9Var = pi9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = xl9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ajb ajbVar = xl9Var3.G;
                                                                            ajbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                pi9Var = pi9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ajbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ajbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ajbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ajbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ajbVar.a.rows.clear();
                                                                                    ajbVar.i();
                                                                                    pi9Var = pi9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ajbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ajbVar.b(pagetablecell4);
                                                                                        int a2 = ajbVar.a(pagetablecell4);
                                                                                        int o2 = ajb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        pi9 pi9Var3 = pi9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ajbVar.b; i44++) {
                                                                                            if (!zArr2[i44]) {
                                                                                                if (i43 < 0) {
                                                                                                    i43 = i44;
                                                                                                }
                                                                                                i42++;
                                                                                            }
                                                                                        }
                                                                                        if (i43 >= 0) {
                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i43], a2, i42, i41});
                                                                                        }
                                                                                        zArr = zArr2;
                                                                                        pi9Var2 = pi9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    pi9Var = pi9Var2;
                                                                                    ajbVar.j(identityHashMap, i38);
                                                                                    ajbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z10) {
                                                                                xl9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        pi9Var.J2();
                                                                        break;
                                                                    case 1:
                                                                        mk0 row = xl9Var3.getRow();
                                                                        pi9Var2.J2();
                                                                        if (row != null) {
                                                                            ch9 ch9Var = pi9Var2.R3;
                                                                            if (ch9Var != null) {
                                                                                ch9Var.d();
                                                                            }
                                                                            pi9Var2.t4(row);
                                                                            ch9 ch9Var2 = pi9Var2.R3;
                                                                            if (ch9Var2 != null) {
                                                                                ch9Var2.h();
                                                                            }
                                                                            ni9 ni9Var = pi9Var2.p3;
                                                                            if (ni9Var != null) {
                                                                                ni9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = xl9Var3.I;
                                                                        if (xl9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, xl9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, xl9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ajb ajbVar2 = xl9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b92 = ajbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ajbVar2.a(pagetablecell6);
                                                                                        int o3 = ajb.o(pagetablecell6);
                                                                                        int i51 = pagetablecell6.colspan;
                                                                                        if (i51 == 0) {
                                                                                            i51 = 1;
                                                                                        }
                                                                                        i47 = Math.min(i47, b92);
                                                                                        i48 = Math.min(i48, a3);
                                                                                        i49 = Math.max(i49, (b92 + o3) - 1);
                                                                                        i50 = Math.max(i50, (a3 + i51) - 1);
                                                                                        c = c2;
                                                                                    }
                                                                                    HashSet hashSet9 = new HashSet();
                                                                                    int i52 = i47;
                                                                                    while (true) {
                                                                                        if (i52 <= i49) {
                                                                                            for (int i53 = i48; i53 <= i50; i53++) {
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ajbVar2.b && i53 < ajbVar2.c) {
                                                                                                    hashSet9.add(ajbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new jz0(ajbVar2, (byte) 9));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ajb.g((TL_iv.pageTableCell) obj2);
                                                                                                if (g.isEmpty()) {
                                                                                                    arrayList = arrayList3;
                                                                                                } else {
                                                                                                    if (sb.length() > 0) {
                                                                                                        arrayList = arrayList3;
                                                                                                        sb.append("\n");
                                                                                                    } else {
                                                                                                        arrayList = arrayList3;
                                                                                                    }
                                                                                                    sb.append(g);
                                                                                                }
                                                                                                arrayList3 = arrayList;
                                                                                            }
                                                                                            TL_iv.pageTableCell pagetablecell7 = ajbVar2.d[i47][i48];
                                                                                            int i55 = (i50 - i48) + 1;
                                                                                            int i56 = (i49 - i47) + 1;
                                                                                            if (i55 <= 1) {
                                                                                                i55 = 0;
                                                                                            }
                                                                                            pagetablecell7.colspan = i55;
                                                                                            if (i56 <= 1) {
                                                                                                i56 = 0;
                                                                                            }
                                                                                            pagetablecell7.rowspan = i56;
                                                                                            int i57 = pagetablecell7.flags;
                                                                                            int i58 = i55 > 0 ? i57 | 2 : i57 & (-3);
                                                                                            pagetablecell7.flags = i58;
                                                                                            pagetablecell7.flags = i56 > 0 ? i58 | 4 : i58 & (-5);
                                                                                            ajb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ajbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ajbVar2.i();
                                                                                            xl9Var3.x();
                                                                                            xl9Var3.w.invalidate();
                                                                                            xl9Var3.s(i45, i46);
                                                                                            xl9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ajb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b102 = xl9Var3.G.b(pagetablecell9);
                                                                            int a4 = xl9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (xl9Var3.G.p(pagetablecell9)) {
                                                                                xl9Var3.x();
                                                                                xl9Var3.w.invalidate();
                                                                                xl9Var3.s(b102, a4);
                                                                                xl9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 4:
                                                                        xl9Var3.h(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 5:
                                                                        xl9Var3.h(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 6:
                                                                        xl9Var3.j(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 7:
                                                                        xl9Var3.j(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = xl9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ajb ajbVar3 = xl9Var3.G;
                                                                            ajbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ajbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ajbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ajbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ajbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ajbVar3.a.rows.clear();
                                                                                    ajbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ajbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ajbVar3.b(pagetablecell10);
                                                                                        int a6 = ajbVar3.a(pagetablecell10);
                                                                                        int o4 = ajb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ajbVar3.c; i67++) {
                                                                                            if (!zArr3[i67]) {
                                                                                                if (i66 < 0) {
                                                                                                    i66 = i67;
                                                                                                }
                                                                                                i65++;
                                                                                            }
                                                                                        }
                                                                                        if (i66 >= 0) {
                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b11, iArr5[i66], o4, i65});
                                                                                        }
                                                                                        iArr4 = iArr5;
                                                                                    }
                                                                                    ajbVar3.j(identityHashMap2, ajbVar3.b);
                                                                                    ajbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z11) {
                                                                                xl9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                        r9 = 1;
                                                        O.b(R.drawable.iv_table_remove, M02, runnable, true);
                                                    } else {
                                                        r9 = 1;
                                                    }
                                                    if (i11 != 0) {
                                                        final byte b11 = 0;
                                                        O.b(R.drawable.iv_table_remove, ob6.M0(2131754028, str2), new Runnable(this) { // from class: hh9
                                                            public final /* synthetic */ pi9 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
                                                            
                                                                if (r4 > 1) goto L75;
                                                             */
                                                            @Override // java.lang.Runnable
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void run() {
                                                                pi9 pi9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b11;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                pi9 pi9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = xl9Var3.I;
                                                                        if (xl9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            pi9Var = pi9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = xl9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ajb ajbVar = xl9Var3.G;
                                                                            ajbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                pi9Var = pi9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ajbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ajbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ajbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ajbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ajbVar.a.rows.clear();
                                                                                    ajbVar.i();
                                                                                    pi9Var = pi9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ajbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ajbVar.b(pagetablecell4);
                                                                                        int a2 = ajbVar.a(pagetablecell4);
                                                                                        int o2 = ajb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        pi9 pi9Var3 = pi9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ajbVar.b; i44++) {
                                                                                            if (!zArr2[i44]) {
                                                                                                if (i43 < 0) {
                                                                                                    i43 = i44;
                                                                                                }
                                                                                                i42++;
                                                                                            }
                                                                                        }
                                                                                        if (i43 >= 0) {
                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i43], a2, i42, i41});
                                                                                        }
                                                                                        zArr = zArr2;
                                                                                        pi9Var2 = pi9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    pi9Var = pi9Var2;
                                                                                    ajbVar.j(identityHashMap, i38);
                                                                                    ajbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z10) {
                                                                                xl9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        pi9Var.J2();
                                                                        break;
                                                                    case 1:
                                                                        mk0 row = xl9Var3.getRow();
                                                                        pi9Var2.J2();
                                                                        if (row != null) {
                                                                            ch9 ch9Var = pi9Var2.R3;
                                                                            if (ch9Var != null) {
                                                                                ch9Var.d();
                                                                            }
                                                                            pi9Var2.t4(row);
                                                                            ch9 ch9Var2 = pi9Var2.R3;
                                                                            if (ch9Var2 != null) {
                                                                                ch9Var2.h();
                                                                            }
                                                                            ni9 ni9Var = pi9Var2.p3;
                                                                            if (ni9Var != null) {
                                                                                ni9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = xl9Var3.I;
                                                                        if (xl9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, xl9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, xl9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ajb ajbVar2 = xl9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b92 = ajbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ajbVar2.a(pagetablecell6);
                                                                                        int o3 = ajb.o(pagetablecell6);
                                                                                        int i51 = pagetablecell6.colspan;
                                                                                        if (i51 == 0) {
                                                                                            i51 = 1;
                                                                                        }
                                                                                        i47 = Math.min(i47, b92);
                                                                                        i48 = Math.min(i48, a3);
                                                                                        i49 = Math.max(i49, (b92 + o3) - 1);
                                                                                        i50 = Math.max(i50, (a3 + i51) - 1);
                                                                                        c = c2;
                                                                                    }
                                                                                    HashSet hashSet9 = new HashSet();
                                                                                    int i52 = i47;
                                                                                    while (true) {
                                                                                        if (i52 <= i49) {
                                                                                            for (int i53 = i48; i53 <= i50; i53++) {
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ajbVar2.b && i53 < ajbVar2.c) {
                                                                                                    hashSet9.add(ajbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new jz0(ajbVar2, (byte) 9));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ajb.g((TL_iv.pageTableCell) obj2);
                                                                                                if (g.isEmpty()) {
                                                                                                    arrayList = arrayList3;
                                                                                                } else {
                                                                                                    if (sb.length() > 0) {
                                                                                                        arrayList = arrayList3;
                                                                                                        sb.append("\n");
                                                                                                    } else {
                                                                                                        arrayList = arrayList3;
                                                                                                    }
                                                                                                    sb.append(g);
                                                                                                }
                                                                                                arrayList3 = arrayList;
                                                                                            }
                                                                                            TL_iv.pageTableCell pagetablecell7 = ajbVar2.d[i47][i48];
                                                                                            int i55 = (i50 - i48) + 1;
                                                                                            int i56 = (i49 - i47) + 1;
                                                                                            if (i55 <= 1) {
                                                                                                i55 = 0;
                                                                                            }
                                                                                            pagetablecell7.colspan = i55;
                                                                                            if (i56 <= 1) {
                                                                                                i56 = 0;
                                                                                            }
                                                                                            pagetablecell7.rowspan = i56;
                                                                                            int i57 = pagetablecell7.flags;
                                                                                            int i58 = i55 > 0 ? i57 | 2 : i57 & (-3);
                                                                                            pagetablecell7.flags = i58;
                                                                                            pagetablecell7.flags = i56 > 0 ? i58 | 4 : i58 & (-5);
                                                                                            ajb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ajbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ajbVar2.i();
                                                                                            xl9Var3.x();
                                                                                            xl9Var3.w.invalidate();
                                                                                            xl9Var3.s(i45, i46);
                                                                                            xl9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ajb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b102 = xl9Var3.G.b(pagetablecell9);
                                                                            int a4 = xl9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (xl9Var3.G.p(pagetablecell9)) {
                                                                                xl9Var3.x();
                                                                                xl9Var3.w.invalidate();
                                                                                xl9Var3.s(b102, a4);
                                                                                xl9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 4:
                                                                        xl9Var3.h(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 5:
                                                                        xl9Var3.h(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 6:
                                                                        xl9Var3.j(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 7:
                                                                        xl9Var3.j(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = xl9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ajb ajbVar3 = xl9Var3.G;
                                                                            ajbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ajbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ajbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ajbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ajbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ajbVar3.a.rows.clear();
                                                                                    ajbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ajbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b112 = ajbVar3.b(pagetablecell10);
                                                                                        int a6 = ajbVar3.a(pagetablecell10);
                                                                                        int o4 = ajb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ajbVar3.c; i67++) {
                                                                                            if (!zArr3[i67]) {
                                                                                                if (i66 < 0) {
                                                                                                    i66 = i67;
                                                                                                }
                                                                                                i65++;
                                                                                            }
                                                                                        }
                                                                                        if (i66 >= 0) {
                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b112, iArr5[i66], o4, i65});
                                                                                        }
                                                                                        iArr4 = iArr5;
                                                                                    }
                                                                                    ajbVar3.j(identityHashMap2, ajbVar3.b);
                                                                                    ajbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z11) {
                                                                                xl9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                }
                                                            }
                                                        }, r9);
                                                    }
                                                    if (z5) {
                                                        O.b(R.drawable.iv_table_remove, ob6.M0(2131754027, str2), new Runnable(this) { // from class: hh9
                                                            public final /* synthetic */ pi9 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
                                                            
                                                                if (r4 > 1) goto L75;
                                                             */
                                                            @Override // java.lang.Runnable
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void run() {
                                                                pi9 pi9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = r9;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                pi9 pi9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = xl9Var3.I;
                                                                        if (xl9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            pi9Var = pi9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = xl9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ajb ajbVar = xl9Var3.G;
                                                                            ajbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                pi9Var = pi9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ajbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ajbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ajbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ajbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ajbVar.a.rows.clear();
                                                                                    ajbVar.i();
                                                                                    pi9Var = pi9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ajbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ajbVar.b(pagetablecell4);
                                                                                        int a2 = ajbVar.a(pagetablecell4);
                                                                                        int o2 = ajb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        pi9 pi9Var3 = pi9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ajbVar.b; i44++) {
                                                                                            if (!zArr2[i44]) {
                                                                                                if (i43 < 0) {
                                                                                                    i43 = i44;
                                                                                                }
                                                                                                i42++;
                                                                                            }
                                                                                        }
                                                                                        if (i43 >= 0) {
                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i43], a2, i42, i41});
                                                                                        }
                                                                                        zArr = zArr2;
                                                                                        pi9Var2 = pi9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    pi9Var = pi9Var2;
                                                                                    ajbVar.j(identityHashMap, i38);
                                                                                    ajbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z10) {
                                                                                xl9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        pi9Var.J2();
                                                                        break;
                                                                    case 1:
                                                                        mk0 row = xl9Var3.getRow();
                                                                        pi9Var2.J2();
                                                                        if (row != null) {
                                                                            ch9 ch9Var = pi9Var2.R3;
                                                                            if (ch9Var != null) {
                                                                                ch9Var.d();
                                                                            }
                                                                            pi9Var2.t4(row);
                                                                            ch9 ch9Var2 = pi9Var2.R3;
                                                                            if (ch9Var2 != null) {
                                                                                ch9Var2.h();
                                                                            }
                                                                            ni9 ni9Var = pi9Var2.p3;
                                                                            if (ni9Var != null) {
                                                                                ni9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = xl9Var3.I;
                                                                        if (xl9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, xl9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, xl9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ajb ajbVar2 = xl9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b92 = ajbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ajbVar2.a(pagetablecell6);
                                                                                        int o3 = ajb.o(pagetablecell6);
                                                                                        int i51 = pagetablecell6.colspan;
                                                                                        if (i51 == 0) {
                                                                                            i51 = 1;
                                                                                        }
                                                                                        i47 = Math.min(i47, b92);
                                                                                        i48 = Math.min(i48, a3);
                                                                                        i49 = Math.max(i49, (b92 + o3) - 1);
                                                                                        i50 = Math.max(i50, (a3 + i51) - 1);
                                                                                        c = c2;
                                                                                    }
                                                                                    HashSet hashSet9 = new HashSet();
                                                                                    int i52 = i47;
                                                                                    while (true) {
                                                                                        if (i52 <= i49) {
                                                                                            for (int i53 = i48; i53 <= i50; i53++) {
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ajbVar2.b && i53 < ajbVar2.c) {
                                                                                                    hashSet9.add(ajbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new jz0(ajbVar2, (byte) 9));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ajb.g((TL_iv.pageTableCell) obj2);
                                                                                                if (g.isEmpty()) {
                                                                                                    arrayList = arrayList3;
                                                                                                } else {
                                                                                                    if (sb.length() > 0) {
                                                                                                        arrayList = arrayList3;
                                                                                                        sb.append("\n");
                                                                                                    } else {
                                                                                                        arrayList = arrayList3;
                                                                                                    }
                                                                                                    sb.append(g);
                                                                                                }
                                                                                                arrayList3 = arrayList;
                                                                                            }
                                                                                            TL_iv.pageTableCell pagetablecell7 = ajbVar2.d[i47][i48];
                                                                                            int i55 = (i50 - i48) + 1;
                                                                                            int i56 = (i49 - i47) + 1;
                                                                                            if (i55 <= 1) {
                                                                                                i55 = 0;
                                                                                            }
                                                                                            pagetablecell7.colspan = i55;
                                                                                            if (i56 <= 1) {
                                                                                                i56 = 0;
                                                                                            }
                                                                                            pagetablecell7.rowspan = i56;
                                                                                            int i57 = pagetablecell7.flags;
                                                                                            int i58 = i55 > 0 ? i57 | 2 : i57 & (-3);
                                                                                            pagetablecell7.flags = i58;
                                                                                            pagetablecell7.flags = i56 > 0 ? i58 | 4 : i58 & (-5);
                                                                                            ajb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ajbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ajbVar2.i();
                                                                                            xl9Var3.x();
                                                                                            xl9Var3.w.invalidate();
                                                                                            xl9Var3.s(i45, i46);
                                                                                            xl9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ajb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b102 = xl9Var3.G.b(pagetablecell9);
                                                                            int a4 = xl9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (xl9Var3.G.p(pagetablecell9)) {
                                                                                xl9Var3.x();
                                                                                xl9Var3.w.invalidate();
                                                                                xl9Var3.s(b102, a4);
                                                                                xl9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 4:
                                                                        xl9Var3.h(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 5:
                                                                        xl9Var3.h(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 6:
                                                                        xl9Var3.j(true);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    case 7:
                                                                        xl9Var3.j(false);
                                                                        pi9Var2.J2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = xl9Var3.I;
                                                                        if (xl9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = xl9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ajb ajbVar3 = xl9Var3.G;
                                                                            ajbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ajbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ajbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ajbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ajbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ajbVar3.a.rows.clear();
                                                                                    ajbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ajbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b112 = ajbVar3.b(pagetablecell10);
                                                                                        int a6 = ajbVar3.a(pagetablecell10);
                                                                                        int o4 = ajb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ajbVar3.c; i67++) {
                                                                                            if (!zArr3[i67]) {
                                                                                                if (i66 < 0) {
                                                                                                    i66 = i67;
                                                                                                }
                                                                                                i65++;
                                                                                            }
                                                                                        }
                                                                                        if (i66 >= 0) {
                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b112, iArr5[i66], o4, i65});
                                                                                        }
                                                                                        iArr4 = iArr5;
                                                                                    }
                                                                                    ajbVar3.j(identityHashMap2, ajbVar3.b);
                                                                                    ajbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            xl9Var3.x();
                                                                            if (z11) {
                                                                                xl9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        pi9Var2.J2();
                                                                        break;
                                                                }
                                                            }
                                                        }, r9);
                                                        O.n(r9);
                                                        final byte b12 = 0;
                                                        O.h(new Runnable() { // from class: ih9
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b13 = b12;
                                                                b8[] b8VarArr = r4;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                ajb ajbVar = model;
                                                                fu5 fu5Var2 = O;
                                                                switch (b13) {
                                                                    case 0:
                                                                        fu5Var2.t0 = true;
                                                                        boolean z10 = !ajbVar.a.bordered;
                                                                        ajb ajbVar2 = xl9Var3.G;
                                                                        if (ajbVar2 != null) {
                                                                            TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                            if (pageblocktable2.bordered != z10) {
                                                                                pageblocktable2.bordered = z10;
                                                                                xl9Var3.w.invalidate();
                                                                                xh9 xh9Var = xl9Var3.F;
                                                                                if (xh9Var != null && xl9Var3.a != null) {
                                                                                    xh9Var.a();
                                                                                }
                                                                            }
                                                                        }
                                                                        b8VarArr[0].setChecked(z10);
                                                                        break;
                                                                    default:
                                                                        fu5Var2.t0 = true;
                                                                        boolean z11 = !ajbVar.a.compact;
                                                                        ajb ajbVar3 = xl9Var3.G;
                                                                        if (ajbVar3 != null) {
                                                                            TL_iv.pageBlockTable pageblocktable3 = ajbVar3.a;
                                                                            if (pageblocktable3.compact != z11) {
                                                                                pageblocktable3.compact = z11;
                                                                                zl9 zl9Var = xl9Var3.w;
                                                                                if (zl9Var.a != null) {
                                                                                    for (int i37 = 0; i37 < zl9Var.getChildCount(); i37++) {
                                                                                        View childAt = zl9Var.getChildAt(i37);
                                                                                        if (childAt instanceof am9) {
                                                                                            ((am9) childAt).setCompact(zl9Var.a.a.compact);
                                                                                        }
                                                                                    }
                                                                                    zl9Var.requestLayout();
                                                                                    zl9Var.invalidate();
                                                                                }
                                                                                xl9Var3.x.requestLayout();
                                                                                xl9Var3.requestLayout();
                                                                                xh9 xh9Var2 = xl9Var3.F;
                                                                                if (xh9Var2 != null && xl9Var3.a != null) {
                                                                                    xh9Var2.a();
                                                                                }
                                                                            }
                                                                        }
                                                                        b8VarArr[1].setChecked(z11);
                                                                        break;
                                                                }
                                                            }
                                                        }, ob6.M0(2131753984, str2), pageblocktable.bordered);
                                                        final byte b13 = 1;
                                                        xl9Var2 = xl9Var;
                                                        O.h(new Runnable() { // from class: ih9
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b132 = b13;
                                                                b8[] b8VarArr = r4;
                                                                xl9 xl9Var3 = xl9Var2;
                                                                ajb ajbVar = model;
                                                                fu5 fu5Var2 = O;
                                                                switch (b132) {
                                                                    case 0:
                                                                        fu5Var2.t0 = true;
                                                                        boolean z10 = !ajbVar.a.bordered;
                                                                        ajb ajbVar2 = xl9Var3.G;
                                                                        if (ajbVar2 != null) {
                                                                            TL_iv.pageBlockTable pageblocktable2 = ajbVar2.a;
                                                                            if (pageblocktable2.bordered != z10) {
                                                                                pageblocktable2.bordered = z10;
                                                                                xl9Var3.w.invalidate();
                                                                                xh9 xh9Var = xl9Var3.F;
                                                                                if (xh9Var != null && xl9Var3.a != null) {
                                                                                    xh9Var.a();
                                                                                }
                                                                            }
                                                                        }
                                                                        b8VarArr[0].setChecked(z10);
                                                                        break;
                                                                    default:
                                                                        fu5Var2.t0 = true;
                                                                        boolean z11 = !ajbVar.a.compact;
                                                                        ajb ajbVar3 = xl9Var3.G;
                                                                        if (ajbVar3 != null) {
                                                                            TL_iv.pageBlockTable pageblocktable3 = ajbVar3.a;
                                                                            if (pageblocktable3.compact != z11) {
                                                                                pageblocktable3.compact = z11;
                                                                                zl9 zl9Var = xl9Var3.w;
                                                                                if (zl9Var.a != null) {
                                                                                    for (int i37 = 0; i37 < zl9Var.getChildCount(); i37++) {
                                                                                        View childAt = zl9Var.getChildAt(i37);
                                                                                        if (childAt instanceof am9) {
                                                                                            ((am9) childAt).setCompact(zl9Var.a.a.compact);
                                                                                        }
                                                                                    }
                                                                                    zl9Var.requestLayout();
                                                                                    zl9Var.invalidate();
                                                                                }
                                                                                xl9Var3.x.requestLayout();
                                                                                xl9Var3.requestLayout();
                                                                                xh9 xh9Var2 = xl9Var3.F;
                                                                                if (xh9Var2 != null && xl9Var3.a != null) {
                                                                                    xh9Var2.a();
                                                                                }
                                                                            }
                                                                        }
                                                                        b8VarArr[1].setChecked(z11);
                                                                        break;
                                                                }
                                                            }
                                                        }, ob6.M0(2131753983, str2), pageblocktable.compact);
                                                        final b8[] b8VarArr = {O.z(), O.z()};
                                                    }
                                                    O.p = new sa8(this, O, xl9Var2, (byte) 20);
                                                    this.r4 = O;
                                                    O.a0();
                                                }
                                                z6 = false;
                                                if (!z6) {
                                                }
                                                O.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new yn6((Object) this, (Object) xl9Var2, z6, (byte) 17), false);
                                                if (i8 == 0) {
                                                }
                                                if (i10 != 0) {
                                                }
                                                if (i6 != 0) {
                                                }
                                                if (i7 != 0) {
                                                }
                                                if (i9 == 0) {
                                                }
                                                if (i11 != 0) {
                                                }
                                                if (z5) {
                                                }
                                                O.p = new sa8(this, O, xl9Var2, (byte) 20);
                                                this.r4 = O;
                                                O.a0();
                                            }
                                        }
                                        i5 = 0;
                                        if (z4) {
                                        }
                                        if (z4) {
                                        }
                                        fu5Var = this.r4;
                                        i8 = i;
                                        if (fu5Var != null) {
                                        }
                                        L = hl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                                        FrameLayout T422 = T4(xl9Var2, false);
                                        i9 = i5;
                                        iArr = new int[2];
                                        T422.getLocationOnScreen(iArr);
                                        if ((iArr[i3] - L) - hl.L(8.0f) >= hl.L(8.0f) + hl.m) {
                                        }
                                        final fu5 O2 = this.p3.O(T4);
                                        O2.s = (short) 0;
                                        O2.t = false;
                                        O2.f0 = r1;
                                        LinearLayout linearLayout3 = new LinearLayout(getContext());
                                        linearLayout3.setMinimumWidth(hl.L(208.0f));
                                        linearLayout3.setOrientation(r1);
                                        TextView textView2 = new TextView(getContext());
                                        i10 = i2;
                                        i11 = i4;
                                        qd4.u(12.0f, 2131754050, 1, textView2, null);
                                        textView2.setGravity(17);
                                        int i332 = aob.y6;
                                        vnb vnbVar2 = this.o3;
                                        yob.X(textView2, i332, vnbVar2);
                                        linearLayout3.addView(textView2, tre.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                        LinearLayout linearLayout22 = new LinearLayout(getContext());
                                        boolean z82 = z;
                                        linearLayout22.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                                        linearLayout22.setOrientation(0);
                                        linearLayout3.addView(linearLayout22, tre.r(-2, -2, 17));
                                        ug9 ug9Var7 = new ug9(R.drawable.iv_align_horiz_left, vnbVar2, getContext());
                                        ug9Var7.e = (byte) 4;
                                        ug9Var7.updateColors();
                                        ug9Var7.b();
                                        int i342 = aob.G8;
                                        ug9Var7.c(i342);
                                        linearLayout22.addView(ug9Var7, tre.o(32, 32));
                                        ug9 ug9Var22 = new ug9(R.drawable.iv_align_horiz_middle, vnbVar2, getContext());
                                        ug9Var22.e = (byte) 4;
                                        ug9Var22.updateColors();
                                        ug9Var22.b();
                                        ug9Var22.c(i342);
                                        linearLayout22.addView(ug9Var22, tre.o(32, 32));
                                        ug9 ug9Var32 = new ug9(R.drawable.iv_align_horiz_right, vnbVar2, getContext());
                                        ug9Var32.e = (byte) 4;
                                        ug9Var32.updateColors();
                                        ug9Var32.b();
                                        ug9Var32.c(i342);
                                        final ug9[] ug9VarArr3 = {ug9Var7, ug9Var22, ug9Var32};
                                        boolean z92 = z2;
                                        linearLayout22.addView(ug9Var32, tre.o(32, 32));
                                        z5 = z3;
                                        linearLayout22.addView(new Space(getContext()), tre.o(8, 0));
                                        ug9 ug9Var42 = new ug9(R.drawable.iv_align_vert_top, vnbVar2, getContext());
                                        ug9Var42.e = (byte) 4;
                                        ug9Var42.updateColors();
                                        ug9Var42.b();
                                        ug9Var42.c(i342);
                                        linearLayout22.addView(ug9Var42, tre.o(32, 32));
                                        ug9 ug9Var52 = new ug9(R.drawable.iv_align_vert_middle, vnbVar2, getContext());
                                        ug9Var52.e = (byte) 4;
                                        ug9Var52.updateColors();
                                        ug9Var52.b();
                                        ug9Var52.c(i342);
                                        linearLayout22.addView(ug9Var52, tre.o(32, 32));
                                        ug9 ug9Var62 = new ug9(R.drawable.iv_align_vert_bottom, vnbVar2, getContext());
                                        ug9Var62.e = (byte) 4;
                                        ug9Var62.updateColors();
                                        ug9Var62.b();
                                        ug9Var62.c(i342);
                                        final ug9[] ug9VarArr22 = {ug9Var42, ug9Var52, ug9Var62};
                                        linearLayout22.addView(ug9Var62, tre.o(32, 32));
                                        O2.p(linearLayout3);
                                        it3 = linkedHashSet.iterator();
                                        int i352 = -1;
                                        while (true) {
                                            if (!it3.hasNext()) {
                                            }
                                        }
                                        it4 = linkedHashSet.iterator();
                                        int i362 = -1;
                                        while (true) {
                                            if (!it4.hasNext()) {
                                            }
                                        }
                                        i13 = 0;
                                        while (i13 < 3) {
                                        }
                                        i15 = 0;
                                        while (i15 < 3) {
                                        }
                                        while (i16 < 3) {
                                        }
                                        i17 = 0;
                                        while (i17 < i14) {
                                        }
                                        O2.n(true);
                                        O2.Y = jn7.l3;
                                        if (!linkedHashSet.isEmpty()) {
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        O2.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new yn6((Object) this, (Object) xl9Var2, z6, (byte) 17), false);
                                        if (i8 == 0) {
                                        }
                                        if (i10 != 0) {
                                        }
                                        if (i6 != 0) {
                                        }
                                        if (i7 != 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i11 != 0) {
                                        }
                                        if (z5) {
                                        }
                                        O2.p = new sa8(this, O2, xl9Var2, (byte) 20);
                                        this.r4 = O2;
                                        O2.a0();
                                    }
                                }
                                i4 = 0;
                                if (z2) {
                                    hashSet3 = new HashSet();
                                    it5 = selectedCells.iterator();
                                    while (it5.hasNext()) {
                                    }
                                    if (hashSet3.size() < model.c) {
                                    }
                                }
                                i5 = 0;
                                if (z4) {
                                }
                                if (z4) {
                                }
                                fu5Var = this.r4;
                                i8 = i;
                                if (fu5Var != null) {
                                }
                                L = hl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                                FrameLayout T4222 = T4(xl9Var2, false);
                                i9 = i5;
                                iArr = new int[2];
                                T4222.getLocationOnScreen(iArr);
                                if ((iArr[i3] - L) - hl.L(8.0f) >= hl.L(8.0f) + hl.m) {
                                }
                                final fu5 O22 = this.p3.O(T4);
                                O22.s = (short) 0;
                                O22.t = false;
                                O22.f0 = r1;
                                LinearLayout linearLayout32 = new LinearLayout(getContext());
                                linearLayout32.setMinimumWidth(hl.L(208.0f));
                                linearLayout32.setOrientation(r1);
                                TextView textView22 = new TextView(getContext());
                                i10 = i2;
                                i11 = i4;
                                qd4.u(12.0f, 2131754050, 1, textView22, null);
                                textView22.setGravity(17);
                                int i3322 = aob.y6;
                                vnb vnbVar22 = this.o3;
                                yob.X(textView22, i3322, vnbVar22);
                                linearLayout32.addView(textView22, tre.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                LinearLayout linearLayout222 = new LinearLayout(getContext());
                                boolean z822 = z;
                                linearLayout222.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                                linearLayout222.setOrientation(0);
                                linearLayout32.addView(linearLayout222, tre.r(-2, -2, 17));
                                ug9 ug9Var72 = new ug9(R.drawable.iv_align_horiz_left, vnbVar22, getContext());
                                ug9Var72.e = (byte) 4;
                                ug9Var72.updateColors();
                                ug9Var72.b();
                                int i3422 = aob.G8;
                                ug9Var72.c(i3422);
                                linearLayout222.addView(ug9Var72, tre.o(32, 32));
                                ug9 ug9Var222 = new ug9(R.drawable.iv_align_horiz_middle, vnbVar22, getContext());
                                ug9Var222.e = (byte) 4;
                                ug9Var222.updateColors();
                                ug9Var222.b();
                                ug9Var222.c(i3422);
                                linearLayout222.addView(ug9Var222, tre.o(32, 32));
                                ug9 ug9Var322 = new ug9(R.drawable.iv_align_horiz_right, vnbVar22, getContext());
                                ug9Var322.e = (byte) 4;
                                ug9Var322.updateColors();
                                ug9Var322.b();
                                ug9Var322.c(i3422);
                                final ug9[] ug9VarArr32 = {ug9Var72, ug9Var222, ug9Var322};
                                boolean z922 = z2;
                                linearLayout222.addView(ug9Var322, tre.o(32, 32));
                                z5 = z3;
                                linearLayout222.addView(new Space(getContext()), tre.o(8, 0));
                                ug9 ug9Var422 = new ug9(R.drawable.iv_align_vert_top, vnbVar22, getContext());
                                ug9Var422.e = (byte) 4;
                                ug9Var422.updateColors();
                                ug9Var422.b();
                                ug9Var422.c(i3422);
                                linearLayout222.addView(ug9Var422, tre.o(32, 32));
                                ug9 ug9Var522 = new ug9(R.drawable.iv_align_vert_middle, vnbVar22, getContext());
                                ug9Var522.e = (byte) 4;
                                ug9Var522.updateColors();
                                ug9Var522.b();
                                ug9Var522.c(i3422);
                                linearLayout222.addView(ug9Var522, tre.o(32, 32));
                                ug9 ug9Var622 = new ug9(R.drawable.iv_align_vert_bottom, vnbVar22, getContext());
                                ug9Var622.e = (byte) 4;
                                ug9Var622.updateColors();
                                ug9Var622.b();
                                ug9Var622.c(i3422);
                                final ug9[] ug9VarArr222 = {ug9Var422, ug9Var522, ug9Var622};
                                linearLayout222.addView(ug9Var622, tre.o(32, 32));
                                O22.p(linearLayout32);
                                it3 = linkedHashSet.iterator();
                                int i3522 = -1;
                                while (true) {
                                    if (!it3.hasNext()) {
                                    }
                                }
                                it4 = linkedHashSet.iterator();
                                int i3622 = -1;
                                while (true) {
                                    if (!it4.hasNext()) {
                                    }
                                }
                                i13 = 0;
                                while (i13 < 3) {
                                }
                                i15 = 0;
                                while (i15 < 3) {
                                }
                                while (i16 < 3) {
                                }
                                i17 = 0;
                                while (i17 < i14) {
                                }
                                O22.n(true);
                                O22.Y = jn7.l3;
                                if (!linkedHashSet.isEmpty()) {
                                }
                                z6 = false;
                                if (!z6) {
                                }
                                O22.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new yn6((Object) this, (Object) xl9Var2, z6, (byte) 17), false);
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (z5) {
                                }
                                O22.p = new sa8(this, O22, xl9Var2, (byte) 20);
                                this.r4 = O22;
                                O22.a0();
                            }
                            z2 = false;
                            if (selectedCells.isEmpty()) {
                            }
                            z3 = false;
                            if (z3) {
                            }
                            if (z) {
                            }
                            i3 = 1;
                            i4 = 0;
                            if (z2) {
                            }
                            i5 = 0;
                            if (z4) {
                            }
                            if (z4) {
                            }
                            fu5Var = this.r4;
                            i8 = i;
                            if (fu5Var != null) {
                            }
                            L = hl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                            FrameLayout T42222 = T4(xl9Var2, false);
                            i9 = i5;
                            iArr = new int[2];
                            T42222.getLocationOnScreen(iArr);
                            if ((iArr[i3] - L) - hl.L(8.0f) >= hl.L(8.0f) + hl.m) {
                            }
                            final fu5 O222 = this.p3.O(T4);
                            O222.s = (short) 0;
                            O222.t = false;
                            O222.f0 = r1;
                            LinearLayout linearLayout322 = new LinearLayout(getContext());
                            linearLayout322.setMinimumWidth(hl.L(208.0f));
                            linearLayout322.setOrientation(r1);
                            TextView textView222 = new TextView(getContext());
                            i10 = i2;
                            i11 = i4;
                            qd4.u(12.0f, 2131754050, 1, textView222, null);
                            textView222.setGravity(17);
                            int i33222 = aob.y6;
                            vnb vnbVar222 = this.o3;
                            yob.X(textView222, i33222, vnbVar222);
                            linearLayout322.addView(textView222, tre.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                            LinearLayout linearLayout2222 = new LinearLayout(getContext());
                            boolean z8222 = z;
                            linearLayout2222.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                            linearLayout2222.setOrientation(0);
                            linearLayout322.addView(linearLayout2222, tre.r(-2, -2, 17));
                            ug9 ug9Var722 = new ug9(R.drawable.iv_align_horiz_left, vnbVar222, getContext());
                            ug9Var722.e = (byte) 4;
                            ug9Var722.updateColors();
                            ug9Var722.b();
                            int i34222 = aob.G8;
                            ug9Var722.c(i34222);
                            linearLayout2222.addView(ug9Var722, tre.o(32, 32));
                            ug9 ug9Var2222 = new ug9(R.drawable.iv_align_horiz_middle, vnbVar222, getContext());
                            ug9Var2222.e = (byte) 4;
                            ug9Var2222.updateColors();
                            ug9Var2222.b();
                            ug9Var2222.c(i34222);
                            linearLayout2222.addView(ug9Var2222, tre.o(32, 32));
                            ug9 ug9Var3222 = new ug9(R.drawable.iv_align_horiz_right, vnbVar222, getContext());
                            ug9Var3222.e = (byte) 4;
                            ug9Var3222.updateColors();
                            ug9Var3222.b();
                            ug9Var3222.c(i34222);
                            final ug9[] ug9VarArr322 = {ug9Var722, ug9Var2222, ug9Var3222};
                            boolean z9222 = z2;
                            linearLayout2222.addView(ug9Var3222, tre.o(32, 32));
                            z5 = z3;
                            linearLayout2222.addView(new Space(getContext()), tre.o(8, 0));
                            ug9 ug9Var4222 = new ug9(R.drawable.iv_align_vert_top, vnbVar222, getContext());
                            ug9Var4222.e = (byte) 4;
                            ug9Var4222.updateColors();
                            ug9Var4222.b();
                            ug9Var4222.c(i34222);
                            linearLayout2222.addView(ug9Var4222, tre.o(32, 32));
                            ug9 ug9Var5222 = new ug9(R.drawable.iv_align_vert_middle, vnbVar222, getContext());
                            ug9Var5222.e = (byte) 4;
                            ug9Var5222.updateColors();
                            ug9Var5222.b();
                            ug9Var5222.c(i34222);
                            linearLayout2222.addView(ug9Var5222, tre.o(32, 32));
                            ug9 ug9Var6222 = new ug9(R.drawable.iv_align_vert_bottom, vnbVar222, getContext());
                            ug9Var6222.e = (byte) 4;
                            ug9Var6222.updateColors();
                            ug9Var6222.b();
                            ug9Var6222.c(i34222);
                            final ug9[] ug9VarArr2222 = {ug9Var4222, ug9Var5222, ug9Var6222};
                            linearLayout2222.addView(ug9Var6222, tre.o(32, 32));
                            O222.p(linearLayout322);
                            it3 = linkedHashSet.iterator();
                            int i35222 = -1;
                            while (true) {
                                if (!it3.hasNext()) {
                                }
                            }
                            it4 = linkedHashSet.iterator();
                            int i36222 = -1;
                            while (true) {
                                if (!it4.hasNext()) {
                                }
                            }
                            i13 = 0;
                            while (i13 < 3) {
                            }
                            i15 = 0;
                            while (i15 < 3) {
                            }
                            while (i16 < 3) {
                            }
                            i17 = 0;
                            while (i17 < i14) {
                            }
                            O222.n(true);
                            O222.Y = jn7.l3;
                            if (!linkedHashSet.isEmpty()) {
                            }
                            z6 = false;
                            if (!z6) {
                            }
                            O222.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new yn6((Object) this, (Object) xl9Var2, z6, (byte) 17), false);
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (z5) {
                            }
                            O222.p = new sa8(this, O222, xl9Var2, (byte) 20);
                            this.r4 = O222;
                            O222.a0();
                        }
                        z = false;
                        hashSet2 = new HashSet();
                        it2 = selectedCells.iterator();
                        while (it2.hasNext()) {
                        }
                        if (!hashSet2.isEmpty()) {
                        }
                        z2 = false;
                        if (selectedCells.isEmpty()) {
                        }
                        z3 = false;
                        if (z3) {
                        }
                        if (z) {
                        }
                        i3 = 1;
                        i4 = 0;
                        if (z2) {
                        }
                        i5 = 0;
                        if (z4) {
                        }
                        if (z4) {
                        }
                        fu5Var = this.r4;
                        i8 = i;
                        if (fu5Var != null) {
                        }
                        L = hl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                        FrameLayout T422222 = T4(xl9Var2, false);
                        i9 = i5;
                        iArr = new int[2];
                        T422222.getLocationOnScreen(iArr);
                        if ((iArr[i3] - L) - hl.L(8.0f) >= hl.L(8.0f) + hl.m) {
                        }
                        final fu5 O2222 = this.p3.O(T4);
                        O2222.s = (short) 0;
                        O2222.t = false;
                        O2222.f0 = r1;
                        LinearLayout linearLayout3222 = new LinearLayout(getContext());
                        linearLayout3222.setMinimumWidth(hl.L(208.0f));
                        linearLayout3222.setOrientation(r1);
                        TextView textView2222 = new TextView(getContext());
                        i10 = i2;
                        i11 = i4;
                        qd4.u(12.0f, 2131754050, 1, textView2222, null);
                        textView2222.setGravity(17);
                        int i332222 = aob.y6;
                        vnb vnbVar2222 = this.o3;
                        yob.X(textView2222, i332222, vnbVar2222);
                        linearLayout3222.addView(textView2222, tre.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                        LinearLayout linearLayout22222 = new LinearLayout(getContext());
                        boolean z82222 = z;
                        linearLayout22222.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                        linearLayout22222.setOrientation(0);
                        linearLayout3222.addView(linearLayout22222, tre.r(-2, -2, 17));
                        ug9 ug9Var7222 = new ug9(R.drawable.iv_align_horiz_left, vnbVar2222, getContext());
                        ug9Var7222.e = (byte) 4;
                        ug9Var7222.updateColors();
                        ug9Var7222.b();
                        int i342222 = aob.G8;
                        ug9Var7222.c(i342222);
                        linearLayout22222.addView(ug9Var7222, tre.o(32, 32));
                        ug9 ug9Var22222 = new ug9(R.drawable.iv_align_horiz_middle, vnbVar2222, getContext());
                        ug9Var22222.e = (byte) 4;
                        ug9Var22222.updateColors();
                        ug9Var22222.b();
                        ug9Var22222.c(i342222);
                        linearLayout22222.addView(ug9Var22222, tre.o(32, 32));
                        ug9 ug9Var32222 = new ug9(R.drawable.iv_align_horiz_right, vnbVar2222, getContext());
                        ug9Var32222.e = (byte) 4;
                        ug9Var32222.updateColors();
                        ug9Var32222.b();
                        ug9Var32222.c(i342222);
                        final ug9[] ug9VarArr3222 = {ug9Var7222, ug9Var22222, ug9Var32222};
                        boolean z92222 = z2;
                        linearLayout22222.addView(ug9Var32222, tre.o(32, 32));
                        z5 = z3;
                        linearLayout22222.addView(new Space(getContext()), tre.o(8, 0));
                        ug9 ug9Var42222 = new ug9(R.drawable.iv_align_vert_top, vnbVar2222, getContext());
                        ug9Var42222.e = (byte) 4;
                        ug9Var42222.updateColors();
                        ug9Var42222.b();
                        ug9Var42222.c(i342222);
                        linearLayout22222.addView(ug9Var42222, tre.o(32, 32));
                        ug9 ug9Var52222 = new ug9(R.drawable.iv_align_vert_middle, vnbVar2222, getContext());
                        ug9Var52222.e = (byte) 4;
                        ug9Var52222.updateColors();
                        ug9Var52222.b();
                        ug9Var52222.c(i342222);
                        linearLayout22222.addView(ug9Var52222, tre.o(32, 32));
                        ug9 ug9Var62222 = new ug9(R.drawable.iv_align_vert_bottom, vnbVar2222, getContext());
                        ug9Var62222.e = (byte) 4;
                        ug9Var62222.updateColors();
                        ug9Var62222.b();
                        ug9Var62222.c(i342222);
                        final ug9[] ug9VarArr22222 = {ug9Var42222, ug9Var52222, ug9Var62222};
                        linearLayout22222.addView(ug9Var62222, tre.o(32, 32));
                        O2222.p(linearLayout3222);
                        it3 = linkedHashSet.iterator();
                        int i352222 = -1;
                        while (true) {
                            if (!it3.hasNext()) {
                            }
                        }
                        it4 = linkedHashSet.iterator();
                        int i362222 = -1;
                        while (true) {
                            if (!it4.hasNext()) {
                            }
                        }
                        i13 = 0;
                        while (i13 < 3) {
                        }
                        i15 = 0;
                        while (i15 < 3) {
                        }
                        while (i16 < 3) {
                        }
                        i17 = 0;
                        while (i17 < i14) {
                        }
                        O2222.n(true);
                        O2222.Y = jn7.l3;
                        if (!linkedHashSet.isEmpty()) {
                        }
                        z6 = false;
                        if (!z6) {
                        }
                        O2222.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new yn6((Object) this, (Object) xl9Var2, z6, (byte) 17), false);
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (z5) {
                        }
                        O2222.p = new sa8(this, O2222, xl9Var2, (byte) 20);
                        this.r4 = O2222;
                        O2222.a0();
                    }
                    i2 = 0;
                    hashSet = new HashSet();
                    it = selectedCells.iterator();
                    while (it.hasNext()) {
                    }
                    if (!hashSet.isEmpty()) {
                    }
                    z = false;
                    hashSet2 = new HashSet();
                    it2 = selectedCells.iterator();
                    while (it2.hasNext()) {
                    }
                    if (!hashSet2.isEmpty()) {
                    }
                    z2 = false;
                    if (selectedCells.isEmpty()) {
                    }
                    z3 = false;
                    if (z3) {
                    }
                    if (z) {
                    }
                    i3 = 1;
                    i4 = 0;
                    if (z2) {
                    }
                    i5 = 0;
                    if (z4) {
                    }
                    if (z4) {
                    }
                    fu5Var = this.r4;
                    i8 = i;
                    if (fu5Var != null) {
                    }
                    L = hl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                    FrameLayout T4222222 = T4(xl9Var2, false);
                    i9 = i5;
                    iArr = new int[2];
                    T4222222.getLocationOnScreen(iArr);
                    if ((iArr[i3] - L) - hl.L(8.0f) >= hl.L(8.0f) + hl.m) {
                    }
                    final fu5 O22222 = this.p3.O(T4);
                    O22222.s = (short) 0;
                    O22222.t = false;
                    O22222.f0 = r1;
                    LinearLayout linearLayout32222 = new LinearLayout(getContext());
                    linearLayout32222.setMinimumWidth(hl.L(208.0f));
                    linearLayout32222.setOrientation(r1);
                    TextView textView22222 = new TextView(getContext());
                    i10 = i2;
                    i11 = i4;
                    qd4.u(12.0f, 2131754050, 1, textView22222, null);
                    textView22222.setGravity(17);
                    int i3322222 = aob.y6;
                    vnb vnbVar22222 = this.o3;
                    yob.X(textView22222, i3322222, vnbVar22222);
                    linearLayout32222.addView(textView22222, tre.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                    LinearLayout linearLayout222222 = new LinearLayout(getContext());
                    boolean z822222 = z;
                    linearLayout222222.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                    linearLayout222222.setOrientation(0);
                    linearLayout32222.addView(linearLayout222222, tre.r(-2, -2, 17));
                    ug9 ug9Var72222 = new ug9(R.drawable.iv_align_horiz_left, vnbVar22222, getContext());
                    ug9Var72222.e = (byte) 4;
                    ug9Var72222.updateColors();
                    ug9Var72222.b();
                    int i3422222 = aob.G8;
                    ug9Var72222.c(i3422222);
                    linearLayout222222.addView(ug9Var72222, tre.o(32, 32));
                    ug9 ug9Var222222 = new ug9(R.drawable.iv_align_horiz_middle, vnbVar22222, getContext());
                    ug9Var222222.e = (byte) 4;
                    ug9Var222222.updateColors();
                    ug9Var222222.b();
                    ug9Var222222.c(i3422222);
                    linearLayout222222.addView(ug9Var222222, tre.o(32, 32));
                    ug9 ug9Var322222 = new ug9(R.drawable.iv_align_horiz_right, vnbVar22222, getContext());
                    ug9Var322222.e = (byte) 4;
                    ug9Var322222.updateColors();
                    ug9Var322222.b();
                    ug9Var322222.c(i3422222);
                    final ug9[] ug9VarArr32222 = {ug9Var72222, ug9Var222222, ug9Var322222};
                    boolean z922222 = z2;
                    linearLayout222222.addView(ug9Var322222, tre.o(32, 32));
                    z5 = z3;
                    linearLayout222222.addView(new Space(getContext()), tre.o(8, 0));
                    ug9 ug9Var422222 = new ug9(R.drawable.iv_align_vert_top, vnbVar22222, getContext());
                    ug9Var422222.e = (byte) 4;
                    ug9Var422222.updateColors();
                    ug9Var422222.b();
                    ug9Var422222.c(i3422222);
                    linearLayout222222.addView(ug9Var422222, tre.o(32, 32));
                    ug9 ug9Var522222 = new ug9(R.drawable.iv_align_vert_middle, vnbVar22222, getContext());
                    ug9Var522222.e = (byte) 4;
                    ug9Var522222.updateColors();
                    ug9Var522222.b();
                    ug9Var522222.c(i3422222);
                    linearLayout222222.addView(ug9Var522222, tre.o(32, 32));
                    ug9 ug9Var622222 = new ug9(R.drawable.iv_align_vert_bottom, vnbVar22222, getContext());
                    ug9Var622222.e = (byte) 4;
                    ug9Var622222.updateColors();
                    ug9Var622222.b();
                    ug9Var622222.c(i3422222);
                    final ug9[] ug9VarArr222222 = {ug9Var422222, ug9Var522222, ug9Var622222};
                    linearLayout222222.addView(ug9Var622222, tre.o(32, 32));
                    O22222.p(linearLayout32222);
                    it3 = linkedHashSet.iterator();
                    int i3522222 = -1;
                    while (true) {
                        if (!it3.hasNext()) {
                        }
                    }
                    it4 = linkedHashSet.iterator();
                    int i3622222 = -1;
                    while (true) {
                        if (!it4.hasNext()) {
                        }
                    }
                    i13 = 0;
                    while (i13 < 3) {
                    }
                    i15 = 0;
                    while (i15 < 3) {
                    }
                    while (i16 < 3) {
                    }
                    i17 = 0;
                    while (i17 < i14) {
                    }
                    O22222.n(true);
                    O22222.Y = jn7.l3;
                    if (!linkedHashSet.isEmpty()) {
                    }
                    z6 = false;
                    if (!z6) {
                    }
                    O22222.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new yn6((Object) this, (Object) xl9Var2, z6, (byte) 17), false);
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (z5) {
                    }
                    O22222.p = new sa8(this, O22222, xl9Var2, (byte) 20);
                    this.r4 = O22222;
                    O22222.a0();
                }
            }
            i = 0;
            if (size == 1) {
            }
            i2 = 0;
            hashSet = new HashSet();
            it = selectedCells.iterator();
            while (it.hasNext()) {
            }
            if (!hashSet.isEmpty()) {
            }
            z = false;
            hashSet2 = new HashSet();
            it2 = selectedCells.iterator();
            while (it2.hasNext()) {
            }
            if (!hashSet2.isEmpty()) {
            }
            z2 = false;
            if (selectedCells.isEmpty()) {
            }
            z3 = false;
            if (z3) {
            }
            if (z) {
            }
            i3 = 1;
            i4 = 0;
            if (z2) {
            }
            i5 = 0;
            if (z4) {
            }
            if (z4) {
            }
            fu5Var = this.r4;
            i8 = i;
            if (fu5Var != null) {
            }
            L = hl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
            FrameLayout T42222222 = T4(xl9Var2, false);
            i9 = i5;
            iArr = new int[2];
            T42222222.getLocationOnScreen(iArr);
            if ((iArr[i3] - L) - hl.L(8.0f) >= hl.L(8.0f) + hl.m) {
            }
            final fu5 O222222 = this.p3.O(T4);
            O222222.s = (short) 0;
            O222222.t = false;
            O222222.f0 = r1;
            LinearLayout linearLayout322222 = new LinearLayout(getContext());
            linearLayout322222.setMinimumWidth(hl.L(208.0f));
            linearLayout322222.setOrientation(r1);
            TextView textView222222 = new TextView(getContext());
            i10 = i2;
            i11 = i4;
            qd4.u(12.0f, 2131754050, 1, textView222222, null);
            textView222222.setGravity(17);
            int i33222222 = aob.y6;
            vnb vnbVar222222 = this.o3;
            yob.X(textView222222, i33222222, vnbVar222222);
            linearLayout322222.addView(textView222222, tre.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
            LinearLayout linearLayout2222222 = new LinearLayout(getContext());
            boolean z8222222 = z;
            linearLayout2222222.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
            linearLayout2222222.setOrientation(0);
            linearLayout322222.addView(linearLayout2222222, tre.r(-2, -2, 17));
            ug9 ug9Var722222 = new ug9(R.drawable.iv_align_horiz_left, vnbVar222222, getContext());
            ug9Var722222.e = (byte) 4;
            ug9Var722222.updateColors();
            ug9Var722222.b();
            int i34222222 = aob.G8;
            ug9Var722222.c(i34222222);
            linearLayout2222222.addView(ug9Var722222, tre.o(32, 32));
            ug9 ug9Var2222222 = new ug9(R.drawable.iv_align_horiz_middle, vnbVar222222, getContext());
            ug9Var2222222.e = (byte) 4;
            ug9Var2222222.updateColors();
            ug9Var2222222.b();
            ug9Var2222222.c(i34222222);
            linearLayout2222222.addView(ug9Var2222222, tre.o(32, 32));
            ug9 ug9Var3222222 = new ug9(R.drawable.iv_align_horiz_right, vnbVar222222, getContext());
            ug9Var3222222.e = (byte) 4;
            ug9Var3222222.updateColors();
            ug9Var3222222.b();
            ug9Var3222222.c(i34222222);
            final ug9[] ug9VarArr322222 = {ug9Var722222, ug9Var2222222, ug9Var3222222};
            boolean z9222222 = z2;
            linearLayout2222222.addView(ug9Var3222222, tre.o(32, 32));
            z5 = z3;
            linearLayout2222222.addView(new Space(getContext()), tre.o(8, 0));
            ug9 ug9Var4222222 = new ug9(R.drawable.iv_align_vert_top, vnbVar222222, getContext());
            ug9Var4222222.e = (byte) 4;
            ug9Var4222222.updateColors();
            ug9Var4222222.b();
            ug9Var4222222.c(i34222222);
            linearLayout2222222.addView(ug9Var4222222, tre.o(32, 32));
            ug9 ug9Var5222222 = new ug9(R.drawable.iv_align_vert_middle, vnbVar222222, getContext());
            ug9Var5222222.e = (byte) 4;
            ug9Var5222222.updateColors();
            ug9Var5222222.b();
            ug9Var5222222.c(i34222222);
            linearLayout2222222.addView(ug9Var5222222, tre.o(32, 32));
            ug9 ug9Var6222222 = new ug9(R.drawable.iv_align_vert_bottom, vnbVar222222, getContext());
            ug9Var6222222.e = (byte) 4;
            ug9Var6222222.updateColors();
            ug9Var6222222.b();
            ug9Var6222222.c(i34222222);
            final ug9[] ug9VarArr2222222 = {ug9Var4222222, ug9Var5222222, ug9Var6222222};
            linearLayout2222222.addView(ug9Var6222222, tre.o(32, 32));
            O222222.p(linearLayout322222);
            it3 = linkedHashSet.iterator();
            int i35222222 = -1;
            while (true) {
                if (!it3.hasNext()) {
                }
            }
            it4 = linkedHashSet.iterator();
            int i36222222 = -1;
            while (true) {
                if (!it4.hasNext()) {
                }
            }
            i13 = 0;
            while (i13 < 3) {
            }
            i15 = 0;
            while (i15 < 3) {
            }
            while (i16 < 3) {
            }
            i17 = 0;
            while (i17 < i14) {
            }
            O222222.n(true);
            O222222.Y = jn7.l3;
            if (!linkedHashSet.isEmpty()) {
            }
            z6 = false;
            if (!z6) {
            }
            O222222.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new yn6((Object) this, (Object) xl9Var2, z6, (byte) 17), false);
            if (i8 == 0) {
            }
            if (i10 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 == 0) {
            }
            if (i11 != 0) {
            }
            if (z5) {
            }
            O222222.p = new sa8(this, O222222, xl9Var2, (byte) 20);
            this.r4 = O222222;
            O222222.a0();
        }
    }

    @Override // q9c
    public final void J1(f89 f89Var) {
        mk0 mk0Var = this.a4;
        this.a4 = null;
        this.b4 = false;
        if (mk0Var == null) {
            if (f89Var != null) {
                View view = f89Var.a;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        t4(mk0Var);
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.onContentChanged();
        }
    }

    public final void J2() {
        if (this.J3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.J3 = false;
        this.K3 = false;
        this.L3 = null;
        this.M3 = null;
        fu5 fu5Var = this.r4;
        if (fu5Var != null) {
            this.r4 = null;
            fu5Var.u();
        }
        xl9 xl9Var = this.q4;
        if (xl9Var != null) {
            LinkedHashSet linkedHashSet = xl9Var.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                xl9Var.w.invalidate();
                xl9Var.v();
            }
            this.q4 = null;
        }
        this.t4 = -1;
        this.s4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean J3() {
        hr hrVar = uc7.s1(this.n3).k4;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            i2 += O3((mk0) arrayList.get(i)).size();
            i++;
        }
        ArrayList W2 = W2();
        dh9 dh9Var = new dh9();
        dh9Var.d = i2;
        dh9Var.b = W2.size() + dh9Var.b;
        for (int i3 = 0; i3 < W2.size(); i3++) {
            dh9.b((TL_iv.PageBlock) W2.get(i3), 1, dh9Var);
        }
        return dh9Var.a <= hrVar.g0.f() && dh9Var.b <= hrVar.h0.f() && dh9Var.c <= hrVar.i0.f() && dh9Var.d <= hrVar.j0.f() && dh9Var.e <= hrVar.k0.f();
    }

    public final km9 J4() {
        di9 di9Var = this.v3;
        if (di9Var == null || !di9Var.w()) {
            return null;
        }
        int i = di9Var.p0;
        int i2 = di9Var.s0;
        mk0 B4 = B4(i);
        if (i == i2 && B4 != null && x3(B4.b)) {
            return r2(i);
        }
        return null;
    }

    @Override // q9c
    public final void K1(f89 f89Var) {
        int b;
        b8c G;
        mk0 mk0Var = null;
        if (f89Var != null && (b = f89Var.b()) >= 0 && (G = this.g3.G(b)) != null) {
            Object obj = G.H;
            if (obj instanceof mk0) {
                mk0Var = (mk0) obj;
            }
        }
        this.a4 = mk0Var;
        this.b4 = false;
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.h();
        }
    }

    public final Editable K4(int i, int i2, int i3, int i4) {
        if (i != i3) {
            return null;
        }
        if (u3(B4(i))) {
            dg9 F2 = F2(i);
            if (F2 != null) {
                return F2.getText();
            }
            return null;
        }
        if (D3()) {
            dg9 l4 = l4(i);
            if (l4 != null) {
                return l4.getText();
            }
            return null;
        }
        mk0 B4 = B4(i);
        if (B4 == null || !x3(B4.b)) {
            return null;
        }
        int e2 = e2(i);
        if (uh9.g(i2, i4, e2, 0) >= qu6.A(i2, i4, e2, 0)) {
            return null;
        }
        km9 r2 = r2(i);
        return r2 != null ? r2.getEditText().getText() : km9.z(B4.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TL_iv.PageBlock L4(mk0 mk0Var, int i, int i2) {
        TL_iv.PageBlock pageblockparagraph;
        if (!x3(mk0Var.b)) {
            return null;
        }
        Editable Q4 = Q4(mk0Var);
        int length = Q4.length();
        int max = Math.max(0, Math.min(i, length));
        if (i2 >= 0) {
            length = Math.max(0, Math.min(i2, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Q4.subSequence(Math.min(max, length), Math.max(max, length)));
        TL_iv.PageBlock pageBlock = mk0Var.b;
        if (pageBlock != null) {
            try {
                I2(pageBlock);
                SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
                pageBlock.serializeToStream(serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
                pageblockparagraph = TL_iv.PageBlock.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                serializedData.cleanup();
                serializedData2.cleanup();
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = new TL_iv.textEmpty();
        km9.b(pageblockparagraph, spannableStringBuilder);
        return pageblockparagraph;
    }

    public final dg9 M2() {
        View findFocus = findFocus();
        if (findFocus instanceof dg9) {
            return (dg9) findFocus;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof km9) {
                return ((km9) childAt).getEditText();
            }
        }
        return null;
    }

    public final int[] M3(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.V3.size();
            ArrayList arrayList = this.V3;
            if (i2 >= size) {
                int size2 = arrayList.size() - 1;
                return new int[]{size2, km9.y(((mk0) this.V3.get(size2)).b).length()};
            }
            int length = km9.y(((mk0) arrayList.get(i2)).b).length();
            if (i <= i3 + length) {
                return new int[]{i2, i - i3};
            }
            i3 += length + 1;
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x001e, code lost:
    
        if (r12 > r13) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159 A[LOOP:2: B:70:0x0157->B:71:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0166 A[LOOP:3: B:74:0x0160->B:76:0x0166, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M4(int i, int i2, int i3, int i4, ArrayList arrayList) {
        int i5;
        mk0 mk0Var;
        CharSequence z;
        CharSequence z2;
        CharSequence subSequence;
        CharSequence subSequence2;
        ch9 ch9Var;
        ArrayList arrayList2;
        int i6;
        int i7;
        SpannableStringBuilder z3;
        ch9 ch9Var2;
        if (i >= 0 && i2 >= 0) {
            ArrayList arrayList3 = this.t3;
            if (i < arrayList3.size() && i2 < arrayList3.size()) {
                if (i <= i2) {
                    if (i == i2) {
                    }
                    for (i5 = i; i5 <= i2; i5++) {
                        mk0 mk0Var2 = (mk0) arrayList3.get(i5);
                        if (!mk0Var2.i && !u3(mk0Var2) && !B3(mk0Var2.b) && !i3(mk0Var2.b) && !(mk0Var2.b instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    mk0Var = (mk0) arrayList3.get(i);
                    mk0 mk0Var3 = (mk0) arrayList3.get(i2);
                    z = km9.z(mk0Var.b);
                    z2 = i != i2 ? z : km9.z(mk0Var3.b);
                    if (z == null) {
                        z = "";
                    }
                    if (z2 == null) {
                        z2 = "";
                    }
                    int max = Math.max(0, Math.min(i3, z.length()));
                    int max2 = Math.max(0, Math.min(i4, z2.length()));
                    subSequence = z.subSequence(0, max);
                    subSequence2 = z2.subSequence(max2, z2.length());
                    ch9Var = this.R3;
                    if (ch9Var != null) {
                        ch9Var.d();
                    }
                    byte b = 1;
                    if (arrayList.size() == 1 || !C3((mk0) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (subSequence.length() > 0) {
                            TL_iv.PageBlock Q3 = Q3(mk0Var.b);
                            km9.b(Q3, subSequence);
                            arrayList2.add(0, new mk0(Q3, mk0Var.c, mk0Var.d));
                        }
                        mk0Var = (mk0) c00.g(1, arrayList);
                        if (mk0Var != null) {
                            boolean u3 = u3(mk0Var);
                            TL_iv.PageBlock pageBlock = mk0Var.b;
                            if (u3) {
                                i6 = mm9.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true).length();
                            } else if (((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || z3(pageBlock)) && (z3 = km9.z(mk0Var.b)) != null) {
                                i6 = z3.length();
                            }
                            if (subSequence2.length() > 0) {
                                TL_iv.PageBlock Q32 = Q3(mk0Var3.b);
                                km9.b(Q32, subSequence2);
                                arrayList2.add(new mk0(Q32, mk0Var3.c, mk0Var3.d));
                            }
                            while (i2 >= i) {
                                arrayList3.remove(i2);
                                i2--;
                            }
                            for (i7 = 0; i7 < arrayList2.size(); i7++) {
                                arrayList3.add(i + i7, (mk0) arrayList2.get(i7));
                            }
                        }
                        i6 = 0;
                        if (subSequence2.length() > 0) {
                        }
                        while (i2 >= i) {
                        }
                        while (i7 < arrayList2.size()) {
                        }
                    } else {
                        CharSequence z4 = km9.z(((mk0) arrayList.get(0)).b);
                        CharSequence charSequence = z4 != null ? z4 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder.append(charSequence);
                        i6 = spannableStringBuilder.length();
                        spannableStringBuilder.append(subSequence2);
                        km9.b(mk0Var.b, spannableStringBuilder);
                        while (i2 > i) {
                            arrayList3.remove(i2);
                            i2--;
                        }
                    }
                    u4();
                    this.v3.e(false);
                    this.g3.O(false);
                    ch9Var2 = this.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                    post(new lh9(this, mk0Var, i6, b));
                    return true;
                }
                i2 = i;
                i = i2;
                i4 = i3;
                i3 = i4;
                while (i5 <= i2) {
                }
                mk0Var = (mk0) arrayList3.get(i);
                mk0 mk0Var32 = (mk0) arrayList3.get(i2);
                z = km9.z(mk0Var.b);
                if (i != i2) {
                }
                if (z == null) {
                }
                if (z2 == null) {
                }
                int max3 = Math.max(0, Math.min(i3, z.length()));
                int max22 = Math.max(0, Math.min(i4, z2.length()));
                subSequence = z.subSequence(0, max3);
                subSequence2 = z2.subSequence(max22, z2.length());
                ch9Var = this.R3;
                if (ch9Var != null) {
                }
                byte b2 = 1;
                if (arrayList.size() == 1) {
                }
                arrayList2 = new ArrayList(arrayList);
                if (subSequence.length() > 0) {
                }
                mk0Var = (mk0) c00.g(1, arrayList);
                if (mk0Var != null) {
                }
                i6 = 0;
                if (subSequence2.length() > 0) {
                }
                while (i2 >= i) {
                }
                while (i7 < arrayList2.size()) {
                }
                u4();
                this.v3.e(false);
                this.g3.O(false);
                ch9Var2 = this.R3;
                if (ch9Var2 != null) {
                }
                post(new lh9(this, mk0Var, i6, b2));
                return true;
            }
        }
        return false;
    }

    public final boolean N1(mk0 mk0Var, mk0 mk0Var2, int i) {
        if (x3(mk0Var.b)) {
            TL_iv.PageBlock pageBlock = mk0Var2.b;
            ArrayList arrayList = mk0Var2.k;
            if (x3(pageBlock)) {
                View D1 = D1(mk0Var2);
                if (D1 instanceof km9) {
                    dg9 editText = ((km9) D1).getEditText();
                    if (editText.isFocused()) {
                        CharSequence n = pv3.n(km9.z(mk0Var.b), editText.getPaint().getFontMetricsInt(), false, null, 0, z3(mk0Var.b) ? 0.85f : 1.0f, 0);
                        int length = n.length();
                        Editable text = editText.getText();
                        if (text != null && n.length() != 0) {
                            editText.j2 = true;
                            text.insert(0, n);
                            editText.j2 = false;
                        }
                        km9.b(mk0Var.b, editText.getText());
                        mk0Var2.b = mk0Var.b;
                        mk0Var2.c = mk0Var.c;
                        mk0Var2.d = mk0Var.d;
                        mk0Var2.e = mk0Var.e;
                        mk0Var2.f = mk0Var.f;
                        arrayList.clear();
                        arrayList.addAll(mk0Var.k);
                        this.t3.remove(i - 1);
                        u2();
                        u4();
                        d5();
                        editText.setSelection(Math.min(length, editText.length()));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final mk0 N2() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof km9) {
                km9 km9Var = (km9) childAt;
                if (km9Var.getEditText().isFocused() || (km9Var.l() && km9Var.h.isFocused())) {
                    return km9Var.getRow();
                }
            }
        }
        return null;
    }

    public final int N3(int i) {
        int i2 = 1;
        int i3 = i + 1;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                return arrayList.size();
            }
            mk0 mk0Var = (mk0) arrayList.get(i3);
            if (u3(mk0Var)) {
                i2++;
            } else if (mk0Var.i && i2 - 1 == 0) {
                return i3;
            }
            i3++;
        }
    }

    public final void N4(View view) {
        f89 U;
        int b;
        if (view == null || this.h3 == null || !this.k3 || (U = U(view)) == null || (b = U.b()) < 0 || this.g3.H(b) < 0) {
            return;
        }
        this.I3 = true;
        di9 di9Var = this.v3;
        if (di9Var.w()) {
            di9Var.e(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.h3.s(U);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1(TL_iv.PageBlock pageBlock) {
        ch9 ch9Var;
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.d();
        }
        mk0 N2 = N2();
        if (N2 == null) {
            N2 = this.k4;
        }
        ArrayList arrayList = this.t3;
        int indexOf = N2 != null ? arrayList.indexOf(N2) : -1;
        if (indexOf >= 0 && (N2.b instanceof TL_iv.pageBlockBlockquote)) {
            long a = mf9.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) N2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.u3.put(Long.valueOf(a), richText);
            }
            N2.k.add(Long.valueOf(a));
            N2.b = new TL_iv.pageBlockParagraph();
        }
        byte b = 1;
        boolean z = indexOf >= 0 && !N2.k.isEmpty();
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = N2.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && N2.g == null && km9.y(pageBlock2).isEmpty()) {
                N2.b = pageBlock;
                this.k4 = N2;
                if (i3(pageBlock)) {
                    int indexOf2 = arrayList.indexOf(N2) + 1;
                    if (indexOf2 >= arrayList.size() || B3(((mk0) arrayList.get(indexOf2)).b)) {
                        mk0 mk0Var = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                        if (z) {
                            mk0Var.k.addAll(N2.k);
                        }
                        arrayList.add(indexOf2, mk0Var);
                        N2 = mk0Var;
                    } else {
                        N2 = (mk0) arrayList.get(indexOf2);
                    }
                }
                this.g3.O(false);
                ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.h();
                }
                post(new jh9(this, N2, b));
            }
        }
        mk0 mk0Var2 = new mk0(pageBlock, 0, 0);
        if (z) {
            mk0Var2.k.addAll(N2.k);
        }
        if (indexOf >= 0) {
            arrayList.add(indexOf + 1, mk0Var2);
        } else {
            arrayList.add(mk0Var2);
        }
        N2 = mk0Var2;
        this.k4 = N2;
        if (i3(pageBlock)) {
        }
        this.g3.O(false);
        ch9Var = this.R3;
        if (ch9Var != null) {
        }
        post(new jh9(this, N2, b));
    }

    public final xl9 O2() {
        View findFocus = findFocus();
        if (findFocus instanceof dg9) {
            return R2((dg9) findFocus);
        }
        return null;
    }

    public final void O4(mk0 mk0Var, p07 p07Var, no6 no6Var) {
        sj9 sj9Var = (sj9) this.h4.remove(p07Var);
        if (sj9Var != null) {
            sj9Var.b();
        }
        IdentityHashMap identityHashMap = this.i4;
        oj9 oj9Var = (oj9) identityHashMap.remove(p07Var);
        if (oj9Var != null) {
            oj9Var.a();
        }
        p07Var.a = (byte) 1;
        p07Var.f = 0.0f;
        oj9 oj9Var2 = new oj9(this.n3, no6Var, new pm3((ViewGroup) this, (Object) p07Var, (Object) mk0Var, (byte) 28));
        identityHashMap.put(p07Var, oj9Var2);
        if (oj9Var2.f || oj9Var2.h || oj9Var2.n) {
            return;
        }
        oj9Var2.f = true;
        int i = no6Var.F;
        String str = no6Var.I;
        int i2 = no6Var.G;
        if (i <= 0 || i2 <= 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                i = options.outWidth;
                i2 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        oec oecVar = null;
        r9 = null;
        ArrayList arrayList = null;
        oecVar = null;
        if (i > 0 && i2 > 0) {
            int i3 = no6Var.J;
            if (i3 == 90 || i3 == 270) {
                int i4 = i2;
                i2 = i;
                i = i4;
            }
            oec oecVar2 = new oec();
            oecVar2.a = 0L;
            oecVar2.d = 0.0f;
            long j = 3000;
            oecVar2.b = Math.min(3000L, no6Var.t);
            while (true) {
                long j2 = oecVar2.b;
                if (j2 <= 0) {
                    oecVar2.b = 3000L;
                    break;
                } else {
                    if (j2 >= 1000) {
                        j = j2;
                        break;
                    }
                    oecVar2.b = j2 << 1;
                }
            }
            oecVar2.e = j;
            oecVar2.f = 1;
            oecVar2.g = 0;
            oecVar2.o = str;
            oecVar2.q = (int) ((r13 / 1000.0f) * 115200.0f);
            oecVar2.r = j;
            oecVar2.n = 30;
            oecVar2.v = j;
            oecVar2.A = no6Var.o;
            String str2 = no6Var.k;
            if (str2 != null) {
                oecVar2.B = str2;
                ArrayList arrayList2 = no6Var.q;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = no6Var.q;
                }
                oecVar2.G = arrayList;
            } else {
                oecVar2.B = no6Var.j;
                oecVar2.G = no6Var.p;
            }
            oecVar2.I = true;
            fo6 fo6Var = no6Var.A;
            if (fo6Var != null) {
                int i5 = fo6Var.k;
                if (i5 == 90 || i5 == 270) {
                    int i6 = i2;
                    i2 = i;
                    i = i6;
                }
                i = (int) (i * fo6Var.e);
                i2 = (int) (i2 * fo6Var.f);
            }
            float f = i;
            float f2 = i2;
            float max = Math.max(f / 854.0f, f2 / 854.0f);
            if (max < 1.0f) {
                max = 1.0f;
            }
            int i7 = (int) (f / max);
            int i8 = (int) (f2 / max);
            if (i7 % 16 != 0) {
                i7 = Math.max(1, Math.round(i7 / 16.0f)) << 4;
            }
            if (i8 % 16 != 0) {
                i8 = Math.max(1, Math.round(i8 / 16.0f)) << 4;
            }
            oecVar2.k = i7;
            oecVar2.h = i7;
            oecVar2.l = i8;
            oecVar2.i = i8;
            oecVar2.m = -1;
            oecVar2.t = true;
            oecVar2.c = 0L;
            oecVar = oecVar2;
        }
        oj9Var2.d = oecVar;
        if (oecVar == null || !oecVar.b()) {
            oj9Var2.b();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(xb4.z(4), "rich_anim_" + xea.p() + ".mp4").getAbsolutePath();
        oj9Var2.e = absolutePath;
        tL_message.attachPath = absolutePath;
        r47 r47Var = new r47(oj9Var2.a, tL_message, null, false, false);
        oj9Var2.c = r47Var;
        r47Var.r0 = oj9Var2.d;
        jn7 f3 = jn7.f(oj9Var2.a);
        f3.a(oj9Var2, jn7.a2);
        f3.a(oj9Var2, jn7.b2);
        f3.a(oj9Var2, jn7.c2);
        MediaController.z().j0(oj9Var2.c, false, false, false);
    }

    public final TLRPC.Document P2(long j) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document2;
        if (j == 0) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.t3.size(); i2++) {
            for (p07 p07Var : O3((mk0) this.t3.get(i2))) {
                if (p07Var != null && (document2 = p07Var.h) != null && document2.id == j) {
                    return document2;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.s3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i < size) {
                TLRPC.Document document3 = arrayList.get(i);
                i++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.id == j) {
                    return document4;
                }
            }
        }
        HashMap hashMap = nj9.a;
        synchronized (nj9.class) {
            document = j != 0 ? (TLRPC.Document) nj9.b.get(Long.valueOf(j)) : null;
        }
        return document;
    }

    public final void P4(mk0 mk0Var, p07 p07Var, String str, boolean z, int i, int i2, int i3) {
        IdentityHashMap identityHashMap = this.h4;
        sj9 sj9Var = (sj9) identityHashMap.remove(p07Var);
        if (sj9Var != null) {
            sj9Var.b();
        }
        sj9 sj9Var2 = new sj9(this.n3, str, z, i, i2, i3, new ci9(this, p07Var, mk0Var));
        identityHashMap.put(p07Var, sj9Var2);
        sj9Var2.d();
    }

    public final void Q1(mk0 mk0Var, no6 no6Var) {
        pi9 pi9Var;
        if (mk0Var == null || !A3(mk0Var.b)) {
            return;
        }
        String str = no6Var.h;
        if (str == null) {
            str = no6Var.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        p07 R3 = R3(no6Var, str2);
        boolean c = oj9.c(no6Var);
        TL_iv.PageBlock pageblockvideo = (no6Var.b || c) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
        if (y3(mk0Var.b)) {
            d3(mk0Var.b).add(pageblockvideo);
            ArrayList arrayList = mk0Var.h;
            if (arrayList == null) {
                arrayList = new ArrayList();
                mk0Var.h = arrayList;
            }
            arrayList.add(R3);
        } else {
            p07 p07Var = mk0Var.g;
            if (p07Var == null || p07Var.a == 0) {
                mk0Var.b = pageblockvideo;
                mk0Var.g = R3;
            } else {
                TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                pageblockcollage.caption = mk0Var.b.caption;
                if9.d(pageblockcollage);
                ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                pageblockcollage.items = arrayList2;
                arrayList2.add(mk0Var.b);
                pageblockcollage.items.add(pageblockvideo);
                ArrayList arrayList3 = new ArrayList();
                mk0Var.h = arrayList3;
                arrayList3.add(mk0Var.g);
                mk0Var.h.add(R3);
                mk0Var.g = null;
                mk0Var.b = pageblockcollage;
            }
        }
        this.g3.O(false);
        p4(mk0Var);
        if (c) {
            O4(mk0Var, R3, no6Var);
            pi9Var = this;
        } else {
            pi9Var = this;
            pi9Var.P4(mk0Var, R3, str2, no6Var.b, no6Var.F, no6Var.G, no6Var.E);
        }
        ch9 ch9Var2 = pi9Var.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        pi9Var.p3.onContentChanged();
    }

    public final int Q2(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            mk0 mk0Var = (mk0) arrayList.get(i);
            if (!mk0Var.i) {
                int i3 = -1;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    mk0 mk0Var2 = (mk0) arrayList.get(i5);
                    if (u3(mk0Var2)) {
                        i4++;
                        if (i3 == -1 && !((TL_iv.pageBlockDetails) mk0Var2.b).open) {
                            i3 = i4;
                        }
                    } else if (mk0Var2.i) {
                        if (i3 != -1 && i4 == i3) {
                            i3 = -1;
                        }
                        i4--;
                    }
                }
                if (i3 == -1) {
                    TL_iv.PageBlock pageBlock = mk0Var.b;
                    if (!B3(pageBlock) || i3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i;
                    }
                } else {
                    continue;
                }
            }
            i += i2;
        }
        return -1;
    }

    public final Editable Q4(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        return D1 instanceof km9 ? ((km9) D1).getEditText().getText() : km9.z(mk0Var.b);
    }

    public final void R1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        TL_iv.RichMessage richMessage2 = this.s3;
        if (richMessage2 == null) {
            this.s3 = richMessage;
        } else {
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null) {
                richMessage2.photos.addAll(arrayList2);
            }
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null) {
                this.s3.documents.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        T2(arrayList4, richMessage.blocks, this.u3);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList4.size(); i++) {
            x4((mk0) arrayList4.get(i));
        }
        ArrayList arrayList5 = this.t3;
        int size = arrayList5.size();
        mk0 N2 = N2();
        if (N2 != null && (indexOf = arrayList5.indexOf(N2)) >= 0) {
            TL_iv.PageBlock pageBlock = N2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && km9.y(pageBlock).isEmpty()) {
                arrayList5.remove(indexOf);
                size = indexOf;
            } else {
                size = indexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        T3();
        u4();
        this.g3.O(false);
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.onContentChanged();
        }
    }

    public final dg9 R4(int i, int i2) {
        View D4 = D4(i);
        if (D4 instanceof xl9) {
            return ((xl9) D4).n(i2);
        }
        return null;
    }

    public final mk0 S1(mk0 mk0Var, int i) {
        int i2;
        ArrayList arrayList = this.x4;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf < 0 || (i2 = indexOf + i) < 0 || i2 >= arrayList.size()) {
            return null;
        }
        mk0 mk0Var2 = (mk0) arrayList.get(i2);
        if (mk0Var2.t != 0) {
            return mk0Var2;
        }
        return null;
    }

    public final void S2() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof km9) {
                km9 km9Var = (km9) childAt;
                km9Var.f.K();
                km9Var.h.K();
            } else if (childAt instanceof jf9) {
                ((jf9) childAt).getCaptionEditText().K();
            } else if (childAt instanceof rf9) {
                ((rf9) childAt).getEditText().K();
            }
        }
    }

    public final mk0 S3(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.x4;
            if (i >= arrayList.size()) {
                return null;
            }
            mk0 mk0Var = (mk0) arrayList.get(i);
            if (!mk0Var.i) {
                if (mk0Var.t == 0) {
                    TL_iv.PageBlock pageBlock = mk0Var.b;
                    if (B3(pageBlock) && !i3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return mk0Var;
            }
            i += i2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0223  */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T1(int i, int i2, int i3, int i4, String[] strArr) {
        l9c l9cVar;
        boolean z;
        String str;
        xl9 xl9Var;
        ajb model;
        int max;
        int length;
        int length2;
        int i5;
        ?? r6;
        int length3;
        int i6;
        ch9 ch9Var;
        int i7 = i2;
        int i8 = i4;
        mk0 B4 = B4(i);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B4(i3));
        byte b = 0;
        if (indexOf < 0 || indexOf2 < 0 || indexOf >= arrayList.size() || indexOf2 >= arrayList.size()) {
            return false;
        }
        mk0 mk0Var = (mk0) arrayList.get(indexOf);
        mk0 mk0Var2 = (mk0) arrayList.get(indexOf2);
        di9 di9Var = this.v3;
        boolean z2 = true;
        if (indexOf == indexOf2 && u3(mk0Var)) {
            View D1 = D1(mk0Var);
            if (!(D1 instanceof rf9) || !(mk0Var.b instanceof TL_iv.pageBlockDetails)) {
                return true;
            }
            dg9 editText = ((rf9) D1).getEditText();
            ch9 ch9Var2 = this.R3;
            if (ch9Var2 != null) {
                ch9Var2.d();
            }
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (i9 > 0) {
                    sb.append(' ');
                }
                sb.append(strArr[i9]);
            }
            String sb2 = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editText.getText());
            int length4 = spannableStringBuilder.length();
            int g = uh9.g(i7, i8, length4, 0);
            spannableStringBuilder.replace(g, qu6.A(i7, i8, length4, 0), (CharSequence) sb2);
            editText.setTextSilently(spannableStringBuilder);
            editText.f();
            ((TL_iv.pageBlockDetails) mk0Var.b).title = mm9.f(spannableStringBuilder);
            int length5 = sb2.length() + g;
            di9Var.e(false);
            ch9 ch9Var3 = this.R3;
            if (ch9Var3 != null) {
                ch9Var3.h();
            }
            post(new qh9(editText, length5, b));
            return true;
        }
        int i10 = indexOf;
        while (true) {
            l9cVar = this.g3;
            z = z2;
            str = "";
            if (i10 > indexOf2) {
                ch9 ch9Var4 = this.R3;
                if (ch9Var4 != null) {
                    ch9Var4.d();
                }
                TL_iv.PageBlock pageBlock = mk0Var.b;
                boolean z3 = pageBlock instanceof TL_iv.pageBlockTable;
                boolean z4 = mk0Var2.b instanceof TL_iv.pageBlockTable;
                ni9 ni9Var = this.p3;
                if (z3) {
                    if (z4 && indexOf == indexOf2) {
                        int i11 = di9Var.q0;
                        int i12 = di9Var.t0;
                        View D12 = D1(mk0Var);
                        if ((D12 instanceof xl9) && (model = (xl9Var = (xl9) D12).getModel()) != null) {
                            ArrayList arrayList2 = model.g;
                            if (i11 == 0 && i12 == 0) {
                                TL_iv.PageBlock pageBlock2 = mk0Var.b;
                                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                                    ch9 ch9Var5 = this.R3;
                                    if (ch9Var5 != null) {
                                        ch9Var5.d();
                                    }
                                    String l = mm9.l(pageblocktable.title);
                                    int max2 = Math.max(0, Math.min(Math.min(i7, i8), l.length()));
                                    int max3 = Math.max(0, Math.min(Math.max(i7, i8), l.length()));
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i13 = 0; i13 < strArr.length; i13++) {
                                        if (i13 > 0) {
                                            sb3.append(' ');
                                        }
                                        sb3.append(strArr[i13]);
                                    }
                                    String sb4 = sb3.toString();
                                    String str2 = l.substring(0, max2) + sb4 + l.substring(max3);
                                    TL_iv.textPlain textplain = new TL_iv.textPlain();
                                    textplain.text = str2;
                                    pageblocktable.title = textplain;
                                    dg9 titleEditText = xl9Var.getTitleEditText();
                                    titleEditText.setTextSilently(str2);
                                    titleEditText.f();
                                    int length6 = sb4.length() + max2;
                                    di9Var.e(false);
                                    ch9 ch9Var6 = this.R3;
                                    if (ch9Var6 != null) {
                                        ch9Var6.h();
                                    }
                                    ni9Var.onContentChanged();
                                    post(new qh9(titleEditText, length6, (byte) 4));
                                    return true;
                                }
                            } else {
                                int i14 = i11 - 1;
                                int i15 = i12 - 1;
                                int size = arrayList2.size();
                                if (i14 >= 0 && i14 < size && i15 >= 0 && i15 < size) {
                                    ch9 ch9Var7 = this.R3;
                                    if (ch9Var7 != null) {
                                        ch9Var7.d();
                                    }
                                    if (i14 > i15 || (i14 == i15 && i7 > i8)) {
                                        i8 = i7;
                                        i7 = i8;
                                        i15 = i14;
                                        i14 = i15;
                                    }
                                    StringBuilder sb5 = new StringBuilder();
                                    for (int i16 = 0; i16 < strArr.length; i16++) {
                                        if (i16 > 0) {
                                            sb5.append('\n');
                                        }
                                        sb5.append(strArr[i16]);
                                    }
                                    String sb6 = sb5.toString();
                                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i14);
                                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i15);
                                    if (i14 == i15) {
                                        String g2 = ajb.g(pagetablecell);
                                        max = Math.max(0, Math.min(i7, g2.length()));
                                        String str3 = g2.substring(0, max) + sb6 + g2.substring(Math.max(0, Math.min(i8, g2.length())));
                                        ajb.c(pagetablecell, str3);
                                        am9 m = xl9Var.getGrid().m(pagetablecell);
                                        if (m != null) {
                                            m.a.setTextSilently(str3);
                                        }
                                        length = sb6.length();
                                    } else {
                                        String g3 = ajb.g(pagetablecell);
                                        max = Math.max(0, Math.min(i7, g3.length()));
                                        String concat = g3.substring(0, max).concat(sb6);
                                        ajb.c(pagetablecell, concat);
                                        am9 m2 = xl9Var.getGrid().m(pagetablecell);
                                        if (m2 != null) {
                                            m2.a.setTextSilently(concat);
                                        }
                                        for (int i17 = i14 + 1; i17 < i15; i17++) {
                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i17);
                                            ajb.c(pagetablecell3, "");
                                            am9 m3 = xl9Var.getGrid().m(pagetablecell3);
                                            if (m3 != null) {
                                                m3.a.setTextSilently("");
                                            }
                                        }
                                        String g4 = ajb.g(pagetablecell2);
                                        String substring = g4.substring(Math.max(0, Math.min(i8, g4.length())));
                                        ajb.c(pagetablecell2, substring);
                                        am9 m4 = xl9Var.getGrid().m(pagetablecell2);
                                        if (m4 != null) {
                                            m4.a.setTextSilently(substring);
                                        }
                                        length = sb6.length();
                                    }
                                    int i18 = length + max;
                                    di9Var.e(false);
                                    ch9 ch9Var8 = this.R3;
                                    if (ch9Var8 != null) {
                                        ch9Var8.h();
                                    }
                                    post(new a39((Object) xl9Var, (Object) pagetablecell, i18, (byte) 3));
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
                if (!z4) {
                    boolean i32 = i3(pageBlock);
                    boolean i33 = i3(mk0Var2.b);
                    if (i32) {
                        if (i33 && indexOf == indexOf2) {
                            KeyEvent.Callback D13 = D1(mk0Var);
                            if (D13 instanceof jf9) {
                                jf9 jf9Var = (jf9) D13;
                                dg9 captionEditText = jf9Var.getCaptionEditText();
                                ch9 ch9Var9 = this.R3;
                                if (ch9Var9 != null) {
                                    ch9Var9.d();
                                }
                                StringBuilder sb7 = new StringBuilder();
                                for (int i19 = 0; i19 < strArr.length; i19++) {
                                    if (i19 > 0) {
                                        sb7.append(' ');
                                    }
                                    sb7.append(strArr[i19]);
                                }
                                String sb8 = sb7.toString();
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(captionEditText.getText());
                                int length7 = spannableStringBuilder2.length();
                                int g5 = uh9.g(i7, i8, length7, 0);
                                spannableStringBuilder2.replace(g5, qu6.A(i7, i8, length7, 0), (CharSequence) sb8);
                                captionEditText.setTextSilently(spannableStringBuilder2);
                                captionEditText.f();
                                jf9Var.b();
                                int length8 = sb8.length() + g5;
                                di9Var.e(false);
                                ch9 ch9Var10 = this.R3;
                                if (ch9Var10 != null) {
                                    ch9Var10.h();
                                }
                                post(new qh9(captionEditText, length8, (byte) 2));
                                return true;
                            }
                            return true;
                        }
                    } else if (!i33) {
                        if (indexOf == indexOf2 && km9.n(mk0Var.b) && di9Var.q0 == z && di9Var.t0 == z) {
                            View D14 = D1(mk0Var);
                            if (D14 instanceof km9) {
                                km9 km9Var = (km9) D14;
                                dg9 authorEditText = km9Var.getAuthorEditText();
                                ch9 ch9Var11 = this.R3;
                                if (ch9Var11 != null) {
                                    ch9Var11.d();
                                }
                                StringBuilder sb9 = new StringBuilder();
                                for (int i20 = 0; i20 < strArr.length; i20++) {
                                    if (i20 > 0) {
                                        sb9.append(' ');
                                    }
                                    sb9.append(strArr[i20]);
                                }
                                String sb10 = sb9.toString();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(authorEditText.getText());
                                int length9 = spannableStringBuilder3.length();
                                int g6 = uh9.g(i7, i8, length9, 0);
                                spannableStringBuilder3.replace(g6, qu6.A(i7, i8, length9, 0), (CharSequence) sb10);
                                authorEditText.setTextSilently(spannableStringBuilder3);
                                authorEditText.f();
                                km9Var.v();
                                int length10 = sb10.length() + g6;
                                di9Var.e(false);
                                ch9 ch9Var12 = this.R3;
                                if (ch9Var12 != null) {
                                    ch9Var12.h();
                                }
                                ni9Var.onContentChanged();
                                post(new qh9(authorEditText, length10, (byte) 1));
                                return true;
                            }
                            return true;
                        }
                        CharSequence z5 = km9.z(mk0Var.b);
                        CharSequence z6 = indexOf == indexOf2 ? z5 : km9.z(mk0Var2.b);
                        if (z5 == null) {
                            z5 = "";
                        }
                        if (z6 == null) {
                            z6 = "";
                        }
                        int max4 = Math.max(0, Math.min(i7, z5.length()));
                        int max5 = Math.max(0, Math.min(i8, z6.length()));
                        CharSequence subSequence = z5.subSequence(0, max4);
                        CharSequence subSequence2 = z6.subSequence(max5, z6.length());
                        if (strArr.length <= 1) {
                            str = strArr.length != 0 ? strArr[0] : "";
                            km9.b(mk0Var.b, new SpannableStringBuilder(subSequence).append((CharSequence) str).append(subSequence2));
                            if (indexOf2 > indexOf) {
                                while (indexOf2 > indexOf) {
                                    arrayList.remove(indexOf2);
                                    indexOf2--;
                                }
                            }
                            length2 = str.length() + subSequence.length();
                        } else {
                            km9.b(mk0Var.b, new SpannableStringBuilder(subSequence).append((CharSequence) strArr[0]));
                            if (indexOf2 > indexOf) {
                                while (indexOf2 > indexOf) {
                                    arrayList.remove(indexOf2);
                                    indexOf2--;
                                }
                            }
                            for (int i21 = 1; i21 < strArr.length - 1; i21++) {
                                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                String str4 = strArr[i21];
                                TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                                textplain2.text = str4;
                                pageblockparagraph.text = textplain2;
                                int i22 = indexOf + i21;
                                int i23 = mk0Var.c;
                                int i24 = mk0Var.d;
                                if (i24 > 0) {
                                    i24 += i21;
                                }
                                arrayList.add(i22, new mk0(pageblockparagraph, i23, i24));
                            }
                            String str5 = strArr[strArr.length - 1];
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            km9.b(pageblockparagraph2, new SpannableStringBuilder(str5).append(subSequence2));
                            int length11 = (strArr.length + indexOf) - 1;
                            int i25 = mk0Var.c;
                            int i26 = mk0Var.d;
                            if (i26 > 0) {
                                i26 = (i26 + strArr.length) - 1;
                            }
                            arrayList.add(length11, new mk0(pageblockparagraph2, i25, i26));
                            indexOf = (indexOf + strArr.length) - 1;
                            length2 = str5.length();
                        }
                        u4();
                        mk0 mk0Var3 = (indexOf < 0 || indexOf >= arrayList.size()) ? null : (mk0) arrayList.get(indexOf);
                        byte b2 = 0;
                        di9Var.e(false);
                        l9cVar.O(false);
                        ch9 ch9Var13 = this.R3;
                        if (ch9Var13 != null) {
                            ch9Var13.h();
                        }
                        post(new lh9(this, mk0Var3, length2, b2));
                        return true;
                    }
                }
                return false;
            }
            if (((mk0) arrayList.get(i10)).i || u3((mk0) arrayList.get(i10))) {
                break;
            }
            i10++;
            z2 = z;
        }
        int i27 = indexOf;
        while (i27 > 0 && E2(i27) > 0) {
            i27--;
        }
        int i28 = indexOf2;
        while (true) {
            i5 = i28 + 1;
            if (i5 >= arrayList.size() || E2(i5) <= 0) {
                break;
            }
            i28 = i5;
        }
        mk0 mk0Var4 = (mk0) arrayList.get(indexOf);
        mk0 mk0Var5 = (mk0) arrayList.get(indexOf2);
        boolean z7 = (i27 != indexOf || u3(mk0Var4) || mk0Var4.i) ? z : false;
        boolean z8 = (i28 != indexOf2 || u3(mk0Var5) || mk0Var5.i) ? z : false;
        StringBuilder sb11 = new StringBuilder();
        boolean z9 = z7;
        boolean z10 = z8;
        for (int i29 = 0; i29 < strArr.length; i29++) {
            if (i29 > 0) {
                sb11.append(' ');
            }
            sb11.append(strArr[i29]);
        }
        String sb12 = sb11.toString();
        ch9 ch9Var14 = this.R3;
        if (ch9Var14 != null) {
            ch9Var14.d();
        }
        if (!z9) {
            String y = km9.y(mk0Var4.b);
            String substring2 = y.substring(0, Math.max(0, Math.min(i7, y.length())));
            if (!z10) {
                String y2 = km9.y(mk0Var5.b);
                str = y2.substring(Math.max(0, Math.min(i8, y2.length())));
            }
            km9.c(mk0Var4.b, substring2 + sb12 + str);
            arrayList.subList(i27 + 1, i5).clear();
            length3 = sb12.length() + substring2.length();
        } else {
            if (z10) {
                arrayList.subList(i27, i5).clear();
                TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                TL_iv.textPlain textplain3 = new TL_iv.textPlain();
                textplain3.text = sb12;
                pageblockparagraph3.text = textplain3;
                r6 = 0;
                mk0Var4 = new mk0(pageblockparagraph3, 0, 0);
                arrayList.add(Math.min(i27, arrayList.size()), mk0Var4);
                length3 = sb12.length();
                if (arrayList.isEmpty()) {
                    i6 = length3;
                } else {
                    mk0Var4 = new mk0(new TL_iv.pageBlockParagraph(), r6, r6);
                    arrayList.add(mk0Var4);
                    i6 = r6;
                }
                u4();
                di9Var.e(r6);
                l9cVar.O(r6);
                ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.h();
                }
                post(new lh9(this, mk0Var4, i6, (byte) 3));
                return z;
            }
            String y3 = km9.y(mk0Var5.b);
            km9.c(mk0Var5.b, sb12.concat(y3.substring(Math.max(0, Math.min(i8, y3.length())))));
            arrayList.subList(i27, i28).clear();
            length3 = sb12.length();
            mk0Var4 = mk0Var5;
        }
        r6 = 0;
        if (arrayList.isEmpty()) {
        }
        u4();
        di9Var.e(r6);
        l9cVar.O(r6);
        ch9Var = this.R3;
        if (ch9Var != null) {
        }
        post(new lh9(this, mk0Var4, i6, (byte) 3));
        return z;
    }

    public final void T3() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return;
            }
            mk0 mk0Var = (mk0) arrayList.get(i);
            if (!mk0Var.k.isEmpty() && km9.n(mk0Var.b)) {
                long a = mf9.a();
                TL_iv.RichText h = km9.h(mk0Var.b);
                if (h != null && !(h instanceof TL_iv.textEmpty)) {
                    this.u3.put(Long.valueOf(a), h);
                }
                mk0Var.k.add(Long.valueOf(a));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = mk0Var.b.text;
                mk0Var.b = pageblockparagraph;
            }
            i++;
        }
    }

    public final void U1() {
        km9 km9Var;
        mk0 mk0Var;
        hm9 hm9Var;
        this.g3.T();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof km9) && (mk0Var = (km9Var = (km9) childAt).y) != null && (hm9Var = km9Var.E) != null) {
                km9Var.d(mk0Var, hm9Var, km9Var.F);
            }
        }
    }

    public final void U3(mk0 mk0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf < 0) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
        mk0Var2.k.addAll(mk0Var.k);
        arrayList.add(indexOf + 1, mk0Var2);
        u4();
        this.g3.O(false);
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        post(new jh9(this, mk0Var2, (byte) 24));
    }

    public final void U4() {
        int[] E4 = E4();
        if (E4 != null) {
            int i = E4[0];
            int i2 = E4[1];
            if (i >= 0) {
                ArrayList arrayList = this.t3;
                if (i2 >= arrayList.size() || i > i2) {
                    return;
                }
                ch9 ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                if (E3(i, i2)) {
                    for (int i3 = i; i3 <= i2; i3++) {
                        mk0 mk0Var = (mk0) arrayList.get(i3);
                        boolean z = mk0Var.i;
                        ArrayList arrayList2 = mk0Var.k;
                        if (!z && !u3(mk0Var)) {
                            if (km9.n(mk0Var.b)) {
                                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                pageblockparagraph.text = mk0Var.b.text;
                                mk0Var.b = pageblockparagraph;
                            } else if (!arrayList2.isEmpty()) {
                                qd4.v(1, arrayList2);
                            }
                        }
                    }
                } else {
                    long a = mf9.a();
                    for (int i4 = i; i4 <= i2; i4++) {
                        mk0 mk0Var2 = (mk0) arrayList.get(i4);
                        boolean z2 = mk0Var2.i;
                        ArrayList arrayList3 = mk0Var2.k;
                        if (!z2 && !u3(mk0Var2)) {
                            if (km9.n(mk0Var2.b)) {
                                long a2 = mf9.a();
                                TL_iv.RichText h = km9.h(mk0Var2.b);
                                if (h != null && !(h instanceof TL_iv.textEmpty)) {
                                    this.u3.put(Long.valueOf(a2), h);
                                }
                                arrayList3.add(Long.valueOf(a2));
                                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                pageblockparagraph2.text = mk0Var2.b.text;
                                mk0Var2.b = pageblockparagraph2;
                            }
                            arrayList3.add(0, Long.valueOf(a));
                        }
                    }
                }
                u2();
                T3();
                u4();
                di9 di9Var = this.v3;
                boolean z3 = di9Var != null && di9Var.w();
                mk0 mk0Var3 = (mk0) arrayList.get(Math.max(0, Math.min(i, arrayList.size() - 1)));
                mk0 mk0Var4 = (mk0) arrayList.get(Math.max(0, Math.min(i2, arrayList.size() - 1)));
                this.g3.O(false);
                ch9 ch9Var2 = this.R3;
                if (ch9Var2 != null) {
                    ch9Var2.h();
                }
                if (z3) {
                    post(new sa8(this, mk0Var3, mk0Var4, (byte) 21));
                } else {
                    post(new jh9(this, mk0Var3, (byte) 16));
                }
            }
        }
    }

    public final boolean V1(int i, int i2) {
        di9 di9Var;
        ArrayList arrayList = this.V3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i, i2));
            int max2 = Math.max(0, Math.max(i, i2));
            int[] M3 = M3(max);
            int[] M32 = M3(max2);
            mk0 mk0Var = (mk0) this.V3.get(M3[0]);
            if (M3[0] == M32[0] || max == max2) {
                View D1 = D1(mk0Var);
                if (D1 instanceof km9) {
                    km9 km9Var = (km9) D1;
                    km9Var.A();
                    dg9 editText = km9Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.min(M3[1], length), Math.min(M32[1], length));
                }
            } else {
                View D12 = D1(mk0Var);
                View D13 = D1(this.V3.get(M32[0]));
                if ((D12 instanceof km9) && (D13 instanceof km9)) {
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.t3;
                        int size = arrayList2.size();
                        di9Var = this.v3;
                        if (i3 >= size) {
                            break;
                        }
                        di9Var.W(i3, km9.y(((mk0) arrayList2.get(i3)).b));
                        i3++;
                    }
                    km9 km9Var2 = (km9) D12;
                    int length2 = km9Var2.getEditText().length();
                    if (M3[1] >= length2) {
                        length2 = Math.max(0, length2 - 1);
                    }
                    if (!di9Var.i0(km9Var2, 0, M3[1], length2)) {
                        km9Var2.A();
                        return true;
                    }
                    di9Var.a0(0, M32[1], (km9) D13);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList V2(int i, int i2, int i3, boolean z) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        boolean z2;
        pi9 pi9Var;
        int i4;
        int i5;
        pi9 pi9Var2;
        ArrayList arrayList = new ArrayList();
        int i6 = i;
        while (i6 < i2) {
            ArrayList arrayList2 = this.t3;
            mk0 mk0Var = (mk0) arrayList2.get(i6);
            boolean z3 = mk0Var.i;
            ArrayList arrayList3 = mk0Var.k;
            if (z3) {
                i6++;
            } else if (arrayList3.size() > i3) {
                Long l = (Long) arrayList3.get(i3);
                long longValue = l.longValue();
                int i7 = i6 + 1;
                while (i7 < i2) {
                    mk0 mk0Var2 = (mk0) arrayList2.get(i7);
                    if (mk0Var2.k.size() <= i3 || ((Long) mk0Var2.k.get(i3)).longValue() != longValue) {
                        break;
                    }
                    i7++;
                }
                ArrayList<TL_iv.PageBlock> V2 = this.V2(i6, i7, i3 + 1, true);
                if (V2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.u3.get(l);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (V2.size() == 1 && (V2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = V2.get(0).text != null ? V2.get(0).text : new TL_iv.textEmpty();
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = V2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i6 = i7;
            } else if (u3(mk0Var)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) mk0Var.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int N3 = this.N3(i6);
                pageblockdetails.blocks = this.V2(i6 + 1, Math.min(N3, i2), i3, true);
                arrayList.add(pageblockdetails);
                i6 = N3 + 1;
            } else {
                int i8 = mk0Var.c;
                if (i8 <= 0) {
                    G2(mk0Var, arrayList);
                    i6++;
                    i4 = i2;
                    i5 = i3;
                    pi9Var2 = this;
                } else {
                    int[] iArr = {i6};
                    if (mk0Var.d > 0) {
                        z2 = true;
                        i4 = i2;
                        i5 = i3;
                        pi9Var = this;
                    } else {
                        z2 = false;
                        pi9Var = this;
                        i4 = i2;
                        i5 = i3;
                    }
                    TL_iv.PageBlock g2 = pi9Var.g2(i6, i8, i4, i5, z2, iArr);
                    pi9Var2 = pi9Var;
                    if (g2 != null) {
                        arrayList.add(g2);
                    }
                    int i9 = iArr[0];
                    i6 = i9 <= 0 ? i4 : i9;
                }
                this = pi9Var2;
                i2 = i4;
                i3 = i5;
            }
        }
        if (!z) {
            while (!arrayList.isEmpty() && w3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && w3((TL_iv.PageBlock) c00.g(1, arrayList))) {
                qd4.v(1, arrayList);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (((java.lang.Long) r5.k.get(r11)).longValue() == r12) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
    
        if (((java.lang.Long) r5.k.get(r11)).longValue() == r12) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V3(mk0 mk0Var, boolean z) {
        int i;
        boolean z2;
        dg9 editText;
        Editable text;
        int i2;
        ch9 ch9Var;
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            ArrayList arrayList2 = mk0Var.k;
            byte b = 1;
            if (z3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote)) {
                Y4(mk0Var, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
                return true;
            }
            int i3 = mk0Var.c;
            byte b2 = 2;
            int i4 = -1;
            l9c l9cVar = this.g3;
            if (i3 > 0) {
                ch9 ch9Var2 = this.R3;
                if (ch9Var2 != null) {
                    ch9Var2.d();
                }
                View D1 = D1(mk0Var);
                if (D1 instanceof km9) {
                    km9 km9Var = (km9) D1;
                    if (km9Var.getEditText().isFocused()) {
                        i4 = km9Var.getEditText().getSelectionEnd();
                    }
                }
                q2(indexOf);
                u4();
                if (!(findFocus() instanceof dg9)) {
                    l9cVar.O(false);
                    ch9 ch9Var3 = this.R3;
                    if (ch9Var3 != null) {
                        ch9Var3.h();
                    }
                    post(new th9(this, mk0Var, b));
                    return true;
                }
                U1();
                ch9 ch9Var4 = this.R3;
                if (ch9Var4 != null) {
                    ch9Var4.h();
                }
                if (i4 >= 0) {
                    post(new lh9(this, mk0Var, i4, b2));
                    return true;
                }
            } else {
                if (!arrayList2.isEmpty() && z) {
                    ArrayList arrayList3 = ((mk0) arrayList.get(indexOf)).k;
                    if (!arrayList3.isEmpty()) {
                        int size = arrayList3.size() - 1;
                        long longValue = ((Long) arrayList3.get(size)).longValue();
                        if (indexOf != 0) {
                            mk0 mk0Var2 = (mk0) arrayList.get(indexOf - 1);
                            if (mk0Var2.k.size() > size) {
                            }
                        }
                        ch9Var = this.R3;
                        if (ch9Var != null) {
                            ch9Var.d();
                        }
                        arrayList2.remove(arrayList2.size() - 1);
                        u2();
                        u4();
                        if (findFocus() instanceof dg9) {
                            l9cVar.O(false);
                            ch9 ch9Var5 = this.R3;
                            if (ch9Var5 != null) {
                                ch9Var5.h();
                            }
                            post(new th9(this, mk0Var, b2));
                            return true;
                        }
                        d5();
                        ch9 ch9Var6 = this.R3;
                        if (ch9Var6 != null) {
                            ch9Var6.h();
                            return true;
                        }
                    }
                    ArrayList arrayList4 = ((mk0) arrayList.get(indexOf)).k;
                    if (!arrayList4.isEmpty()) {
                        int size2 = arrayList4.size() - 1;
                        long longValue2 = ((Long) arrayList4.get(size2)).longValue();
                        int i5 = indexOf + 1;
                        if (i5 < arrayList.size()) {
                            mk0 mk0Var3 = (mk0) arrayList.get(i5);
                            if (mk0Var3.k.size() > size2) {
                            }
                        }
                    }
                    ch9Var = this.R3;
                    if (ch9Var != null) {
                    }
                    arrayList2.remove(arrayList2.size() - 1);
                    u2();
                    u4();
                    if (findFocus() instanceof dg9) {
                    }
                }
                if (indexOf > 0) {
                    int i6 = indexOf - 1;
                    mk0 mk0Var4 = (mk0) arrayList.get(i6);
                    if (mk0Var4.i && x3(mk0Var.b)) {
                        View D12 = D1(mk0Var);
                        if ((D12 instanceof km9) && ((km9) D12).getEditText().isFocused()) {
                            int i7 = 0;
                            int i8 = i6;
                            while (true) {
                                if (i8 < 0) {
                                    break;
                                }
                                mk0 mk0Var5 = (mk0) arrayList.get(i8);
                                if (!mk0Var5.i) {
                                    if (u3(mk0Var5) && i7 - 1 == 0) {
                                        i4 = i8;
                                        break;
                                    }
                                } else {
                                    i7++;
                                }
                                i8--;
                            }
                            if (i4 >= 0) {
                                ch9 ch9Var7 = this.R3;
                                if (ch9Var7 != null) {
                                    ch9Var7.d();
                                }
                                ((TL_iv.pageBlockDetails) ((mk0) arrayList.get(i4)).b).open = true;
                                arrayList.remove(indexOf);
                                arrayList.add(i6, mk0Var);
                                mk0 mk0Var6 = (mk0) arrayList.get(indexOf - 2);
                                if (u3(mk0Var6) || mk0Var6.i || !N1(mk0Var6, mk0Var, i6)) {
                                    u4();
                                    d5();
                                }
                                ch9 ch9Var8 = this.R3;
                                if (ch9Var8 != null) {
                                    ch9Var8.h();
                                    return true;
                                }
                            }
                        }
                    }
                    if (u3(mk0Var4) && (i2 = indexOf + 1) < arrayList.size() && ((mk0) arrayList.get(i2)).i && x3(mk0Var.b)) {
                        View D13 = D1(mk0Var);
                        if ((D13 instanceof km9) && ((km9) D13).getEditText().isFocused()) {
                            ch9 ch9Var9 = this.R3;
                            if (ch9Var9 != null) {
                                ch9Var9.d();
                            }
                            dg9 editText2 = ((km9) D1(mk0Var)).getEditText();
                            CharSequence m = pv3.m(mm9.r(((TL_iv.pageBlockDetails) mk0Var4.b).title, null, true), editText2.getPaint().getFontMetricsInt(), false, null, 0);
                            int length = m.length();
                            Editable text2 = editText2.getText();
                            if (text2 != null && m.length() != 0) {
                                editText2.j2 = true;
                                text2.insert(0, m);
                                editText2.j2 = false;
                            }
                            km9.b(mk0Var.b, editText2.getText());
                            arrayList.remove(i2);
                            arrayList.remove(i6);
                            u4();
                            d5();
                            editText2.setSelection(Math.min(length, editText2.length()));
                            ch9 ch9Var10 = this.R3;
                            if (ch9Var10 != null) {
                                ch9Var10.h();
                                return true;
                            }
                        }
                    }
                    if (u3(mk0Var4) || mk0Var4.i) {
                        if (!z) {
                            return true;
                        }
                        if (u3(mk0Var4) && ((i = indexOf + 1) >= arrayList.size() || ((mk0) arrayList.get(i)).i)) {
                            return true;
                        }
                        ch9 ch9Var11 = this.R3;
                        if (ch9Var11 != null) {
                            ch9Var11.d();
                        }
                        arrayList.remove(indexOf);
                        u4();
                        l9cVar.O(false);
                        ch9 ch9Var12 = this.R3;
                        if (ch9Var12 != null) {
                            ch9Var12.h();
                        }
                        post(new th9(this, mk0Var4, (byte) 3));
                        return true;
                    }
                    boolean B3 = B3(mk0Var4.b);
                    ch9 ch9Var13 = this.R3;
                    byte b3 = 4;
                    if (B3) {
                        if (ch9Var13 != null) {
                            ch9Var13.d();
                        }
                        arrayList.remove(i6);
                        u4();
                        if (!(findFocus() instanceof dg9)) {
                            l9cVar.O(false);
                            ch9 ch9Var14 = this.R3;
                            if (ch9Var14 != null) {
                                ch9Var14.h();
                            }
                            post(new th9(this, mk0Var, b3));
                            return true;
                        }
                        d5();
                        ch9 ch9Var15 = this.R3;
                        if (ch9Var15 != null) {
                            ch9Var15.h();
                            return true;
                        }
                    } else {
                        if (ch9Var13 != null) {
                            ch9Var13.d();
                        }
                        if (!N1(mk0Var4, mk0Var, indexOf)) {
                            View D14 = D1(mk0Var4);
                            ArrayList arrayList5 = this.x4;
                            int indexOf2 = arrayList5.indexOf(mk0Var);
                            if (!(D14 instanceof km9) || indexOf2 < 0) {
                                SpannableStringBuilder z3 = km9.z(mk0Var4.b);
                                int length2 = z3.length();
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z3);
                                spannableStringBuilder.append((CharSequence) km9.z(mk0Var.b));
                                km9.b(mk0Var4.b, spannableStringBuilder);
                                arrayList.remove(indexOf);
                                u2();
                                u4();
                                l9cVar.O(false);
                                ch9 ch9Var16 = this.R3;
                                if (ch9Var16 != null) {
                                    ch9Var16.h();
                                }
                                post(new lh9(this, mk0Var4, length2, (byte) 5));
                                return true;
                            }
                            km9 km9Var2 = (km9) D14;
                            dg9 editText3 = km9Var2.getEditText();
                            int length3 = editText3.length();
                            SpannableStringBuilder z4 = km9.z(mk0Var.b);
                            Editable text3 = editText3.getText();
                            if (text3 != null && z4 != null && z4.length() != 0) {
                                editText3.j2 = true;
                                text3.append((CharSequence) z4);
                                editText3.j2 = false;
                            }
                            km9.b(mk0Var4.b, editText3.getText());
                            View D15 = D1(mk0Var);
                            if (!(D15 instanceof km9) || (text = (editText = ((km9) D15).getEditText()).getText()) == null || text.length() <= 0) {
                                z2 = true;
                            } else {
                                editText.j2 = true;
                                z2 = true;
                                text.delete(0, text.length());
                                editText.j2 = false;
                            }
                            km9Var2.A();
                            editText3.setSelection(Math.max(0, Math.min(length3, editText3.length())));
                            arrayList.remove(indexOf);
                            boolean u2 = u2();
                            u4();
                            if (u2) {
                                l9cVar.O(false);
                                ch9 ch9Var17 = this.R3;
                                if (ch9Var17 != null) {
                                    ch9Var17.h();
                                }
                                post(new lh9(this, mk0Var4, Math.max(0, length3), b3));
                                return z2;
                            }
                            l9cVar.T();
                            r4(indexOf);
                            o79 itemAnimator = getItemAnimator();
                            setItemAnimator(null);
                            l9cVar.s(indexOf2);
                            if ((mk0Var4.d > 0 || mk0Var.d > 0) && indexOf2 < arrayList5.size()) {
                                l9cVar.l(indexOf2, arrayList5.size() - indexOf2);
                            }
                            post(new kh9(this, itemAnimator, (byte) 2));
                            ch9 ch9Var18 = this.R3;
                            if (ch9Var18 == null) {
                                return z2;
                            }
                            ch9Var18.h();
                            return z2;
                        }
                        ch9 ch9Var19 = this.R3;
                        if (ch9Var19 != null) {
                            ch9Var19.h();
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V4(mk0 mk0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        mk0 mk0Var2;
        ch9 ch9Var;
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf >= 0) {
            ch9 ch9Var2 = this.R3;
            if (ch9Var2 != null) {
                ch9Var2.d();
            }
            mk0Var.b = pageBlock;
            mk0Var.c = i;
            mk0Var.d = i2;
            mk0Var.e = z;
            mk0Var.f = z2;
            u4();
            boolean z3 = pageBlock instanceof TL_iv.pageBlockTable;
            if (z3) {
                int i3 = indexOf + 1;
                if (i3 >= arrayList.size() || B3(((mk0) arrayList.get(i3)).b)) {
                    arrayList.add(i3, new mk0(new TL_iv.pageBlockParagraph(), 0, 0));
                }
            } else if (B3(pageBlock)) {
                if (A3(pageBlock) && mk0Var.g == null) {
                    mk0Var.g = new p07();
                }
                int i4 = indexOf + 1;
                if (i4 >= arrayList.size() || B3(((mk0) arrayList.get(i4)).b)) {
                    mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                    arrayList.add(i4, mk0Var2);
                } else {
                    mk0Var2 = (mk0) arrayList.get(i4);
                }
                if (mk0Var2 == mk0Var || z3 || B3(pageBlock) || !(findFocus() instanceof dg9)) {
                    this.g3.O(false);
                    ch9Var = this.R3;
                    if (ch9Var != null) {
                        ch9Var.h();
                    }
                    post(new jh9(this, mk0Var2, (byte) 17));
                }
                U1();
                ch9 ch9Var3 = this.R3;
                if (ch9Var3 != null) {
                    ch9Var3.h();
                }
                View D1 = D1(mk0Var);
                if (D1 instanceof km9) {
                    km9 km9Var = (km9) D1;
                    km9Var.A();
                    km9Var.getEditText().setSelection(km9Var.getEditText().length());
                    return;
                }
                return;
            }
            mk0Var2 = mk0Var;
            if (mk0Var2 == mk0Var) {
            }
            this.g3.O(false);
            ch9Var = this.R3;
            if (ch9Var != null) {
            }
            post(new jh9(this, mk0Var2, (byte) 17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W1() {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            ArrayList arrayList6 = this.t3;
            if (i6 >= arrayList6.size()) {
                return;
            }
            mk0 mk0Var = (mk0) arrayList6.get(i6);
            ArrayList arrayList7 = mk0Var.j;
            ArrayList arrayList8 = mk0Var.k;
            arrayList7.clear();
            int i7 = 1;
            if (mk0Var.i) {
                if (!arrayList.isEmpty()) {
                    qd4.v(1, arrayList);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
                i4 = i5;
            } else {
                for (int i8 = i5; i8 < arrayList8.size(); i8++) {
                    ((Long) arrayList8.get(i8)).getClass();
                    arrayList7.add(new mf9());
                }
                for (int i9 = i5; i9 < arrayList.size(); i9++) {
                    arrayList7.add((mf9) arrayList.get(i9));
                }
                int max = Math.max(i5, mk0Var.c);
                if (max == 0) {
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    int i10 = mk0Var.d > 0 ? 1 : i5;
                    while (arrayList2.size() > max) {
                        arrayList2.remove(arrayList2.size() - 1);
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList4.remove(arrayList4.size() - 1);
                        arrayList5.remove(arrayList5.size() - 1);
                    }
                    int i11 = 1;
                    while (i11 <= max) {
                        int i12 = i11 - 1;
                        if (i11 == max) {
                            i2 = i5;
                            i = i7;
                        } else {
                            i = i5;
                            i2 = i;
                        }
                        int i13 = i12 < arrayList2.size() ? i7 : i2;
                        if (i13 == 0 || i == 0) {
                            i3 = i7;
                        } else {
                            i3 = i7;
                            if (((Boolean) arrayList3.get(i12)).booleanValue() != i10) {
                                i13 = i2;
                            }
                        }
                        if (i13 == 0) {
                            while (arrayList2.size() > i12) {
                                arrayList2.remove(arrayList2.size() - 1);
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList4.remove(arrayList4.size() - 1);
                                arrayList5.remove(arrayList5.size() - 1);
                            }
                            arrayList2.add(Long.valueOf(mf9.a()));
                            arrayList3.add(Boolean.valueOf(i != 0 ? i10 : i2));
                            arrayList4.add(Integer.valueOf(i2));
                            arrayList5.add(0L);
                        }
                        ((Long) arrayList2.get(i12)).getClass();
                        if (i != 0) {
                            if (((Long) arrayList5.get(i12)).longValue() == 0 || !B3(mk0Var.b)) {
                                arrayList4.set(i12, Integer.valueOf(((Integer) arrayList4.get(i12)).intValue() + 1));
                                arrayList5.set(i12, Long.valueOf(mk0Var.a));
                            } else {
                                ((Integer) arrayList4.get(i12)).getClass();
                                ((Long) arrayList5.get(i12)).getClass();
                            }
                            arrayList7.add(new mf9());
                        } else {
                            ((Boolean) arrayList3.get(i12)).getClass();
                            arrayList7.add(new mf9());
                        }
                        i11++;
                        i5 = i2;
                        i7 = i3;
                    }
                }
                i4 = i5;
                if (u3(mk0Var)) {
                    boolean z = ((TL_iv.pageBlockDetails) mk0Var.b).open;
                    mf9.a();
                    arrayList.add(new mf9());
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (km9.n(mk0Var.b)) {
                    mf9.a();
                    arrayList7.add(new mf9());
                }
            }
            i6++;
            i5 = i4;
        }
    }

    public final ArrayList W2() {
        return V2(0, this.t3.size(), 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W3(mk0 mk0Var, boolean z) {
        int i;
        ch9 ch9Var;
        int indexOf = this.t3.indexOf(mk0Var);
        if (indexOf >= 0) {
            View D1 = D1(mk0Var);
            if (D1 instanceof km9) {
                km9 km9Var = (km9) D1;
                if (km9Var.getEditText().isFocused()) {
                    i = km9Var.getEditText().getSelectionEnd();
                    ch9Var = this.R3;
                    if (ch9Var != null) {
                        ch9Var.d();
                    }
                    if (n3(indexOf, z, false)) {
                        u4();
                        if (findFocus() instanceof dg9) {
                            U1();
                        } else {
                            this.g3.O(false);
                        }
                        ch9 ch9Var2 = this.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.h();
                        }
                        if (i < 0) {
                            return true;
                        }
                        post(new lh9(this, mk0Var, i, (byte) 2));
                        return true;
                    }
                }
            }
            i = -1;
            ch9Var = this.R3;
            if (ch9Var != null) {
            }
            if (n3(indexOf, z, false)) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
    
        if (r2 != false) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W4() {
        xl9 xl9Var;
        int[] f5;
        int[] f52;
        ArrayList arrayList;
        boolean z;
        int length;
        jf9 jf9Var;
        km9 km9Var;
        int m;
        if (this.t3.isEmpty()) {
            return false;
        }
        di9 di9Var = this.v3;
        boolean w = di9Var.w();
        SparseIntArray sparseIntArray = di9Var.y0;
        s8b s8bVar = di9Var.m0;
        zlb zlbVar = null;
        if (w) {
            int i = di9Var.p0;
            if (i == di9Var.s0) {
                View D4 = D4(i);
                if ((D4 instanceof xl9) && (((f5 = f5((xl9Var = (xl9) D4))) == null || di9Var.q0 != 0 || di9Var.r0 != 0 || di9Var.t0 != f5[0] || di9Var.u0 != f5[1]) && (f52 = f5(xl9Var)) != null)) {
                    int i2 = f52[0];
                    int i3 = f52[1];
                    ArrayList arrayList2 = di9Var.A0;
                    int c0 = di9Var.c0(xl9Var);
                    if (c0 >= 0 && (i2 != 0 || i3 != 0)) {
                        di9Var.W = xl9Var;
                        di9Var.s0 = c0;
                        di9Var.p0 = c0;
                        di9Var.q0 = 0;
                        di9Var.t0 = i2;
                        di9Var.r0 = 0;
                        di9Var.u0 = i3;
                        di9Var.u = 0;
                        di9Var.v = i3;
                        di9Var.B0 = c0;
                        di9Var.D0 = 0;
                        di9Var.C0 = 0;
                        di9Var.g0(xl9Var, c0);
                        arrayList2.clear();
                        xl9Var.k(arrayList2);
                        if (!arrayList2.isEmpty() && arrayList2.size() > 0) {
                            di9Var.a = ((kmb) arrayList2.get(0)).getX();
                            di9Var.b = ((kmb) arrayList2.get(0)).getY();
                        } else if (!arrayList2.isEmpty()) {
                            di9Var.a = ((kmb) arrayList2.get(0)).getX();
                            di9Var.b = ((kmb) arrayList2.get(0)).getY();
                        }
                        lmb lmbVar = di9Var.C;
                        if (lmbVar != null) {
                            lmbVar.setVisibility(0);
                        }
                        di9Var.S();
                        di9Var.v();
                        di9Var.t();
                        hl.r(s8bVar);
                        hl.c3(s8bVar);
                        b0f b0fVar = di9Var.D;
                        if (b0fVar != null) {
                            b0fVar.a(true);
                        }
                        xl9Var.invalidate();
                        return true;
                    }
                }
            }
        } else {
            dg9 M2 = M2();
            if (M2 != 0 && M2.getText() != null && (length = M2.getText().length()) > 0) {
                xl9 R2 = R2(M2);
                if (R2 != null) {
                    if (M2 == R2.getTitleEditText()) {
                        m = 0;
                    } else {
                        am9 q = R2.q(M2);
                        m = q != null ? R2.m(q.b) : -1;
                    }
                    if (m >= 0) {
                        M2.setSelection(M2.getSelectionEnd());
                        z = di9Var.i0(R2, m, 0, length);
                    }
                } else {
                    if (!(M2 instanceof jf9)) {
                        ViewParent parent = M2.getParent();
                        while (true) {
                            if (parent == null) {
                                jf9Var = null;
                                break;
                            }
                            if (parent instanceof jf9) {
                                jf9Var = (jf9) parent;
                                break;
                            }
                            parent = parent.getParent();
                        }
                    } else {
                        jf9Var = (jf9) M2;
                    }
                    if (jf9Var instanceof zlb) {
                        M2.setSelection(M2.getSelectionEnd());
                        z = di9Var.i0((zlb) jf9Var, 0, 0, length);
                    } else {
                        ViewParent parent2 = M2.getParent();
                        while (true) {
                            if (parent2 == null) {
                                km9Var = null;
                                break;
                            }
                            if (parent2 instanceof km9) {
                                km9Var = (km9) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (km9Var != null) {
                            int i4 = M2 == km9Var.getAuthorEditText() ? 1 : 0;
                            M2.setSelection(M2.getSelectionEnd());
                            z = di9Var.i0(km9Var, i4, 0, length);
                        }
                    }
                }
            }
            z = false;
        }
        int i5 = 0;
        while (true) {
            arrayList = this.x4;
            if (i5 >= arrayList.size()) {
                break;
            }
            mk0 mk0Var = (mk0) arrayList.get(i5);
            long j = mk0Var.t;
            if (j != 0) {
                di9Var.W(i5, mm9.l((TL_iv.RichText) this.u3.get(Long.valueOf(j))));
            } else {
                di9Var.W(i5, km9.y(mk0Var.b));
                if (km9.n(mk0Var.b)) {
                    String l = mm9.l(km9.h(mk0Var.b));
                    if (!l.isEmpty()) {
                        di9Var.w0.put(65536 + i5, amb.X(l));
                        sparseIntArray.put(i5, Math.max(2, sparseIntArray.get(i5)));
                    }
                }
            }
            i5++;
        }
        int size = arrayList.size() - 1;
        mk0 mk0Var2 = (mk0) arrayList.get(size);
        String l2 = (mk0Var2.t == 0 && km9.n(mk0Var2.b)) ? mm9.l(km9.h(mk0Var2.b)) : "";
        if (l2.isEmpty()) {
            di9Var.h0(0, size);
            return true;
        }
        int length2 = l2.length();
        if (size >= 0) {
            if (di9Var.F != null) {
                int i6 = 0;
                while (true) {
                    if (i6 >= di9Var.F.getChildCount()) {
                        break;
                    }
                    KeyEvent.Callback childAt = di9Var.F.getChildAt(i6);
                    if (childAt instanceof zlb) {
                        zlb zlbVar2 = (zlb) childAt;
                        if (di9Var.c0(zlbVar2) == size) {
                            zlbVar = zlbVar2;
                            break;
                        }
                    }
                    i6++;
                }
            }
            di9Var.W = zlbVar;
            di9Var.u = 0;
            di9Var.v = length2;
            di9Var.p0 = 0;
            di9Var.s0 = size;
            di9Var.q0 = 0;
            di9Var.t0 = 1;
            di9Var.r0 = 0;
            di9Var.u0 = length2;
            sparseIntArray.put(0, Math.max(1, sparseIntArray.get(0)));
            sparseIntArray.put(size, Math.max(2, sparseIntArray.get(size)));
            di9Var.B0 = 0;
            di9Var.D0 = 0;
            di9Var.C0 = 0;
            lmb lmbVar2 = di9Var.C;
            if (lmbVar2 != null) {
                lmbVar2.setVisibility(0);
            }
            di9Var.S();
            di9Var.v();
            di9Var.t();
            hl.r(s8bVar);
            hl.c3(s8bVar);
            b0f b0fVar2 = di9Var.D;
            if (b0fVar2 != null) {
                b0fVar2.a(true);
            }
        }
        return true;
    }

    public final void X1(r47 r47Var) {
        TLRPC.Document F0;
        if (r47Var == null || (F0 = r47Var.F0()) == null) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        mk0 mk0Var = new mk0(pageblockaudio, 0, 0);
        p07 p07Var = new p07();
        mk0Var.g = p07Var;
        p07Var.c = true;
        long j = F0.id;
        boolean z = j == 0 || F0.dc_id == 0 || F0.access_hash == 0;
        if (z) {
            TLRPC.Message message = r47Var.k;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            p07 p07Var2 = mk0Var.g;
            p07Var2.i = F0;
            p07Var2.e = str;
            p07Var2.a = (byte) 1;
            p07Var2.f = 0.0f;
        } else {
            p07Var.h = F0;
            p07Var.i = F0;
            p07Var.a = (byte) 2;
            pageblockaudio.audio_id = j;
        }
        r3(mk0Var);
        if (z) {
            p07 p07Var3 = mk0Var.g;
            String str2 = p07Var3.e;
            IdentityHashMap identityHashMap = this.h4;
            sj9 sj9Var = (sj9) identityHashMap.remove(p07Var3);
            if (sj9Var != null) {
                sj9Var.b();
            }
            sj9 sj9Var2 = new sj9(this.n3, str2, F0, new bi9(this, p07Var3, mk0Var));
            identityHashMap.put(p07Var3, sj9Var2);
            sj9Var2.d();
        }
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        this.p3.onContentChanged();
    }

    public final boolean X2() {
        ArrayList arrayList = this.t3;
        mk0 mk0Var = arrayList.isEmpty() ? null : (mk0) c00.g(1, arrayList);
        if (mk0Var != null && !B3(mk0Var.b) && !mk0Var.i && !u3(mk0Var) && !H2(mk0Var.b)) {
            if (!(D1(mk0Var) instanceof km9)) {
                return false;
            }
            b3(mk0Var);
            return true;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(mk0Var2);
        this.g3.O(false);
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        post(new jh9(this, mk0Var2, (byte) 20));
        return true;
    }

    public final void X3() {
        if (this.Q3) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.h();
        }
        this.p3.f();
        q4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        if (r3 <= r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0130, code lost:
    
        r1.j0(r10, r11, r9);
        r1.k0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0136, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:
    
        if (r4 <= r3.getLineRight(r12)) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X4(View view, float f, float f2) {
        int lineForVertical;
        int lineForVertical2;
        am9 m;
        int lineForVertical3;
        if (view != 0) {
            di9 di9Var = this.v3;
            if (!di9Var.w()) {
                int left = (int) ((f - view.getLeft()) - getLeft());
                int top = (int) ((f2 - view.getTop()) - getTop());
                if (view instanceof km9) {
                    km9 km9Var = (km9) view;
                    dg9 dg9Var = km9Var.h;
                    dg9 dg9Var2 = km9Var.f;
                    LinearLayout linearLayout = km9Var.b;
                    if (km9.x(dg9Var2, dg9Var2.getLeft() + linearLayout.getLeft(), dg9Var2.getTop() + linearLayout.getTop(), left, top) || (dg9Var.getVisibility() == 0 && km9.x(dg9Var, dg9Var.getLeft(), dg9Var.getTop(), left, top))) {
                        di9Var.j0(km9Var, left, top);
                        di9Var.k0();
                        return true;
                    }
                } else if (view instanceof xl9) {
                    xl9 xl9Var = (xl9) view;
                    wl9 wl9Var = xl9Var.x;
                    ti9 ti9Var = xl9Var.s;
                    zl9 zl9Var = xl9Var.w;
                    TL_iv.pageTableCell o = xl9Var.o(left, top);
                    if (o != null && (m = zl9Var.m(o)) != null) {
                        dg9 dg9Var3 = m.a;
                        int scrollX = ti9Var.getScrollX() + (((left - ti9Var.getLeft()) - wl9Var.getLeft()) - zl9Var.getLeft());
                        int top2 = ((top - ti9Var.getTop()) - wl9Var.getTop()) - zl9Var.getTop();
                        int left2 = (scrollX - m.getLeft()) - dg9Var3.getLeft();
                        int top3 = (top2 - m.getTop()) - dg9Var3.getTop();
                        Layout layout = dg9Var3.getLayout();
                        if (layout != null) {
                            int paddingTop = top3 - dg9Var3.getPaddingTop();
                            int paddingLeft = left2 - dg9Var3.getPaddingLeft();
                            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical3 = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical3 < layout.getLineCount()) {
                                float lineLeft = layout.getLineLeft(lineForVertical3);
                                float lineRight = layout.getLineRight(lineForVertical3);
                                float f3 = paddingLeft;
                                if (f3 >= lineLeft) {
                                }
                            }
                        }
                    }
                    dg9 dg9Var4 = xl9Var.r;
                    Layout layout2 = dg9Var4.getLayout();
                    if (layout2 != null) {
                        int paddingLeft2 = left - (dg9Var4.getPaddingLeft() + dg9Var4.getLeft());
                        int paddingTop2 = top - (dg9Var4.getPaddingTop() + dg9Var4.getTop());
                        if (paddingTop2 >= 0 && paddingTop2 < layout2.getHeight() && (lineForVertical2 = layout2.getLineForVertical(paddingTop2)) >= 0 && lineForVertical2 < layout2.getLineCount()) {
                            float f4 = paddingLeft2;
                            if (f4 >= layout2.getLineLeft(lineForVertical2)) {
                            }
                        }
                    }
                } else if (view instanceof jf9) {
                    if (((jf9) view).a(left, top)) {
                        di9Var.j0(view, left, top);
                        di9Var.k0();
                        return true;
                    }
                } else if (view instanceof rf9) {
                    rf9 rf9Var = (rf9) view;
                    dg9 dg9Var5 = rf9Var.d;
                    Layout layout3 = dg9Var5.getLayout();
                    if (layout3 != null && dg9Var5.length() != 0) {
                        int paddingLeft3 = left - (dg9Var5.getPaddingLeft() + dg9Var5.getLeft());
                        int paddingTop3 = top - (dg9Var5.getPaddingTop() + dg9Var5.getTop());
                        if (paddingTop3 >= 0 && paddingTop3 < layout3.getHeight() && (lineForVertical = layout3.getLineForVertical(paddingTop3)) >= 0 && lineForVertical < layout3.getLineCount()) {
                            int L = hl.L(24.0f);
                            int max = Math.max(0, (dg9Var5.getWidth() - dg9Var5.getPaddingLeft()) - dg9Var5.getPaddingRight());
                            float f5 = L;
                            float max2 = Math.max(0.0f, layout3.getLineLeft(lineForVertical) - f5);
                            float min = Math.min(max, layout3.getLineRight(lineForVertical) + f5);
                            float f6 = paddingLeft3;
                            if (f6 >= max2 && f6 <= min) {
                                di9Var.j0(rf9Var, left, top);
                                di9Var.k0();
                                return true;
                            }
                        }
                    }
                } else if (view instanceof ij9) {
                    ij9 ij9Var = (ij9) view;
                    if (ij9Var.x != null) {
                        int[] iArr = new int[4];
                        ij9Var.h(iArr);
                        if (left >= iArr[0] && left <= iArr[2] && top >= iArr[1] && top <= iArr[3]) {
                            di9Var.j0(view, left, top);
                            di9Var.k0();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Y1(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            String mimeTypeFromExtension = (lastIndexOf < 0 || (i = lastIndexOf + 1) >= name.length()) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i).toLowerCase());
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                mimeTypeFromExtension = "application/octet-stream";
            }
            tL_document.mime_type = mimeTypeFromExtension;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            Z1(tL_document, str);
        }
    }

    public final void Y2(mk0 mk0Var, boolean z) {
        View D1 = D1(mk0Var);
        if (!(D1 instanceof pl9)) {
            Z2(mk0Var, z);
            return;
        }
        dg9 dg9Var = ((pl9) D1).r;
        dg9Var.O();
        dg9Var.setSelection(z ? dg9Var.length() : 0);
    }

    public final void Y3() {
        int length;
        int g;
        int A;
        int length2;
        int g2;
        int A2;
        int length3;
        int g3;
        int A3;
        int length4;
        int g4;
        int A5;
        dg9 R4;
        int length5;
        int g5;
        int A6;
        boolean I3 = I3();
        di9 di9Var = this.v3;
        if (I3) {
            int i = di9Var.p0;
            int i2 = di9Var.q0;
            if (i2 != di9Var.t0 || (R4 = R4(i, i2)) == null || (g5 = uh9.g(di9Var.r0, di9Var.u0, (length5 = R4.length()), 0)) >= (A6 = qu6.A(di9Var.r0, di9Var.u0, length5, 0))) {
                return;
            }
            ch9 ch9Var = this.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            if (mm9.h(R4.getText(), g5, A6)) {
                mm9.n(R4.getText(), g5, A6);
                R4.f();
                h4(i, i2);
                ch9 ch9Var2 = this.R3;
                if (ch9Var2 != null) {
                    ch9Var2.h();
                }
                q4();
            }
            R4.V1 = g5;
            R4.W1 = A6;
            R4.C();
            return;
        }
        if (v3()) {
            int i3 = di9Var.p0;
            dg9 F2 = F2(i3);
            if (F2 == null || (g4 = uh9.g(di9Var.r0, di9Var.u0, (length4 = F2.length()), 0)) >= (A5 = qu6.A(di9Var.r0, di9Var.u0, length4, 0))) {
                return;
            }
            ch9 ch9Var3 = this.R3;
            if (ch9Var3 != null) {
                ch9Var3.d();
            }
            if (mm9.h(F2.getText(), g4, A5)) {
                mm9.n(F2.getText(), g4, A5);
                F2.f();
                f4(i3);
                ch9 ch9Var4 = this.R3;
                if (ch9Var4 != null) {
                    ch9Var4.h();
                }
                q4();
            }
            F2.V1 = g4;
            F2.W1 = A5;
            F2.C();
            return;
        }
        if (t3()) {
            int i4 = di9Var.p0;
            dg9 p2 = p2(i4);
            if (p2 == null || (g3 = uh9.g(di9Var.r0, di9Var.u0, (length3 = p2.length()), 0)) >= (A3 = qu6.A(di9Var.r0, di9Var.u0, length3, 0))) {
                return;
            }
            ch9 ch9Var5 = this.R3;
            if (ch9Var5 != null) {
                ch9Var5.d();
            }
            if (mm9.h(p2.getText(), g3, A3)) {
                mm9.n(p2.getText(), g3, A3);
                p2.f();
                e4(i4);
                ch9 ch9Var6 = this.R3;
                if (ch9Var6 != null) {
                    ch9Var6.h();
                }
                q4();
            }
            p2.V1 = g3;
            p2.W1 = A3;
            p2.C();
            return;
        }
        if (D3()) {
            int i5 = di9Var.p0;
            dg9 l4 = l4(i5);
            if (l4 == null || (g2 = uh9.g(di9Var.r0, di9Var.u0, (length2 = l4.length()), 0)) >= (A2 = qu6.A(di9Var.r0, di9Var.u0, length2, 0))) {
                return;
            }
            ch9 ch9Var7 = this.R3;
            if (ch9Var7 != null) {
                ch9Var7.d();
            }
            if (mm9.h(l4.getText(), g2, A2)) {
                mm9.n(l4.getText(), g2, A2);
                l4.f();
                g4(i5);
                ch9 ch9Var8 = this.R3;
                if (ch9Var8 != null) {
                    ch9Var8.h();
                }
                q4();
            }
            l4.V1 = g2;
            l4.W1 = A2;
            l4.C();
            return;
        }
        km9 J4 = J4();
        if (J4 == null || (g = uh9.g(di9Var.r0, di9Var.u0, (length = J4.getEditText().length()), 0)) >= (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
            return;
        }
        ch9 ch9Var9 = this.R3;
        if (ch9Var9 != null) {
            ch9Var9.d();
        }
        if (mm9.h(J4.getEditText().getText(), g, A)) {
            mm9.n(J4.getEditText().getText(), g, A);
            J4.getEditText().f();
            J4.w();
            ch9 ch9Var10 = this.R3;
            if (ch9Var10 != null) {
                ch9Var10.h();
            }
            q4();
        }
        dg9 editText = J4.getEditText();
        editText.V1 = g;
        editText.W1 = A;
        J4.getEditText().C();
    }

    public final void Y4(mk0 mk0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        if (mk0Var == null) {
            mk0Var = b5();
        }
        mk0 mk0Var2 = mk0Var;
        if (mk0Var2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.t3;
        if (arrayList.indexOf(mk0Var2) < 0 || u3(mk0Var2) || mk0Var2.i) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = mk0Var2.b;
        if (pageBlock != pageBlock2 && x3(pageBlock2) && x3(pageBlock)) {
            km9 r2 = r2(arrayList.indexOf(mk0Var2));
            km9.b(pageBlock, r2 != null ? r2.getEditText().getText() : km9.z(mk0Var2.b));
            TL_iv.RichText h = km9.h(mk0Var2.b);
            if (h != null && km9.h(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = h;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = h;
                }
            }
        }
        V4(mk0Var2, pageBlock, i, i2, z, z2);
    }

    public final void Z1(TLRPC.Document document, String str) {
        if (document != null) {
            ch9 ch9Var = this.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            mk0 mk0Var = new mk0(pageblockdocument, 0, 0);
            p07 p07Var = new p07();
            mk0Var.g = p07Var;
            p07Var.d = true;
            long j = document.id;
            boolean z = j == 0 || document.dc_id == 0 || document.access_hash == 0;
            if (!z) {
                p07Var.h = document;
                p07Var.a = (byte) 2;
                pageblockdocument.document_id = j;
            } else {
                if (TextUtils.isEmpty(str) || !bp1.t(str)) {
                    return;
                }
                p07 p07Var2 = mk0Var.g;
                p07Var2.h = document;
                p07Var2.e = str;
                p07Var2.a = (byte) 1;
                p07Var2.f = 0.0f;
            }
            r3(mk0Var);
            if (z) {
                p07 p07Var3 = mk0Var.g;
                IdentityHashMap identityHashMap = this.h4;
                sj9 sj9Var = (sj9) identityHashMap.remove(p07Var3);
                if (sj9Var != null) {
                    sj9Var.b();
                }
                sj9 sj9Var2 = new sj9(this.n3, str, document, new ai9(this, p07Var3, mk0Var, str));
                identityHashMap.put(p07Var3, sj9Var2);
                sj9Var2.d();
            }
            ch9 ch9Var2 = this.R3;
            if (ch9Var2 != null) {
                ch9Var2.h();
            }
            this.p3.onContentChanged();
        }
    }

    public final void Z2(mk0 mk0Var, boolean z) {
        View D1 = D1(mk0Var);
        if (!(D1 instanceof xl9)) {
            if (z && (D1 instanceof km9)) {
                km9 km9Var = (km9) D1;
                if (km9Var.l()) {
                    km9Var.f();
                    return;
                }
            }
            dg9 P3 = P3(D1);
            if (P3 == null) {
                a3(mk0Var);
                return;
            }
            P3.O();
            if (z) {
                P3.setSelection(P3.length());
                return;
            }
            return;
        }
        xl9 xl9Var = (xl9) D1;
        dg9 dg9Var = xl9Var.r;
        ajb ajbVar = xl9Var.G;
        if (ajbVar != null) {
            if (!z) {
                dg9Var.O();
                dg9Var.setSelection(0);
            } else {
                if (ajbVar.g.isEmpty()) {
                    return;
                }
                am9 m = xl9Var.w.m((TL_iv.pageTableCell) c00.g(1, xl9Var.G.g));
                if (m != null) {
                    dg9 dg9Var2 = m.a;
                    dg9Var2.O();
                    dg9Var2.setSelection(dg9Var2.length());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z3(int i) {
        ch9 ch9Var;
        int i2;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        int i3;
        int length;
        int g;
        int A;
        int length2;
        int g2;
        int A2;
        int length3;
        int g3;
        int A3;
        ch9 ch9Var2;
        int i4;
        di9 di9Var = this.v3;
        if (di9Var == null || !di9Var.w()) {
            return;
        }
        boolean I3 = I3();
        ni9 ni9Var = this.p3;
        int i5 = 0;
        if (I3) {
            int i6 = di9Var.p0;
            int i7 = di9Var.q0;
            int i8 = di9Var.t0;
            int i9 = di9Var.r0;
            int i10 = di9Var.u0;
            boolean H3 = H3(i, i6, i7, i9, i8, i10);
            int t2 = !H3 ? t2(i) : 0;
            ch9 ch9Var3 = this.R3;
            if (ch9Var3 != null) {
                ch9Var3.d();
            }
            this.Q3 = true;
            int i11 = i7;
            boolean z2 = false;
            while (i11 <= i8) {
                dg9 R4 = R4(i6, i11);
                if (R4 == null) {
                    i4 = i7;
                } else {
                    int length4 = R4.length();
                    int i12 = i11 == i7 ? i9 : 0;
                    int i13 = i11 == i8 ? i10 : length4;
                    if (i7 == i8) {
                        i12 = Math.min(i9, i10);
                        i13 = Math.max(i9, i10);
                    }
                    int i14 = i12;
                    i4 = i7;
                    int max = Math.max(0, Math.min(i14, length4));
                    int max2 = Math.max(0, Math.min(i13, length4));
                    if (max < max2) {
                        if (H3) {
                            R4.b(i, max, max2);
                        } else {
                            if (t2 != 0) {
                                R4.b(t2, max, max2);
                            }
                            R4.a(i, max, max2);
                        }
                        R4.f();
                        R4.requestLayout();
                        h4(i6, i11);
                        z2 = true;
                    }
                }
                i11++;
                i7 = i4;
            }
            this.Q3 = false;
            if (z2 && (ch9Var2 = this.R3) != null) {
                ch9Var2.h();
            }
            ni9Var.f();
            if (z2) {
                q4();
                return;
            }
            return;
        }
        if (v3()) {
            int i15 = di9Var.p0;
            dg9 F2 = F2(i15);
            if (F2 == null || (g3 = uh9.g(di9Var.r0, di9Var.u0, (length3 = F2.length()), 0)) >= (A3 = qu6.A(di9Var.r0, di9Var.u0, length3, 0))) {
                return;
            }
            boolean z3 = (F2.c(g3, A3) & i) == 0;
            ch9 ch9Var4 = this.R3;
            if (ch9Var4 != null) {
                ch9Var4.d();
            }
            this.Q3 = true;
            if (z3) {
                int t22 = t2(i);
                if (t22 != 0) {
                    F2.b(t22, g3, A3);
                }
                F2.a(i, g3, A3);
            } else {
                F2.b(i, g3, A3);
            }
            this.Q3 = false;
            f4(i15);
            F2.f();
            F2.requestLayout();
            ch9 ch9Var5 = this.R3;
            if (ch9Var5 != null) {
                ch9Var5.h();
            }
            ni9Var.f();
            q4();
            return;
        }
        if (t3()) {
            int i16 = di9Var.p0;
            dg9 p2 = p2(i16);
            if (p2 == null || (g2 = uh9.g(di9Var.r0, di9Var.u0, (length2 = p2.length()), 0)) >= (A2 = qu6.A(di9Var.r0, di9Var.u0, length2, 0))) {
                return;
            }
            boolean z4 = (p2.c(g2, A2) & i) == 0;
            int t23 = z4 ? t2(i) : 0;
            ch9 ch9Var6 = this.R3;
            if (ch9Var6 != null) {
                ch9Var6.d();
            }
            this.Q3 = true;
            if (z4) {
                if (t23 != 0) {
                    p2.b(t23, g2, A2);
                }
                p2.a(i, g2, A2);
            } else {
                p2.b(i, g2, A2);
            }
            p2.f();
            p2.requestLayout();
            e4(i16);
            this.Q3 = false;
            ch9 ch9Var7 = this.R3;
            if (ch9Var7 != null) {
                ch9Var7.h();
            }
            ni9Var.f();
            q4();
            return;
        }
        boolean D3 = D3();
        int i17 = di9Var.p0;
        if (D3) {
            dg9 l4 = l4(i17);
            if (l4 == null || (g = uh9.g(di9Var.r0, di9Var.u0, (length = l4.length()), 0)) >= (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
                return;
            }
            boolean z5 = (l4.c(g, A) & i) == 0;
            int t24 = z5 ? t2(i) : 0;
            ch9 ch9Var8 = this.R3;
            if (ch9Var8 != null) {
                ch9Var8.d();
            }
            this.Q3 = true;
            if (z5) {
                if (t24 != 0) {
                    l4.b(t24, g, A);
                }
                l4.a(i, g, A);
            } else {
                l4.b(i, g, A);
            }
            l4.f();
            l4.requestLayout();
            g4(i17);
            this.Q3 = false;
            ch9 ch9Var9 = this.R3;
            if (ch9Var9 != null) {
                ch9Var9.h();
            }
            ni9Var.f();
            q4();
            return;
        }
        int i18 = di9Var.s0;
        int i19 = di9Var.r0;
        int i20 = di9Var.u0;
        if (i17 < 0 || i18 < 0 || i18 < i17 || i18 >= this.x4.size()) {
            return;
        }
        int i21 = i;
        boolean G3 = G3(i21, i17, i19, i18, i20);
        boolean z6 = !G3;
        int t25 = !G3 ? t2(i21) : 0;
        ch9 ch9Var10 = this.R3;
        if (ch9Var10 != null) {
            ch9Var10.d();
        }
        this.Q3 = true;
        boolean z7 = false;
        int i22 = i17;
        while (i22 <= i18) {
            mk0 B4 = B4(i22);
            if (B4 != null) {
                TL_iv.PageBlock pageBlock = B4.b;
                if (x3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                    int e2 = e2(i22);
                    int i23 = i22 == i17 ? i19 : i5;
                    z = z7;
                    int i24 = i22 == i18 ? i20 : e2;
                    int max3 = Math.max(i5, Math.min(i23, e2));
                    int max4 = Math.max(i5, Math.min(i24, e2));
                    if (max3 >= max4) {
                        i2 = t25;
                        z7 = z;
                        i22++;
                        i21 = i;
                        t25 = i2;
                        i5 = 0;
                    } else {
                        km9 r2 = r2(i22);
                        if (r2 != null) {
                            km4 styleDelegate = r2.getStyleDelegate();
                            if (G3) {
                                styleDelegate.b(i21, max3, max4);
                            } else {
                                if (t25 != 0) {
                                    styleDelegate.b(t25, max3, max4);
                                }
                                styleDelegate.a(i21, max3, max4);
                            }
                            r2.getEditText().f();
                            r2.getEditText().requestLayout();
                            r2.w();
                            i2 = t25;
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(km9.z(B4.b));
                            if (G3 || t25 == 0) {
                                i2 = t25;
                                spannableStringBuilder = spannableStringBuilder2;
                                i3 = max3;
                            } else {
                                i2 = t25;
                                i3 = max3;
                                mm9.o(spannableStringBuilder2, i3, max4, i2, false, null);
                                spannableStringBuilder = spannableStringBuilder2;
                            }
                            mm9.o(spannableStringBuilder, i3, max4, i21, z6, null);
                            km9.b(B4.b, spannableStringBuilder);
                        }
                        z7 = true;
                        i22++;
                        i21 = i;
                        t25 = i2;
                        i5 = 0;
                    }
                }
            }
            i2 = t25;
            z = z7;
            z7 = z;
            i22++;
            i21 = i;
            t25 = i2;
            i5 = 0;
        }
        boolean z8 = z7;
        this.Q3 = i5;
        if (z8 && (ch9Var = this.R3) != null) {
            ch9Var.h();
        }
        ni9Var.f();
        if (z8) {
            q4();
        }
    }

    public final void Z4(mk0 mk0Var, TL_iv.PageBlock pageBlock) {
        if (mk0Var == null) {
            mk0Var = b5();
        }
        mk0 mk0Var2 = mk0Var;
        if (mk0Var2 == null) {
            return;
        }
        Y4(mk0Var2, pageBlock, mk0Var2.c, mk0Var2.d, mk0Var2.e, mk0Var2.f);
    }

    public final void a2(Uri uri) {
        if (uri != null) {
            mk0 mk0Var = this.j4;
            String str = null;
            this.j4 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            String str2 = str;
            boolean startsWith = str2 != null ? str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) : uri.toString().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
            int i = this.z4;
            this.z4 = i - 1;
            Utilities.e.c(new q25(this, uri, startsWith, str2, i, mk0Var));
        }
    }

    public final void a3(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        if (D1 instanceof km9) {
            ((km9) D1).A();
        } else if (D1 instanceof rf9) {
            ((rf9) D1).d.O();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a4(View view) {
        pi9 pi9Var;
        dg9 editText;
        dg9 dg9Var;
        oi9 oi9Var = null;
        if (h2()) {
            boolean I3 = I3();
            di9 di9Var = this.v3;
            if (I3) {
                int i = di9Var.p0;
                int i2 = di9Var.q0;
                if (i2 == di9Var.t0) {
                    editText = R4(i, i2);
                    dg9Var = editText;
                    if (dg9Var != null) {
                        int length = dg9Var.length();
                        pi9Var = this;
                        oi9Var = new oi9(pi9Var, dg9Var, uh9.g(di9Var.r0, di9Var.u0, length, 0), qu6.A(di9Var.r0, di9Var.u0, length, 0), null);
                    }
                }
            } else {
                if (v3()) {
                    editText = F2(di9Var.p0);
                } else if (t3()) {
                    editText = p2(di9Var.p0);
                } else if (D3()) {
                    editText = l4(di9Var.p0);
                } else {
                    km9 J4 = J4();
                    if (J4 != null) {
                        editText = J4.getEditText();
                    }
                }
                dg9Var = editText;
                if (dg9Var != null) {
                }
            }
            if (oi9Var == null) {
                pi9Var.l3(false);
                pi9Var.p3.K(oi9Var, view);
                return;
            }
            return;
        }
        pi9Var = this;
        if (oi9Var == null) {
        }
    }

    public final void a5(mk0 mk0Var, int i) {
        if (mk0Var == null) {
            mk0Var = b5();
        }
        mk0 mk0Var2 = mk0Var;
        if (mk0Var2 == null) {
            return;
        }
        if (i == 0) {
            Y4(mk0Var2, mk0Var2.b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, mk0Var2.c);
        int max2 = i == 2 ? Math.max(1, mk0Var2.d) : 0;
        boolean z = i == 3;
        TL_iv.PageBlock pageBlock = mk0Var2.b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        Y4(mk0Var2, pageBlock, max, max2, z, z && mk0Var2.f);
    }

    public final void b2(no6 no6Var) {
        pi9 pi9Var;
        String str = no6Var.h;
        if (str == null) {
            str = no6Var.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        boolean c = oj9.c(no6Var);
        mk0 mk0Var = new mk0((no6Var.b || c) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        mk0Var.g = R3(no6Var, str2);
        r3(mk0Var);
        p07 p07Var = mk0Var.g;
        if (c) {
            O4(mk0Var, p07Var, no6Var);
            pi9Var = this;
        } else {
            pi9Var = this;
            pi9Var.P4(mk0Var, p07Var, str2, no6Var.b, no6Var.F, no6Var.G, no6Var.E);
        }
        ch9 ch9Var2 = pi9Var.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        pi9Var.p3.onContentChanged();
    }

    public final void b3(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        if (D1 instanceof km9) {
            km9 km9Var = (km9) D1;
            km9Var.A();
            dg9 editText = km9Var.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (D1 instanceof rf9) {
            rf9 rf9Var = (rf9) D1;
            rf9Var.d.O();
            dg9 editText2 = rf9Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void b4() {
        int length;
        int g;
        int A;
        int length2;
        int g2;
        int A2;
        int length3;
        int g3;
        int A3;
        int length4;
        int g4;
        int A5;
        dg9 R4;
        int length5;
        int g5;
        int A6;
        boolean I3 = I3();
        ni9 ni9Var = this.p3;
        di9 di9Var = this.v3;
        if (I3) {
            int i = di9Var.p0;
            int i2 = di9Var.q0;
            if (i2 != di9Var.t0 || (R4 = R4(i, i2)) == null || (g5 = uh9.g(di9Var.r0, di9Var.u0, (length5 = R4.length()), 0)) >= (A6 = qu6.A(di9Var.r0, di9Var.u0, length5, 0))) {
                return;
            }
            boolean h = mm9.h(R4.getText(), g5, A6);
            ch9 ch9Var = this.R3;
            if (h) {
                if (ch9Var != null) {
                    ch9Var.d();
                }
                mm9.n(R4.getText(), g5, A6);
                R4.f();
                h4(i, i2);
                ch9 ch9Var2 = this.R3;
                if (ch9Var2 != null) {
                    ch9Var2.h();
                }
                ni9Var.f();
                q4();
                return;
            }
            if (ch9Var != null) {
                ch9Var.d();
            }
            if (mm9.g(R4.getText(), g5, A6)) {
                mm9.m(R4.getText(), g5, A6);
                R4.f();
                h4(i, i2);
                ch9 ch9Var3 = this.R3;
                if (ch9Var3 != null) {
                    ch9Var3.h();
                }
                q4();
            }
            R4.V1 = g5;
            R4.W1 = A6;
            l3(false);
            H4(R4);
            return;
        }
        if (v3()) {
            int i3 = di9Var.p0;
            dg9 F2 = F2(i3);
            if (F2 == null || (g4 = uh9.g(di9Var.r0, di9Var.u0, (length4 = F2.length()), 0)) >= (A5 = qu6.A(di9Var.r0, di9Var.u0, length4, 0))) {
                return;
            }
            boolean h2 = mm9.h(F2.getText(), g4, A5);
            ch9 ch9Var4 = this.R3;
            if (h2) {
                if (ch9Var4 != null) {
                    ch9Var4.d();
                }
                mm9.n(F2.getText(), g4, A5);
                F2.f();
                f4(i3);
                ch9 ch9Var5 = this.R3;
                if (ch9Var5 != null) {
                    ch9Var5.h();
                }
                ni9Var.f();
                q4();
                return;
            }
            if (ch9Var4 != null) {
                ch9Var4.d();
            }
            if (mm9.g(F2.getText(), g4, A5)) {
                mm9.m(F2.getText(), g4, A5);
                F2.f();
                f4(i3);
                ch9 ch9Var6 = this.R3;
                if (ch9Var6 != null) {
                    ch9Var6.h();
                }
                q4();
            }
            F2.V1 = g4;
            F2.W1 = A5;
            l3(false);
            H4(F2);
            return;
        }
        if (t3()) {
            int i4 = di9Var.p0;
            dg9 p2 = p2(i4);
            if (p2 == null || (g3 = uh9.g(di9Var.r0, di9Var.u0, (length3 = p2.length()), 0)) >= (A3 = qu6.A(di9Var.r0, di9Var.u0, length3, 0))) {
                return;
            }
            boolean h3 = mm9.h(p2.getText(), g3, A3);
            ch9 ch9Var7 = this.R3;
            if (h3) {
                if (ch9Var7 != null) {
                    ch9Var7.d();
                }
                mm9.n(p2.getText(), g3, A3);
                p2.f();
                e4(i4);
                ch9 ch9Var8 = this.R3;
                if (ch9Var8 != null) {
                    ch9Var8.h();
                }
                ni9Var.f();
                q4();
                return;
            }
            if (ch9Var7 != null) {
                ch9Var7.d();
            }
            if (mm9.g(p2.getText(), g3, A3)) {
                mm9.m(p2.getText(), g3, A3);
                p2.f();
                e4(i4);
                ch9 ch9Var9 = this.R3;
                if (ch9Var9 != null) {
                    ch9Var9.h();
                }
                q4();
            }
            p2.V1 = g3;
            p2.W1 = A3;
            l3(false);
            H4(p2);
            return;
        }
        if (D3()) {
            int i5 = di9Var.p0;
            dg9 l4 = l4(i5);
            if (l4 == null || (g2 = uh9.g(di9Var.r0, di9Var.u0, (length2 = l4.length()), 0)) >= (A2 = qu6.A(di9Var.r0, di9Var.u0, length2, 0))) {
                return;
            }
            boolean h4 = mm9.h(l4.getText(), g2, A2);
            ch9 ch9Var10 = this.R3;
            if (h4) {
                if (ch9Var10 != null) {
                    ch9Var10.d();
                }
                mm9.n(l4.getText(), g2, A2);
                l4.f();
                g4(i5);
                ch9 ch9Var11 = this.R3;
                if (ch9Var11 != null) {
                    ch9Var11.h();
                }
                ni9Var.f();
                q4();
                return;
            }
            if (ch9Var10 != null) {
                ch9Var10.d();
            }
            if (mm9.g(l4.getText(), g2, A2)) {
                mm9.m(l4.getText(), g2, A2);
                l4.f();
                g4(i5);
                ch9 ch9Var12 = this.R3;
                if (ch9Var12 != null) {
                    ch9Var12.h();
                }
                q4();
            }
            l4.V1 = g2;
            l4.W1 = A2;
            l3(false);
            H4(l4);
            return;
        }
        km9 J4 = J4();
        if (J4 == null || (g = uh9.g(di9Var.r0, di9Var.u0, (length = J4.getEditText().length()), 0)) >= (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
            return;
        }
        boolean h5 = mm9.h(J4.getEditText().getText(), g, A);
        ch9 ch9Var13 = this.R3;
        if (h5) {
            if (ch9Var13 != null) {
                ch9Var13.d();
            }
            mm9.n(J4.getEditText().getText(), g, A);
            J4.getEditText().f();
            J4.w();
            ch9 ch9Var14 = this.R3;
            if (ch9Var14 != null) {
                ch9Var14.h();
            }
            ni9Var.f();
            q4();
            return;
        }
        if (ch9Var13 != null) {
            ch9Var13.d();
        }
        if (mm9.g(J4.getEditText().getText(), g, A)) {
            mm9.m(J4.getEditText().getText(), g, A);
            J4.getEditText().f();
            J4.w();
            ch9 ch9Var15 = this.R3;
            if (ch9Var15 != null) {
                ch9Var15.h();
            }
            q4();
        }
        dg9 editText = J4.getEditText();
        editText.V1 = g;
        editText.W1 = A;
        l3(false);
        H4(J4.getEditText());
    }

    public final mk0 b5() {
        di9 di9Var;
        int i;
        mk0 N2 = N2();
        return (N2 == null && (di9Var = this.v3) != null && di9Var.w() && (i = di9Var.p0) == di9Var.s0) ? B4(i) : N2;
    }

    public final void c2(xl9 xl9Var) {
        xl9 xl9Var2 = this.q4;
        if (xl9Var2 != null && xl9Var2 != xl9Var) {
            LinkedHashSet linkedHashSet = xl9Var2.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                xl9Var2.w.invalidate();
                xl9Var2.v();
            }
        }
        this.q4 = xl9Var;
        this.K3 = false;
        this.t4 = -1;
        this.s4 = -1;
        xl9Var.setCellSelectionListener(this.u4);
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            di9Var.e(false);
        }
        setEditTextsLocked(true);
    }

    public final void c3(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        if (D1 instanceof km9) {
            km9 km9Var = (km9) D1;
            km9Var.A();
            km9Var.getEditText().setSelection(0);
        } else if (D1 instanceof rf9) {
            rf9 rf9Var = (rf9) D1;
            rf9Var.d.O();
            rf9Var.getEditText().setSelection(0);
        }
    }

    public final void c4() {
        dg9 editText;
        Runnable fh9Var;
        int length;
        final int g;
        final int A;
        di9 di9Var = this.v3;
        if (di9Var == null || !di9Var.w()) {
            return;
        }
        byte b = 1;
        byte b2 = 0;
        if (I3()) {
            int i = di9Var.p0;
            int i2 = di9Var.q0;
            if (i2 != di9Var.t0) {
                return;
            }
            editText = R4(i, i2);
            fh9Var = new mh9(this, i, i2, (byte) 1);
        } else if (v3()) {
            int i3 = di9Var.p0;
            editText = F2(i3);
            fh9Var = new eh9(this, i3, b2);
        } else if (t3()) {
            int i4 = di9Var.p0;
            editText = p2(i4);
            fh9Var = new eh9(this, i4, b);
        } else if (D3()) {
            int i5 = di9Var.p0;
            editText = l4(i5);
            fh9Var = new eh9(this, i5, (byte) 2);
        } else {
            km9 J4 = J4();
            if (J4 == null) {
                return;
            }
            editText = J4.getEditText();
            fh9Var = new fh9(J4, b2);
        }
        final dg9 dg9Var = editText;
        final Runnable runnable = fh9Var;
        if (dg9Var == null || (g = uh9.g(di9Var.r0, di9Var.u0, (length = dg9Var.length()), 0)) > (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
            return;
        }
        Editable text = dg9Var.getText();
        int i6 = nl6.h;
        String str = null;
        if (text != null) {
            nl6[] nl6VarArr = (nl6[]) text.getSpans(g, A, nl6.class);
            if (nl6VarArr.length > 0) {
                str = nl6VarArr[0].a;
            }
        }
        if (str == null) {
            str = dg9Var.getText().subSequence(g, A).toString();
        }
        final float L = hl.L(xea.S0 + 4);
        int i7 = aob.G6;
        vnb vnbVar = this.o3;
        final int v0 = aob.v0(i7, vnbVar);
        v72.W(getContext(), str, new pcc() { // from class: rh9
            @Override // pcc
            public final void a(Object obj) {
                nl6 a;
                String str2 = (String) obj;
                pi9 pi9Var = pi9.this;
                pi9Var.getClass();
                if (TextUtils.isEmpty(str2) || (a = nl6.a(str2, v0, L)) == null) {
                    return;
                }
                ch9 ch9Var = pi9Var.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                di9 di9Var2 = pi9Var.v3;
                if (di9Var2 != null) {
                    di9Var2.e(false);
                }
                dg9 dg9Var2 = dg9Var;
                dg9Var2.setLocked(false);
                SpannableString spannableString = new SpannableString(" ");
                spannableString.setSpan(a, 0, 1, 33);
                Editable text2 = dg9Var2.getText();
                int max = Math.max(0, Math.min(g, text2.length()));
                text2.replace(max, Math.max(max, Math.min(A, text2.length())), spannableString);
                runnable.run();
                ch9 ch9Var2 = pi9Var.R3;
                if (ch9Var2 != null) {
                    ch9Var2.h();
                }
                pi9Var.p3.onContentChanged();
                int min = Math.min(max + 1, dg9Var2.length());
                dg9Var2.O();
                pi9Var.post(new qh9(dg9Var2, min, (byte) 3));
            }
        }, vnbVar);
    }

    public final void c5(float f, float f2) {
        TL_iv.pageTableCell o;
        xl9 xl9Var = this.q4;
        if (!this.J3 || xl9Var == null || this.F3 != xl9Var || (o = xl9Var.o((int) ((f - xl9Var.getLeft()) - getLeft()), (int) ((f2 - xl9Var.getTop()) - getTop()))) == null || o == this.M3) {
            return;
        }
        this.M3 = o;
        xl9Var.y(this.L3, o);
    }

    public final gi9 d2() {
        int i;
        int i2;
        di9 di9Var = this.v3;
        if (di9Var == null || !di9Var.w() || D3()) {
            return null;
        }
        mk0 B4 = B4(di9Var.p0);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B4(di9Var.s0));
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            i2 = indexOf;
            i = indexOf2;
        } else {
            i = indexOf;
            i2 = indexOf2;
        }
        for (int i3 = i; i3 <= i2; i3++) {
            mk0 mk0Var = (mk0) arrayList.get(i3);
            if (mk0Var.i || u3(mk0Var)) {
                return null;
            }
        }
        return new gi9(this, i, i2, di9Var.r0, di9Var.u0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d4() {
        ClipData primaryClip;
        String str;
        boolean isEmpty;
        pi9 pi9Var;
        HashMap hashMap;
        ArrayList y4;
        CharSequence coerceToText;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() == 0) {
            return;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
            try {
                str = itemAt.getHtmlText();
            } catch (Exception unused) {
            }
            isEmpty = TextUtils.isEmpty(str);
            di9 di9Var = this.v3;
            if (!isEmpty) {
                try {
                    hashMap = new HashMap();
                    y4 = y4(wi9.z(str, hashMap));
                } catch (Exception e) {
                    e = e;
                    pi9Var = this;
                }
                if (!y4.isEmpty()) {
                    ArrayList arrayList = this.t3;
                    pi9Var = this;
                    try {
                        if (pi9Var.M4(arrayList.indexOf(B4(di9Var.p0)), arrayList.indexOf(B4(di9Var.s0)), di9Var.r0, di9Var.u0, y4)) {
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            pi9Var.u3.putAll(hashMap);
                            return;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        cc4.g(e, true);
                        coerceToText = itemAt.coerceToText(pi9Var.getContext());
                        if (coerceToText == null) {
                        }
                        pi9Var.T1(di9Var.p0, di9Var.r0, di9Var.s0, di9Var.u0, coerceToText.toString().split("\n", -1));
                    }
                    coerceToText = itemAt.coerceToText(pi9Var.getContext());
                    if (coerceToText == null) {
                        coerceToText = "";
                    }
                    pi9Var.T1(di9Var.p0, di9Var.r0, di9Var.s0, di9Var.u0, coerceToText.toString().split("\n", -1));
                }
            }
            pi9Var = this;
            coerceToText = itemAt.coerceToText(pi9Var.getContext());
            if (coerceToText == null) {
            }
            pi9Var.T1(di9Var.p0, di9Var.r0, di9Var.s0, di9Var.u0, coerceToText.toString().split("\n", -1));
        }
        str = null;
        isEmpty = TextUtils.isEmpty(str);
        di9 di9Var2 = this.v3;
        if (!isEmpty) {
        }
        pi9Var = this;
        coerceToText = itemAt.coerceToText(pi9Var.getContext());
        if (coerceToText == null) {
        }
        pi9Var.T1(di9Var2.p0, di9Var2.r0, di9Var2.s0, di9Var2.u0, coerceToText.toString().split("\n", -1));
    }

    public final void d5() {
        km9 km9Var;
        mk0 mk0Var;
        hm9 hm9Var;
        o79 itemAnimator = getItemAnimator();
        setItemAnimator(null);
        this.g3.O(true);
        byte b = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof km9) && (mk0Var = (km9Var = (km9) childAt).y) != null && (hm9Var = km9Var.E) != null) {
                km9Var.d(mk0Var, hm9Var, km9Var.F);
            }
        }
        post(new kh9(this, itemAnimator, b));
    }

    @Override // q9c, d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        Long l;
        mk0 mk0Var;
        View view;
        Long l2;
        int i2;
        int i3;
        ArrayList arrayList2;
        mk0 mk0Var2;
        mk0 mk0Var3;
        float f;
        mk0 mk0Var4;
        boolean z;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                arrayList = this.x4;
                if (i4 >= childCount) {
                    break;
                }
                int S = RecyclerView.S(getChildAt(i4));
                mk0 mk0Var5 = (S < 0 || S >= arrayList.size()) ? null : (mk0) arrayList.get(S);
                if (mk0Var5 != null) {
                    ArrayList arrayList3 = mk0Var5.k;
                    if (arrayList3.size() > i5) {
                        i5 = arrayList3.size();
                    }
                }
                i4++;
            }
            if (i5 != 0) {
                if (this.y4 == null) {
                    ab9 ab9Var = new ab9(this);
                    this.y4 = ab9Var;
                    ab9Var.a(null, null, null, this.o3, 1);
                    nxe.a(this.y4, this.o3);
                }
                int i6 = 0;
                while (i6 < i5) {
                    float f2 = 0.0f;
                    long j = 0;
                    int i7 = 0;
                    boolean z2 = false;
                    mk0 mk0Var6 = null;
                    mk0 mk0Var7 = null;
                    float f3 = 1.0f;
                    float f4 = 0.0f;
                    while (i7 <= childCount) {
                        if (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            int S2 = RecyclerView.S(childAt);
                            mk0Var = (S2 < 0 || S2 >= arrayList.size()) ? null : (mk0) arrayList.get(S2);
                            if (mk0Var != null) {
                                ArrayList arrayList4 = mk0Var.k;
                                if (i6 < arrayList4.size()) {
                                    l = (Long) arrayList4.get(i6);
                                    i = childCount;
                                    view = childAt;
                                }
                            }
                            i = childCount;
                            view = childAt;
                            l = null;
                        } else {
                            i = childCount;
                            l = null;
                            mk0Var = null;
                            view = null;
                        }
                        if (!z2 || (l != null && l.longValue() == j)) {
                            l2 = l;
                            i2 = i6;
                            i3 = i5;
                            arrayList2 = arrayList;
                            mk0Var2 = mk0Var6;
                            mk0Var3 = mk0Var7;
                            f = f3;
                        } else {
                            int m4 = m4(i6, mk0Var6, true);
                            l2 = l;
                            int m42 = m4(i6, mk0Var7, false);
                            if (f4 - f2 <= hl.L(4.0f)) {
                                i2 = i6;
                                i3 = i5;
                                arrayList2 = arrayList;
                            } else {
                                int L = hl.L(16.0f) * i6;
                                i2 = i6;
                                int L2 = hl.L(16.0f) + L;
                                i3 = i5;
                                arrayList2 = arrayList;
                                int x = qu6.x(16.0f, getWidth(), L);
                                if (x - L2 > hl.L(8.0f)) {
                                    float floor = (float) Math.floor(xea.U0 / 3.0f);
                                    RectF rectF = hl.P;
                                    rectF.set(L2, m4 + f2, x, f4 - m42);
                                    mk0Var2 = mk0Var6;
                                    mk0Var3 = mk0Var7;
                                    this.y4.c(floor, floor, floor, f3, canvas, rectF);
                                    f = f3;
                                    this.y4.f(canvas, rectF, f);
                                    z2 = false;
                                }
                            }
                            mk0Var2 = mk0Var6;
                            mk0Var3 = mk0Var7;
                            f = f3;
                            z2 = false;
                        }
                        if (view == null || l2 == null) {
                            mk0Var7 = mk0Var3;
                            f3 = f;
                            mk0Var4 = mk0Var2;
                        } else {
                            if (z2) {
                                mk0Var4 = mk0Var2;
                                z = z2;
                            } else {
                                j = l2.longValue();
                                f2 = Float.MAX_VALUE;
                                f4 = -3.4028235E38f;
                                mk0Var4 = mk0Var;
                                z = true;
                                f = 1.0f;
                            }
                            if (mk0Var == null || mk0Var != this.a4) {
                                float y = view.getY();
                                float height = view.getHeight() + y;
                                if (y < f2) {
                                    f2 = y;
                                }
                                if (height > f4) {
                                    f4 = height;
                                }
                                f3 = Math.min(f, view.getAlpha());
                                z2 = z;
                            } else {
                                z2 = z;
                                f3 = f;
                            }
                            mk0Var7 = mk0Var;
                        }
                        i7++;
                        mk0Var6 = mk0Var4;
                        childCount = i;
                        i6 = i2;
                        i5 = i3;
                        arrayList = arrayList2;
                    }
                    i6++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final int e2(int i) {
        dg9 F2 = F2(i);
        if (F2 != null) {
            return F2.length();
        }
        km9 r2 = r2(i);
        if (r2 != null) {
            return r2.getEditText().length();
        }
        mk0 B4 = B4(i);
        if (B4 == null) {
            return 0;
        }
        return km9.y(B4.b).length();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r8 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r0.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0555, code lost:
    
        if (r0 == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r7 == 53) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0684, code lost:
    
        if (r3 < (r0 - 1)) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0778, code lost:
    
        if (r0.getLineForOffset(r6.getEditText().getSelectionEnd()) >= (r0.getLineCount() - 1)) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x02af, code lost:
    
        if (r3 < r0.size()) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x046e, code lost:
    
        if (r3 < r0.size()) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x050e, code lost:
    
        if (r2 < r0.size()) goto L351;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:611:0x0504. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:124:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0167 A[LOOP:0: B:129:0x0161->B:131:0x0167, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0561 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x05db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x08bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e3(KeyEvent keyEvent) {
        int i;
        boolean z;
        byte b;
        ArrayList arrayList;
        View findFocus;
        xl9 R2;
        int i2;
        xl9 xl9Var;
        pl9 pl9Var;
        mk0 mk0Var;
        int indexOf;
        boolean z2;
        int i3;
        dg9 P3;
        Layout layout;
        Layout layout2;
        final byte b2;
        int i4;
        km9 km9Var;
        mk0 S3;
        int i5;
        boolean z3;
        int i6;
        int k4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Layout layout3;
        int i14;
        int length;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        mk0 N2;
        int indexOf2;
        boolean z4;
        int i21;
        int i22;
        int unicodeChar;
        int i23;
        boolean z5;
        ch9 ch9Var;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isAltPressed = keyEvent.isAltPressed();
        di9 di9Var = this.v3;
        boolean w = di9Var.w();
        if (isCtrlPressed && !isAltPressed && (ch9Var = this.R3) != null) {
            if (keyCode == 54) {
                if (!isShiftPressed) {
                    ch9Var.k();
                    return true;
                }
            }
        }
        if (isCtrlPressed && !isAltPressed) {
            if (isShiftPressed) {
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            z5 = false;
                            i23 = 8;
                            if (z5) {
                            }
                        }
                        i23 = 0;
                        z5 = false;
                        if (z5) {
                        }
                    } else {
                        i23 = 256;
                        z5 = false;
                        if (z5) {
                        }
                    }
                }
                z5 = false;
                i23 = 4;
                if (z5) {
                }
            } else {
                if (keyCode != 30) {
                    if (keyCode != 33) {
                        if (keyCode == 37) {
                            z5 = false;
                            i23 = 2;
                        } else if (keyCode != 39) {
                            if (keyCode == 49) {
                                i23 = 16;
                                z5 = false;
                            }
                            i23 = 0;
                            z5 = false;
                        } else {
                            i23 = 0;
                            z5 = true;
                        }
                    }
                    z5 = false;
                    i23 = 4;
                } else {
                    z5 = false;
                    i23 = 1;
                }
                if (z5) {
                    b4();
                    return true;
                }
                if (i23 != 0) {
                    Z3(i23);
                    return true;
                }
            }
        }
        if (keyCode == 111 && w) {
            di9Var.e(false);
            return true;
        }
        if (w) {
            if (isCtrlPressed && !isShiftPressed && keyCode == 31) {
                CharSequence q = di9Var.q();
                if (q == null || q.length() == 0) {
                    return true;
                }
                g5(q);
                return true;
            }
            if (isCtrlPressed && !isShiftPressed && keyCode == 52) {
                CharSequence q2 = di9Var.q();
                if (q2 != null && q2.length() > 0) {
                    g5(q2);
                }
                B2();
                return true;
            }
            if (isCtrlPressed && keyCode == 50) {
                d4();
                return true;
            }
            if (keyCode == 67 || keyCode == 112) {
                B2();
                return true;
            }
            if (keyCode == 66) {
                v4("\n");
                return true;
            }
            if (!isCtrlPressed && !isAltPressed && (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) >= 32) {
                v4(String.valueOf((char) unicodeChar));
                return true;
            }
        }
        ArrayList arrayList2 = this.t3;
        if (!w && isShiftPressed && s3(keyCode) && (N2 = N2()) != null && (indexOf2 = arrayList2.indexOf(N2)) >= 0) {
            View D1 = D1(N2);
            if (D1 instanceof km9) {
                km9 km9Var2 = (km9) D1;
                dg9 editText = km9Var2.getEditText();
                if (editText.getLayout() != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    int length2 = editText.length();
                    switch (keyCode) {
                        case 19:
                        case 21:
                            if (selectionEnd <= 0) {
                                z4 = false;
                                i21 = !z4 ? indexOf2 + 1 : indexOf2 - 1;
                                if (i21 >= 0 && i21 < arrayList2.size()) {
                                    mk0 mk0Var2 = (mk0) arrayList2.get(i21);
                                    i = 1;
                                    for (i22 = 0; i22 < arrayList2.size(); i22++) {
                                        di9Var.W(i22, km9.y(((mk0) arrayList2.get(i22)).b));
                                    }
                                    if (length2 != 0) {
                                        int max = Math.max(0, Math.min(editText.getSelectionStart(), length2));
                                        if (z4) {
                                            if (max >= length2) {
                                                length2--;
                                            }
                                            if (di9Var.i0(km9Var2, 0, max, length2)) {
                                                KeyEvent.Callback D12 = D1(mk0Var2);
                                                if (D12 instanceof zlb) {
                                                    di9Var.a0(0, 0, (zlb) D12);
                                                    break;
                                                } else {
                                                    x0(i21);
                                                    post(new jh9(this, mk0Var2, (byte) 13));
                                                    break;
                                                }
                                            }
                                        } else if (di9Var.i0(km9Var2, 0, max, max > 0 ? 0 : 1)) {
                                            KeyEvent.Callback D13 = D1(mk0Var2);
                                            if (D13 instanceof zlb) {
                                                di9Var.a0(0, D13 instanceof km9 ? ((km9) D13).getEditText().length() : 0, (zlb) D13);
                                                break;
                                            } else {
                                                x0(i21);
                                                post(new jh9(this, mk0Var2, (byte) 14));
                                                break;
                                            }
                                        }
                                    }
                                    if (!w && isShiftPressed && s3(keyCode)) {
                                        int i24 = (isCtrlPressed || isAltPressed) ? i : 0;
                                        int i25 = di9Var.B0;
                                        int i26 = di9Var.D0;
                                        int i27 = di9Var.C0;
                                        int i28 = di9Var.p0;
                                        int i29 = di9Var.q0;
                                        int i30 = di9Var.r0;
                                        int i31 = di9Var.s0;
                                        int i32 = di9Var.t0;
                                        int i33 = di9Var.u0;
                                        if (i25 == i28 && i26 == i29 && i27 == i30) {
                                            i28 = i31;
                                            i29 = i32;
                                        } else {
                                            i33 = i30;
                                        }
                                        View D4 = D4(i28);
                                        if (D4 != null) {
                                            if (D4 instanceof xl9) {
                                                xl9 xl9Var2 = (xl9) D4;
                                                ajb model = xl9Var2.getModel();
                                                if (model != null) {
                                                    ArrayList arrayList3 = model.g;
                                                    if (!arrayList3.isEmpty()) {
                                                        int size = arrayList3.size() + 1;
                                                        int i34 = (i29 < 0 || i29 >= size) ? 0 : i29;
                                                        dg9 n = xl9Var2.n(i34);
                                                        if (n != null) {
                                                            Layout layout4 = n.getLayout();
                                                            i13 = i24;
                                                            layout3 = layout4;
                                                        } else {
                                                            i13 = i24;
                                                            layout3 = null;
                                                        }
                                                        if (layout3 != null) {
                                                            CharSequence text = layout3.getText();
                                                            z = isCtrlPressed;
                                                            int length3 = text.length();
                                                            switch (keyCode) {
                                                                case 19:
                                                                    int lineForOffset = layout3.getLineForOffset(i33) - i;
                                                                    if (lineForOffset >= 0) {
                                                                        i16 = layout3.getOffsetForHorizontal(lineForOffset, layout3.getPrimaryHorizontal(i33));
                                                                    } else if (i34 == 0) {
                                                                        i17 = i28 - 1;
                                                                        if (i17 >= 0) {
                                                                            i16 = k4(i17);
                                                                            i29 = 0;
                                                                            break;
                                                                        }
                                                                        i17 = i28;
                                                                        i16 = 0;
                                                                        break;
                                                                    } else {
                                                                        int i35 = i34 - 1;
                                                                        if (i35 >= 0 && i35 < arrayList3.size()) {
                                                                            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList3.get(i35);
                                                                            int b3 = model.b(pagetablecell);
                                                                            int a = model.a(pagetablecell);
                                                                            int i36 = b3 - 1;
                                                                            if (i36 >= 0) {
                                                                                i14 = arrayList3.indexOf(model.d[i36][Math.min(a, model.c - 1)]);
                                                                                if (i14 < 0) {
                                                                                    i15 = i14 + 1;
                                                                                    dg9 n2 = xl9Var2.n(i15);
                                                                                    Layout layout5 = n2 != null ? n2.getLayout() : null;
                                                                                    length = layout5 != null ? layout5.getText().length() : 0;
                                                                                } else {
                                                                                    length = xl9Var2.getTitleEditText().length();
                                                                                    i15 = 0;
                                                                                }
                                                                                i29 = i15;
                                                                                i16 = length;
                                                                            }
                                                                        }
                                                                        i14 = -1;
                                                                        if (i14 < 0) {
                                                                        }
                                                                        i29 = i15;
                                                                        i16 = length;
                                                                    }
                                                                    i17 = i28;
                                                                    break;
                                                                case 20:
                                                                    int lineForOffset2 = layout3.getLineForOffset(i33) + 1;
                                                                    int i37 = length3;
                                                                    if (lineForOffset2 < layout3.getLineCount()) {
                                                                        i16 = layout3.getOffsetForHorizontal(lineForOffset2, layout3.getPrimaryHorizontal(i33));
                                                                        i17 = i28;
                                                                        break;
                                                                    } else {
                                                                        if (i34 == 0) {
                                                                            if (size > i) {
                                                                                i17 = i28;
                                                                                i16 = 0;
                                                                                i29 = 1;
                                                                                break;
                                                                            } else {
                                                                                i17 = i28 + 1;
                                                                                if (i17 >= arrayList2.size()) {
                                                                                    i17 = i28;
                                                                                }
                                                                                i16 = 0;
                                                                                i29 = 0;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            int i38 = i34 - 1;
                                                                            if (i38 < 0 || i38 >= arrayList3.size()) {
                                                                                i18 = 1;
                                                                            } else {
                                                                                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList3.get(i38);
                                                                                int b4 = model.b(pagetablecell2);
                                                                                int a2 = model.a(pagetablecell2);
                                                                                i18 = 1;
                                                                                int max2 = Math.max(1, ajb.o(pagetablecell2)) + b4;
                                                                                if (max2 < model.b) {
                                                                                    i19 = arrayList3.indexOf(model.d[max2][Math.min(a2, model.c - 1)]);
                                                                                    if (i19 < 0) {
                                                                                        i20 = i19 + i18;
                                                                                        i17 = i28;
                                                                                    } else {
                                                                                        int i39 = i28 + 1;
                                                                                        if (i39 < arrayList2.size()) {
                                                                                            i17 = i39;
                                                                                            i20 = 0;
                                                                                        } else {
                                                                                            i17 = i28;
                                                                                            i20 = i29;
                                                                                            i29 = i20;
                                                                                        }
                                                                                    }
                                                                                    i37 = 0;
                                                                                    i29 = i20;
                                                                                }
                                                                            }
                                                                            i19 = -1;
                                                                            if (i19 < 0) {
                                                                            }
                                                                            i37 = 0;
                                                                            i29 = i20;
                                                                        }
                                                                        i16 = i37;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 21:
                                                                    if (i13 != 0) {
                                                                        BreakIterator wordInstance = BreakIterator.getWordInstance();
                                                                        wordInstance.setText(text.toString());
                                                                        int preceding = wordInstance.preceding(Math.max(0, Math.min(i33, text.length())));
                                                                        i16 = preceding == -1 ? 0 : preceding;
                                                                    } else {
                                                                        i16 = Math.max(0, i33 - 1);
                                                                    }
                                                                    if (i16 == i33 && i33 <= 0) {
                                                                        int i40 = i34 - 1;
                                                                        if (i40 < 0) {
                                                                            i17 = i28 - 1;
                                                                            if (i17 >= 0) {
                                                                                i16 = k4(i17);
                                                                                i29 = 0;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            dg9 n3 = xl9Var2.n(i40);
                                                                            Layout layout6 = n3 != null ? n3.getLayout() : null;
                                                                            i16 = layout6 != null ? layout6.getText().length() : 0;
                                                                            i29 = i40;
                                                                        }
                                                                    }
                                                                    i17 = i28;
                                                                    break;
                                                                case 22:
                                                                    if (i13 != 0) {
                                                                        BreakIterator wordInstance2 = BreakIterator.getWordInstance();
                                                                        wordInstance2.setText(text.toString());
                                                                        i16 = wordInstance2.following(Math.min(i33, text.length()));
                                                                        if (i16 == -1) {
                                                                            i16 = text.length();
                                                                        }
                                                                    } else {
                                                                        i16 = Math.min(length3, i33 + 1);
                                                                    }
                                                                    if (i16 == i33 && i33 >= length3) {
                                                                        int i41 = i34 + 1;
                                                                        if (i41 < size) {
                                                                            i29 = i41;
                                                                            i17 = i28;
                                                                            i16 = 0;
                                                                            break;
                                                                        } else {
                                                                            i17 = i28 + 1;
                                                                            break;
                                                                        }
                                                                    }
                                                                    i17 = i28;
                                                                    break;
                                                                default:
                                                                    i16 = i33;
                                                                    i17 = i28;
                                                                    break;
                                                            }
                                                            i10 = i16;
                                                            i11 = i17;
                                                            i12 = i29;
                                                            i29 = i34;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i42 = i24;
                                                z = isCtrlPressed;
                                                if (D4 instanceof km9) {
                                                    Layout layout7 = ((km9) D4).getEditText().getLayout();
                                                    if (layout7 != null) {
                                                        CharSequence text2 = layout7.getText();
                                                        int length4 = text2.length();
                                                        switch (keyCode) {
                                                            case 19:
                                                                int lineForOffset3 = layout7.getLineForOffset(i33) - 1;
                                                                if (lineForOffset3 >= 0) {
                                                                    i8 = layout7.getOffsetForHorizontal(lineForOffset3, layout7.getPrimaryHorizontal(i33));
                                                                    i9 = i28;
                                                                    break;
                                                                } else {
                                                                    i6 = i28 - 1;
                                                                    if (i6 >= 0) {
                                                                        k4 = k4(i6);
                                                                        int i43 = k4;
                                                                        i9 = i6;
                                                                        i8 = i43;
                                                                        break;
                                                                    } else {
                                                                        i9 = i28;
                                                                        i8 = 0;
                                                                        break;
                                                                    }
                                                                }
                                                            case 20:
                                                                int lineForOffset4 = layout7.getLineForOffset(i33) + 1;
                                                                if (lineForOffset4 >= layout7.getLineCount()) {
                                                                    i7 = i28 + 1;
                                                                    if (i7 >= arrayList2.size()) {
                                                                        i8 = length4;
                                                                    }
                                                                    i9 = i7;
                                                                    i8 = 0;
                                                                    break;
                                                                } else {
                                                                    i8 = layout7.getOffsetForHorizontal(lineForOffset4, layout7.getPrimaryHorizontal(i33));
                                                                }
                                                                i9 = i28;
                                                                break;
                                                            case 21:
                                                                if (i42 != 0) {
                                                                    BreakIterator wordInstance3 = BreakIterator.getWordInstance();
                                                                    wordInstance3.setText(text2.toString());
                                                                    int preceding2 = wordInstance3.preceding(Math.max(0, Math.min(i33, text2.length())));
                                                                    i8 = preceding2 == -1 ? 0 : preceding2;
                                                                } else {
                                                                    i8 = Math.max(0, i33 - 1);
                                                                }
                                                                if (i8 == i33 && i33 <= 0 && i28 - 1 >= 0) {
                                                                    i8 = k4(i9);
                                                                    break;
                                                                }
                                                                i9 = i28;
                                                                break;
                                                            case 22:
                                                                if (i42 != 0) {
                                                                    BreakIterator wordInstance4 = BreakIterator.getWordInstance();
                                                                    wordInstance4.setText(text2.toString());
                                                                    i8 = wordInstance4.following(Math.min(i33, text2.length()));
                                                                    if (i8 == -1) {
                                                                        i8 = text2.length();
                                                                    }
                                                                } else {
                                                                    i8 = Math.min(length4, i33 + 1);
                                                                }
                                                                if (i8 == i33) {
                                                                    if (i33 >= length4) {
                                                                        i9 = i28 + 1;
                                                                        break;
                                                                    }
                                                                }
                                                                i9 = i28;
                                                                break;
                                                            default:
                                                                i8 = i33;
                                                                i9 = i28;
                                                                break;
                                                        }
                                                        i10 = i8;
                                                        i11 = i9;
                                                        i12 = i29;
                                                    }
                                                    arrayList = arrayList2;
                                                    z3 = false;
                                                    b = 4;
                                                    break;
                                                } else {
                                                    if ((D4 instanceof vf9) || (D4 instanceof mj9) || (D4 instanceof xe9) || (D4 instanceof gj9) || (D4 instanceof ij9)) {
                                                        switch (keyCode) {
                                                            case 19:
                                                            case 21:
                                                                i6 = i28 - 1;
                                                                if (i6 >= 0) {
                                                                    k4 = k4(i6);
                                                                    int i432 = k4;
                                                                    i9 = i6;
                                                                    i8 = i432;
                                                                    break;
                                                                }
                                                                i8 = i33;
                                                                i9 = i28;
                                                                break;
                                                            case 20:
                                                            case 22:
                                                                i7 = i28 + 1;
                                                                break;
                                                        }
                                                        i10 = i8;
                                                        i11 = i9;
                                                        i12 = i29;
                                                    }
                                                    arrayList = arrayList2;
                                                    z3 = false;
                                                    b = 4;
                                                }
                                            }
                                            if (i11 != i28 || i12 != i29 || i10 != i33) {
                                                if (i11 != i28) {
                                                    x0(i11);
                                                }
                                                KeyEvent.Callback D42 = D4(i11);
                                                if (D42 instanceof zlb) {
                                                    arrayList = arrayList2;
                                                    b = 4;
                                                    z3 = di9Var.a0(i12, i10, (zlb) D42);
                                                    break;
                                                } else {
                                                    arrayList = arrayList2;
                                                    b = 4;
                                                    post(new hl2(this, i11, i12, i10, (byte) 2));
                                                    z3 = true;
                                                    break;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                                z3 = true;
                                                b = 4;
                                            }
                                        }
                                        z = isCtrlPressed;
                                        arrayList = arrayList2;
                                        z3 = false;
                                        b = 4;
                                    } else {
                                        z = isCtrlPressed;
                                        b = 4;
                                        arrayList = arrayList2;
                                    }
                                    if (!w && !isShiftPressed && !z && !isAltPressed && s3(keyCode)) {
                                        boolean z6 = keyCode == 22 || keyCode == 20;
                                        this.x3 = z6 ? di9Var.s0 : di9Var.p0;
                                        this.y3 = z6 ? di9Var.u0 : di9Var.r0;
                                        this.z3 = z6 ? di9Var.t0 : di9Var.q0;
                                        di9Var.e(false);
                                        break;
                                    } else if (z || keyCode != 29 || (!di9Var.Z() && !W4())) {
                                        if (!w && !isShiftPressed && !z && !isAltPressed && (keyCode == 20 || keyCode == 19)) {
                                            boolean z7 = keyCode != 20;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 >= getChildCount()) {
                                                    View childAt = getChildAt(i2);
                                                    if (childAt instanceof xl9) {
                                                        xl9Var = (xl9) childAt;
                                                        if (!xl9Var.getTitleEditText().isFocused()) {
                                                        }
                                                    }
                                                    i2++;
                                                } else {
                                                    xl9Var = null;
                                                }
                                            }
                                            l9c l9cVar = this.g3;
                                            if (xl9Var == null) {
                                                int indexOf3 = arrayList.indexOf(xl9Var.getRow());
                                                if (indexOf3 >= 0) {
                                                    if (z7) {
                                                        if (!xl9Var.t()) {
                                                            int Q2 = Q2(indexOf3 + 1, 1);
                                                            if (Q2 < 0) {
                                                                mk0 mk0Var3 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(mk0Var3);
                                                                l9cVar.O(false);
                                                                post(new jh9(this, mk0Var3, (byte) 2));
                                                                break;
                                                            } else {
                                                                post(new jh9(this, (mk0) arrayList.get(Q2), b));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        int Q22 = Q2(indexOf3 - 1, -1);
                                                        if (Q22 >= 0) {
                                                            post(new jh9(this, (mk0) arrayList.get(Q22), (byte) 5));
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i44 = 0;
                                                while (true) {
                                                    if (i44 < getChildCount()) {
                                                        View childAt2 = getChildAt(i44);
                                                        if (childAt2 instanceof pl9) {
                                                            pl9Var = (pl9) childAt2;
                                                            if (!pl9Var.r.isFocused()) {
                                                            }
                                                        }
                                                        i44++;
                                                    } else {
                                                        pl9Var = null;
                                                    }
                                                }
                                                if (pl9Var != null) {
                                                    dg9 dg9Var = pl9Var.r;
                                                    int indexOf4 = this.x4.indexOf(pl9Var.getRow());
                                                    if (indexOf4 >= 0) {
                                                        Layout layout8 = dg9Var.getLayout();
                                                        int lineForOffset5 = layout8 != null ? layout8.getLineForOffset(dg9Var.getSelectionEnd()) : 0;
                                                        if (z7) {
                                                            if (layout8 != null) {
                                                                int lineCount = layout8.getLineCount();
                                                                i5 = 1;
                                                                break;
                                                            } else {
                                                                i5 = 1;
                                                            }
                                                            mk0 S32 = S3(indexOf4 + i5, i5);
                                                            if (S32 == null) {
                                                                mk0 mk0Var4 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(mk0Var4);
                                                                l9cVar.O(false);
                                                                post(new jh9(this, mk0Var4, (byte) 6));
                                                                break;
                                                            } else {
                                                                post(new jh9(this, S32, (byte) 7));
                                                                break;
                                                            }
                                                        } else if ((layout8 == null || lineForOffset5 <= 0) && (S3 = S3(indexOf4 - 1, -1)) != null) {
                                                            post(new jh9(this, S3, (byte) 8));
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    int i45 = 0;
                                                    while (true) {
                                                        if (i45 < getChildCount()) {
                                                            KeyEvent.Callback childAt3 = getChildAt(i45);
                                                            if (childAt3 instanceof km9) {
                                                                km9Var = (km9) childAt3;
                                                                if (km9Var.getEditText().isFocused() || (km9Var.l() && km9Var.h.isFocused())) {
                                                                }
                                                                i45++;
                                                            } else if (childAt3 instanceof jf9) {
                                                                jf9 jf9Var = (jf9) childAt3;
                                                                if (jf9Var.getCaptionEditText().isFocused()) {
                                                                    mk0Var = jf9Var.getRow();
                                                                } else {
                                                                    i45++;
                                                                }
                                                            } else {
                                                                if (childAt3 instanceof rf9) {
                                                                    rf9 rf9Var = (rf9) childAt3;
                                                                    if (rf9Var.getEditText().isFocused()) {
                                                                        mk0Var = rf9Var.getRow();
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                                i45++;
                                                            }
                                                        } else {
                                                            mk0Var = null;
                                                        }
                                                    }
                                                    mk0Var = km9Var.getRow();
                                                    if (mk0Var != null && (indexOf = arrayList.indexOf(mk0Var)) >= 0) {
                                                        View D14 = D1(mk0Var);
                                                        boolean z8 = D14 instanceof km9;
                                                        if (z8) {
                                                            final km9 km9Var3 = (km9) D14;
                                                            dg9 dg9Var2 = km9Var3.f;
                                                            dg9 dg9Var3 = km9Var3.h;
                                                            if (km9Var3.l()) {
                                                                float f = 0.0f;
                                                                if (z7) {
                                                                    if (!dg9Var3.isFocused()) {
                                                                        z2 = z7;
                                                                        Layout layout9 = km9Var3.getEditText().getLayout();
                                                                        if (layout9 != null) {
                                                                            i3 = indexOf;
                                                                            break;
                                                                        }
                                                                        Layout layout10 = dg9Var2.getLayout();
                                                                        if (layout10 == null) {
                                                                            i4 = 0;
                                                                        } else {
                                                                            i4 = 0;
                                                                            f = layout10.getPrimaryHorizontal(Math.max(0, Math.min(dg9Var2.getSelectionEnd(), dg9Var2.length())));
                                                                        }
                                                                        final float f2 = f;
                                                                        if (dg9Var3.getVisibility() != 0) {
                                                                            dg9Var3.setVisibility(i4);
                                                                            km9Var3.requestLayout();
                                                                        }
                                                                        dg9Var3.O();
                                                                        final byte b5 = 1;
                                                                        dg9Var3.post(new Runnable() { // from class: bm9
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                byte b6 = b5;
                                                                                float f3 = f2;
                                                                                km9 km9Var4 = km9Var3;
                                                                                switch (b6) {
                                                                                    case 0:
                                                                                        dg9 dg9Var4 = km9Var4.f;
                                                                                        Layout layout11 = dg9Var4.getLayout();
                                                                                        int length5 = dg9Var4.length();
                                                                                        if (layout11 != null) {
                                                                                            length5 = layout11.getOffsetForHorizontal(Math.max(0, layout11.getLineCount() - 1), f3);
                                                                                        }
                                                                                        dg9Var4.setSelection(Math.max(0, Math.min(length5, dg9Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        dg9 dg9Var5 = km9Var4.h;
                                                                                        Layout layout12 = dg9Var5.getLayout();
                                                                                        int length6 = dg9Var5.length();
                                                                                        if (layout12 != null) {
                                                                                            length6 = layout12.getOffsetForHorizontal(0, f3);
                                                                                        }
                                                                                        dg9Var5.setSelection(Math.max(0, Math.min(length6, dg9Var5.length())));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        break;
                                                                    }
                                                                } else {
                                                                    z2 = z7;
                                                                    i3 = indexOf;
                                                                    if (dg9Var3.isFocused() && ((layout2 = km9Var3.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(km9Var3.getAuthorEditText().getSelectionEnd()) <= 0)) {
                                                                        Layout layout11 = dg9Var3.getLayout();
                                                                        if (layout11 == null) {
                                                                            b2 = 0;
                                                                        } else {
                                                                            b2 = 0;
                                                                            f = layout11.getPrimaryHorizontal(Math.max(0, Math.min(dg9Var3.getSelectionEnd(), dg9Var3.length())));
                                                                        }
                                                                        final float f3 = f;
                                                                        dg9Var2.O();
                                                                        dg9Var2.post(new Runnable() { // from class: bm9
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                byte b6 = b2;
                                                                                float f32 = f3;
                                                                                km9 km9Var4 = km9Var3;
                                                                                switch (b6) {
                                                                                    case 0:
                                                                                        dg9 dg9Var4 = km9Var4.f;
                                                                                        Layout layout112 = dg9Var4.getLayout();
                                                                                        int length5 = dg9Var4.length();
                                                                                        if (layout112 != null) {
                                                                                            length5 = layout112.getOffsetForHorizontal(Math.max(0, layout112.getLineCount() - 1), f32);
                                                                                        }
                                                                                        dg9Var4.setSelection(Math.max(0, Math.min(length5, dg9Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        dg9 dg9Var5 = km9Var4.h;
                                                                                        Layout layout12 = dg9Var5.getLayout();
                                                                                        int length6 = dg9Var5.length();
                                                                                        if (layout12 != null) {
                                                                                            length6 = layout12.getOffsetForHorizontal(0, f32);
                                                                                        }
                                                                                        dg9Var5.setSelection(Math.max(0, Math.min(length6, dg9Var5.length())));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        break;
                                                                    }
                                                                }
                                                                if (z8) {
                                                                    P3 = P3(D14);
                                                                } else {
                                                                    km9 km9Var4 = (km9) D14;
                                                                    P3 = (km9Var4.l() && km9Var4.h.isFocused()) ? km9Var4.getAuthorEditText() : km9Var4.getEditText();
                                                                }
                                                                if (P3 != null && (layout = P3.getLayout()) != null) {
                                                                    int lineForOffset6 = layout.getLineForOffset(P3.getSelectionEnd());
                                                                    if (z2) {
                                                                        if (lineForOffset6 <= 0) {
                                                                            mk0 S1 = S1(mk0Var, -1);
                                                                            if (S1 != null) {
                                                                                post(new jh9(this, S1, (byte) 12));
                                                                                break;
                                                                            } else {
                                                                                int Q23 = Q2(i3 - 1, -1);
                                                                                if (Q23 >= 0) {
                                                                                    post(new jh9(this, (mk0) arrayList.get(Q23), (byte) 3));
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (lineForOffset6 >= layout.getLineCount() - 1) {
                                                                        mk0 S12 = S1(mk0Var, 1);
                                                                        if (S12 != null) {
                                                                            post(new jh9(this, S12, (byte) 9));
                                                                            break;
                                                                        } else {
                                                                            int Q24 = Q2(i3 + 1, 1);
                                                                            if (Q24 < 0) {
                                                                                mk0 mk0Var5 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                                arrayList.add(mk0Var5);
                                                                                l9cVar.O(false);
                                                                                post(new jh9(this, mk0Var5, (byte) 10));
                                                                                break;
                                                                            } else {
                                                                                post(new jh9(this, (mk0) arrayList.get(Q24), (byte) 11));
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z2 = z7;
                                                        i3 = indexOf;
                                                        if (z8) {
                                                        }
                                                        if (P3 != null) {
                                                            int lineForOffset62 = layout.getLineForOffset(P3.getSelectionEnd());
                                                            if (z2) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!w && !z && !isAltPressed && keyCode == 61) {
                                            findFocus = findFocus();
                                            if (findFocus instanceof dg9) {
                                                if ((R2 = R2((r3 = (dg9) findFocus))) != null) {
                                                    if (findFocus != R2.getTitleEditText()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (keyCode != 61 && w) {
                                            int i46 = di9Var.p0;
                                            int i47 = di9Var.s0;
                                            if (i46 >= 0 && i47 >= i46) {
                                                if (i46 == i47) {
                                                    mk0 B4 = B4(i46);
                                                    if (B4 != null) {
                                                        W3(B4, isShiftPressed);
                                                        break;
                                                    }
                                                } else {
                                                    int indexOf5 = arrayList.indexOf(B4(i46));
                                                    int indexOf6 = arrayList.indexOf(B4(i47));
                                                    if (indexOf5 >= 0 && indexOf6 >= indexOf5) {
                                                        o4(indexOf5, indexOf6, isShiftPressed);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 20:
                        case 22:
                            if (selectionEnd >= length2) {
                                z4 = true;
                                if (!z4) {
                                }
                                if (i21 >= 0) {
                                    mk0 mk0Var22 = (mk0) arrayList2.get(i21);
                                    i = 1;
                                    while (i22 < arrayList2.size()) {
                                    }
                                    if (length2 != 0) {
                                    }
                                    if (!w) {
                                    }
                                    z = isCtrlPressed;
                                    b = 4;
                                    arrayList = arrayList2;
                                    if (!w) {
                                    }
                                    if (z) {
                                        break;
                                    }
                                    if (!w) {
                                        if (keyCode != 20) {
                                        }
                                        i2 = 0;
                                        while (true) {
                                            if (i2 >= getChildCount()) {
                                            }
                                            i2++;
                                        }
                                        l9c l9cVar2 = this.g3;
                                        if (xl9Var == null) {
                                        }
                                    }
                                    if (!w) {
                                        findFocus = findFocus();
                                        if ((findFocus instanceof dg9) && (R2 = R2((r3 = (dg9) findFocus))) != null) {
                                        }
                                    }
                                    if (keyCode != 61) {
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                    return true;
                }
            }
        }
        i = 1;
        if (!w) {
        }
        z = isCtrlPressed;
        b = 4;
        arrayList = arrayList2;
        if (!w) {
        }
        if (z) {
        }
        if (!w) {
        }
        if (!w) {
        }
        if (keyCode != 61) {
        }
        return false;
    }

    public final void e4(int i) {
        KeyEvent.Callback D4 = D4(i);
        if (D4 instanceof jf9) {
            ((jf9) D4).b();
        }
    }

    public final void e5(mk0 mk0Var, String str) {
        mk0 mk0Var2;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                ch9 ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                pageblockpreformatted.language = str;
                km9 r2 = r2(this.t3.indexOf(mk0Var));
                if (r2 != null && (mk0Var2 = r2.y) != null) {
                    r2.J(mk0Var2.b, true);
                    r2.I = null;
                    r2.B();
                }
                ch9 ch9Var2 = this.R3;
                if (ch9Var2 != null) {
                    ch9Var2.h();
                }
            }
        }
    }

    public final TL_iv.RichMessage f2() {
        if (!h3()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> W2 = W2();
        if (W2.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = W2;
        richMessage.photos = y2();
        richMessage.documents = v2();
        return richMessage;
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x0428  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f3(MotionEvent motionEvent) {
        boolean z;
        mk0 row;
        int i;
        xl9 xl9Var;
        int action = motionEvent.getAction();
        byte b = 2;
        di9 di9Var = this.v3;
        View view = null;
        if (action == 0) {
            this.D3 = motionEvent.getX();
            float y = motionEvent.getY();
            this.E3 = y;
            this.H3 = false;
            this.I3 = false;
            int i2 = (int) this.D3;
            int top = ((int) y) - getTop();
            xl9 xl9Var2 = this.q4;
            if (xl9Var2 == null) {
                xl9Var2 = O2();
            }
            if (xl9Var2 != null && xl9Var2.getParent() == this) {
                int left = i2 - xl9Var2.getLeft();
                int top2 = top - xl9Var2.getTop();
                if (xl9Var2.r(left, top2) >= 0 || xl9Var2.p(left, top2) >= 0) {
                    view = xl9Var2;
                    this.F3 = view;
                    long eventTime = motionEvent.getEventTime();
                    z = di9Var.w() && eventTime - this.N3 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.D3 - this.O3) <= ((float) hl.L(24.0f)) && Math.abs(this.E3 - this.P3) <= ((float) hl.L(24.0f));
                    this.N3 = eventTime;
                    float f = this.D3;
                    this.O3 = f;
                    float f2 = this.E3;
                    this.P3 = f2;
                    if (!z && X4(this.F3, f, f2)) {
                        this.I3 = true;
                        this.N3 = 0L;
                        s8b s8bVar = di9Var.m0;
                        if (!di9Var.w()) {
                            return true;
                        }
                        di9Var.i = false;
                        di9Var.R = false;
                        di9Var.k = false;
                        lmb lmbVar = di9Var.C;
                        if (lmbVar != null) {
                            lmbVar.invalidate();
                        }
                        hl.r(s8bVar);
                        hl.c3(s8bVar);
                        return true;
                    }
                    if (this.F3 != null) {
                        Runnable runnable = this.G3;
                        if (runnable != null) {
                            removeCallbacks(runnable);
                        }
                        m72 m72Var = new m72(this, b);
                        this.G3 = m72Var;
                        postDelayed(m72Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
            }
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i3);
                if (top >= childAt.getTop() && top < childAt.getBottom() && i2 >= childAt.getLeft() && i2 < childAt.getRight()) {
                    view = childAt;
                    break;
                }
                i3++;
            }
            this.F3 = view;
            long eventTime2 = motionEvent.getEventTime();
            if (di9Var.w()) {
            }
            this.N3 = eventTime2;
            float f3 = this.D3;
            this.O3 = f3;
            float f22 = this.E3;
            this.P3 = f22;
            if (!z) {
            }
            if (this.F3 != null) {
            }
        } else {
            if (action == 1) {
                Runnable runnable2 = this.G3;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                    this.G3 = null;
                }
                if (this.J3) {
                    c5(motionEvent.getX(), motionEvent.getY());
                    xl9 xl9Var3 = this.q4;
                    if (this.J3) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.J3 = false;
                    this.L3 = null;
                    this.M3 = null;
                    this.K3 = xl9Var3 != null && xl9Var3.getSelectedCells().size() > 1;
                    if (xl9Var3 != null && !xl9Var3.I.isEmpty()) {
                        I4(xl9Var3);
                    }
                    this.F3 = null;
                    this.I3 = false;
                    return true;
                }
                if (!this.H3 && !this.I3) {
                    View view2 = this.F3;
                    if (view2 instanceof xl9) {
                        if (g3((xl9) view2, (int) ((motionEvent.getX() - r0.getLeft()) - getLeft()), (int) ((motionEvent.getY() - r0.getTop()) - getTop()))) {
                            this.F3 = null;
                            this.I3 = false;
                            return false;
                        }
                    }
                }
                if (!this.H3 && !this.I3 && (xl9Var = this.q4) != null) {
                    View view3 = this.F3;
                    if (view3 == xl9Var) {
                        xl9 xl9Var4 = (xl9) view3;
                        TL_iv.pageTableCell o = xl9Var4.o((int) ((motionEvent.getX() - xl9Var4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - xl9Var4.getTop()) - getTop()));
                        if (o != null) {
                            if (this.s4 >= 0 || this.t4 >= 0) {
                                J2();
                            } else {
                                LinkedHashSet linkedHashSet = xl9Var4.I;
                                if (!linkedHashSet.remove(o)) {
                                    linkedHashSet.add(o);
                                }
                                xl9Var4.w.invalidate();
                                xl9Var4.v();
                            }
                        }
                    } else if (view3 != null) {
                        J2();
                    }
                }
                boolean z2 = this.H3;
                l9c l9cVar = this.g3;
                ArrayList arrayList = this.t3;
                if (!z2 && !this.I3 && this.F3 == null && !di9Var.w() && this.q4 == null) {
                    float x = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x >= getLeft() && x <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i4 = 0; i4 < getChildCount(); i4++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i4).getBottom() + getTop());
                        }
                        int x2 = qu6.x(60.0f, view4.getHeight(), Math.max(Math.max(this.Y3, this.W3), this.X3));
                        if (y2 >= paddingTop && y2 <= x2) {
                            mk0 mk0Var = arrayList.isEmpty() ? null : (mk0) c00.g(1, arrayList);
                            if (mk0Var == null || !mk0Var.k.isEmpty() || B3(mk0Var.b) || mk0Var.i || u3(mk0Var) || H2(mk0Var.b)) {
                                ch9 ch9Var = this.R3;
                                if (ch9Var != null) {
                                    ch9Var.d();
                                }
                                mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(mk0Var2);
                                l9cVar.O(false);
                                ch9 ch9Var2 = this.R3;
                                if (ch9Var2 != null) {
                                    ch9Var2.h();
                                }
                                post(new jh9(this, mk0Var2, (byte) 18));
                            } else {
                                b3(mk0Var);
                            }
                        }
                    }
                }
                if (!this.H3 && !this.I3 && this.F3 == null && !di9Var.w() && this.q4 == null) {
                    float x3 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    if (this.Z3 && x3 >= getLeft() && x3 <= getRight()) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= getChildCount()) {
                                i = Integer.MAX_VALUE;
                                break;
                            }
                            View childAt2 = getChildAt(i5);
                            if (RecyclerView.S(childAt2) == 0) {
                                i = childAt2.getTop() + getTop();
                                break;
                            }
                            i5++;
                        }
                        if (i != Integer.MAX_VALUE) {
                            if (y3 >= hl.L(60.0f) + getTop() && y3 <= i) {
                                mk0 mk0Var3 = arrayList.isEmpty() ? null : (mk0) arrayList.get(0);
                                if (mk0Var3 == null || B3(mk0Var3.b) || mk0Var3.i || u3(mk0Var3) || H2(mk0Var3.b)) {
                                    ch9 ch9Var3 = this.R3;
                                    if (ch9Var3 != null) {
                                        ch9Var3.d();
                                    }
                                    mk0 mk0Var4 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, mk0Var4);
                                    l9cVar.O(false);
                                    ch9 ch9Var4 = this.R3;
                                    if (ch9Var4 != null) {
                                        ch9Var4.h();
                                    }
                                    post(new jh9(this, mk0Var4, (byte) 15));
                                } else {
                                    c3(mk0Var3);
                                }
                            }
                        }
                    }
                }
                if (!this.H3 && !this.I3 && (this.F3 instanceof ij9) && !di9Var.w() && this.q4 == null && (row = ((ij9) this.F3).getRow()) != null) {
                    TL_iv.PageBlock pageBlock = row.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        v72.W(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new v35(this, pageblockmath, (byte) 28), this.o3);
                    }
                }
                this.F3 = null;
                this.I3 = false;
                return false;
            }
            if (action == 2) {
                if (this.J3 && this.F3 == this.q4) {
                    c5(motionEvent.getX(), motionEvent.getY());
                    this.H3 = true;
                    return true;
                }
                float x4 = motionEvent.getX() - this.D3;
                float y4 = motionEvent.getY() - this.E3;
                if ((y4 * y4) + (x4 * x4) > hl.L(8.0f) * hl.L(8.0f)) {
                    this.H3 = true;
                    Runnable runnable3 = this.G3;
                    if (runnable3 != null) {
                        removeCallbacks(runnable3);
                        this.G3 = null;
                        return false;
                    }
                }
            } else if (action == 3) {
                Runnable runnable4 = this.G3;
                if (runnable4 != null) {
                    removeCallbacks(runnable4);
                    this.G3 = null;
                }
                if (this.J3) {
                    J2();
                }
                this.F3 = null;
                this.I3 = false;
                return false;
            }
        }
        return false;
    }

    public final void f4(int i) {
        mk0 B4 = B4(i);
        dg9 F2 = F2(i);
        if (!u3(B4) || F2 == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) B4.b).title = mm9.f(F2.getText());
    }

    public final TL_iv.PageBlock g2(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        TL_iv.pageBlockList pageblocklist;
        TL_iv.pageBlockOrderedList pageblockorderedlist;
        int i5;
        TL_iv.RichText richText;
        int i6;
        mk0 mk0Var;
        TL_iv.RichText richText2;
        ArrayList arrayList;
        boolean z2;
        int i7 = i3;
        int i8 = i4;
        if (z) {
            pageblockorderedlist = new TL_iv.pageBlockOrderedList();
            pageblocklist = null;
        } else {
            pageblocklist = new TL_iv.pageBlockList();
            pageblockorderedlist = null;
        }
        int i9 = i;
        int i10 = 1;
        while (i9 < i7) {
            pi9 pi9Var = this;
            ArrayList arrayList2 = pi9Var.t3;
            mk0 mk0Var2 = (mk0) arrayList2.get(i9);
            if (mk0Var2.k.size() > i8 || (i5 = mk0Var2.c) < i2) {
                break;
            }
            if (i5 == i2) {
                if ((mk0Var2.d > 0) != z) {
                    break;
                }
            }
            if (i5 > i2) {
                break;
            }
            boolean B3 = B3(mk0Var2.b);
            if (B3) {
                richText = null;
            } else {
                TL_iv.PageBlock pageBlock = mk0Var2.b;
                richText = pageBlock == null ? null : pageBlock.text;
                if (richText == null) {
                    richText = new TL_iv.textEmpty();
                }
            }
            int i11 = i9 + 1;
            ArrayList arrayList3 = new ArrayList();
            if (B3) {
                G2(mk0Var2, arrayList3);
            }
            while (i11 < i7) {
                mk0 mk0Var3 = (mk0) arrayList2.get(i11);
                if (mk0Var3.k.size() > i8) {
                    break;
                }
                mk0Var = mk0Var2;
                int i12 = mk0Var3.c;
                if (i12 >= i2) {
                    if (i12 != i2) {
                        if (mk0Var3.d > 0) {
                            richText2 = richText;
                            z2 = true;
                        } else {
                            richText2 = richText;
                            z2 = false;
                        }
                        ArrayList arrayList4 = arrayList3;
                        int[] iArr2 = {i11};
                        pi9 pi9Var2 = pi9Var;
                        i6 = i11;
                        arrayList = arrayList4;
                        TL_iv.PageBlock g2 = pi9Var2.g2(i6, i12, i7, i8, z2, iArr2);
                        if (g2 != null) {
                            arrayList.add(g2);
                        }
                        i11 = iArr2[0];
                        if (i11 <= i6) {
                            break;
                        }
                        pi9Var = this;
                        i7 = i3;
                        i8 = i4;
                        richText = richText2;
                        mk0Var2 = mk0Var;
                        arrayList3 = arrayList;
                    } else if (B3(mk0Var3.b)) {
                        G2(mk0Var3, arrayList3);
                        i11++;
                        mk0Var2 = mk0Var;
                    }
                }
                i6 = i11;
                break;
            }
            i6 = i11;
            mk0Var = mk0Var2;
            richText2 = richText;
            arrayList = arrayList3;
            if (B3 || !arrayList.isEmpty()) {
                ArrayList<TL_iv.PageBlock> arrayList5 = new ArrayList<>();
                if (!B3) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = richText2;
                    arrayList5.add(pageblockparagraph);
                }
                arrayList5.addAll(arrayList);
                if (arrayList5.isEmpty()) {
                    i7 = i3;
                    i8 = i4;
                    i9 = i6;
                } else if (z) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                    tL_pageListOrderedItemBlocks.num = bp1.n(i10, ".");
                    tL_pageListOrderedItemBlocks.blocks = arrayList5;
                    tL_pageListOrderedItemBlocks.checkbox = mk0Var.e;
                    tL_pageListOrderedItemBlocks.checked = mk0Var.f;
                    pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                } else {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                    tL_pageListItemBlocks.blocks = arrayList5;
                    tL_pageListItemBlocks.checkbox = mk0Var.e;
                    tL_pageListItemBlocks.checked = mk0Var.f;
                    pageblocklist.items.add(tL_pageListItemBlocks);
                }
            } else if (z) {
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                tL_pageListOrderedItemText.num = bp1.n(i10, ".");
                tL_pageListOrderedItemText.text = richText2;
                tL_pageListOrderedItemText.checkbox = mk0Var.e;
                tL_pageListOrderedItemText.checked = mk0Var.f;
                pageblockorderedlist.items.add(tL_pageListOrderedItemText);
            } else {
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                tL_pageListItemText.text = richText2;
                tL_pageListItemText.checkbox = mk0Var.e;
                tL_pageListItemText.checked = mk0Var.f;
                pageblocklist.items.add(tL_pageListItemText);
            }
            i10++;
            i7 = i3;
            i8 = i4;
            i9 = i6;
        }
        iArr[0] = i9;
        if (z) {
            if (!pageblockorderedlist.items.isEmpty()) {
                return pageblockorderedlist;
            }
        } else if (!pageblocklist.items.isEmpty()) {
            return pageblocklist;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d1, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g3(xl9 xl9Var, int i, int i2) {
        ajb ajbVar;
        ajb ajbVar2;
        int r = xl9Var.r(i, i2);
        LinkedHashSet linkedHashSet = xl9Var.I;
        zl9 zl9Var = xl9Var.w;
        if (r >= 0) {
            int r2 = (zl9Var.v() && r == zl9Var.k()) ? zl9Var.r() : r;
            if (xl9Var == this.q4 && (ajbVar2 = xl9Var.G) != null && r >= 0 && r2 >= r && r2 < ajbVar2.b && !linkedHashSet.isEmpty()) {
                int i3 = r;
                loop0: while (i3 <= r2) {
                    int i4 = 0;
                    while (true) {
                        ajb ajbVar3 = xl9Var.G;
                        if (i4 < ajbVar3.c) {
                            if (!linkedHashSet.contains(ajbVar3.d[i3][i4])) {
                                break loop0;
                            }
                            i4++;
                        }
                    }
                }
                I4(xl9Var);
                return true;
            }
            c2(xl9Var);
            ajb ajbVar4 = xl9Var.G;
            if (ajbVar4 != null && r >= 0 && r2 >= r && r2 < ajbVar4.b) {
                linkedHashSet.clear();
                for (int i5 = r; i5 <= r2; i5++) {
                    int i6 = 0;
                    while (true) {
                        ajb ajbVar5 = xl9Var.G;
                        if (i6 < ajbVar5.c) {
                            TL_iv.pageTableCell pagetablecell = ajbVar5.d[i5][i6];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i6++;
                        }
                    }
                }
                zl9Var.invalidate();
                xl9Var.v();
            }
            this.s4 = r;
            return true;
        }
        int p = xl9Var.p(i, i2);
        if (p < 0) {
            return false;
        }
        int q = (zl9Var.u() && p == zl9Var.j()) ? zl9Var.q() : p;
        if (xl9Var == this.q4 && (ajbVar = xl9Var.G) != null && p >= 0 && q >= p && q < ajbVar.c && !linkedHashSet.isEmpty()) {
            int i7 = p;
            loop4: while (i7 <= q) {
                int i8 = 0;
                while (true) {
                    ajb ajbVar6 = xl9Var.G;
                    if (i8 < ajbVar6.b) {
                        if (!linkedHashSet.contains(ajbVar6.d[i8][i7])) {
                            break loop4;
                        }
                        i8++;
                    }
                }
            }
            I4(xl9Var);
            return true;
        }
        c2(xl9Var);
        ajb ajbVar7 = xl9Var.G;
        if (ajbVar7 != null && p >= 0 && q >= p && q < ajbVar7.c) {
            linkedHashSet.clear();
            for (int i9 = p; i9 <= q; i9++) {
                int i10 = 0;
                while (true) {
                    ajb ajbVar8 = xl9Var.G;
                    if (i10 < ajbVar8.b) {
                        TL_iv.pageTableCell pagetablecell2 = ajbVar8.d[i10][i9];
                        if (pagetablecell2 != null) {
                            linkedHashSet.add(pagetablecell2);
                        }
                        i10++;
                    }
                }
            }
            zl9Var.invalidate();
            xl9Var.v();
        }
        this.t4 = p;
        return true;
    }

    public final void g4(int i) {
        View D4 = D4(i);
        if (D4 instanceof km9) {
            ((km9) D4).v();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:9)(1:(7:43|11|12|13|14|15|(4:17|19|20|(4:22|(1:24)(1:29)|25|27)(1:30)))(1:42))|10|11|12|13|14|15|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        cc4.g(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[Catch: Exception -> 0x007b, TRY_LEAVE, TryCatch #1 {Exception -> 0x007b, blocks: (B:15:0x005f, B:17:0x006f), top: B:14:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g5(CharSequence charSequence) {
        boolean z;
        String str;
        ClipboardManager clipboardManager;
        int i;
        int i2;
        int i3;
        di9 di9Var = this.v3;
        mk0 B4 = B4(di9Var.p0);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B4(di9Var.s0));
        int i4 = di9Var.r0;
        int i5 = di9Var.u0;
        try {
            if (indexOf < 0 || indexOf2 < 0 || indexOf >= arrayList.size() || indexOf2 >= arrayList.size()) {
                z = true;
            } else {
                if (indexOf > indexOf2) {
                    i3 = i5;
                    i2 = indexOf2;
                } else if (indexOf != indexOf2 || i4 <= i5) {
                    i = i5;
                    i2 = indexOf;
                    indexOf = indexOf2;
                    i3 = i4;
                    HashMap hashMap = this.u3;
                    StringBuilder sb = new StringBuilder();
                    pq8 pq8Var = new pq8((byte) 8);
                    int i6 = indexOf;
                    int i7 = indexOf;
                    z = true;
                    wi9.F(sb, arrayList, new int[]{i2}, i7, i2, i6, i3, i, pq8Var, false, 0, hashMap);
                    pq8Var.l(sb);
                    str = sb.toString();
                    if (!TextUtils.isEmpty(str)) {
                        nj9.a(x2(i2, i7), w2(i2, i7));
                        clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                        if (clipboardManager != null) {
                            clipboardManager.setPrimaryClip(str != null ? ClipData.newHtmlText("label", charSequence, str) : ClipData.newPlainText("label", charSequence));
                            return;
                        }
                        return;
                    }
                } else {
                    i3 = i5;
                    i2 = indexOf;
                    indexOf = indexOf2;
                }
                i = i4;
                HashMap hashMap2 = this.u3;
                StringBuilder sb2 = new StringBuilder();
                pq8 pq8Var2 = new pq8((byte) 8);
                int i62 = indexOf;
                int i72 = indexOf;
                z = true;
                wi9.F(sb2, arrayList, new int[]{i2}, i72, i2, i62, i3, i, pq8Var2, false, 0, hashMap2);
                pq8Var2.l(sb2);
                str = sb2.toString();
                if (!TextUtils.isEmpty(str)) {
                }
            }
            clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager != null) {
            }
        } catch (Exception e) {
            cc4.g(e, z);
            return;
        }
        str = null;
    }

    public dg9 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof dg9) {
            return (dg9) findFocus;
        }
        return null;
    }

    public ej9 getMapDelegate() {
        return this.l4;
    }

    public View getOverlayView() {
        return this.w3;
    }

    public amb getTextSelectionHelper() {
        return this.v3;
    }

    public final boolean h2() {
        dg9 editText;
        int length;
        int g;
        int A;
        Editable text;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w() && di9Var.p0 == di9Var.s0) {
            if (I3()) {
                int i = di9Var.p0;
                int i2 = di9Var.q0;
                if (i2 == di9Var.t0) {
                    editText = R4(i, i2);
                    if (editText != null && (g = uh9.g(di9Var.r0, di9Var.u0, (length = editText.length()), 0)) < (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
                        text = editText.getText();
                        if (text == null && g < A) {
                            for (dj9 dj9Var : (dj9[]) text.getSpans(g, A, dj9.class)) {
                                if (text.getSpanStart(dj9Var) >= A || text.getSpanEnd(dj9Var) <= g) {
                                }
                            }
                            return true;
                        }
                    }
                }
            } else {
                if (v3()) {
                    editText = F2(di9Var.p0);
                } else if (t3()) {
                    editText = p2(di9Var.p0);
                } else if (D3()) {
                    editText = l4(di9Var.p0);
                } else {
                    km9 J4 = J4();
                    if (J4 != null) {
                        editText = J4.getEditText();
                    }
                }
                if (editText != null) {
                    text = editText.getText();
                    return text == null ? true : true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockDocument) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h3() {
        int i = 0;
        loop0: while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return false;
            }
            mk0 mk0Var = (mk0) arrayList.get(i);
            if (!km9.y(mk0Var.b).isEmpty()) {
                break;
            }
            if (!A3(mk0Var.b)) {
                TL_iv.PageBlock pageBlock = mk0Var.b;
                if (!(pageBlock instanceof TL_iv.pageBlockAudio)) {
                }
            }
            for (p07 p07Var : O3(mk0Var)) {
                if (p07Var.b() || p07Var.a()) {
                    break loop0;
                }
            }
            TL_iv.PageBlock pageBlock2 = mk0Var.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock2).source)) {
                break;
            }
            TL_iv.PageBlock pageBlock3 = mk0Var.b;
            if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                int i2 = gj9.N;
                if (((TL_iv.pageBlockMap) pageBlock3).geo instanceof TLRPC.TL_geoPoint) {
                    return true;
                }
            }
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && S4((TL_iv.pageBlockTable) pageBlock3)) {
                break;
            }
            TL_iv.PageBlock pageBlock4 = mk0Var.b;
            if ((pageBlock4 instanceof TL_iv.pageBlockButtonRow) && !((TL_iv.pageBlockButtonRow) pageBlock4).buttons.isEmpty()) {
                break;
            }
            i++;
        }
        return true;
    }

    public final void h4(int i, int i2) {
        am9 m;
        View D4 = D4(i);
        if (D4 instanceof xl9) {
            xl9 xl9Var = (xl9) D4;
            if (i2 == 0) {
                xl9Var.w();
                return;
            }
            TL_iv.pageTableCell g = xl9Var.g(i2);
            if (g == null || (m = xl9Var.getGrid().m(g)) == null) {
                return;
            }
            ajb.d(g, m.a.getText());
        }
    }

    public final boolean i2() {
        int[] G4 = G4();
        if (G4 == null) {
            return j2(A2());
        }
        for (int i = G4[0]; i <= G4[1]; i++) {
            if (j2((mk0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean j2(mk0 mk0Var) {
        ArrayList arrayList;
        int indexOf;
        if (mk0Var == null || (indexOf = (arrayList = this.t3).indexOf(mk0Var)) < 0 || indexOf < 0 || indexOf >= arrayList.size()) {
            return false;
        }
        mk0 mk0Var2 = (mk0) arrayList.get(indexOf);
        if (mk0Var2.c == 0) {
            TL_iv.PageBlock pageBlock = mk0Var2.b;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !z3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !k2(indexOf)) {
                return false;
            }
        } else if (indexOf <= 0 || ((mk0) arrayList.get(indexOf - 1)).c < mk0Var2.c) {
            return false;
        }
        return m3(indexOf);
    }

    public final boolean j3() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return false;
            }
            Iterator it = O3((mk0) arrayList.get(i)).iterator();
            while (it.hasNext()) {
                if (((p07) it.next()).a()) {
                    return true;
                }
            }
            i++;
        }
    }

    public final void j4(dg9 dg9Var) {
        if (dg9Var == null) {
            return;
        }
        dg9Var.d2 = this.r3;
        dg9Var.setInlineButtonContext(this.n3);
        dg9Var.setInlineButtonClickListener(new oh9(this));
    }

    public final boolean k2(int i) {
        if (i <= 0) {
            return false;
        }
        ArrayList arrayList = this.t3;
        return i < arrayList.size() && B3(((mk0) arrayList.get(i)).b) && ((mk0) arrayList.get(i - 1)).c >= 1;
    }

    public final void k3() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof km9) {
                km9 km9Var = (km9) childAt;
                km9Var.f.m();
                km9Var.h.m();
            } else if (childAt instanceof xl9) {
                xl9 xl9Var = (xl9) childAt;
                zl9 zl9Var = xl9Var.w;
                xl9Var.r.m();
                for (int i2 = 0; i2 < zl9Var.getChildCount(); i2++) {
                    View childAt2 = zl9Var.getChildAt(i2);
                    if (childAt2 instanceof am9) {
                        ((am9) childAt2).a.m();
                    }
                }
            } else if (childAt instanceof jf9) {
                ((jf9) childAt).getCaptionEditText().m();
            } else if (childAt instanceof rf9) {
                ((rf9) childAt).getEditText().m();
            }
        }
    }

    public final int k4(int i) {
        Layout layout;
        View D4 = D4(i);
        if (!(D4 instanceof km9) || (layout = ((km9) D4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final boolean l2() {
        int[] G4 = G4();
        if (G4 == null) {
            return m2(A2());
        }
        for (int i = G4[0]; i <= G4[1]; i++) {
            if (m2((mk0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final void l3(boolean z) {
        di9 di9Var = this.v3;
        if (di9Var != null) {
            if (z) {
                di9Var.e(false);
            } else {
                hl.r(di9Var.m0);
                di9Var.t();
            }
        }
        if (z) {
            S2();
        } else {
            k3();
        }
    }

    public final dg9 l4(int i) {
        View D4 = D4(i);
        if (D4 instanceof km9) {
            return ((km9) D4).getAuthorEditText();
        }
        return null;
    }

    public final boolean m2(mk0 mk0Var) {
        ArrayList arrayList;
        int indexOf;
        return mk0Var != null && (indexOf = (arrayList = this.t3).indexOf(mk0Var)) >= 0 && mk0Var.c > 0 && indexOf >= 0 && indexOf < arrayList.size() && ((mk0) arrayList.get(indexOf)).c > 0;
    }

    public final boolean m3(int i) {
        return ((mk0) this.t3.get(i)).c + 1 <= uc7.s1(this.n3).k4.i0.f() + (-6);
    }

    public final boolean n2() {
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            return ch9Var.e || !ch9Var.b.isEmpty();
        }
        return false;
    }

    public final boolean n3(int i, boolean z, boolean z2) {
        int i2 = 0;
        if (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                mk0 mk0Var = (mk0) arrayList.get(i);
                if (z) {
                    if (mk0Var.c > 0) {
                        q2(i);
                        return true;
                    }
                } else if (mk0Var.c == 0) {
                    TL_iv.PageBlock pageBlock = mk0Var.b;
                    boolean z3 = (pageBlock instanceof TL_iv.pageBlockParagraph) || z3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z3 || k2(i)) && m3(i)) {
                        mk0 mk0Var2 = i > 0 ? (mk0) arrayList.get(i - 1) : null;
                        if (!z3) {
                            mk0Var.c = mk0Var2.c;
                            mk0Var.d = mk0Var2.d > 0 ? 1 : 0;
                            mk0Var.e = false;
                            mk0Var.f = false;
                            return true;
                        }
                        mk0Var.c = 1;
                        if (mk0Var2 != null && mk0Var2.d > 0) {
                            i2 = 1;
                        }
                        mk0Var.d = i2;
                        return true;
                    }
                } else if ((z2 || (i != 0 && ((mk0) arrayList.get(i - 1)).c >= mk0Var.c)) && m3(i)) {
                    mk0Var.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void o2(mk0 mk0Var, p07 p07Var) {
        ni9 ni9Var = this.p3;
        IdentityHashMap identityHashMap = this.i4;
        IdentityHashMap identityHashMap2 = this.h4;
        if (p07Var != null) {
            sj9 sj9Var = (sj9) identityHashMap2.remove(p07Var);
            if (sj9Var != null) {
                sj9Var.b();
            }
            oj9 oj9Var = (oj9) identityHashMap.remove(p07Var);
            if (oj9Var != null) {
                oj9Var.a();
            }
            ch9 ch9Var = this.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            s4(mk0Var, p07Var);
            ch9 ch9Var2 = this.R3;
            if (ch9Var2 != null) {
                ch9Var2.h();
            }
            ni9Var.onContentChanged();
            return;
        }
        for (p07 p07Var2 : O3(mk0Var)) {
            sj9 sj9Var2 = (sj9) identityHashMap2.remove(p07Var2);
            if (sj9Var2 != null) {
                sj9Var2.b();
            }
            oj9 oj9Var2 = (oj9) identityHashMap.remove(p07Var2);
            if (oj9Var2 != null) {
                oj9Var2.a();
            }
        }
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf >= 0) {
            ch9 ch9Var3 = this.R3;
            if (ch9Var3 != null) {
                ch9Var3.d();
            }
            arrayList.remove(indexOf);
            this.g3.O(true);
            ch9 ch9Var4 = this.R3;
            if (ch9Var4 != null) {
                ch9Var4.h();
            }
        }
        ni9Var.onContentChanged();
    }

    public final void o3(boolean z) {
        mk0 A2;
        int[] G4 = G4();
        if (G4 != null) {
            int i = G4[0];
            int i2 = G4[1];
            if (i != i2) {
                o4(i, i2, z);
                return;
            }
            A2 = (mk0) this.t3.get(i);
        } else {
            A2 = A2();
        }
        if (A2 != null) {
            W3(A2, z);
        }
    }

    public final boolean o4(int i, int i2, boolean z) {
        boolean z2;
        if (i >= 0 && i2 >= i) {
            ArrayList arrayList = this.t3;
            if (i2 < arrayList.size()) {
                ch9 ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                if (z) {
                    z2 = false;
                    while (i2 >= i) {
                        if (n3(i2, true, true)) {
                            z2 = true;
                        }
                        i2--;
                    }
                } else {
                    mk0 mk0Var = (mk0) arrayList.get(i);
                    if (mk0Var.c >= 1 && (i == 0 || ((mk0) arrayList.get(i - 1)).c < mk0Var.c)) {
                        return false;
                    }
                    z2 = false;
                    while (i <= i2) {
                        if (n3(i, false, true)) {
                            z2 = true;
                        }
                        i++;
                    }
                }
                if (z2) {
                    u4();
                    if (findFocus() instanceof dg9) {
                        U1();
                    } else {
                        this.g3.O(false);
                    }
                    ch9 ch9Var2 = this.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                }
                return z2;
            }
        }
        return false;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.U3);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.U3);
        this.i3 = false;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = this.S3;
        boolean z2 = i6 > 0 && i5 < i6;
        super.onLayout(z, i, i2, i3, i4);
        if (z2) {
            View findFocus = findFocus();
            View G = findFocus == null ? null : G(findFocus);
            if (G != null) {
                int L = (hl.L(8.0f) + G.getBottom()) - (i5 - getPaddingBottom());
                if (L > 0) {
                    post(new eh9(this, L, (byte) 3));
                }
            }
        }
        this.S3 = i5;
    }

    public final dg9 p2(int i) {
        KeyEvent.Callback D4 = D4(i);
        if (D4 instanceof jf9) {
            return ((jf9) D4).getCaptionEditText();
        }
        return null;
    }

    public final void p3(mk0 mk0Var, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = mk0Var.k;
        int size = arrayList3.size();
        int i = 0;
        while (i < size && i < arrayList.size() && ((Long) arrayList3.get(i)).equals(arrayList.get(i))) {
            i++;
        }
        for (int i2 = size - 1; i2 >= i; i2--) {
            Long l = (Long) arrayList3.get(i2);
            long longValue = l.longValue();
            Integer num = (Integer) hashMap.get(l);
            if (num != null && (num.intValue() >= 2 || i2 != 0 || this.u3.containsKey(l))) {
                mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                mk0Var2.t = longValue;
                for (int i3 = 0; i3 <= i2; i3++) {
                    mk0Var2.k.add((Long) arrayList3.get(i3));
                }
                int i4 = ol9.b;
                b8c K = b8c.K(ol9.class);
                K.H = mk0Var2;
                K.I = this.n4;
                arrayList2.add(K);
                this.x4.add(mk0Var2);
            }
        }
    }

    public final void p4(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        if (D1 instanceof mj9) {
            mj9 mj9Var = (mj9) D1;
            ArrayList arrayList = mj9Var.E;
            if (mj9Var.a != null) {
                mj9Var.p();
                if (mj9Var.a0 >= arrayList.size()) {
                    mj9Var.a0 = Math.max(0, arrayList.size() - 1);
                }
                mj9Var.q(false);
                mj9Var.requestLayout();
                mj9Var.invalidate();
            }
        }
    }

    public final void q2(int i) {
        mk0 mk0Var;
        int i2;
        ArrayList arrayList = this.t3;
        mk0 mk0Var2 = (mk0) arrayList.get(i);
        int i3 = mk0Var2.c;
        if (i3 <= 0) {
            return;
        }
        int i4 = i3 - 1;
        mk0Var2.c = i4;
        if (i4 == 0) {
            mk0Var2.d = 0;
            mk0Var2.e = false;
            mk0Var2.f = false;
        }
        while (true) {
            i++;
            if (i >= arrayList.size() || (i2 = (mk0Var = (mk0) arrayList.get(i)).c) <= i3) {
                return;
            } else {
                mk0Var.c = i2 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q3() {
        ch9 ch9Var;
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.d();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        mk0 mk0Var = new mk0(pageblockdetails, 0, 0);
        mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
        mk0 mk0Var3 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
        mk0Var3.i = true;
        mk0 N2 = N2();
        ArrayList arrayList = this.t3;
        int indexOf = N2 != null ? arrayList.indexOf(N2) : -1;
        if (N2 != null) {
            TL_iv.PageBlock pageBlock = N2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && N2.g == null && !N2.i && km9.y(pageBlock).isEmpty()) {
                arrayList.remove(indexOf);
                arrayList.add(indexOf, mk0Var3);
                arrayList.add(indexOf, mk0Var2);
                arrayList.add(indexOf, mk0Var);
                this.g3.O(false);
                ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.h();
                }
                post(new jh9(this, mk0Var, (byte) 19));
            }
        }
        indexOf = indexOf >= 0 ? indexOf + 1 : arrayList.size();
        arrayList.add(indexOf, mk0Var3);
        arrayList.add(indexOf, mk0Var2);
        arrayList.add(indexOf, mk0Var);
        this.g3.O(false);
        ch9Var = this.R3;
        if (ch9Var != null) {
        }
        post(new jh9(this, mk0Var, (byte) 19));
    }

    public final void q4() {
        post(new m72(this, (byte) 3));
    }

    public final km9 r2(int i) {
        if (i < 0) {
            return null;
        }
        View m = this.f3.m(i);
        if (m instanceof km9) {
            return (km9) m;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r3(mk0 mk0Var) {
        boolean z;
        int indexOf;
        int indexOf2;
        ArrayList arrayList = mk0Var.k;
        mk0 N2 = N2();
        if (N2 == null) {
            N2 = this.k4;
        }
        ArrayList arrayList2 = this.t3;
        int indexOf3 = N2 != null ? arrayList2.indexOf(N2) : -1;
        if (indexOf3 < 0 || !(N2.b instanceof TL_iv.pageBlockBlockquote)) {
            z = false;
        } else {
            long a = mf9.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) N2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.u3.put(Long.valueOf(a), richText);
            }
            N2.k.add(Long.valueOf(a));
            N2.b = new TL_iv.pageBlockParagraph();
            z = true;
        }
        boolean z2 = indexOf3 >= 0 && !N2.k.isEmpty();
        if (z2) {
            arrayList.clear();
            arrayList.addAll(N2.k);
        }
        if (indexOf3 >= 0) {
            TL_iv.PageBlock pageBlock = N2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && N2.g == null && km9.y(pageBlock).isEmpty()) {
                arrayList2.set(indexOf3, mk0Var);
                this.k4 = mk0Var;
                indexOf = arrayList2.indexOf(mk0Var);
                if (indexOf < arrayList2.size() - 1 || B3(((mk0) arrayList2.get(indexOf + 1)).b)) {
                    mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                    if (z2) {
                        mk0Var2.k.addAll(arrayList);
                    }
                    arrayList2.add(indexOf + 1, mk0Var2);
                }
                this.g3.O(!z);
                indexOf2 = arrayList2.indexOf(mk0Var) + 1;
                if (indexOf2 > 0 || indexOf2 >= arrayList2.size() || B3(((mk0) arrayList2.get(indexOf2)).b)) {
                    return;
                }
                post(new jh9(this, (mk0) arrayList2.get(indexOf2), (byte) 21));
                return;
            }
        }
        if (indexOf3 >= 0) {
            arrayList2.add(indexOf3 + 1, mk0Var);
        } else {
            arrayList2.add(mk0Var);
        }
        this.k4 = mk0Var;
        indexOf = arrayList2.indexOf(mk0Var);
        if (indexOf < arrayList2.size() - 1) {
        }
        mk0 mk0Var22 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
        if (z2) {
        }
        arrayList2.add(indexOf + 1, mk0Var22);
        this.g3.O(!z);
        indexOf2 = arrayList2.indexOf(mk0Var) + 1;
        if (indexOf2 > 0) {
        }
    }

    public final void r4(int i) {
        ArrayList arrayList = this.t3;
        int min = Math.min(arrayList.size() - 1, i + 1);
        for (int max = Math.max(0, i - 1); max <= min; max++) {
            mk0 mk0Var = (mk0) arrayList.get(max);
            if (mk0Var.c > 0) {
                View D1 = D1(mk0Var);
                if (D1 instanceof km9) {
                    ((km9) D1).F();
                }
            }
        }
    }

    public final void s2() {
        D2();
        this.s3 = null;
        this.j4 = null;
        this.k4 = null;
        this.R3 = new ch9(this.w4);
        C4();
        this.R3.j();
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.R();
        }
    }

    public final void s4(mk0 mk0Var, p07 p07Var) {
        if (mk0Var == null) {
            return;
        }
        if (!y3(mk0Var.b)) {
            t4(mk0Var);
            return;
        }
        ArrayList d3 = d3(mk0Var.b);
        ArrayList arrayList = mk0Var.h;
        int indexOf = arrayList != null ? arrayList.indexOf(p07Var) : -1;
        if (indexOf >= 0) {
            mk0Var.h.remove(indexOf);
            if (d3 != null && indexOf < d3.size()) {
                d3.remove(indexOf);
            }
        }
        if (mk0Var.h.isEmpty()) {
            t4(mk0Var);
            return;
        }
        int size = mk0Var.h.size();
        l9c l9cVar = this.g3;
        if (size != 1) {
            l9cVar.O(true);
            p4(mk0Var);
            return;
        }
        TL_iv.PageCaption pageCaption = mk0Var.b.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) d3.get(0);
        mk0Var.b = pageBlock;
        pageBlock.caption = pageCaption;
        mk0Var.g = (p07) mk0Var.h.get(0);
        mk0Var.h = null;
        l9cVar.O(true);
        p4(mk0Var);
    }

    public void setAdaptiveLinkDialogs(boolean z) {
        this.r3 = z;
    }

    public void setAllowTapAboveContent(boolean z) {
        this.Z3 = z;
    }

    public void setFileRefParentObject(r47 r47Var) {
        this.q3 = r47Var;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.V3 = new ArrayList();
        ArrayList arrayList = this.t3;
        T2(arrayList, uj9.b(charSequence), this.u3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.V3.add((mk0) arrayList.get(size));
        }
        this.g3.O(false);
    }

    public final boolean t3() {
        int i;
        di9 di9Var = this.v3;
        if (di9Var == null || !di9Var.w() || (i = di9Var.p0) != di9Var.s0 || i < 0 || i >= this.x4.size()) {
            return false;
        }
        return D4(i) instanceof jf9;
    }

    public final void t4(mk0 mk0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.g3.O(true);
        }
    }

    public final boolean u2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            mk0 mk0Var = (mk0) arrayList.get(i);
            boolean z = mk0Var.i;
            ArrayList arrayList2 = mk0Var.k;
            if (!z) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    Map.-EL.merge(hashMap, (Long) arrayList2.get(i2), 1, new yz0((byte) 1));
                }
            }
            i++;
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mk0 mk0Var2 = (mk0) arrayList.get(i3);
            ArrayList arrayList3 = mk0Var2.k;
            if (arrayList3.size() == 1 && (mk0Var2.b instanceof TL_iv.pageBlockParagraph)) {
                Long l = (Long) arrayList3.get(0);
                l.getClass();
                Integer num = (Integer) hashMap.get(l);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = mk0Var2.b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.u3.remove(l);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    mk0Var2.b = pageblockblockquote;
                    arrayList3.clear();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void u4() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return;
            }
            mk0 mk0Var = (mk0) arrayList.get(i);
            if (mk0Var.c > 0 && mk0Var.d > 0 && !B3(mk0Var.b)) {
                int i2 = mk0Var.c;
                int i3 = 1;
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    mk0 mk0Var2 = (mk0) arrayList.get(i4);
                    int i5 = mk0Var2.c;
                    if (i5 < i2) {
                        break;
                    }
                    if (i5 == i2 && !B3(mk0Var2.b)) {
                        if (mk0Var2.d <= 0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                mk0Var.d = i3;
            }
            i++;
        }
    }

    public final ArrayList v2() {
        TLRPC.Document document;
        p07 p07Var;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            mk0 mk0Var = (mk0) arrayList2.get(i);
            if ((mk0Var.b instanceof TL_iv.pageBlockDocument) && (p07Var = mk0Var.g) != null && p07Var.b() && (document2 = mk0Var.g.h) != null) {
                ((TL_iv.pageBlockDocument) mk0Var.b).document_id = document2.id;
            }
            for (p07 p07Var2 : O3(mk0Var)) {
                if (p07Var2.b() && (document = p07Var2.h) != null) {
                    long j = document.id;
                    if (j != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j))) {
                        arrayList.add(p07Var2.h);
                    }
                }
            }
            i++;
        }
    }

    public final boolean v3() {
        int i;
        di9 di9Var = this.v3;
        return di9Var != null && di9Var.w() && (i = di9Var.p0) == di9Var.s0 && u3(B4(i));
    }

    public final void v4(String str) {
        di9 di9Var = this.v3;
        T1(di9Var.p0, di9Var.r0, di9Var.s0, di9Var.u0, str.split("\n", -1));
    }

    public final ArrayList w2(int i, int i2) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                break;
            }
            for (p07 p07Var : O3((mk0) arrayList2.get(i))) {
                if (p07Var.b() && (document = p07Var.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(p07Var.h);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final p07 w4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document P2 = P2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (P2 != null) {
                p07 p07Var = new p07();
                p07Var.c = true;
                p07Var.a = (byte) 2;
                p07Var.h = P2;
                p07Var.i = P2;
                return p07Var;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document P22 = P2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (P22 != null) {
                p07 p07Var2 = new p07();
                p07Var2.d = true;
                p07Var2.a = (byte) 2;
                p07Var2.h = P22;
                return p07Var2;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document P23 = P2(pageblockvideo.video_id);
                if (P23 != null) {
                    p07 p07Var3 = new p07();
                    p07Var3.b = true;
                    p07Var3.a = (byte) 2;
                    p07Var3.h = P23;
                    p07Var3.n = pageblockvideo.spoiler;
                    for (int i = 0; i < P23.attributes.size(); i++) {
                        if (P23.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) P23.attributes.get(i);
                            p07Var3.j = tL_documentAttributeVideo.w;
                            p07Var3.k = tL_documentAttributeVideo.h;
                            return p07Var3;
                        }
                    }
                    return p07Var3;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j = pageblockphoto.photo_id;
                if (j == 0) {
                    photo = null;
                } else {
                    int i2 = 0;
                    loop1: while (true) {
                        if (i2 < this.t3.size()) {
                            for (p07 p07Var4 : O3((mk0) this.t3.get(i2))) {
                                if (p07Var4 != null && (photo = p07Var4.g) != null && photo.id == j) {
                                    break loop1;
                                }
                            }
                            i2++;
                        } else {
                            TL_iv.RichMessage richMessage = this.s3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                int i3 = 0;
                                while (i3 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i3);
                                    i3++;
                                    photo = photo2;
                                    if (photo != null && photo.id == j) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = nj9.a;
                            synchronized (nj9.class) {
                                photo = j == 0 ? null : (TLRPC.Photo) nj9.a.get(Long.valueOf(j));
                            }
                        }
                    }
                }
                if (photo != null) {
                    p07 p07Var5 = new p07();
                    p07Var5.a = (byte) 2;
                    p07Var5.g = photo;
                    p07Var5.n = pageblockphoto.spoiler;
                    TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), false, null, false);
                    if (w != null) {
                        p07Var5.j = w.w;
                        p07Var5.k = w.h;
                    }
                    return p07Var5;
                }
            }
        }
        return null;
    }

    public final ArrayList x2(int i, int i2) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                break;
            }
            for (p07 p07Var : O3((mk0) arrayList2.get(i))) {
                if (p07Var.b() && (photo = p07Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(p07Var.g);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final void x4(mk0 mk0Var) {
        TL_iv.PageBlock pageBlock;
        if (this.s3 == null || mk0Var == null || (pageBlock = mk0Var.b) == null) {
            return;
        }
        boolean y3 = y3(pageBlock);
        TL_iv.PageBlock pageBlock2 = mk0Var.b;
        if (!y3) {
            p07 w4 = w4(pageBlock2);
            if (w4 != null) {
                mk0Var.g = w4;
                return;
            }
            return;
        }
        ArrayList d3 = d3(pageBlock2);
        mk0Var.h = new ArrayList();
        if (d3 != null) {
            for (int i = 0; i < d3.size(); i++) {
                p07 w42 = w4((TL_iv.PageBlock) d3.get(i));
                ArrayList arrayList = mk0Var.h;
                if (w42 == null) {
                    w42 = new p07();
                }
                arrayList.add(w42);
            }
        }
    }

    public final ArrayList y2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            for (p07 p07Var : O3((mk0) arrayList2.get(i))) {
                if (p07Var.b() && (photo = p07Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(p07Var.g);
                }
            }
            i++;
        }
    }

    public final ArrayList y4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            mk0 mk0Var = (mk0) obj;
            boolean y3 = y3(mk0Var.b);
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (y3) {
                ArrayList d3 = d3(pageBlock);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (d3 != null) {
                    int size2 = d3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = d3.get(i2);
                        i2++;
                        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) obj2;
                        p07 w4 = w4(pageBlock2);
                        if (w4 != null) {
                            arrayList3.add(pageBlock2);
                            arrayList4.add(w4);
                        }
                    }
                    d3.clear();
                    d3.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    mk0Var.h = arrayList4;
                    arrayList2.add(mk0Var);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                p07 w42 = w4(pageBlock);
                if (w42 != null) {
                    mk0Var.g = w42;
                    arrayList2.add(mk0Var);
                }
            } else {
                arrayList2.add(mk0Var);
            }
        }
        return arrayList2;
    }

    public final void z2() {
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.h();
        }
        ArrayList arrayList = this.t3;
        SpannableStringBuilder g = uj9.g(arrayList);
        D2();
        arrayList.clear();
        HashMap hashMap = this.u3;
        hashMap.clear();
        this.s3 = null;
        T2(arrayList, uj9.b(g), hashMap);
        this.g3.O(false);
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.onContentChanged();
            ni9Var.R();
        }
    }

    public final void z4(int i, int i2, int i3) {
        if (i >= 0) {
            KeyEvent.Callback m = this.f3.m(i);
            if (m instanceof km9) {
                km9 km9Var = (km9) m;
                dg9 authorEditText = (i2 == 1 && km9Var.l()) ? km9Var.getAuthorEditText() : km9Var.getEditText();
                authorEditText.P();
                authorEditText.setSelection(Math.max(0, Math.min(i3, authorEditText.length())));
                return;
            }
            if (!(m instanceof xl9)) {
                if (m instanceof jf9) {
                    dg9 captionEditText = ((jf9) m).getCaptionEditText();
                    captionEditText.P();
                    captionEditText.setSelection(Math.max(0, Math.min(i3, captionEditText.length())));
                    return;
                }
                return;
            }
            xl9 xl9Var = (xl9) m;
            dg9 n = xl9Var.n(i2);
            if (n == null) {
                n = xl9Var.n(0);
            }
            if (n != null) {
                n.P();
                n.setSelection(Math.max(0, Math.min(i3, n.length())));
            }
        }
    }
}
