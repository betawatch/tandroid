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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ye9 extends q5c {
    public static final ArrayList A4 = new ArrayList();
    public boolean A3;
    public float B3;
    public float C3;
    public float D3;
    public float E3;
    public View F3;
    public q62 G3;
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
    public ld9 R3;
    public int S3;
    public mc9 T3;
    public final x62 U3;
    public ArrayList V3;
    public int W3;
    public int X3;
    public int Y3;
    public boolean Z3;
    public lk0 a4;
    public boolean b4;
    public final qe9 c4;
    public final vd9 d4;
    public final re9 e4;
    public final se9 f4;
    public final te9 g4;
    public final IdentityHashMap h4;
    public final IdentityHashMap i4;
    public lk0 j4;
    public lk0 k4;
    public final ue9 l4;
    public final ee9 m4;
    public final int n3;
    public final fe9 n4;
    public final wjb o3;
    public final ge9 o4;
    public final we9 p3;
    public final he9 p4;
    public k27 q3;
    public ii9 q4;
    public boolean r3;
    public cs5 r4;
    public TL_iv.RichMessage s3;
    public int s4;
    public final ArrayList t3;
    public int t4;
    public final HashMap u3;
    public final wd9 u4;
    public final me9 v3;
    public final ie9 v4;
    public final qib w3;
    public final v39 w4;
    public int x3;
    public final ArrayList x4;
    public int y3;
    public n79 y4;
    public int z3;
    public int z4;

    public ye9(Context context, int i, wjb wjbVar, we9 we9Var) {
        super(context, i, 0, false, new tf8(r1, (byte) 12), new k88((Object) r1, (byte) 26), null, wjbVar);
        this.r3 = true;
        this.t3 = new ArrayList();
        this.u3 = new HashMap();
        this.x3 = -1;
        this.y3 = -1;
        this.z3 = 0;
        byte b = 3;
        this.U3 = new x62(this, b);
        this.Z3 = true;
        this.c4 = new qe9(this);
        this.d4 = new vd9(this);
        this.e4 = new re9(this);
        this.f4 = new se9(this);
        this.g4 = new te9(this);
        this.h4 = new IdentityHashMap();
        this.i4 = new IdentityHashMap();
        this.l4 = new ue9(this);
        this.m4 = new ee9(this);
        this.n4 = new fe9(this);
        this.o4 = new ge9(this);
        this.p4 = new he9(this);
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = new wd9(this);
        this.v4 = new ie9(this);
        v39 v39Var = new v39(this, b);
        this.w4 = v39Var;
        this.x4 = new ArrayList();
        this.z4 = -1;
        ye9[] ye9VarArr = {this};
        this.n3 = i;
        this.o3 = wjbVar;
        this.p3 = we9Var;
        this.g3.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        E1(new tf8(this, (byte) 13), false);
        setReorderLongPressEnabled(false);
        z1(true);
        me9 me9Var = new me9(this, we9Var);
        this.v3 = me9Var;
        me9Var.Q(this);
        me9Var.z0 = this.f3;
        qib m = me9Var.m(context);
        this.w3 = m;
        gl.B2(m);
        me9Var.D = new oe9(this, we9Var);
        j(new si1(this, we9Var, (byte) 11));
        this.R3 = new ld9(v39Var);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockButtonRow) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    public static boolean B3(lk0 lk0Var) {
        return lk0Var != null && !lk0Var.i && !t3(lk0Var) && (lk0Var.b instanceof TL_iv.pageBlockParagraph) && lk0Var.c == 0 && lk0Var.d == 0 && !lk0Var.e && lk0Var.k.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void F2(lk0 lk0Var, ArrayList arrayList) {
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            iy6 iy6Var = lk0Var.g;
            if (iy6Var == null || !iy6Var.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock2 = lk0Var.b;
            if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                if (pageBlock2.caption == null) {
                    pageBlock2.caption = new TL_iv.PageCaption();
                    lk0Var.b.caption.text = new TL_iv.textEmpty();
                    lk0Var.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(lk0Var.b);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            iy6 iy6Var2 = lk0Var.g;
            if (iy6Var2 == null || !iy6Var2.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock3 = lk0Var.b;
            if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                if (pageBlock3.caption == null) {
                    pageBlock3.caption = new TL_iv.PageCaption();
                    lk0Var.b.caption.text = new TL_iv.textEmpty();
                    lk0Var.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(lk0Var.b);
                return;
            }
            return;
        }
        boolean x3 = x3(pageBlock);
        TL_iv.PageBlock pageBlock4 = lk0Var.b;
        if (x3) {
            ArrayList c3 = c3(pageBlock4);
            List N3 = N3(lk0Var);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i = 0; c3 != null && i < c3.size() && i < N3.size(); i++) {
                TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) c3.get(i);
                if (((iy6) N3.get(i)).b()) {
                    if ((pageBlock5 instanceof TL_iv.pageBlockPhoto ? ((TL_iv.pageBlockPhoto) pageBlock5).photo_id : pageBlock5 instanceof TL_iv.pageBlockVideo ? ((TL_iv.pageBlockVideo) pageBlock5).video_id : 0L) != 0) {
                        sb9.d(pageBlock5);
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
            if (lk0Var.b instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                pageblockslideshow.items = arrayList2;
                pageblockslideshow.caption = lk0Var.b.caption;
                pageblockcollage = pageblockslideshow;
            } else {
                TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                pageblockcollage2.items = arrayList2;
                pageblockcollage2.caption = lk0Var.b.caption;
                pageblockcollage = pageblockcollage2;
            }
            sb9.d(pageblockcollage);
            arrayList.add(pageblockcollage);
            return;
        }
        if (pageBlock4 instanceof TL_iv.pageBlockAudio) {
            iy6 iy6Var3 = lk0Var.g;
            if (iy6Var3 == null || !iy6Var3.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock6 = lk0Var.b;
            if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                if (pageBlock6.caption == null) {
                    pageBlock6.caption = new TL_iv.PageCaption();
                    lk0Var.b.caption.text = new TL_iv.textEmpty();
                    lk0Var.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(lk0Var.b);
                return;
            }
            return;
        }
        if (pageBlock4 instanceof TL_iv.pageBlockDocument) {
            iy6 iy6Var4 = lk0Var.g;
            if (iy6Var4 != null && (document = iy6Var4.h) != null) {
                ((TL_iv.pageBlockDocument) pageBlock4).document_id = document.id;
            }
            if (iy6Var4 == null || !iy6Var4.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = lk0Var.b;
            if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                sb9.d(pageBlock7);
                arrayList.add(lk0Var.b);
                return;
            }
            return;
        }
        if (pageBlock4 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock4;
            int i2 = pf9.N;
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
            arrayList.add(lk0Var.b);
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
                            ffb.c(pagetablecell, "");
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
        if (R4(pageblocktable)) {
            arrayList.add(pageblocktable);
        }
    }

    public static boolean G2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static void H2(TL_iv.PageBlock pageBlock) {
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

    public static void J2(ArrayList arrayList, ArrayList arrayList2, int i, boolean z, int i2, boolean z2, boolean z3) {
        boolean z4 = false;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i3);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z4) {
                        O1(arrayList, null, i, i2, z2, z3);
                        z4 = true;
                    }
                    K2(arrayList, pageBlock, i + 1);
                } else if (z4) {
                    arrayList.add(new lk0(pageBlock, i, z ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        O1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i, i2, z2, z3);
                    } else {
                        lk0 lk0Var = new lk0(pageBlock, i, i2);
                        lk0Var.e = z2;
                        lk0Var.f = z3;
                        arrayList.add(lk0Var);
                    }
                    z4 = true;
                }
            }
        }
        if (z4) {
            return;
        }
        O1(arrayList, null, i, i2, z2, z3);
    }

    public static TL_iv.PageBlock J3(lk0 lk0Var, iy6 iy6Var) {
        boolean x3 = x3(lk0Var.b);
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (!x3) {
            return pageBlock;
        }
        ArrayList c3 = c3(pageBlock);
        ArrayList arrayList = lk0Var.h;
        int indexOf = arrayList != null ? arrayList.indexOf(iy6Var) : -1;
        if (indexOf < 0 || c3 == null || indexOf >= c3.size()) {
            return null;
        }
        return (TL_iv.PageBlock) c3.get(indexOf);
    }

    public static void K2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i) {
        int i2 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i2 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i2);
                i2++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    O1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    J2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i, false, 0, pageListItem2.checkbox, pageListItem2.checked);
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
                O1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i, i3, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i4 = i3;
                J2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i, true, i4, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
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
    public static void K3(ye9[] ye9VarArr, ArrayList arrayList, l5c l5cVar) {
        int i;
        boolean z;
        ArrayList arrayList2;
        int i2;
        boolean z2;
        int i3;
        ye9 ye9Var = ye9VarArr[0];
        if (ye9Var != null) {
            ArrayList arrayList3 = ye9Var.t3;
            ye9Var.V1();
            ArrayList arrayList4 = ye9Var.x4;
            arrayList4.clear();
            HashMap hashMap = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = 1;
                if (i4 >= arrayList3.size()) {
                    break;
                }
                lk0 lk0Var = (lk0) arrayList3.get(i4);
                boolean z3 = lk0Var.i;
                ArrayList arrayList5 = lk0Var.k;
                if (!z3) {
                    for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                        Map.-EL.merge(hashMap, (Long) arrayList5.get(i6), 1, new qz0((byte) 1));
                    }
                    if (lk0Var.b instanceof TL_iv.pageBlockParagraph) {
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
            lk0 lk0Var2 = null;
            while (i8 < arrayList3.size()) {
                lk0 lk0Var3 = (lk0) arrayList3.get(i8);
                boolean z5 = lk0Var3.i;
                ArrayList arrayList7 = lk0Var3.k;
                if (z5) {
                    int i11 = i10 != i7 ? i : 0;
                    if (!arrayList6.isEmpty()) {
                        tb4.v(i, arrayList6);
                    }
                    if (i10 == i7 || arrayList6.size() >= i10) {
                        if (i11 == 0) {
                            if (i9 != 0) {
                                l5cVar.L();
                                i9 = 0;
                            }
                            int i12 = bc9.b;
                            c4c K = c4c.K(bc9.class);
                            K.H = lk0Var3;
                            arrayList.add(K);
                            arrayList4.add(lk0Var3);
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
                    if (t3(lk0Var3)) {
                        if (i13 == 0) {
                            boolean z6 = ((TL_iv.pageBlockDetails) lk0Var3.b).open;
                            if (!arrayList6.isEmpty() || z6) {
                                if (i9 != 0) {
                                    l5cVar.L();
                                    i9 = 0;
                                }
                            } else if (i9 == 0) {
                                l5cVar.M();
                                i9 = i;
                            }
                            he9 he9Var = ye9Var.p4;
                            int i14 = zb9.b;
                            c4c K2 = c4c.K(zb9.class);
                            K2.H = lk0Var3;
                            K2.I = he9Var;
                            arrayList.add(K2);
                            arrayList4.add(lk0Var3);
                            if (!z6) {
                                i10 = arrayList6.size() + 1;
                            }
                        }
                        arrayList6.add(lk0Var3);
                    } else if (i13 == 0) {
                        if (lk0Var2 != null) {
                            ArrayList arrayList8 = lk0Var2.k;
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
                                    if (num.intValue() >= 2 || i16 > 0 || ye9Var.u3.containsKey(l)) {
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
                        if (lk0Var2 != null) {
                            ye9Var.o3(lk0Var2, arrayList7, hashMap, arrayList);
                        }
                        if (arrayList2.isEmpty()) {
                            if (i9 == 0) {
                                l5cVar.M();
                                i9 = 1;
                            }
                        } else if (i9 != 0) {
                            l5cVar.L();
                            i9 = 0;
                        }
                        TL_iv.PageBlock pageBlock = lk0Var3.b;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            vd9 vd9Var = ye9Var.d4;
                            int i17 = dc9.b;
                            c4c K3 = c4c.K(dc9.class);
                            K3.H = lk0Var3;
                            K3.I = vd9Var;
                            arrayList.add(K3);
                        } else if (z3(pageBlock)) {
                            re9 re9Var = ye9Var.e4;
                            int i18 = uf9.b;
                            c4c K4 = c4c.K(uf9.class);
                            K4.d = (int) lk0Var3.a;
                            K4.H = lk0Var3;
                            K4.I = re9Var;
                            arrayList.add(K4);
                        } else {
                            TL_iv.PageBlock pageBlock2 = lk0Var3.b;
                            if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                se9 se9Var = ye9Var.f4;
                                int i19 = hb9.b;
                                c4c K5 = c4c.K(hb9.class);
                                K5.H = lk0Var3;
                                K5.I = se9Var;
                                arrayList.add(K5);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                te9 te9Var = ye9Var.g4;
                                int i20 = fc9.b;
                                c4c K6 = c4c.K(fc9.class);
                                K6.H = lk0Var3;
                                K6.I = te9Var;
                                arrayList.add(K6);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                ue9 ue9Var = ye9Var.l4;
                                int i21 = of9.b;
                                c4c K7 = c4c.K(of9.class);
                                K7.H = lk0Var3;
                                K7.I = ue9Var;
                                arrayList.add(K7);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                ee9 ee9Var = ye9Var.m4;
                                int i22 = qf9.b;
                                c4c K8 = c4c.K(qf9.class);
                                K8.H = lk0Var3;
                                K8.I = ee9Var;
                                arrayList.add(K8);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                ge9 ge9Var = ye9Var.o4;
                                int i23 = gi9.b;
                                c4c K9 = c4c.K(gi9.class);
                                K9.H = lk0Var3;
                                K9.I = ge9Var;
                                arrayList.add(K9);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                qe9 qe9Var = ye9Var.c4;
                                int i24 = ob9.b;
                                c4c K10 = c4c.K(ob9.class);
                                K10.H = lk0Var3;
                                K10.I = qe9Var;
                                arrayList.add(K10);
                            } else {
                                lk0Var3.p = i8 == 0;
                                lk0Var3.q = z && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                if (arrayList3.size() == 2) {
                                    i2 = 1;
                                    if (i8 == 1 && (lk0Var3.b instanceof TL_iv.pageBlockParagraph) && (((lk0) arrayList3.get(0)).b instanceof TL_iv.pageBlockHeading1)) {
                                        z2 = true;
                                        ie9 ie9Var = ye9Var.v4;
                                        int i25 = ui9.b;
                                        c4c K11 = c4c.K(ui9.class);
                                        K11.H = lk0Var3;
                                        K11.I = ie9Var;
                                        K11.s = z2;
                                        arrayList.add(K11);
                                        arrayList4.add(lk0Var3);
                                        lk0Var2 = lk0Var3;
                                    }
                                } else {
                                    i2 = 1;
                                }
                                z2 = false;
                                ie9 ie9Var2 = ye9Var.v4;
                                int i252 = ui9.b;
                                c4c K112 = c4c.K(ui9.class);
                                K112.H = lk0Var3;
                                K112.I = ie9Var2;
                                K112.s = z2;
                                arrayList.add(K112);
                                arrayList4.add(lk0Var3);
                                lk0Var2 = lk0Var3;
                            }
                        }
                        i2 = 1;
                        arrayList4.add(lk0Var3);
                        lk0Var2 = lk0Var3;
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
                l5cVar.L();
            }
            if (lk0Var2 != null) {
                ye9Var.o3(lk0Var2, A4, hashMap, arrayList);
            }
            int i27 = 0;
            while (i27 < arrayList4.size()) {
                lk0 lk0Var4 = (lk0) arrayList4.get(i27);
                lk0Var4.n = false;
                lk0Var4.o = false;
                lk0Var4.l = 0;
                lk0Var4.m = 0;
                int size2 = lk0Var4.k.size();
                if (size2 != 0) {
                    lk0 lk0Var5 = i27 > 0 ? (lk0) arrayList4.get(i27 - 1) : null;
                    int i28 = i27 + 1;
                    lk0 lk0Var6 = i28 < arrayList4.size() ? (lk0) arrayList4.get(i28) : null;
                    lk0Var4.l = size2 - m4(lk0Var4, lk0Var5);
                    int m4 = size2 - m4(lk0Var4, lk0Var6);
                    lk0Var4.m = m4;
                    lk0Var4.n = lk0Var4.l > 0 ? i26 : 0;
                    lk0Var4.o = m4 > 0 ? i26 : 0;
                }
                i27++;
            }
        }
    }

    public static List N3(lk0 lk0Var) {
        if (lk0Var == null) {
            return Collections.EMPTY_LIST;
        }
        if (x3(lk0Var.b)) {
            ArrayList arrayList = lk0Var.h;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        iy6 iy6Var = lk0Var.g;
        return iy6Var != null ? Collections.singletonList(iy6Var) : Collections.EMPTY_LIST;
    }

    public static void O1(ArrayList arrayList, TL_iv.RichText richText, int i, int i2, boolean z, boolean z2) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        lk0 lk0Var = new lk0(pageblockparagraph, i, i2);
        lk0Var.e = z;
        lk0Var.f = z2;
        arrayList.add(lk0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mc9 O3(View view) {
        if (view instanceof wi9) {
            return ((wi9) view).getEditText();
        }
        if (view instanceof tb9) {
            return ((tb9) view).getCaptionEditText();
        }
        if (view instanceof ac9) {
            return ((ac9) view).getEditText();
        }
        return null;
    }

    public static TL_iv.PageBlock P3(TL_iv.PageBlock pageBlock) {
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

    public static ii9 Q2(mc9 mc9Var) {
        for (ViewParent parent = mc9Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ii9) {
                return (ii9) parent;
            }
        }
        return null;
    }

    public static iy6 Q3(jm6 jm6Var, String str) {
        iy6 iy6Var = new iy6();
        iy6Var.b = jm6Var.b;
        iy6Var.e = str;
        iy6Var.j = jm6Var.F;
        iy6Var.k = jm6Var.G;
        String str2 = jm6Var.h;
        boolean z = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        iy6Var.l = z ? 0 : jm6Var.J;
        iy6Var.m = z ? 0 : jm6Var.K;
        iy6Var.a = (byte) 1;
        iy6Var.f = 0.0f;
        return iy6Var;
    }

    public static boolean R4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(yi9.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                if (!ffb.g(pagetablerow.cells.get(i2)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void S2(ArrayList arrayList, ArrayList arrayList2, java.util.Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    K2(arrayList, pageBlock, 1);
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                    if (pageblockdetails.title == null) {
                        pageblockdetails.title = new TL_iv.textEmpty();
                    }
                    arrayList.add(new lk0(pageblockdetails, 0, 0));
                    int size2 = arrayList.size();
                    S2(arrayList, pageblockdetails.blocks, map);
                    if (arrayList.size() == size2) {
                        arrayList.add(new lk0(new TL_iv.pageBlockParagraph(), 0, 0));
                    }
                    lk0 lk0Var = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                    lk0Var.i = true;
                    arrayList.add(lk0Var);
                } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    long a = wb9.a();
                    S2(arrayList, pageblockblockquoteblocks.blocks, map);
                    for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                        ((lk0) arrayList.get(size3)).k.add(0, Long.valueOf(a));
                    }
                    if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                        map.put(Long.valueOf(a), pageblockblockquoteblocks.caption);
                    }
                } else {
                    arrayList.add(new lk0(pageBlock, 0, 0));
                }
            }
        }
    }

    public static FrameLayout S4(ii9 ii9Var, boolean z) {
        li9 m;
        ffb model = ii9Var.getModel();
        if (model != null) {
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i2 = z ? -1 : Integer.MAX_VALUE;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : ii9Var.getSelectedCells()) {
                int a = model.a(pagetablecell2);
                int o = z ? (ffb.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z ? o < i2 || (o == i2 && a < i) : o > i2 || (o == i2 && a < i)) {
                    pagetablecell = pagetablecell2;
                    i = a;
                    i2 = o;
                }
            }
            if (pagetablecell != null && (m = ii9Var.getGrid().m(pagetablecell)) != null) {
                return m;
            }
        }
        return ii9Var;
    }

    public static ArrayList T2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        S2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static ArrayList c3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static int[] e5(ii9 ii9Var) {
        ffb ffbVar = ii9Var.G;
        for (int size = ffbVar != null ? ffbVar.g.size() : 0; size >= 0; size--) {
            mc9 n = ii9Var.n(size);
            int length = n != null ? n.length() : 0;
            if (length > 0) {
                return new int[]{size, length};
            }
        }
        return null;
    }

    public static boolean h3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || z3(pageBlock);
    }

    public static boolean h4(mc9 mc9Var, float f, float f2) {
        if (mc9Var != null && mc9Var.getVisibility() == 0) {
            mc9Var.getLocationOnScreen(new int[2]);
            float f3 = f - r1[0];
            float f4 = f2 - r1[1];
            if (f3 >= 0.0f && f4 >= 0.0f && f3 <= mc9Var.getWidth() && f4 <= mc9Var.getHeight()) {
                int offsetForPosition = mc9Var.getOffsetForPosition(f3, f4);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                mc9Var.P();
                mc9Var.setSelection(Math.max(0, Math.min(offsetForPosition, mc9Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int l4(int i, lk0 lk0Var, boolean z) {
        if (lk0Var == null) {
            return gl.L(2.0f);
        }
        return de9.y(16.0f, Math.max(0, i - (lk0Var.k.size() - (z ? lk0Var.l : lk0Var.m))), gl.L(2.0f));
    }

    public static int m4(lk0 lk0Var, lk0 lk0Var2) {
        ArrayList arrayList = lk0Var.k;
        int i = 0;
        if (lk0Var2 == null) {
            return 0;
        }
        ArrayList arrayList2 = lk0Var2.k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i < min && ((Long) arrayList.get(i)).equals(arrayList2.get(i))) {
            i++;
        }
        return i;
    }

    public static boolean r3(int i) {
        return i == 21 || i == 22 || i == 19 || i == 20;
    }

    public static int s2(int i) {
        if (i == 4) {
            return 114971;
        }
        if (i == 16384) {
            return 32772;
        }
        return i == 32768 ? 16388 : 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setEditTextsLocked(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof wi9) {
                ((wi9) childAt).setLocked(z);
            } else if (childAt instanceof ii9) {
                ((ii9) childAt).setLocked(z);
            } else if (childAt instanceof tb9) {
                ((tb9) childAt).getCaptionEditText().setLocked(z);
            } else if (childAt instanceof ac9) {
                ((ac9) childAt).setLocked(z);
            } else if (childAt instanceof ec9) {
                childAt.invalidate();
            }
        }
    }

    public static boolean t3(lk0 lk0Var) {
        return lk0Var != null && (lk0Var.b instanceof TL_iv.pageBlockDetails);
    }

    public static boolean v3(TL_iv.PageBlock pageBlock) {
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || A3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !wi9.y(pageBlock).isEmpty()) ? false : true;
    }

    public static boolean w3(TL_iv.PageBlock pageBlock) {
        return (A3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    public static boolean x3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean y3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || x3(pageBlock);
    }

    public final void A2() {
        ArrayList arrayList;
        me9 me9Var = this.v3;
        int i = me9Var.p0;
        int i2 = me9Var.r0;
        int i3 = me9Var.s0;
        if (S1(i, i2, i3, me9Var.u0, new String[]{""})) {
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
            lk0 lk0Var = (lk0) arrayList3.get(max);
            if (lk0Var.t == 0 && arrayList.indexOf(lk0Var) >= 0) {
                arrayList2.add(lk0Var);
            }
            max++;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        int indexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new lk0(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap hashMap = this.u3;
        if (!hashMap.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                hashSet.addAll(((lk0) arrayList.get(i4)).k);
            }
            hashMap.keySet().retainAll(hashSet);
        }
        t2();
        S3();
        t4();
        me9Var.e(false);
        this.g3.O(false);
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        post(new sd9(this, (lk0) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), b));
    }

    public final lk0 A4(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.x4;
        if (i < arrayList.size()) {
            return (lk0) arrayList.get(i);
        }
        return null;
    }

    public final boolean B2() {
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            me9Var.e(false);
            return true;
        }
        if (this.q4 == null) {
            return false;
        }
        I2();
        return true;
    }

    public final void B4() {
        ArrayList arrayList = this.t3;
        arrayList.clear();
        arrayList.add(new lk0(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new lk0(new TL_iv.pageBlockParagraph(), 0, 0));
        this.g3.O(false);
    }

    public final void C2() {
        me9 me9Var = this.v3;
        if (me9Var != null) {
            me9Var.e(true);
        }
        I2();
        j3();
        IdentityHashMap identityHashMap = this.h4;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((bg9) it.next()).b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.i4;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((xf9) it2.next()).a();
        }
        identityHashMap2.clear();
    }

    public final boolean C3() {
        int i;
        lk0 A42;
        me9 me9Var = this.v3;
        return me9Var != null && me9Var.w() && (i = me9Var.p0) == me9Var.s0 && i >= 0 && i < this.x4.size() && me9Var.q0 == 1 && me9Var.t0 == 1 && (A42 = A4(i)) != null && wi9.n(A42.b);
    }

    public final View C4(int i) {
        if (i < 0) {
            return null;
        }
        return this.f3.m(i);
    }

    @Override // q5c
    public final boolean D1() {
        return this.b4;
    }

    public final int D2(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (t3((lk0) arrayList.get(i3))) {
                i2++;
            } else if (((lk0) arrayList.get(i3)).i) {
                i2--;
            }
        }
        return i2;
    }

    public final boolean D3(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i2 < arrayList.size() && i <= i2) {
                boolean z = false;
                while (i <= i2) {
                    lk0 lk0Var = (lk0) arrayList.get(i);
                    if (!lk0Var.i && !t3(lk0Var)) {
                        if (!lk0Var.k.isEmpty() || wi9.n(lk0Var.b)) {
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

    public final int[] D4() {
        ArrayList arrayList = this.t3;
        me9 me9Var = this.v3;
        if (me9Var == null || !me9Var.w()) {
            lk0 M2 = M2();
            int indexOf = M2 != null ? arrayList.indexOf(M2) : -1;
            if (indexOf >= 0) {
                return new int[]{indexOf, indexOf};
            }
            return null;
        }
        int indexOf2 = arrayList.indexOf(A4(me9Var.p0));
        int indexOf3 = arrayList.indexOf(A4(me9Var.s0));
        if (indexOf2 < 0 || indexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(indexOf2, indexOf3), Math.max(indexOf2, indexOf3)};
    }

    public final mc9 E2(int i) {
        if (!t3(A4(i))) {
            return null;
        }
        View C4 = C4(i);
        if (C4 instanceof ac9) {
            return ((ac9) C4).getEditText();
        }
        return null;
    }

    public final boolean E3() {
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            int i = me9Var.p0;
            int i2 = me9Var.s0;
            if (i >= 0 && i2 >= 0 && i2 >= i) {
                boolean z = false;
                while (i <= i2) {
                    lk0 A42 = A4(i);
                    if (A42 != null) {
                        if (y3(A42.b)) {
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

    public final boolean E4() {
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            if (H3()) {
                int i = me9Var.p0;
                int i2 = me9Var.q0;
                int i3 = me9Var.t0;
                int i4 = me9Var.r0;
                int i5 = me9Var.u0;
                int i6 = i2;
                while (i6 <= i3) {
                    mc9 Q4 = Q4(i, i6);
                    if (Q4 != null) {
                        int length = Q4.length();
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
            } else if (u3()) {
                mc9 E2 = E2(me9Var.p0);
                if (E2 != null && Math.max(0, Math.min(Math.min(me9Var.r0, me9Var.u0), E2.length())) < Math.max(0, Math.min(Math.max(me9Var.r0, me9Var.u0), E2.length()))) {
                    return true;
                }
            } else if (s3()) {
                mc9 o2 = o2(me9Var.p0);
                if (o2 != null) {
                    int i9 = me9Var.r0;
                    int i10 = me9Var.u0;
                    if (Math.max(0, Math.min(Math.min(i9, i10), o2.length())) < Math.max(0, Math.min(Math.max(i9, i10), o2.length()))) {
                        return true;
                    }
                }
            } else {
                boolean C3 = C3();
                int i11 = me9Var.p0;
                if (C3) {
                    mc9 k4 = k4(i11);
                    if (k4 != null) {
                        int i12 = me9Var.r0;
                        int i13 = me9Var.u0;
                        if (Math.max(0, Math.min(Math.min(i12, i13), k4.length())) < Math.max(0, Math.min(Math.max(i12, i13), k4.length()))) {
                            return true;
                        }
                    }
                } else {
                    int i14 = me9Var.s0;
                    int i15 = me9Var.r0;
                    int i16 = me9Var.u0;
                    if (i11 >= 0 && i14 >= 0 && i14 >= i11 && i14 < this.x4.size()) {
                        int i17 = i11;
                        while (i17 <= i14) {
                            lk0 A42 = A4(i17);
                            if (A42 != null) {
                                if (A42.t == 0) {
                                    TL_iv.PageBlock pageBlock = A42.b;
                                    if (!w3(pageBlock)) {
                                        continue;
                                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                        continue;
                                    }
                                }
                                int d2 = d2(i17);
                                if (Math.max(0, Math.min(i17 == i11 ? i15 : 0, d2)) < Math.max(0, Math.min(i17 == i14 ? i16 : d2, d2))) {
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

    @Override // q5c
    public final void F1() {
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0059 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F3(int i, int i2, int i3, int i4, int i5) {
        int length;
        int g;
        int A;
        int max;
        int max2;
        if (u3()) {
            mc9 E2 = E2(i2);
            return (E2 == null || (max = Math.max(0, Math.min(Math.min(i3, i5), E2.length()))) >= (max2 = Math.max(0, Math.min(Math.max(i3, i5), E2.length()))) || (E2.c(max, max2) & i) == 0) ? false : true;
        }
        if (!C3()) {
            int i6 = i2;
            boolean z = false;
            while (i6 <= i4) {
                lk0 A42 = A4(i6);
                if (A42 != null) {
                    TL_iv.PageBlock pageBlock = A42.b;
                    if (w3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int d2 = d2(i6);
                        int i7 = i6 == i2 ? i3 : 0;
                        int i8 = i6 == i4 ? i5 : d2;
                        int max3 = Math.max(0, Math.min(i7, d2));
                        int max4 = Math.max(0, Math.min(i8, d2));
                        if (max3 >= max4) {
                            continue;
                        } else {
                            wi9 q2 = q2(i6);
                            if (q2 != null ? (q2.getStyleDelegate().c(max3, max4) & i) != 0 : yi9.i(max3, max4, i, wi9.z(A4(i6).b))) {
                                z = true;
                            }
                        }
                    }
                }
                i6++;
            }
            return z;
        }
        mc9 k4 = k4(i2);
        if (k4 == null || (g = de9.g(i3, i5, (length = k4.length()), 0)) >= (A = ls6.A(i3, i5, length, 0)) || (k4.c(g, A) & i) == 0) {
        }
    }

    public final int[] F4() {
        me9 me9Var = this.v3;
        if (me9Var == null) {
            return null;
        }
        int i = me9Var.p0;
        int i2 = me9Var.s0;
        if (i < 0 || i2 < 0) {
            return null;
        }
        lk0 A42 = A4(i);
        lk0 A43 = A4(i2);
        if (A42 == null || A43 == null) {
            return null;
        }
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(A42);
        int indexOf2 = arrayList.indexOf(A43);
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            indexOf = indexOf2;
            indexOf2 = indexOf;
        }
        return new int[]{indexOf, indexOf2};
    }

    @Override // q5c
    public final void G1() {
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.G();
        }
        z4();
    }

    public final boolean G3(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        boolean z = false;
        while (i7 <= i5) {
            mc9 Q4 = Q4(i2, i7);
            if (Q4 != null) {
                int length = Q4.length();
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
                    if ((Q4.c(max, max2) & i) == 0) {
                        return false;
                    }
                    z = true;
                }
            }
            i7++;
        }
        return z;
    }

    public final void G4(mc9 mc9Var) {
        mc9Var.c2 = this.r3;
        mc9Var.D(new q62(this, (byte) 4));
    }

    @Override // q5c
    public final void H1(s49 s49Var) {
        we9 we9Var = this.p3;
        if (we9Var == null || s49Var == null) {
            return;
        }
        View view = s49Var.a;
        view.getLocationOnScreen(new int[2]);
        view.getWidth();
        this.b4 = we9Var.a(view.getHeight() + r1[1]);
    }

    public final boolean H3() {
        me9 me9Var = this.v3;
        if (me9Var == null || !me9Var.w()) {
            return false;
        }
        int i = me9Var.p0;
        int i2 = me9Var.s0;
        lk0 A42 = A4(i);
        return i == i2 && A42 != null && (A42.b instanceof TL_iv.pageBlockTable);
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
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H4(ii9 ii9Var) {
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
        cs5 cs5Var;
        int i8;
        int L;
        int i9;
        int[] iArr;
        FrameLayout S4;
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
        final ii9 ii9Var2 = ii9Var;
        final ffb model = ii9Var2.getModel();
        LinkedHashSet linkedHashSet = ii9Var2.I;
        if (model != null) {
            TL_iv.pageBlockTable pageblocktable = model.a;
            Set<TL_iv.pageTableCell> selectedCells = ii9Var2.getSelectedCells();
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
                    int o = ffb.o(pagetablecell);
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
                        if (ffb.n(next) <= 1) {
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
                                                i6 = (z4 || !z2 || model.c >= na7.q1(this.n3).k4.d0.f()) ? 0 : i3;
                                                i7 = (z4 || !z) ? 0 : i3;
                                                cs5Var = this.r4;
                                                i8 = i;
                                                if (cs5Var != null) {
                                                    this.r4 = null;
                                                    cs5Var.u();
                                                }
                                                L = gl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                                                FrameLayout S42 = S4(ii9Var2, false);
                                                i9 = i5;
                                                iArr = new int[2];
                                                S42.getLocationOnScreen(iArr);
                                                if ((iArr[i3] - L) - gl.L(8.0f) >= gl.L(8.0f) + gl.m) {
                                                    S4 = S42;
                                                    r1 = i3;
                                                } else {
                                                    boolean z7 = i3;
                                                    S4 = S4(ii9Var2, z7);
                                                    r1 = z7;
                                                }
                                                final cs5 J = this.p3.J(S4);
                                                J.s = (short) 0;
                                                J.t = false;
                                                J.c0 = r1;
                                                LinearLayout linearLayout = new LinearLayout(getContext());
                                                linearLayout.setMinimumWidth(gl.L(208.0f));
                                                linearLayout.setOrientation(r1);
                                                TextView textView = new TextView(getContext());
                                                i10 = i2;
                                                i11 = i4;
                                                tb4.u(12.0f, 2131754054, 1, textView, null);
                                                textView.setGravity(17);
                                                int i33 = bkb.x6;
                                                wjb wjbVar = this.o3;
                                                zkb.X(textView, i33, wjbVar);
                                                linearLayout.addView(textView, nme.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                LinearLayout linearLayout2 = new LinearLayout(getContext());
                                                boolean z8 = z;
                                                linearLayout2.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                                                linearLayout2.setOrientation(0);
                                                linearLayout.addView(linearLayout2, nme.r(-2, -2, 17));
                                                dd9 dd9Var = new dd9(R.drawable.iv_align_horiz_left, wjbVar, getContext());
                                                dd9Var.e = (byte) 4;
                                                dd9Var.updateColors();
                                                dd9Var.b();
                                                int i34 = bkb.F8;
                                                dd9Var.c(i34);
                                                linearLayout2.addView(dd9Var, nme.o(32, 32));
                                                dd9 dd9Var2 = new dd9(R.drawable.iv_align_horiz_middle, wjbVar, getContext());
                                                dd9Var2.e = (byte) 4;
                                                dd9Var2.updateColors();
                                                dd9Var2.b();
                                                dd9Var2.c(i34);
                                                linearLayout2.addView(dd9Var2, nme.o(32, 32));
                                                dd9 dd9Var3 = new dd9(R.drawable.iv_align_horiz_right, wjbVar, getContext());
                                                dd9Var3.e = (byte) 4;
                                                dd9Var3.updateColors();
                                                dd9Var3.b();
                                                dd9Var3.c(i34);
                                                final dd9[] dd9VarArr = {dd9Var, dd9Var2, dd9Var3};
                                                boolean z9 = z2;
                                                linearLayout2.addView(dd9Var3, nme.o(32, 32));
                                                z5 = z3;
                                                linearLayout2.addView(new Space(getContext()), nme.o(8, 0));
                                                dd9 dd9Var4 = new dd9(R.drawable.iv_align_vert_top, wjbVar, getContext());
                                                dd9Var4.e = (byte) 4;
                                                dd9Var4.updateColors();
                                                dd9Var4.b();
                                                dd9Var4.c(i34);
                                                linearLayout2.addView(dd9Var4, nme.o(32, 32));
                                                dd9 dd9Var5 = new dd9(R.drawable.iv_align_vert_middle, wjbVar, getContext());
                                                dd9Var5.e = (byte) 4;
                                                dd9Var5.updateColors();
                                                dd9Var5.b();
                                                dd9Var5.c(i34);
                                                linearLayout2.addView(dd9Var5, nme.o(32, 32));
                                                dd9 dd9Var6 = new dd9(R.drawable.iv_align_vert_bottom, wjbVar, getContext());
                                                dd9Var6.e = (byte) 4;
                                                dd9Var6.updateColors();
                                                dd9Var6.b();
                                                dd9Var6.c(i34);
                                                final dd9[] dd9VarArr2 = {dd9Var4, dd9Var5, dd9Var6};
                                                linearLayout2.addView(dd9Var6, nme.o(32, 32));
                                                J.p(linearLayout);
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
                                                    dd9VarArr[i13].setSelected(i13 == i35);
                                                    i13++;
                                                }
                                                i15 = 0;
                                                while (i15 < 3) {
                                                    dd9VarArr2[i15].setSelected(i15 == i12);
                                                    i15++;
                                                }
                                                for (i16 = 0; i16 < 3; i16++) {
                                                    final byte b2 = 0;
                                                    dd9VarArr[i16].setOnClickListener(new View.OnClickListener() { // from class: pd9
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            byte b3 = b2;
                                                            dd9[] dd9VarArr3 = dd9VarArr;
                                                            int i37 = i16;
                                                            ii9 ii9Var3 = ii9Var2;
                                                            switch (b3) {
                                                                case 0:
                                                                    ki9 ki9Var = ii9Var3.w;
                                                                    Iterator it9 = ii9Var3.I.iterator();
                                                                    while (it9.hasNext()) {
                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                        ffb.k(pagetablecell4, i37);
                                                                        li9 m = ki9Var.m(pagetablecell4);
                                                                        if (m != null && m.b != null) {
                                                                            m.a();
                                                                            m.invalidate();
                                                                        }
                                                                    }
                                                                    ki9Var.invalidate();
                                                                    ge9 ge9Var = ii9Var3.F;
                                                                    if (ge9Var != null && ii9Var3.a != null) {
                                                                        ge9Var.a();
                                                                    }
                                                                    int i38 = 0;
                                                                    while (i38 < 3) {
                                                                        dd9VarArr3[i38].setSelected(i38 == i37);
                                                                        i38++;
                                                                    }
                                                                    break;
                                                                default:
                                                                    ki9 ki9Var2 = ii9Var3.w;
                                                                    Iterator it10 = ii9Var3.I.iterator();
                                                                    while (it10.hasNext()) {
                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                        ffb.m(pagetablecell5, i37);
                                                                        li9 m2 = ki9Var2.m(pagetablecell5);
                                                                        if (m2 != null && m2.b != null) {
                                                                            m2.a();
                                                                            m2.invalidate();
                                                                        }
                                                                    }
                                                                    ki9Var2.invalidate();
                                                                    ge9 ge9Var2 = ii9Var3.F;
                                                                    if (ge9Var2 != null && ii9Var3.a != null) {
                                                                        ge9Var2.a();
                                                                    }
                                                                    int i39 = 0;
                                                                    while (i39 < 3) {
                                                                        dd9VarArr3[i39].setSelected(i39 == i37);
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
                                                    dd9VarArr2[i17].setOnClickListener(new View.OnClickListener() { // from class: pd9
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            byte b32 = b3;
                                                            dd9[] dd9VarArr3 = dd9VarArr2;
                                                            int i37 = i17;
                                                            ii9 ii9Var3 = ii9Var2;
                                                            switch (b32) {
                                                                case 0:
                                                                    ki9 ki9Var = ii9Var3.w;
                                                                    Iterator it9 = ii9Var3.I.iterator();
                                                                    while (it9.hasNext()) {
                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                        ffb.k(pagetablecell4, i37);
                                                                        li9 m = ki9Var.m(pagetablecell4);
                                                                        if (m != null && m.b != null) {
                                                                            m.a();
                                                                            m.invalidate();
                                                                        }
                                                                    }
                                                                    ki9Var.invalidate();
                                                                    ge9 ge9Var = ii9Var3.F;
                                                                    if (ge9Var != null && ii9Var3.a != null) {
                                                                        ge9Var.a();
                                                                    }
                                                                    int i38 = 0;
                                                                    while (i38 < 3) {
                                                                        dd9VarArr3[i38].setSelected(i38 == i37);
                                                                        i38++;
                                                                    }
                                                                    break;
                                                                default:
                                                                    ki9 ki9Var2 = ii9Var3.w;
                                                                    Iterator it10 = ii9Var3.I.iterator();
                                                                    while (it10.hasNext()) {
                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                        ffb.m(pagetablecell5, i37);
                                                                        li9 m2 = ki9Var2.m(pagetablecell5);
                                                                        if (m2 != null && m2.b != null) {
                                                                            m2.a();
                                                                            m2.invalidate();
                                                                        }
                                                                    }
                                                                    ki9Var2.invalidate();
                                                                    ge9 ge9Var2 = ii9Var3.F;
                                                                    if (ge9Var2 != null && ii9Var3.a != null) {
                                                                        ge9Var2.a();
                                                                    }
                                                                    int i39 = 0;
                                                                    while (i39 < 3) {
                                                                        dd9VarArr3[i39].setSelected(i39 == i37);
                                                                        i39++;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    i17++;
                                                }
                                                J.n(true);
                                                J.V = kk7.l3;
                                                if (!linkedHashSet.isEmpty()) {
                                                    Iterator it9 = linkedHashSet.iterator();
                                                    while (it9.hasNext()) {
                                                        if (!((TL_iv.pageTableCell) it9.next()).header) {
                                                        }
                                                    }
                                                    z6 = true;
                                                    if (!z6) {
                                                        M0 = k96.M0(2131753992, null);
                                                    } else if (z5 || !(size <= 1 || z9 || z8)) {
                                                        M0 = k96.M0(2131754020, null);
                                                    } else {
                                                        if (z9) {
                                                            i18 = 2131754019;
                                                            str = null;
                                                        } else {
                                                            str = null;
                                                            i18 = z8 ? 2131754018 : 2131754021;
                                                        }
                                                        M0 = k96.M0(i18, str);
                                                    }
                                                    J.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new vj6((Object) this, (Object) ii9Var2, z6, (byte) 18), false);
                                                    if (i8 == 0) {
                                                        str2 = null;
                                                        final byte b4 = 2;
                                                        J.b(R.drawable.iv_table_merge, k96.M0(2131753997, null), new Runnable(this) { // from class: qd9
                                                            public final /* synthetic */ ye9 b;

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
                                                                ye9 ye9Var;
                                                                boolean z10;
                                                                int b5;
                                                                ArrayList arrayList;
                                                                byte b6 = b4;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ye9 ye9Var2 = this.b;
                                                                switch (b6) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = ii9Var3.I;
                                                                        if (ii9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            ye9Var = ye9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b7 = ii9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b7));
                                                                                i37 = Math.min(i37, b7);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ffb ffbVar = ii9Var3.G;
                                                                            ffbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                ye9Var = ye9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ffbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ffbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ffbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ffbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ffbVar.a.rows.clear();
                                                                                    ffbVar.i();
                                                                                    ye9Var = ye9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ffbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b8 = ffbVar.b(pagetablecell4);
                                                                                        int a2 = ffbVar.a(pagetablecell4);
                                                                                        int o2 = ffb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        ye9 ye9Var3 = ye9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b8; i44 < b8 + o2 && i44 < ffbVar.b; i44++) {
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
                                                                                        ye9Var2 = ye9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    ye9Var = ye9Var2;
                                                                                    ffbVar.j(identityHashMap, i38);
                                                                                    ffbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z10) {
                                                                                ii9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        ye9Var.I2();
                                                                        break;
                                                                    case 1:
                                                                        lk0 row = ii9Var3.getRow();
                                                                        ye9Var2.I2();
                                                                        if (row != null) {
                                                                            ld9 ld9Var = ye9Var2.R3;
                                                                            if (ld9Var != null) {
                                                                                ld9Var.d();
                                                                            }
                                                                            ye9Var2.s4(row);
                                                                            ld9 ld9Var2 = ye9Var2.R3;
                                                                            if (ld9Var2 != null) {
                                                                                ld9Var2.h();
                                                                            }
                                                                            we9 we9Var = ye9Var2.p3;
                                                                            if (we9Var != null) {
                                                                                we9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = ii9Var3.I;
                                                                        if (ii9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, ii9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, ii9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ffb ffbVar2 = ii9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ffbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ffbVar2.a(pagetablecell6);
                                                                                        int o3 = ffb.o(pagetablecell6);
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
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ffbVar2.b && i53 < ffbVar2.c) {
                                                                                                    hashSet9.add(ffbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new bz0(ffbVar2, (byte) 8));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ffb.g((TL_iv.pageTableCell) obj2);
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
                                                                                            TL_iv.pageTableCell pagetablecell7 = ffbVar2.d[i47][i48];
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
                                                                                            ffb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b5 = ffbVar2.b(pagetablecell8)) >= 0 && b5 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b5).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ffbVar2.i();
                                                                                            ii9Var3.x();
                                                                                            ii9Var3.w.invalidate();
                                                                                            ii9Var3.s(i45, i46);
                                                                                            ii9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ffb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = ii9Var3.G.b(pagetablecell9);
                                                                            int a4 = ii9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (ii9Var3.G.p(pagetablecell9)) {
                                                                                ii9Var3.x();
                                                                                ii9Var3.w.invalidate();
                                                                                ii9Var3.s(b10, a4);
                                                                                ii9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 4:
                                                                        ii9Var3.h(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 5:
                                                                        ii9Var3.h(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 6:
                                                                        ii9Var3.j(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 7:
                                                                        ii9Var3.j(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = ii9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ffb ffbVar3 = ii9Var3.G;
                                                                            ffbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ffbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ffbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ffbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ffbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ffbVar3.a.rows.clear();
                                                                                    ffbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ffbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ffbVar3.b(pagetablecell10);
                                                                                        int a6 = ffbVar3.a(pagetablecell10);
                                                                                        int o4 = ffb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ffbVar3.c; i67++) {
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
                                                                                    ffbVar3.j(identityHashMap2, ffbVar3.b);
                                                                                    ffbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z11) {
                                                                                ii9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (i10 != 0) {
                                                        final byte b5 = 3;
                                                        J.b(R.drawable.iv_table_unmerge, k96.M0(2131753989, str2), new Runnable(this) { // from class: qd9
                                                            public final /* synthetic */ ye9 b;

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
                                                                ye9 ye9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b6 = b5;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ye9 ye9Var2 = this.b;
                                                                switch (b6) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = ii9Var3.I;
                                                                        if (ii9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            ye9Var = ye9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b7 = ii9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b7));
                                                                                i37 = Math.min(i37, b7);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ffb ffbVar = ii9Var3.G;
                                                                            ffbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                ye9Var = ye9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ffbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ffbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ffbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ffbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ffbVar.a.rows.clear();
                                                                                    ffbVar.i();
                                                                                    ye9Var = ye9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ffbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b8 = ffbVar.b(pagetablecell4);
                                                                                        int a2 = ffbVar.a(pagetablecell4);
                                                                                        int o2 = ffb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        ye9 ye9Var3 = ye9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b8; i44 < b8 + o2 && i44 < ffbVar.b; i44++) {
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
                                                                                        ye9Var2 = ye9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    ye9Var = ye9Var2;
                                                                                    ffbVar.j(identityHashMap, i38);
                                                                                    ffbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z10) {
                                                                                ii9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        ye9Var.I2();
                                                                        break;
                                                                    case 1:
                                                                        lk0 row = ii9Var3.getRow();
                                                                        ye9Var2.I2();
                                                                        if (row != null) {
                                                                            ld9 ld9Var = ye9Var2.R3;
                                                                            if (ld9Var != null) {
                                                                                ld9Var.d();
                                                                            }
                                                                            ye9Var2.s4(row);
                                                                            ld9 ld9Var2 = ye9Var2.R3;
                                                                            if (ld9Var2 != null) {
                                                                                ld9Var2.h();
                                                                            }
                                                                            we9 we9Var = ye9Var2.p3;
                                                                            if (we9Var != null) {
                                                                                we9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = ii9Var3.I;
                                                                        if (ii9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, ii9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, ii9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ffb ffbVar2 = ii9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ffbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ffbVar2.a(pagetablecell6);
                                                                                        int o3 = ffb.o(pagetablecell6);
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
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ffbVar2.b && i53 < ffbVar2.c) {
                                                                                                    hashSet9.add(ffbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new bz0(ffbVar2, (byte) 8));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ffb.g((TL_iv.pageTableCell) obj2);
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
                                                                                            TL_iv.pageTableCell pagetablecell7 = ffbVar2.d[i47][i48];
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
                                                                                            ffb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ffbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ffbVar2.i();
                                                                                            ii9Var3.x();
                                                                                            ii9Var3.w.invalidate();
                                                                                            ii9Var3.s(i45, i46);
                                                                                            ii9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ffb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = ii9Var3.G.b(pagetablecell9);
                                                                            int a4 = ii9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (ii9Var3.G.p(pagetablecell9)) {
                                                                                ii9Var3.x();
                                                                                ii9Var3.w.invalidate();
                                                                                ii9Var3.s(b10, a4);
                                                                                ii9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 4:
                                                                        ii9Var3.h(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 5:
                                                                        ii9Var3.h(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 6:
                                                                        ii9Var3.j(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 7:
                                                                        ii9Var3.j(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = ii9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ffb ffbVar3 = ii9Var3.G;
                                                                            ffbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ffbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ffbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ffbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ffbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ffbVar3.a.rows.clear();
                                                                                    ffbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ffbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ffbVar3.b(pagetablecell10);
                                                                                        int a6 = ffbVar3.a(pagetablecell10);
                                                                                        int o4 = ffb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ffbVar3.c; i67++) {
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
                                                                                    ffbVar3.j(identityHashMap2, ffbVar3.b);
                                                                                    ffbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z11) {
                                                                                ii9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                    }
                                                    if (i6 != 0) {
                                                        final byte b6 = 4;
                                                        J.b(R.drawable.iv_table_insert_left, k96.M0(2131754007, str2), new Runnable(this) { // from class: qd9
                                                            public final /* synthetic */ ye9 b;

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
                                                                ye9 ye9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b6;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ye9 ye9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = ii9Var3.I;
                                                                        if (ii9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            ye9Var = ye9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b7 = ii9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b7));
                                                                                i37 = Math.min(i37, b7);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ffb ffbVar = ii9Var3.G;
                                                                            ffbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                ye9Var = ye9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ffbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ffbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ffbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ffbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ffbVar.a.rows.clear();
                                                                                    ffbVar.i();
                                                                                    ye9Var = ye9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ffbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b8 = ffbVar.b(pagetablecell4);
                                                                                        int a2 = ffbVar.a(pagetablecell4);
                                                                                        int o2 = ffb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        ye9 ye9Var3 = ye9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b8; i44 < b8 + o2 && i44 < ffbVar.b; i44++) {
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
                                                                                        ye9Var2 = ye9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    ye9Var = ye9Var2;
                                                                                    ffbVar.j(identityHashMap, i38);
                                                                                    ffbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z10) {
                                                                                ii9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        ye9Var.I2();
                                                                        break;
                                                                    case 1:
                                                                        lk0 row = ii9Var3.getRow();
                                                                        ye9Var2.I2();
                                                                        if (row != null) {
                                                                            ld9 ld9Var = ye9Var2.R3;
                                                                            if (ld9Var != null) {
                                                                                ld9Var.d();
                                                                            }
                                                                            ye9Var2.s4(row);
                                                                            ld9 ld9Var2 = ye9Var2.R3;
                                                                            if (ld9Var2 != null) {
                                                                                ld9Var2.h();
                                                                            }
                                                                            we9 we9Var = ye9Var2.p3;
                                                                            if (we9Var != null) {
                                                                                we9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = ii9Var3.I;
                                                                        if (ii9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, ii9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, ii9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ffb ffbVar2 = ii9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ffbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ffbVar2.a(pagetablecell6);
                                                                                        int o3 = ffb.o(pagetablecell6);
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
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ffbVar2.b && i53 < ffbVar2.c) {
                                                                                                    hashSet9.add(ffbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new bz0(ffbVar2, (byte) 8));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ffb.g((TL_iv.pageTableCell) obj2);
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
                                                                                            TL_iv.pageTableCell pagetablecell7 = ffbVar2.d[i47][i48];
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
                                                                                            ffb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ffbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ffbVar2.i();
                                                                                            ii9Var3.x();
                                                                                            ii9Var3.w.invalidate();
                                                                                            ii9Var3.s(i45, i46);
                                                                                            ii9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ffb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = ii9Var3.G.b(pagetablecell9);
                                                                            int a4 = ii9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (ii9Var3.G.p(pagetablecell9)) {
                                                                                ii9Var3.x();
                                                                                ii9Var3.w.invalidate();
                                                                                ii9Var3.s(b10, a4);
                                                                                ii9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 4:
                                                                        ii9Var3.h(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 5:
                                                                        ii9Var3.h(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 6:
                                                                        ii9Var3.j(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 7:
                                                                        ii9Var3.j(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = ii9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ffb ffbVar3 = ii9Var3.G;
                                                                            ffbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ffbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ffbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ffbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ffbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ffbVar3.a.rows.clear();
                                                                                    ffbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ffbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ffbVar3.b(pagetablecell10);
                                                                                        int a6 = ffbVar3.a(pagetablecell10);
                                                                                        int o4 = ffb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ffbVar3.c; i67++) {
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
                                                                                    ffbVar3.j(identityHashMap2, ffbVar3.b);
                                                                                    ffbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z11) {
                                                                                ii9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                        final byte b7 = 5;
                                                        J.b(R.drawable.iv_table_insert_right, k96.M0(2131754006, str2), new Runnable(this) { // from class: qd9
                                                            public final /* synthetic */ ye9 b;

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
                                                                ye9 ye9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b7;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ye9 ye9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = ii9Var3.I;
                                                                        if (ii9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            ye9Var = ye9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = ii9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ffb ffbVar = ii9Var3.G;
                                                                            ffbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                ye9Var = ye9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ffbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ffbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ffbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ffbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ffbVar.a.rows.clear();
                                                                                    ffbVar.i();
                                                                                    ye9Var = ye9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ffbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b8 = ffbVar.b(pagetablecell4);
                                                                                        int a2 = ffbVar.a(pagetablecell4);
                                                                                        int o2 = ffb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        ye9 ye9Var3 = ye9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b8; i44 < b8 + o2 && i44 < ffbVar.b; i44++) {
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
                                                                                        ye9Var2 = ye9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    ye9Var = ye9Var2;
                                                                                    ffbVar.j(identityHashMap, i38);
                                                                                    ffbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z10) {
                                                                                ii9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        ye9Var.I2();
                                                                        break;
                                                                    case 1:
                                                                        lk0 row = ii9Var3.getRow();
                                                                        ye9Var2.I2();
                                                                        if (row != null) {
                                                                            ld9 ld9Var = ye9Var2.R3;
                                                                            if (ld9Var != null) {
                                                                                ld9Var.d();
                                                                            }
                                                                            ye9Var2.s4(row);
                                                                            ld9 ld9Var2 = ye9Var2.R3;
                                                                            if (ld9Var2 != null) {
                                                                                ld9Var2.h();
                                                                            }
                                                                            we9 we9Var = ye9Var2.p3;
                                                                            if (we9Var != null) {
                                                                                we9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = ii9Var3.I;
                                                                        if (ii9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, ii9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, ii9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ffb ffbVar2 = ii9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ffbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ffbVar2.a(pagetablecell6);
                                                                                        int o3 = ffb.o(pagetablecell6);
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
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ffbVar2.b && i53 < ffbVar2.c) {
                                                                                                    hashSet9.add(ffbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new bz0(ffbVar2, (byte) 8));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ffb.g((TL_iv.pageTableCell) obj2);
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
                                                                                            TL_iv.pageTableCell pagetablecell7 = ffbVar2.d[i47][i48];
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
                                                                                            ffb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ffbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ffbVar2.i();
                                                                                            ii9Var3.x();
                                                                                            ii9Var3.w.invalidate();
                                                                                            ii9Var3.s(i45, i46);
                                                                                            ii9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ffb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = ii9Var3.G.b(pagetablecell9);
                                                                            int a4 = ii9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (ii9Var3.G.p(pagetablecell9)) {
                                                                                ii9Var3.x();
                                                                                ii9Var3.w.invalidate();
                                                                                ii9Var3.s(b10, a4);
                                                                                ii9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 4:
                                                                        ii9Var3.h(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 5:
                                                                        ii9Var3.h(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 6:
                                                                        ii9Var3.j(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 7:
                                                                        ii9Var3.j(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = ii9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ffb ffbVar3 = ii9Var3.G;
                                                                            ffbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ffbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ffbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ffbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ffbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ffbVar3.a.rows.clear();
                                                                                    ffbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ffbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ffbVar3.b(pagetablecell10);
                                                                                        int a6 = ffbVar3.a(pagetablecell10);
                                                                                        int o4 = ffb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ffbVar3.c; i67++) {
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
                                                                                    ffbVar3.j(identityHashMap2, ffbVar3.b);
                                                                                    ffbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z11) {
                                                                                ii9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                    }
                                                    if (i7 != 0) {
                                                        final byte b8 = 6;
                                                        J.b(R.drawable.iv_table_insert_top, k96.M0(2131754009, str2), new Runnable(this) { // from class: qd9
                                                            public final /* synthetic */ ye9 b;

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
                                                                ye9 ye9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b8;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ye9 ye9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = ii9Var3.I;
                                                                        if (ii9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            ye9Var = ye9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = ii9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ffb ffbVar = ii9Var3.G;
                                                                            ffbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                ye9Var = ye9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ffbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ffbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ffbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ffbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ffbVar.a.rows.clear();
                                                                                    ffbVar.i();
                                                                                    ye9Var = ye9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ffbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ffbVar.b(pagetablecell4);
                                                                                        int a2 = ffbVar.a(pagetablecell4);
                                                                                        int o2 = ffb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        ye9 ye9Var3 = ye9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ffbVar.b; i44++) {
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
                                                                                        ye9Var2 = ye9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    ye9Var = ye9Var2;
                                                                                    ffbVar.j(identityHashMap, i38);
                                                                                    ffbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z10) {
                                                                                ii9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        ye9Var.I2();
                                                                        break;
                                                                    case 1:
                                                                        lk0 row = ii9Var3.getRow();
                                                                        ye9Var2.I2();
                                                                        if (row != null) {
                                                                            ld9 ld9Var = ye9Var2.R3;
                                                                            if (ld9Var != null) {
                                                                                ld9Var.d();
                                                                            }
                                                                            ye9Var2.s4(row);
                                                                            ld9 ld9Var2 = ye9Var2.R3;
                                                                            if (ld9Var2 != null) {
                                                                                ld9Var2.h();
                                                                            }
                                                                            we9 we9Var = ye9Var2.p3;
                                                                            if (we9Var != null) {
                                                                                we9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = ii9Var3.I;
                                                                        if (ii9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, ii9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, ii9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ffb ffbVar2 = ii9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b9 = ffbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ffbVar2.a(pagetablecell6);
                                                                                        int o3 = ffb.o(pagetablecell6);
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
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ffbVar2.b && i53 < ffbVar2.c) {
                                                                                                    hashSet9.add(ffbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new bz0(ffbVar2, (byte) 8));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ffb.g((TL_iv.pageTableCell) obj2);
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
                                                                                            TL_iv.pageTableCell pagetablecell7 = ffbVar2.d[i47][i48];
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
                                                                                            ffb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ffbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ffbVar2.i();
                                                                                            ii9Var3.x();
                                                                                            ii9Var3.w.invalidate();
                                                                                            ii9Var3.s(i45, i46);
                                                                                            ii9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ffb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = ii9Var3.G.b(pagetablecell9);
                                                                            int a4 = ii9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (ii9Var3.G.p(pagetablecell9)) {
                                                                                ii9Var3.x();
                                                                                ii9Var3.w.invalidate();
                                                                                ii9Var3.s(b10, a4);
                                                                                ii9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 4:
                                                                        ii9Var3.h(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 5:
                                                                        ii9Var3.h(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 6:
                                                                        ii9Var3.j(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 7:
                                                                        ii9Var3.j(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = ii9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ffb ffbVar3 = ii9Var3.G;
                                                                            ffbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ffbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ffbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ffbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ffbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ffbVar3.a.rows.clear();
                                                                                    ffbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ffbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ffbVar3.b(pagetablecell10);
                                                                                        int a6 = ffbVar3.a(pagetablecell10);
                                                                                        int o4 = ffb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ffbVar3.c; i67++) {
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
                                                                                    ffbVar3.j(identityHashMap2, ffbVar3.b);
                                                                                    ffbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z11) {
                                                                                ii9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                        final byte b9 = 7;
                                                        J.b(R.drawable.iv_table_insert_bottom, k96.M0(2131754008, str2), new Runnable(this) { // from class: qd9
                                                            public final /* synthetic */ ye9 b;

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
                                                                ye9 ye9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b9;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ye9 ye9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = ii9Var3.I;
                                                                        if (ii9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            ye9Var = ye9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = ii9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ffb ffbVar = ii9Var3.G;
                                                                            ffbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                ye9Var = ye9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ffbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ffbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ffbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ffbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ffbVar.a.rows.clear();
                                                                                    ffbVar.i();
                                                                                    ye9Var = ye9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ffbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ffbVar.b(pagetablecell4);
                                                                                        int a2 = ffbVar.a(pagetablecell4);
                                                                                        int o2 = ffb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        ye9 ye9Var3 = ye9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ffbVar.b; i44++) {
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
                                                                                        ye9Var2 = ye9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    ye9Var = ye9Var2;
                                                                                    ffbVar.j(identityHashMap, i38);
                                                                                    ffbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z10) {
                                                                                ii9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        ye9Var.I2();
                                                                        break;
                                                                    case 1:
                                                                        lk0 row = ii9Var3.getRow();
                                                                        ye9Var2.I2();
                                                                        if (row != null) {
                                                                            ld9 ld9Var = ye9Var2.R3;
                                                                            if (ld9Var != null) {
                                                                                ld9Var.d();
                                                                            }
                                                                            ye9Var2.s4(row);
                                                                            ld9 ld9Var2 = ye9Var2.R3;
                                                                            if (ld9Var2 != null) {
                                                                                ld9Var2.h();
                                                                            }
                                                                            we9 we9Var = ye9Var2.p3;
                                                                            if (we9Var != null) {
                                                                                we9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = ii9Var3.I;
                                                                        if (ii9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, ii9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, ii9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ffb ffbVar2 = ii9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b92 = ffbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ffbVar2.a(pagetablecell6);
                                                                                        int o3 = ffb.o(pagetablecell6);
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
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ffbVar2.b && i53 < ffbVar2.c) {
                                                                                                    hashSet9.add(ffbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new bz0(ffbVar2, (byte) 8));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ffb.g((TL_iv.pageTableCell) obj2);
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
                                                                                            TL_iv.pageTableCell pagetablecell7 = ffbVar2.d[i47][i48];
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
                                                                                            ffb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ffbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ffbVar2.i();
                                                                                            ii9Var3.x();
                                                                                            ii9Var3.w.invalidate();
                                                                                            ii9Var3.s(i45, i46);
                                                                                            ii9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ffb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b10 = ii9Var3.G.b(pagetablecell9);
                                                                            int a4 = ii9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (ii9Var3.G.p(pagetablecell9)) {
                                                                                ii9Var3.x();
                                                                                ii9Var3.w.invalidate();
                                                                                ii9Var3.s(b10, a4);
                                                                                ii9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 4:
                                                                        ii9Var3.h(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 5:
                                                                        ii9Var3.h(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 6:
                                                                        ii9Var3.j(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 7:
                                                                        ii9Var3.j(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = ii9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ffb ffbVar3 = ii9Var3.G;
                                                                            ffbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ffbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ffbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ffbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ffbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ffbVar3.a.rows.clear();
                                                                                    ffbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ffbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ffbVar3.b(pagetablecell10);
                                                                                        int a6 = ffbVar3.a(pagetablecell10);
                                                                                        int o4 = ffb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ffbVar3.c; i67++) {
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
                                                                                    ffbVar3.j(identityHashMap2, ffbVar3.b);
                                                                                    ffbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z11) {
                                                                                ii9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                }
                                                            }
                                                        }, false);
                                                    }
                                                    if (i9 == 0) {
                                                        String M02 = k96.M0(2131754036, str2);
                                                        final byte b10 = 8;
                                                        Runnable runnable = new Runnable(this) { // from class: qd9
                                                            public final /* synthetic */ ye9 b;

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
                                                                ye9 ye9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b10;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ye9 ye9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = ii9Var3.I;
                                                                        if (ii9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            ye9Var = ye9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = ii9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ffb ffbVar = ii9Var3.G;
                                                                            ffbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                ye9Var = ye9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ffbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ffbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ffbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ffbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ffbVar.a.rows.clear();
                                                                                    ffbVar.i();
                                                                                    ye9Var = ye9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ffbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ffbVar.b(pagetablecell4);
                                                                                        int a2 = ffbVar.a(pagetablecell4);
                                                                                        int o2 = ffb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        ye9 ye9Var3 = ye9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ffbVar.b; i44++) {
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
                                                                                        ye9Var2 = ye9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    ye9Var = ye9Var2;
                                                                                    ffbVar.j(identityHashMap, i38);
                                                                                    ffbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z10) {
                                                                                ii9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        ye9Var.I2();
                                                                        break;
                                                                    case 1:
                                                                        lk0 row = ii9Var3.getRow();
                                                                        ye9Var2.I2();
                                                                        if (row != null) {
                                                                            ld9 ld9Var = ye9Var2.R3;
                                                                            if (ld9Var != null) {
                                                                                ld9Var.d();
                                                                            }
                                                                            ye9Var2.s4(row);
                                                                            ld9 ld9Var2 = ye9Var2.R3;
                                                                            if (ld9Var2 != null) {
                                                                                ld9Var2.h();
                                                                            }
                                                                            we9 we9Var = ye9Var2.p3;
                                                                            if (we9Var != null) {
                                                                                we9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = ii9Var3.I;
                                                                        if (ii9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, ii9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, ii9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ffb ffbVar2 = ii9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b92 = ffbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ffbVar2.a(pagetablecell6);
                                                                                        int o3 = ffb.o(pagetablecell6);
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
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ffbVar2.b && i53 < ffbVar2.c) {
                                                                                                    hashSet9.add(ffbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new bz0(ffbVar2, (byte) 8));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ffb.g((TL_iv.pageTableCell) obj2);
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
                                                                                            TL_iv.pageTableCell pagetablecell7 = ffbVar2.d[i47][i48];
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
                                                                                            ffb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ffbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ffbVar2.i();
                                                                                            ii9Var3.x();
                                                                                            ii9Var3.w.invalidate();
                                                                                            ii9Var3.s(i45, i46);
                                                                                            ii9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ffb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b102 = ii9Var3.G.b(pagetablecell9);
                                                                            int a4 = ii9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (ii9Var3.G.p(pagetablecell9)) {
                                                                                ii9Var3.x();
                                                                                ii9Var3.w.invalidate();
                                                                                ii9Var3.s(b102, a4);
                                                                                ii9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 4:
                                                                        ii9Var3.h(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 5:
                                                                        ii9Var3.h(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 6:
                                                                        ii9Var3.j(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 7:
                                                                        ii9Var3.j(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = ii9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ffb ffbVar3 = ii9Var3.G;
                                                                            ffbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ffbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ffbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ffbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ffbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ffbVar3.a.rows.clear();
                                                                                    ffbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ffbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b11 = ffbVar3.b(pagetablecell10);
                                                                                        int a6 = ffbVar3.a(pagetablecell10);
                                                                                        int o4 = ffb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ffbVar3.c; i67++) {
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
                                                                                    ffbVar3.j(identityHashMap2, ffbVar3.b);
                                                                                    ffbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z11) {
                                                                                ii9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                        r9 = 1;
                                                        J.b(R.drawable.iv_table_remove, M02, runnable, true);
                                                    } else {
                                                        r9 = 1;
                                                    }
                                                    if (i11 != 0) {
                                                        final byte b11 = 0;
                                                        J.b(R.drawable.iv_table_remove, k96.M0(2131754032, str2), new Runnable(this) { // from class: qd9
                                                            public final /* synthetic */ ye9 b;

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
                                                                ye9 ye9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = b11;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ye9 ye9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = ii9Var3.I;
                                                                        if (ii9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            ye9Var = ye9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = ii9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ffb ffbVar = ii9Var3.G;
                                                                            ffbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                ye9Var = ye9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ffbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ffbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ffbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ffbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ffbVar.a.rows.clear();
                                                                                    ffbVar.i();
                                                                                    ye9Var = ye9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ffbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ffbVar.b(pagetablecell4);
                                                                                        int a2 = ffbVar.a(pagetablecell4);
                                                                                        int o2 = ffb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        ye9 ye9Var3 = ye9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ffbVar.b; i44++) {
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
                                                                                        ye9Var2 = ye9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    ye9Var = ye9Var2;
                                                                                    ffbVar.j(identityHashMap, i38);
                                                                                    ffbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z10) {
                                                                                ii9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        ye9Var.I2();
                                                                        break;
                                                                    case 1:
                                                                        lk0 row = ii9Var3.getRow();
                                                                        ye9Var2.I2();
                                                                        if (row != null) {
                                                                            ld9 ld9Var = ye9Var2.R3;
                                                                            if (ld9Var != null) {
                                                                                ld9Var.d();
                                                                            }
                                                                            ye9Var2.s4(row);
                                                                            ld9 ld9Var2 = ye9Var2.R3;
                                                                            if (ld9Var2 != null) {
                                                                                ld9Var2.h();
                                                                            }
                                                                            we9 we9Var = ye9Var2.p3;
                                                                            if (we9Var != null) {
                                                                                we9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = ii9Var3.I;
                                                                        if (ii9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, ii9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, ii9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ffb ffbVar2 = ii9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b92 = ffbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ffbVar2.a(pagetablecell6);
                                                                                        int o3 = ffb.o(pagetablecell6);
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
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ffbVar2.b && i53 < ffbVar2.c) {
                                                                                                    hashSet9.add(ffbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new bz0(ffbVar2, (byte) 8));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ffb.g((TL_iv.pageTableCell) obj2);
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
                                                                                            TL_iv.pageTableCell pagetablecell7 = ffbVar2.d[i47][i48];
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
                                                                                            ffb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ffbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ffbVar2.i();
                                                                                            ii9Var3.x();
                                                                                            ii9Var3.w.invalidate();
                                                                                            ii9Var3.s(i45, i46);
                                                                                            ii9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ffb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b102 = ii9Var3.G.b(pagetablecell9);
                                                                            int a4 = ii9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (ii9Var3.G.p(pagetablecell9)) {
                                                                                ii9Var3.x();
                                                                                ii9Var3.w.invalidate();
                                                                                ii9Var3.s(b102, a4);
                                                                                ii9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 4:
                                                                        ii9Var3.h(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 5:
                                                                        ii9Var3.h(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 6:
                                                                        ii9Var3.j(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 7:
                                                                        ii9Var3.j(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = ii9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ffb ffbVar3 = ii9Var3.G;
                                                                            ffbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ffbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ffbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ffbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ffbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ffbVar3.a.rows.clear();
                                                                                    ffbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ffbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b112 = ffbVar3.b(pagetablecell10);
                                                                                        int a6 = ffbVar3.a(pagetablecell10);
                                                                                        int o4 = ffb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ffbVar3.c; i67++) {
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
                                                                                    ffbVar3.j(identityHashMap2, ffbVar3.b);
                                                                                    ffbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z11) {
                                                                                ii9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                }
                                                            }
                                                        }, r9);
                                                    }
                                                    if (z5) {
                                                        J.b(R.drawable.iv_table_remove, k96.M0(2131754031, str2), new Runnable(this) { // from class: qd9
                                                            public final /* synthetic */ ye9 b;

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
                                                                ye9 ye9Var;
                                                                boolean z10;
                                                                int b52;
                                                                ArrayList arrayList;
                                                                byte b62 = r9;
                                                                int i37 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                boolean z11 = true;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ye9 ye9Var2 = this.b;
                                                                switch (b62) {
                                                                    case 0:
                                                                        LinkedHashSet linkedHashSet2 = ii9Var3.I;
                                                                        if (ii9Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                            ye9Var = ye9Var2;
                                                                        } else {
                                                                            HashSet hashSet7 = new HashSet();
                                                                            Iterator it10 = linkedHashSet2.iterator();
                                                                            while (it10.hasNext()) {
                                                                                int b72 = ii9Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                hashSet7.add(Integer.valueOf(b72));
                                                                                i37 = Math.min(i37, b72);
                                                                            }
                                                                            linkedHashSet2.clear();
                                                                            ffb ffbVar = ii9Var3.G;
                                                                            ffbVar.getClass();
                                                                            if (hashSet7.isEmpty()) {
                                                                                ye9Var = ye9Var2;
                                                                                z10 = false;
                                                                            } else {
                                                                                boolean[] zArr = new boolean[ffbVar.b];
                                                                                Iterator it11 = hashSet7.iterator();
                                                                                while (it11.hasNext()) {
                                                                                    int intValue3 = ((Integer) it11.next()).intValue();
                                                                                    if (intValue3 >= 0 && intValue3 < ffbVar.b) {
                                                                                        zArr[intValue3] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr2 = new int[ffbVar.b];
                                                                                int i38 = 0;
                                                                                for (int i39 = 0; i39 < ffbVar.b; i39++) {
                                                                                    iArr2[i39] = i38;
                                                                                    if (!zArr[i39]) {
                                                                                        i38++;
                                                                                    }
                                                                                }
                                                                                if (i38 == 0) {
                                                                                    ffbVar.a.rows.clear();
                                                                                    ffbVar.i();
                                                                                    ye9Var = ye9Var2;
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                    ArrayList arrayList2 = ffbVar.g;
                                                                                    int size2 = arrayList2.size();
                                                                                    int i40 = 0;
                                                                                    while (i40 < size2) {
                                                                                        Object obj = arrayList2.get(i40);
                                                                                        i40++;
                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                        int b82 = ffbVar.b(pagetablecell4);
                                                                                        int a2 = ffbVar.a(pagetablecell4);
                                                                                        int o2 = ffb.o(pagetablecell4);
                                                                                        int i41 = pagetablecell4.colspan;
                                                                                        if (i41 == 0) {
                                                                                            i41 = 1;
                                                                                        }
                                                                                        ye9 ye9Var3 = ye9Var2;
                                                                                        int[] iArr3 = iArr2;
                                                                                        boolean[] zArr2 = zArr;
                                                                                        int i42 = 0;
                                                                                        int i43 = -1;
                                                                                        for (int i44 = b82; i44 < b82 + o2 && i44 < ffbVar.b; i44++) {
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
                                                                                        ye9Var2 = ye9Var3;
                                                                                        iArr2 = iArr3;
                                                                                    }
                                                                                    ye9Var = ye9Var2;
                                                                                    ffbVar.j(identityHashMap, i38);
                                                                                    ffbVar.i();
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z10) {
                                                                                ii9Var3.s(i37, 0);
                                                                            }
                                                                        }
                                                                        ye9Var.I2();
                                                                        break;
                                                                    case 1:
                                                                        lk0 row = ii9Var3.getRow();
                                                                        ye9Var2.I2();
                                                                        if (row != null) {
                                                                            ld9 ld9Var = ye9Var2.R3;
                                                                            if (ld9Var != null) {
                                                                                ld9Var.d();
                                                                            }
                                                                            ye9Var2.s4(row);
                                                                            ld9 ld9Var2 = ye9Var2.R3;
                                                                            if (ld9Var2 != null) {
                                                                                ld9Var2.h();
                                                                            }
                                                                            we9 we9Var = ye9Var2.p3;
                                                                            if (we9Var != null) {
                                                                                we9Var.onContentChanged();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        LinkedHashSet linkedHashSet3 = ii9Var3.I;
                                                                        if (ii9Var3.G != null) {
                                                                            char c = 2;
                                                                            if (linkedHashSet3.size() >= 2) {
                                                                                HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                Iterator it12 = hashSet8.iterator();
                                                                                int i45 = Integer.MAX_VALUE;
                                                                                int i46 = Integer.MAX_VALUE;
                                                                                while (it12.hasNext()) {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                    i45 = Math.min(i45, ii9Var3.G.b(pagetablecell5));
                                                                                    i46 = Math.min(i46, ii9Var3.G.a(pagetablecell5));
                                                                                }
                                                                                linkedHashSet3.clear();
                                                                                ffb ffbVar2 = ii9Var3.G;
                                                                                TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                                if (hashSet8.size() >= 2) {
                                                                                    Iterator it13 = hashSet8.iterator();
                                                                                    int i47 = Integer.MAX_VALUE;
                                                                                    int i48 = Integer.MAX_VALUE;
                                                                                    int i49 = -1;
                                                                                    int i50 = -1;
                                                                                    while (it13.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                        int b92 = ffbVar2.b(pagetablecell6);
                                                                                        char c2 = c;
                                                                                        int a3 = ffbVar2.a(pagetablecell6);
                                                                                        int o3 = ffb.o(pagetablecell6);
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
                                                                                                if (i52 >= 0 && i53 >= 0 && i52 < ffbVar2.b && i53 < ffbVar2.c) {
                                                                                                    hashSet9.add(ffbVar2.d[i52][i53]);
                                                                                                }
                                                                                            }
                                                                                            i52++;
                                                                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                            Collections.sort(arrayList3, new bz0(ffbVar2, (byte) 8));
                                                                                            int size3 = arrayList3.size();
                                                                                            int i54 = 0;
                                                                                            while (i54 < size3) {
                                                                                                Object obj2 = arrayList3.get(i54);
                                                                                                i54++;
                                                                                                String g = ffb.g((TL_iv.pageTableCell) obj2);
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
                                                                                            TL_iv.pageTableCell pagetablecell7 = ffbVar2.d[i47][i48];
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
                                                                                            ffb.c(pagetablecell7, sb.toString());
                                                                                            Iterator it14 = hashSet9.iterator();
                                                                                            while (it14.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                if (pagetablecell8 != pagetablecell7 && (b52 = ffbVar2.b(pagetablecell8)) >= 0 && b52 < pageblocktable2.rows.size()) {
                                                                                                    pageblocktable2.rows.get(b52).cells.remove(pagetablecell8);
                                                                                                }
                                                                                            }
                                                                                            ffbVar2.i();
                                                                                            ii9Var3.x();
                                                                                            ii9Var3.w.invalidate();
                                                                                            ii9Var3.s(i45, i46);
                                                                                            ii9Var3.v();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                linkedHashSet3.addAll(hashSet8);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 3:
                                                                        LinkedHashSet linkedHashSet4 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && linkedHashSet4.size() == 1) {
                                                                            TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                            if (ffb.n(pagetablecell9) <= 1) {
                                                                                int i59 = pagetablecell9.rowspan;
                                                                                if (i59 == 0) {
                                                                                    i59 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int b102 = ii9Var3.G.b(pagetablecell9);
                                                                            int a4 = ii9Var3.G.a(pagetablecell9);
                                                                            linkedHashSet4.clear();
                                                                            if (ii9Var3.G.p(pagetablecell9)) {
                                                                                ii9Var3.x();
                                                                                ii9Var3.w.invalidate();
                                                                                ii9Var3.s(b102, a4);
                                                                                ii9Var3.v();
                                                                            } else {
                                                                                linkedHashSet4.add(pagetablecell9);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 4:
                                                                        ii9Var3.h(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 5:
                                                                        ii9Var3.h(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 6:
                                                                        ii9Var3.j(true);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    case 7:
                                                                        ii9Var3.j(false);
                                                                        ye9Var2.I2();
                                                                        break;
                                                                    default:
                                                                        LinkedHashSet linkedHashSet5 = ii9Var3.I;
                                                                        if (ii9Var3.G != null && !linkedHashSet5.isEmpty()) {
                                                                            HashSet hashSet10 = new HashSet();
                                                                            Iterator it15 = linkedHashSet5.iterator();
                                                                            while (it15.hasNext()) {
                                                                                int a5 = ii9Var3.G.a((TL_iv.pageTableCell) it15.next());
                                                                                hashSet10.add(Integer.valueOf(a5));
                                                                                i37 = Math.min(i37, a5);
                                                                            }
                                                                            linkedHashSet5.clear();
                                                                            ffb ffbVar3 = ii9Var3.G;
                                                                            ffbVar3.getClass();
                                                                            if (hashSet10.isEmpty()) {
                                                                                z11 = false;
                                                                            } else {
                                                                                boolean[] zArr3 = new boolean[ffbVar3.c];
                                                                                Iterator it16 = hashSet10.iterator();
                                                                                while (it16.hasNext()) {
                                                                                    int intValue4 = ((Integer) it16.next()).intValue();
                                                                                    if (intValue4 >= 0 && intValue4 < ffbVar3.c) {
                                                                                        zArr3[intValue4] = true;
                                                                                    }
                                                                                }
                                                                                int[] iArr4 = new int[ffbVar3.c];
                                                                                int i60 = 0;
                                                                                for (int i61 = 0; i61 < ffbVar3.c; i61++) {
                                                                                    iArr4[i61] = i60;
                                                                                    if (!zArr3[i61]) {
                                                                                        i60++;
                                                                                    }
                                                                                }
                                                                                if (i60 == 0) {
                                                                                    ffbVar3.a.rows.clear();
                                                                                    ffbVar3.i();
                                                                                } else {
                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                    ArrayList arrayList4 = ffbVar3.g;
                                                                                    int size4 = arrayList4.size();
                                                                                    int i62 = 0;
                                                                                    while (i62 < size4) {
                                                                                        Object obj3 = arrayList4.get(i62);
                                                                                        i62++;
                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                        int b112 = ffbVar3.b(pagetablecell10);
                                                                                        int a6 = ffbVar3.a(pagetablecell10);
                                                                                        int o4 = ffb.o(pagetablecell10);
                                                                                        int i63 = pagetablecell10.colspan;
                                                                                        if (i63 == 0) {
                                                                                            i63 = 1;
                                                                                        }
                                                                                        int i64 = i63;
                                                                                        int[] iArr5 = iArr4;
                                                                                        int i65 = 0;
                                                                                        int i66 = -1;
                                                                                        for (int i67 = a6; i67 < a6 + i64 && i67 < ffbVar3.c; i67++) {
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
                                                                                    ffbVar3.j(identityHashMap2, ffbVar3.b);
                                                                                    ffbVar3.i();
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                            ii9Var3.x();
                                                                            if (z11) {
                                                                                ii9Var3.s(0, i37);
                                                                            }
                                                                        }
                                                                        ye9Var2.I2();
                                                                        break;
                                                                }
                                                            }
                                                        }, r9);
                                                        J.n(r9);
                                                        final byte b12 = 0;
                                                        J.h(new Runnable() { // from class: rd9
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b13 = b12;
                                                                a8[] a8VarArr = r4;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ffb ffbVar = model;
                                                                cs5 cs5Var2 = J;
                                                                switch (b13) {
                                                                    case 0:
                                                                        cs5Var2.q0 = true;
                                                                        boolean z10 = !ffbVar.a.bordered;
                                                                        ffb ffbVar2 = ii9Var3.G;
                                                                        if (ffbVar2 != null) {
                                                                            TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                            if (pageblocktable2.bordered != z10) {
                                                                                pageblocktable2.bordered = z10;
                                                                                ii9Var3.w.invalidate();
                                                                                ge9 ge9Var = ii9Var3.F;
                                                                                if (ge9Var != null && ii9Var3.a != null) {
                                                                                    ge9Var.a();
                                                                                }
                                                                            }
                                                                        }
                                                                        a8VarArr[0].setChecked(z10);
                                                                        break;
                                                                    default:
                                                                        cs5Var2.q0 = true;
                                                                        boolean z11 = !ffbVar.a.compact;
                                                                        ffb ffbVar3 = ii9Var3.G;
                                                                        if (ffbVar3 != null) {
                                                                            TL_iv.pageBlockTable pageblocktable3 = ffbVar3.a;
                                                                            if (pageblocktable3.compact != z11) {
                                                                                pageblocktable3.compact = z11;
                                                                                ki9 ki9Var = ii9Var3.w;
                                                                                if (ki9Var.a != null) {
                                                                                    for (int i37 = 0; i37 < ki9Var.getChildCount(); i37++) {
                                                                                        View childAt = ki9Var.getChildAt(i37);
                                                                                        if (childAt instanceof li9) {
                                                                                            ((li9) childAt).setCompact(ki9Var.a.a.compact);
                                                                                        }
                                                                                    }
                                                                                    ki9Var.requestLayout();
                                                                                    ki9Var.invalidate();
                                                                                }
                                                                                ii9Var3.x.requestLayout();
                                                                                ii9Var3.requestLayout();
                                                                                ge9 ge9Var2 = ii9Var3.F;
                                                                                if (ge9Var2 != null && ii9Var3.a != null) {
                                                                                    ge9Var2.a();
                                                                                }
                                                                            }
                                                                        }
                                                                        a8VarArr[1].setChecked(z11);
                                                                        break;
                                                                }
                                                            }
                                                        }, k96.M0(2131753988, str2), pageblocktable.bordered);
                                                        final byte b13 = 1;
                                                        ii9Var2 = ii9Var;
                                                        J.h(new Runnable() { // from class: rd9
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b132 = b13;
                                                                a8[] a8VarArr = r4;
                                                                ii9 ii9Var3 = ii9Var2;
                                                                ffb ffbVar = model;
                                                                cs5 cs5Var2 = J;
                                                                switch (b132) {
                                                                    case 0:
                                                                        cs5Var2.q0 = true;
                                                                        boolean z10 = !ffbVar.a.bordered;
                                                                        ffb ffbVar2 = ii9Var3.G;
                                                                        if (ffbVar2 != null) {
                                                                            TL_iv.pageBlockTable pageblocktable2 = ffbVar2.a;
                                                                            if (pageblocktable2.bordered != z10) {
                                                                                pageblocktable2.bordered = z10;
                                                                                ii9Var3.w.invalidate();
                                                                                ge9 ge9Var = ii9Var3.F;
                                                                                if (ge9Var != null && ii9Var3.a != null) {
                                                                                    ge9Var.a();
                                                                                }
                                                                            }
                                                                        }
                                                                        a8VarArr[0].setChecked(z10);
                                                                        break;
                                                                    default:
                                                                        cs5Var2.q0 = true;
                                                                        boolean z11 = !ffbVar.a.compact;
                                                                        ffb ffbVar3 = ii9Var3.G;
                                                                        if (ffbVar3 != null) {
                                                                            TL_iv.pageBlockTable pageblocktable3 = ffbVar3.a;
                                                                            if (pageblocktable3.compact != z11) {
                                                                                pageblocktable3.compact = z11;
                                                                                ki9 ki9Var = ii9Var3.w;
                                                                                if (ki9Var.a != null) {
                                                                                    for (int i37 = 0; i37 < ki9Var.getChildCount(); i37++) {
                                                                                        View childAt = ki9Var.getChildAt(i37);
                                                                                        if (childAt instanceof li9) {
                                                                                            ((li9) childAt).setCompact(ki9Var.a.a.compact);
                                                                                        }
                                                                                    }
                                                                                    ki9Var.requestLayout();
                                                                                    ki9Var.invalidate();
                                                                                }
                                                                                ii9Var3.x.requestLayout();
                                                                                ii9Var3.requestLayout();
                                                                                ge9 ge9Var2 = ii9Var3.F;
                                                                                if (ge9Var2 != null && ii9Var3.a != null) {
                                                                                    ge9Var2.a();
                                                                                }
                                                                            }
                                                                        }
                                                                        a8VarArr[1].setChecked(z11);
                                                                        break;
                                                                }
                                                            }
                                                        }, k96.M0(2131753987, str2), pageblocktable.compact);
                                                        final a8[] a8VarArr = {J.z(), J.z()};
                                                    }
                                                    J.p = new gm8(this, J, ii9Var2, (byte) 11);
                                                    this.r4 = J;
                                                    J.a0();
                                                }
                                                z6 = false;
                                                if (!z6) {
                                                }
                                                J.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new vj6((Object) this, (Object) ii9Var2, z6, (byte) 18), false);
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
                                                J.p = new gm8(this, J, ii9Var2, (byte) 11);
                                                this.r4 = J;
                                                J.a0();
                                            }
                                        }
                                        i5 = 0;
                                        if (z4) {
                                        }
                                        if (z4) {
                                        }
                                        cs5Var = this.r4;
                                        i8 = i;
                                        if (cs5Var != null) {
                                        }
                                        L = gl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                                        FrameLayout S422 = S4(ii9Var2, false);
                                        i9 = i5;
                                        iArr = new int[2];
                                        S422.getLocationOnScreen(iArr);
                                        if ((iArr[i3] - L) - gl.L(8.0f) >= gl.L(8.0f) + gl.m) {
                                        }
                                        final cs5 J2 = this.p3.J(S4);
                                        J2.s = (short) 0;
                                        J2.t = false;
                                        J2.c0 = r1;
                                        LinearLayout linearLayout3 = new LinearLayout(getContext());
                                        linearLayout3.setMinimumWidth(gl.L(208.0f));
                                        linearLayout3.setOrientation(r1);
                                        TextView textView2 = new TextView(getContext());
                                        i10 = i2;
                                        i11 = i4;
                                        tb4.u(12.0f, 2131754054, 1, textView2, null);
                                        textView2.setGravity(17);
                                        int i332 = bkb.x6;
                                        wjb wjbVar2 = this.o3;
                                        zkb.X(textView2, i332, wjbVar2);
                                        linearLayout3.addView(textView2, nme.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                        LinearLayout linearLayout22 = new LinearLayout(getContext());
                                        boolean z82 = z;
                                        linearLayout22.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                                        linearLayout22.setOrientation(0);
                                        linearLayout3.addView(linearLayout22, nme.r(-2, -2, 17));
                                        dd9 dd9Var7 = new dd9(R.drawable.iv_align_horiz_left, wjbVar2, getContext());
                                        dd9Var7.e = (byte) 4;
                                        dd9Var7.updateColors();
                                        dd9Var7.b();
                                        int i342 = bkb.F8;
                                        dd9Var7.c(i342);
                                        linearLayout22.addView(dd9Var7, nme.o(32, 32));
                                        dd9 dd9Var22 = new dd9(R.drawable.iv_align_horiz_middle, wjbVar2, getContext());
                                        dd9Var22.e = (byte) 4;
                                        dd9Var22.updateColors();
                                        dd9Var22.b();
                                        dd9Var22.c(i342);
                                        linearLayout22.addView(dd9Var22, nme.o(32, 32));
                                        dd9 dd9Var32 = new dd9(R.drawable.iv_align_horiz_right, wjbVar2, getContext());
                                        dd9Var32.e = (byte) 4;
                                        dd9Var32.updateColors();
                                        dd9Var32.b();
                                        dd9Var32.c(i342);
                                        final dd9[] dd9VarArr3 = {dd9Var7, dd9Var22, dd9Var32};
                                        boolean z92 = z2;
                                        linearLayout22.addView(dd9Var32, nme.o(32, 32));
                                        z5 = z3;
                                        linearLayout22.addView(new Space(getContext()), nme.o(8, 0));
                                        dd9 dd9Var42 = new dd9(R.drawable.iv_align_vert_top, wjbVar2, getContext());
                                        dd9Var42.e = (byte) 4;
                                        dd9Var42.updateColors();
                                        dd9Var42.b();
                                        dd9Var42.c(i342);
                                        linearLayout22.addView(dd9Var42, nme.o(32, 32));
                                        dd9 dd9Var52 = new dd9(R.drawable.iv_align_vert_middle, wjbVar2, getContext());
                                        dd9Var52.e = (byte) 4;
                                        dd9Var52.updateColors();
                                        dd9Var52.b();
                                        dd9Var52.c(i342);
                                        linearLayout22.addView(dd9Var52, nme.o(32, 32));
                                        dd9 dd9Var62 = new dd9(R.drawable.iv_align_vert_bottom, wjbVar2, getContext());
                                        dd9Var62.e = (byte) 4;
                                        dd9Var62.updateColors();
                                        dd9Var62.b();
                                        dd9Var62.c(i342);
                                        final dd9[] dd9VarArr22 = {dd9Var42, dd9Var52, dd9Var62};
                                        linearLayout22.addView(dd9Var62, nme.o(32, 32));
                                        J2.p(linearLayout3);
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
                                        J2.n(true);
                                        J2.V = kk7.l3;
                                        if (!linkedHashSet.isEmpty()) {
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        J2.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new vj6((Object) this, (Object) ii9Var2, z6, (byte) 18), false);
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
                                        J2.p = new gm8(this, J2, ii9Var2, (byte) 11);
                                        this.r4 = J2;
                                        J2.a0();
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
                                cs5Var = this.r4;
                                i8 = i;
                                if (cs5Var != null) {
                                }
                                L = gl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                                FrameLayout S4222 = S4(ii9Var2, false);
                                i9 = i5;
                                iArr = new int[2];
                                S4222.getLocationOnScreen(iArr);
                                if ((iArr[i3] - L) - gl.L(8.0f) >= gl.L(8.0f) + gl.m) {
                                }
                                final cs5 J22 = this.p3.J(S4);
                                J22.s = (short) 0;
                                J22.t = false;
                                J22.c0 = r1;
                                LinearLayout linearLayout32 = new LinearLayout(getContext());
                                linearLayout32.setMinimumWidth(gl.L(208.0f));
                                linearLayout32.setOrientation(r1);
                                TextView textView22 = new TextView(getContext());
                                i10 = i2;
                                i11 = i4;
                                tb4.u(12.0f, 2131754054, 1, textView22, null);
                                textView22.setGravity(17);
                                int i3322 = bkb.x6;
                                wjb wjbVar22 = this.o3;
                                zkb.X(textView22, i3322, wjbVar22);
                                linearLayout32.addView(textView22, nme.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                LinearLayout linearLayout222 = new LinearLayout(getContext());
                                boolean z822 = z;
                                linearLayout222.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                                linearLayout222.setOrientation(0);
                                linearLayout32.addView(linearLayout222, nme.r(-2, -2, 17));
                                dd9 dd9Var72 = new dd9(R.drawable.iv_align_horiz_left, wjbVar22, getContext());
                                dd9Var72.e = (byte) 4;
                                dd9Var72.updateColors();
                                dd9Var72.b();
                                int i3422 = bkb.F8;
                                dd9Var72.c(i3422);
                                linearLayout222.addView(dd9Var72, nme.o(32, 32));
                                dd9 dd9Var222 = new dd9(R.drawable.iv_align_horiz_middle, wjbVar22, getContext());
                                dd9Var222.e = (byte) 4;
                                dd9Var222.updateColors();
                                dd9Var222.b();
                                dd9Var222.c(i3422);
                                linearLayout222.addView(dd9Var222, nme.o(32, 32));
                                dd9 dd9Var322 = new dd9(R.drawable.iv_align_horiz_right, wjbVar22, getContext());
                                dd9Var322.e = (byte) 4;
                                dd9Var322.updateColors();
                                dd9Var322.b();
                                dd9Var322.c(i3422);
                                final dd9[] dd9VarArr32 = {dd9Var72, dd9Var222, dd9Var322};
                                boolean z922 = z2;
                                linearLayout222.addView(dd9Var322, nme.o(32, 32));
                                z5 = z3;
                                linearLayout222.addView(new Space(getContext()), nme.o(8, 0));
                                dd9 dd9Var422 = new dd9(R.drawable.iv_align_vert_top, wjbVar22, getContext());
                                dd9Var422.e = (byte) 4;
                                dd9Var422.updateColors();
                                dd9Var422.b();
                                dd9Var422.c(i3422);
                                linearLayout222.addView(dd9Var422, nme.o(32, 32));
                                dd9 dd9Var522 = new dd9(R.drawable.iv_align_vert_middle, wjbVar22, getContext());
                                dd9Var522.e = (byte) 4;
                                dd9Var522.updateColors();
                                dd9Var522.b();
                                dd9Var522.c(i3422);
                                linearLayout222.addView(dd9Var522, nme.o(32, 32));
                                dd9 dd9Var622 = new dd9(R.drawable.iv_align_vert_bottom, wjbVar22, getContext());
                                dd9Var622.e = (byte) 4;
                                dd9Var622.updateColors();
                                dd9Var622.b();
                                dd9Var622.c(i3422);
                                final dd9[] dd9VarArr222 = {dd9Var422, dd9Var522, dd9Var622};
                                linearLayout222.addView(dd9Var622, nme.o(32, 32));
                                J22.p(linearLayout32);
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
                                J22.n(true);
                                J22.V = kk7.l3;
                                if (!linkedHashSet.isEmpty()) {
                                }
                                z6 = false;
                                if (!z6) {
                                }
                                J22.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new vj6((Object) this, (Object) ii9Var2, z6, (byte) 18), false);
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
                                J22.p = new gm8(this, J22, ii9Var2, (byte) 11);
                                this.r4 = J22;
                                J22.a0();
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
                            cs5Var = this.r4;
                            i8 = i;
                            if (cs5Var != null) {
                            }
                            L = gl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                            FrameLayout S42222 = S4(ii9Var2, false);
                            i9 = i5;
                            iArr = new int[2];
                            S42222.getLocationOnScreen(iArr);
                            if ((iArr[i3] - L) - gl.L(8.0f) >= gl.L(8.0f) + gl.m) {
                            }
                            final cs5 J222 = this.p3.J(S4);
                            J222.s = (short) 0;
                            J222.t = false;
                            J222.c0 = r1;
                            LinearLayout linearLayout322 = new LinearLayout(getContext());
                            linearLayout322.setMinimumWidth(gl.L(208.0f));
                            linearLayout322.setOrientation(r1);
                            TextView textView222 = new TextView(getContext());
                            i10 = i2;
                            i11 = i4;
                            tb4.u(12.0f, 2131754054, 1, textView222, null);
                            textView222.setGravity(17);
                            int i33222 = bkb.x6;
                            wjb wjbVar222 = this.o3;
                            zkb.X(textView222, i33222, wjbVar222);
                            linearLayout322.addView(textView222, nme.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                            LinearLayout linearLayout2222 = new LinearLayout(getContext());
                            boolean z8222 = z;
                            linearLayout2222.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                            linearLayout2222.setOrientation(0);
                            linearLayout322.addView(linearLayout2222, nme.r(-2, -2, 17));
                            dd9 dd9Var722 = new dd9(R.drawable.iv_align_horiz_left, wjbVar222, getContext());
                            dd9Var722.e = (byte) 4;
                            dd9Var722.updateColors();
                            dd9Var722.b();
                            int i34222 = bkb.F8;
                            dd9Var722.c(i34222);
                            linearLayout2222.addView(dd9Var722, nme.o(32, 32));
                            dd9 dd9Var2222 = new dd9(R.drawable.iv_align_horiz_middle, wjbVar222, getContext());
                            dd9Var2222.e = (byte) 4;
                            dd9Var2222.updateColors();
                            dd9Var2222.b();
                            dd9Var2222.c(i34222);
                            linearLayout2222.addView(dd9Var2222, nme.o(32, 32));
                            dd9 dd9Var3222 = new dd9(R.drawable.iv_align_horiz_right, wjbVar222, getContext());
                            dd9Var3222.e = (byte) 4;
                            dd9Var3222.updateColors();
                            dd9Var3222.b();
                            dd9Var3222.c(i34222);
                            final dd9[] dd9VarArr322 = {dd9Var722, dd9Var2222, dd9Var3222};
                            boolean z9222 = z2;
                            linearLayout2222.addView(dd9Var3222, nme.o(32, 32));
                            z5 = z3;
                            linearLayout2222.addView(new Space(getContext()), nme.o(8, 0));
                            dd9 dd9Var4222 = new dd9(R.drawable.iv_align_vert_top, wjbVar222, getContext());
                            dd9Var4222.e = (byte) 4;
                            dd9Var4222.updateColors();
                            dd9Var4222.b();
                            dd9Var4222.c(i34222);
                            linearLayout2222.addView(dd9Var4222, nme.o(32, 32));
                            dd9 dd9Var5222 = new dd9(R.drawable.iv_align_vert_middle, wjbVar222, getContext());
                            dd9Var5222.e = (byte) 4;
                            dd9Var5222.updateColors();
                            dd9Var5222.b();
                            dd9Var5222.c(i34222);
                            linearLayout2222.addView(dd9Var5222, nme.o(32, 32));
                            dd9 dd9Var6222 = new dd9(R.drawable.iv_align_vert_bottom, wjbVar222, getContext());
                            dd9Var6222.e = (byte) 4;
                            dd9Var6222.updateColors();
                            dd9Var6222.b();
                            dd9Var6222.c(i34222);
                            final dd9[] dd9VarArr2222 = {dd9Var4222, dd9Var5222, dd9Var6222};
                            linearLayout2222.addView(dd9Var6222, nme.o(32, 32));
                            J222.p(linearLayout322);
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
                            J222.n(true);
                            J222.V = kk7.l3;
                            if (!linkedHashSet.isEmpty()) {
                            }
                            z6 = false;
                            if (!z6) {
                            }
                            J222.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new vj6((Object) this, (Object) ii9Var2, z6, (byte) 18), false);
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
                            J222.p = new gm8(this, J222, ii9Var2, (byte) 11);
                            this.r4 = J222;
                            J222.a0();
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
                        cs5Var = this.r4;
                        i8 = i;
                        if (cs5Var != null) {
                        }
                        L = gl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                        FrameLayout S422222 = S4(ii9Var2, false);
                        i9 = i5;
                        iArr = new int[2];
                        S422222.getLocationOnScreen(iArr);
                        if ((iArr[i3] - L) - gl.L(8.0f) >= gl.L(8.0f) + gl.m) {
                        }
                        final cs5 J2222 = this.p3.J(S4);
                        J2222.s = (short) 0;
                        J2222.t = false;
                        J2222.c0 = r1;
                        LinearLayout linearLayout3222 = new LinearLayout(getContext());
                        linearLayout3222.setMinimumWidth(gl.L(208.0f));
                        linearLayout3222.setOrientation(r1);
                        TextView textView2222 = new TextView(getContext());
                        i10 = i2;
                        i11 = i4;
                        tb4.u(12.0f, 2131754054, 1, textView2222, null);
                        textView2222.setGravity(17);
                        int i332222 = bkb.x6;
                        wjb wjbVar2222 = this.o3;
                        zkb.X(textView2222, i332222, wjbVar2222);
                        linearLayout3222.addView(textView2222, nme.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                        LinearLayout linearLayout22222 = new LinearLayout(getContext());
                        boolean z82222 = z;
                        linearLayout22222.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                        linearLayout22222.setOrientation(0);
                        linearLayout3222.addView(linearLayout22222, nme.r(-2, -2, 17));
                        dd9 dd9Var7222 = new dd9(R.drawable.iv_align_horiz_left, wjbVar2222, getContext());
                        dd9Var7222.e = (byte) 4;
                        dd9Var7222.updateColors();
                        dd9Var7222.b();
                        int i342222 = bkb.F8;
                        dd9Var7222.c(i342222);
                        linearLayout22222.addView(dd9Var7222, nme.o(32, 32));
                        dd9 dd9Var22222 = new dd9(R.drawable.iv_align_horiz_middle, wjbVar2222, getContext());
                        dd9Var22222.e = (byte) 4;
                        dd9Var22222.updateColors();
                        dd9Var22222.b();
                        dd9Var22222.c(i342222);
                        linearLayout22222.addView(dd9Var22222, nme.o(32, 32));
                        dd9 dd9Var32222 = new dd9(R.drawable.iv_align_horiz_right, wjbVar2222, getContext());
                        dd9Var32222.e = (byte) 4;
                        dd9Var32222.updateColors();
                        dd9Var32222.b();
                        dd9Var32222.c(i342222);
                        final dd9[] dd9VarArr3222 = {dd9Var7222, dd9Var22222, dd9Var32222};
                        boolean z92222 = z2;
                        linearLayout22222.addView(dd9Var32222, nme.o(32, 32));
                        z5 = z3;
                        linearLayout22222.addView(new Space(getContext()), nme.o(8, 0));
                        dd9 dd9Var42222 = new dd9(R.drawable.iv_align_vert_top, wjbVar2222, getContext());
                        dd9Var42222.e = (byte) 4;
                        dd9Var42222.updateColors();
                        dd9Var42222.b();
                        dd9Var42222.c(i342222);
                        linearLayout22222.addView(dd9Var42222, nme.o(32, 32));
                        dd9 dd9Var52222 = new dd9(R.drawable.iv_align_vert_middle, wjbVar2222, getContext());
                        dd9Var52222.e = (byte) 4;
                        dd9Var52222.updateColors();
                        dd9Var52222.b();
                        dd9Var52222.c(i342222);
                        linearLayout22222.addView(dd9Var52222, nme.o(32, 32));
                        dd9 dd9Var62222 = new dd9(R.drawable.iv_align_vert_bottom, wjbVar2222, getContext());
                        dd9Var62222.e = (byte) 4;
                        dd9Var62222.updateColors();
                        dd9Var62222.b();
                        dd9Var62222.c(i342222);
                        final dd9[] dd9VarArr22222 = {dd9Var42222, dd9Var52222, dd9Var62222};
                        linearLayout22222.addView(dd9Var62222, nme.o(32, 32));
                        J2222.p(linearLayout3222);
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
                        J2222.n(true);
                        J2222.V = kk7.l3;
                        if (!linkedHashSet.isEmpty()) {
                        }
                        z6 = false;
                        if (!z6) {
                        }
                        J2222.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new vj6((Object) this, (Object) ii9Var2, z6, (byte) 18), false);
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
                        J2222.p = new gm8(this, J2222, ii9Var2, (byte) 11);
                        this.r4 = J2222;
                        J2222.a0();
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
                    cs5Var = this.r4;
                    i8 = i;
                    if (cs5Var != null) {
                    }
                    L = gl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
                    FrameLayout S4222222 = S4(ii9Var2, false);
                    i9 = i5;
                    iArr = new int[2];
                    S4222222.getLocationOnScreen(iArr);
                    if ((iArr[i3] - L) - gl.L(8.0f) >= gl.L(8.0f) + gl.m) {
                    }
                    final cs5 J22222 = this.p3.J(S4);
                    J22222.s = (short) 0;
                    J22222.t = false;
                    J22222.c0 = r1;
                    LinearLayout linearLayout32222 = new LinearLayout(getContext());
                    linearLayout32222.setMinimumWidth(gl.L(208.0f));
                    linearLayout32222.setOrientation(r1);
                    TextView textView22222 = new TextView(getContext());
                    i10 = i2;
                    i11 = i4;
                    tb4.u(12.0f, 2131754054, 1, textView22222, null);
                    textView22222.setGravity(17);
                    int i3322222 = bkb.x6;
                    wjb wjbVar22222 = this.o3;
                    zkb.X(textView22222, i3322222, wjbVar22222);
                    linearLayout32222.addView(textView22222, nme.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                    LinearLayout linearLayout222222 = new LinearLayout(getContext());
                    boolean z822222 = z;
                    linearLayout222222.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                    linearLayout222222.setOrientation(0);
                    linearLayout32222.addView(linearLayout222222, nme.r(-2, -2, 17));
                    dd9 dd9Var72222 = new dd9(R.drawable.iv_align_horiz_left, wjbVar22222, getContext());
                    dd9Var72222.e = (byte) 4;
                    dd9Var72222.updateColors();
                    dd9Var72222.b();
                    int i3422222 = bkb.F8;
                    dd9Var72222.c(i3422222);
                    linearLayout222222.addView(dd9Var72222, nme.o(32, 32));
                    dd9 dd9Var222222 = new dd9(R.drawable.iv_align_horiz_middle, wjbVar22222, getContext());
                    dd9Var222222.e = (byte) 4;
                    dd9Var222222.updateColors();
                    dd9Var222222.b();
                    dd9Var222222.c(i3422222);
                    linearLayout222222.addView(dd9Var222222, nme.o(32, 32));
                    dd9 dd9Var322222 = new dd9(R.drawable.iv_align_horiz_right, wjbVar22222, getContext());
                    dd9Var322222.e = (byte) 4;
                    dd9Var322222.updateColors();
                    dd9Var322222.b();
                    dd9Var322222.c(i3422222);
                    final dd9[] dd9VarArr32222 = {dd9Var72222, dd9Var222222, dd9Var322222};
                    boolean z922222 = z2;
                    linearLayout222222.addView(dd9Var322222, nme.o(32, 32));
                    z5 = z3;
                    linearLayout222222.addView(new Space(getContext()), nme.o(8, 0));
                    dd9 dd9Var422222 = new dd9(R.drawable.iv_align_vert_top, wjbVar22222, getContext());
                    dd9Var422222.e = (byte) 4;
                    dd9Var422222.updateColors();
                    dd9Var422222.b();
                    dd9Var422222.c(i3422222);
                    linearLayout222222.addView(dd9Var422222, nme.o(32, 32));
                    dd9 dd9Var522222 = new dd9(R.drawable.iv_align_vert_middle, wjbVar22222, getContext());
                    dd9Var522222.e = (byte) 4;
                    dd9Var522222.updateColors();
                    dd9Var522222.b();
                    dd9Var522222.c(i3422222);
                    linearLayout222222.addView(dd9Var522222, nme.o(32, 32));
                    dd9 dd9Var622222 = new dd9(R.drawable.iv_align_vert_bottom, wjbVar22222, getContext());
                    dd9Var622222.e = (byte) 4;
                    dd9Var622222.updateColors();
                    dd9Var622222.b();
                    dd9Var622222.c(i3422222);
                    final dd9[] dd9VarArr222222 = {dd9Var422222, dd9Var522222, dd9Var622222};
                    linearLayout222222.addView(dd9Var622222, nme.o(32, 32));
                    J22222.p(linearLayout32222);
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
                    J22222.n(true);
                    J22222.V = kk7.l3;
                    if (!linkedHashSet.isEmpty()) {
                    }
                    z6 = false;
                    if (!z6) {
                    }
                    J22222.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new vj6((Object) this, (Object) ii9Var2, z6, (byte) 18), false);
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
                    J22222.p = new gm8(this, J22222, ii9Var2, (byte) 11);
                    this.r4 = J22222;
                    J22222.a0();
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
            cs5Var = this.r4;
            i8 = i;
            if (cs5Var != null) {
            }
            L = gl.L(((i8 + 1 + i2 + (i6 != 0 ? 2 : 0) + (i7 != 0 ? 2 : 0) + i5 + i4 + (z3 ? 3 : 0)) * 48) + 68 + (z3 ? 8 : 0));
            FrameLayout S42222222 = S4(ii9Var2, false);
            i9 = i5;
            iArr = new int[2];
            S42222222.getLocationOnScreen(iArr);
            if ((iArr[i3] - L) - gl.L(8.0f) >= gl.L(8.0f) + gl.m) {
            }
            final cs5 J222222 = this.p3.J(S4);
            J222222.s = (short) 0;
            J222222.t = false;
            J222222.c0 = r1;
            LinearLayout linearLayout322222 = new LinearLayout(getContext());
            linearLayout322222.setMinimumWidth(gl.L(208.0f));
            linearLayout322222.setOrientation(r1);
            TextView textView222222 = new TextView(getContext());
            i10 = i2;
            i11 = i4;
            tb4.u(12.0f, 2131754054, 1, textView222222, null);
            textView222222.setGravity(17);
            int i33222222 = bkb.x6;
            wjb wjbVar222222 = this.o3;
            zkb.X(textView222222, i33222222, wjbVar222222);
            linearLayout322222.addView(textView222222, nme.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
            LinearLayout linearLayout2222222 = new LinearLayout(getContext());
            boolean z8222222 = z;
            linearLayout2222222.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
            linearLayout2222222.setOrientation(0);
            linearLayout322222.addView(linearLayout2222222, nme.r(-2, -2, 17));
            dd9 dd9Var722222 = new dd9(R.drawable.iv_align_horiz_left, wjbVar222222, getContext());
            dd9Var722222.e = (byte) 4;
            dd9Var722222.updateColors();
            dd9Var722222.b();
            int i34222222 = bkb.F8;
            dd9Var722222.c(i34222222);
            linearLayout2222222.addView(dd9Var722222, nme.o(32, 32));
            dd9 dd9Var2222222 = new dd9(R.drawable.iv_align_horiz_middle, wjbVar222222, getContext());
            dd9Var2222222.e = (byte) 4;
            dd9Var2222222.updateColors();
            dd9Var2222222.b();
            dd9Var2222222.c(i34222222);
            linearLayout2222222.addView(dd9Var2222222, nme.o(32, 32));
            dd9 dd9Var3222222 = new dd9(R.drawable.iv_align_horiz_right, wjbVar222222, getContext());
            dd9Var3222222.e = (byte) 4;
            dd9Var3222222.updateColors();
            dd9Var3222222.b();
            dd9Var3222222.c(i34222222);
            final dd9[] dd9VarArr322222 = {dd9Var722222, dd9Var2222222, dd9Var3222222};
            boolean z9222222 = z2;
            linearLayout2222222.addView(dd9Var3222222, nme.o(32, 32));
            z5 = z3;
            linearLayout2222222.addView(new Space(getContext()), nme.o(8, 0));
            dd9 dd9Var4222222 = new dd9(R.drawable.iv_align_vert_top, wjbVar222222, getContext());
            dd9Var4222222.e = (byte) 4;
            dd9Var4222222.updateColors();
            dd9Var4222222.b();
            dd9Var4222222.c(i34222222);
            linearLayout2222222.addView(dd9Var4222222, nme.o(32, 32));
            dd9 dd9Var5222222 = new dd9(R.drawable.iv_align_vert_middle, wjbVar222222, getContext());
            dd9Var5222222.e = (byte) 4;
            dd9Var5222222.updateColors();
            dd9Var5222222.b();
            dd9Var5222222.c(i34222222);
            linearLayout2222222.addView(dd9Var5222222, nme.o(32, 32));
            dd9 dd9Var6222222 = new dd9(R.drawable.iv_align_vert_bottom, wjbVar222222, getContext());
            dd9Var6222222.e = (byte) 4;
            dd9Var6222222.updateColors();
            dd9Var6222222.b();
            dd9Var6222222.c(i34222222);
            final dd9[] dd9VarArr2222222 = {dd9Var4222222, dd9Var5222222, dd9Var6222222};
            linearLayout2222222.addView(dd9Var6222222, nme.o(32, 32));
            J222222.p(linearLayout322222);
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
            J222222.n(true);
            J222222.V = kk7.l3;
            if (!linkedHashSet.isEmpty()) {
            }
            z6 = false;
            if (!z6) {
            }
            J222222.b(!z6 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new vj6((Object) this, (Object) ii9Var2, z6, (byte) 18), false);
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
            J222222.p = new gm8(this, J222222, ii9Var2, (byte) 11);
            this.r4 = J222222;
            J222222.a0();
        }
    }

    @Override // q5c
    public final void I1(s49 s49Var) {
        lk0 lk0Var = this.a4;
        this.a4 = null;
        this.b4 = false;
        if (lk0Var == null) {
            if (s49Var != null) {
                View view = s49Var.a;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        s4(lk0Var);
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.onContentChanged();
        }
    }

    public final void I2() {
        if (this.J3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.J3 = false;
        this.K3 = false;
        this.L3 = null;
        this.M3 = null;
        cs5 cs5Var = this.r4;
        if (cs5Var != null) {
            this.r4 = null;
            cs5Var.u();
        }
        ii9 ii9Var = this.q4;
        if (ii9Var != null) {
            LinkedHashSet linkedHashSet = ii9Var.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                ii9Var.w.invalidate();
                ii9Var.v();
            }
            this.q4 = null;
        }
        this.t4 = -1;
        this.s4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean I3() {
        gr grVar = na7.q1(this.n3).k4;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            i2 += N3((lk0) arrayList.get(i)).size();
            i++;
        }
        ArrayList V2 = V2();
        md9 md9Var = new md9();
        md9Var.d = i2;
        md9Var.b = V2.size() + md9Var.b;
        for (int i3 = 0; i3 < V2.size(); i3++) {
            md9.b((TL_iv.PageBlock) V2.get(i3), 1, md9Var);
        }
        return md9Var.a <= grVar.Z.f() && md9Var.b <= grVar.a0.f() && md9Var.c <= grVar.b0.f() && md9Var.d <= grVar.c0.f() && md9Var.e <= grVar.d0.f();
    }

    public final wi9 I4() {
        me9 me9Var = this.v3;
        if (me9Var == null || !me9Var.w()) {
            return null;
        }
        int i = me9Var.p0;
        int i2 = me9Var.s0;
        lk0 A42 = A4(i);
        if (i == i2 && A42 != null && w3(A42.b)) {
            return q2(i);
        }
        return null;
    }

    @Override // q5c
    public final void J1(s49 s49Var) {
        int b;
        c4c G;
        lk0 lk0Var = null;
        if (s49Var != null && (b = s49Var.b()) >= 0 && (G = this.g3.G(b)) != null) {
            Object obj = G.H;
            if (obj instanceof lk0) {
                lk0Var = (lk0) obj;
            }
        }
        this.a4 = lk0Var;
        this.b4 = false;
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.f();
        }
    }

    public final Editable J4(int i, int i2, int i3, int i4) {
        if (i != i3) {
            return null;
        }
        if (t3(A4(i))) {
            mc9 E2 = E2(i);
            if (E2 != null) {
                return E2.getText();
            }
            return null;
        }
        if (C3()) {
            mc9 k4 = k4(i);
            if (k4 != null) {
                return k4.getText();
            }
            return null;
        }
        lk0 A42 = A4(i);
        if (A42 == null || !w3(A42.b)) {
            return null;
        }
        int d2 = d2(i);
        if (de9.g(i2, i4, d2, 0) >= ls6.A(i2, i4, d2, 0)) {
            return null;
        }
        wi9 q2 = q2(i);
        return q2 != null ? q2.getEditText().getText() : wi9.z(A42.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TL_iv.PageBlock K4(lk0 lk0Var, int i, int i2) {
        TL_iv.PageBlock pageblockparagraph;
        if (!w3(lk0Var.b)) {
            return null;
        }
        Editable P4 = P4(lk0Var);
        int length = P4.length();
        int max = Math.max(0, Math.min(i, length));
        if (i2 >= 0) {
            length = Math.max(0, Math.min(i2, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P4.subSequence(Math.min(max, length), Math.max(max, length)));
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (pageBlock != null) {
            try {
                H2(pageBlock);
                SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
                pageBlock.serializeToStream(serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
                pageblockparagraph = TL_iv.PageBlock.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                serializedData.cleanup();
                serializedData2.cleanup();
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = new TL_iv.textEmpty();
        wi9.b(pageblockparagraph, spannableStringBuilder);
        return pageblockparagraph;
    }

    public final boolean L1(lk0 lk0Var, lk0 lk0Var2, int i) {
        if (w3(lk0Var.b)) {
            TL_iv.PageBlock pageBlock = lk0Var2.b;
            ArrayList arrayList = lk0Var2.k;
            if (w3(pageBlock)) {
                View C1 = C1(lk0Var2);
                if (C1 instanceof wi9) {
                    mc9 editText = ((wi9) C1).getEditText();
                    if (editText.isFocused()) {
                        CharSequence n = vu3.n(wi9.z(lk0Var.b), editText.getPaint().getFontMetricsInt(), false, null, 0, y3(lk0Var.b) ? 0.85f : 1.0f, 0);
                        int length = n.length();
                        Editable text = editText.getText();
                        if (text != null && n.length() != 0) {
                            editText.i2 = true;
                            text.insert(0, n);
                            editText.i2 = false;
                        }
                        wi9.b(lk0Var.b, editText.getText());
                        lk0Var2.b = lk0Var.b;
                        lk0Var2.c = lk0Var.c;
                        lk0Var2.d = lk0Var.d;
                        lk0Var2.e = lk0Var.e;
                        lk0Var2.f = lk0Var.f;
                        arrayList.clear();
                        arrayList.addAll(lk0Var.k);
                        this.t3.remove(i - 1);
                        t2();
                        t4();
                        c5();
                        editText.setSelection(Math.min(length, editText.length()));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final mc9 L2() {
        View findFocus = findFocus();
        if (findFocus instanceof mc9) {
            return (mc9) findFocus;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof wi9) {
                return ((wi9) childAt).getEditText();
            }
        }
        return null;
    }

    public final int[] L3(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.V3.size();
            ArrayList arrayList = this.V3;
            if (i2 >= size) {
                int size2 = arrayList.size() - 1;
                return new int[]{size2, wi9.y(((lk0) this.V3.get(size2)).b).length()};
            }
            int length = wi9.y(((lk0) arrayList.get(i2)).b).length();
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
    public final boolean L4(int i, int i2, int i3, int i4, ArrayList arrayList) {
        int i5;
        lk0 lk0Var;
        CharSequence z;
        CharSequence z2;
        CharSequence subSequence;
        CharSequence subSequence2;
        ld9 ld9Var;
        ArrayList arrayList2;
        int i6;
        int i7;
        SpannableStringBuilder z3;
        ld9 ld9Var2;
        if (i >= 0 && i2 >= 0) {
            ArrayList arrayList3 = this.t3;
            if (i < arrayList3.size() && i2 < arrayList3.size()) {
                if (i <= i2) {
                    if (i == i2) {
                    }
                    for (i5 = i; i5 <= i2; i5++) {
                        lk0 lk0Var2 = (lk0) arrayList3.get(i5);
                        if (!lk0Var2.i && !t3(lk0Var2) && !A3(lk0Var2.b) && !h3(lk0Var2.b) && !(lk0Var2.b instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    lk0Var = (lk0) arrayList3.get(i);
                    lk0 lk0Var3 = (lk0) arrayList3.get(i2);
                    z = wi9.z(lk0Var.b);
                    z2 = i != i2 ? z : wi9.z(lk0Var3.b);
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
                    ld9Var = this.R3;
                    if (ld9Var != null) {
                        ld9Var.d();
                    }
                    byte b = 1;
                    if (arrayList.size() == 1 || !B3((lk0) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (subSequence.length() > 0) {
                            TL_iv.PageBlock P3 = P3(lk0Var.b);
                            wi9.b(P3, subSequence);
                            arrayList2.add(0, new lk0(P3, lk0Var.c, lk0Var.d));
                        }
                        lk0Var = (lk0) b00.f(1, arrayList);
                        if (lk0Var != null) {
                            boolean t3 = t3(lk0Var);
                            TL_iv.PageBlock pageBlock = lk0Var.b;
                            if (t3) {
                                i6 = yi9.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true).length();
                            } else if (((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || y3(pageBlock)) && (z3 = wi9.z(lk0Var.b)) != null) {
                                i6 = z3.length();
                            }
                            if (subSequence2.length() > 0) {
                                TL_iv.PageBlock P32 = P3(lk0Var3.b);
                                wi9.b(P32, subSequence2);
                                arrayList2.add(new lk0(P32, lk0Var3.c, lk0Var3.d));
                            }
                            while (i2 >= i) {
                                arrayList3.remove(i2);
                                i2--;
                            }
                            for (i7 = 0; i7 < arrayList2.size(); i7++) {
                                arrayList3.add(i + i7, (lk0) arrayList2.get(i7));
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
                        CharSequence z4 = wi9.z(((lk0) arrayList.get(0)).b);
                        CharSequence charSequence = z4 != null ? z4 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder.append(charSequence);
                        i6 = spannableStringBuilder.length();
                        spannableStringBuilder.append(subSequence2);
                        wi9.b(lk0Var.b, spannableStringBuilder);
                        while (i2 > i) {
                            arrayList3.remove(i2);
                            i2--;
                        }
                    }
                    t4();
                    this.v3.e(false);
                    this.g3.O(false);
                    ld9Var2 = this.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
                    }
                    post(new ud9(this, lk0Var, i6, b));
                    return true;
                }
                i2 = i;
                i = i2;
                i4 = i3;
                i3 = i4;
                while (i5 <= i2) {
                }
                lk0Var = (lk0) arrayList3.get(i);
                lk0 lk0Var32 = (lk0) arrayList3.get(i2);
                z = wi9.z(lk0Var.b);
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
                ld9Var = this.R3;
                if (ld9Var != null) {
                }
                byte b2 = 1;
                if (arrayList.size() == 1) {
                }
                arrayList2 = new ArrayList(arrayList);
                if (subSequence.length() > 0) {
                }
                lk0Var = (lk0) b00.f(1, arrayList);
                if (lk0Var != null) {
                }
                i6 = 0;
                if (subSequence2.length() > 0) {
                }
                while (i2 >= i) {
                }
                while (i7 < arrayList2.size()) {
                }
                t4();
                this.v3.e(false);
                this.g3.O(false);
                ld9Var2 = this.R3;
                if (ld9Var2 != null) {
                }
                post(new ud9(this, lk0Var, i6, b2));
                return true;
            }
        }
        return false;
    }

    public final lk0 M2() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof wi9) {
                wi9 wi9Var = (wi9) childAt;
                if (wi9Var.getEditText().isFocused() || (wi9Var.l() && wi9Var.h.isFocused())) {
                    return wi9Var.getRow();
                }
            }
        }
        return null;
    }

    public final int M3(int i) {
        int i2 = 1;
        int i3 = i + 1;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                return arrayList.size();
            }
            lk0 lk0Var = (lk0) arrayList.get(i3);
            if (t3(lk0Var)) {
                i2++;
            } else if (lk0Var.i && i2 - 1 == 0) {
                return i3;
            }
            i3++;
        }
    }

    public final void M4(View view) {
        s49 T;
        int b;
        if (view == null || this.h3 == null || !this.k3 || (T = T(view)) == null || (b = T.b()) < 0 || this.g3.H(b) < 0) {
            return;
        }
        this.I3 = true;
        me9 me9Var = this.v3;
        if (me9Var.w()) {
            me9Var.e(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.h3.s(T);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(TL_iv.PageBlock pageBlock) {
        ld9 ld9Var;
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.d();
        }
        lk0 M2 = M2();
        if (M2 == null) {
            M2 = this.k4;
        }
        ArrayList arrayList = this.t3;
        int indexOf = M2 != null ? arrayList.indexOf(M2) : -1;
        if (indexOf >= 0 && (M2.b instanceof TL_iv.pageBlockBlockquote)) {
            long a = wb9.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) M2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.u3.put(Long.valueOf(a), richText);
            }
            M2.k.add(Long.valueOf(a));
            M2.b = new TL_iv.pageBlockParagraph();
        }
        byte b = 1;
        boolean z = indexOf >= 0 && !M2.k.isEmpty();
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = M2.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && M2.g == null && wi9.y(pageBlock2).isEmpty()) {
                M2.b = pageBlock;
                this.k4 = M2;
                if (h3(pageBlock)) {
                    int indexOf2 = arrayList.indexOf(M2) + 1;
                    if (indexOf2 >= arrayList.size() || A3(((lk0) arrayList.get(indexOf2)).b)) {
                        lk0 lk0Var = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                        if (z) {
                            lk0Var.k.addAll(M2.k);
                        }
                        arrayList.add(indexOf2, lk0Var);
                        M2 = lk0Var;
                    } else {
                        M2 = (lk0) arrayList.get(indexOf2);
                    }
                }
                this.g3.O(false);
                ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.h();
                }
                post(new sd9(this, M2, b));
            }
        }
        lk0 lk0Var2 = new lk0(pageBlock, 0, 0);
        if (z) {
            lk0Var2.k.addAll(M2.k);
        }
        if (indexOf >= 0) {
            arrayList.add(indexOf + 1, lk0Var2);
        } else {
            arrayList.add(lk0Var2);
        }
        M2 = lk0Var2;
        this.k4 = M2;
        if (h3(pageBlock)) {
        }
        this.g3.O(false);
        ld9Var = this.R3;
        if (ld9Var != null) {
        }
        post(new sd9(this, M2, b));
    }

    public final ii9 N2() {
        View findFocus = findFocus();
        if (findFocus instanceof mc9) {
            return Q2((mc9) findFocus);
        }
        return null;
    }

    public final void N4(lk0 lk0Var, iy6 iy6Var, jm6 jm6Var) {
        bg9 bg9Var = (bg9) this.h4.remove(iy6Var);
        if (bg9Var != null) {
            bg9Var.b();
        }
        IdentityHashMap identityHashMap = this.i4;
        xf9 xf9Var = (xf9) identityHashMap.remove(iy6Var);
        if (xf9Var != null) {
            xf9Var.a();
        }
        iy6Var.a = (byte) 1;
        iy6Var.f = 0.0f;
        xf9 xf9Var2 = new xf9(this.n3, jm6Var, new xl3((ViewGroup) this, (Object) iy6Var, (Object) lk0Var, (byte) 28));
        identityHashMap.put(iy6Var, xf9Var2);
        if (xf9Var2.f || xf9Var2.h || xf9Var2.n) {
            return;
        }
        xf9Var2.f = true;
        int i = jm6Var.F;
        String str = jm6Var.I;
        int i2 = jm6Var.G;
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
        oac oacVar = null;
        r9 = null;
        ArrayList arrayList = null;
        oacVar = null;
        if (i > 0 && i2 > 0) {
            int i3 = jm6Var.J;
            if (i3 == 90 || i3 == 270) {
                int i4 = i2;
                i2 = i;
                i = i4;
            }
            oac oacVar2 = new oac();
            oacVar2.a = 0L;
            oacVar2.d = 0.0f;
            long j = 3000;
            oacVar2.b = Math.min(3000L, jm6Var.t);
            while (true) {
                long j2 = oacVar2.b;
                if (j2 <= 0) {
                    oacVar2.b = 3000L;
                    break;
                } else {
                    if (j2 >= 1000) {
                        j = j2;
                        break;
                    }
                    oacVar2.b = j2 << 1;
                }
            }
            oacVar2.e = j;
            oacVar2.f = 1;
            oacVar2.g = 0;
            oacVar2.o = str;
            oacVar2.q = (int) ((r13 / 1000.0f) * 115200.0f);
            oacVar2.r = j;
            oacVar2.n = 30;
            oacVar2.v = j;
            oacVar2.A = jm6Var.o;
            String str2 = jm6Var.k;
            if (str2 != null) {
                oacVar2.B = str2;
                ArrayList arrayList2 = jm6Var.q;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = jm6Var.q;
                }
                oacVar2.G = arrayList;
            } else {
                oacVar2.B = jm6Var.j;
                oacVar2.G = jm6Var.p;
            }
            oacVar2.I = true;
            zl6 zl6Var = jm6Var.A;
            if (zl6Var != null) {
                int i5 = zl6Var.k;
                if (i5 == 90 || i5 == 270) {
                    int i6 = i2;
                    i2 = i;
                    i = i6;
                }
                i = (int) (i * zl6Var.e);
                i2 = (int) (i2 * zl6Var.f);
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
            oacVar2.k = i7;
            oacVar2.h = i7;
            oacVar2.l = i8;
            oacVar2.i = i8;
            oacVar2.m = -1;
            oacVar2.t = true;
            oacVar2.c = 0L;
            oacVar = oacVar2;
        }
        xf9Var2.d = oacVar;
        if (oacVar == null || !oacVar.b()) {
            xf9Var2.b();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(ba4.z(4), "rich_anim_" + gba.p() + ".mp4").getAbsolutePath();
        xf9Var2.e = absolutePath;
        tL_message.attachPath = absolutePath;
        k27 k27Var = new k27(xf9Var2.a, tL_message, null, false, false);
        xf9Var2.c = k27Var;
        k27Var.r0 = xf9Var2.d;
        kk7 f3 = kk7.f(xf9Var2.a);
        f3.a(xf9Var2, kk7.Z1);
        f3.a(xf9Var2, kk7.a2);
        f3.a(xf9Var2, kk7.b2);
        MediaController.w().g0(xf9Var2.c, false, false, false);
    }

    public final TLRPC.Document O2(long j) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document2;
        if (j == 0) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.t3.size(); i2++) {
            for (iy6 iy6Var : N3((lk0) this.t3.get(i2))) {
                if (iy6Var != null && (document2 = iy6Var.h) != null && document2.id == j) {
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
        HashMap hashMap = wf9.a;
        synchronized (wf9.class) {
            document = j != 0 ? (TLRPC.Document) wf9.b.get(Long.valueOf(j)) : null;
        }
        return document;
    }

    public final void O4(lk0 lk0Var, iy6 iy6Var, String str, boolean z, int i, int i2, int i3) {
        IdentityHashMap identityHashMap = this.h4;
        bg9 bg9Var = (bg9) identityHashMap.remove(iy6Var);
        if (bg9Var != null) {
            bg9Var.b();
        }
        bg9 bg9Var2 = new bg9(this.n3, str, z, i, i2, i3, new le9(this, iy6Var, lk0Var));
        identityHashMap.put(iy6Var, bg9Var2);
        bg9Var2.d();
    }

    public final void P1(lk0 lk0Var, jm6 jm6Var) {
        ye9 ye9Var;
        if (lk0Var == null || !z3(lk0Var.b)) {
            return;
        }
        String str = jm6Var.h;
        if (str == null) {
            str = jm6Var.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        iy6 Q3 = Q3(jm6Var, str2);
        boolean c = xf9.c(jm6Var);
        TL_iv.PageBlock pageblockvideo = (jm6Var.b || c) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
        if (x3(lk0Var.b)) {
            c3(lk0Var.b).add(pageblockvideo);
            ArrayList arrayList = lk0Var.h;
            if (arrayList == null) {
                arrayList = new ArrayList();
                lk0Var.h = arrayList;
            }
            arrayList.add(Q3);
        } else {
            iy6 iy6Var = lk0Var.g;
            if (iy6Var == null || iy6Var.a == 0) {
                lk0Var.b = pageblockvideo;
                lk0Var.g = Q3;
            } else {
                TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                pageblockcollage.caption = lk0Var.b.caption;
                sb9.d(pageblockcollage);
                ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                pageblockcollage.items = arrayList2;
                arrayList2.add(lk0Var.b);
                pageblockcollage.items.add(pageblockvideo);
                ArrayList arrayList3 = new ArrayList();
                lk0Var.h = arrayList3;
                arrayList3.add(lk0Var.g);
                lk0Var.h.add(Q3);
                lk0Var.g = null;
                lk0Var.b = pageblockcollage;
            }
        }
        this.g3.O(false);
        o4(lk0Var);
        if (c) {
            N4(lk0Var, Q3, jm6Var);
            ye9Var = this;
        } else {
            ye9Var = this;
            ye9Var.O4(lk0Var, Q3, str2, jm6Var.b, jm6Var.F, jm6Var.G, jm6Var.E);
        }
        ld9 ld9Var2 = ye9Var.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        ye9Var.p3.onContentChanged();
    }

    public final int P2(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            lk0 lk0Var = (lk0) arrayList.get(i);
            if (!lk0Var.i) {
                int i3 = -1;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    lk0 lk0Var2 = (lk0) arrayList.get(i5);
                    if (t3(lk0Var2)) {
                        i4++;
                        if (i3 == -1 && !((TL_iv.pageBlockDetails) lk0Var2.b).open) {
                            i3 = i4;
                        }
                    } else if (lk0Var2.i) {
                        if (i3 != -1 && i4 == i3) {
                            i3 = -1;
                        }
                        i4--;
                    }
                }
                if (i3 == -1) {
                    TL_iv.PageBlock pageBlock = lk0Var.b;
                    if (!A3(pageBlock) || h3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
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

    public final Editable P4(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        return C1 instanceof wi9 ? ((wi9) C1).getEditText().getText() : wi9.z(lk0Var.b);
    }

    public final void Q1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
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
        S2(arrayList4, richMessage.blocks, this.u3);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList4.size(); i++) {
            w4((lk0) arrayList4.get(i));
        }
        ArrayList arrayList5 = this.t3;
        int size = arrayList5.size();
        lk0 M2 = M2();
        if (M2 != null && (indexOf = arrayList5.indexOf(M2)) >= 0) {
            TL_iv.PageBlock pageBlock = M2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && wi9.y(pageBlock).isEmpty()) {
                arrayList5.remove(indexOf);
                size = indexOf;
            } else {
                size = indexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        S3();
        t4();
        this.g3.O(false);
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.onContentChanged();
        }
    }

    public final mc9 Q4(int i, int i2) {
        View C4 = C4(i);
        if (C4 instanceof ii9) {
            return ((ii9) C4).n(i2);
        }
        return null;
    }

    public final lk0 R1(lk0 lk0Var, int i) {
        int i2;
        ArrayList arrayList = this.x4;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf < 0 || (i2 = indexOf + i) < 0 || i2 >= arrayList.size()) {
            return null;
        }
        lk0 lk0Var2 = (lk0) arrayList.get(i2);
        if (lk0Var2.t != 0) {
            return lk0Var2;
        }
        return null;
    }

    public final void R2() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof wi9) {
                wi9 wi9Var = (wi9) childAt;
                wi9Var.f.K();
                wi9Var.h.K();
            } else if (childAt instanceof tb9) {
                ((tb9) childAt).getCaptionEditText().K();
            } else if (childAt instanceof ac9) {
                ((ac9) childAt).getEditText().K();
            }
        }
    }

    public final lk0 R3(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.x4;
            if (i >= arrayList.size()) {
                return null;
            }
            lk0 lk0Var = (lk0) arrayList.get(i);
            if (!lk0Var.i) {
                if (lk0Var.t == 0) {
                    TL_iv.PageBlock pageBlock = lk0Var.b;
                    if (A3(pageBlock) && !h3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return lk0Var;
            }
            i += i2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S1(int i, int i2, int i3, int i4, String[] strArr) {
        l5c l5cVar;
        String str;
        ii9 ii9Var;
        ffb model;
        int max;
        int length;
        int length2;
        boolean z;
        int i5;
        ?? r6;
        int length3;
        ld9 ld9Var;
        int i6 = i2;
        int i7 = i4;
        lk0 A42 = A4(i);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(A42);
        int indexOf2 = arrayList.indexOf(A4(i3));
        byte b = 0;
        if (indexOf < 0 || indexOf2 < 0 || indexOf >= arrayList.size() || indexOf2 >= arrayList.size()) {
            return false;
        }
        lk0 lk0Var = (lk0) arrayList.get(indexOf);
        lk0 lk0Var2 = (lk0) arrayList.get(indexOf2);
        me9 me9Var = this.v3;
        int i8 = 1;
        if (indexOf == indexOf2 && t3(lk0Var)) {
            View C1 = C1(lk0Var);
            if (!(C1 instanceof ac9) || !(lk0Var.b instanceof TL_iv.pageBlockDetails)) {
                return true;
            }
            mc9 editText = ((ac9) C1).getEditText();
            ld9 ld9Var2 = this.R3;
            if (ld9Var2 != null) {
                ld9Var2.d();
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
            int g = de9.g(i6, i7, length4, 0);
            spannableStringBuilder.replace(g, ls6.A(i6, i7, length4, 0), (CharSequence) sb2);
            editText.setTextSilently(spannableStringBuilder);
            editText.f();
            ((TL_iv.pageBlockDetails) lk0Var.b).title = yi9.f(spannableStringBuilder);
            int length5 = sb2.length() + g;
            me9Var.e(false);
            ld9 ld9Var3 = this.R3;
            if (ld9Var3 != null) {
                ld9Var3.h();
            }
            post(new yd9(editText, length5, b));
            return true;
        }
        int i10 = indexOf;
        while (true) {
            l5cVar = this.g3;
            str = "";
            if (i10 > indexOf2) {
                int i11 = i8;
                ld9 ld9Var4 = this.R3;
                if (ld9Var4 != null) {
                    ld9Var4.d();
                }
                TL_iv.PageBlock pageBlock = lk0Var.b;
                boolean z2 = pageBlock instanceof TL_iv.pageBlockTable;
                boolean z3 = lk0Var2.b instanceof TL_iv.pageBlockTable;
                we9 we9Var = this.p3;
                if (z2) {
                    if (z3 && indexOf == indexOf2) {
                        int i12 = me9Var.q0;
                        int i13 = me9Var.t0;
                        View C12 = C1(lk0Var);
                        if ((C12 instanceof ii9) && (model = (ii9Var = (ii9) C12).getModel()) != null) {
                            ArrayList arrayList2 = model.g;
                            if (i12 == 0 && i13 == 0) {
                                TL_iv.PageBlock pageBlock2 = lk0Var.b;
                                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                                    ld9 ld9Var5 = this.R3;
                                    if (ld9Var5 != null) {
                                        ld9Var5.d();
                                    }
                                    String l = yi9.l(pageblocktable.title);
                                    int max2 = Math.max(0, Math.min(Math.min(i6, i7), l.length()));
                                    int max3 = Math.max(0, Math.min(Math.max(i6, i7), l.length()));
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i14 = 0; i14 < strArr.length; i14++) {
                                        if (i14 > 0) {
                                            sb3.append(' ');
                                        }
                                        sb3.append(strArr[i14]);
                                    }
                                    String sb4 = sb3.toString();
                                    String str2 = l.substring(0, max2) + sb4 + l.substring(max3);
                                    TL_iv.textPlain textplain = new TL_iv.textPlain();
                                    textplain.text = str2;
                                    pageblocktable.title = textplain;
                                    mc9 titleEditText = ii9Var.getTitleEditText();
                                    titleEditText.setTextSilently(str2);
                                    titleEditText.f();
                                    int length6 = sb4.length() + max2;
                                    me9Var.e(false);
                                    ld9 ld9Var6 = this.R3;
                                    if (ld9Var6 != null) {
                                        ld9Var6.h();
                                    }
                                    we9Var.onContentChanged();
                                    post(new yd9(titleEditText, length6, (byte) 4));
                                    return true;
                                }
                            } else {
                                int i15 = i12 - 1;
                                int i16 = i13 - 1;
                                int size = arrayList2.size();
                                if (i15 >= 0 && i15 < size && i16 >= 0 && i16 < size) {
                                    ld9 ld9Var7 = this.R3;
                                    if (ld9Var7 != null) {
                                        ld9Var7.d();
                                    }
                                    if (i15 > i16 || (i15 == i16 && i6 > i7)) {
                                        i7 = i6;
                                        i6 = i7;
                                        i16 = i15;
                                        i15 = i16;
                                    }
                                    StringBuilder sb5 = new StringBuilder();
                                    for (int i17 = 0; i17 < strArr.length; i17++) {
                                        if (i17 > 0) {
                                            sb5.append('\n');
                                        }
                                        sb5.append(strArr[i17]);
                                    }
                                    String sb6 = sb5.toString();
                                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i15);
                                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i16);
                                    if (i15 == i16) {
                                        String g2 = ffb.g(pagetablecell);
                                        max = Math.max(0, Math.min(i6, g2.length()));
                                        String str3 = g2.substring(0, max) + sb6 + g2.substring(Math.max(0, Math.min(i7, g2.length())));
                                        ffb.c(pagetablecell, str3);
                                        li9 m = ii9Var.getGrid().m(pagetablecell);
                                        if (m != null) {
                                            m.a.setTextSilently(str3);
                                        }
                                        length = sb6.length();
                                    } else {
                                        String g3 = ffb.g(pagetablecell);
                                        max = Math.max(0, Math.min(i6, g3.length()));
                                        String concat = g3.substring(0, max).concat(sb6);
                                        ffb.c(pagetablecell, concat);
                                        li9 m2 = ii9Var.getGrid().m(pagetablecell);
                                        if (m2 != null) {
                                            m2.a.setTextSilently(concat);
                                        }
                                        for (int i18 = i15 + 1; i18 < i16; i18++) {
                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i18);
                                            ffb.c(pagetablecell3, "");
                                            li9 m3 = ii9Var.getGrid().m(pagetablecell3);
                                            if (m3 != null) {
                                                m3.a.setTextSilently("");
                                            }
                                        }
                                        String g4 = ffb.g(pagetablecell2);
                                        String substring = g4.substring(Math.max(0, Math.min(i7, g4.length())));
                                        ffb.c(pagetablecell2, substring);
                                        li9 m4 = ii9Var.getGrid().m(pagetablecell2);
                                        if (m4 != null) {
                                            m4.a.setTextSilently(substring);
                                        }
                                        length = sb6.length();
                                    }
                                    int i19 = length + max;
                                    me9Var.e(false);
                                    ld9 ld9Var8 = this.R3;
                                    if (ld9Var8 != null) {
                                        ld9Var8.h();
                                    }
                                    post(new t79((Object) ii9Var, (Object) pagetablecell, i19, (byte) 2));
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
                if (!z3) {
                    boolean h3 = h3(pageBlock);
                    boolean h32 = h3(lk0Var2.b);
                    if (h3) {
                        if (h32 && indexOf == indexOf2) {
                            View C13 = C1(lk0Var);
                            if (C13 instanceof tb9) {
                                tb9 tb9Var = (tb9) C13;
                                mc9 captionEditText = tb9Var.getCaptionEditText();
                                ld9 ld9Var9 = this.R3;
                                if (ld9Var9 != null) {
                                    ld9Var9.d();
                                }
                                StringBuilder sb7 = new StringBuilder();
                                for (int i20 = 0; i20 < strArr.length; i20++) {
                                    if (i20 > 0) {
                                        sb7.append(' ');
                                    }
                                    sb7.append(strArr[i20]);
                                }
                                String sb8 = sb7.toString();
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(captionEditText.getText());
                                int length7 = spannableStringBuilder2.length();
                                int g5 = de9.g(i6, i7, length7, 0);
                                spannableStringBuilder2.replace(g5, ls6.A(i6, i7, length7, 0), (CharSequence) sb8);
                                captionEditText.setTextSilently(spannableStringBuilder2);
                                captionEditText.f();
                                tb9Var.b();
                                int length8 = sb8.length() + g5;
                                me9Var.e(false);
                                ld9 ld9Var10 = this.R3;
                                if (ld9Var10 != null) {
                                    ld9Var10.h();
                                }
                                post(new yd9(captionEditText, length8, (byte) 2));
                                return true;
                            }
                            return true;
                        }
                    } else if (!h32) {
                        if (indexOf == indexOf2 && wi9.n(lk0Var.b) && me9Var.q0 == i11 && me9Var.t0 == i11) {
                            View C14 = C1(lk0Var);
                            if (C14 instanceof wi9) {
                                wi9 wi9Var = (wi9) C14;
                                mc9 authorEditText = wi9Var.getAuthorEditText();
                                ld9 ld9Var11 = this.R3;
                                if (ld9Var11 != null) {
                                    ld9Var11.d();
                                }
                                StringBuilder sb9 = new StringBuilder();
                                for (int i21 = 0; i21 < strArr.length; i21++) {
                                    if (i21 > 0) {
                                        sb9.append(' ');
                                    }
                                    sb9.append(strArr[i21]);
                                }
                                String sb10 = sb9.toString();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(authorEditText.getText());
                                int length9 = spannableStringBuilder3.length();
                                int g6 = de9.g(i6, i7, length9, 0);
                                spannableStringBuilder3.replace(g6, ls6.A(i6, i7, length9, 0), (CharSequence) sb10);
                                authorEditText.setTextSilently(spannableStringBuilder3);
                                authorEditText.f();
                                wi9Var.v();
                                int length10 = sb10.length() + g6;
                                me9Var.e(false);
                                ld9 ld9Var12 = this.R3;
                                if (ld9Var12 != null) {
                                    ld9Var12.h();
                                }
                                we9Var.onContentChanged();
                                post(new yd9(authorEditText, length10, (byte) 1));
                                return true;
                            }
                            return true;
                        }
                        CharSequence z4 = wi9.z(lk0Var.b);
                        CharSequence z5 = indexOf == indexOf2 ? z4 : wi9.z(lk0Var2.b);
                        if (z4 == null) {
                            z4 = "";
                        }
                        if (z5 == null) {
                            z5 = "";
                        }
                        int max4 = Math.max(0, Math.min(i6, z4.length()));
                        int max5 = Math.max(0, Math.min(i7, z5.length()));
                        CharSequence subSequence = z4.subSequence(0, max4);
                        CharSequence subSequence2 = z5.subSequence(max5, z5.length());
                        if (strArr.length <= 1) {
                            str = strArr.length != 0 ? strArr[0] : "";
                            wi9.b(lk0Var.b, new SpannableStringBuilder(subSequence).append((CharSequence) str).append(subSequence2));
                            if (indexOf2 > indexOf) {
                                while (indexOf2 > indexOf) {
                                    arrayList.remove(indexOf2);
                                    indexOf2--;
                                }
                            }
                            length2 = str.length() + subSequence.length();
                        } else {
                            wi9.b(lk0Var.b, new SpannableStringBuilder(subSequence).append((CharSequence) strArr[0]));
                            if (indexOf2 > indexOf) {
                                while (indexOf2 > indexOf) {
                                    arrayList.remove(indexOf2);
                                    indexOf2--;
                                }
                            }
                            for (int i22 = 1; i22 < strArr.length - 1; i22++) {
                                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                String str4 = strArr[i22];
                                TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                                textplain2.text = str4;
                                pageblockparagraph.text = textplain2;
                                int i23 = indexOf + i22;
                                int i24 = lk0Var.c;
                                int i25 = lk0Var.d;
                                if (i25 > 0) {
                                    i25 += i22;
                                }
                                arrayList.add(i23, new lk0(pageblockparagraph, i24, i25));
                            }
                            String str5 = strArr[strArr.length - 1];
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            wi9.b(pageblockparagraph2, new SpannableStringBuilder(str5).append(subSequence2));
                            int length11 = (strArr.length + indexOf) - 1;
                            int i26 = lk0Var.c;
                            int i27 = lk0Var.d;
                            if (i27 > 0) {
                                i27 = (i27 + strArr.length) - 1;
                            }
                            arrayList.add(length11, new lk0(pageblockparagraph2, i26, i27));
                            indexOf = (indexOf + strArr.length) - 1;
                            length2 = str5.length();
                        }
                        t4();
                        lk0 lk0Var3 = (indexOf < 0 || indexOf >= arrayList.size()) ? null : (lk0) arrayList.get(indexOf);
                        byte b2 = 0;
                        me9Var.e(false);
                        l5cVar.O(false);
                        ld9 ld9Var13 = this.R3;
                        if (ld9Var13 != null) {
                            ld9Var13.h();
                        }
                        post(new ud9(this, lk0Var3, length2, b2));
                        return true;
                    }
                }
                return false;
            }
            z = i8;
            if (((lk0) arrayList.get(i10)).i || t3((lk0) arrayList.get(i10))) {
                break;
            }
            i10++;
            i8 = z ? 1 : 0;
        }
        int i28 = indexOf;
        while (i28 > 0 && D2(i28) > 0) {
            i28--;
        }
        int i29 = indexOf2;
        while (true) {
            i5 = i29 + 1;
            if (i5 >= arrayList.size() || D2(i5) <= 0) {
                break;
            }
            i29 = i5;
        }
        lk0 lk0Var4 = (lk0) arrayList.get(indexOf);
        lk0 lk0Var5 = (lk0) arrayList.get(indexOf2);
        boolean z6 = (i28 != indexOf || t3(lk0Var4) || lk0Var4.i) ? z ? 1 : 0 : false;
        boolean z7 = (i29 != indexOf2 || t3(lk0Var5) || lk0Var5.i) ? z ? 1 : 0 : false;
        StringBuilder sb11 = new StringBuilder();
        boolean z8 = z6;
        boolean z9 = z7;
        for (int i30 = 0; i30 < strArr.length; i30++) {
            if (i30 > 0) {
                sb11.append(' ');
            }
            sb11.append(strArr[i30]);
        }
        String sb12 = sb11.toString();
        ld9 ld9Var14 = this.R3;
        if (ld9Var14 != null) {
            ld9Var14.d();
        }
        if (!z8) {
            String y = wi9.y(lk0Var4.b);
            String substring2 = y.substring(0, Math.max(0, Math.min(i6, y.length())));
            if (!z9) {
                String y2 = wi9.y(lk0Var5.b);
                str = y2.substring(Math.max(0, Math.min(i7, y2.length())));
            }
            wi9.c(lk0Var4.b, substring2 + sb12 + str);
            arrayList.subList(i28 + 1, i5).clear();
            length3 = sb12.length() + substring2.length();
        } else {
            if (z9) {
                arrayList.subList(i28, i5).clear();
                TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                TL_iv.textPlain textplain3 = new TL_iv.textPlain();
                textplain3.text = sb12;
                pageblockparagraph3.text = textplain3;
                r6 = 0;
                lk0Var4 = new lk0(pageblockparagraph3, 0, 0);
                arrayList.add(Math.min(i28, arrayList.size()), lk0Var4);
                length3 = sb12.length();
                if (arrayList.isEmpty()) {
                    lk0Var4 = new lk0(new TL_iv.pageBlockParagraph(), r6, r6);
                    arrayList.add(lk0Var4);
                    length3 = r6;
                }
                t4();
                me9Var.e(r6);
                l5cVar.O(r6);
                ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.h();
                }
                post(new ud9(this, lk0Var4, length3, (byte) 3));
                return z;
            }
            String y3 = wi9.y(lk0Var5.b);
            wi9.c(lk0Var5.b, sb12.concat(y3.substring(Math.max(0, Math.min(i7, y3.length())))));
            arrayList.subList(i28, i29).clear();
            length3 = sb12.length();
            lk0Var4 = lk0Var5;
        }
        r6 = 0;
        if (arrayList.isEmpty()) {
        }
        t4();
        me9Var.e(r6);
        l5cVar.O(r6);
        ld9Var = this.R3;
        if (ld9Var != null) {
        }
        post(new ud9(this, lk0Var4, length3, (byte) 3));
        return z;
    }

    public final void S3() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return;
            }
            lk0 lk0Var = (lk0) arrayList.get(i);
            if (!lk0Var.k.isEmpty() && wi9.n(lk0Var.b)) {
                long a = wb9.a();
                TL_iv.RichText h = wi9.h(lk0Var.b);
                if (h != null && !(h instanceof TL_iv.textEmpty)) {
                    this.u3.put(Long.valueOf(a), h);
                }
                lk0Var.k.add(Long.valueOf(a));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = lk0Var.b.text;
                lk0Var.b = pageblockparagraph;
            }
            i++;
        }
    }

    public final void T1() {
        wi9 wi9Var;
        lk0 lk0Var;
        ti9 ti9Var;
        this.g3.T();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof wi9) && (lk0Var = (wi9Var = (wi9) childAt).y) != null && (ti9Var = wi9Var.E) != null) {
                wi9Var.d(lk0Var, ti9Var, wi9Var.F);
            }
        }
    }

    public final void T3(lk0 lk0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf < 0) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
        lk0Var2.k.addAll(lk0Var.k);
        arrayList.add(indexOf + 1, lk0Var2);
        t4();
        this.g3.O(false);
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        post(new sd9(this, lk0Var2, (byte) 23));
    }

    public final void T4() {
        int[] D4 = D4();
        if (D4 != null) {
            int i = D4[0];
            int i2 = D4[1];
            if (i >= 0) {
                ArrayList arrayList = this.t3;
                if (i2 >= arrayList.size() || i > i2) {
                    return;
                }
                ld9 ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                if (D3(i, i2)) {
                    for (int i3 = i; i3 <= i2; i3++) {
                        lk0 lk0Var = (lk0) arrayList.get(i3);
                        boolean z = lk0Var.i;
                        ArrayList arrayList2 = lk0Var.k;
                        if (!z && !t3(lk0Var)) {
                            if (wi9.n(lk0Var.b)) {
                                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                pageblockparagraph.text = lk0Var.b.text;
                                lk0Var.b = pageblockparagraph;
                            } else if (!arrayList2.isEmpty()) {
                                tb4.v(1, arrayList2);
                            }
                        }
                    }
                } else {
                    long a = wb9.a();
                    for (int i4 = i; i4 <= i2; i4++) {
                        lk0 lk0Var2 = (lk0) arrayList.get(i4);
                        boolean z2 = lk0Var2.i;
                        ArrayList arrayList3 = lk0Var2.k;
                        if (!z2 && !t3(lk0Var2)) {
                            if (wi9.n(lk0Var2.b)) {
                                long a2 = wb9.a();
                                TL_iv.RichText h = wi9.h(lk0Var2.b);
                                if (h != null && !(h instanceof TL_iv.textEmpty)) {
                                    this.u3.put(Long.valueOf(a2), h);
                                }
                                arrayList3.add(Long.valueOf(a2));
                                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                pageblockparagraph2.text = lk0Var2.b.text;
                                lk0Var2.b = pageblockparagraph2;
                            }
                            arrayList3.add(0, Long.valueOf(a));
                        }
                    }
                }
                t2();
                S3();
                t4();
                me9 me9Var = this.v3;
                boolean z3 = me9Var != null && me9Var.w();
                lk0 lk0Var3 = (lk0) arrayList.get(Math.max(0, Math.min(i, arrayList.size() - 1)));
                lk0 lk0Var4 = (lk0) arrayList.get(Math.max(0, Math.min(i2, arrayList.size() - 1)));
                this.g3.O(false);
                ld9 ld9Var2 = this.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
                if (z3) {
                    post(new gm8(this, lk0Var3, lk0Var4, (byte) 12));
                } else {
                    post(new sd9(this, lk0Var3, (byte) 9));
                }
            }
        }
    }

    public final boolean U1(int i, int i2) {
        me9 me9Var;
        ArrayList arrayList = this.V3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i, i2));
            int max2 = Math.max(0, Math.max(i, i2));
            int[] L3 = L3(max);
            int[] L32 = L3(max2);
            lk0 lk0Var = (lk0) this.V3.get(L3[0]);
            if (L3[0] == L32[0] || max == max2) {
                View C1 = C1(lk0Var);
                if (C1 instanceof wi9) {
                    wi9 wi9Var = (wi9) C1;
                    wi9Var.A();
                    mc9 editText = wi9Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.min(L3[1], length), Math.min(L32[1], length));
                }
            } else {
                View C12 = C1(lk0Var);
                View C13 = C1(this.V3.get(L32[0]));
                if ((C12 instanceof wi9) && (C13 instanceof wi9)) {
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.t3;
                        int size = arrayList2.size();
                        me9Var = this.v3;
                        if (i3 >= size) {
                            break;
                        }
                        me9Var.W(i3, wi9.y(((lk0) arrayList2.get(i3)).b));
                        i3++;
                    }
                    wi9 wi9Var2 = (wi9) C12;
                    int length2 = wi9Var2.getEditText().length();
                    if (L3[1] >= length2) {
                        length2 = Math.max(0, length2 - 1);
                    }
                    if (!me9Var.i0(wi9Var2, 0, L3[1], length2)) {
                        wi9Var2.A();
                        return true;
                    }
                    me9Var.a0(0, L32[1], (wi9) C13);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList U2(int i, int i2, int i3, boolean z) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        boolean z2;
        ye9 ye9Var;
        int i4;
        int i5;
        ye9 ye9Var2;
        ArrayList arrayList = new ArrayList();
        int i6 = i;
        while (i6 < i2) {
            ArrayList arrayList2 = this.t3;
            lk0 lk0Var = (lk0) arrayList2.get(i6);
            boolean z3 = lk0Var.i;
            ArrayList arrayList3 = lk0Var.k;
            if (z3) {
                i6++;
            } else if (arrayList3.size() > i3) {
                Long l = (Long) arrayList3.get(i3);
                long longValue = l.longValue();
                int i7 = i6 + 1;
                while (i7 < i2) {
                    lk0 lk0Var2 = (lk0) arrayList2.get(i7);
                    if (lk0Var2.k.size() <= i3 || ((Long) lk0Var2.k.get(i3)).longValue() != longValue) {
                        break;
                    }
                    i7++;
                }
                ArrayList<TL_iv.PageBlock> U2 = this.U2(i6, i7, i3 + 1, true);
                if (U2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.u3.get(l);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (U2.size() == 1 && (U2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = U2.get(0).text != null ? U2.get(0).text : new TL_iv.textEmpty();
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = U2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i6 = i7;
            } else if (t3(lk0Var)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lk0Var.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int M3 = this.M3(i6);
                pageblockdetails.blocks = this.U2(i6 + 1, Math.min(M3, i2), i3, true);
                arrayList.add(pageblockdetails);
                i6 = M3 + 1;
            } else {
                int i8 = lk0Var.c;
                if (i8 <= 0) {
                    F2(lk0Var, arrayList);
                    i6++;
                    i4 = i2;
                    i5 = i3;
                    ye9Var2 = this;
                } else {
                    int[] iArr = {i6};
                    if (lk0Var.d > 0) {
                        z2 = true;
                        i4 = i2;
                        i5 = i3;
                        ye9Var = this;
                    } else {
                        z2 = false;
                        ye9Var = this;
                        i4 = i2;
                        i5 = i3;
                    }
                    TL_iv.PageBlock f2 = ye9Var.f2(i6, i8, i4, i5, z2, iArr);
                    ye9Var2 = ye9Var;
                    if (f2 != null) {
                        arrayList.add(f2);
                    }
                    int i9 = iArr[0];
                    i6 = i9 <= 0 ? i4 : i9;
                }
                this = ye9Var2;
                i2 = i4;
                i3 = i5;
            }
        }
        if (!z) {
            while (!arrayList.isEmpty() && v3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && v3((TL_iv.PageBlock) b00.f(1, arrayList))) {
                tb4.v(1, arrayList);
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
    public final boolean U3(lk0 lk0Var, boolean z) {
        int i;
        boolean z2;
        mc9 editText;
        Editable text;
        int i2;
        ld9 ld9Var;
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            ArrayList arrayList2 = lk0Var.k;
            byte b = 1;
            if (y3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote)) {
                X4(lk0Var, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
                return true;
            }
            int i3 = lk0Var.c;
            byte b2 = 2;
            int i4 = -1;
            l5c l5cVar = this.g3;
            if (i3 > 0) {
                ld9 ld9Var2 = this.R3;
                if (ld9Var2 != null) {
                    ld9Var2.d();
                }
                View C1 = C1(lk0Var);
                if (C1 instanceof wi9) {
                    wi9 wi9Var = (wi9) C1;
                    if (wi9Var.getEditText().isFocused()) {
                        i4 = wi9Var.getEditText().getSelectionEnd();
                    }
                }
                p2(indexOf);
                t4();
                if (!(findFocus() instanceof mc9)) {
                    l5cVar.O(false);
                    ld9 ld9Var3 = this.R3;
                    if (ld9Var3 != null) {
                        ld9Var3.h();
                    }
                    post(new ce9(this, lk0Var, b));
                    return true;
                }
                T1();
                ld9 ld9Var4 = this.R3;
                if (ld9Var4 != null) {
                    ld9Var4.h();
                }
                if (i4 >= 0) {
                    post(new ud9(this, lk0Var, i4, b2));
                    return true;
                }
            } else {
                if (!arrayList2.isEmpty() && z) {
                    ArrayList arrayList3 = ((lk0) arrayList.get(indexOf)).k;
                    if (!arrayList3.isEmpty()) {
                        int size = arrayList3.size() - 1;
                        long longValue = ((Long) arrayList3.get(size)).longValue();
                        if (indexOf != 0) {
                            lk0 lk0Var2 = (lk0) arrayList.get(indexOf - 1);
                            if (lk0Var2.k.size() > size) {
                            }
                        }
                        ld9Var = this.R3;
                        if (ld9Var != null) {
                            ld9Var.d();
                        }
                        arrayList2.remove(arrayList2.size() - 1);
                        t2();
                        t4();
                        if (findFocus() instanceof mc9) {
                            l5cVar.O(false);
                            ld9 ld9Var5 = this.R3;
                            if (ld9Var5 != null) {
                                ld9Var5.h();
                            }
                            post(new ce9(this, lk0Var, b2));
                            return true;
                        }
                        c5();
                        ld9 ld9Var6 = this.R3;
                        if (ld9Var6 != null) {
                            ld9Var6.h();
                            return true;
                        }
                    }
                    ArrayList arrayList4 = ((lk0) arrayList.get(indexOf)).k;
                    if (!arrayList4.isEmpty()) {
                        int size2 = arrayList4.size() - 1;
                        long longValue2 = ((Long) arrayList4.get(size2)).longValue();
                        int i5 = indexOf + 1;
                        if (i5 < arrayList.size()) {
                            lk0 lk0Var3 = (lk0) arrayList.get(i5);
                            if (lk0Var3.k.size() > size2) {
                            }
                        }
                    }
                    ld9Var = this.R3;
                    if (ld9Var != null) {
                    }
                    arrayList2.remove(arrayList2.size() - 1);
                    t2();
                    t4();
                    if (findFocus() instanceof mc9) {
                    }
                }
                if (indexOf > 0) {
                    int i6 = indexOf - 1;
                    lk0 lk0Var4 = (lk0) arrayList.get(i6);
                    if (lk0Var4.i && w3(lk0Var.b)) {
                        View C12 = C1(lk0Var);
                        if ((C12 instanceof wi9) && ((wi9) C12).getEditText().isFocused()) {
                            int i7 = 0;
                            int i8 = i6;
                            while (true) {
                                if (i8 < 0) {
                                    break;
                                }
                                lk0 lk0Var5 = (lk0) arrayList.get(i8);
                                if (!lk0Var5.i) {
                                    if (t3(lk0Var5) && i7 - 1 == 0) {
                                        i4 = i8;
                                        break;
                                    }
                                } else {
                                    i7++;
                                }
                                i8--;
                            }
                            if (i4 >= 0) {
                                ld9 ld9Var7 = this.R3;
                                if (ld9Var7 != null) {
                                    ld9Var7.d();
                                }
                                ((TL_iv.pageBlockDetails) ((lk0) arrayList.get(i4)).b).open = true;
                                arrayList.remove(indexOf);
                                arrayList.add(i6, lk0Var);
                                lk0 lk0Var6 = (lk0) arrayList.get(indexOf - 2);
                                if (t3(lk0Var6) || lk0Var6.i || !L1(lk0Var6, lk0Var, i6)) {
                                    t4();
                                    c5();
                                }
                                ld9 ld9Var8 = this.R3;
                                if (ld9Var8 != null) {
                                    ld9Var8.h();
                                    return true;
                                }
                            }
                        }
                    }
                    if (t3(lk0Var4) && (i2 = indexOf + 1) < arrayList.size() && ((lk0) arrayList.get(i2)).i && w3(lk0Var.b)) {
                        View C13 = C1(lk0Var);
                        if ((C13 instanceof wi9) && ((wi9) C13).getEditText().isFocused()) {
                            ld9 ld9Var9 = this.R3;
                            if (ld9Var9 != null) {
                                ld9Var9.d();
                            }
                            mc9 editText2 = ((wi9) C1(lk0Var)).getEditText();
                            CharSequence m = vu3.m(yi9.r(((TL_iv.pageBlockDetails) lk0Var4.b).title, null, true), editText2.getPaint().getFontMetricsInt(), false, null, 0);
                            int length = m.length();
                            Editable text2 = editText2.getText();
                            if (text2 != null && m.length() != 0) {
                                editText2.i2 = true;
                                text2.insert(0, m);
                                editText2.i2 = false;
                            }
                            wi9.b(lk0Var.b, editText2.getText());
                            arrayList.remove(i2);
                            arrayList.remove(i6);
                            t4();
                            c5();
                            editText2.setSelection(Math.min(length, editText2.length()));
                            ld9 ld9Var10 = this.R3;
                            if (ld9Var10 != null) {
                                ld9Var10.h();
                                return true;
                            }
                        }
                    }
                    if (t3(lk0Var4) || lk0Var4.i) {
                        if (!z || (t3(lk0Var4) && ((i = indexOf + 1) >= arrayList.size() || ((lk0) arrayList.get(i)).i))) {
                            return true;
                        }
                        ld9 ld9Var11 = this.R3;
                        if (ld9Var11 != null) {
                            ld9Var11.d();
                        }
                        arrayList.remove(indexOf);
                        t4();
                        l5cVar.O(false);
                        ld9 ld9Var12 = this.R3;
                        if (ld9Var12 != null) {
                            ld9Var12.h();
                        }
                        post(new ce9(this, lk0Var4, (byte) 3));
                        return true;
                    }
                    boolean A3 = A3(lk0Var4.b);
                    ld9 ld9Var13 = this.R3;
                    byte b3 = 4;
                    if (A3) {
                        if (ld9Var13 != null) {
                            ld9Var13.d();
                        }
                        arrayList.remove(i6);
                        t4();
                        if (!(findFocus() instanceof mc9)) {
                            l5cVar.O(false);
                            ld9 ld9Var14 = this.R3;
                            if (ld9Var14 != null) {
                                ld9Var14.h();
                            }
                            post(new ce9(this, lk0Var, b3));
                            return true;
                        }
                        c5();
                        ld9 ld9Var15 = this.R3;
                        if (ld9Var15 != null) {
                            ld9Var15.h();
                            return true;
                        }
                    } else {
                        if (ld9Var13 != null) {
                            ld9Var13.d();
                        }
                        if (!L1(lk0Var4, lk0Var, indexOf)) {
                            View C14 = C1(lk0Var4);
                            ArrayList arrayList5 = this.x4;
                            int indexOf2 = arrayList5.indexOf(lk0Var);
                            if (!(C14 instanceof wi9) || indexOf2 < 0) {
                                SpannableStringBuilder z3 = wi9.z(lk0Var4.b);
                                int length2 = z3.length();
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z3);
                                spannableStringBuilder.append((CharSequence) wi9.z(lk0Var.b));
                                wi9.b(lk0Var4.b, spannableStringBuilder);
                                arrayList.remove(indexOf);
                                t2();
                                t4();
                                l5cVar.O(false);
                                ld9 ld9Var16 = this.R3;
                                if (ld9Var16 != null) {
                                    ld9Var16.h();
                                }
                                post(new ud9(this, lk0Var4, length2, (byte) 5));
                                return true;
                            }
                            wi9 wi9Var2 = (wi9) C14;
                            mc9 editText3 = wi9Var2.getEditText();
                            int length3 = editText3.length();
                            SpannableStringBuilder z4 = wi9.z(lk0Var.b);
                            Editable text3 = editText3.getText();
                            if (text3 != null && z4 != null && z4.length() != 0) {
                                editText3.i2 = true;
                                text3.append((CharSequence) z4);
                                editText3.i2 = false;
                            }
                            wi9.b(lk0Var4.b, editText3.getText());
                            View C15 = C1(lk0Var);
                            if (!(C15 instanceof wi9) || (text = (editText = ((wi9) C15).getEditText()).getText()) == null || text.length() <= 0) {
                                z2 = true;
                            } else {
                                editText.i2 = true;
                                z2 = true;
                                text.delete(0, text.length());
                                editText.i2 = false;
                            }
                            wi9Var2.A();
                            editText3.setSelection(Math.max(0, Math.min(length3, editText3.length())));
                            arrayList.remove(indexOf);
                            boolean t2 = t2();
                            t4();
                            if (t2) {
                                l5cVar.O(false);
                                ld9 ld9Var17 = this.R3;
                                if (ld9Var17 != null) {
                                    ld9Var17.h();
                                }
                                post(new ud9(this, lk0Var4, Math.max(0, length3), b3));
                                return z2;
                            }
                            l5cVar.T();
                            q4(indexOf);
                            b49 itemAnimator = getItemAnimator();
                            setItemAnimator(null);
                            l5cVar.r(indexOf2);
                            if ((lk0Var4.d > 0 || lk0Var.d > 0) && indexOf2 < arrayList5.size()) {
                                l5cVar.l(indexOf2, arrayList5.size() - indexOf2);
                            }
                            boolean z5 = z2;
                            post(new be9(this, itemAnimator, z5 ? (byte) 1 : (byte) 0));
                            ld9 ld9Var18 = this.R3;
                            if (ld9Var18 == null) {
                                return z5;
                            }
                            ld9Var18.h();
                            return z5;
                        }
                        ld9 ld9Var19 = this.R3;
                        if (ld9Var19 != null) {
                            ld9Var19.h();
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
    public final void U4(lk0 lk0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        lk0 lk0Var2;
        ld9 ld9Var;
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf >= 0) {
            ld9 ld9Var2 = this.R3;
            if (ld9Var2 != null) {
                ld9Var2.d();
            }
            lk0Var.b = pageBlock;
            lk0Var.c = i;
            lk0Var.d = i2;
            lk0Var.e = z;
            lk0Var.f = z2;
            t4();
            boolean z3 = pageBlock instanceof TL_iv.pageBlockTable;
            if (z3) {
                int i3 = indexOf + 1;
                if (i3 >= arrayList.size() || A3(((lk0) arrayList.get(i3)).b)) {
                    arrayList.add(i3, new lk0(new TL_iv.pageBlockParagraph(), 0, 0));
                }
            } else if (A3(pageBlock)) {
                if (z3(pageBlock) && lk0Var.g == null) {
                    lk0Var.g = new iy6();
                }
                int i4 = indexOf + 1;
                if (i4 >= arrayList.size() || A3(((lk0) arrayList.get(i4)).b)) {
                    lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                    arrayList.add(i4, lk0Var2);
                } else {
                    lk0Var2 = (lk0) arrayList.get(i4);
                }
                if (lk0Var2 == lk0Var || z3 || A3(pageBlock) || !(findFocus() instanceof mc9)) {
                    this.g3.O(false);
                    ld9Var = this.R3;
                    if (ld9Var != null) {
                        ld9Var.h();
                    }
                    post(new sd9(this, lk0Var2, (byte) 18));
                }
                T1();
                ld9 ld9Var3 = this.R3;
                if (ld9Var3 != null) {
                    ld9Var3.h();
                }
                View C1 = C1(lk0Var);
                if (C1 instanceof wi9) {
                    wi9 wi9Var = (wi9) C1;
                    wi9Var.A();
                    wi9Var.getEditText().setSelection(wi9Var.getEditText().length());
                    return;
                }
                return;
            }
            lk0Var2 = lk0Var;
            if (lk0Var2 == lk0Var) {
            }
            this.g3.O(false);
            ld9Var = this.R3;
            if (ld9Var != null) {
            }
            post(new sd9(this, lk0Var2, (byte) 18));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V1() {
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
            lk0 lk0Var = (lk0) arrayList6.get(i6);
            ArrayList arrayList7 = lk0Var.j;
            ArrayList arrayList8 = lk0Var.k;
            arrayList7.clear();
            int i7 = 1;
            if (lk0Var.i) {
                if (!arrayList.isEmpty()) {
                    tb4.v(1, arrayList);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
                i4 = i5;
            } else {
                for (int i8 = i5; i8 < arrayList8.size(); i8++) {
                    ((Long) arrayList8.get(i8)).getClass();
                    arrayList7.add(new wb9());
                }
                for (int i9 = i5; i9 < arrayList.size(); i9++) {
                    arrayList7.add((wb9) arrayList.get(i9));
                }
                int max = Math.max(i5, lk0Var.c);
                if (max == 0) {
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    int i10 = lk0Var.d > 0 ? 1 : i5;
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
                            arrayList2.add(Long.valueOf(wb9.a()));
                            arrayList3.add(Boolean.valueOf(i != 0 ? i10 : i2));
                            arrayList4.add(Integer.valueOf(i2));
                            arrayList5.add(0L);
                        }
                        ((Long) arrayList2.get(i12)).getClass();
                        if (i != 0) {
                            if (((Long) arrayList5.get(i12)).longValue() == 0 || !A3(lk0Var.b)) {
                                arrayList4.set(i12, Integer.valueOf(((Integer) arrayList4.get(i12)).intValue() + 1));
                                arrayList5.set(i12, Long.valueOf(lk0Var.a));
                            } else {
                                ((Integer) arrayList4.get(i12)).getClass();
                                ((Long) arrayList5.get(i12)).getClass();
                            }
                            arrayList7.add(new wb9());
                        } else {
                            ((Boolean) arrayList3.get(i12)).getClass();
                            arrayList7.add(new wb9());
                        }
                        i11++;
                        i5 = i2;
                        i7 = i3;
                    }
                }
                i4 = i5;
                if (t3(lk0Var)) {
                    boolean z = ((TL_iv.pageBlockDetails) lk0Var.b).open;
                    wb9.a();
                    arrayList.add(new wb9());
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (wi9.n(lk0Var.b)) {
                    wb9.a();
                    arrayList7.add(new wb9());
                }
            }
            i6++;
            i5 = i4;
        }
    }

    public final ArrayList V2() {
        return U2(0, this.t3.size(), 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V3(lk0 lk0Var, boolean z) {
        int i;
        ld9 ld9Var;
        int indexOf = this.t3.indexOf(lk0Var);
        if (indexOf >= 0) {
            View C1 = C1(lk0Var);
            if (C1 instanceof wi9) {
                wi9 wi9Var = (wi9) C1;
                if (wi9Var.getEditText().isFocused()) {
                    i = wi9Var.getEditText().getSelectionEnd();
                    ld9Var = this.R3;
                    if (ld9Var != null) {
                        ld9Var.d();
                    }
                    if (m3(indexOf, z, false)) {
                        t4();
                        if (findFocus() instanceof mc9) {
                            T1();
                        } else {
                            this.g3.O(false);
                        }
                        ld9 ld9Var2 = this.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.h();
                        }
                        if (i < 0) {
                            return true;
                        }
                        post(new ud9(this, lk0Var, i, (byte) 2));
                        return true;
                    }
                }
            }
            i = -1;
            ld9Var = this.R3;
            if (ld9Var != null) {
            }
            if (m3(indexOf, z, false)) {
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
    public final boolean V4() {
        ii9 ii9Var;
        int[] e5;
        int[] e52;
        ArrayList arrayList;
        boolean z;
        int length;
        tb9 tb9Var;
        wi9 wi9Var;
        int m;
        if (this.t3.isEmpty()) {
            return false;
        }
        me9 me9Var = this.v3;
        boolean w = me9Var.w();
        SparseIntArray sparseIntArray = me9Var.y0;
        kya kyaVar = me9Var.m0;
        eib eibVar = null;
        if (w) {
            int i = me9Var.p0;
            if (i == me9Var.s0) {
                View C4 = C4(i);
                if ((C4 instanceof ii9) && (((e5 = e5((ii9Var = (ii9) C4))) == null || me9Var.q0 != 0 || me9Var.r0 != 0 || me9Var.t0 != e5[0] || me9Var.u0 != e5[1]) && (e52 = e5(ii9Var)) != null)) {
                    int i2 = e52[0];
                    int i3 = e52[1];
                    ArrayList arrayList2 = me9Var.A0;
                    int c0 = me9Var.c0(ii9Var);
                    if (c0 >= 0 && (i2 != 0 || i3 != 0)) {
                        me9Var.W = ii9Var;
                        me9Var.s0 = c0;
                        me9Var.p0 = c0;
                        me9Var.q0 = 0;
                        me9Var.t0 = i2;
                        me9Var.r0 = 0;
                        me9Var.u0 = i3;
                        me9Var.u = 0;
                        me9Var.v = i3;
                        me9Var.B0 = c0;
                        me9Var.D0 = 0;
                        me9Var.C0 = 0;
                        me9Var.g0(ii9Var, c0);
                        arrayList2.clear();
                        ii9Var.k(arrayList2);
                        if (!arrayList2.isEmpty() && arrayList2.size() > 0) {
                            me9Var.a = ((pib) arrayList2.get(0)).getX();
                            me9Var.b = ((pib) arrayList2.get(0)).getY();
                        } else if (!arrayList2.isEmpty()) {
                            me9Var.a = ((pib) arrayList2.get(0)).getX();
                            me9Var.b = ((pib) arrayList2.get(0)).getY();
                        }
                        qib qibVar = me9Var.C;
                        if (qibVar != null) {
                            qibVar.setVisibility(0);
                        }
                        me9Var.S();
                        me9Var.v();
                        me9Var.t();
                        gl.r(kyaVar);
                        gl.c3(kyaVar);
                        ive iveVar = me9Var.D;
                        if (iveVar != null) {
                            iveVar.a(true);
                        }
                        ii9Var.invalidate();
                        return true;
                    }
                }
            }
        } else {
            mc9 L2 = L2();
            if (L2 != 0 && L2.getText() != null && (length = L2.getText().length()) > 0) {
                ii9 Q2 = Q2(L2);
                if (Q2 != null) {
                    if (L2 == Q2.getTitleEditText()) {
                        m = 0;
                    } else {
                        li9 q = Q2.q(L2);
                        m = q != null ? Q2.m(q.b) : -1;
                    }
                    if (m >= 0) {
                        L2.setSelection(L2.getSelectionEnd());
                        z = me9Var.i0(Q2, m, 0, length);
                    }
                } else {
                    if (!(L2 instanceof tb9)) {
                        ViewParent parent = L2.getParent();
                        while (true) {
                            if (parent == null) {
                                tb9Var = null;
                                break;
                            }
                            if (parent instanceof tb9) {
                                tb9Var = (tb9) parent;
                                break;
                            }
                            parent = parent.getParent();
                        }
                    } else {
                        tb9Var = (tb9) L2;
                    }
                    if (tb9Var instanceof eib) {
                        L2.setSelection(L2.getSelectionEnd());
                        z = me9Var.i0((eib) tb9Var, 0, 0, length);
                    } else {
                        ViewParent parent2 = L2.getParent();
                        while (true) {
                            if (parent2 == null) {
                                wi9Var = null;
                                break;
                            }
                            if (parent2 instanceof wi9) {
                                wi9Var = (wi9) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (wi9Var != null) {
                            int i4 = L2 == wi9Var.getAuthorEditText() ? 1 : 0;
                            L2.setSelection(L2.getSelectionEnd());
                            z = me9Var.i0(wi9Var, i4, 0, length);
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
            lk0 lk0Var = (lk0) arrayList.get(i5);
            long j = lk0Var.t;
            if (j != 0) {
                me9Var.W(i5, yi9.l((TL_iv.RichText) this.u3.get(Long.valueOf(j))));
            } else {
                me9Var.W(i5, wi9.y(lk0Var.b));
                if (wi9.n(lk0Var.b)) {
                    String l = yi9.l(wi9.h(lk0Var.b));
                    if (!l.isEmpty()) {
                        me9Var.w0.put(65536 + i5, fib.X(l));
                        sparseIntArray.put(i5, Math.max(2, sparseIntArray.get(i5)));
                    }
                }
            }
            i5++;
        }
        int size = arrayList.size() - 1;
        lk0 lk0Var2 = (lk0) arrayList.get(size);
        String l2 = (lk0Var2.t == 0 && wi9.n(lk0Var2.b)) ? yi9.l(wi9.h(lk0Var2.b)) : "";
        if (l2.isEmpty()) {
            me9Var.h0(0, size);
            return true;
        }
        int length2 = l2.length();
        if (size >= 0) {
            if (me9Var.F != null) {
                int i6 = 0;
                while (true) {
                    if (i6 >= me9Var.F.getChildCount()) {
                        break;
                    }
                    KeyEvent.Callback childAt = me9Var.F.getChildAt(i6);
                    if (childAt instanceof eib) {
                        eib eibVar2 = (eib) childAt;
                        if (me9Var.c0(eibVar2) == size) {
                            eibVar = eibVar2;
                            break;
                        }
                    }
                    i6++;
                }
            }
            me9Var.W = eibVar;
            me9Var.u = 0;
            me9Var.v = length2;
            me9Var.p0 = 0;
            me9Var.s0 = size;
            me9Var.q0 = 0;
            me9Var.t0 = 1;
            me9Var.r0 = 0;
            me9Var.u0 = length2;
            sparseIntArray.put(0, Math.max(1, sparseIntArray.get(0)));
            sparseIntArray.put(size, Math.max(2, sparseIntArray.get(size)));
            me9Var.B0 = 0;
            me9Var.D0 = 0;
            me9Var.C0 = 0;
            qib qibVar2 = me9Var.C;
            if (qibVar2 != null) {
                qibVar2.setVisibility(0);
            }
            me9Var.S();
            me9Var.v();
            me9Var.t();
            gl.r(kyaVar);
            gl.c3(kyaVar);
            ive iveVar2 = me9Var.D;
            if (iveVar2 != null) {
                iveVar2.a(true);
            }
        }
        return true;
    }

    public final void W1(k27 k27Var) {
        TLRPC.Document F0;
        if (k27Var == null || (F0 = k27Var.F0()) == null) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        lk0 lk0Var = new lk0(pageblockaudio, 0, 0);
        iy6 iy6Var = new iy6();
        lk0Var.g = iy6Var;
        iy6Var.c = true;
        long j = F0.id;
        boolean z = j == 0 || F0.dc_id == 0 || F0.access_hash == 0;
        if (z) {
            TLRPC.Message message = k27Var.k;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            iy6 iy6Var2 = lk0Var.g;
            iy6Var2.i = F0;
            iy6Var2.e = str;
            iy6Var2.a = (byte) 1;
            iy6Var2.f = 0.0f;
        } else {
            iy6Var.h = F0;
            iy6Var.i = F0;
            iy6Var.a = (byte) 2;
            pageblockaudio.audio_id = j;
        }
        q3(lk0Var);
        if (z) {
            iy6 iy6Var3 = lk0Var.g;
            String str2 = iy6Var3.e;
            IdentityHashMap identityHashMap = this.h4;
            bg9 bg9Var = (bg9) identityHashMap.remove(iy6Var3);
            if (bg9Var != null) {
                bg9Var.b();
            }
            bg9 bg9Var2 = new bg9(this.n3, str2, F0, new ke9(this, iy6Var3, lk0Var));
            identityHashMap.put(iy6Var3, bg9Var2);
            bg9Var2.d();
        }
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        this.p3.onContentChanged();
    }

    public final boolean W2() {
        ArrayList arrayList = this.t3;
        lk0 lk0Var = arrayList.isEmpty() ? null : (lk0) b00.f(1, arrayList);
        if (lk0Var != null && !A3(lk0Var.b) && !lk0Var.i && !t3(lk0Var) && !G2(lk0Var.b)) {
            if (!(C1(lk0Var) instanceof wi9)) {
                return false;
            }
            a3(lk0Var);
            return true;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(lk0Var2);
        this.g3.O(false);
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        post(new sd9(this, lk0Var2, (byte) 21));
        return true;
    }

    public final void W3() {
        if (this.Q3) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.h();
        }
        this.p3.e();
        p4();
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
    public final boolean W4(View view, float f, float f2) {
        int lineForVertical;
        int lineForVertical2;
        li9 m;
        int lineForVertical3;
        if (view != 0) {
            me9 me9Var = this.v3;
            if (!me9Var.w()) {
                int left = (int) ((f - view.getLeft()) - getLeft());
                int top = (int) ((f2 - view.getTop()) - getTop());
                if (view instanceof wi9) {
                    wi9 wi9Var = (wi9) view;
                    mc9 mc9Var = wi9Var.h;
                    mc9 mc9Var2 = wi9Var.f;
                    LinearLayout linearLayout = wi9Var.b;
                    if (wi9.x(mc9Var2, mc9Var2.getLeft() + linearLayout.getLeft(), mc9Var2.getTop() + linearLayout.getTop(), left, top) || (mc9Var.getVisibility() == 0 && wi9.x(mc9Var, mc9Var.getLeft(), mc9Var.getTop(), left, top))) {
                        me9Var.j0(wi9Var, left, top);
                        me9Var.k0();
                        return true;
                    }
                } else if (view instanceof ii9) {
                    ii9 ii9Var = (ii9) view;
                    hi9 hi9Var = ii9Var.x;
                    cf9 cf9Var = ii9Var.s;
                    ki9 ki9Var = ii9Var.w;
                    TL_iv.pageTableCell o = ii9Var.o(left, top);
                    if (o != null && (m = ki9Var.m(o)) != null) {
                        mc9 mc9Var3 = m.a;
                        int scrollX = cf9Var.getScrollX() + (((left - cf9Var.getLeft()) - hi9Var.getLeft()) - ki9Var.getLeft());
                        int top2 = ((top - cf9Var.getTop()) - hi9Var.getTop()) - ki9Var.getTop();
                        int left2 = (scrollX - m.getLeft()) - mc9Var3.getLeft();
                        int top3 = (top2 - m.getTop()) - mc9Var3.getTop();
                        Layout layout = mc9Var3.getLayout();
                        if (layout != null) {
                            int paddingTop = top3 - mc9Var3.getPaddingTop();
                            int paddingLeft = left2 - mc9Var3.getPaddingLeft();
                            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical3 = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical3 < layout.getLineCount()) {
                                float lineLeft = layout.getLineLeft(lineForVertical3);
                                float lineRight = layout.getLineRight(lineForVertical3);
                                float f3 = paddingLeft;
                                if (f3 >= lineLeft) {
                                }
                            }
                        }
                    }
                    mc9 mc9Var4 = ii9Var.r;
                    Layout layout2 = mc9Var4.getLayout();
                    if (layout2 != null) {
                        int paddingLeft2 = left - (mc9Var4.getPaddingLeft() + mc9Var4.getLeft());
                        int paddingTop2 = top - (mc9Var4.getPaddingTop() + mc9Var4.getTop());
                        if (paddingTop2 >= 0 && paddingTop2 < layout2.getHeight() && (lineForVertical2 = layout2.getLineForVertical(paddingTop2)) >= 0 && lineForVertical2 < layout2.getLineCount()) {
                            float f4 = paddingLeft2;
                            if (f4 >= layout2.getLineLeft(lineForVertical2)) {
                            }
                        }
                    }
                } else if (view instanceof tb9) {
                    if (((tb9) view).a(left, top)) {
                        me9Var.j0(view, left, top);
                        me9Var.k0();
                        return true;
                    }
                } else if (view instanceof ac9) {
                    ac9 ac9Var = (ac9) view;
                    mc9 mc9Var5 = ac9Var.d;
                    Layout layout3 = mc9Var5.getLayout();
                    if (layout3 != null && mc9Var5.length() != 0) {
                        int paddingLeft3 = left - (mc9Var5.getPaddingLeft() + mc9Var5.getLeft());
                        int paddingTop3 = top - (mc9Var5.getPaddingTop() + mc9Var5.getTop());
                        if (paddingTop3 >= 0 && paddingTop3 < layout3.getHeight() && (lineForVertical = layout3.getLineForVertical(paddingTop3)) >= 0 && lineForVertical < layout3.getLineCount()) {
                            int L = gl.L(24.0f);
                            int max = Math.max(0, (mc9Var5.getWidth() - mc9Var5.getPaddingLeft()) - mc9Var5.getPaddingRight());
                            float f5 = L;
                            float max2 = Math.max(0.0f, layout3.getLineLeft(lineForVertical) - f5);
                            float min = Math.min(max, layout3.getLineRight(lineForVertical) + f5);
                            float f6 = paddingLeft3;
                            if (f6 >= max2 && f6 <= min) {
                                me9Var.j0(ac9Var, left, top);
                                me9Var.k0();
                                return true;
                            }
                        }
                    }
                } else if (view instanceof rf9) {
                    rf9 rf9Var = (rf9) view;
                    if (rf9Var.x != null) {
                        int[] iArr = new int[4];
                        rf9Var.h(iArr);
                        if (left >= iArr[0] && left <= iArr[2] && top >= iArr[1] && top <= iArr[3]) {
                            me9Var.j0(view, left, top);
                            me9Var.k0();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void X1(String str) {
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
            Y1(tL_document, str);
        }
    }

    public final void X2(lk0 lk0Var, boolean z) {
        View C1 = C1(lk0Var);
        if (!(C1 instanceof ai9)) {
            Y2(lk0Var, z);
            return;
        }
        mc9 mc9Var = ((ai9) C1).r;
        mc9Var.O();
        mc9Var.setSelection(z ? mc9Var.length() : 0);
    }

    public final void X3() {
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
        mc9 Q4;
        int length5;
        int g5;
        int A6;
        boolean H3 = H3();
        me9 me9Var = this.v3;
        if (H3) {
            int i = me9Var.p0;
            int i2 = me9Var.q0;
            if (i2 != me9Var.t0 || (Q4 = Q4(i, i2)) == null || (g5 = de9.g(me9Var.r0, me9Var.u0, (length5 = Q4.length()), 0)) >= (A6 = ls6.A(me9Var.r0, me9Var.u0, length5, 0))) {
                return;
            }
            ld9 ld9Var = this.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            if (yi9.h(Q4.getText(), g5, A6)) {
                yi9.n(Q4.getText(), g5, A6);
                Q4.f();
                g4(i, i2);
                ld9 ld9Var2 = this.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
                p4();
            }
            Q4.U1 = g5;
            Q4.V1 = A6;
            Q4.C();
            return;
        }
        if (u3()) {
            int i3 = me9Var.p0;
            mc9 E2 = E2(i3);
            if (E2 == null || (g4 = de9.g(me9Var.r0, me9Var.u0, (length4 = E2.length()), 0)) >= (A5 = ls6.A(me9Var.r0, me9Var.u0, length4, 0))) {
                return;
            }
            ld9 ld9Var3 = this.R3;
            if (ld9Var3 != null) {
                ld9Var3.d();
            }
            if (yi9.h(E2.getText(), g4, A5)) {
                yi9.n(E2.getText(), g4, A5);
                E2.f();
                e4(i3);
                ld9 ld9Var4 = this.R3;
                if (ld9Var4 != null) {
                    ld9Var4.h();
                }
                p4();
            }
            E2.U1 = g4;
            E2.V1 = A5;
            E2.C();
            return;
        }
        if (s3()) {
            int i4 = me9Var.p0;
            mc9 o2 = o2(i4);
            if (o2 == null || (g3 = de9.g(me9Var.r0, me9Var.u0, (length3 = o2.length()), 0)) >= (A3 = ls6.A(me9Var.r0, me9Var.u0, length3, 0))) {
                return;
            }
            ld9 ld9Var5 = this.R3;
            if (ld9Var5 != null) {
                ld9Var5.d();
            }
            if (yi9.h(o2.getText(), g3, A3)) {
                yi9.n(o2.getText(), g3, A3);
                o2.f();
                d4(i4);
                ld9 ld9Var6 = this.R3;
                if (ld9Var6 != null) {
                    ld9Var6.h();
                }
                p4();
            }
            o2.U1 = g3;
            o2.V1 = A3;
            o2.C();
            return;
        }
        if (C3()) {
            int i5 = me9Var.p0;
            mc9 k4 = k4(i5);
            if (k4 == null || (g2 = de9.g(me9Var.r0, me9Var.u0, (length2 = k4.length()), 0)) >= (A2 = ls6.A(me9Var.r0, me9Var.u0, length2, 0))) {
                return;
            }
            ld9 ld9Var7 = this.R3;
            if (ld9Var7 != null) {
                ld9Var7.d();
            }
            if (yi9.h(k4.getText(), g2, A2)) {
                yi9.n(k4.getText(), g2, A2);
                k4.f();
                f4(i5);
                ld9 ld9Var8 = this.R3;
                if (ld9Var8 != null) {
                    ld9Var8.h();
                }
                p4();
            }
            k4.U1 = g2;
            k4.V1 = A2;
            k4.C();
            return;
        }
        wi9 I4 = I4();
        if (I4 == null || (g = de9.g(me9Var.r0, me9Var.u0, (length = I4.getEditText().length()), 0)) >= (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
            return;
        }
        ld9 ld9Var9 = this.R3;
        if (ld9Var9 != null) {
            ld9Var9.d();
        }
        if (yi9.h(I4.getEditText().getText(), g, A)) {
            yi9.n(I4.getEditText().getText(), g, A);
            I4.getEditText().f();
            I4.w();
            ld9 ld9Var10 = this.R3;
            if (ld9Var10 != null) {
                ld9Var10.h();
            }
            p4();
        }
        mc9 editText = I4.getEditText();
        editText.U1 = g;
        editText.V1 = A;
        I4.getEditText().C();
    }

    public final void X4(lk0 lk0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        if (lk0Var == null) {
            lk0Var = a5();
        }
        lk0 lk0Var2 = lk0Var;
        if (lk0Var2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.t3;
        if (arrayList.indexOf(lk0Var2) < 0 || t3(lk0Var2) || lk0Var2.i) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = lk0Var2.b;
        if (pageBlock != pageBlock2 && w3(pageBlock2) && w3(pageBlock)) {
            wi9 q2 = q2(arrayList.indexOf(lk0Var2));
            wi9.b(pageBlock, q2 != null ? q2.getEditText().getText() : wi9.z(lk0Var2.b));
            TL_iv.RichText h = wi9.h(lk0Var2.b);
            if (h != null && wi9.h(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = h;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = h;
                }
            }
        }
        U4(lk0Var2, pageBlock, i, i2, z, z2);
    }

    public final void Y1(TLRPC.Document document, String str) {
        if (document != null) {
            ld9 ld9Var = this.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            lk0 lk0Var = new lk0(pageblockdocument, 0, 0);
            iy6 iy6Var = new iy6();
            lk0Var.g = iy6Var;
            iy6Var.d = true;
            long j = document.id;
            boolean z = j == 0 || document.dc_id == 0 || document.access_hash == 0;
            if (!z) {
                iy6Var.h = document;
                iy6Var.a = (byte) 2;
                pageblockdocument.document_id = j;
            } else {
                if (TextUtils.isEmpty(str) || !oo1.t(str)) {
                    return;
                }
                iy6 iy6Var2 = lk0Var.g;
                iy6Var2.h = document;
                iy6Var2.e = str;
                iy6Var2.a = (byte) 1;
                iy6Var2.f = 0.0f;
            }
            q3(lk0Var);
            if (z) {
                iy6 iy6Var3 = lk0Var.g;
                IdentityHashMap identityHashMap = this.h4;
                bg9 bg9Var = (bg9) identityHashMap.remove(iy6Var3);
                if (bg9Var != null) {
                    bg9Var.b();
                }
                bg9 bg9Var2 = new bg9(this.n3, str, document, new je9(this, iy6Var3, lk0Var, str));
                identityHashMap.put(iy6Var3, bg9Var2);
                bg9Var2.d();
            }
            ld9 ld9Var2 = this.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            this.p3.onContentChanged();
        }
    }

    public final void Y2(lk0 lk0Var, boolean z) {
        View C1 = C1(lk0Var);
        if (!(C1 instanceof ii9)) {
            if (z && (C1 instanceof wi9)) {
                wi9 wi9Var = (wi9) C1;
                if (wi9Var.l()) {
                    wi9Var.f();
                    return;
                }
            }
            mc9 O3 = O3(C1);
            if (O3 == null) {
                Z2(lk0Var);
                return;
            }
            O3.O();
            if (z) {
                O3.setSelection(O3.length());
                return;
            }
            return;
        }
        ii9 ii9Var = (ii9) C1;
        mc9 mc9Var = ii9Var.r;
        ffb ffbVar = ii9Var.G;
        if (ffbVar != null) {
            if (!z) {
                mc9Var.O();
                mc9Var.setSelection(0);
            } else {
                if (ffbVar.g.isEmpty()) {
                    return;
                }
                li9 m = ii9Var.w.m((TL_iv.pageTableCell) b00.f(1, ii9Var.G.g));
                if (m != null) {
                    mc9 mc9Var2 = m.a;
                    mc9Var2.O();
                    mc9Var2.setSelection(mc9Var2.length());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y3(int i) {
        ld9 ld9Var;
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
        ld9 ld9Var2;
        int i4;
        me9 me9Var = this.v3;
        if (me9Var == null || !me9Var.w()) {
            return;
        }
        boolean H3 = H3();
        we9 we9Var = this.p3;
        int i5 = 0;
        if (H3) {
            int i6 = me9Var.p0;
            int i7 = me9Var.q0;
            int i8 = me9Var.t0;
            int i9 = me9Var.r0;
            int i10 = me9Var.u0;
            boolean G3 = G3(i, i6, i7, i9, i8, i10);
            int s2 = !G3 ? s2(i) : 0;
            ld9 ld9Var3 = this.R3;
            if (ld9Var3 != null) {
                ld9Var3.d();
            }
            this.Q3 = true;
            int i11 = i7;
            boolean z2 = false;
            while (i11 <= i8) {
                mc9 Q4 = Q4(i6, i11);
                if (Q4 == null) {
                    i4 = i7;
                } else {
                    int length4 = Q4.length();
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
                        if (G3) {
                            Q4.b(i, max, max2);
                        } else {
                            if (s2 != 0) {
                                Q4.b(s2, max, max2);
                            }
                            Q4.a(i, max, max2);
                        }
                        Q4.f();
                        Q4.requestLayout();
                        g4(i6, i11);
                        z2 = true;
                    }
                }
                i11++;
                i7 = i4;
            }
            this.Q3 = false;
            if (z2 && (ld9Var2 = this.R3) != null) {
                ld9Var2.h();
            }
            we9Var.e();
            if (z2) {
                p4();
                return;
            }
            return;
        }
        if (u3()) {
            int i15 = me9Var.p0;
            mc9 E2 = E2(i15);
            if (E2 == null || (g3 = de9.g(me9Var.r0, me9Var.u0, (length3 = E2.length()), 0)) >= (A3 = ls6.A(me9Var.r0, me9Var.u0, length3, 0))) {
                return;
            }
            boolean z3 = (E2.c(g3, A3) & i) == 0;
            ld9 ld9Var4 = this.R3;
            if (ld9Var4 != null) {
                ld9Var4.d();
            }
            this.Q3 = true;
            if (z3) {
                int s22 = s2(i);
                if (s22 != 0) {
                    E2.b(s22, g3, A3);
                }
                E2.a(i, g3, A3);
            } else {
                E2.b(i, g3, A3);
            }
            this.Q3 = false;
            e4(i15);
            E2.f();
            E2.requestLayout();
            ld9 ld9Var5 = this.R3;
            if (ld9Var5 != null) {
                ld9Var5.h();
            }
            we9Var.e();
            p4();
            return;
        }
        if (s3()) {
            int i16 = me9Var.p0;
            mc9 o2 = o2(i16);
            if (o2 == null || (g2 = de9.g(me9Var.r0, me9Var.u0, (length2 = o2.length()), 0)) >= (A2 = ls6.A(me9Var.r0, me9Var.u0, length2, 0))) {
                return;
            }
            boolean z4 = (o2.c(g2, A2) & i) == 0;
            int s23 = z4 ? s2(i) : 0;
            ld9 ld9Var6 = this.R3;
            if (ld9Var6 != null) {
                ld9Var6.d();
            }
            this.Q3 = true;
            if (z4) {
                if (s23 != 0) {
                    o2.b(s23, g2, A2);
                }
                o2.a(i, g2, A2);
            } else {
                o2.b(i, g2, A2);
            }
            o2.f();
            o2.requestLayout();
            d4(i16);
            this.Q3 = false;
            ld9 ld9Var7 = this.R3;
            if (ld9Var7 != null) {
                ld9Var7.h();
            }
            we9Var.e();
            p4();
            return;
        }
        boolean C3 = C3();
        int i17 = me9Var.p0;
        if (C3) {
            mc9 k4 = k4(i17);
            if (k4 == null || (g = de9.g(me9Var.r0, me9Var.u0, (length = k4.length()), 0)) >= (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
                return;
            }
            boolean z5 = (k4.c(g, A) & i) == 0;
            int s24 = z5 ? s2(i) : 0;
            ld9 ld9Var8 = this.R3;
            if (ld9Var8 != null) {
                ld9Var8.d();
            }
            this.Q3 = true;
            if (z5) {
                if (s24 != 0) {
                    k4.b(s24, g, A);
                }
                k4.a(i, g, A);
            } else {
                k4.b(i, g, A);
            }
            k4.f();
            k4.requestLayout();
            f4(i17);
            this.Q3 = false;
            ld9 ld9Var9 = this.R3;
            if (ld9Var9 != null) {
                ld9Var9.h();
            }
            we9Var.e();
            p4();
            return;
        }
        int i18 = me9Var.s0;
        int i19 = me9Var.r0;
        int i20 = me9Var.u0;
        if (i17 < 0 || i18 < 0 || i18 < i17 || i18 >= this.x4.size()) {
            return;
        }
        int i21 = i;
        boolean F3 = F3(i21, i17, i19, i18, i20);
        boolean z6 = !F3;
        int s25 = !F3 ? s2(i21) : 0;
        ld9 ld9Var10 = this.R3;
        if (ld9Var10 != null) {
            ld9Var10.d();
        }
        this.Q3 = true;
        boolean z7 = false;
        int i22 = i17;
        while (i22 <= i18) {
            lk0 A42 = A4(i22);
            if (A42 != null) {
                TL_iv.PageBlock pageBlock = A42.b;
                if (w3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                    int d2 = d2(i22);
                    int i23 = i22 == i17 ? i19 : i5;
                    z = z7;
                    int i24 = i22 == i18 ? i20 : d2;
                    int max3 = Math.max(i5, Math.min(i23, d2));
                    int max4 = Math.max(i5, Math.min(i24, d2));
                    if (max3 >= max4) {
                        i2 = s25;
                        z7 = z;
                        i22++;
                        i21 = i;
                        s25 = i2;
                        i5 = 0;
                    } else {
                        wi9 q2 = q2(i22);
                        if (q2 != null) {
                            fk4 styleDelegate = q2.getStyleDelegate();
                            if (F3) {
                                styleDelegate.b(i21, max3, max4);
                            } else {
                                if (s25 != 0) {
                                    styleDelegate.b(s25, max3, max4);
                                }
                                styleDelegate.a(i21, max3, max4);
                            }
                            q2.getEditText().f();
                            q2.getEditText().requestLayout();
                            q2.w();
                            i2 = s25;
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wi9.z(A42.b));
                            if (F3 || s25 == 0) {
                                i2 = s25;
                                spannableStringBuilder = spannableStringBuilder2;
                                i3 = max3;
                            } else {
                                i2 = s25;
                                i3 = max3;
                                yi9.o(spannableStringBuilder2, i3, max4, i2, false, null);
                                spannableStringBuilder = spannableStringBuilder2;
                            }
                            yi9.o(spannableStringBuilder, i3, max4, i21, z6, null);
                            wi9.b(A42.b, spannableStringBuilder);
                        }
                        z7 = true;
                        i22++;
                        i21 = i;
                        s25 = i2;
                        i5 = 0;
                    }
                }
            }
            i2 = s25;
            z = z7;
            z7 = z;
            i22++;
            i21 = i;
            s25 = i2;
            i5 = 0;
        }
        boolean z8 = z7;
        this.Q3 = i5;
        if (z8 && (ld9Var = this.R3) != null) {
            ld9Var.h();
        }
        we9Var.e();
        if (z8) {
            p4();
        }
    }

    public final void Y4(lk0 lk0Var, TL_iv.PageBlock pageBlock) {
        if (lk0Var == null) {
            lk0Var = a5();
        }
        lk0 lk0Var2 = lk0Var;
        if (lk0Var2 == null) {
            return;
        }
        X4(lk0Var2, pageBlock, lk0Var2.c, lk0Var2.d, lk0Var2.e, lk0Var2.f);
    }

    public final void Z1(Uri uri) {
        if (uri != null) {
            lk0 lk0Var = this.j4;
            String str = null;
            this.j4 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            String str2 = str;
            boolean startsWith = str2 != null ? str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) : uri.toString().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
            int i = this.z4;
            this.z4 = i - 1;
            Utilities.e.c(new m05(this, uri, startsWith, str2, i, lk0Var));
        }
    }

    public final void Z2(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        if (C1 instanceof wi9) {
            ((wi9) C1).A();
        } else if (C1 instanceof ac9) {
            ((ac9) C1).d.O();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z3(View view) {
        ye9 ye9Var;
        mc9 editText;
        mc9 mc9Var;
        xe9 xe9Var = null;
        if (g2()) {
            boolean H3 = H3();
            me9 me9Var = this.v3;
            if (H3) {
                int i = me9Var.p0;
                int i2 = me9Var.q0;
                if (i2 == me9Var.t0) {
                    editText = Q4(i, i2);
                    mc9Var = editText;
                    if (mc9Var != null) {
                        int length = mc9Var.length();
                        ye9Var = this;
                        xe9Var = new xe9(ye9Var, mc9Var, de9.g(me9Var.r0, me9Var.u0, length, 0), ls6.A(me9Var.r0, me9Var.u0, length, 0), null);
                    }
                }
            } else {
                if (u3()) {
                    editText = E2(me9Var.p0);
                } else if (s3()) {
                    editText = o2(me9Var.p0);
                } else if (C3()) {
                    editText = k4(me9Var.p0);
                } else {
                    wi9 I4 = I4();
                    if (I4 != null) {
                        editText = I4.getEditText();
                    }
                }
                mc9Var = editText;
                if (mc9Var != null) {
                }
            }
            if (xe9Var == null) {
                ye9Var.k3(false);
                ye9Var.p3.B(xe9Var, view);
                return;
            }
            return;
        }
        ye9Var = this;
        if (xe9Var == null) {
        }
    }

    public final void Z4(lk0 lk0Var, int i) {
        if (lk0Var == null) {
            lk0Var = a5();
        }
        lk0 lk0Var2 = lk0Var;
        if (lk0Var2 == null) {
            return;
        }
        if (i == 0) {
            X4(lk0Var2, lk0Var2.b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, lk0Var2.c);
        int max2 = i == 2 ? Math.max(1, lk0Var2.d) : 0;
        boolean z = i == 3;
        TL_iv.PageBlock pageBlock = lk0Var2.b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        X4(lk0Var2, pageBlock, max, max2, z, z && lk0Var2.f);
    }

    public final void a2(jm6 jm6Var) {
        ye9 ye9Var;
        String str = jm6Var.h;
        if (str == null) {
            str = jm6Var.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        boolean c = xf9.c(jm6Var);
        lk0 lk0Var = new lk0((jm6Var.b || c) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        lk0Var.g = Q3(jm6Var, str2);
        q3(lk0Var);
        iy6 iy6Var = lk0Var.g;
        if (c) {
            N4(lk0Var, iy6Var, jm6Var);
            ye9Var = this;
        } else {
            ye9Var = this;
            ye9Var.O4(lk0Var, iy6Var, str2, jm6Var.b, jm6Var.F, jm6Var.G, jm6Var.E);
        }
        ld9 ld9Var2 = ye9Var.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        ye9Var.p3.onContentChanged();
    }

    public final void a3(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        if (C1 instanceof wi9) {
            wi9 wi9Var = (wi9) C1;
            wi9Var.A();
            mc9 editText = wi9Var.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (C1 instanceof ac9) {
            ac9 ac9Var = (ac9) C1;
            ac9Var.d.O();
            mc9 editText2 = ac9Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void a4() {
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
        mc9 Q4;
        int length5;
        int g5;
        int A6;
        boolean H3 = H3();
        we9 we9Var = this.p3;
        me9 me9Var = this.v3;
        if (H3) {
            int i = me9Var.p0;
            int i2 = me9Var.q0;
            if (i2 != me9Var.t0 || (Q4 = Q4(i, i2)) == null || (g5 = de9.g(me9Var.r0, me9Var.u0, (length5 = Q4.length()), 0)) >= (A6 = ls6.A(me9Var.r0, me9Var.u0, length5, 0))) {
                return;
            }
            boolean h = yi9.h(Q4.getText(), g5, A6);
            ld9 ld9Var = this.R3;
            if (h) {
                if (ld9Var != null) {
                    ld9Var.d();
                }
                yi9.n(Q4.getText(), g5, A6);
                Q4.f();
                g4(i, i2);
                ld9 ld9Var2 = this.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
                we9Var.e();
                p4();
                return;
            }
            if (ld9Var != null) {
                ld9Var.d();
            }
            if (yi9.g(Q4.getText(), g5, A6)) {
                yi9.m(Q4.getText(), g5, A6);
                Q4.f();
                g4(i, i2);
                ld9 ld9Var3 = this.R3;
                if (ld9Var3 != null) {
                    ld9Var3.h();
                }
                p4();
            }
            Q4.U1 = g5;
            Q4.V1 = A6;
            k3(false);
            G4(Q4);
            return;
        }
        if (u3()) {
            int i3 = me9Var.p0;
            mc9 E2 = E2(i3);
            if (E2 == null || (g4 = de9.g(me9Var.r0, me9Var.u0, (length4 = E2.length()), 0)) >= (A5 = ls6.A(me9Var.r0, me9Var.u0, length4, 0))) {
                return;
            }
            boolean h2 = yi9.h(E2.getText(), g4, A5);
            ld9 ld9Var4 = this.R3;
            if (h2) {
                if (ld9Var4 != null) {
                    ld9Var4.d();
                }
                yi9.n(E2.getText(), g4, A5);
                E2.f();
                e4(i3);
                ld9 ld9Var5 = this.R3;
                if (ld9Var5 != null) {
                    ld9Var5.h();
                }
                we9Var.e();
                p4();
                return;
            }
            if (ld9Var4 != null) {
                ld9Var4.d();
            }
            if (yi9.g(E2.getText(), g4, A5)) {
                yi9.m(E2.getText(), g4, A5);
                E2.f();
                e4(i3);
                ld9 ld9Var6 = this.R3;
                if (ld9Var6 != null) {
                    ld9Var6.h();
                }
                p4();
            }
            E2.U1 = g4;
            E2.V1 = A5;
            k3(false);
            G4(E2);
            return;
        }
        if (s3()) {
            int i4 = me9Var.p0;
            mc9 o2 = o2(i4);
            if (o2 == null || (g3 = de9.g(me9Var.r0, me9Var.u0, (length3 = o2.length()), 0)) >= (A3 = ls6.A(me9Var.r0, me9Var.u0, length3, 0))) {
                return;
            }
            boolean h3 = yi9.h(o2.getText(), g3, A3);
            ld9 ld9Var7 = this.R3;
            if (h3) {
                if (ld9Var7 != null) {
                    ld9Var7.d();
                }
                yi9.n(o2.getText(), g3, A3);
                o2.f();
                d4(i4);
                ld9 ld9Var8 = this.R3;
                if (ld9Var8 != null) {
                    ld9Var8.h();
                }
                we9Var.e();
                p4();
                return;
            }
            if (ld9Var7 != null) {
                ld9Var7.d();
            }
            if (yi9.g(o2.getText(), g3, A3)) {
                yi9.m(o2.getText(), g3, A3);
                o2.f();
                d4(i4);
                ld9 ld9Var9 = this.R3;
                if (ld9Var9 != null) {
                    ld9Var9.h();
                }
                p4();
            }
            o2.U1 = g3;
            o2.V1 = A3;
            k3(false);
            G4(o2);
            return;
        }
        if (C3()) {
            int i5 = me9Var.p0;
            mc9 k4 = k4(i5);
            if (k4 == null || (g2 = de9.g(me9Var.r0, me9Var.u0, (length2 = k4.length()), 0)) >= (A2 = ls6.A(me9Var.r0, me9Var.u0, length2, 0))) {
                return;
            }
            boolean h4 = yi9.h(k4.getText(), g2, A2);
            ld9 ld9Var10 = this.R3;
            if (h4) {
                if (ld9Var10 != null) {
                    ld9Var10.d();
                }
                yi9.n(k4.getText(), g2, A2);
                k4.f();
                f4(i5);
                ld9 ld9Var11 = this.R3;
                if (ld9Var11 != null) {
                    ld9Var11.h();
                }
                we9Var.e();
                p4();
                return;
            }
            if (ld9Var10 != null) {
                ld9Var10.d();
            }
            if (yi9.g(k4.getText(), g2, A2)) {
                yi9.m(k4.getText(), g2, A2);
                k4.f();
                f4(i5);
                ld9 ld9Var12 = this.R3;
                if (ld9Var12 != null) {
                    ld9Var12.h();
                }
                p4();
            }
            k4.U1 = g2;
            k4.V1 = A2;
            k3(false);
            G4(k4);
            return;
        }
        wi9 I4 = I4();
        if (I4 == null || (g = de9.g(me9Var.r0, me9Var.u0, (length = I4.getEditText().length()), 0)) >= (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
            return;
        }
        boolean h5 = yi9.h(I4.getEditText().getText(), g, A);
        ld9 ld9Var13 = this.R3;
        if (h5) {
            if (ld9Var13 != null) {
                ld9Var13.d();
            }
            yi9.n(I4.getEditText().getText(), g, A);
            I4.getEditText().f();
            I4.w();
            ld9 ld9Var14 = this.R3;
            if (ld9Var14 != null) {
                ld9Var14.h();
            }
            we9Var.e();
            p4();
            return;
        }
        if (ld9Var13 != null) {
            ld9Var13.d();
        }
        if (yi9.g(I4.getEditText().getText(), g, A)) {
            yi9.m(I4.getEditText().getText(), g, A);
            I4.getEditText().f();
            I4.w();
            ld9 ld9Var15 = this.R3;
            if (ld9Var15 != null) {
                ld9Var15.h();
            }
            p4();
        }
        mc9 editText = I4.getEditText();
        editText.U1 = g;
        editText.V1 = A;
        k3(false);
        G4(I4.getEditText());
    }

    public final lk0 a5() {
        me9 me9Var;
        int i;
        lk0 M2 = M2();
        return (M2 == null && (me9Var = this.v3) != null && me9Var.w() && (i = me9Var.p0) == me9Var.s0) ? A4(i) : M2;
    }

    public final void b2(ii9 ii9Var) {
        ii9 ii9Var2 = this.q4;
        if (ii9Var2 != null && ii9Var2 != ii9Var) {
            LinkedHashSet linkedHashSet = ii9Var2.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                ii9Var2.w.invalidate();
                ii9Var2.v();
            }
        }
        this.q4 = ii9Var;
        this.K3 = false;
        this.t4 = -1;
        this.s4 = -1;
        ii9Var.setCellSelectionListener(this.u4);
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            me9Var.e(false);
        }
        setEditTextsLocked(true);
    }

    public final void b3(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        if (C1 instanceof wi9) {
            wi9 wi9Var = (wi9) C1;
            wi9Var.A();
            wi9Var.getEditText().setSelection(0);
        } else if (C1 instanceof ac9) {
            ac9 ac9Var = (ac9) C1;
            ac9Var.d.O();
            ac9Var.getEditText().setSelection(0);
        }
    }

    public final void b4() {
        mc9 editText;
        Runnable od9Var;
        int length;
        final int g;
        final int A;
        me9 me9Var = this.v3;
        if (me9Var == null || !me9Var.w()) {
            return;
        }
        byte b = 1;
        byte b2 = 0;
        if (H3()) {
            int i = me9Var.p0;
            int i2 = me9Var.q0;
            if (i2 != me9Var.t0) {
                return;
            }
            editText = Q4(i, i2);
            od9Var = new td9(this, i, i2, (byte) 1);
        } else if (u3()) {
            int i3 = me9Var.p0;
            editText = E2(i3);
            od9Var = new nd9(this, i3, (byte) 3);
        } else if (s3()) {
            int i4 = me9Var.p0;
            editText = o2(i4);
            od9Var = new nd9(this, i4, b2);
        } else if (C3()) {
            int i5 = me9Var.p0;
            editText = k4(i5);
            od9Var = new nd9(this, i5, b);
        } else {
            wi9 I4 = I4();
            if (I4 == null) {
                return;
            }
            editText = I4.getEditText();
            od9Var = new od9(I4, b2);
        }
        final mc9 mc9Var = editText;
        final Runnable runnable = od9Var;
        if (mc9Var == null || (g = de9.g(me9Var.r0, me9Var.u0, (length = mc9Var.length()), 0)) > (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
            return;
        }
        Editable text = mc9Var.getText();
        int i6 = ij6.h;
        String str = null;
        if (text != null) {
            ij6[] ij6VarArr = (ij6[]) text.getSpans(g, A, ij6.class);
            if (ij6VarArr.length > 0) {
                str = ij6VarArr[0].a;
            }
        }
        if (str == null) {
            str = mc9Var.getText().subSequence(g, A).toString();
        }
        final float L = gl.L(gba.S0 + 4);
        int i7 = bkb.F6;
        wjb wjbVar = this.o3;
        final int v0 = bkb.v0(i7, wjbVar);
        e72.X(getContext(), str, new p8c() { // from class: zd9
            @Override // p8c
            public final void a(Object obj) {
                ij6 a;
                String str2 = (String) obj;
                ye9 ye9Var = ye9.this;
                ye9Var.getClass();
                if (TextUtils.isEmpty(str2) || (a = ij6.a(str2, v0, L)) == null) {
                    return;
                }
                ld9 ld9Var = ye9Var.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                me9 me9Var2 = ye9Var.v3;
                if (me9Var2 != null) {
                    me9Var2.e(false);
                }
                mc9 mc9Var2 = mc9Var;
                mc9Var2.setLocked(false);
                SpannableString spannableString = new SpannableString(" ");
                spannableString.setSpan(a, 0, 1, 33);
                Editable text2 = mc9Var2.getText();
                int max = Math.max(0, Math.min(g, text2.length()));
                text2.replace(max, Math.max(max, Math.min(A, text2.length())), spannableString);
                runnable.run();
                ld9 ld9Var2 = ye9Var.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
                ye9Var.p3.onContentChanged();
                int min = Math.min(max + 1, mc9Var2.length());
                mc9Var2.O();
                ye9Var.post(new yd9(mc9Var2, min, (byte) 3));
            }
        }, wjbVar);
    }

    public final void b5(float f, float f2) {
        TL_iv.pageTableCell o;
        ii9 ii9Var = this.q4;
        if (!this.J3 || ii9Var == null || this.F3 != ii9Var || (o = ii9Var.o((int) ((f - ii9Var.getLeft()) - getLeft()), (int) ((f2 - ii9Var.getTop()) - getTop()))) == null || o == this.M3) {
            return;
        }
        this.M3 = o;
        ii9Var.y(this.L3, o);
    }

    public final pe9 c2() {
        int i;
        int i2;
        me9 me9Var = this.v3;
        if (me9Var == null || !me9Var.w() || C3()) {
            return null;
        }
        lk0 A42 = A4(me9Var.p0);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(A42);
        int indexOf2 = arrayList.indexOf(A4(me9Var.s0));
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
            lk0 lk0Var = (lk0) arrayList.get(i3);
            if (lk0Var.i || t3(lk0Var)) {
                return null;
            }
        }
        return new pe9(this, i, i2, me9Var.r0, me9Var.u0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c4() {
        ClipData primaryClip;
        String str;
        boolean isEmpty;
        ye9 ye9Var;
        HashMap hashMap;
        ArrayList x4;
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
            me9 me9Var = this.v3;
            if (!isEmpty) {
                try {
                    hashMap = new HashMap();
                    x4 = x4(ff9.z(str, hashMap));
                } catch (Exception e) {
                    e = e;
                    ye9Var = this;
                }
                if (!x4.isEmpty()) {
                    ArrayList arrayList = this.t3;
                    ye9Var = this;
                    try {
                        if (ye9Var.L4(arrayList.indexOf(A4(me9Var.p0)), arrayList.indexOf(A4(me9Var.s0)), me9Var.r0, me9Var.u0, x4)) {
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            ye9Var.u3.putAll(hashMap);
                            return;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fa4.g(e, true);
                        coerceToText = itemAt.coerceToText(ye9Var.getContext());
                        if (coerceToText == null) {
                        }
                        ye9Var.S1(me9Var.p0, me9Var.r0, me9Var.s0, me9Var.u0, coerceToText.toString().split("\n", -1));
                    }
                    coerceToText = itemAt.coerceToText(ye9Var.getContext());
                    if (coerceToText == null) {
                        coerceToText = "";
                    }
                    ye9Var.S1(me9Var.p0, me9Var.r0, me9Var.s0, me9Var.u0, coerceToText.toString().split("\n", -1));
                }
            }
            ye9Var = this;
            coerceToText = itemAt.coerceToText(ye9Var.getContext());
            if (coerceToText == null) {
            }
            ye9Var.S1(me9Var.p0, me9Var.r0, me9Var.s0, me9Var.u0, coerceToText.toString().split("\n", -1));
        }
        str = null;
        isEmpty = TextUtils.isEmpty(str);
        me9 me9Var2 = this.v3;
        if (!isEmpty) {
        }
        ye9Var = this;
        coerceToText = itemAt.coerceToText(ye9Var.getContext());
        if (coerceToText == null) {
        }
        ye9Var.S1(me9Var2.p0, me9Var2.r0, me9Var2.s0, me9Var2.u0, coerceToText.toString().split("\n", -1));
    }

    public final void c5() {
        wi9 wi9Var;
        lk0 lk0Var;
        ti9 ti9Var;
        b49 itemAnimator = getItemAnimator();
        setItemAnimator(null);
        this.g3.O(true);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof wi9) && (lk0Var = (wi9Var = (wi9) childAt).y) != null && (ti9Var = wi9Var.E) != null) {
                wi9Var.d(lk0Var, ti9Var, wi9Var.F);
            }
        }
        post(new be9(this, itemAnimator, (byte) 2));
    }

    public final int d2(int i) {
        mc9 E2 = E2(i);
        if (E2 != null) {
            return E2.length();
        }
        wi9 q2 = q2(i);
        if (q2 != null) {
            return q2.getEditText().length();
        }
        lk0 A42 = A4(i);
        if (A42 == null) {
            return 0;
        }
        return wi9.y(A42.b).length();
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
    public final boolean d3(KeyEvent keyEvent) {
        int i;
        boolean z;
        byte b;
        ArrayList arrayList;
        View findFocus;
        ii9 Q2;
        int i2;
        ii9 ii9Var;
        ai9 ai9Var;
        lk0 lk0Var;
        int indexOf;
        boolean z2;
        int i3;
        mc9 O3;
        Layout layout;
        Layout layout2;
        final byte b2;
        int i4;
        wi9 wi9Var;
        lk0 R3;
        int i5;
        boolean z3;
        int i6;
        int j4;
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
        lk0 M2;
        int indexOf2;
        boolean z4;
        int i21;
        int i22;
        int unicodeChar;
        int i23;
        boolean z5;
        ld9 ld9Var;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isAltPressed = keyEvent.isAltPressed();
        me9 me9Var = this.v3;
        boolean w = me9Var.w();
        if (isCtrlPressed && !isAltPressed && (ld9Var = this.R3) != null) {
            if (keyCode == 54) {
                if (!isShiftPressed) {
                    ld9Var.k();
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
                    a4();
                    return true;
                }
                if (i23 != 0) {
                    Y3(i23);
                    return true;
                }
            }
        }
        if (keyCode == 111 && w) {
            me9Var.e(false);
            return true;
        }
        if (w) {
            if (isCtrlPressed && !isShiftPressed && keyCode == 31) {
                CharSequence q = me9Var.q();
                if (q == null || q.length() == 0) {
                    return true;
                }
                f5(q);
                return true;
            }
            if (isCtrlPressed && !isShiftPressed && keyCode == 52) {
                CharSequence q2 = me9Var.q();
                if (q2 != null && q2.length() > 0) {
                    f5(q2);
                }
                A2();
                return true;
            }
            if (isCtrlPressed && keyCode == 50) {
                c4();
                return true;
            }
            if (keyCode == 67 || keyCode == 112) {
                A2();
                return true;
            }
            if (keyCode == 66) {
                u4("\n");
                return true;
            }
            if (!isCtrlPressed && !isAltPressed && (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) >= 32) {
                u4(String.valueOf((char) unicodeChar));
                return true;
            }
        }
        ArrayList arrayList2 = this.t3;
        if (!w && isShiftPressed && r3(keyCode) && (M2 = M2()) != null && (indexOf2 = arrayList2.indexOf(M2)) >= 0) {
            View C1 = C1(M2);
            if (C1 instanceof wi9) {
                wi9 wi9Var2 = (wi9) C1;
                mc9 editText = wi9Var2.getEditText();
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
                                    lk0 lk0Var2 = (lk0) arrayList2.get(i21);
                                    i = 1;
                                    for (i22 = 0; i22 < arrayList2.size(); i22++) {
                                        me9Var.W(i22, wi9.y(((lk0) arrayList2.get(i22)).b));
                                    }
                                    if (length2 != 0) {
                                        int max = Math.max(0, Math.min(editText.getSelectionStart(), length2));
                                        if (z4) {
                                            if (max >= length2) {
                                                length2--;
                                            }
                                            if (me9Var.i0(wi9Var2, 0, max, length2)) {
                                                KeyEvent.Callback C12 = C1(lk0Var2);
                                                if (C12 instanceof eib) {
                                                    me9Var.a0(0, 0, (eib) C12);
                                                    break;
                                                } else {
                                                    w0(i21);
                                                    post(new sd9(this, lk0Var2, (byte) 14));
                                                    break;
                                                }
                                            }
                                        } else if (me9Var.i0(wi9Var2, 0, max, max > 0 ? 0 : 1)) {
                                            KeyEvent.Callback C13 = C1(lk0Var2);
                                            if (C13 instanceof eib) {
                                                me9Var.a0(0, C13 instanceof wi9 ? ((wi9) C13).getEditText().length() : 0, (eib) C13);
                                                break;
                                            } else {
                                                w0(i21);
                                                post(new sd9(this, lk0Var2, (byte) 15));
                                                break;
                                            }
                                        }
                                    }
                                    if (!w && isShiftPressed && r3(keyCode)) {
                                        int i24 = (isCtrlPressed || isAltPressed) ? i : 0;
                                        int i25 = me9Var.B0;
                                        int i26 = me9Var.D0;
                                        int i27 = me9Var.C0;
                                        int i28 = me9Var.p0;
                                        int i29 = me9Var.q0;
                                        int i30 = me9Var.r0;
                                        int i31 = me9Var.s0;
                                        int i32 = me9Var.t0;
                                        int i33 = me9Var.u0;
                                        if (i25 == i28 && i26 == i29 && i27 == i30) {
                                            i28 = i31;
                                            i29 = i32;
                                        } else {
                                            i33 = i30;
                                        }
                                        View C4 = C4(i28);
                                        if (C4 != null) {
                                            if (C4 instanceof ii9) {
                                                ii9 ii9Var2 = (ii9) C4;
                                                ffb model = ii9Var2.getModel();
                                                if (model != null) {
                                                    ArrayList arrayList3 = model.g;
                                                    if (!arrayList3.isEmpty()) {
                                                        int size = arrayList3.size() + 1;
                                                        int i34 = (i29 < 0 || i29 >= size) ? 0 : i29;
                                                        mc9 n = ii9Var2.n(i34);
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
                                                                            i16 = j4(i17);
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
                                                                                    mc9 n2 = ii9Var2.n(i15);
                                                                                    Layout layout5 = n2 != null ? n2.getLayout() : null;
                                                                                    length = layout5 != null ? layout5.getText().length() : 0;
                                                                                } else {
                                                                                    length = ii9Var2.getTitleEditText().length();
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
                                                                                int max2 = Math.max(1, ffb.o(pagetablecell2)) + b4;
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
                                                                                i16 = j4(i17);
                                                                                i29 = 0;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            mc9 n3 = ii9Var2.n(i40);
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
                                                if (C4 instanceof wi9) {
                                                    Layout layout7 = ((wi9) C4).getEditText().getLayout();
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
                                                                        j4 = j4(i6);
                                                                        int i43 = j4;
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
                                                                    i8 = j4(i9);
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
                                                    if ((C4 instanceof ec9) || (C4 instanceof vf9) || (C4 instanceof ib9) || (C4 instanceof pf9) || (C4 instanceof rf9)) {
                                                        switch (keyCode) {
                                                            case 19:
                                                            case 21:
                                                                i6 = i28 - 1;
                                                                if (i6 >= 0) {
                                                                    j4 = j4(i6);
                                                                    int i432 = j4;
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
                                                    w0(i11);
                                                }
                                                KeyEvent.Callback C42 = C4(i11);
                                                if (C42 instanceof eib) {
                                                    arrayList = arrayList2;
                                                    b = 4;
                                                    z3 = me9Var.a0(i12, i10, (eib) C42);
                                                    break;
                                                } else {
                                                    arrayList = arrayList2;
                                                    b = 4;
                                                    post(new nk2(this, i11, i12, i10, (byte) 2));
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
                                    if (!w && !isShiftPressed && !z && !isAltPressed && r3(keyCode)) {
                                        boolean z6 = keyCode == 22 || keyCode == 20;
                                        this.x3 = z6 ? me9Var.s0 : me9Var.p0;
                                        this.y3 = z6 ? me9Var.u0 : me9Var.r0;
                                        this.z3 = z6 ? me9Var.t0 : me9Var.q0;
                                        me9Var.e(false);
                                        break;
                                    } else if (z || keyCode != 29 || (!me9Var.Z() && !V4())) {
                                        if (!w && !isShiftPressed && !z && !isAltPressed && (keyCode == 20 || keyCode == 19)) {
                                            boolean z7 = keyCode != 20;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 >= getChildCount()) {
                                                    View childAt = getChildAt(i2);
                                                    if (childAt instanceof ii9) {
                                                        ii9Var = (ii9) childAt;
                                                        if (!ii9Var.getTitleEditText().isFocused()) {
                                                        }
                                                    }
                                                    i2++;
                                                } else {
                                                    ii9Var = null;
                                                }
                                            }
                                            l5c l5cVar = this.g3;
                                            if (ii9Var == null) {
                                                int indexOf3 = arrayList.indexOf(ii9Var.getRow());
                                                if (indexOf3 >= 0) {
                                                    if (z7) {
                                                        if (!ii9Var.t()) {
                                                            int P2 = P2(indexOf3 + 1, 1);
                                                            if (P2 < 0) {
                                                                lk0 lk0Var3 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(lk0Var3);
                                                                l5cVar.O(false);
                                                                post(new sd9(this, lk0Var3, (byte) 2));
                                                                break;
                                                            } else {
                                                                post(new sd9(this, (lk0) arrayList.get(P2), b));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        int P22 = P2(indexOf3 - 1, -1);
                                                        if (P22 >= 0) {
                                                            post(new sd9(this, (lk0) arrayList.get(P22), (byte) 5));
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i44 = 0;
                                                while (true) {
                                                    if (i44 < getChildCount()) {
                                                        View childAt2 = getChildAt(i44);
                                                        if (childAt2 instanceof ai9) {
                                                            ai9Var = (ai9) childAt2;
                                                            if (!ai9Var.r.isFocused()) {
                                                            }
                                                        }
                                                        i44++;
                                                    } else {
                                                        ai9Var = null;
                                                    }
                                                }
                                                if (ai9Var != null) {
                                                    mc9 mc9Var = ai9Var.r;
                                                    int indexOf4 = this.x4.indexOf(ai9Var.getRow());
                                                    if (indexOf4 >= 0) {
                                                        Layout layout8 = mc9Var.getLayout();
                                                        int lineForOffset5 = layout8 != null ? layout8.getLineForOffset(mc9Var.getSelectionEnd()) : 0;
                                                        if (z7) {
                                                            if (layout8 != null) {
                                                                int lineCount = layout8.getLineCount();
                                                                i5 = 1;
                                                                break;
                                                            } else {
                                                                i5 = 1;
                                                            }
                                                            lk0 R32 = R3(indexOf4 + i5, i5);
                                                            if (R32 == null) {
                                                                lk0 lk0Var4 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(lk0Var4);
                                                                l5cVar.O(false);
                                                                post(new sd9(this, lk0Var4, (byte) 6));
                                                                break;
                                                            } else {
                                                                post(new sd9(this, R32, (byte) 7));
                                                                break;
                                                            }
                                                        } else if ((layout8 == null || lineForOffset5 <= 0) && (R3 = R3(indexOf4 - 1, -1)) != null) {
                                                            post(new sd9(this, R3, (byte) 8));
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    int i45 = 0;
                                                    while (true) {
                                                        if (i45 < getChildCount()) {
                                                            KeyEvent.Callback childAt3 = getChildAt(i45);
                                                            if (childAt3 instanceof wi9) {
                                                                wi9Var = (wi9) childAt3;
                                                                if (wi9Var.getEditText().isFocused() || (wi9Var.l() && wi9Var.h.isFocused())) {
                                                                }
                                                                i45++;
                                                            } else if (childAt3 instanceof tb9) {
                                                                tb9 tb9Var = (tb9) childAt3;
                                                                if (tb9Var.getCaptionEditText().isFocused()) {
                                                                    lk0Var = tb9Var.getRow();
                                                                } else {
                                                                    i45++;
                                                                }
                                                            } else {
                                                                if (childAt3 instanceof ac9) {
                                                                    ac9 ac9Var = (ac9) childAt3;
                                                                    if (ac9Var.getEditText().isFocused()) {
                                                                        lk0Var = ac9Var.getRow();
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                                i45++;
                                                            }
                                                        } else {
                                                            lk0Var = null;
                                                        }
                                                    }
                                                    lk0Var = wi9Var.getRow();
                                                    if (lk0Var != null && (indexOf = arrayList.indexOf(lk0Var)) >= 0) {
                                                        View C14 = C1(lk0Var);
                                                        boolean z8 = C14 instanceof wi9;
                                                        if (z8) {
                                                            final wi9 wi9Var3 = (wi9) C14;
                                                            mc9 mc9Var2 = wi9Var3.f;
                                                            mc9 mc9Var3 = wi9Var3.h;
                                                            if (wi9Var3.l()) {
                                                                float f = 0.0f;
                                                                if (z7) {
                                                                    if (!mc9Var3.isFocused()) {
                                                                        z2 = z7;
                                                                        Layout layout9 = wi9Var3.getEditText().getLayout();
                                                                        if (layout9 != null) {
                                                                            i3 = indexOf;
                                                                            break;
                                                                        }
                                                                        Layout layout10 = mc9Var2.getLayout();
                                                                        if (layout10 == null) {
                                                                            i4 = 0;
                                                                        } else {
                                                                            i4 = 0;
                                                                            f = layout10.getPrimaryHorizontal(Math.max(0, Math.min(mc9Var2.getSelectionEnd(), mc9Var2.length())));
                                                                        }
                                                                        final float f2 = f;
                                                                        if (mc9Var3.getVisibility() != 0) {
                                                                            mc9Var3.setVisibility(i4);
                                                                            wi9Var3.requestLayout();
                                                                        }
                                                                        mc9Var3.O();
                                                                        final byte b5 = 1;
                                                                        mc9Var3.post(new Runnable() { // from class: mi9
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                byte b6 = b5;
                                                                                float f3 = f2;
                                                                                wi9 wi9Var4 = wi9Var3;
                                                                                switch (b6) {
                                                                                    case 0:
                                                                                        mc9 mc9Var4 = wi9Var4.f;
                                                                                        Layout layout11 = mc9Var4.getLayout();
                                                                                        int length5 = mc9Var4.length();
                                                                                        if (layout11 != null) {
                                                                                            length5 = layout11.getOffsetForHorizontal(Math.max(0, layout11.getLineCount() - 1), f3);
                                                                                        }
                                                                                        mc9Var4.setSelection(Math.max(0, Math.min(length5, mc9Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        mc9 mc9Var5 = wi9Var4.h;
                                                                                        Layout layout12 = mc9Var5.getLayout();
                                                                                        int length6 = mc9Var5.length();
                                                                                        if (layout12 != null) {
                                                                                            length6 = layout12.getOffsetForHorizontal(0, f3);
                                                                                        }
                                                                                        mc9Var5.setSelection(Math.max(0, Math.min(length6, mc9Var5.length())));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        break;
                                                                    }
                                                                } else {
                                                                    z2 = z7;
                                                                    i3 = indexOf;
                                                                    if (mc9Var3.isFocused() && ((layout2 = wi9Var3.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(wi9Var3.getAuthorEditText().getSelectionEnd()) <= 0)) {
                                                                        Layout layout11 = mc9Var3.getLayout();
                                                                        if (layout11 == null) {
                                                                            b2 = 0;
                                                                        } else {
                                                                            b2 = 0;
                                                                            f = layout11.getPrimaryHorizontal(Math.max(0, Math.min(mc9Var3.getSelectionEnd(), mc9Var3.length())));
                                                                        }
                                                                        final float f3 = f;
                                                                        mc9Var2.O();
                                                                        mc9Var2.post(new Runnable() { // from class: mi9
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                byte b6 = b2;
                                                                                float f32 = f3;
                                                                                wi9 wi9Var4 = wi9Var3;
                                                                                switch (b6) {
                                                                                    case 0:
                                                                                        mc9 mc9Var4 = wi9Var4.f;
                                                                                        Layout layout112 = mc9Var4.getLayout();
                                                                                        int length5 = mc9Var4.length();
                                                                                        if (layout112 != null) {
                                                                                            length5 = layout112.getOffsetForHorizontal(Math.max(0, layout112.getLineCount() - 1), f32);
                                                                                        }
                                                                                        mc9Var4.setSelection(Math.max(0, Math.min(length5, mc9Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        mc9 mc9Var5 = wi9Var4.h;
                                                                                        Layout layout12 = mc9Var5.getLayout();
                                                                                        int length6 = mc9Var5.length();
                                                                                        if (layout12 != null) {
                                                                                            length6 = layout12.getOffsetForHorizontal(0, f32);
                                                                                        }
                                                                                        mc9Var5.setSelection(Math.max(0, Math.min(length6, mc9Var5.length())));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        break;
                                                                    }
                                                                }
                                                                if (z8) {
                                                                    O3 = O3(C14);
                                                                } else {
                                                                    wi9 wi9Var4 = (wi9) C14;
                                                                    O3 = (wi9Var4.l() && wi9Var4.h.isFocused()) ? wi9Var4.getAuthorEditText() : wi9Var4.getEditText();
                                                                }
                                                                if (O3 != null && (layout = O3.getLayout()) != null) {
                                                                    int lineForOffset6 = layout.getLineForOffset(O3.getSelectionEnd());
                                                                    if (z2) {
                                                                        if (lineForOffset6 <= 0) {
                                                                            lk0 R1 = R1(lk0Var, -1);
                                                                            if (R1 != null) {
                                                                                post(new sd9(this, R1, (byte) 13));
                                                                                break;
                                                                            } else {
                                                                                int P23 = P2(i3 - 1, -1);
                                                                                if (P23 >= 0) {
                                                                                    post(new sd9(this, (lk0) arrayList.get(P23), (byte) 3));
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (lineForOffset6 >= layout.getLineCount() - 1) {
                                                                        lk0 R12 = R1(lk0Var, 1);
                                                                        if (R12 != null) {
                                                                            post(new sd9(this, R12, (byte) 10));
                                                                            break;
                                                                        } else {
                                                                            int P24 = P2(i3 + 1, 1);
                                                                            if (P24 < 0) {
                                                                                lk0 lk0Var5 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                                arrayList.add(lk0Var5);
                                                                                l5cVar.O(false);
                                                                                post(new sd9(this, lk0Var5, (byte) 11));
                                                                                break;
                                                                            } else {
                                                                                post(new sd9(this, (lk0) arrayList.get(P24), (byte) 12));
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
                                                        if (O3 != null) {
                                                            int lineForOffset62 = layout.getLineForOffset(O3.getSelectionEnd());
                                                            if (z2) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!w && !z && !isAltPressed && keyCode == 61) {
                                            findFocus = findFocus();
                                            if (findFocus instanceof mc9) {
                                                if ((Q2 = Q2((r3 = (mc9) findFocus))) != null) {
                                                    if (findFocus != Q2.getTitleEditText()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (keyCode != 61 && w) {
                                            int i46 = me9Var.p0;
                                            int i47 = me9Var.s0;
                                            if (i46 >= 0 && i47 >= i46) {
                                                if (i46 == i47) {
                                                    lk0 A42 = A4(i46);
                                                    if (A42 != null) {
                                                        V3(A42, isShiftPressed);
                                                        break;
                                                    }
                                                } else {
                                                    int indexOf5 = arrayList.indexOf(A4(i46));
                                                    int indexOf6 = arrayList.indexOf(A4(i47));
                                                    if (indexOf5 >= 0 && indexOf6 >= indexOf5) {
                                                        n4(indexOf5, indexOf6, isShiftPressed);
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
                                    lk0 lk0Var22 = (lk0) arrayList2.get(i21);
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
                                        l5c l5cVar2 = this.g3;
                                        if (ii9Var == null) {
                                        }
                                    }
                                    if (!w) {
                                        findFocus = findFocus();
                                        if ((findFocus instanceof mc9) && (Q2 = Q2((r3 = (mc9) findFocus))) != null) {
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

    public final void d4(int i) {
        KeyEvent.Callback C4 = C4(i);
        if (C4 instanceof tb9) {
            ((tb9) C4).b();
        }
    }

    public final void d5(lk0 lk0Var, String str) {
        lk0 lk0Var2;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                ld9 ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                pageblockpreformatted.language = str;
                wi9 q2 = q2(this.t3.indexOf(lk0Var));
                if (q2 != null && (lk0Var2 = q2.y) != null) {
                    q2.J(lk0Var2.b, true);
                    q2.I = null;
                    q2.B();
                }
                ld9 ld9Var2 = this.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
            }
        }
    }

    @Override // q5c, o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        Long l;
        lk0 lk0Var;
        View view;
        Long l2;
        int i2;
        int i3;
        ArrayList arrayList2;
        lk0 lk0Var2;
        lk0 lk0Var3;
        float f;
        lk0 lk0Var4;
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
                int R = RecyclerView.R(getChildAt(i4));
                lk0 lk0Var5 = (R < 0 || R >= arrayList.size()) ? null : (lk0) arrayList.get(R);
                if (lk0Var5 != null) {
                    ArrayList arrayList3 = lk0Var5.k;
                    if (arrayList3.size() > i5) {
                        i5 = arrayList3.size();
                    }
                }
                i4++;
            }
            if (i5 != 0) {
                if (this.y4 == null) {
                    n79 n79Var = new n79(this);
                    this.y4 = n79Var;
                    n79Var.a(null, null, null, this.o3, 1);
                    rse.a(this.y4, this.o3);
                }
                int i6 = 0;
                while (i6 < i5) {
                    float f2 = 0.0f;
                    long j = 0;
                    int i7 = 0;
                    boolean z2 = false;
                    lk0 lk0Var6 = null;
                    lk0 lk0Var7 = null;
                    float f3 = 1.0f;
                    float f4 = 0.0f;
                    while (i7 <= childCount) {
                        if (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            int R2 = RecyclerView.R(childAt);
                            lk0Var = (R2 < 0 || R2 >= arrayList.size()) ? null : (lk0) arrayList.get(R2);
                            if (lk0Var != null) {
                                ArrayList arrayList4 = lk0Var.k;
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
                            lk0Var = null;
                            view = null;
                        }
                        if (!z2 || (l != null && l.longValue() == j)) {
                            l2 = l;
                            i2 = i6;
                            i3 = i5;
                            arrayList2 = arrayList;
                            lk0Var2 = lk0Var6;
                            lk0Var3 = lk0Var7;
                            f = f3;
                        } else {
                            int l4 = l4(i6, lk0Var6, true);
                            l2 = l;
                            int l42 = l4(i6, lk0Var7, false);
                            if (f4 - f2 <= gl.L(4.0f)) {
                                i2 = i6;
                                i3 = i5;
                                arrayList2 = arrayList;
                            } else {
                                int L = gl.L(16.0f) * i6;
                                i2 = i6;
                                int L2 = gl.L(16.0f) + L;
                                i3 = i5;
                                arrayList2 = arrayList;
                                int x = ls6.x(16.0f, getWidth(), L);
                                if (x - L2 > gl.L(8.0f)) {
                                    float floor = (float) Math.floor(gba.U0 / 3.0f);
                                    RectF rectF = gl.P;
                                    rectF.set(L2, l4 + f2, x, f4 - l42);
                                    lk0Var2 = lk0Var6;
                                    lk0Var3 = lk0Var7;
                                    this.y4.c(floor, floor, floor, f3, canvas, rectF);
                                    f = f3;
                                    this.y4.f(canvas, rectF, f);
                                    z2 = false;
                                }
                            }
                            lk0Var2 = lk0Var6;
                            lk0Var3 = lk0Var7;
                            f = f3;
                            z2 = false;
                        }
                        if (view == null || l2 == null) {
                            lk0Var7 = lk0Var3;
                            f3 = f;
                            lk0Var4 = lk0Var2;
                        } else {
                            if (z2) {
                                lk0Var4 = lk0Var2;
                                z = z2;
                            } else {
                                j = l2.longValue();
                                f2 = Float.MAX_VALUE;
                                f4 = -3.4028235E38f;
                                lk0Var4 = lk0Var;
                                z = true;
                                f = 1.0f;
                            }
                            if (lk0Var == null || lk0Var != this.a4) {
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
                            lk0Var7 = lk0Var;
                        }
                        i7++;
                        lk0Var6 = lk0Var4;
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

    public final TL_iv.RichMessage e2() {
        if (!g3()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> V2 = V2();
        if (V2.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = V2;
        richMessage.photos = x2();
        richMessage.documents = u2();
        return richMessage;
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x0428  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e3(MotionEvent motionEvent) {
        boolean z;
        lk0 row;
        int i;
        ii9 ii9Var;
        int action = motionEvent.getAction();
        byte b = 2;
        me9 me9Var = this.v3;
        View view = null;
        if (action == 0) {
            this.D3 = motionEvent.getX();
            float y = motionEvent.getY();
            this.E3 = y;
            this.H3 = false;
            this.I3 = false;
            int i2 = (int) this.D3;
            int top = ((int) y) - getTop();
            ii9 ii9Var2 = this.q4;
            if (ii9Var2 == null) {
                ii9Var2 = N2();
            }
            if (ii9Var2 != null && ii9Var2.getParent() == this) {
                int left = i2 - ii9Var2.getLeft();
                int top2 = top - ii9Var2.getTop();
                if (ii9Var2.r(left, top2) >= 0 || ii9Var2.p(left, top2) >= 0) {
                    view = ii9Var2;
                    this.F3 = view;
                    long eventTime = motionEvent.getEventTime();
                    z = me9Var.w() && eventTime - this.N3 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.D3 - this.O3) <= ((float) gl.L(24.0f)) && Math.abs(this.E3 - this.P3) <= ((float) gl.L(24.0f));
                    this.N3 = eventTime;
                    float f = this.D3;
                    this.O3 = f;
                    float f2 = this.E3;
                    this.P3 = f2;
                    if (!z && W4(this.F3, f, f2)) {
                        this.I3 = true;
                        this.N3 = 0L;
                        kya kyaVar = me9Var.m0;
                        if (!me9Var.w()) {
                            return true;
                        }
                        me9Var.i = false;
                        me9Var.R = false;
                        me9Var.k = false;
                        qib qibVar = me9Var.C;
                        if (qibVar != null) {
                            qibVar.invalidate();
                        }
                        gl.r(kyaVar);
                        gl.c3(kyaVar);
                        return true;
                    }
                    if (this.F3 != null) {
                        Runnable runnable = this.G3;
                        if (runnable != null) {
                            removeCallbacks(runnable);
                        }
                        q62 q62Var = new q62(this, b);
                        this.G3 = q62Var;
                        postDelayed(q62Var, ViewConfiguration.getLongPressTimeout());
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
            if (me9Var.w()) {
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
                    b5(motionEvent.getX(), motionEvent.getY());
                    ii9 ii9Var3 = this.q4;
                    if (this.J3) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.J3 = false;
                    this.L3 = null;
                    this.M3 = null;
                    this.K3 = ii9Var3 != null && ii9Var3.getSelectedCells().size() > 1;
                    if (ii9Var3 != null && !ii9Var3.I.isEmpty()) {
                        H4(ii9Var3);
                    }
                    this.F3 = null;
                    this.I3 = false;
                    return true;
                }
                if (!this.H3 && !this.I3) {
                    View view2 = this.F3;
                    if (view2 instanceof ii9) {
                        if (f3((ii9) view2, (int) ((motionEvent.getX() - r0.getLeft()) - getLeft()), (int) ((motionEvent.getY() - r0.getTop()) - getTop()))) {
                            this.F3 = null;
                            this.I3 = false;
                            return false;
                        }
                    }
                }
                if (!this.H3 && !this.I3 && (ii9Var = this.q4) != null) {
                    View view3 = this.F3;
                    if (view3 == ii9Var) {
                        ii9 ii9Var4 = (ii9) view3;
                        TL_iv.pageTableCell o = ii9Var4.o((int) ((motionEvent.getX() - ii9Var4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - ii9Var4.getTop()) - getTop()));
                        if (o != null) {
                            if (this.s4 >= 0 || this.t4 >= 0) {
                                I2();
                            } else {
                                LinkedHashSet linkedHashSet = ii9Var4.I;
                                if (!linkedHashSet.remove(o)) {
                                    linkedHashSet.add(o);
                                }
                                ii9Var4.w.invalidate();
                                ii9Var4.v();
                            }
                        }
                    } else if (view3 != null) {
                        I2();
                    }
                }
                boolean z2 = this.H3;
                l5c l5cVar = this.g3;
                ArrayList arrayList = this.t3;
                if (!z2 && !this.I3 && this.F3 == null && !me9Var.w() && this.q4 == null) {
                    float x = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x >= getLeft() && x <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i4 = 0; i4 < getChildCount(); i4++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i4).getBottom() + getTop());
                        }
                        int x2 = ls6.x(60.0f, view4.getHeight(), Math.max(Math.max(this.Y3, this.W3), this.X3));
                        if (y2 >= paddingTop && y2 <= x2) {
                            lk0 lk0Var = arrayList.isEmpty() ? null : (lk0) b00.f(1, arrayList);
                            if (lk0Var == null || !lk0Var.k.isEmpty() || A3(lk0Var.b) || lk0Var.i || t3(lk0Var) || G2(lk0Var.b)) {
                                ld9 ld9Var = this.R3;
                                if (ld9Var != null) {
                                    ld9Var.d();
                                }
                                lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(lk0Var2);
                                l5cVar.O(false);
                                ld9 ld9Var2 = this.R3;
                                if (ld9Var2 != null) {
                                    ld9Var2.h();
                                }
                                post(new sd9(this, lk0Var2, (byte) 19));
                            } else {
                                a3(lk0Var);
                            }
                        }
                    }
                }
                if (!this.H3 && !this.I3 && this.F3 == null && !me9Var.w() && this.q4 == null) {
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
                            if (RecyclerView.R(childAt2) == 0) {
                                i = childAt2.getTop() + getTop();
                                break;
                            }
                            i5++;
                        }
                        if (i != Integer.MAX_VALUE) {
                            if (y3 >= gl.L(60.0f) + getTop() && y3 <= i) {
                                lk0 lk0Var3 = arrayList.isEmpty() ? null : (lk0) arrayList.get(0);
                                if (lk0Var3 == null || A3(lk0Var3.b) || lk0Var3.i || t3(lk0Var3) || G2(lk0Var3.b)) {
                                    ld9 ld9Var3 = this.R3;
                                    if (ld9Var3 != null) {
                                        ld9Var3.d();
                                    }
                                    lk0 lk0Var4 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, lk0Var4);
                                    l5cVar.O(false);
                                    ld9 ld9Var4 = this.R3;
                                    if (ld9Var4 != null) {
                                        ld9Var4.h();
                                    }
                                    post(new sd9(this, lk0Var4, (byte) 16));
                                } else {
                                    b3(lk0Var3);
                                }
                            }
                        }
                    }
                }
                if (!this.H3 && !this.I3 && (this.F3 instanceof rf9) && !me9Var.w() && this.q4 == null && (row = ((rf9) this.F3).getRow()) != null) {
                    TL_iv.PageBlock pageBlock = row.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        e72.X(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new x15(this, pageblockmath, (byte) 27), this.o3);
                    }
                }
                this.F3 = null;
                this.I3 = false;
                return false;
            }
            if (action == 2) {
                if (this.J3 && this.F3 == this.q4) {
                    b5(motionEvent.getX(), motionEvent.getY());
                    this.H3 = true;
                    return true;
                }
                float x4 = motionEvent.getX() - this.D3;
                float y4 = motionEvent.getY() - this.E3;
                if ((y4 * y4) + (x4 * x4) > gl.L(8.0f) * gl.L(8.0f)) {
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
                    I2();
                }
                this.F3 = null;
                this.I3 = false;
                return false;
            }
        }
        return false;
    }

    public final void e4(int i) {
        lk0 A42 = A4(i);
        mc9 E2 = E2(i);
        if (!t3(A42) || E2 == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) A42.b).title = yi9.f(E2.getText());
    }

    public final TL_iv.PageBlock f2(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        TL_iv.pageBlockList pageblocklist;
        TL_iv.pageBlockOrderedList pageblockorderedlist;
        int i5;
        TL_iv.RichText richText;
        int i6;
        lk0 lk0Var;
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
            ye9 ye9Var = this;
            ArrayList arrayList2 = ye9Var.t3;
            lk0 lk0Var2 = (lk0) arrayList2.get(i9);
            if (lk0Var2.k.size() > i8 || (i5 = lk0Var2.c) < i2) {
                break;
            }
            if (i5 == i2) {
                if ((lk0Var2.d > 0) != z) {
                    break;
                }
            }
            if (i5 > i2) {
                break;
            }
            boolean A3 = A3(lk0Var2.b);
            if (A3) {
                richText = null;
            } else {
                TL_iv.PageBlock pageBlock = lk0Var2.b;
                richText = pageBlock == null ? null : pageBlock.text;
                if (richText == null) {
                    richText = new TL_iv.textEmpty();
                }
            }
            int i11 = i9 + 1;
            ArrayList arrayList3 = new ArrayList();
            if (A3) {
                F2(lk0Var2, arrayList3);
            }
            while (i11 < i7) {
                lk0 lk0Var3 = (lk0) arrayList2.get(i11);
                if (lk0Var3.k.size() > i8) {
                    break;
                }
                lk0Var = lk0Var2;
                int i12 = lk0Var3.c;
                if (i12 >= i2) {
                    if (i12 != i2) {
                        if (lk0Var3.d > 0) {
                            richText2 = richText;
                            z2 = true;
                        } else {
                            richText2 = richText;
                            z2 = false;
                        }
                        ArrayList arrayList4 = arrayList3;
                        int[] iArr2 = {i11};
                        ye9 ye9Var2 = ye9Var;
                        i6 = i11;
                        arrayList = arrayList4;
                        TL_iv.PageBlock f2 = ye9Var2.f2(i6, i12, i7, i8, z2, iArr2);
                        if (f2 != null) {
                            arrayList.add(f2);
                        }
                        i11 = iArr2[0];
                        if (i11 <= i6) {
                            break;
                        }
                        ye9Var = this;
                        i7 = i3;
                        i8 = i4;
                        richText = richText2;
                        lk0Var2 = lk0Var;
                        arrayList3 = arrayList;
                    } else if (A3(lk0Var3.b)) {
                        F2(lk0Var3, arrayList3);
                        i11++;
                        lk0Var2 = lk0Var;
                    }
                }
                i6 = i11;
                break;
            }
            i6 = i11;
            lk0Var = lk0Var2;
            richText2 = richText;
            arrayList = arrayList3;
            if (A3 || !arrayList.isEmpty()) {
                ArrayList<TL_iv.PageBlock> arrayList5 = new ArrayList<>();
                if (!A3) {
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
                    tL_pageListOrderedItemBlocks.num = oo1.n(i10, ".");
                    tL_pageListOrderedItemBlocks.blocks = arrayList5;
                    tL_pageListOrderedItemBlocks.checkbox = lk0Var.e;
                    tL_pageListOrderedItemBlocks.checked = lk0Var.f;
                    pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                } else {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                    tL_pageListItemBlocks.blocks = arrayList5;
                    tL_pageListItemBlocks.checkbox = lk0Var.e;
                    tL_pageListItemBlocks.checked = lk0Var.f;
                    pageblocklist.items.add(tL_pageListItemBlocks);
                }
            } else if (z) {
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                tL_pageListOrderedItemText.num = oo1.n(i10, ".");
                tL_pageListOrderedItemText.text = richText2;
                tL_pageListOrderedItemText.checkbox = lk0Var.e;
                tL_pageListOrderedItemText.checked = lk0Var.f;
                pageblockorderedlist.items.add(tL_pageListOrderedItemText);
            } else {
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                tL_pageListItemText.text = richText2;
                tL_pageListItemText.checkbox = lk0Var.e;
                tL_pageListItemText.checked = lk0Var.f;
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
    public final boolean f3(ii9 ii9Var, int i, int i2) {
        ffb ffbVar;
        ffb ffbVar2;
        int r = ii9Var.r(i, i2);
        LinkedHashSet linkedHashSet = ii9Var.I;
        ki9 ki9Var = ii9Var.w;
        if (r >= 0) {
            int r2 = (ki9Var.v() && r == ki9Var.k()) ? ki9Var.r() : r;
            if (ii9Var == this.q4 && (ffbVar2 = ii9Var.G) != null && r >= 0 && r2 >= r && r2 < ffbVar2.b && !linkedHashSet.isEmpty()) {
                int i3 = r;
                loop0: while (i3 <= r2) {
                    int i4 = 0;
                    while (true) {
                        ffb ffbVar3 = ii9Var.G;
                        if (i4 < ffbVar3.c) {
                            if (!linkedHashSet.contains(ffbVar3.d[i3][i4])) {
                                break loop0;
                            }
                            i4++;
                        }
                    }
                }
                H4(ii9Var);
                return true;
            }
            b2(ii9Var);
            ffb ffbVar4 = ii9Var.G;
            if (ffbVar4 != null && r >= 0 && r2 >= r && r2 < ffbVar4.b) {
                linkedHashSet.clear();
                for (int i5 = r; i5 <= r2; i5++) {
                    int i6 = 0;
                    while (true) {
                        ffb ffbVar5 = ii9Var.G;
                        if (i6 < ffbVar5.c) {
                            TL_iv.pageTableCell pagetablecell = ffbVar5.d[i5][i6];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i6++;
                        }
                    }
                }
                ki9Var.invalidate();
                ii9Var.v();
            }
            this.s4 = r;
            return true;
        }
        int p = ii9Var.p(i, i2);
        if (p < 0) {
            return false;
        }
        int q = (ki9Var.u() && p == ki9Var.j()) ? ki9Var.q() : p;
        if (ii9Var == this.q4 && (ffbVar = ii9Var.G) != null && p >= 0 && q >= p && q < ffbVar.c && !linkedHashSet.isEmpty()) {
            int i7 = p;
            loop4: while (i7 <= q) {
                int i8 = 0;
                while (true) {
                    ffb ffbVar6 = ii9Var.G;
                    if (i8 < ffbVar6.b) {
                        if (!linkedHashSet.contains(ffbVar6.d[i8][i7])) {
                            break loop4;
                        }
                        i8++;
                    }
                }
            }
            H4(ii9Var);
            return true;
        }
        b2(ii9Var);
        ffb ffbVar7 = ii9Var.G;
        if (ffbVar7 != null && p >= 0 && q >= p && q < ffbVar7.c) {
            linkedHashSet.clear();
            for (int i9 = p; i9 <= q; i9++) {
                int i10 = 0;
                while (true) {
                    ffb ffbVar8 = ii9Var.G;
                    if (i10 < ffbVar8.b) {
                        TL_iv.pageTableCell pagetablecell2 = ffbVar8.d[i10][i9];
                        if (pagetablecell2 != null) {
                            linkedHashSet.add(pagetablecell2);
                        }
                        i10++;
                    }
                }
            }
            ki9Var.invalidate();
            ii9Var.v();
        }
        this.t4 = p;
        return true;
    }

    public final void f4(int i) {
        View C4 = C4(i);
        if (C4 instanceof wi9) {
            ((wi9) C4).v();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:9)(1:(7:43|11|12|13|14|15|(4:17|19|20|(4:22|(1:24)(1:29)|25|27)(1:30)))(1:42))|10|11|12|13|14|15|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        fa4.g(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #1 {Exception -> 0x0079, blocks: (B:15:0x005d, B:17:0x006d), top: B:14:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f5(CharSequence charSequence) {
        boolean z;
        String str;
        ClipboardManager clipboardManager;
        int i;
        int i2;
        int i3;
        me9 me9Var = this.v3;
        lk0 A42 = A4(me9Var.p0);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(A42);
        int indexOf2 = arrayList.indexOf(A4(me9Var.s0));
        int i4 = me9Var.r0;
        int i5 = me9Var.u0;
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
                    xt6 xt6Var = new xt6();
                    int i6 = indexOf;
                    int i7 = indexOf;
                    z = true;
                    ff9.F(sb, arrayList, new int[]{i2}, i7, i2, i6, i3, i, xt6Var, false, 0, hashMap);
                    xt6Var.d(sb);
                    str = sb.toString();
                    if (!TextUtils.isEmpty(str)) {
                        wf9.a(w2(i2, i7), v2(i2, i7));
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
                xt6 xt6Var2 = new xt6();
                int i62 = indexOf;
                int i72 = indexOf;
                z = true;
                ff9.F(sb2, arrayList, new int[]{i2}, i72, i2, i62, i3, i, xt6Var2, false, 0, hashMap2);
                xt6Var2.d(sb2);
                str = sb2.toString();
                if (!TextUtils.isEmpty(str)) {
                }
            }
            clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager != null) {
            }
        } catch (Exception e) {
            fa4.g(e, z);
            return;
        }
        str = null;
    }

    public final boolean g2() {
        mc9 editText;
        int length;
        int g;
        int A;
        Editable text;
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w() && me9Var.p0 == me9Var.s0) {
            if (H3()) {
                int i = me9Var.p0;
                int i2 = me9Var.q0;
                if (i2 == me9Var.t0) {
                    editText = Q4(i, i2);
                    if (editText != null && (g = de9.g(me9Var.r0, me9Var.u0, (length = editText.length()), 0)) < (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
                        text = editText.getText();
                        if (text == null && g < A) {
                            for (mf9 mf9Var : (mf9[]) text.getSpans(g, A, mf9.class)) {
                                if (text.getSpanStart(mf9Var) >= A || text.getSpanEnd(mf9Var) <= g) {
                                }
                            }
                            return true;
                        }
                    }
                }
            } else {
                if (u3()) {
                    editText = E2(me9Var.p0);
                } else if (s3()) {
                    editText = o2(me9Var.p0);
                } else if (C3()) {
                    editText = k4(me9Var.p0);
                } else {
                    wi9 I4 = I4();
                    if (I4 != null) {
                        editText = I4.getEditText();
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
    public final boolean g3() {
        int i = 0;
        loop0: while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return false;
            }
            lk0 lk0Var = (lk0) arrayList.get(i);
            if (!wi9.y(lk0Var.b).isEmpty()) {
                break;
            }
            if (!z3(lk0Var.b)) {
                TL_iv.PageBlock pageBlock = lk0Var.b;
                if (!(pageBlock instanceof TL_iv.pageBlockAudio)) {
                }
            }
            for (iy6 iy6Var : N3(lk0Var)) {
                if (iy6Var.b() || iy6Var.a()) {
                    break loop0;
                }
            }
            TL_iv.PageBlock pageBlock2 = lk0Var.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock2).source)) {
                break;
            }
            TL_iv.PageBlock pageBlock3 = lk0Var.b;
            if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                int i2 = pf9.N;
                if (((TL_iv.pageBlockMap) pageBlock3).geo instanceof TLRPC.TL_geoPoint) {
                    return true;
                }
            }
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && R4((TL_iv.pageBlockTable) pageBlock3)) {
                break;
            }
            TL_iv.PageBlock pageBlock4 = lk0Var.b;
            if ((pageBlock4 instanceof TL_iv.pageBlockButtonRow) && !((TL_iv.pageBlockButtonRow) pageBlock4).buttons.isEmpty()) {
                break;
            }
            i++;
        }
        return true;
    }

    public final void g4(int i, int i2) {
        li9 m;
        View C4 = C4(i);
        if (C4 instanceof ii9) {
            ii9 ii9Var = (ii9) C4;
            if (i2 == 0) {
                ii9Var.w();
                return;
            }
            TL_iv.pageTableCell g = ii9Var.g(i2);
            if (g == null || (m = ii9Var.getGrid().m(g)) == null) {
                return;
            }
            ffb.d(g, m.a.getText());
        }
    }

    public mc9 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof mc9) {
            return (mc9) findFocus;
        }
        return null;
    }

    public nf9 getMapDelegate() {
        return this.l4;
    }

    public View getOverlayView() {
        return this.w3;
    }

    public fib getTextSelectionHelper() {
        return this.v3;
    }

    public final boolean h2() {
        int[] F4 = F4();
        if (F4 == null) {
            return i2(z2());
        }
        for (int i = F4[0]; i <= F4[1]; i++) {
            if (i2((lk0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean i2(lk0 lk0Var) {
        ArrayList arrayList;
        int indexOf;
        if (lk0Var == null || (indexOf = (arrayList = this.t3).indexOf(lk0Var)) < 0 || indexOf < 0 || indexOf >= arrayList.size()) {
            return false;
        }
        lk0 lk0Var2 = (lk0) arrayList.get(indexOf);
        if (lk0Var2.c == 0) {
            TL_iv.PageBlock pageBlock = lk0Var2.b;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !y3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !j2(indexOf)) {
                return false;
            }
        } else if (indexOf <= 0 || ((lk0) arrayList.get(indexOf - 1)).c < lk0Var2.c) {
            return false;
        }
        return l3(indexOf);
    }

    public final boolean i3() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return false;
            }
            Iterator it = N3((lk0) arrayList.get(i)).iterator();
            while (it.hasNext()) {
                if (((iy6) it.next()).a()) {
                    return true;
                }
            }
            i++;
        }
    }

    public final void i4(mc9 mc9Var) {
        if (mc9Var == null) {
            return;
        }
        mc9Var.c2 = this.r3;
        mc9Var.setInlineButtonContext(this.n3);
        mc9Var.setInlineButtonClickListener(new wd9(this));
    }

    public final boolean j2(int i) {
        if (i <= 0) {
            return false;
        }
        ArrayList arrayList = this.t3;
        return i < arrayList.size() && A3(((lk0) arrayList.get(i)).b) && ((lk0) arrayList.get(i - 1)).c >= 1;
    }

    public final void j3() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof wi9) {
                wi9 wi9Var = (wi9) childAt;
                wi9Var.f.m();
                wi9Var.h.m();
            } else if (childAt instanceof ii9) {
                ii9 ii9Var = (ii9) childAt;
                ki9 ki9Var = ii9Var.w;
                ii9Var.r.m();
                for (int i2 = 0; i2 < ki9Var.getChildCount(); i2++) {
                    View childAt2 = ki9Var.getChildAt(i2);
                    if (childAt2 instanceof li9) {
                        ((li9) childAt2).a.m();
                    }
                }
            } else if (childAt instanceof tb9) {
                ((tb9) childAt).getCaptionEditText().m();
            } else if (childAt instanceof ac9) {
                ((ac9) childAt).getEditText().m();
            }
        }
    }

    public final int j4(int i) {
        Layout layout;
        View C4 = C4(i);
        if (!(C4 instanceof wi9) || (layout = ((wi9) C4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final boolean k2() {
        int[] F4 = F4();
        if (F4 == null) {
            return l2(z2());
        }
        for (int i = F4[0]; i <= F4[1]; i++) {
            if (l2((lk0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final void k3(boolean z) {
        me9 me9Var = this.v3;
        if (me9Var != null) {
            if (z) {
                me9Var.e(false);
            } else {
                gl.r(me9Var.m0);
                me9Var.t();
            }
        }
        if (z) {
            R2();
        } else {
            j3();
        }
    }

    public final mc9 k4(int i) {
        View C4 = C4(i);
        if (C4 instanceof wi9) {
            return ((wi9) C4).getAuthorEditText();
        }
        return null;
    }

    public final boolean l2(lk0 lk0Var) {
        ArrayList arrayList;
        int indexOf;
        return lk0Var != null && (indexOf = (arrayList = this.t3).indexOf(lk0Var)) >= 0 && lk0Var.c > 0 && indexOf >= 0 && indexOf < arrayList.size() && ((lk0) arrayList.get(indexOf)).c > 0;
    }

    public final boolean l3(int i) {
        return ((lk0) this.t3.get(i)).c + 1 <= na7.q1(this.n3).k4.b0.f() + (-6);
    }

    public final boolean m2() {
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            return ld9Var.e || !ld9Var.b.isEmpty();
        }
        return false;
    }

    public final boolean m3(int i, boolean z, boolean z2) {
        int i2 = 0;
        if (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                lk0 lk0Var = (lk0) arrayList.get(i);
                if (z) {
                    if (lk0Var.c > 0) {
                        p2(i);
                        return true;
                    }
                } else if (lk0Var.c == 0) {
                    TL_iv.PageBlock pageBlock = lk0Var.b;
                    boolean z3 = (pageBlock instanceof TL_iv.pageBlockParagraph) || y3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z3 || j2(i)) && l3(i)) {
                        lk0 lk0Var2 = i > 0 ? (lk0) arrayList.get(i - 1) : null;
                        if (!z3) {
                            lk0Var.c = lk0Var2.c;
                            lk0Var.d = lk0Var2.d > 0 ? 1 : 0;
                            lk0Var.e = false;
                            lk0Var.f = false;
                            return true;
                        }
                        lk0Var.c = 1;
                        if (lk0Var2 != null && lk0Var2.d > 0) {
                            i2 = 1;
                        }
                        lk0Var.d = i2;
                        return true;
                    }
                } else if ((z2 || (i != 0 && ((lk0) arrayList.get(i - 1)).c >= lk0Var.c)) && l3(i)) {
                    lk0Var.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void n2(lk0 lk0Var, iy6 iy6Var) {
        we9 we9Var = this.p3;
        IdentityHashMap identityHashMap = this.i4;
        IdentityHashMap identityHashMap2 = this.h4;
        if (iy6Var != null) {
            bg9 bg9Var = (bg9) identityHashMap2.remove(iy6Var);
            if (bg9Var != null) {
                bg9Var.b();
            }
            xf9 xf9Var = (xf9) identityHashMap.remove(iy6Var);
            if (xf9Var != null) {
                xf9Var.a();
            }
            ld9 ld9Var = this.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            r4(lk0Var, iy6Var);
            ld9 ld9Var2 = this.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            we9Var.onContentChanged();
            return;
        }
        for (iy6 iy6Var2 : N3(lk0Var)) {
            bg9 bg9Var2 = (bg9) identityHashMap2.remove(iy6Var2);
            if (bg9Var2 != null) {
                bg9Var2.b();
            }
            xf9 xf9Var2 = (xf9) identityHashMap.remove(iy6Var2);
            if (xf9Var2 != null) {
                xf9Var2.a();
            }
        }
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf >= 0) {
            ld9 ld9Var3 = this.R3;
            if (ld9Var3 != null) {
                ld9Var3.d();
            }
            arrayList.remove(indexOf);
            this.g3.O(true);
            ld9 ld9Var4 = this.R3;
            if (ld9Var4 != null) {
                ld9Var4.h();
            }
        }
        we9Var.onContentChanged();
    }

    public final void n3(boolean z) {
        lk0 z2;
        int[] F4 = F4();
        if (F4 != null) {
            int i = F4[0];
            int i2 = F4[1];
            if (i != i2) {
                n4(i, i2, z);
                return;
            }
            z2 = (lk0) this.t3.get(i);
        } else {
            z2 = z2();
        }
        if (z2 != null) {
            V3(z2, z);
        }
    }

    public final boolean n4(int i, int i2, boolean z) {
        boolean z2;
        if (i >= 0 && i2 >= i) {
            ArrayList arrayList = this.t3;
            if (i2 < arrayList.size()) {
                ld9 ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                if (z) {
                    z2 = false;
                    while (i2 >= i) {
                        if (m3(i2, true, true)) {
                            z2 = true;
                        }
                        i2--;
                    }
                } else {
                    lk0 lk0Var = (lk0) arrayList.get(i);
                    if (lk0Var.c >= 1 && (i == 0 || ((lk0) arrayList.get(i - 1)).c < lk0Var.c)) {
                        return false;
                    }
                    z2 = false;
                    while (i <= i2) {
                        if (m3(i, false, true)) {
                            z2 = true;
                        }
                        i++;
                    }
                }
                if (z2) {
                    t4();
                    if (findFocus() instanceof mc9) {
                        T1();
                    } else {
                        this.g3.O(false);
                    }
                    ld9 ld9Var2 = this.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
                    }
                }
                return z2;
            }
        }
        return false;
    }

    public final mc9 o2(int i) {
        KeyEvent.Callback C4 = C4(i);
        if (C4 instanceof tb9) {
            return ((tb9) C4).getCaptionEditText();
        }
        return null;
    }

    public final void o3(lk0 lk0Var, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = lk0Var.k;
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
                lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                lk0Var2.t = longValue;
                for (int i3 = 0; i3 <= i2; i3++) {
                    lk0Var2.k.add((Long) arrayList3.get(i3));
                }
                int i4 = zh9.b;
                c4c K = c4c.K(zh9.class);
                K.H = lk0Var2;
                K.I = this.n4;
                arrayList2.add(K);
                this.x4.add(lk0Var2);
            }
        }
    }

    public final void o4(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        if (C1 instanceof vf9) {
            vf9 vf9Var = (vf9) C1;
            ArrayList arrayList = vf9Var.E;
            if (vf9Var.a != null) {
                vf9Var.p();
                if (vf9Var.a0 >= arrayList.size()) {
                    vf9Var.a0 = Math.max(0, arrayList.size() - 1);
                }
                vf9Var.q(false);
                vf9Var.requestLayout();
                vf9Var.invalidate();
            }
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.U3);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.U3);
        this.i3 = false;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = this.S3;
        boolean z2 = i6 > 0 && i5 < i6;
        super.onLayout(z, i, i2, i3, i4);
        if (z2) {
            View findFocus = findFocus();
            View F = findFocus == null ? null : F(findFocus);
            if (F != null) {
                int L = (gl.L(8.0f) + F.getBottom()) - (i5 - getPaddingBottom());
                if (L > 0) {
                    post(new nd9(this, L, (byte) 2));
                }
            }
        }
        this.S3 = i5;
    }

    public final void p2(int i) {
        lk0 lk0Var;
        int i2;
        ArrayList arrayList = this.t3;
        lk0 lk0Var2 = (lk0) arrayList.get(i);
        int i3 = lk0Var2.c;
        if (i3 <= 0) {
            return;
        }
        int i4 = i3 - 1;
        lk0Var2.c = i4;
        if (i4 == 0) {
            lk0Var2.d = 0;
            lk0Var2.e = false;
            lk0Var2.f = false;
        }
        while (true) {
            i++;
            if (i >= arrayList.size() || (i2 = (lk0Var = (lk0) arrayList.get(i)).c) <= i3) {
                return;
            } else {
                lk0Var.c = i2 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p3() {
        ld9 ld9Var;
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.d();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        lk0 lk0Var = new lk0(pageblockdetails, 0, 0);
        lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
        lk0 lk0Var3 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
        lk0Var3.i = true;
        lk0 M2 = M2();
        ArrayList arrayList = this.t3;
        int indexOf = M2 != null ? arrayList.indexOf(M2) : -1;
        if (M2 != null) {
            TL_iv.PageBlock pageBlock = M2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && M2.g == null && !M2.i && wi9.y(pageBlock).isEmpty()) {
                arrayList.remove(indexOf);
                arrayList.add(indexOf, lk0Var3);
                arrayList.add(indexOf, lk0Var2);
                arrayList.add(indexOf, lk0Var);
                this.g3.O(false);
                ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.h();
                }
                post(new sd9(this, lk0Var, (byte) 20));
            }
        }
        indexOf = indexOf >= 0 ? indexOf + 1 : arrayList.size();
        arrayList.add(indexOf, lk0Var3);
        arrayList.add(indexOf, lk0Var2);
        arrayList.add(indexOf, lk0Var);
        this.g3.O(false);
        ld9Var = this.R3;
        if (ld9Var != null) {
        }
        post(new sd9(this, lk0Var, (byte) 20));
    }

    public final void p4() {
        post(new q62(this, (byte) 3));
    }

    public final wi9 q2(int i) {
        if (i < 0) {
            return null;
        }
        View m = this.f3.m(i);
        if (m instanceof wi9) {
            return (wi9) m;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q3(lk0 lk0Var) {
        boolean z;
        int indexOf;
        int indexOf2;
        ArrayList arrayList = lk0Var.k;
        lk0 M2 = M2();
        if (M2 == null) {
            M2 = this.k4;
        }
        ArrayList arrayList2 = this.t3;
        int indexOf3 = M2 != null ? arrayList2.indexOf(M2) : -1;
        if (indexOf3 < 0 || !(M2.b instanceof TL_iv.pageBlockBlockquote)) {
            z = false;
        } else {
            long a = wb9.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) M2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.u3.put(Long.valueOf(a), richText);
            }
            M2.k.add(Long.valueOf(a));
            M2.b = new TL_iv.pageBlockParagraph();
            z = true;
        }
        boolean z2 = indexOf3 >= 0 && !M2.k.isEmpty();
        if (z2) {
            arrayList.clear();
            arrayList.addAll(M2.k);
        }
        if (indexOf3 >= 0) {
            TL_iv.PageBlock pageBlock = M2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && M2.g == null && wi9.y(pageBlock).isEmpty()) {
                arrayList2.set(indexOf3, lk0Var);
                this.k4 = lk0Var;
                indexOf = arrayList2.indexOf(lk0Var);
                if (indexOf < arrayList2.size() - 1 || A3(((lk0) arrayList2.get(indexOf + 1)).b)) {
                    lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                    if (z2) {
                        lk0Var2.k.addAll(arrayList);
                    }
                    arrayList2.add(indexOf + 1, lk0Var2);
                }
                this.g3.O(!z);
                indexOf2 = arrayList2.indexOf(lk0Var) + 1;
                if (indexOf2 > 0 || indexOf2 >= arrayList2.size() || A3(((lk0) arrayList2.get(indexOf2)).b)) {
                    return;
                }
                post(new sd9(this, (lk0) arrayList2.get(indexOf2), (byte) 17));
                return;
            }
        }
        if (indexOf3 >= 0) {
            arrayList2.add(indexOf3 + 1, lk0Var);
        } else {
            arrayList2.add(lk0Var);
        }
        this.k4 = lk0Var;
        indexOf = arrayList2.indexOf(lk0Var);
        if (indexOf < arrayList2.size() - 1) {
        }
        lk0 lk0Var22 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
        if (z2) {
        }
        arrayList2.add(indexOf + 1, lk0Var22);
        this.g3.O(!z);
        indexOf2 = arrayList2.indexOf(lk0Var) + 1;
        if (indexOf2 > 0) {
        }
    }

    public final void q4(int i) {
        ArrayList arrayList = this.t3;
        int min = Math.min(arrayList.size() - 1, i + 1);
        for (int max = Math.max(0, i - 1); max <= min; max++) {
            lk0 lk0Var = (lk0) arrayList.get(max);
            if (lk0Var.c > 0) {
                View C1 = C1(lk0Var);
                if (C1 instanceof wi9) {
                    ((wi9) C1).F();
                }
            }
        }
    }

    public final void r2() {
        C2();
        this.s3 = null;
        this.j4 = null;
        this.k4 = null;
        this.R3 = new ld9(this.w4);
        B4();
        this.R3.j();
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.L();
        }
    }

    public final void r4(lk0 lk0Var, iy6 iy6Var) {
        if (lk0Var == null) {
            return;
        }
        if (!x3(lk0Var.b)) {
            s4(lk0Var);
            return;
        }
        ArrayList c3 = c3(lk0Var.b);
        ArrayList arrayList = lk0Var.h;
        int indexOf = arrayList != null ? arrayList.indexOf(iy6Var) : -1;
        if (indexOf >= 0) {
            lk0Var.h.remove(indexOf);
            if (c3 != null && indexOf < c3.size()) {
                c3.remove(indexOf);
            }
        }
        if (lk0Var.h.isEmpty()) {
            s4(lk0Var);
            return;
        }
        int size = lk0Var.h.size();
        l5c l5cVar = this.g3;
        if (size != 1) {
            l5cVar.O(true);
            o4(lk0Var);
            return;
        }
        TL_iv.PageCaption pageCaption = lk0Var.b.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) c3.get(0);
        lk0Var.b = pageBlock;
        pageBlock.caption = pageCaption;
        lk0Var.g = (iy6) lk0Var.h.get(0);
        lk0Var.h = null;
        l5cVar.O(true);
        o4(lk0Var);
    }

    public final boolean s3() {
        int i;
        me9 me9Var = this.v3;
        if (me9Var == null || !me9Var.w() || (i = me9Var.p0) != me9Var.s0 || i < 0 || i >= this.x4.size()) {
            return false;
        }
        return C4(i) instanceof tb9;
    }

    public final void s4(lk0 lk0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.g3.O(true);
        }
    }

    public void setAdaptiveLinkDialogs(boolean z) {
        this.r3 = z;
    }

    public void setAllowTapAboveContent(boolean z) {
        this.Z3 = z;
    }

    public void setFileRefParentObject(k27 k27Var) {
        this.q3 = k27Var;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.V3 = new ArrayList();
        ArrayList arrayList = this.t3;
        S2(arrayList, dg9.b(charSequence), this.u3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.V3.add((lk0) arrayList.get(size));
        }
        this.g3.O(false);
    }

    public final boolean t2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            lk0 lk0Var = (lk0) arrayList.get(i);
            boolean z = lk0Var.i;
            ArrayList arrayList2 = lk0Var.k;
            if (!z) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    Map.-EL.merge(hashMap, (Long) arrayList2.get(i2), 1, new qz0((byte) 1));
                }
            }
            i++;
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            lk0 lk0Var2 = (lk0) arrayList.get(i3);
            ArrayList arrayList3 = lk0Var2.k;
            if (arrayList3.size() == 1 && (lk0Var2.b instanceof TL_iv.pageBlockParagraph)) {
                Long l = (Long) arrayList3.get(0);
                l.getClass();
                Integer num = (Integer) hashMap.get(l);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = lk0Var2.b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.u3.remove(l);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    lk0Var2.b = pageblockblockquote;
                    arrayList3.clear();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t4() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return;
            }
            lk0 lk0Var = (lk0) arrayList.get(i);
            if (lk0Var.c > 0 && lk0Var.d > 0 && !A3(lk0Var.b)) {
                int i2 = lk0Var.c;
                int i3 = 1;
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    lk0 lk0Var2 = (lk0) arrayList.get(i4);
                    int i5 = lk0Var2.c;
                    if (i5 < i2) {
                        break;
                    }
                    if (i5 == i2 && !A3(lk0Var2.b)) {
                        if (lk0Var2.d <= 0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                lk0Var.d = i3;
            }
            i++;
        }
    }

    public final ArrayList u2() {
        TLRPC.Document document;
        iy6 iy6Var;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            lk0 lk0Var = (lk0) arrayList2.get(i);
            if ((lk0Var.b instanceof TL_iv.pageBlockDocument) && (iy6Var = lk0Var.g) != null && iy6Var.b() && (document2 = lk0Var.g.h) != null) {
                ((TL_iv.pageBlockDocument) lk0Var.b).document_id = document2.id;
            }
            for (iy6 iy6Var2 : N3(lk0Var)) {
                if (iy6Var2.b() && (document = iy6Var2.h) != null) {
                    long j = document.id;
                    if (j != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j))) {
                        arrayList.add(iy6Var2.h);
                    }
                }
            }
            i++;
        }
    }

    public final boolean u3() {
        int i;
        me9 me9Var = this.v3;
        return me9Var != null && me9Var.w() && (i = me9Var.p0) == me9Var.s0 && t3(A4(i));
    }

    public final void u4(String str) {
        me9 me9Var = this.v3;
        S1(me9Var.p0, me9Var.r0, me9Var.s0, me9Var.u0, str.split("\n", -1));
    }

    public final ArrayList v2(int i, int i2) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                break;
            }
            for (iy6 iy6Var : N3((lk0) arrayList2.get(i))) {
                if (iy6Var.b() && (document = iy6Var.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(iy6Var.h);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final iy6 v4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document O2 = O2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (O2 != null) {
                iy6 iy6Var = new iy6();
                iy6Var.c = true;
                iy6Var.a = (byte) 2;
                iy6Var.h = O2;
                iy6Var.i = O2;
                return iy6Var;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document O22 = O2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (O22 != null) {
                iy6 iy6Var2 = new iy6();
                iy6Var2.d = true;
                iy6Var2.a = (byte) 2;
                iy6Var2.h = O22;
                return iy6Var2;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document O23 = O2(pageblockvideo.video_id);
                if (O23 != null) {
                    iy6 iy6Var3 = new iy6();
                    iy6Var3.b = true;
                    iy6Var3.a = (byte) 2;
                    iy6Var3.h = O23;
                    iy6Var3.n = pageblockvideo.spoiler;
                    for (int i = 0; i < O23.attributes.size(); i++) {
                        if (O23.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) O23.attributes.get(i);
                            iy6Var3.j = tL_documentAttributeVideo.w;
                            iy6Var3.k = tL_documentAttributeVideo.h;
                            return iy6Var3;
                        }
                    }
                    return iy6Var3;
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
                            for (iy6 iy6Var4 : N3((lk0) this.t3.get(i2))) {
                                if (iy6Var4 != null && (photo = iy6Var4.g) != null && photo.id == j) {
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
                            HashMap hashMap = wf9.a;
                            synchronized (wf9.class) {
                                photo = j == 0 ? null : (TLRPC.Photo) wf9.a.get(Long.valueOf(j));
                            }
                        }
                    }
                }
                if (photo != null) {
                    iy6 iy6Var5 = new iy6();
                    iy6Var5.a = (byte) 2;
                    iy6Var5.g = photo;
                    iy6Var5.n = pageblockphoto.spoiler;
                    TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.Y0(false), false, null, false);
                    if (w != null) {
                        iy6Var5.j = w.w;
                        iy6Var5.k = w.h;
                    }
                    return iy6Var5;
                }
            }
        }
        return null;
    }

    public final ArrayList w2(int i, int i2) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                break;
            }
            for (iy6 iy6Var : N3((lk0) arrayList2.get(i))) {
                if (iy6Var.b() && (photo = iy6Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(iy6Var.g);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final void w4(lk0 lk0Var) {
        TL_iv.PageBlock pageBlock;
        if (this.s3 == null || lk0Var == null || (pageBlock = lk0Var.b) == null) {
            return;
        }
        boolean x3 = x3(pageBlock);
        TL_iv.PageBlock pageBlock2 = lk0Var.b;
        if (!x3) {
            iy6 v4 = v4(pageBlock2);
            if (v4 != null) {
                lk0Var.g = v4;
                return;
            }
            return;
        }
        ArrayList c3 = c3(pageBlock2);
        lk0Var.h = new ArrayList();
        if (c3 != null) {
            for (int i = 0; i < c3.size(); i++) {
                iy6 v42 = v4((TL_iv.PageBlock) c3.get(i));
                ArrayList arrayList = lk0Var.h;
                if (v42 == null) {
                    v42 = new iy6();
                }
                arrayList.add(v42);
            }
        }
    }

    public final ArrayList x2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            for (iy6 iy6Var : N3((lk0) arrayList2.get(i))) {
                if (iy6Var.b() && (photo = iy6Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(iy6Var.g);
                }
            }
            i++;
        }
    }

    public final ArrayList x4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lk0 lk0Var = (lk0) obj;
            boolean x3 = x3(lk0Var.b);
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (x3) {
                ArrayList c3 = c3(pageBlock);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (c3 != null) {
                    int size2 = c3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = c3.get(i2);
                        i2++;
                        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) obj2;
                        iy6 v4 = v4(pageBlock2);
                        if (v4 != null) {
                            arrayList3.add(pageBlock2);
                            arrayList4.add(v4);
                        }
                    }
                    c3.clear();
                    c3.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    lk0Var.h = arrayList4;
                    arrayList2.add(lk0Var);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                iy6 v42 = v4(pageBlock);
                if (v42 != null) {
                    lk0Var.g = v42;
                    arrayList2.add(lk0Var);
                }
            } else {
                arrayList2.add(lk0Var);
            }
        }
        return arrayList2;
    }

    public final void y2() {
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.h();
        }
        ArrayList arrayList = this.t3;
        SpannableStringBuilder g = dg9.g(arrayList);
        C2();
        arrayList.clear();
        HashMap hashMap = this.u3;
        hashMap.clear();
        this.s3 = null;
        S2(arrayList, dg9.b(g), hashMap);
        this.g3.O(false);
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.onContentChanged();
            we9Var.L();
        }
    }

    public final void y4(int i, int i2, int i3) {
        if (i >= 0) {
            KeyEvent.Callback m = this.f3.m(i);
            if (m instanceof wi9) {
                wi9 wi9Var = (wi9) m;
                mc9 authorEditText = (i2 == 1 && wi9Var.l()) ? wi9Var.getAuthorEditText() : wi9Var.getEditText();
                authorEditText.P();
                authorEditText.setSelection(Math.max(0, Math.min(i3, authorEditText.length())));
                return;
            }
            if (!(m instanceof ii9)) {
                if (m instanceof tb9) {
                    mc9 captionEditText = ((tb9) m).getCaptionEditText();
                    captionEditText.P();
                    captionEditText.setSelection(Math.max(0, Math.min(i3, captionEditText.length())));
                    return;
                }
                return;
            }
            ii9 ii9Var = (ii9) m;
            mc9 n = ii9Var.n(i2);
            if (n == null) {
                n = ii9Var.n(0);
            }
            if (n != null) {
                n.P();
                n.setSelection(Math.max(0, Math.min(i3, n.length())));
            }
        }
    }

    public final lk0 z2() {
        int i;
        lk0 A42;
        lk0 M2 = M2();
        if (M2 != null) {
            return M2;
        }
        me9 me9Var = this.v3;
        if (me9Var == null || (i = me9Var.p0) < 0 || (A42 = A4(i)) == null) {
            return null;
        }
        return A42;
    }

    public final void z4() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof jb9) {
                jb9 jb9Var = (jb9) childAt;
                jb9Var.b.a(jb9Var.a, new k88((Object) jb9Var, (byte) 23));
            }
        }
        invalidate();
    }
}
