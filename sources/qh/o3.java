package qh;

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
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g7.a6;
import g7.e6;
import g7.v6;
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
import kh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.eb0;
import org.telegram.ui.jh0;
import org.telegram.ui.np0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o3 extends i51 {
    public static final ArrayList o4 = new ArrayList();
    public TL_iv.pageTableCell A3;
    public long B3;
    public float C3;
    public float D3;
    public boolean E3;
    public b2 F3;
    public int G3;
    public d1 H3;
    public final h I3;
    public ArrayList J3;
    public int K3;
    public int L3;
    public int M3;
    public boolean N3;
    public a O3;
    public boolean P3;
    public final g3 Q3;
    public final l2 R3;
    public final h3 S3;
    public final i3 T3;
    public final j3 U3;
    public final IdentityHashMap V3;
    public final IdentityHashMap W3;
    public a X3;
    public a Y3;
    public final k3 Z3;
    public final t2 a4;
    public final int b3;
    public final u2 b4;
    public final b6 c3;
    public final v2 c4;
    public final m3 d3;
    public final w2 d4;
    public MessageObject e3;
    public f5 e4;
    public boolean f3;
    public x60 f4;
    public TL_iv.RichMessage g3;
    public int g4;
    public final ArrayList h3;
    public int h4;
    public final HashMap i3;
    public final m2 i4;
    public final c3 j3;
    public final x2 j4;
    public final z9 k3;
    public final n2.p k4;
    public int l3;
    public final ArrayList l4;
    public int m3;
    public dl0 m4;
    public int n3;
    public int n4;
    public boolean o3;
    public float p3;
    public float q3;
    public float r3;
    public float s3;
    public View t3;
    public b u3;
    public boolean v3;
    public boolean w3;
    public boolean x3;
    public boolean y3;
    public TL_iv.pageTableCell z3;

    public o3(Context context, int i9, b6 b6Var, m3 m3Var) {
        super(context, i9, 0, false, new b8(r1, 28), new kh.p(r1, 23), null, b6Var);
        this.f3 = true;
        this.h3 = new ArrayList();
        this.i3 = new HashMap();
        this.l3 = -1;
        this.m3 = -1;
        this.n3 = 0;
        this.I3 = new h(this, 2);
        this.N3 = true;
        this.Q3 = new g3(this);
        this.R3 = new l2(this);
        this.S3 = new h3(this);
        this.T3 = new i3(this);
        this.U3 = new j3(this);
        this.V3 = new IdentityHashMap();
        this.W3 = new IdentityHashMap();
        this.Z3 = new k3(this);
        this.a4 = new t2(this);
        this.b4 = new u2(this);
        this.c4 = new v2(this);
        this.d4 = new w2(this);
        this.g4 = -1;
        this.h4 = -1;
        this.i4 = new m2(this);
        this.j4 = new x2(this);
        n2.p pVar = new n2.p(this, 17);
        this.k4 = pVar;
        this.l4 = new ArrayList();
        this.n4 = -1;
        o3[] o3VarArr = {this};
        this.b3 = i9;
        this.c3 = b6Var;
        this.d3 = m3Var;
        this.U2.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        B1(new b8(this, 29), false);
        setReorderLongPressEnabled(false);
        w1(true);
        c3 c3Var = new c3(this, m3Var);
        this.j3 = c3Var;
        c3Var.T(this);
        c3Var.E0 = this.T2;
        z9 o6 = c3Var.o(context);
        this.k3 = o6;
        AndroidUtilities.removeFromParent(o6);
        c3Var.D = new e3(this, m3Var);
        j(new eh.n(9, this, m3Var));
        this.F3 = new b2(pVar);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        return (E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || B3(pageBlock);
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockButtonRow) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    public static boolean F3(a aVar) {
        return aVar != null && !aVar.i && !x3(aVar) && (aVar.b instanceof TL_iv.pageBlockParagraph) && aVar.c == 0 && aVar.d == 0 && !aVar.e && aVar.k.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0128, code lost:
    
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0154, code lost:
    
        r22.L();
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I1(o3[] o3VarArr, ArrayList arrayList, z41 z41Var) {
        int i9;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        int i10;
        o3 o3Var = o3VarArr[0];
        if (o3Var != null) {
            ArrayList arrayList3 = o3Var.h3;
            o3Var.a2();
            ArrayList arrayList4 = o3Var.l4;
            arrayList4.clear();
            HashMap hashMap = new HashMap();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i9 = 1;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(i11);
                boolean z12 = aVar.i;
                ArrayList arrayList5 = aVar.k;
                if (!z12) {
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        Map.-EL.merge(hashMap, (Long) arrayList5.get(i13), 1, new p2());
                    }
                    if (aVar.b instanceof TL_iv.pageBlockParagraph) {
                        i12++;
                    }
                }
                i11++;
            }
            boolean z13 = i12 == 1;
            ArrayList arrayList6 = new ArrayList();
            int i14 = -1;
            int i15 = 0;
            boolean z14 = false;
            a aVar2 = null;
            int i16 = -1;
            while (i15 < arrayList3.size()) {
                a aVar3 = (a) arrayList3.get(i15);
                boolean z15 = aVar3.i;
                ArrayList arrayList7 = aVar3.k;
                if (z15) {
                    boolean z16 = i16 != i14;
                    if (!arrayList6.isEmpty()) {
                        aa.d.u(i9, arrayList6);
                    }
                    if (i16 == i14 || arrayList6.size() >= i16) {
                        if (!z16) {
                            if (z14) {
                                z41Var.L();
                                z14 = false;
                            }
                            int i17 = r0.a;
                            l41 J = l41.J(r0.class);
                            J.G = aVar3;
                            arrayList.add(J);
                            arrayList4.add(aVar3);
                        }
                        z10 = z13;
                        arrayList2 = arrayList6;
                    } else {
                        z10 = z13;
                        arrayList2 = arrayList6;
                        i16 = -1;
                    }
                } else {
                    boolean z17 = i16 != i14;
                    if (x3(aVar3)) {
                        if (!z17) {
                            boolean z18 = ((TL_iv.pageBlockDetails) aVar3.b).open;
                            if (!arrayList6.isEmpty() || z18) {
                                if (z14) {
                                    z41Var.L();
                                    z14 = false;
                                }
                            } else if (!z14) {
                                z41Var.M();
                                z14 = true;
                            }
                            w2 w2Var = o3Var.d4;
                            int i18 = p0.a;
                            l41 J2 = l41.J(p0.class);
                            J2.G = aVar3;
                            J2.H = w2Var;
                            arrayList.add(J2);
                            arrayList4.add(aVar3);
                            if (!z18) {
                                i16 = arrayList6.size() + 1;
                            }
                        }
                        arrayList6.add(aVar3);
                    } else if (!z17) {
                        if (aVar2 != null) {
                            ArrayList arrayList8 = aVar2.k;
                            int size = arrayList8.size();
                            int i19 = 0;
                            while (true) {
                                z10 = z13;
                                if (i19 >= size || i19 >= arrayList7.size()) {
                                    break;
                                }
                                arrayList2 = arrayList6;
                                if (!((Long) arrayList8.get(i19)).equals(arrayList7.get(i19))) {
                                    break;
                                }
                                i19++;
                                z13 = z10;
                                arrayList6 = arrayList2;
                            }
                            int i20 = size - 1;
                            while (i20 >= i19) {
                                Long l10 = (Long) arrayList8.get(i20);
                                l10.getClass();
                                Integer num = (Integer) hashMap.get(l10);
                                if (num != null) {
                                    i10 = i19;
                                    if (num.intValue() >= 2 || i20 > 0 || o3Var.i3.containsKey(l10)) {
                                    }
                                } else {
                                    i10 = i19;
                                }
                                i20--;
                                i19 = i10;
                            }
                        } else {
                            z10 = z13;
                            arrayList2 = arrayList6;
                        }
                        if (aVar2 != null) {
                            o3Var.s3(aVar2, arrayList7, hashMap, arrayList);
                        }
                        if (arrayList2.isEmpty()) {
                            if (!z14) {
                                z41Var.M();
                                z14 = true;
                            }
                        } else if (z14) {
                            z41Var.L();
                            z14 = false;
                        }
                        TL_iv.PageBlock pageBlock = aVar3.b;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            l2 l2Var = o3Var.R3;
                            int i21 = t0.a;
                            l41 J3 = l41.J(t0.class);
                            J3.G = aVar3;
                            J3.H = l2Var;
                            arrayList.add(J3);
                        } else if (D3(pageBlock)) {
                            h3 h3Var = o3Var.S3;
                            int i22 = k4.a;
                            l41 J4 = l41.J(k4.class);
                            J4.d = (int) aVar3.a;
                            J4.G = aVar3;
                            J4.H = h3Var;
                            arrayList.add(J4);
                        } else {
                            TL_iv.PageBlock pageBlock2 = aVar3.b;
                            if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                i3 i3Var = o3Var.T3;
                                int i23 = w.a;
                                l41 J5 = l41.J(w.class);
                                J5.G = aVar3;
                                J5.H = i3Var;
                                arrayList.add(J5);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                j3 j3Var = o3Var.U3;
                                int i24 = v0.a;
                                l41 J6 = l41.J(v0.class);
                                J6.G = aVar3;
                                J6.H = j3Var;
                                arrayList.add(J6);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                k3 k3Var = o3Var.Z3;
                                int i25 = e4.a;
                                l41 J7 = l41.J(e4.class);
                                J7.G = aVar3;
                                J7.H = k3Var;
                                arrayList.add(J7);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                t2 t2Var = o3Var.a4;
                                int i26 = g4.a;
                                l41 J8 = l41.J(g4.class);
                                J8.G = aVar3;
                                J8.H = t2Var;
                                arrayList.add(J8);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                v2 v2Var = o3Var.c4;
                                int i27 = d5.a;
                                l41 J9 = l41.J(d5.class);
                                J9.G = aVar3;
                                J9.H = v2Var;
                                arrayList.add(J9);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                g3 g3Var = o3Var.Q3;
                                int i28 = d0.a;
                                l41 J10 = l41.J(d0.class);
                                J10.G = aVar3;
                                J10.H = g3Var;
                                arrayList.add(J10);
                            } else {
                                aVar3.p = i15 == 0;
                                aVar3.q = z10 && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                if (arrayList3.size() == 2 && i15 == 1 && (aVar3.b instanceof TL_iv.pageBlockParagraph) && (((a) arrayList3.get(0)).b instanceof TL_iv.pageBlockHeading1)) {
                                    z11 = true;
                                    x2 x2Var = o3Var.j4;
                                    int i29 = q5.a;
                                    l41 J11 = l41.J(q5.class);
                                    J11.G = aVar3;
                                    J11.H = x2Var;
                                    J11.r = z11;
                                    arrayList.add(J11);
                                    arrayList4.add(aVar3);
                                    aVar2 = aVar3;
                                }
                                z11 = false;
                                x2 x2Var2 = o3Var.j4;
                                int i292 = q5.a;
                                l41 J112 = l41.J(q5.class);
                                J112.G = aVar3;
                                J112.H = x2Var2;
                                J112.r = z11;
                                arrayList.add(J112);
                                arrayList4.add(aVar3);
                                aVar2 = aVar3;
                            }
                        }
                        arrayList4.add(aVar3);
                        aVar2 = aVar3;
                    }
                    z10 = z13;
                    arrayList2 = arrayList6;
                }
                i15++;
                z13 = z10;
                arrayList6 = arrayList2;
                i9 = 1;
                i14 = -1;
            }
            if (z14) {
                z41Var.L();
            }
            if (aVar2 != null) {
                o3Var.s3(aVar2, o4, hashMap, arrayList);
            }
            int i30 = 0;
            while (i30 < arrayList4.size()) {
                a aVar4 = (a) arrayList4.get(i30);
                aVar4.n = false;
                aVar4.o = false;
                aVar4.l = 0;
                aVar4.m = 0;
                int size2 = aVar4.k.size();
                if (size2 != 0) {
                    a aVar5 = i30 > 0 ? (a) arrayList4.get(i30 - 1) : null;
                    int i31 = i30 + 1;
                    a aVar6 = i31 < arrayList4.size() ? (a) arrayList4.get(i31) : null;
                    aVar4.l = size2 - l4(aVar4, aVar5);
                    int l42 = size2 - l4(aVar4, aVar6);
                    aVar4.m = l42;
                    aVar4.n = aVar4.l > 0;
                    aVar4.o = l42 > 0;
                }
                i30++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J2(ArrayList arrayList, a aVar) {
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            s sVar = aVar.g;
            if (sVar == null || !sVar.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock2 = aVar.b;
            if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                if (pageBlock2.caption == null) {
                    pageBlock2.caption = new TL_iv.PageCaption();
                    aVar.b.caption.text = new TL_iv.textEmpty();
                    aVar.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            s sVar2 = aVar.g;
            if (sVar2 == null || !sVar2.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock3 = aVar.b;
            if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                if (pageBlock3.caption == null) {
                    pageBlock3.caption = new TL_iv.PageCaption();
                    aVar.b.caption.text = new TL_iv.textEmpty();
                    aVar.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (B3(pageBlock)) {
            ArrayList g32 = g3(aVar.b);
            List Q3 = Q3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i9 = 0; g32 != null && i9 < g32.size() && i9 < Q3.size(); i9++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) g32.get(i9);
                if (((s) Q3.get(i9)).b()) {
                    if ((pageBlock4 instanceof TL_iv.pageBlockPhoto ? ((TL_iv.pageBlockPhoto) pageBlock4).photo_id : pageBlock4 instanceof TL_iv.pageBlockVideo ? ((TL_iv.pageBlockVideo) pageBlock4).video_id : 0L) != 0) {
                        h0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
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
            if (aVar.b instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                pageblockslideshow.items = arrayList2;
                pageblockslideshow.caption = aVar.b.caption;
                pageblockcollage = pageblockslideshow;
            } else {
                TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                pageblockcollage2.items = arrayList2;
                pageblockcollage2.caption = aVar.b.caption;
                pageblockcollage = pageblockcollage2;
            }
            h0.d(pageblockcollage);
            arrayList.add(pageblockcollage);
            return;
        }
        TL_iv.PageBlock pageBlock5 = aVar.b;
        if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
            s sVar3 = aVar.g;
            if (sVar3 == null || !sVar3.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock6 = aVar.b;
            if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                if (pageBlock6.caption == null) {
                    pageBlock6.caption = new TL_iv.PageCaption();
                    aVar.b.caption.text = new TL_iv.textEmpty();
                    aVar.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
            s sVar4 = aVar.g;
            if (sVar4 != null && (document = sVar4.h) != null) {
                ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.id;
            }
            if (sVar4 == null || !sVar4.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = aVar.b;
            if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                h0.d(pageBlock7);
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
            int i10 = f4.I;
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
        if (pageBlock5 instanceof TL_iv.pageBlockMath) {
            if (TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock5).source)) {
                return;
            }
            arrayList.add(aVar.b);
            return;
        }
        if (!(pageBlock5 instanceof TL_iv.pageBlockTable)) {
            if (!(pageBlock5 instanceof TL_iv.pageBlockButtonRow)) {
                arrayList.add(pageBlock5);
                return;
            }
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock5;
            ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(pageblockbuttonrow);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock5;
        if (pageblocktable.title == null) {
            pageblocktable.title = new TL_iv.textEmpty();
        }
        if (pageblocktable.rows != null) {
            for (int i11 = 0; i11 < pageblocktable.rows.size(); i11++) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i11);
                if (pagetablerow.cells != null) {
                    for (int i12 = 0; i12 < pagetablerow.cells.size(); i12++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i12);
                        if (pagetablecell.text == null) {
                            w5.c(pagetablecell, "");
                        } else {
                            pagetablecell.flags |= 128;
                        }
                        pagetablecell.flags = pagetablecell.colspan > 1 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                    }
                }
            }
        }
        if (O4(pageblocktable)) {
            arrayList.add(pageblocktable);
        }
    }

    public static void K1(o3 o3Var, int i9, int i10, int i11) {
        if (i9 < 0) {
            return;
        }
        KeyEvent.Callback m10 = o3Var.T2.m(i9);
        if (m10 instanceof s5) {
            s5 s5Var = (s5) m10;
            d1 authorEditText = (i10 == 1 && s5Var.n()) ? s5Var.getAuthorEditText() : s5Var.getEditText();
            authorEditText.s();
            authorEditText.setSelection(Math.max(0, Math.min(i11, authorEditText.length())));
            return;
        }
        if (!(m10 instanceof f5)) {
            if (m10 instanceof i0) {
                d1 captionEditText = ((i0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i11, captionEditText.length())));
                return;
            }
            return;
        }
        f5 f5Var = (f5) m10;
        d1 l10 = f5Var.l(i10);
        if (l10 == null) {
            l10 = f5Var.l(0);
        }
        if (l10 == null) {
            return;
        }
        l10.s();
        l10.setSelection(Math.max(0, Math.min(i11, l10.length())));
    }

    public static boolean K2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r4 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.PageBlock L1(o3 o3Var, a aVar, int i9, int i10) {
        TL_iv.PageBlock TLdeserialize;
        o3Var.getClass();
        if (!A3(aVar.b)) {
            return null;
        }
        Editable M4 = o3Var.M4(aVar);
        int length = M4.length();
        int max = Math.max(0, Math.min(i9, length));
        if (i10 >= 0) {
            length = Math.max(0, Math.min(i10, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M4.subSequence(Math.min(max, length), Math.max(max, length)));
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock != null) {
            try {
                L2(pageBlock);
                SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
                pageBlock.serializeToStream(serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
                TLdeserialize = TL_iv.PageBlock.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                serializedData.cleanup();
                serializedData2.cleanup();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        TLdeserialize = new TL_iv.pageBlockParagraph();
        TLdeserialize.text = new TL_iv.textEmpty();
        s5.e(TLdeserialize, spannableStringBuilder);
        return TLdeserialize;
    }

    public static void L2(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
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

    public static void M1(o3 o3Var, d1 d1Var) {
        if (d1Var == null) {
            o3Var.getClass();
            return;
        }
        d1Var.adaptiveCreateLinkDialog = o3Var.f3;
        d1Var.setInlineButtonContext(o3Var.b3);
        d1Var.setInlineButtonClickListener(new m2(o3Var));
    }

    public static void N1(a aVar, s sVar, o3 o3Var) {
        m3 m3Var = o3Var.d3;
        IdentityHashMap identityHashMap = o3Var.W3;
        IdentityHashMap identityHashMap2 = o3Var.V3;
        if (sVar != null) {
            r4 r4Var = (r4) identityHashMap2.remove(sVar);
            if (r4Var != null) {
                r4Var.b();
            }
            n4 n4Var = (n4) identityHashMap.remove(sVar);
            if (n4Var != null) {
                n4Var.a();
            }
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            o3Var.q4(aVar, sVar);
            b2 b2Var2 = o3Var.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            m3Var.onContentChanged();
            return;
        }
        ArrayList arrayList = o3Var.h3;
        for (s sVar2 : Q3(aVar)) {
            r4 r4Var2 = (r4) identityHashMap2.remove(sVar2);
            if (r4Var2 != null) {
                r4Var2.b();
            }
            n4 n4Var2 = (n4) identityHashMap.remove(sVar2);
            if (n4Var2 != null) {
                n4Var2.a();
            }
        }
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            b2 b2Var3 = o3Var.F3;
            if (b2Var3 != null) {
                b2Var3.d();
            }
            arrayList.remove(indexOf);
            o3Var.U2.N(true);
            b2 b2Var4 = o3Var.F3;
            if (b2Var4 != null) {
                b2Var4.h();
            }
        }
        m3Var.onContentChanged();
    }

    public static void N2(ArrayList arrayList, ArrayList arrayList2, int i9, boolean z10, int i10, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i11);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        S1(arrayList, null, i9, i10, z11, z12);
                        z13 = true;
                    }
                    O2(arrayList, pageBlock, i9 + 1);
                } else if (z13) {
                    arrayList.add(new a(pageBlock, i9, z10 ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        S1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i9, i10, z11, z12);
                    } else {
                        a aVar = new a(pageBlock, i9, i10);
                        aVar.e = z11;
                        aVar.f = z12;
                        arrayList.add(aVar);
                    }
                    z13 = true;
                }
            }
        }
        if (z13) {
            return;
        }
        S1(arrayList, null, i9, i10, z11, z12);
    }

    public static TL_iv.PageBlock N3(a aVar, s sVar) {
        if (!B3(aVar.b)) {
            return aVar.b;
        }
        ArrayList g32 = g3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(sVar) : -1;
        if (indexOf < 0 || g32 == null || indexOf >= g32.size()) {
            return null;
        }
        return (TL_iv.PageBlock) g32.get(indexOf);
    }

    public static void O1(o3 o3Var) {
        if (o3Var.E3) {
            return;
        }
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.h();
        }
        o3Var.d3.h0();
        o3Var.o4();
    }

    public static void O2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i9) {
        int i10 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i10 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i10);
                i10++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    S1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i9, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    N2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i9, false, 0, pageListItem2.checkbox, pageListItem2.checked);
                }
            }
            return;
        }
        ArrayList<TL_iv.PageListOrderedItem> arrayList3 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
        int size2 = arrayList3.size();
        int i11 = 1;
        while (i10 < size2) {
            TL_iv.PageListOrderedItem pageListOrderedItem = arrayList3.get(i10);
            i10++;
            TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
            if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                S1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i9, i11, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i12 = i11;
                N2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i9, true, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                i11 = i12;
            }
            i11++;
        }
    }

    public static boolean O4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(u5.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i9 = 0; i9 < pageblocktable.rows.size(); i9++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i9);
            for (int i10 = 0; i10 < pagetablerow.cells.size(); i10++) {
                if (!w5.g(pagetablerow.cells.get(i10)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void P1(o3 o3Var, a aVar) {
        ArrayList arrayList = o3Var.h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.k.addAll(aVar.k);
        arrayList.add(indexOf + 1, aVar2);
        o3Var.s4();
        o3Var.U2.N(false);
        b2 b2Var2 = o3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        o3Var.post(new i2(o3Var, aVar2, 23));
    }

    public static FrameLayout P4(f5 f5Var, boolean z10) {
        i5 m10;
        w5 model = f5Var.getModel();
        if (model != null) {
            int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = z10 ? -1 : ConnectionsManager.DEFAULT_DATACENTER_ID;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : f5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o6 = z10 ? (w5.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o6 < i10 || (o6 == i10 && a2 < i9) : o6 > i10 || (o6 == i10 && a2 < i9)) {
                    pagetablecell = pagetablecell2;
                    i9 = a2;
                    i10 = o6;
                }
            }
            if (pagetablecell != null && (m10 = f5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return f5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        if (((java.lang.Long) r7.k.get(r9)).longValue() == r11) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0118, code lost:
    
        if (((java.lang.Long) r7.k.get(r9)).longValue() == r11) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Q1(o3 o3Var, a aVar, boolean z10) {
        int i9;
        d1 editText;
        Editable text;
        b2 b2Var;
        b2 b2Var2;
        int i10;
        ArrayList arrayList = o3Var.l4;
        z41 z41Var = o3Var.U2;
        ArrayList arrayList2 = o3Var.h3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList3 = aVar.k;
            if (C3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote)) {
                o3Var.U4(aVar, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
                return true;
            }
            if (aVar.c > 0) {
                b2 b2Var3 = o3Var.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                View z12 = o3Var.z1(aVar);
                if (z12 instanceof s5) {
                    s5 s5Var = (s5) z12;
                    if (s5Var.getEditText().isFocused()) {
                        i10 = s5Var.getEditText().getSelectionEnd();
                        o3Var.t2(indexOf);
                        o3Var.s4();
                        if (o3Var.findFocus() instanceof d1) {
                            z41Var.N(false);
                            b2 b2Var4 = o3Var.F3;
                            if (b2Var4 != null) {
                                b2Var4.h();
                            }
                            o3Var.post(new s2(o3Var, aVar, 1));
                            return true;
                        }
                        o3Var.X1();
                        b2 b2Var5 = o3Var.F3;
                        if (b2Var5 != null) {
                            b2Var5.h();
                        }
                        if (i10 >= 0) {
                            o3Var.post(new k2(o3Var, aVar, i10, 2));
                            return true;
                        }
                    }
                }
                i10 = -1;
                o3Var.t2(indexOf);
                o3Var.s4();
                if (o3Var.findFocus() instanceof d1) {
                }
            } else {
                if (!arrayList3.isEmpty() && z10) {
                    ArrayList arrayList4 = ((a) arrayList2.get(indexOf)).k;
                    if (!arrayList4.isEmpty()) {
                        int size = arrayList4.size() - 1;
                        long longValue = ((Long) arrayList4.get(size)).longValue();
                        if (indexOf != 0) {
                            a aVar2 = (a) arrayList2.get(indexOf - 1);
                            if (aVar2.k.size() > size) {
                            }
                        }
                        b2Var = o3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        arrayList3.remove(arrayList3.size() - 1);
                        o3Var.x2();
                        o3Var.s4();
                        z41Var.N(false);
                        b2Var2 = o3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        o3Var.post(new s2(o3Var, aVar, 2));
                        return true;
                    }
                    ArrayList arrayList5 = ((a) arrayList2.get(indexOf)).k;
                    if (!arrayList5.isEmpty()) {
                        int size2 = arrayList5.size() - 1;
                        long longValue2 = ((Long) arrayList5.get(size2)).longValue();
                        int i11 = indexOf + 1;
                        if (i11 < arrayList2.size()) {
                            a aVar3 = (a) arrayList2.get(i11);
                            if (aVar3.k.size() > size2) {
                            }
                        }
                    }
                    b2Var = o3Var.F3;
                    if (b2Var != null) {
                    }
                    arrayList3.remove(arrayList3.size() - 1);
                    o3Var.x2();
                    o3Var.s4();
                    z41Var.N(false);
                    b2Var2 = o3Var.F3;
                    if (b2Var2 != null) {
                    }
                    o3Var.post(new s2(o3Var, aVar, 2));
                    return true;
                }
                if (indexOf > 0) {
                    int i12 = indexOf - 1;
                    a aVar4 = (a) arrayList2.get(i12);
                    if (x3(aVar4) || aVar4.i) {
                        if (z10 && (!x3(aVar4) || ((i9 = indexOf + 1) < arrayList2.size() && !((a) arrayList2.get(i9)).i))) {
                            b2 b2Var6 = o3Var.F3;
                            if (b2Var6 != null) {
                                b2Var6.d();
                            }
                            arrayList2.remove(indexOf);
                            o3Var.s4();
                            z41Var.N(false);
                            b2 b2Var7 = o3Var.F3;
                            if (b2Var7 != null) {
                                b2Var7.h();
                            }
                            o3Var.post(new s2(o3Var, aVar4, 3));
                        }
                    } else {
                        if (E3(aVar4.b)) {
                            b2 b2Var8 = o3Var.F3;
                            if (b2Var8 != null) {
                                b2Var8.d();
                            }
                            arrayList2.remove(i12);
                            o3Var.s4();
                            z41Var.N(false);
                            b2 b2Var9 = o3Var.F3;
                            if (b2Var9 != null) {
                                b2Var9.h();
                            }
                            o3Var.post(new s2(o3Var, aVar, 4));
                            return true;
                        }
                        b2 b2Var10 = o3Var.F3;
                        if (b2Var10 != null) {
                            b2Var10.d();
                        }
                        View z13 = o3Var.z1(aVar4);
                        int indexOf2 = arrayList.indexOf(aVar);
                        if (!(z13 instanceof s5) || indexOf2 < 0) {
                            SpannableStringBuilder A = s5.A(aVar4.b);
                            int length = A.length();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A);
                            spannableStringBuilder.append((CharSequence) s5.A(aVar.b));
                            s5.e(aVar4.b, spannableStringBuilder);
                            arrayList2.remove(indexOf);
                            o3Var.x2();
                            o3Var.s4();
                            z41Var.N(false);
                            b2 b2Var11 = o3Var.F3;
                            if (b2Var11 != null) {
                                b2Var11.h();
                            }
                            o3Var.post(new k2(o3Var, aVar4, length, 5));
                            return true;
                        }
                        s5 s5Var2 = (s5) z13;
                        d1 editText2 = s5Var2.getEditText();
                        int length2 = editText2.length();
                        SpannableStringBuilder A2 = s5.A(aVar.b);
                        Editable text2 = editText2.getText();
                        if (text2 != null && A2 != null && A2.length() != 0) {
                            editText2.h = true;
                            text2.append((CharSequence) A2);
                            editText2.h = false;
                        }
                        s5.e(aVar4.b, editText2.getText());
                        View z14 = o3Var.z1(aVar);
                        if ((z14 instanceof s5) && (text = (editText = ((s5) z14).getEditText()).getText()) != null && text.length() > 0) {
                            editText.h = true;
                            text.delete(0, text.length());
                            editText.h = false;
                        }
                        s5Var2.B();
                        editText2.setSelection(Math.max(0, Math.min(length2, editText2.length())));
                        arrayList2.remove(indexOf);
                        boolean x22 = o3Var.x2();
                        o3Var.s4();
                        if (x22) {
                            z41Var.N(false);
                            b2 b2Var12 = o3Var.F3;
                            if (b2Var12 != null) {
                                b2Var12.h();
                            }
                            o3Var.post(new k2(o3Var, aVar4, Math.max(0, length2), 4));
                            return true;
                        }
                        z41Var.S();
                        o3Var.p4(indexOf);
                        f2.w0 itemAnimator = o3Var.getItemAnimator();
                        o3Var.setItemAnimator(null);
                        z41Var.u(indexOf2);
                        if ((aVar4.d > 0 || aVar.d > 0) && indexOf2 < arrayList.size()) {
                            z41Var.q(indexOf2, arrayList.size() - indexOf2);
                        }
                        o3Var.post(new r2(o3Var, itemAnimator, 1));
                        b2 b2Var13 = o3Var.F3;
                        if (b2Var13 != null) {
                            b2Var13.h();
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static List Q3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (B3(aVar.b)) {
            ArrayList arrayList = aVar.h;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        s sVar = aVar.g;
        return sVar != null ? Collections.singletonList(sVar) : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d1 R3(View view) {
        if (view instanceof s5) {
            return ((s5) view).getEditText();
        }
        if (view instanceof i0) {
            return ((i0) view).getCaptionEditText();
        }
        if (view instanceof q0) {
            return ((q0) view).getEditText();
        }
        return null;
    }

    public static void S1(ArrayList arrayList, TL_iv.RichText richText, int i9, int i10, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i9, i10);
        aVar.e = z10;
        aVar.f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock S3(TL_iv.PageBlock pageBlock) {
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

    public static s T3(MediaController.PhotoEntry photoEntry, String str) {
        s sVar = new s();
        sVar.b = photoEntry.isVideo;
        sVar.e = str;
        sVar.j = photoEntry.width;
        sVar.k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        boolean z10 = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        sVar.l = z10 ? 0 : photoEntry.orientation;
        sVar.m = z10 ? 0 : photoEntry.invert;
        sVar.a = 1;
        sVar.f = 0.0f;
        return sVar;
    }

    public static f5 U2(d1 d1Var) {
        for (ViewParent parent = d1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof f5) {
                return (f5) parent;
            }
        }
        return null;
    }

    public static void W2(ArrayList arrayList, ArrayList arrayList2, java.util.Map map) {
        TL_iv.RichText richText;
        if (arrayList2 == null) {
            return;
        }
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                O2(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                arrayList.add(new a(pageblockdetails, 0, 0));
                int size2 = arrayList.size();
                W2(arrayList, pageblockdetails.blocks, map);
                if (arrayList.size() == size2) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar.i = true;
                arrayList.add(aVar);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                long a2 = m0.a();
                W2(arrayList, pageblockblockquoteblocks.blocks, map);
                for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                    ((a) arrayList.get(size3)).k.add(0, Long.valueOf(a2));
                }
                if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                    map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                }
            } else {
                arrayList.add(new a(pageBlock, 0, 0));
            }
        }
    }

    public static ArrayList X2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        W2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void Z1(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] a5(f5 f5Var) {
        w5 w5Var = f5Var.B;
        for (int size = w5Var != null ? w5Var.g.size() : 0; size >= 0; size--) {
            d1 l10 = f5Var.l(size);
            int length = l10 != null ? l10.length() : 0;
            if (length > 0) {
                return new int[]{size, length};
            }
        }
        return null;
    }

    public static ArrayList g3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean h4(d1 d1Var, float f10, float f11) {
        if (d1Var != null && d1Var.getVisibility() == 0) {
            d1Var.getLocationOnScreen(new int[2]);
            float f12 = f10 - r1[0];
            float f13 = f11 - r1[1];
            if (f12 >= 0.0f && f13 >= 0.0f && f12 <= d1Var.getWidth() && f13 <= d1Var.getHeight()) {
                int offsetForPosition = d1Var.getOffsetForPosition(f12, f13);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                d1Var.s();
                d1Var.setSelection(Math.max(0, Math.min(offsetForPosition, d1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int k4(int i9, a aVar, boolean z10) {
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        return org.telegram.messenger.l0.D(16.0f, Math.max(0, i9 - (aVar.k.size() - (z10 ? aVar.l : aVar.m))), AndroidUtilities.dp(2.0f));
    }

    public static boolean l3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || D3(pageBlock);
    }

    public static int l4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.k;
        int i9 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i9 < min && ((Long) arrayList.get(i9)).equals(arrayList2.get(i9))) {
            i9++;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setEditTextsLocked(boolean z10) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                ((s5) childAt).setLocked(z10);
            } else if (childAt instanceof f5) {
                ((f5) childAt).setLocked(z10);
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof q0) {
                ((q0) childAt).setLocked(z10);
            } else if (childAt instanceof u0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean v3(int i9) {
        return i9 == 21 || i9 == 22 || i9 == 19 || i9 == 20;
    }

    public static int w2(int i9) {
        if (i9 == 4) {
            return 114971;
        }
        if (i9 == 16384) {
            return 32772;
        }
        if (i9 == 32768) {
            return LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD;
        }
        return 4;
    }

    public static boolean x3(a aVar) {
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockDetails);
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !s5.z(pageBlock).isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean A1() {
        return this.P3;
    }

    public final ArrayList A2(int i9, int i10) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i9 <= i10) {
            ArrayList arrayList2 = this.h3;
            if (i9 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i9))) {
                if (sVar.b() && (photo = sVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(sVar.g);
                }
            }
            i9++;
        }
        return arrayList;
    }

    public final View A4(int i9) {
        if (i9 < 0) {
            return null;
        }
        return this.T2.m(i9);
    }

    public final ArrayList B2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.h3;
            if (i9 >= arrayList2.size()) {
                return arrayList;
            }
            for (s sVar : Q3((a) arrayList2.get(i9))) {
                if (sVar.b() && (photo = sVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(sVar.g);
                }
            }
            i9++;
        }
    }

    public final int[] B4() {
        ArrayList arrayList = this.h3;
        c3 c3Var = this.j3;
        if (c3Var == null || !c3Var.y()) {
            a Q2 = Q2();
            int indexOf = Q2 != null ? arrayList.indexOf(Q2) : -1;
            if (indexOf >= 0) {
                return new int[]{indexOf, indexOf};
            }
            return null;
        }
        int indexOf2 = arrayList.indexOf(y4(c3Var.u0));
        int indexOf3 = arrayList.indexOf(y4(c3Var.x0));
        if (indexOf2 < 0 || indexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(indexOf2, indexOf3), Math.max(indexOf2, indexOf3)};
    }

    @Override // org.telegram.ui.Components.i51
    public final void C1() {
        m3 m3Var = this.d3;
        if (m3Var != null) {
            m3Var.V0();
        }
    }

    public final void C2() {
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.h();
        }
        ArrayList arrayList = this.h3;
        SpannableStringBuilder k10 = t4.k(arrayList);
        G2();
        arrayList.clear();
        HashMap hashMap = this.i3;
        hashMap.clear();
        this.g3 = null;
        W2(arrayList, t4.b(k10), hashMap);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        m3 m3Var = this.d3;
        if (m3Var != null) {
            m3Var.onContentChanged();
            m3Var.N1();
        }
    }

    public final boolean C4() {
        c3 c3Var = this.j3;
        if (c3Var != null && c3Var.y()) {
            if (L3()) {
                int i9 = c3Var.u0;
                int i10 = c3Var.v0;
                int i11 = c3Var.y0;
                int i12 = c3Var.w0;
                int i13 = c3Var.z0;
                int i14 = i10;
                while (i14 <= i11) {
                    d1 N4 = N4(i9, i14);
                    if (N4 != null) {
                        int length = N4.length();
                        int i15 = i14 == i10 ? i12 : 0;
                        int i16 = i14 == i11 ? i13 : length;
                        if (i10 == i11) {
                            i15 = Math.min(i12, i13);
                            i16 = Math.max(i12, i13);
                        }
                        if (Math.max(0, Math.min(i15, length)) < Math.max(0, Math.min(i16, length))) {
                            return true;
                        }
                    }
                    i14++;
                }
            } else if (y3()) {
                d1 I2 = I2(c3Var.u0);
                if (I2 != null && Math.max(0, Math.min(Math.min(c3Var.w0, c3Var.z0), I2.length())) < Math.max(0, Math.min(Math.max(c3Var.w0, c3Var.z0), I2.length()))) {
                    return true;
                }
            } else if (w3()) {
                d1 s22 = s2(c3Var.u0);
                if (s22 != null) {
                    int i17 = c3Var.w0;
                    int i18 = c3Var.z0;
                    if (Math.max(0, Math.min(Math.min(i17, i18), s22.length())) < Math.max(0, Math.min(Math.max(i17, i18), s22.length()))) {
                        return true;
                    }
                }
            } else if (G3()) {
                d1 j42 = j4(c3Var.u0);
                if (j42 != null) {
                    int i19 = c3Var.w0;
                    int i20 = c3Var.z0;
                    if (Math.max(0, Math.min(Math.min(i19, i20), j42.length())) < Math.max(0, Math.min(Math.max(i19, i20), j42.length()))) {
                        return true;
                    }
                }
            } else {
                int i21 = c3Var.u0;
                int i22 = c3Var.x0;
                int i23 = c3Var.w0;
                int i24 = c3Var.z0;
                if (i21 >= 0 && i22 >= 0 && i22 >= i21 && i22 < this.l4.size()) {
                    int i25 = i21;
                    while (i25 <= i22) {
                        a y42 = y4(i25);
                        if (y42 != null) {
                            if (y42.t == 0) {
                                TL_iv.PageBlock pageBlock = y42.b;
                                if (!A3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int i26 = i2(i25);
                            if (Math.max(0, Math.min(i25 == i21 ? i23 : 0, i26)) < Math.max(0, Math.min(i25 == i22 ? i24 : i26, i26))) {
                                return true;
                            }
                        }
                        i25++;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.i51
    public final void D1() {
        m3 m3Var = this.d3;
        if (m3Var != null) {
            m3Var.v1();
        }
        x4();
    }

    public final a D2() {
        int i9;
        a y42;
        a Q2 = Q2();
        if (Q2 != null) {
            return Q2;
        }
        c3 c3Var = this.j3;
        if (c3Var == null || (i9 = c3Var.u0) < 0 || (y42 = y4(i9)) == null) {
            return null;
        }
        return y42;
    }

    public final int[] D4() {
        c3 c3Var = this.j3;
        if (c3Var == null) {
            return null;
        }
        int i9 = c3Var.u0;
        int i10 = c3Var.x0;
        if (i9 < 0 || i10 < 0) {
            return null;
        }
        a y42 = y4(i9);
        a y43 = y4(i10);
        if (y42 == null || y43 == null) {
            return null;
        }
        ArrayList arrayList = this.h3;
        int indexOf = arrayList.indexOf(y42);
        int indexOf2 = arrayList.indexOf(y43);
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            indexOf = indexOf2;
            indexOf2 = indexOf;
        }
        return new int[]{indexOf, indexOf2};
    }

    @Override // org.telegram.ui.Components.i51
    public final void E1(f2.q1 q1Var) {
        m3 m3Var = this.d3;
        if (m3Var == null || q1Var == null) {
            return;
        }
        View view = q1Var.a;
        view.getLocationOnScreen(new int[2]);
        view.getWidth();
        this.P3 = m3Var.n(view.getHeight() + r1[1]);
    }

    public final void E2() {
        ArrayList arrayList;
        c3 c3Var = this.j3;
        int i9 = c3Var.u0;
        int i10 = c3Var.w0;
        int i11 = c3Var.x0;
        if (W1(i9, i10, i11, c3Var.z0, new String[]{""})) {
            return;
        }
        if (i9 > i11) {
            i11 = i9;
            i9 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        int max = Math.max(0, i9);
        while (true) {
            arrayList = this.h3;
            if (max > i11) {
                break;
            }
            ArrayList arrayList3 = this.l4;
            if (max >= arrayList3.size()) {
                break;
            }
            a aVar = (a) arrayList3.get(max);
            if (aVar.t == 0 && arrayList.indexOf(aVar) >= 0) {
                arrayList2.add(aVar);
            }
            max++;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        int indexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap hashMap = this.i3;
        if (!hashMap.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                hashSet.addAll(((a) arrayList.get(i12)).k);
            }
            hashMap.keySet().retainAll(hashSet);
        }
        x2();
        V3();
        s4();
        c3Var.f(false);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        post(new i2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
    }

    public final void E4(d1 d1Var) {
        d1Var.adaptiveCreateLinkDialog = this.f3;
        d1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override // org.telegram.ui.Components.i51
    public final void F1(f2.q1 q1Var) {
        a aVar = this.O3;
        this.O3 = null;
        this.P3 = false;
        if (aVar == null) {
            if (q1Var != null) {
                View view = q1Var.a;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        r4(aVar);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        m3 m3Var = this.d3;
        if (m3Var != null) {
            m3Var.onContentChanged();
        }
    }

    public final boolean F2() {
        c3 c3Var = this.j3;
        if (c3Var != null && c3Var.y()) {
            c3Var.f(false);
            return true;
        }
        if (this.e4 == null) {
            return false;
        }
        M2();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04cc A[LOOP:13: B:176:0x04ca->B:177:0x04cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04dd A[LOOP:14: B:180:0x04db->B:181:0x04dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a8 A[EDGE_INSN: B:242:0x04a8->B:155:0x04a8 BREAK  A[LOOP:10: B:144:0x0484->B:232:0x0484], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x047f A[EDGE_INSN: B:254:0x047f->B:143:0x047f BREAK  A[LOOP:9: B:132:0x045b->B:244:0x045b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd A[LOOP:3: B:45:0x00c7->B:47:0x00cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130 A[LOOP:4: B:53:0x012a->B:55:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216 A[LOOP:8: B:96:0x0210->B:98:0x0216, LOOP_END] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F4(f5 f5Var) {
        int i9;
        int i10;
        HashSet hashSet;
        Iterator<TL_iv.pageTableCell> it;
        boolean z10;
        HashSet hashSet2;
        Iterator<TL_iv.pageTableCell> it2;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        int i11;
        int i12;
        boolean z14;
        boolean z15;
        x60 x60Var;
        LinkedHashSet linkedHashSet;
        int i13;
        int dp;
        int[] iArr;
        boolean z16;
        int i14;
        int i15;
        int i16;
        boolean z17;
        Iterator it3;
        Iterator it4;
        int i17;
        int i18;
        int i19;
        final int i20;
        final int i21;
        boolean z18;
        String string;
        final ?? r92;
        final x60 x60Var2;
        int i22;
        int i23;
        int i24;
        HashSet hashSet3;
        Iterator<TL_iv.pageTableCell> it5;
        boolean z19;
        boolean equals;
        final f5 f5Var2 = f5Var;
        final w5 model = f5Var2.getModel();
        LinkedHashSet linkedHashSet2 = f5Var2.D;
        if (model == null) {
            return;
        }
        TL_iv.pageBlockTable pageblocktable = model.a;
        Set<TL_iv.pageTableCell> selectedCells = f5Var2.getSelectedCells();
        if (selectedCells.isEmpty()) {
            return;
        }
        int size = selectedCells.size();
        if (size >= 2) {
            int i25 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i26 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i27 = -1;
            int i28 = -1;
            for (TL_iv.pageTableCell pagetablecell : selectedCells) {
                int b10 = model.b(pagetablecell);
                int a2 = model.a(pagetablecell);
                int o6 = w5.o(pagetablecell);
                int i29 = pagetablecell.colspan;
                if (i29 == 0) {
                    i29 = 1;
                }
                i25 = Math.min(i25, b10);
                i26 = Math.min(i26, a2);
                i27 = Math.max(i27, (b10 + o6) - 1);
                i28 = Math.max(i28, (a2 + i29) - 1);
            }
            HashSet hashSet4 = new HashSet();
            loop1: while (i25 <= i27) {
                for (int i30 = i26; i30 <= i28; i30++) {
                    if (i25 < 0 || i30 < 0 || i25 >= model.b || i30 >= model.c) {
                        equals = false;
                        break loop1;
                    }
                    hashSet4.add(model.d[i25][i30]);
                }
                i25++;
            }
            equals = hashSet4.equals(new HashSet(selectedCells));
            if (equals) {
                i9 = 1;
                if (size == 1) {
                    TL_iv.pageTableCell next = selectedCells.iterator().next();
                    if (w5.n(next) <= 1) {
                        int i31 = next.rowspan;
                        if (i31 == 0) {
                            i31 = 1;
                        }
                        if (i31 <= 1) {
                            z19 = false;
                            if (z19) {
                                i10 = 1;
                                hashSet = new HashSet();
                                it = selectedCells.iterator();
                                while (it.hasNext()) {
                                    hashSet.add(Integer.valueOf(model.b(it.next())));
                                }
                                if (!hashSet.isEmpty()) {
                                    Iterator it6 = hashSet.iterator();
                                    loop18: while (it6.hasNext()) {
                                        int intValue = ((Integer) it6.next()).intValue();
                                        if (intValue >= 0 && intValue < model.b) {
                                            for (int i32 = 0; i32 < model.c; i32++) {
                                                if (model.e[intValue][i32] == intValue && selectedCells.contains(model.d[intValue][i32])) {
                                                }
                                            }
                                        }
                                    }
                                    z10 = true;
                                    hashSet2 = new HashSet();
                                    it2 = selectedCells.iterator();
                                    while (it2.hasNext()) {
                                        hashSet2.add(Integer.valueOf(model.a(it2.next())));
                                    }
                                    if (!hashSet2.isEmpty()) {
                                        Iterator it7 = hashSet2.iterator();
                                        loop16: while (it7.hasNext()) {
                                            int intValue2 = ((Integer) it7.next()).intValue();
                                            if (intValue2 >= 0 && intValue2 < model.c) {
                                                for (int i33 = 0; i33 < model.b; i33++) {
                                                    if (model.f[i33][intValue2] == intValue2 && selectedCells.contains(model.d[i33][intValue2])) {
                                                    }
                                                }
                                            }
                                        }
                                        z11 = true;
                                        if (!selectedCells.isEmpty() || model.b <= 0 || model.c <= 0) {
                                            z12 = false;
                                        } else {
                                            HashSet hashSet5 = new HashSet();
                                            for (int i34 = 0; i34 < model.b; i34++) {
                                                for (int i35 = 0; i35 < model.c; i35++) {
                                                    hashSet5.add(model.d[i34][i35]);
                                                }
                                            }
                                            z12 = hashSet5.equals(new HashSet(selectedCells));
                                        }
                                        z13 = z12 || (model.b == 1 && model.c == 1);
                                        if (z10 || z12) {
                                            c10 = 1;
                                        } else {
                                            HashSet hashSet6 = new HashSet();
                                            Iterator<TL_iv.pageTableCell> it8 = selectedCells.iterator();
                                            while (it8.hasNext()) {
                                                hashSet6.add(Integer.valueOf(model.b(it8.next())));
                                            }
                                            c10 = 1;
                                            if (hashSet6.size() < model.b) {
                                                i11 = 1;
                                                if (z11 && !z12) {
                                                    hashSet3 = new HashSet();
                                                    it5 = selectedCells.iterator();
                                                    while (it5.hasNext()) {
                                                        hashSet3.add(Integer.valueOf(model.a(it5.next())));
                                                    }
                                                    if (hashSet3.size() < model.c) {
                                                        i12 = 1;
                                                        z14 = !z13 && z11 && model.c < MessagesController.getInstance(this.b3).config.richMessageMaxTableCols.get();
                                                        z15 = !z13 && z10;
                                                        x60Var = this.f4;
                                                        if (x60Var != null) {
                                                            linkedHashSet = linkedHashSet2;
                                                            this.f4 = null;
                                                            x60Var.u();
                                                        } else {
                                                            linkedHashSet = linkedHashSet2;
                                                        }
                                                        i13 = i9;
                                                        dp = AndroidUtilities.dp(((i9 + 1 + i10 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i12 + i11 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                        FrameLayout P4 = P4(f5Var2, false);
                                                        iArr = new int[2];
                                                        P4.getLocationOnScreen(iArr);
                                                        if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                                            z16 = true;
                                                        } else {
                                                            z16 = true;
                                                            P4 = P4(f5Var2, true);
                                                        }
                                                        x60 J1 = this.d3.J1(P4);
                                                        J1.s = 0;
                                                        J1.t = false;
                                                        J1.Z = z16;
                                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                                        linearLayout.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                                        linearLayout.setOrientation(1);
                                                        i14 = i12;
                                                        TextView textView = new TextView(getContext());
                                                        textView.setText(LocaleController.getString(R.string.ArticleAlignment));
                                                        textView.setTextSize(1, 12.0f);
                                                        textView.setGravity(17);
                                                        textView.setTextColor(f6.v0(f6.y6, this.l2));
                                                        linearLayout.addView(textView, e6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                                                        i15 = i10;
                                                        i16 = i11;
                                                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                                        linearLayout2.setOrientation(0);
                                                        linearLayout.addView(linearLayout2, e6.q(-2, -2, 17));
                                                        Context context = getContext();
                                                        int i36 = R.drawable.iv_align_horiz_left;
                                                        b6 b6Var = this.c3;
                                                        t1 t1Var = new t1(context, i36, b6Var);
                                                        t1Var.e = 4;
                                                        t1Var.d();
                                                        t1Var.b();
                                                        int i37 = f6.G8;
                                                        t1Var.c(i37);
                                                        boolean z20 = z10;
                                                        linearLayout2.addView(t1Var, e6.n(32, 32));
                                                        t1 t1Var2 = new t1(getContext(), R.drawable.iv_align_horiz_middle, b6Var);
                                                        t1Var2.e = 4;
                                                        t1Var2.d();
                                                        t1Var2.b();
                                                        t1Var2.c(i37);
                                                        linearLayout2.addView(t1Var2, e6.n(32, 32));
                                                        t1 t1Var3 = new t1(getContext(), R.drawable.iv_align_horiz_right, b6Var);
                                                        t1Var3.e = 4;
                                                        t1Var3.d();
                                                        t1Var3.b();
                                                        t1Var3.c(i37);
                                                        final t1[] t1VarArr = {t1Var, t1Var2, t1Var3};
                                                        boolean z21 = z11;
                                                        linearLayout2.addView(t1Var3, e6.n(32, 32));
                                                        z17 = z12;
                                                        linearLayout2.addView(new Space(getContext()), e6.n(8, 0));
                                                        t1 t1Var4 = new t1(getContext(), R.drawable.iv_align_vert_top, b6Var);
                                                        t1Var4.e = 4;
                                                        t1Var4.d();
                                                        t1Var4.b();
                                                        t1Var4.c(i37);
                                                        linearLayout2.addView(t1Var4, e6.n(32, 32));
                                                        t1 t1Var5 = new t1(getContext(), R.drawable.iv_align_vert_middle, b6Var);
                                                        t1Var5.e = 4;
                                                        t1Var5.d();
                                                        t1Var5.b();
                                                        t1Var5.c(i37);
                                                        linearLayout2.addView(t1Var5, e6.n(32, 32));
                                                        t1 t1Var6 = new t1(getContext(), R.drawable.iv_align_vert_bottom, b6Var);
                                                        t1Var6.e = 4;
                                                        t1Var6.d();
                                                        t1Var6.b();
                                                        t1Var6.c(i37);
                                                        final t1[] t1VarArr2 = {t1Var4, t1Var5, t1Var6};
                                                        linearLayout2.addView(t1Var6, e6.n(32, 32));
                                                        J1.q(linearLayout);
                                                        it3 = linkedHashSet.iterator();
                                                        int i38 = -1;
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                break;
                                                            }
                                                            TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) it3.next();
                                                            if (pagetablecell2 != null) {
                                                                if (pagetablecell2.align_right) {
                                                                    i24 = 2;
                                                                } else if (pagetablecell2.align_center) {
                                                                    i24 = 1;
                                                                }
                                                                if (i38 == -1) {
                                                                    if (i38 != i24) {
                                                                        i38 = -1;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i38 = i24;
                                                                }
                                                            }
                                                            i24 = 0;
                                                            if (i38 == -1) {
                                                            }
                                                        }
                                                        it4 = linkedHashSet.iterator();
                                                        int i39 = -1;
                                                        while (true) {
                                                            if (!it4.hasNext()) {
                                                                break;
                                                            }
                                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) it4.next();
                                                            if (pagetablecell3 != null) {
                                                                if (pagetablecell3.valign_bottom) {
                                                                    i23 = 2;
                                                                } else if (pagetablecell3.valign_middle) {
                                                                    i23 = 1;
                                                                }
                                                                if (i39 == -1) {
                                                                    if (i39 != i23) {
                                                                        i39 = -1;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i39 = i23;
                                                                }
                                                            }
                                                            i23 = 0;
                                                            if (i39 == -1) {
                                                            }
                                                        }
                                                        i17 = 0;
                                                        while (i17 < 3) {
                                                            t1VarArr[i17].setSelected(i17 == i38);
                                                            i17++;
                                                        }
                                                        i19 = 0;
                                                        while (i19 < 3) {
                                                            t1VarArr2[i19].setSelected(i19 == i39);
                                                            i19++;
                                                        }
                                                        for (i20 = 0; i20 < 3; i20++) {
                                                            final int i40 = 0;
                                                            t1VarArr[i20].setOnClickListener(new View.OnClickListener() { // from class: qh.f2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i40) {
                                                                        case 0:
                                                                            f5 f5Var3 = f5Var2;
                                                                            h5 h5Var = f5Var3.v;
                                                                            Iterator it9 = f5Var3.D.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i41 = i20;
                                                                                if (!hasNext) {
                                                                                    h5Var.invalidate();
                                                                                    v2 v2Var = f5Var3.A;
                                                                                    if (v2Var != null && f5Var3.a != null) {
                                                                                        v2Var.a();
                                                                                    }
                                                                                    int i42 = 0;
                                                                                    while (i42 < 3) {
                                                                                        t1VarArr[i42].setSelected(i42 == i41);
                                                                                        i42++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    w5.k(pagetablecell4, i41);
                                                                                    i5 m10 = h5Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            f5 f5Var4 = f5Var2;
                                                                            h5 h5Var2 = f5Var4.v;
                                                                            Iterator it10 = f5Var4.D.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i43 = i20;
                                                                                if (!hasNext2) {
                                                                                    h5Var2.invalidate();
                                                                                    v2 v2Var2 = f5Var4.A;
                                                                                    if (v2Var2 != null && f5Var4.a != null) {
                                                                                        v2Var2.a();
                                                                                    }
                                                                                    int i44 = 0;
                                                                                    while (i44 < 3) {
                                                                                        t1VarArr[i44].setSelected(i44 == i43);
                                                                                        i44++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    w5.m(pagetablecell5, i43);
                                                                                    i5 m11 = h5Var2.m(pagetablecell5);
                                                                                    if (m11 != null && m11.b != null) {
                                                                                        m11.a();
                                                                                        m11.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                        i21 = 0;
                                                        for (i18 = 3; i21 < i18; i18 = 3) {
                                                            final int i41 = 1;
                                                            t1VarArr2[i21].setOnClickListener(new View.OnClickListener() { // from class: qh.f2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i41) {
                                                                        case 0:
                                                                            f5 f5Var3 = f5Var2;
                                                                            h5 h5Var = f5Var3.v;
                                                                            Iterator it9 = f5Var3.D.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i412 = i21;
                                                                                if (!hasNext) {
                                                                                    h5Var.invalidate();
                                                                                    v2 v2Var = f5Var3.A;
                                                                                    if (v2Var != null && f5Var3.a != null) {
                                                                                        v2Var.a();
                                                                                    }
                                                                                    int i42 = 0;
                                                                                    while (i42 < 3) {
                                                                                        t1VarArr2[i42].setSelected(i42 == i412);
                                                                                        i42++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    w5.k(pagetablecell4, i412);
                                                                                    i5 m10 = h5Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            f5 f5Var4 = f5Var2;
                                                                            h5 h5Var2 = f5Var4.v;
                                                                            Iterator it10 = f5Var4.D.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i43 = i21;
                                                                                if (!hasNext2) {
                                                                                    h5Var2.invalidate();
                                                                                    v2 v2Var2 = f5Var4.A;
                                                                                    if (v2Var2 != null && f5Var4.a != null) {
                                                                                        v2Var2.a();
                                                                                    }
                                                                                    int i44 = 0;
                                                                                    while (i44 < 3) {
                                                                                        t1VarArr2[i44].setSelected(i44 == i43);
                                                                                        i44++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    w5.m(pagetablecell5, i43);
                                                                                    i5 m11 = h5Var2.m(pagetablecell5);
                                                                                    if (m11 != null && m11.b != null) {
                                                                                        m11.a();
                                                                                        m11.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            i21++;
                                                        }
                                                        J1.o();
                                                        J1.S = 208;
                                                        if (!linkedHashSet.isEmpty()) {
                                                            Iterator it9 = linkedHashSet.iterator();
                                                            while (it9.hasNext()) {
                                                                if (!((TL_iv.pageTableCell) it9.next()).header) {
                                                                }
                                                            }
                                                            z18 = true;
                                                            if (!z18) {
                                                                string = LocaleController.getString(R.string.ArticleRemoveHighlight);
                                                            } else if (z17 || !(size <= 1 || z21 || z20)) {
                                                                string = LocaleController.getString(R.string.ArticleHighlightCells);
                                                            } else {
                                                                string = LocaleController.getString(z21 ? R.string.ArticleHighlightColumn : z20 ? R.string.ArticleHighlightRow : R.string.ArticleHighlightCell);
                                                            }
                                                            J1.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new np0(this, f5Var2, z18, 13), false);
                                                            if (i13 != 0) {
                                                                final int i42 = 2;
                                                                J1.c(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable(this) { // from class: qh.g2
                                                                    public final /* synthetic */ o3 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        o3 o3Var;
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        o3 o3Var2;
                                                                        boolean z23;
                                                                        switch (i42) {
                                                                            case 0:
                                                                                o3 o3Var3 = this.b;
                                                                                o3Var3.getClass();
                                                                                f5 f5Var3 = f5Var2;
                                                                                LinkedHashSet linkedHashSet3 = f5Var3.D;
                                                                                if (f5Var3.B == null || linkedHashSet3.isEmpty()) {
                                                                                    o3Var = o3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i43 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = f5Var3.B.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i43 = Math.min(i43, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    w5 w5Var = f5Var3.B;
                                                                                    w5Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        o3Var = o3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w5Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w5Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w5Var.b];
                                                                                                int i44 = 0;
                                                                                                for (int i45 = 0; i45 < w5Var.b; i45++) {
                                                                                                    iArr2[i45] = i44;
                                                                                                    if (!zArr[i45]) {
                                                                                                        i44++;
                                                                                                    }
                                                                                                }
                                                                                                if (i44 == 0) {
                                                                                                    w5Var.a.rows.clear();
                                                                                                    w5Var.i();
                                                                                                    o3Var = o3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w5Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i46 = 0;
                                                                                                    while (i46 < size2) {
                                                                                                        Object obj = arrayList2.get(i46);
                                                                                                        i46++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w5Var.b(pagetablecell4);
                                                                                                        int a3 = w5Var.a(pagetablecell4);
                                                                                                        int o9 = w5.o(pagetablecell4);
                                                                                                        int i47 = pagetablecell4.colspan;
                                                                                                        if (i47 == 0) {
                                                                                                            i47 = 1;
                                                                                                        }
                                                                                                        int i48 = -1;
                                                                                                        o3 o3Var4 = o3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i49 = 0;
                                                                                                        for (int i50 = b13; i50 < b13 + o9 && i50 < w5Var.b; i50++) {
                                                                                                            if (!zArr[i50]) {
                                                                                                                if (i48 < 0) {
                                                                                                                    i48 = i50;
                                                                                                                }
                                                                                                                i49++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i48 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i48], a3, i49, i47});
                                                                                                        }
                                                                                                        o3Var3 = o3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    o3Var = o3Var3;
                                                                                                    w5Var.j(identityHashMap, i44);
                                                                                                    w5Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var3.v();
                                                                                    if (z22) {
                                                                                        f5Var3.q(i43, 0);
                                                                                    }
                                                                                }
                                                                                o3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                o3 o3Var5 = this.b;
                                                                                o3Var5.getClass();
                                                                                a row = f5Var2.getRow();
                                                                                o3Var5.M2();
                                                                                if (row != null) {
                                                                                    b2 b2Var = o3Var5.F3;
                                                                                    if (b2Var != null) {
                                                                                        b2Var.d();
                                                                                    }
                                                                                    o3Var5.r4(row);
                                                                                    b2 b2Var2 = o3Var5.F3;
                                                                                    if (b2Var2 != null) {
                                                                                        b2Var2.h();
                                                                                    }
                                                                                    m3 m3Var = o3Var5.d3;
                                                                                    if (m3Var != null) {
                                                                                        m3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                f5 f5Var4 = f5Var2;
                                                                                LinkedHashSet linkedHashSet4 = f5Var4.D;
                                                                                if (f5Var4.B != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i52 = Math.min(i52, f5Var4.B.b(pagetablecell5));
                                                                                        i53 = Math.min(i53, f5Var4.B.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    w5 w5Var2 = f5Var4.B;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i55 = -1;
                                                                                        int i56 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = w5Var2.b(pagetablecell6);
                                                                                            int a10 = w5Var2.a(pagetablecell6);
                                                                                            int o10 = w5.o(pagetablecell6);
                                                                                            int i57 = pagetablecell6.colspan;
                                                                                            if (i57 == 0) {
                                                                                                i57 = 1;
                                                                                            }
                                                                                            i51 = Math.min(i51, b14);
                                                                                            i54 = Math.min(i54, a10);
                                                                                            i55 = Math.max(i55, (b14 + o10) - 1);
                                                                                            i56 = Math.max(i56, (a10 + i57) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i58 = i51;
                                                                                        while (true) {
                                                                                            if (i58 <= i55) {
                                                                                                for (int i59 = i54; i59 <= i56; i59++) {
                                                                                                    if (i58 >= 0 && i59 >= 0 && i58 < w5Var2.b && i59 < w5Var2.c) {
                                                                                                        hashSet9.add(w5Var2.d[i58][i59]);
                                                                                                    }
                                                                                                }
                                                                                                i58++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new bg.l0(w5Var2, 4));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i60 = 0;
                                                                                                while (i60 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i60);
                                                                                                    i60++;
                                                                                                    String g10 = w5.g((TL_iv.pageTableCell) obj2);
                                                                                                    if (g10.isEmpty()) {
                                                                                                        arrayList = arrayList3;
                                                                                                    } else {
                                                                                                        if (sb2.length() > 0) {
                                                                                                            arrayList = arrayList3;
                                                                                                            sb2.append("\n");
                                                                                                        } else {
                                                                                                            arrayList = arrayList3;
                                                                                                        }
                                                                                                        sb2.append(g10);
                                                                                                    }
                                                                                                    arrayList3 = arrayList;
                                                                                                }
                                                                                                TL_iv.pageTableCell pagetablecell7 = w5Var2.d[i51][i54];
                                                                                                int i61 = (i56 - i54) + 1;
                                                                                                int i62 = (i55 - i51) + 1;
                                                                                                if (i61 <= 1) {
                                                                                                    i61 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i61;
                                                                                                int i63 = i62 > 1 ? i62 : 0;
                                                                                                pagetablecell7.rowspan = i63;
                                                                                                int i64 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i61 > 0 ? i64 | 2 : i64 & (-3);
                                                                                                int i65 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i65 | 4 : i65 & (-5);
                                                                                                w5.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = w5Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                w5Var2.i();
                                                                                                f5Var4.v();
                                                                                                f5Var4.v.invalidate();
                                                                                                f5Var4.q(i52, i53);
                                                                                                f5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                f5 f5Var5 = f5Var2;
                                                                                LinkedHashSet linkedHashSet5 = f5Var5.D;
                                                                                if (f5Var5.B != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (w5.n(pagetablecell9) <= 1) {
                                                                                        int i66 = pagetablecell9.rowspan;
                                                                                        if (i66 == 0) {
                                                                                            i66 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = f5Var5.B.b(pagetablecell9);
                                                                                    int a11 = f5Var5.B.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (f5Var5.B.p(pagetablecell9)) {
                                                                                        f5Var5.v();
                                                                                        f5Var5.v.invalidate();
                                                                                        f5Var5.q(b15, a11);
                                                                                        f5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                f5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                f5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                f5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                f5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                o3 o3Var6 = this.b;
                                                                                o3Var6.getClass();
                                                                                f5 f5Var6 = f5Var2;
                                                                                LinkedHashSet linkedHashSet6 = f5Var6.D;
                                                                                if (f5Var6.B == null || linkedHashSet6.isEmpty()) {
                                                                                    o3Var2 = o3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a12 = f5Var6.B.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a12));
                                                                                        i67 = Math.min(i67, a12);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    w5 w5Var3 = f5Var6.B;
                                                                                    w5Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        o3Var2 = o3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w5Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w5Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w5Var3.c];
                                                                                                int i68 = 0;
                                                                                                for (int i69 = 0; i69 < w5Var3.c; i69++) {
                                                                                                    iArr4[i69] = i68;
                                                                                                    if (!zArr2[i69]) {
                                                                                                        i68++;
                                                                                                    }
                                                                                                }
                                                                                                if (i68 == 0) {
                                                                                                    w5Var3.a.rows.clear();
                                                                                                    w5Var3.i();
                                                                                                    o3Var2 = o3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w5Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i70 = 0;
                                                                                                    while (i70 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i70);
                                                                                                        i70++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w5Var3.b(pagetablecell10);
                                                                                                        int a13 = w5Var3.a(pagetablecell10);
                                                                                                        int o11 = w5.o(pagetablecell10);
                                                                                                        int i71 = pagetablecell10.colspan;
                                                                                                        if (i71 == 0) {
                                                                                                            i71 = 1;
                                                                                                        }
                                                                                                        int i72 = -1;
                                                                                                        o3 o3Var7 = o3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i73 = 0;
                                                                                                        for (int i74 = a13; i74 < a13 + i71 && i74 < w5Var3.c; i74++) {
                                                                                                            if (!zArr3[i74]) {
                                                                                                                if (i72 < 0) {
                                                                                                                    i72 = i74;
                                                                                                                }
                                                                                                                i73++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i72 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i72], o11, i73});
                                                                                                        }
                                                                                                        o3Var6 = o3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    o3Var2 = o3Var6;
                                                                                                    w5Var3.j(identityHashMap2, w5Var3.b);
                                                                                                    w5Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var6.v();
                                                                                    if (z23) {
                                                                                        f5Var6.q(0, i67);
                                                                                    }
                                                                                }
                                                                                o3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i15 != 0) {
                                                                final int i43 = 3;
                                                                J1.c(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable(this) { // from class: qh.g2
                                                                    public final /* synthetic */ o3 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        o3 o3Var;
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        o3 o3Var2;
                                                                        boolean z23;
                                                                        switch (i43) {
                                                                            case 0:
                                                                                o3 o3Var3 = this.b;
                                                                                o3Var3.getClass();
                                                                                f5 f5Var3 = f5Var2;
                                                                                LinkedHashSet linkedHashSet3 = f5Var3.D;
                                                                                if (f5Var3.B == null || linkedHashSet3.isEmpty()) {
                                                                                    o3Var = o3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i432 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = f5Var3.B.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i432 = Math.min(i432, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    w5 w5Var = f5Var3.B;
                                                                                    w5Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        o3Var = o3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w5Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w5Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w5Var.b];
                                                                                                int i44 = 0;
                                                                                                for (int i45 = 0; i45 < w5Var.b; i45++) {
                                                                                                    iArr2[i45] = i44;
                                                                                                    if (!zArr[i45]) {
                                                                                                        i44++;
                                                                                                    }
                                                                                                }
                                                                                                if (i44 == 0) {
                                                                                                    w5Var.a.rows.clear();
                                                                                                    w5Var.i();
                                                                                                    o3Var = o3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w5Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i46 = 0;
                                                                                                    while (i46 < size2) {
                                                                                                        Object obj = arrayList2.get(i46);
                                                                                                        i46++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w5Var.b(pagetablecell4);
                                                                                                        int a3 = w5Var.a(pagetablecell4);
                                                                                                        int o9 = w5.o(pagetablecell4);
                                                                                                        int i47 = pagetablecell4.colspan;
                                                                                                        if (i47 == 0) {
                                                                                                            i47 = 1;
                                                                                                        }
                                                                                                        int i48 = -1;
                                                                                                        o3 o3Var4 = o3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i49 = 0;
                                                                                                        for (int i50 = b13; i50 < b13 + o9 && i50 < w5Var.b; i50++) {
                                                                                                            if (!zArr[i50]) {
                                                                                                                if (i48 < 0) {
                                                                                                                    i48 = i50;
                                                                                                                }
                                                                                                                i49++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i48 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i48], a3, i49, i47});
                                                                                                        }
                                                                                                        o3Var3 = o3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    o3Var = o3Var3;
                                                                                                    w5Var.j(identityHashMap, i44);
                                                                                                    w5Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var3.v();
                                                                                    if (z22) {
                                                                                        f5Var3.q(i432, 0);
                                                                                    }
                                                                                }
                                                                                o3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                o3 o3Var5 = this.b;
                                                                                o3Var5.getClass();
                                                                                a row = f5Var2.getRow();
                                                                                o3Var5.M2();
                                                                                if (row != null) {
                                                                                    b2 b2Var = o3Var5.F3;
                                                                                    if (b2Var != null) {
                                                                                        b2Var.d();
                                                                                    }
                                                                                    o3Var5.r4(row);
                                                                                    b2 b2Var2 = o3Var5.F3;
                                                                                    if (b2Var2 != null) {
                                                                                        b2Var2.h();
                                                                                    }
                                                                                    m3 m3Var = o3Var5.d3;
                                                                                    if (m3Var != null) {
                                                                                        m3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                f5 f5Var4 = f5Var2;
                                                                                LinkedHashSet linkedHashSet4 = f5Var4.D;
                                                                                if (f5Var4.B != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i52 = Math.min(i52, f5Var4.B.b(pagetablecell5));
                                                                                        i53 = Math.min(i53, f5Var4.B.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    w5 w5Var2 = f5Var4.B;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i55 = -1;
                                                                                        int i56 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = w5Var2.b(pagetablecell6);
                                                                                            int a10 = w5Var2.a(pagetablecell6);
                                                                                            int o10 = w5.o(pagetablecell6);
                                                                                            int i57 = pagetablecell6.colspan;
                                                                                            if (i57 == 0) {
                                                                                                i57 = 1;
                                                                                            }
                                                                                            i51 = Math.min(i51, b14);
                                                                                            i54 = Math.min(i54, a10);
                                                                                            i55 = Math.max(i55, (b14 + o10) - 1);
                                                                                            i56 = Math.max(i56, (a10 + i57) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i58 = i51;
                                                                                        while (true) {
                                                                                            if (i58 <= i55) {
                                                                                                for (int i59 = i54; i59 <= i56; i59++) {
                                                                                                    if (i58 >= 0 && i59 >= 0 && i58 < w5Var2.b && i59 < w5Var2.c) {
                                                                                                        hashSet9.add(w5Var2.d[i58][i59]);
                                                                                                    }
                                                                                                }
                                                                                                i58++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new bg.l0(w5Var2, 4));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i60 = 0;
                                                                                                while (i60 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i60);
                                                                                                    i60++;
                                                                                                    String g10 = w5.g((TL_iv.pageTableCell) obj2);
                                                                                                    if (g10.isEmpty()) {
                                                                                                        arrayList = arrayList3;
                                                                                                    } else {
                                                                                                        if (sb2.length() > 0) {
                                                                                                            arrayList = arrayList3;
                                                                                                            sb2.append("\n");
                                                                                                        } else {
                                                                                                            arrayList = arrayList3;
                                                                                                        }
                                                                                                        sb2.append(g10);
                                                                                                    }
                                                                                                    arrayList3 = arrayList;
                                                                                                }
                                                                                                TL_iv.pageTableCell pagetablecell7 = w5Var2.d[i51][i54];
                                                                                                int i61 = (i56 - i54) + 1;
                                                                                                int i62 = (i55 - i51) + 1;
                                                                                                if (i61 <= 1) {
                                                                                                    i61 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i61;
                                                                                                int i63 = i62 > 1 ? i62 : 0;
                                                                                                pagetablecell7.rowspan = i63;
                                                                                                int i64 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i61 > 0 ? i64 | 2 : i64 & (-3);
                                                                                                int i65 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i65 | 4 : i65 & (-5);
                                                                                                w5.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = w5Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                w5Var2.i();
                                                                                                f5Var4.v();
                                                                                                f5Var4.v.invalidate();
                                                                                                f5Var4.q(i52, i53);
                                                                                                f5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                f5 f5Var5 = f5Var2;
                                                                                LinkedHashSet linkedHashSet5 = f5Var5.D;
                                                                                if (f5Var5.B != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (w5.n(pagetablecell9) <= 1) {
                                                                                        int i66 = pagetablecell9.rowspan;
                                                                                        if (i66 == 0) {
                                                                                            i66 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = f5Var5.B.b(pagetablecell9);
                                                                                    int a11 = f5Var5.B.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (f5Var5.B.p(pagetablecell9)) {
                                                                                        f5Var5.v();
                                                                                        f5Var5.v.invalidate();
                                                                                        f5Var5.q(b15, a11);
                                                                                        f5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                f5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                f5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                f5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                f5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                o3 o3Var6 = this.b;
                                                                                o3Var6.getClass();
                                                                                f5 f5Var6 = f5Var2;
                                                                                LinkedHashSet linkedHashSet6 = f5Var6.D;
                                                                                if (f5Var6.B == null || linkedHashSet6.isEmpty()) {
                                                                                    o3Var2 = o3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a12 = f5Var6.B.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a12));
                                                                                        i67 = Math.min(i67, a12);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    w5 w5Var3 = f5Var6.B;
                                                                                    w5Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        o3Var2 = o3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w5Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w5Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w5Var3.c];
                                                                                                int i68 = 0;
                                                                                                for (int i69 = 0; i69 < w5Var3.c; i69++) {
                                                                                                    iArr4[i69] = i68;
                                                                                                    if (!zArr2[i69]) {
                                                                                                        i68++;
                                                                                                    }
                                                                                                }
                                                                                                if (i68 == 0) {
                                                                                                    w5Var3.a.rows.clear();
                                                                                                    w5Var3.i();
                                                                                                    o3Var2 = o3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w5Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i70 = 0;
                                                                                                    while (i70 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i70);
                                                                                                        i70++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w5Var3.b(pagetablecell10);
                                                                                                        int a13 = w5Var3.a(pagetablecell10);
                                                                                                        int o11 = w5.o(pagetablecell10);
                                                                                                        int i71 = pagetablecell10.colspan;
                                                                                                        if (i71 == 0) {
                                                                                                            i71 = 1;
                                                                                                        }
                                                                                                        int i72 = -1;
                                                                                                        o3 o3Var7 = o3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i73 = 0;
                                                                                                        for (int i74 = a13; i74 < a13 + i71 && i74 < w5Var3.c; i74++) {
                                                                                                            if (!zArr3[i74]) {
                                                                                                                if (i72 < 0) {
                                                                                                                    i72 = i74;
                                                                                                                }
                                                                                                                i73++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i72 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i72], o11, i73});
                                                                                                        }
                                                                                                        o3Var6 = o3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    o3Var2 = o3Var6;
                                                                                                    w5Var3.j(identityHashMap2, w5Var3.b);
                                                                                                    w5Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var6.v();
                                                                                    if (z23) {
                                                                                        f5Var6.q(0, i67);
                                                                                    }
                                                                                }
                                                                                o3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (z14) {
                                                                final int i44 = 4;
                                                                J1.c(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable(this) { // from class: qh.g2
                                                                    public final /* synthetic */ o3 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        o3 o3Var;
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        o3 o3Var2;
                                                                        boolean z23;
                                                                        switch (i44) {
                                                                            case 0:
                                                                                o3 o3Var3 = this.b;
                                                                                o3Var3.getClass();
                                                                                f5 f5Var3 = f5Var2;
                                                                                LinkedHashSet linkedHashSet3 = f5Var3.D;
                                                                                if (f5Var3.B == null || linkedHashSet3.isEmpty()) {
                                                                                    o3Var = o3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i432 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = f5Var3.B.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i432 = Math.min(i432, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    w5 w5Var = f5Var3.B;
                                                                                    w5Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        o3Var = o3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w5Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w5Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w5Var.b];
                                                                                                int i442 = 0;
                                                                                                for (int i45 = 0; i45 < w5Var.b; i45++) {
                                                                                                    iArr2[i45] = i442;
                                                                                                    if (!zArr[i45]) {
                                                                                                        i442++;
                                                                                                    }
                                                                                                }
                                                                                                if (i442 == 0) {
                                                                                                    w5Var.a.rows.clear();
                                                                                                    w5Var.i();
                                                                                                    o3Var = o3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w5Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i46 = 0;
                                                                                                    while (i46 < size2) {
                                                                                                        Object obj = arrayList2.get(i46);
                                                                                                        i46++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w5Var.b(pagetablecell4);
                                                                                                        int a3 = w5Var.a(pagetablecell4);
                                                                                                        int o9 = w5.o(pagetablecell4);
                                                                                                        int i47 = pagetablecell4.colspan;
                                                                                                        if (i47 == 0) {
                                                                                                            i47 = 1;
                                                                                                        }
                                                                                                        int i48 = -1;
                                                                                                        o3 o3Var4 = o3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i49 = 0;
                                                                                                        for (int i50 = b13; i50 < b13 + o9 && i50 < w5Var.b; i50++) {
                                                                                                            if (!zArr[i50]) {
                                                                                                                if (i48 < 0) {
                                                                                                                    i48 = i50;
                                                                                                                }
                                                                                                                i49++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i48 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i48], a3, i49, i47});
                                                                                                        }
                                                                                                        o3Var3 = o3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    o3Var = o3Var3;
                                                                                                    w5Var.j(identityHashMap, i442);
                                                                                                    w5Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var3.v();
                                                                                    if (z22) {
                                                                                        f5Var3.q(i432, 0);
                                                                                    }
                                                                                }
                                                                                o3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                o3 o3Var5 = this.b;
                                                                                o3Var5.getClass();
                                                                                a row = f5Var2.getRow();
                                                                                o3Var5.M2();
                                                                                if (row != null) {
                                                                                    b2 b2Var = o3Var5.F3;
                                                                                    if (b2Var != null) {
                                                                                        b2Var.d();
                                                                                    }
                                                                                    o3Var5.r4(row);
                                                                                    b2 b2Var2 = o3Var5.F3;
                                                                                    if (b2Var2 != null) {
                                                                                        b2Var2.h();
                                                                                    }
                                                                                    m3 m3Var = o3Var5.d3;
                                                                                    if (m3Var != null) {
                                                                                        m3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                f5 f5Var4 = f5Var2;
                                                                                LinkedHashSet linkedHashSet4 = f5Var4.D;
                                                                                if (f5Var4.B != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i52 = Math.min(i52, f5Var4.B.b(pagetablecell5));
                                                                                        i53 = Math.min(i53, f5Var4.B.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    w5 w5Var2 = f5Var4.B;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i55 = -1;
                                                                                        int i56 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = w5Var2.b(pagetablecell6);
                                                                                            int a10 = w5Var2.a(pagetablecell6);
                                                                                            int o10 = w5.o(pagetablecell6);
                                                                                            int i57 = pagetablecell6.colspan;
                                                                                            if (i57 == 0) {
                                                                                                i57 = 1;
                                                                                            }
                                                                                            i51 = Math.min(i51, b14);
                                                                                            i54 = Math.min(i54, a10);
                                                                                            i55 = Math.max(i55, (b14 + o10) - 1);
                                                                                            i56 = Math.max(i56, (a10 + i57) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i58 = i51;
                                                                                        while (true) {
                                                                                            if (i58 <= i55) {
                                                                                                for (int i59 = i54; i59 <= i56; i59++) {
                                                                                                    if (i58 >= 0 && i59 >= 0 && i58 < w5Var2.b && i59 < w5Var2.c) {
                                                                                                        hashSet9.add(w5Var2.d[i58][i59]);
                                                                                                    }
                                                                                                }
                                                                                                i58++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new bg.l0(w5Var2, 4));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i60 = 0;
                                                                                                while (i60 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i60);
                                                                                                    i60++;
                                                                                                    String g10 = w5.g((TL_iv.pageTableCell) obj2);
                                                                                                    if (g10.isEmpty()) {
                                                                                                        arrayList = arrayList3;
                                                                                                    } else {
                                                                                                        if (sb2.length() > 0) {
                                                                                                            arrayList = arrayList3;
                                                                                                            sb2.append("\n");
                                                                                                        } else {
                                                                                                            arrayList = arrayList3;
                                                                                                        }
                                                                                                        sb2.append(g10);
                                                                                                    }
                                                                                                    arrayList3 = arrayList;
                                                                                                }
                                                                                                TL_iv.pageTableCell pagetablecell7 = w5Var2.d[i51][i54];
                                                                                                int i61 = (i56 - i54) + 1;
                                                                                                int i62 = (i55 - i51) + 1;
                                                                                                if (i61 <= 1) {
                                                                                                    i61 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i61;
                                                                                                int i63 = i62 > 1 ? i62 : 0;
                                                                                                pagetablecell7.rowspan = i63;
                                                                                                int i64 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i61 > 0 ? i64 | 2 : i64 & (-3);
                                                                                                int i65 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i65 | 4 : i65 & (-5);
                                                                                                w5.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = w5Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                w5Var2.i();
                                                                                                f5Var4.v();
                                                                                                f5Var4.v.invalidate();
                                                                                                f5Var4.q(i52, i53);
                                                                                                f5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                f5 f5Var5 = f5Var2;
                                                                                LinkedHashSet linkedHashSet5 = f5Var5.D;
                                                                                if (f5Var5.B != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (w5.n(pagetablecell9) <= 1) {
                                                                                        int i66 = pagetablecell9.rowspan;
                                                                                        if (i66 == 0) {
                                                                                            i66 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = f5Var5.B.b(pagetablecell9);
                                                                                    int a11 = f5Var5.B.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (f5Var5.B.p(pagetablecell9)) {
                                                                                        f5Var5.v();
                                                                                        f5Var5.v.invalidate();
                                                                                        f5Var5.q(b15, a11);
                                                                                        f5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                f5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                f5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                f5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                f5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                o3 o3Var6 = this.b;
                                                                                o3Var6.getClass();
                                                                                f5 f5Var6 = f5Var2;
                                                                                LinkedHashSet linkedHashSet6 = f5Var6.D;
                                                                                if (f5Var6.B == null || linkedHashSet6.isEmpty()) {
                                                                                    o3Var2 = o3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a12 = f5Var6.B.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a12));
                                                                                        i67 = Math.min(i67, a12);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    w5 w5Var3 = f5Var6.B;
                                                                                    w5Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        o3Var2 = o3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w5Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w5Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w5Var3.c];
                                                                                                int i68 = 0;
                                                                                                for (int i69 = 0; i69 < w5Var3.c; i69++) {
                                                                                                    iArr4[i69] = i68;
                                                                                                    if (!zArr2[i69]) {
                                                                                                        i68++;
                                                                                                    }
                                                                                                }
                                                                                                if (i68 == 0) {
                                                                                                    w5Var3.a.rows.clear();
                                                                                                    w5Var3.i();
                                                                                                    o3Var2 = o3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w5Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i70 = 0;
                                                                                                    while (i70 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i70);
                                                                                                        i70++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w5Var3.b(pagetablecell10);
                                                                                                        int a13 = w5Var3.a(pagetablecell10);
                                                                                                        int o11 = w5.o(pagetablecell10);
                                                                                                        int i71 = pagetablecell10.colspan;
                                                                                                        if (i71 == 0) {
                                                                                                            i71 = 1;
                                                                                                        }
                                                                                                        int i72 = -1;
                                                                                                        o3 o3Var7 = o3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i73 = 0;
                                                                                                        for (int i74 = a13; i74 < a13 + i71 && i74 < w5Var3.c; i74++) {
                                                                                                            if (!zArr3[i74]) {
                                                                                                                if (i72 < 0) {
                                                                                                                    i72 = i74;
                                                                                                                }
                                                                                                                i73++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i72 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i72], o11, i73});
                                                                                                        }
                                                                                                        o3Var6 = o3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    o3Var2 = o3Var6;
                                                                                                    w5Var3.j(identityHashMap2, w5Var3.b);
                                                                                                    w5Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var6.v();
                                                                                    if (z23) {
                                                                                        f5Var6.q(0, i67);
                                                                                    }
                                                                                }
                                                                                o3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                final int i45 = 5;
                                                                J1.c(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable(this) { // from class: qh.g2
                                                                    public final /* synthetic */ o3 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        o3 o3Var;
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        o3 o3Var2;
                                                                        boolean z23;
                                                                        switch (i45) {
                                                                            case 0:
                                                                                o3 o3Var3 = this.b;
                                                                                o3Var3.getClass();
                                                                                f5 f5Var3 = f5Var2;
                                                                                LinkedHashSet linkedHashSet3 = f5Var3.D;
                                                                                if (f5Var3.B == null || linkedHashSet3.isEmpty()) {
                                                                                    o3Var = o3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i432 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = f5Var3.B.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i432 = Math.min(i432, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    w5 w5Var = f5Var3.B;
                                                                                    w5Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        o3Var = o3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w5Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w5Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w5Var.b];
                                                                                                int i442 = 0;
                                                                                                for (int i452 = 0; i452 < w5Var.b; i452++) {
                                                                                                    iArr2[i452] = i442;
                                                                                                    if (!zArr[i452]) {
                                                                                                        i442++;
                                                                                                    }
                                                                                                }
                                                                                                if (i442 == 0) {
                                                                                                    w5Var.a.rows.clear();
                                                                                                    w5Var.i();
                                                                                                    o3Var = o3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w5Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i46 = 0;
                                                                                                    while (i46 < size2) {
                                                                                                        Object obj = arrayList2.get(i46);
                                                                                                        i46++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w5Var.b(pagetablecell4);
                                                                                                        int a3 = w5Var.a(pagetablecell4);
                                                                                                        int o9 = w5.o(pagetablecell4);
                                                                                                        int i47 = pagetablecell4.colspan;
                                                                                                        if (i47 == 0) {
                                                                                                            i47 = 1;
                                                                                                        }
                                                                                                        int i48 = -1;
                                                                                                        o3 o3Var4 = o3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i49 = 0;
                                                                                                        for (int i50 = b13; i50 < b13 + o9 && i50 < w5Var.b; i50++) {
                                                                                                            if (!zArr[i50]) {
                                                                                                                if (i48 < 0) {
                                                                                                                    i48 = i50;
                                                                                                                }
                                                                                                                i49++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i48 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i48], a3, i49, i47});
                                                                                                        }
                                                                                                        o3Var3 = o3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    o3Var = o3Var3;
                                                                                                    w5Var.j(identityHashMap, i442);
                                                                                                    w5Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var3.v();
                                                                                    if (z22) {
                                                                                        f5Var3.q(i432, 0);
                                                                                    }
                                                                                }
                                                                                o3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                o3 o3Var5 = this.b;
                                                                                o3Var5.getClass();
                                                                                a row = f5Var2.getRow();
                                                                                o3Var5.M2();
                                                                                if (row != null) {
                                                                                    b2 b2Var = o3Var5.F3;
                                                                                    if (b2Var != null) {
                                                                                        b2Var.d();
                                                                                    }
                                                                                    o3Var5.r4(row);
                                                                                    b2 b2Var2 = o3Var5.F3;
                                                                                    if (b2Var2 != null) {
                                                                                        b2Var2.h();
                                                                                    }
                                                                                    m3 m3Var = o3Var5.d3;
                                                                                    if (m3Var != null) {
                                                                                        m3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                f5 f5Var4 = f5Var2;
                                                                                LinkedHashSet linkedHashSet4 = f5Var4.D;
                                                                                if (f5Var4.B != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i52 = Math.min(i52, f5Var4.B.b(pagetablecell5));
                                                                                        i53 = Math.min(i53, f5Var4.B.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    w5 w5Var2 = f5Var4.B;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i55 = -1;
                                                                                        int i56 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = w5Var2.b(pagetablecell6);
                                                                                            int a10 = w5Var2.a(pagetablecell6);
                                                                                            int o10 = w5.o(pagetablecell6);
                                                                                            int i57 = pagetablecell6.colspan;
                                                                                            if (i57 == 0) {
                                                                                                i57 = 1;
                                                                                            }
                                                                                            i51 = Math.min(i51, b14);
                                                                                            i54 = Math.min(i54, a10);
                                                                                            i55 = Math.max(i55, (b14 + o10) - 1);
                                                                                            i56 = Math.max(i56, (a10 + i57) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i58 = i51;
                                                                                        while (true) {
                                                                                            if (i58 <= i55) {
                                                                                                for (int i59 = i54; i59 <= i56; i59++) {
                                                                                                    if (i58 >= 0 && i59 >= 0 && i58 < w5Var2.b && i59 < w5Var2.c) {
                                                                                                        hashSet9.add(w5Var2.d[i58][i59]);
                                                                                                    }
                                                                                                }
                                                                                                i58++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new bg.l0(w5Var2, 4));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i60 = 0;
                                                                                                while (i60 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i60);
                                                                                                    i60++;
                                                                                                    String g10 = w5.g((TL_iv.pageTableCell) obj2);
                                                                                                    if (g10.isEmpty()) {
                                                                                                        arrayList = arrayList3;
                                                                                                    } else {
                                                                                                        if (sb2.length() > 0) {
                                                                                                            arrayList = arrayList3;
                                                                                                            sb2.append("\n");
                                                                                                        } else {
                                                                                                            arrayList = arrayList3;
                                                                                                        }
                                                                                                        sb2.append(g10);
                                                                                                    }
                                                                                                    arrayList3 = arrayList;
                                                                                                }
                                                                                                TL_iv.pageTableCell pagetablecell7 = w5Var2.d[i51][i54];
                                                                                                int i61 = (i56 - i54) + 1;
                                                                                                int i62 = (i55 - i51) + 1;
                                                                                                if (i61 <= 1) {
                                                                                                    i61 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i61;
                                                                                                int i63 = i62 > 1 ? i62 : 0;
                                                                                                pagetablecell7.rowspan = i63;
                                                                                                int i64 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i61 > 0 ? i64 | 2 : i64 & (-3);
                                                                                                int i65 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i65 | 4 : i65 & (-5);
                                                                                                w5.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = w5Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                w5Var2.i();
                                                                                                f5Var4.v();
                                                                                                f5Var4.v.invalidate();
                                                                                                f5Var4.q(i52, i53);
                                                                                                f5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                f5 f5Var5 = f5Var2;
                                                                                LinkedHashSet linkedHashSet5 = f5Var5.D;
                                                                                if (f5Var5.B != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (w5.n(pagetablecell9) <= 1) {
                                                                                        int i66 = pagetablecell9.rowspan;
                                                                                        if (i66 == 0) {
                                                                                            i66 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = f5Var5.B.b(pagetablecell9);
                                                                                    int a11 = f5Var5.B.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (f5Var5.B.p(pagetablecell9)) {
                                                                                        f5Var5.v();
                                                                                        f5Var5.v.invalidate();
                                                                                        f5Var5.q(b15, a11);
                                                                                        f5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                f5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                f5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                f5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                f5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                o3 o3Var6 = this.b;
                                                                                o3Var6.getClass();
                                                                                f5 f5Var6 = f5Var2;
                                                                                LinkedHashSet linkedHashSet6 = f5Var6.D;
                                                                                if (f5Var6.B == null || linkedHashSet6.isEmpty()) {
                                                                                    o3Var2 = o3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a12 = f5Var6.B.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a12));
                                                                                        i67 = Math.min(i67, a12);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    w5 w5Var3 = f5Var6.B;
                                                                                    w5Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        o3Var2 = o3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w5Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w5Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w5Var3.c];
                                                                                                int i68 = 0;
                                                                                                for (int i69 = 0; i69 < w5Var3.c; i69++) {
                                                                                                    iArr4[i69] = i68;
                                                                                                    if (!zArr2[i69]) {
                                                                                                        i68++;
                                                                                                    }
                                                                                                }
                                                                                                if (i68 == 0) {
                                                                                                    w5Var3.a.rows.clear();
                                                                                                    w5Var3.i();
                                                                                                    o3Var2 = o3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w5Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i70 = 0;
                                                                                                    while (i70 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i70);
                                                                                                        i70++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w5Var3.b(pagetablecell10);
                                                                                                        int a13 = w5Var3.a(pagetablecell10);
                                                                                                        int o11 = w5.o(pagetablecell10);
                                                                                                        int i71 = pagetablecell10.colspan;
                                                                                                        if (i71 == 0) {
                                                                                                            i71 = 1;
                                                                                                        }
                                                                                                        int i72 = -1;
                                                                                                        o3 o3Var7 = o3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i73 = 0;
                                                                                                        for (int i74 = a13; i74 < a13 + i71 && i74 < w5Var3.c; i74++) {
                                                                                                            if (!zArr3[i74]) {
                                                                                                                if (i72 < 0) {
                                                                                                                    i72 = i74;
                                                                                                                }
                                                                                                                i73++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i72 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i72], o11, i73});
                                                                                                        }
                                                                                                        o3Var6 = o3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    o3Var2 = o3Var6;
                                                                                                    w5Var3.j(identityHashMap2, w5Var3.b);
                                                                                                    w5Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var6.v();
                                                                                    if (z23) {
                                                                                        f5Var6.q(0, i67);
                                                                                    }
                                                                                }
                                                                                o3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (z15) {
                                                                final int i46 = 6;
                                                                J1.c(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable(this) { // from class: qh.g2
                                                                    public final /* synthetic */ o3 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        o3 o3Var;
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        o3 o3Var2;
                                                                        boolean z23;
                                                                        switch (i46) {
                                                                            case 0:
                                                                                o3 o3Var3 = this.b;
                                                                                o3Var3.getClass();
                                                                                f5 f5Var3 = f5Var2;
                                                                                LinkedHashSet linkedHashSet3 = f5Var3.D;
                                                                                if (f5Var3.B == null || linkedHashSet3.isEmpty()) {
                                                                                    o3Var = o3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i432 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = f5Var3.B.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i432 = Math.min(i432, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    w5 w5Var = f5Var3.B;
                                                                                    w5Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        o3Var = o3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w5Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w5Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w5Var.b];
                                                                                                int i442 = 0;
                                                                                                for (int i452 = 0; i452 < w5Var.b; i452++) {
                                                                                                    iArr2[i452] = i442;
                                                                                                    if (!zArr[i452]) {
                                                                                                        i442++;
                                                                                                    }
                                                                                                }
                                                                                                if (i442 == 0) {
                                                                                                    w5Var.a.rows.clear();
                                                                                                    w5Var.i();
                                                                                                    o3Var = o3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w5Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i462 = 0;
                                                                                                    while (i462 < size2) {
                                                                                                        Object obj = arrayList2.get(i462);
                                                                                                        i462++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w5Var.b(pagetablecell4);
                                                                                                        int a3 = w5Var.a(pagetablecell4);
                                                                                                        int o9 = w5.o(pagetablecell4);
                                                                                                        int i47 = pagetablecell4.colspan;
                                                                                                        if (i47 == 0) {
                                                                                                            i47 = 1;
                                                                                                        }
                                                                                                        int i48 = -1;
                                                                                                        o3 o3Var4 = o3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i49 = 0;
                                                                                                        for (int i50 = b13; i50 < b13 + o9 && i50 < w5Var.b; i50++) {
                                                                                                            if (!zArr[i50]) {
                                                                                                                if (i48 < 0) {
                                                                                                                    i48 = i50;
                                                                                                                }
                                                                                                                i49++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i48 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i48], a3, i49, i47});
                                                                                                        }
                                                                                                        o3Var3 = o3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    o3Var = o3Var3;
                                                                                                    w5Var.j(identityHashMap, i442);
                                                                                                    w5Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var3.v();
                                                                                    if (z22) {
                                                                                        f5Var3.q(i432, 0);
                                                                                    }
                                                                                }
                                                                                o3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                o3 o3Var5 = this.b;
                                                                                o3Var5.getClass();
                                                                                a row = f5Var2.getRow();
                                                                                o3Var5.M2();
                                                                                if (row != null) {
                                                                                    b2 b2Var = o3Var5.F3;
                                                                                    if (b2Var != null) {
                                                                                        b2Var.d();
                                                                                    }
                                                                                    o3Var5.r4(row);
                                                                                    b2 b2Var2 = o3Var5.F3;
                                                                                    if (b2Var2 != null) {
                                                                                        b2Var2.h();
                                                                                    }
                                                                                    m3 m3Var = o3Var5.d3;
                                                                                    if (m3Var != null) {
                                                                                        m3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                f5 f5Var4 = f5Var2;
                                                                                LinkedHashSet linkedHashSet4 = f5Var4.D;
                                                                                if (f5Var4.B != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i52 = Math.min(i52, f5Var4.B.b(pagetablecell5));
                                                                                        i53 = Math.min(i53, f5Var4.B.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    w5 w5Var2 = f5Var4.B;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i55 = -1;
                                                                                        int i56 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = w5Var2.b(pagetablecell6);
                                                                                            int a10 = w5Var2.a(pagetablecell6);
                                                                                            int o10 = w5.o(pagetablecell6);
                                                                                            int i57 = pagetablecell6.colspan;
                                                                                            if (i57 == 0) {
                                                                                                i57 = 1;
                                                                                            }
                                                                                            i51 = Math.min(i51, b14);
                                                                                            i54 = Math.min(i54, a10);
                                                                                            i55 = Math.max(i55, (b14 + o10) - 1);
                                                                                            i56 = Math.max(i56, (a10 + i57) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i58 = i51;
                                                                                        while (true) {
                                                                                            if (i58 <= i55) {
                                                                                                for (int i59 = i54; i59 <= i56; i59++) {
                                                                                                    if (i58 >= 0 && i59 >= 0 && i58 < w5Var2.b && i59 < w5Var2.c) {
                                                                                                        hashSet9.add(w5Var2.d[i58][i59]);
                                                                                                    }
                                                                                                }
                                                                                                i58++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new bg.l0(w5Var2, 4));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i60 = 0;
                                                                                                while (i60 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i60);
                                                                                                    i60++;
                                                                                                    String g10 = w5.g((TL_iv.pageTableCell) obj2);
                                                                                                    if (g10.isEmpty()) {
                                                                                                        arrayList = arrayList3;
                                                                                                    } else {
                                                                                                        if (sb2.length() > 0) {
                                                                                                            arrayList = arrayList3;
                                                                                                            sb2.append("\n");
                                                                                                        } else {
                                                                                                            arrayList = arrayList3;
                                                                                                        }
                                                                                                        sb2.append(g10);
                                                                                                    }
                                                                                                    arrayList3 = arrayList;
                                                                                                }
                                                                                                TL_iv.pageTableCell pagetablecell7 = w5Var2.d[i51][i54];
                                                                                                int i61 = (i56 - i54) + 1;
                                                                                                int i62 = (i55 - i51) + 1;
                                                                                                if (i61 <= 1) {
                                                                                                    i61 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i61;
                                                                                                int i63 = i62 > 1 ? i62 : 0;
                                                                                                pagetablecell7.rowspan = i63;
                                                                                                int i64 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i61 > 0 ? i64 | 2 : i64 & (-3);
                                                                                                int i65 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i65 | 4 : i65 & (-5);
                                                                                                w5.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = w5Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                w5Var2.i();
                                                                                                f5Var4.v();
                                                                                                f5Var4.v.invalidate();
                                                                                                f5Var4.q(i52, i53);
                                                                                                f5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                f5 f5Var5 = f5Var2;
                                                                                LinkedHashSet linkedHashSet5 = f5Var5.D;
                                                                                if (f5Var5.B != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (w5.n(pagetablecell9) <= 1) {
                                                                                        int i66 = pagetablecell9.rowspan;
                                                                                        if (i66 == 0) {
                                                                                            i66 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = f5Var5.B.b(pagetablecell9);
                                                                                    int a11 = f5Var5.B.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (f5Var5.B.p(pagetablecell9)) {
                                                                                        f5Var5.v();
                                                                                        f5Var5.v.invalidate();
                                                                                        f5Var5.q(b15, a11);
                                                                                        f5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                f5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                f5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                f5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                f5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                o3 o3Var6 = this.b;
                                                                                o3Var6.getClass();
                                                                                f5 f5Var6 = f5Var2;
                                                                                LinkedHashSet linkedHashSet6 = f5Var6.D;
                                                                                if (f5Var6.B == null || linkedHashSet6.isEmpty()) {
                                                                                    o3Var2 = o3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a12 = f5Var6.B.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a12));
                                                                                        i67 = Math.min(i67, a12);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    w5 w5Var3 = f5Var6.B;
                                                                                    w5Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        o3Var2 = o3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w5Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w5Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w5Var3.c];
                                                                                                int i68 = 0;
                                                                                                for (int i69 = 0; i69 < w5Var3.c; i69++) {
                                                                                                    iArr4[i69] = i68;
                                                                                                    if (!zArr2[i69]) {
                                                                                                        i68++;
                                                                                                    }
                                                                                                }
                                                                                                if (i68 == 0) {
                                                                                                    w5Var3.a.rows.clear();
                                                                                                    w5Var3.i();
                                                                                                    o3Var2 = o3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w5Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i70 = 0;
                                                                                                    while (i70 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i70);
                                                                                                        i70++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w5Var3.b(pagetablecell10);
                                                                                                        int a13 = w5Var3.a(pagetablecell10);
                                                                                                        int o11 = w5.o(pagetablecell10);
                                                                                                        int i71 = pagetablecell10.colspan;
                                                                                                        if (i71 == 0) {
                                                                                                            i71 = 1;
                                                                                                        }
                                                                                                        int i72 = -1;
                                                                                                        o3 o3Var7 = o3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i73 = 0;
                                                                                                        for (int i74 = a13; i74 < a13 + i71 && i74 < w5Var3.c; i74++) {
                                                                                                            if (!zArr3[i74]) {
                                                                                                                if (i72 < 0) {
                                                                                                                    i72 = i74;
                                                                                                                }
                                                                                                                i73++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i72 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i72], o11, i73});
                                                                                                        }
                                                                                                        o3Var6 = o3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    o3Var2 = o3Var6;
                                                                                                    w5Var3.j(identityHashMap2, w5Var3.b);
                                                                                                    w5Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var6.v();
                                                                                    if (z23) {
                                                                                        f5Var6.q(0, i67);
                                                                                    }
                                                                                }
                                                                                o3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                final int i47 = 7;
                                                                J1.c(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable(this) { // from class: qh.g2
                                                                    public final /* synthetic */ o3 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        o3 o3Var;
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        o3 o3Var2;
                                                                        boolean z23;
                                                                        switch (i47) {
                                                                            case 0:
                                                                                o3 o3Var3 = this.b;
                                                                                o3Var3.getClass();
                                                                                f5 f5Var3 = f5Var2;
                                                                                LinkedHashSet linkedHashSet3 = f5Var3.D;
                                                                                if (f5Var3.B == null || linkedHashSet3.isEmpty()) {
                                                                                    o3Var = o3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i432 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = f5Var3.B.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i432 = Math.min(i432, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    w5 w5Var = f5Var3.B;
                                                                                    w5Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        o3Var = o3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w5Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w5Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w5Var.b];
                                                                                                int i442 = 0;
                                                                                                for (int i452 = 0; i452 < w5Var.b; i452++) {
                                                                                                    iArr2[i452] = i442;
                                                                                                    if (!zArr[i452]) {
                                                                                                        i442++;
                                                                                                    }
                                                                                                }
                                                                                                if (i442 == 0) {
                                                                                                    w5Var.a.rows.clear();
                                                                                                    w5Var.i();
                                                                                                    o3Var = o3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w5Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i462 = 0;
                                                                                                    while (i462 < size2) {
                                                                                                        Object obj = arrayList2.get(i462);
                                                                                                        i462++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w5Var.b(pagetablecell4);
                                                                                                        int a3 = w5Var.a(pagetablecell4);
                                                                                                        int o9 = w5.o(pagetablecell4);
                                                                                                        int i472 = pagetablecell4.colspan;
                                                                                                        if (i472 == 0) {
                                                                                                            i472 = 1;
                                                                                                        }
                                                                                                        int i48 = -1;
                                                                                                        o3 o3Var4 = o3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i49 = 0;
                                                                                                        for (int i50 = b13; i50 < b13 + o9 && i50 < w5Var.b; i50++) {
                                                                                                            if (!zArr[i50]) {
                                                                                                                if (i48 < 0) {
                                                                                                                    i48 = i50;
                                                                                                                }
                                                                                                                i49++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i48 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i48], a3, i49, i472});
                                                                                                        }
                                                                                                        o3Var3 = o3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    o3Var = o3Var3;
                                                                                                    w5Var.j(identityHashMap, i442);
                                                                                                    w5Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var3.v();
                                                                                    if (z22) {
                                                                                        f5Var3.q(i432, 0);
                                                                                    }
                                                                                }
                                                                                o3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                o3 o3Var5 = this.b;
                                                                                o3Var5.getClass();
                                                                                a row = f5Var2.getRow();
                                                                                o3Var5.M2();
                                                                                if (row != null) {
                                                                                    b2 b2Var = o3Var5.F3;
                                                                                    if (b2Var != null) {
                                                                                        b2Var.d();
                                                                                    }
                                                                                    o3Var5.r4(row);
                                                                                    b2 b2Var2 = o3Var5.F3;
                                                                                    if (b2Var2 != null) {
                                                                                        b2Var2.h();
                                                                                    }
                                                                                    m3 m3Var = o3Var5.d3;
                                                                                    if (m3Var != null) {
                                                                                        m3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                f5 f5Var4 = f5Var2;
                                                                                LinkedHashSet linkedHashSet4 = f5Var4.D;
                                                                                if (f5Var4.B != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i52 = Math.min(i52, f5Var4.B.b(pagetablecell5));
                                                                                        i53 = Math.min(i53, f5Var4.B.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    w5 w5Var2 = f5Var4.B;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i55 = -1;
                                                                                        int i56 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = w5Var2.b(pagetablecell6);
                                                                                            int a10 = w5Var2.a(pagetablecell6);
                                                                                            int o10 = w5.o(pagetablecell6);
                                                                                            int i57 = pagetablecell6.colspan;
                                                                                            if (i57 == 0) {
                                                                                                i57 = 1;
                                                                                            }
                                                                                            i51 = Math.min(i51, b14);
                                                                                            i54 = Math.min(i54, a10);
                                                                                            i55 = Math.max(i55, (b14 + o10) - 1);
                                                                                            i56 = Math.max(i56, (a10 + i57) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i58 = i51;
                                                                                        while (true) {
                                                                                            if (i58 <= i55) {
                                                                                                for (int i59 = i54; i59 <= i56; i59++) {
                                                                                                    if (i58 >= 0 && i59 >= 0 && i58 < w5Var2.b && i59 < w5Var2.c) {
                                                                                                        hashSet9.add(w5Var2.d[i58][i59]);
                                                                                                    }
                                                                                                }
                                                                                                i58++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new bg.l0(w5Var2, 4));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i60 = 0;
                                                                                                while (i60 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i60);
                                                                                                    i60++;
                                                                                                    String g10 = w5.g((TL_iv.pageTableCell) obj2);
                                                                                                    if (g10.isEmpty()) {
                                                                                                        arrayList = arrayList3;
                                                                                                    } else {
                                                                                                        if (sb2.length() > 0) {
                                                                                                            arrayList = arrayList3;
                                                                                                            sb2.append("\n");
                                                                                                        } else {
                                                                                                            arrayList = arrayList3;
                                                                                                        }
                                                                                                        sb2.append(g10);
                                                                                                    }
                                                                                                    arrayList3 = arrayList;
                                                                                                }
                                                                                                TL_iv.pageTableCell pagetablecell7 = w5Var2.d[i51][i54];
                                                                                                int i61 = (i56 - i54) + 1;
                                                                                                int i62 = (i55 - i51) + 1;
                                                                                                if (i61 <= 1) {
                                                                                                    i61 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i61;
                                                                                                int i63 = i62 > 1 ? i62 : 0;
                                                                                                pagetablecell7.rowspan = i63;
                                                                                                int i64 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i61 > 0 ? i64 | 2 : i64 & (-3);
                                                                                                int i65 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i65 | 4 : i65 & (-5);
                                                                                                w5.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = w5Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                w5Var2.i();
                                                                                                f5Var4.v();
                                                                                                f5Var4.v.invalidate();
                                                                                                f5Var4.q(i52, i53);
                                                                                                f5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                f5 f5Var5 = f5Var2;
                                                                                LinkedHashSet linkedHashSet5 = f5Var5.D;
                                                                                if (f5Var5.B != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (w5.n(pagetablecell9) <= 1) {
                                                                                        int i66 = pagetablecell9.rowspan;
                                                                                        if (i66 == 0) {
                                                                                            i66 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = f5Var5.B.b(pagetablecell9);
                                                                                    int a11 = f5Var5.B.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (f5Var5.B.p(pagetablecell9)) {
                                                                                        f5Var5.v();
                                                                                        f5Var5.v.invalidate();
                                                                                        f5Var5.q(b15, a11);
                                                                                        f5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                f5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                f5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                f5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                f5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                o3 o3Var6 = this.b;
                                                                                o3Var6.getClass();
                                                                                f5 f5Var6 = f5Var2;
                                                                                LinkedHashSet linkedHashSet6 = f5Var6.D;
                                                                                if (f5Var6.B == null || linkedHashSet6.isEmpty()) {
                                                                                    o3Var2 = o3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a12 = f5Var6.B.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a12));
                                                                                        i67 = Math.min(i67, a12);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    w5 w5Var3 = f5Var6.B;
                                                                                    w5Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        o3Var2 = o3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w5Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w5Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w5Var3.c];
                                                                                                int i68 = 0;
                                                                                                for (int i69 = 0; i69 < w5Var3.c; i69++) {
                                                                                                    iArr4[i69] = i68;
                                                                                                    if (!zArr2[i69]) {
                                                                                                        i68++;
                                                                                                    }
                                                                                                }
                                                                                                if (i68 == 0) {
                                                                                                    w5Var3.a.rows.clear();
                                                                                                    w5Var3.i();
                                                                                                    o3Var2 = o3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w5Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i70 = 0;
                                                                                                    while (i70 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i70);
                                                                                                        i70++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w5Var3.b(pagetablecell10);
                                                                                                        int a13 = w5Var3.a(pagetablecell10);
                                                                                                        int o11 = w5.o(pagetablecell10);
                                                                                                        int i71 = pagetablecell10.colspan;
                                                                                                        if (i71 == 0) {
                                                                                                            i71 = 1;
                                                                                                        }
                                                                                                        int i72 = -1;
                                                                                                        o3 o3Var7 = o3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i73 = 0;
                                                                                                        for (int i74 = a13; i74 < a13 + i71 && i74 < w5Var3.c; i74++) {
                                                                                                            if (!zArr3[i74]) {
                                                                                                                if (i72 < 0) {
                                                                                                                    i72 = i74;
                                                                                                                }
                                                                                                                i73++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i72 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i72], o11, i73});
                                                                                                        }
                                                                                                        o3Var6 = o3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    o3Var2 = o3Var6;
                                                                                                    w5Var3.j(identityHashMap2, w5Var3.b);
                                                                                                    w5Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var6.v();
                                                                                    if (z23) {
                                                                                        f5Var6.q(0, i67);
                                                                                    }
                                                                                }
                                                                                o3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i14 == 0) {
                                                                final int i48 = 8;
                                                                r92 = 1;
                                                                J1.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteColumn), new Runnable(this) { // from class: qh.g2
                                                                    public final /* synthetic */ o3 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        o3 o3Var;
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        o3 o3Var2;
                                                                        boolean z23;
                                                                        switch (i48) {
                                                                            case 0:
                                                                                o3 o3Var3 = this.b;
                                                                                o3Var3.getClass();
                                                                                f5 f5Var3 = f5Var2;
                                                                                LinkedHashSet linkedHashSet3 = f5Var3.D;
                                                                                if (f5Var3.B == null || linkedHashSet3.isEmpty()) {
                                                                                    o3Var = o3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i432 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = f5Var3.B.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i432 = Math.min(i432, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    w5 w5Var = f5Var3.B;
                                                                                    w5Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        o3Var = o3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w5Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w5Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w5Var.b];
                                                                                                int i442 = 0;
                                                                                                for (int i452 = 0; i452 < w5Var.b; i452++) {
                                                                                                    iArr2[i452] = i442;
                                                                                                    if (!zArr[i452]) {
                                                                                                        i442++;
                                                                                                    }
                                                                                                }
                                                                                                if (i442 == 0) {
                                                                                                    w5Var.a.rows.clear();
                                                                                                    w5Var.i();
                                                                                                    o3Var = o3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w5Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i462 = 0;
                                                                                                    while (i462 < size2) {
                                                                                                        Object obj = arrayList2.get(i462);
                                                                                                        i462++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w5Var.b(pagetablecell4);
                                                                                                        int a3 = w5Var.a(pagetablecell4);
                                                                                                        int o9 = w5.o(pagetablecell4);
                                                                                                        int i472 = pagetablecell4.colspan;
                                                                                                        if (i472 == 0) {
                                                                                                            i472 = 1;
                                                                                                        }
                                                                                                        int i482 = -1;
                                                                                                        o3 o3Var4 = o3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i49 = 0;
                                                                                                        for (int i50 = b13; i50 < b13 + o9 && i50 < w5Var.b; i50++) {
                                                                                                            if (!zArr[i50]) {
                                                                                                                if (i482 < 0) {
                                                                                                                    i482 = i50;
                                                                                                                }
                                                                                                                i49++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i482 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i482], a3, i49, i472});
                                                                                                        }
                                                                                                        o3Var3 = o3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    o3Var = o3Var3;
                                                                                                    w5Var.j(identityHashMap, i442);
                                                                                                    w5Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var3.v();
                                                                                    if (z22) {
                                                                                        f5Var3.q(i432, 0);
                                                                                    }
                                                                                }
                                                                                o3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                o3 o3Var5 = this.b;
                                                                                o3Var5.getClass();
                                                                                a row = f5Var2.getRow();
                                                                                o3Var5.M2();
                                                                                if (row != null) {
                                                                                    b2 b2Var = o3Var5.F3;
                                                                                    if (b2Var != null) {
                                                                                        b2Var.d();
                                                                                    }
                                                                                    o3Var5.r4(row);
                                                                                    b2 b2Var2 = o3Var5.F3;
                                                                                    if (b2Var2 != null) {
                                                                                        b2Var2.h();
                                                                                    }
                                                                                    m3 m3Var = o3Var5.d3;
                                                                                    if (m3Var != null) {
                                                                                        m3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                f5 f5Var4 = f5Var2;
                                                                                LinkedHashSet linkedHashSet4 = f5Var4.D;
                                                                                if (f5Var4.B != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i52 = Math.min(i52, f5Var4.B.b(pagetablecell5));
                                                                                        i53 = Math.min(i53, f5Var4.B.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    w5 w5Var2 = f5Var4.B;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i55 = -1;
                                                                                        int i56 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = w5Var2.b(pagetablecell6);
                                                                                            int a10 = w5Var2.a(pagetablecell6);
                                                                                            int o10 = w5.o(pagetablecell6);
                                                                                            int i57 = pagetablecell6.colspan;
                                                                                            if (i57 == 0) {
                                                                                                i57 = 1;
                                                                                            }
                                                                                            i51 = Math.min(i51, b14);
                                                                                            i54 = Math.min(i54, a10);
                                                                                            i55 = Math.max(i55, (b14 + o10) - 1);
                                                                                            i56 = Math.max(i56, (a10 + i57) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i58 = i51;
                                                                                        while (true) {
                                                                                            if (i58 <= i55) {
                                                                                                for (int i59 = i54; i59 <= i56; i59++) {
                                                                                                    if (i58 >= 0 && i59 >= 0 && i58 < w5Var2.b && i59 < w5Var2.c) {
                                                                                                        hashSet9.add(w5Var2.d[i58][i59]);
                                                                                                    }
                                                                                                }
                                                                                                i58++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new bg.l0(w5Var2, 4));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i60 = 0;
                                                                                                while (i60 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i60);
                                                                                                    i60++;
                                                                                                    String g10 = w5.g((TL_iv.pageTableCell) obj2);
                                                                                                    if (g10.isEmpty()) {
                                                                                                        arrayList = arrayList3;
                                                                                                    } else {
                                                                                                        if (sb2.length() > 0) {
                                                                                                            arrayList = arrayList3;
                                                                                                            sb2.append("\n");
                                                                                                        } else {
                                                                                                            arrayList = arrayList3;
                                                                                                        }
                                                                                                        sb2.append(g10);
                                                                                                    }
                                                                                                    arrayList3 = arrayList;
                                                                                                }
                                                                                                TL_iv.pageTableCell pagetablecell7 = w5Var2.d[i51][i54];
                                                                                                int i61 = (i56 - i54) + 1;
                                                                                                int i62 = (i55 - i51) + 1;
                                                                                                if (i61 <= 1) {
                                                                                                    i61 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i61;
                                                                                                int i63 = i62 > 1 ? i62 : 0;
                                                                                                pagetablecell7.rowspan = i63;
                                                                                                int i64 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i61 > 0 ? i64 | 2 : i64 & (-3);
                                                                                                int i65 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i65 | 4 : i65 & (-5);
                                                                                                w5.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = w5Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                w5Var2.i();
                                                                                                f5Var4.v();
                                                                                                f5Var4.v.invalidate();
                                                                                                f5Var4.q(i52, i53);
                                                                                                f5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                f5 f5Var5 = f5Var2;
                                                                                LinkedHashSet linkedHashSet5 = f5Var5.D;
                                                                                if (f5Var5.B != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (w5.n(pagetablecell9) <= 1) {
                                                                                        int i66 = pagetablecell9.rowspan;
                                                                                        if (i66 == 0) {
                                                                                            i66 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = f5Var5.B.b(pagetablecell9);
                                                                                    int a11 = f5Var5.B.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (f5Var5.B.p(pagetablecell9)) {
                                                                                        f5Var5.v();
                                                                                        f5Var5.v.invalidate();
                                                                                        f5Var5.q(b15, a11);
                                                                                        f5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                f5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                f5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                f5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                f5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                o3 o3Var6 = this.b;
                                                                                o3Var6.getClass();
                                                                                f5 f5Var6 = f5Var2;
                                                                                LinkedHashSet linkedHashSet6 = f5Var6.D;
                                                                                if (f5Var6.B == null || linkedHashSet6.isEmpty()) {
                                                                                    o3Var2 = o3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a12 = f5Var6.B.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a12));
                                                                                        i67 = Math.min(i67, a12);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    w5 w5Var3 = f5Var6.B;
                                                                                    w5Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        o3Var2 = o3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w5Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w5Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w5Var3.c];
                                                                                                int i68 = 0;
                                                                                                for (int i69 = 0; i69 < w5Var3.c; i69++) {
                                                                                                    iArr4[i69] = i68;
                                                                                                    if (!zArr2[i69]) {
                                                                                                        i68++;
                                                                                                    }
                                                                                                }
                                                                                                if (i68 == 0) {
                                                                                                    w5Var3.a.rows.clear();
                                                                                                    w5Var3.i();
                                                                                                    o3Var2 = o3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w5Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i70 = 0;
                                                                                                    while (i70 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i70);
                                                                                                        i70++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w5Var3.b(pagetablecell10);
                                                                                                        int a13 = w5Var3.a(pagetablecell10);
                                                                                                        int o11 = w5.o(pagetablecell10);
                                                                                                        int i71 = pagetablecell10.colspan;
                                                                                                        if (i71 == 0) {
                                                                                                            i71 = 1;
                                                                                                        }
                                                                                                        int i72 = -1;
                                                                                                        o3 o3Var7 = o3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i73 = 0;
                                                                                                        for (int i74 = a13; i74 < a13 + i71 && i74 < w5Var3.c; i74++) {
                                                                                                            if (!zArr3[i74]) {
                                                                                                                if (i72 < 0) {
                                                                                                                    i72 = i74;
                                                                                                                }
                                                                                                                i73++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i72 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i72], o11, i73});
                                                                                                        }
                                                                                                        o3Var6 = o3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    o3Var2 = o3Var6;
                                                                                                    w5Var3.j(identityHashMap2, w5Var3.b);
                                                                                                    w5Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var6.v();
                                                                                    if (z23) {
                                                                                        f5Var6.q(0, i67);
                                                                                    }
                                                                                }
                                                                                o3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, true);
                                                            } else {
                                                                r92 = 1;
                                                            }
                                                            if (i16 != 0) {
                                                                final int i49 = 0;
                                                                J1.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), new Runnable(this) { // from class: qh.g2
                                                                    public final /* synthetic */ o3 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        o3 o3Var;
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        o3 o3Var2;
                                                                        boolean z23;
                                                                        switch (i49) {
                                                                            case 0:
                                                                                o3 o3Var3 = this.b;
                                                                                o3Var3.getClass();
                                                                                f5 f5Var3 = f5Var2;
                                                                                LinkedHashSet linkedHashSet3 = f5Var3.D;
                                                                                if (f5Var3.B == null || linkedHashSet3.isEmpty()) {
                                                                                    o3Var = o3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i432 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = f5Var3.B.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i432 = Math.min(i432, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    w5 w5Var = f5Var3.B;
                                                                                    w5Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        o3Var = o3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w5Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w5Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w5Var.b];
                                                                                                int i442 = 0;
                                                                                                for (int i452 = 0; i452 < w5Var.b; i452++) {
                                                                                                    iArr2[i452] = i442;
                                                                                                    if (!zArr[i452]) {
                                                                                                        i442++;
                                                                                                    }
                                                                                                }
                                                                                                if (i442 == 0) {
                                                                                                    w5Var.a.rows.clear();
                                                                                                    w5Var.i();
                                                                                                    o3Var = o3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w5Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i462 = 0;
                                                                                                    while (i462 < size2) {
                                                                                                        Object obj = arrayList2.get(i462);
                                                                                                        i462++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w5Var.b(pagetablecell4);
                                                                                                        int a3 = w5Var.a(pagetablecell4);
                                                                                                        int o9 = w5.o(pagetablecell4);
                                                                                                        int i472 = pagetablecell4.colspan;
                                                                                                        if (i472 == 0) {
                                                                                                            i472 = 1;
                                                                                                        }
                                                                                                        int i482 = -1;
                                                                                                        o3 o3Var4 = o3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i492 = 0;
                                                                                                        for (int i50 = b13; i50 < b13 + o9 && i50 < w5Var.b; i50++) {
                                                                                                            if (!zArr[i50]) {
                                                                                                                if (i482 < 0) {
                                                                                                                    i482 = i50;
                                                                                                                }
                                                                                                                i492++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i482 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i482], a3, i492, i472});
                                                                                                        }
                                                                                                        o3Var3 = o3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    o3Var = o3Var3;
                                                                                                    w5Var.j(identityHashMap, i442);
                                                                                                    w5Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var3.v();
                                                                                    if (z22) {
                                                                                        f5Var3.q(i432, 0);
                                                                                    }
                                                                                }
                                                                                o3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                o3 o3Var5 = this.b;
                                                                                o3Var5.getClass();
                                                                                a row = f5Var2.getRow();
                                                                                o3Var5.M2();
                                                                                if (row != null) {
                                                                                    b2 b2Var = o3Var5.F3;
                                                                                    if (b2Var != null) {
                                                                                        b2Var.d();
                                                                                    }
                                                                                    o3Var5.r4(row);
                                                                                    b2 b2Var2 = o3Var5.F3;
                                                                                    if (b2Var2 != null) {
                                                                                        b2Var2.h();
                                                                                    }
                                                                                    m3 m3Var = o3Var5.d3;
                                                                                    if (m3Var != null) {
                                                                                        m3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                f5 f5Var4 = f5Var2;
                                                                                LinkedHashSet linkedHashSet4 = f5Var4.D;
                                                                                if (f5Var4.B != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i52 = Math.min(i52, f5Var4.B.b(pagetablecell5));
                                                                                        i53 = Math.min(i53, f5Var4.B.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    w5 w5Var2 = f5Var4.B;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i55 = -1;
                                                                                        int i56 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = w5Var2.b(pagetablecell6);
                                                                                            int a10 = w5Var2.a(pagetablecell6);
                                                                                            int o10 = w5.o(pagetablecell6);
                                                                                            int i57 = pagetablecell6.colspan;
                                                                                            if (i57 == 0) {
                                                                                                i57 = 1;
                                                                                            }
                                                                                            i51 = Math.min(i51, b14);
                                                                                            i54 = Math.min(i54, a10);
                                                                                            i55 = Math.max(i55, (b14 + o10) - 1);
                                                                                            i56 = Math.max(i56, (a10 + i57) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i58 = i51;
                                                                                        while (true) {
                                                                                            if (i58 <= i55) {
                                                                                                for (int i59 = i54; i59 <= i56; i59++) {
                                                                                                    if (i58 >= 0 && i59 >= 0 && i58 < w5Var2.b && i59 < w5Var2.c) {
                                                                                                        hashSet9.add(w5Var2.d[i58][i59]);
                                                                                                    }
                                                                                                }
                                                                                                i58++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new bg.l0(w5Var2, 4));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i60 = 0;
                                                                                                while (i60 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i60);
                                                                                                    i60++;
                                                                                                    String g10 = w5.g((TL_iv.pageTableCell) obj2);
                                                                                                    if (g10.isEmpty()) {
                                                                                                        arrayList = arrayList3;
                                                                                                    } else {
                                                                                                        if (sb2.length() > 0) {
                                                                                                            arrayList = arrayList3;
                                                                                                            sb2.append("\n");
                                                                                                        } else {
                                                                                                            arrayList = arrayList3;
                                                                                                        }
                                                                                                        sb2.append(g10);
                                                                                                    }
                                                                                                    arrayList3 = arrayList;
                                                                                                }
                                                                                                TL_iv.pageTableCell pagetablecell7 = w5Var2.d[i51][i54];
                                                                                                int i61 = (i56 - i54) + 1;
                                                                                                int i62 = (i55 - i51) + 1;
                                                                                                if (i61 <= 1) {
                                                                                                    i61 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i61;
                                                                                                int i63 = i62 > 1 ? i62 : 0;
                                                                                                pagetablecell7.rowspan = i63;
                                                                                                int i64 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i61 > 0 ? i64 | 2 : i64 & (-3);
                                                                                                int i65 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i65 | 4 : i65 & (-5);
                                                                                                w5.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = w5Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                w5Var2.i();
                                                                                                f5Var4.v();
                                                                                                f5Var4.v.invalidate();
                                                                                                f5Var4.q(i52, i53);
                                                                                                f5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                f5 f5Var5 = f5Var2;
                                                                                LinkedHashSet linkedHashSet5 = f5Var5.D;
                                                                                if (f5Var5.B != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (w5.n(pagetablecell9) <= 1) {
                                                                                        int i66 = pagetablecell9.rowspan;
                                                                                        if (i66 == 0) {
                                                                                            i66 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = f5Var5.B.b(pagetablecell9);
                                                                                    int a11 = f5Var5.B.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (f5Var5.B.p(pagetablecell9)) {
                                                                                        f5Var5.v();
                                                                                        f5Var5.v.invalidate();
                                                                                        f5Var5.q(b15, a11);
                                                                                        f5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                f5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                f5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                f5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                f5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                o3 o3Var6 = this.b;
                                                                                o3Var6.getClass();
                                                                                f5 f5Var6 = f5Var2;
                                                                                LinkedHashSet linkedHashSet6 = f5Var6.D;
                                                                                if (f5Var6.B == null || linkedHashSet6.isEmpty()) {
                                                                                    o3Var2 = o3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a12 = f5Var6.B.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a12));
                                                                                        i67 = Math.min(i67, a12);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    w5 w5Var3 = f5Var6.B;
                                                                                    w5Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        o3Var2 = o3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w5Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w5Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w5Var3.c];
                                                                                                int i68 = 0;
                                                                                                for (int i69 = 0; i69 < w5Var3.c; i69++) {
                                                                                                    iArr4[i69] = i68;
                                                                                                    if (!zArr2[i69]) {
                                                                                                        i68++;
                                                                                                    }
                                                                                                }
                                                                                                if (i68 == 0) {
                                                                                                    w5Var3.a.rows.clear();
                                                                                                    w5Var3.i();
                                                                                                    o3Var2 = o3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w5Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i70 = 0;
                                                                                                    while (i70 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i70);
                                                                                                        i70++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w5Var3.b(pagetablecell10);
                                                                                                        int a13 = w5Var3.a(pagetablecell10);
                                                                                                        int o11 = w5.o(pagetablecell10);
                                                                                                        int i71 = pagetablecell10.colspan;
                                                                                                        if (i71 == 0) {
                                                                                                            i71 = 1;
                                                                                                        }
                                                                                                        int i72 = -1;
                                                                                                        o3 o3Var7 = o3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i73 = 0;
                                                                                                        for (int i74 = a13; i74 < a13 + i71 && i74 < w5Var3.c; i74++) {
                                                                                                            if (!zArr3[i74]) {
                                                                                                                if (i72 < 0) {
                                                                                                                    i72 = i74;
                                                                                                                }
                                                                                                                i73++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i72 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i72], o11, i73});
                                                                                                        }
                                                                                                        o3Var6 = o3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    o3Var2 = o3Var6;
                                                                                                    w5Var3.j(identityHashMap2, w5Var3.b);
                                                                                                    w5Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var6.v();
                                                                                    if (z23) {
                                                                                        f5Var6.q(0, i67);
                                                                                    }
                                                                                }
                                                                                o3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r92);
                                                            }
                                                            if (z17) {
                                                                x60Var2 = J1;
                                                                i22 = 8;
                                                            } else {
                                                                J1.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), new Runnable(this) { // from class: qh.g2
                                                                    public final /* synthetic */ o3 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        o3 o3Var;
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        o3 o3Var2;
                                                                        boolean z23;
                                                                        switch (r92) {
                                                                            case 0:
                                                                                o3 o3Var3 = this.b;
                                                                                o3Var3.getClass();
                                                                                f5 f5Var3 = f5Var2;
                                                                                LinkedHashSet linkedHashSet3 = f5Var3.D;
                                                                                if (f5Var3.B == null || linkedHashSet3.isEmpty()) {
                                                                                    o3Var = o3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i432 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = f5Var3.B.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i432 = Math.min(i432, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    w5 w5Var = f5Var3.B;
                                                                                    w5Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        o3Var = o3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w5Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w5Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w5Var.b];
                                                                                                int i442 = 0;
                                                                                                for (int i452 = 0; i452 < w5Var.b; i452++) {
                                                                                                    iArr2[i452] = i442;
                                                                                                    if (!zArr[i452]) {
                                                                                                        i442++;
                                                                                                    }
                                                                                                }
                                                                                                if (i442 == 0) {
                                                                                                    w5Var.a.rows.clear();
                                                                                                    w5Var.i();
                                                                                                    o3Var = o3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w5Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i462 = 0;
                                                                                                    while (i462 < size2) {
                                                                                                        Object obj = arrayList2.get(i462);
                                                                                                        i462++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w5Var.b(pagetablecell4);
                                                                                                        int a3 = w5Var.a(pagetablecell4);
                                                                                                        int o9 = w5.o(pagetablecell4);
                                                                                                        int i472 = pagetablecell4.colspan;
                                                                                                        if (i472 == 0) {
                                                                                                            i472 = 1;
                                                                                                        }
                                                                                                        int i482 = -1;
                                                                                                        o3 o3Var4 = o3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i492 = 0;
                                                                                                        for (int i50 = b13; i50 < b13 + o9 && i50 < w5Var.b; i50++) {
                                                                                                            if (!zArr[i50]) {
                                                                                                                if (i482 < 0) {
                                                                                                                    i482 = i50;
                                                                                                                }
                                                                                                                i492++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i482 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i482], a3, i492, i472});
                                                                                                        }
                                                                                                        o3Var3 = o3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    o3Var = o3Var3;
                                                                                                    w5Var.j(identityHashMap, i442);
                                                                                                    w5Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var3.v();
                                                                                    if (z22) {
                                                                                        f5Var3.q(i432, 0);
                                                                                    }
                                                                                }
                                                                                o3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                o3 o3Var5 = this.b;
                                                                                o3Var5.getClass();
                                                                                a row = f5Var2.getRow();
                                                                                o3Var5.M2();
                                                                                if (row != null) {
                                                                                    b2 b2Var = o3Var5.F3;
                                                                                    if (b2Var != null) {
                                                                                        b2Var.d();
                                                                                    }
                                                                                    o3Var5.r4(row);
                                                                                    b2 b2Var2 = o3Var5.F3;
                                                                                    if (b2Var2 != null) {
                                                                                        b2Var2.h();
                                                                                    }
                                                                                    m3 m3Var = o3Var5.d3;
                                                                                    if (m3Var != null) {
                                                                                        m3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                f5 f5Var4 = f5Var2;
                                                                                LinkedHashSet linkedHashSet4 = f5Var4.D;
                                                                                if (f5Var4.B != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i52 = Math.min(i52, f5Var4.B.b(pagetablecell5));
                                                                                        i53 = Math.min(i53, f5Var4.B.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    w5 w5Var2 = f5Var4.B;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i55 = -1;
                                                                                        int i56 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = w5Var2.b(pagetablecell6);
                                                                                            int a10 = w5Var2.a(pagetablecell6);
                                                                                            int o10 = w5.o(pagetablecell6);
                                                                                            int i57 = pagetablecell6.colspan;
                                                                                            if (i57 == 0) {
                                                                                                i57 = 1;
                                                                                            }
                                                                                            i51 = Math.min(i51, b14);
                                                                                            i54 = Math.min(i54, a10);
                                                                                            i55 = Math.max(i55, (b14 + o10) - 1);
                                                                                            i56 = Math.max(i56, (a10 + i57) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i58 = i51;
                                                                                        while (true) {
                                                                                            if (i58 <= i55) {
                                                                                                for (int i59 = i54; i59 <= i56; i59++) {
                                                                                                    if (i58 >= 0 && i59 >= 0 && i58 < w5Var2.b && i59 < w5Var2.c) {
                                                                                                        hashSet9.add(w5Var2.d[i58][i59]);
                                                                                                    }
                                                                                                }
                                                                                                i58++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new bg.l0(w5Var2, 4));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i60 = 0;
                                                                                                while (i60 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i60);
                                                                                                    i60++;
                                                                                                    String g10 = w5.g((TL_iv.pageTableCell) obj2);
                                                                                                    if (g10.isEmpty()) {
                                                                                                        arrayList = arrayList3;
                                                                                                    } else {
                                                                                                        if (sb2.length() > 0) {
                                                                                                            arrayList = arrayList3;
                                                                                                            sb2.append("\n");
                                                                                                        } else {
                                                                                                            arrayList = arrayList3;
                                                                                                        }
                                                                                                        sb2.append(g10);
                                                                                                    }
                                                                                                    arrayList3 = arrayList;
                                                                                                }
                                                                                                TL_iv.pageTableCell pagetablecell7 = w5Var2.d[i51][i54];
                                                                                                int i61 = (i56 - i54) + 1;
                                                                                                int i62 = (i55 - i51) + 1;
                                                                                                if (i61 <= 1) {
                                                                                                    i61 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i61;
                                                                                                int i63 = i62 > 1 ? i62 : 0;
                                                                                                pagetablecell7.rowspan = i63;
                                                                                                int i64 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i61 > 0 ? i64 | 2 : i64 & (-3);
                                                                                                int i65 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i65 | 4 : i65 & (-5);
                                                                                                w5.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = w5Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                w5Var2.i();
                                                                                                f5Var4.v();
                                                                                                f5Var4.v.invalidate();
                                                                                                f5Var4.q(i52, i53);
                                                                                                f5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                f5 f5Var5 = f5Var2;
                                                                                LinkedHashSet linkedHashSet5 = f5Var5.D;
                                                                                if (f5Var5.B != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (w5.n(pagetablecell9) <= 1) {
                                                                                        int i66 = pagetablecell9.rowspan;
                                                                                        if (i66 == 0) {
                                                                                            i66 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = f5Var5.B.b(pagetablecell9);
                                                                                    int a11 = f5Var5.B.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (f5Var5.B.p(pagetablecell9)) {
                                                                                        f5Var5.v();
                                                                                        f5Var5.v.invalidate();
                                                                                        f5Var5.q(b15, a11);
                                                                                        f5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                f5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                f5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                f5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                f5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                o3 o3Var6 = this.b;
                                                                                o3Var6.getClass();
                                                                                f5 f5Var6 = f5Var2;
                                                                                LinkedHashSet linkedHashSet6 = f5Var6.D;
                                                                                if (f5Var6.B == null || linkedHashSet6.isEmpty()) {
                                                                                    o3Var2 = o3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a12 = f5Var6.B.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a12));
                                                                                        i67 = Math.min(i67, a12);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    w5 w5Var3 = f5Var6.B;
                                                                                    w5Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        o3Var2 = o3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w5Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w5Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w5Var3.c];
                                                                                                int i68 = 0;
                                                                                                for (int i69 = 0; i69 < w5Var3.c; i69++) {
                                                                                                    iArr4[i69] = i68;
                                                                                                    if (!zArr2[i69]) {
                                                                                                        i68++;
                                                                                                    }
                                                                                                }
                                                                                                if (i68 == 0) {
                                                                                                    w5Var3.a.rows.clear();
                                                                                                    w5Var3.i();
                                                                                                    o3Var2 = o3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w5Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i70 = 0;
                                                                                                    while (i70 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i70);
                                                                                                        i70++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w5Var3.b(pagetablecell10);
                                                                                                        int a13 = w5Var3.a(pagetablecell10);
                                                                                                        int o11 = w5.o(pagetablecell10);
                                                                                                        int i71 = pagetablecell10.colspan;
                                                                                                        if (i71 == 0) {
                                                                                                            i71 = 1;
                                                                                                        }
                                                                                                        int i72 = -1;
                                                                                                        o3 o3Var7 = o3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i73 = 0;
                                                                                                        for (int i74 = a13; i74 < a13 + i71 && i74 < w5Var3.c; i74++) {
                                                                                                            if (!zArr3[i74]) {
                                                                                                                if (i72 < 0) {
                                                                                                                    i72 = i74;
                                                                                                                }
                                                                                                                i73++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i72 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i72], o11, i73});
                                                                                                        }
                                                                                                        o3Var6 = o3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    o3Var2 = o3Var6;
                                                                                                    w5Var3.j(identityHashMap2, w5Var3.b);
                                                                                                    w5Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f5Var6.v();
                                                                                    if (z23) {
                                                                                        f5Var6.q(0, i67);
                                                                                    }
                                                                                }
                                                                                o3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r92);
                                                                J1.o();
                                                                x60Var2 = J1;
                                                                final int i50 = 0;
                                                                i22 = 8;
                                                                x60Var2.i(new Runnable() { // from class: qh.h2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i50) {
                                                                            case 0:
                                                                                x60Var2.n0 = true;
                                                                                boolean z22 = !model.a.bordered;
                                                                                f5 f5Var3 = f5Var2;
                                                                                w5 w5Var = f5Var3.B;
                                                                                if (w5Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var.a;
                                                                                    if (pageblocktable2.bordered != z22) {
                                                                                        pageblocktable2.bordered = z22;
                                                                                        f5Var3.v.invalidate();
                                                                                        v2 v2Var = f5Var3.A;
                                                                                        if (v2Var != null && f5Var3.a != null) {
                                                                                            v2Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z22);
                                                                                break;
                                                                            default:
                                                                                x60Var2.n0 = true;
                                                                                boolean z23 = !model.a.compact;
                                                                                f5 f5Var4 = f5Var2;
                                                                                w5 w5Var2 = f5Var4.B;
                                                                                if (w5Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = w5Var2.a;
                                                                                    if (pageblocktable3.compact != z23) {
                                                                                        pageblocktable3.compact = z23;
                                                                                        h5 h5Var = f5Var4.v;
                                                                                        if (h5Var.a != null) {
                                                                                            for (int i51 = 0; i51 < h5Var.getChildCount(); i51++) {
                                                                                                View childAt = h5Var.getChildAt(i51);
                                                                                                if (childAt instanceof i5) {
                                                                                                    ((i5) childAt).setCompact(h5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            h5Var.requestLayout();
                                                                                            h5Var.invalidate();
                                                                                        }
                                                                                        f5Var4.w.requestLayout();
                                                                                        f5Var4.requestLayout();
                                                                                        v2 v2Var2 = f5Var4.A;
                                                                                        if (v2Var2 != null && f5Var4.a != null) {
                                                                                            v2Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z23);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, LocaleController.getString(R.string.ArticleTableBordered), pageblocktable.bordered);
                                                                final int i51 = 1;
                                                                f5Var2 = f5Var;
                                                                x60Var2.i(new Runnable() { // from class: qh.h2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i51) {
                                                                            case 0:
                                                                                x60Var2.n0 = true;
                                                                                boolean z22 = !model.a.bordered;
                                                                                f5 f5Var3 = f5Var2;
                                                                                w5 w5Var = f5Var3.B;
                                                                                if (w5Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w5Var.a;
                                                                                    if (pageblocktable2.bordered != z22) {
                                                                                        pageblocktable2.bordered = z22;
                                                                                        f5Var3.v.invalidate();
                                                                                        v2 v2Var = f5Var3.A;
                                                                                        if (v2Var != null && f5Var3.a != null) {
                                                                                            v2Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z22);
                                                                                break;
                                                                            default:
                                                                                x60Var2.n0 = true;
                                                                                boolean z23 = !model.a.compact;
                                                                                f5 f5Var4 = f5Var2;
                                                                                w5 w5Var2 = f5Var4.B;
                                                                                if (w5Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = w5Var2.a;
                                                                                    if (pageblocktable3.compact != z23) {
                                                                                        pageblocktable3.compact = z23;
                                                                                        h5 h5Var = f5Var4.v;
                                                                                        if (h5Var.a != null) {
                                                                                            for (int i512 = 0; i512 < h5Var.getChildCount(); i512++) {
                                                                                                View childAt = h5Var.getChildAt(i512);
                                                                                                if (childAt instanceof i5) {
                                                                                                    ((i5) childAt).setCompact(h5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            h5Var.requestLayout();
                                                                                            h5Var.invalidate();
                                                                                        }
                                                                                        f5Var4.w.requestLayout();
                                                                                        f5Var4.requestLayout();
                                                                                        v2 v2Var2 = f5Var4.A;
                                                                                        if (v2Var2 != null && f5Var4.a != null) {
                                                                                            v2Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z23);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, LocaleController.getString(R.string.ArticleTableCompact), pageblocktable.compact);
                                                                final org.telegram.ui.ActionBar.g1[] g1VarArr = {x60Var2.y(), x60Var2.y()};
                                                            }
                                                            x60Var2.p = new pf.a(this, x60Var2, f5Var2, i22);
                                                            this.f4 = x60Var2;
                                                            x60Var2.Z();
                                                        }
                                                        z18 = false;
                                                        if (!z18) {
                                                        }
                                                        J1.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new np0(this, f5Var2, z18, 13), false);
                                                        if (i13 != 0) {
                                                        }
                                                        if (i15 != 0) {
                                                        }
                                                        if (z14) {
                                                        }
                                                        if (z15) {
                                                        }
                                                        if (i14 == 0) {
                                                        }
                                                        if (i16 != 0) {
                                                        }
                                                        if (z17) {
                                                        }
                                                        x60Var2.p = new pf.a(this, x60Var2, f5Var2, i22);
                                                        this.f4 = x60Var2;
                                                        x60Var2.Z();
                                                    }
                                                }
                                                i12 = 0;
                                                if (z13) {
                                                }
                                                if (z13) {
                                                }
                                                x60Var = this.f4;
                                                if (x60Var != null) {
                                                }
                                                i13 = i9;
                                                dp = AndroidUtilities.dp(((i9 + 1 + i10 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i12 + i11 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                FrameLayout P42 = P4(f5Var2, false);
                                                iArr = new int[2];
                                                P42.getLocationOnScreen(iArr);
                                                if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                                }
                                                x60 J12 = this.d3.J1(P42);
                                                J12.s = 0;
                                                J12.t = false;
                                                J12.Z = z16;
                                                LinearLayout linearLayout3 = new LinearLayout(getContext());
                                                linearLayout3.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                                linearLayout3.setOrientation(1);
                                                i14 = i12;
                                                TextView textView2 = new TextView(getContext());
                                                textView2.setText(LocaleController.getString(R.string.ArticleAlignment));
                                                textView2.setTextSize(1, 12.0f);
                                                textView2.setGravity(17);
                                                textView2.setTextColor(f6.v0(f6.y6, this.l2));
                                                linearLayout3.addView(textView2, e6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                LinearLayout linearLayout22 = new LinearLayout(getContext());
                                                i15 = i10;
                                                i16 = i11;
                                                linearLayout22.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                                linearLayout22.setOrientation(0);
                                                linearLayout3.addView(linearLayout22, e6.q(-2, -2, 17));
                                                Context context2 = getContext();
                                                int i362 = R.drawable.iv_align_horiz_left;
                                                b6 b6Var2 = this.c3;
                                                t1 t1Var7 = new t1(context2, i362, b6Var2);
                                                t1Var7.e = 4;
                                                t1Var7.d();
                                                t1Var7.b();
                                                int i372 = f6.G8;
                                                t1Var7.c(i372);
                                                boolean z202 = z10;
                                                linearLayout22.addView(t1Var7, e6.n(32, 32));
                                                t1 t1Var22 = new t1(getContext(), R.drawable.iv_align_horiz_middle, b6Var2);
                                                t1Var22.e = 4;
                                                t1Var22.d();
                                                t1Var22.b();
                                                t1Var22.c(i372);
                                                linearLayout22.addView(t1Var22, e6.n(32, 32));
                                                t1 t1Var32 = new t1(getContext(), R.drawable.iv_align_horiz_right, b6Var2);
                                                t1Var32.e = 4;
                                                t1Var32.d();
                                                t1Var32.b();
                                                t1Var32.c(i372);
                                                final t1[] t1VarArr3 = {t1Var7, t1Var22, t1Var32};
                                                boolean z212 = z11;
                                                linearLayout22.addView(t1Var32, e6.n(32, 32));
                                                z17 = z12;
                                                linearLayout22.addView(new Space(getContext()), e6.n(8, 0));
                                                t1 t1Var42 = new t1(getContext(), R.drawable.iv_align_vert_top, b6Var2);
                                                t1Var42.e = 4;
                                                t1Var42.d();
                                                t1Var42.b();
                                                t1Var42.c(i372);
                                                linearLayout22.addView(t1Var42, e6.n(32, 32));
                                                t1 t1Var52 = new t1(getContext(), R.drawable.iv_align_vert_middle, b6Var2);
                                                t1Var52.e = 4;
                                                t1Var52.d();
                                                t1Var52.b();
                                                t1Var52.c(i372);
                                                linearLayout22.addView(t1Var52, e6.n(32, 32));
                                                t1 t1Var62 = new t1(getContext(), R.drawable.iv_align_vert_bottom, b6Var2);
                                                t1Var62.e = 4;
                                                t1Var62.d();
                                                t1Var62.b();
                                                t1Var62.c(i372);
                                                final t1[] t1VarArr22 = {t1Var42, t1Var52, t1Var62};
                                                linearLayout22.addView(t1Var62, e6.n(32, 32));
                                                J12.q(linearLayout3);
                                                it3 = linkedHashSet.iterator();
                                                int i382 = -1;
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                    }
                                                }
                                                it4 = linkedHashSet.iterator();
                                                int i392 = -1;
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                    }
                                                }
                                                i17 = 0;
                                                while (i17 < 3) {
                                                }
                                                i19 = 0;
                                                while (i19 < 3) {
                                                }
                                                while (i20 < 3) {
                                                }
                                                i21 = 0;
                                                while (i21 < i18) {
                                                }
                                                J12.o();
                                                J12.S = 208;
                                                if (!linkedHashSet.isEmpty()) {
                                                }
                                                z18 = false;
                                                if (!z18) {
                                                }
                                                J12.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new np0(this, f5Var2, z18, 13), false);
                                                if (i13 != 0) {
                                                }
                                                if (i15 != 0) {
                                                }
                                                if (z14) {
                                                }
                                                if (z15) {
                                                }
                                                if (i14 == 0) {
                                                }
                                                if (i16 != 0) {
                                                }
                                                if (z17) {
                                                }
                                                x60Var2.p = new pf.a(this, x60Var2, f5Var2, i22);
                                                this.f4 = x60Var2;
                                                x60Var2.Z();
                                            }
                                        }
                                        i11 = 0;
                                        if (z11) {
                                            hashSet3 = new HashSet();
                                            it5 = selectedCells.iterator();
                                            while (it5.hasNext()) {
                                            }
                                            if (hashSet3.size() < model.c) {
                                            }
                                        }
                                        i12 = 0;
                                        if (z13) {
                                        }
                                        if (z13) {
                                        }
                                        x60Var = this.f4;
                                        if (x60Var != null) {
                                        }
                                        i13 = i9;
                                        dp = AndroidUtilities.dp(((i9 + 1 + i10 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i12 + i11 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                        FrameLayout P422 = P4(f5Var2, false);
                                        iArr = new int[2];
                                        P422.getLocationOnScreen(iArr);
                                        if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                        }
                                        x60 J122 = this.d3.J1(P422);
                                        J122.s = 0;
                                        J122.t = false;
                                        J122.Z = z16;
                                        LinearLayout linearLayout32 = new LinearLayout(getContext());
                                        linearLayout32.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                        linearLayout32.setOrientation(1);
                                        i14 = i12;
                                        TextView textView22 = new TextView(getContext());
                                        textView22.setText(LocaleController.getString(R.string.ArticleAlignment));
                                        textView22.setTextSize(1, 12.0f);
                                        textView22.setGravity(17);
                                        textView22.setTextColor(f6.v0(f6.y6, this.l2));
                                        linearLayout32.addView(textView22, e6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                        LinearLayout linearLayout222 = new LinearLayout(getContext());
                                        i15 = i10;
                                        i16 = i11;
                                        linearLayout222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                        linearLayout222.setOrientation(0);
                                        linearLayout32.addView(linearLayout222, e6.q(-2, -2, 17));
                                        Context context22 = getContext();
                                        int i3622 = R.drawable.iv_align_horiz_left;
                                        b6 b6Var22 = this.c3;
                                        t1 t1Var72 = new t1(context22, i3622, b6Var22);
                                        t1Var72.e = 4;
                                        t1Var72.d();
                                        t1Var72.b();
                                        int i3722 = f6.G8;
                                        t1Var72.c(i3722);
                                        boolean z2022 = z10;
                                        linearLayout222.addView(t1Var72, e6.n(32, 32));
                                        t1 t1Var222 = new t1(getContext(), R.drawable.iv_align_horiz_middle, b6Var22);
                                        t1Var222.e = 4;
                                        t1Var222.d();
                                        t1Var222.b();
                                        t1Var222.c(i3722);
                                        linearLayout222.addView(t1Var222, e6.n(32, 32));
                                        t1 t1Var322 = new t1(getContext(), R.drawable.iv_align_horiz_right, b6Var22);
                                        t1Var322.e = 4;
                                        t1Var322.d();
                                        t1Var322.b();
                                        t1Var322.c(i3722);
                                        final t1[] t1VarArr32 = {t1Var72, t1Var222, t1Var322};
                                        boolean z2122 = z11;
                                        linearLayout222.addView(t1Var322, e6.n(32, 32));
                                        z17 = z12;
                                        linearLayout222.addView(new Space(getContext()), e6.n(8, 0));
                                        t1 t1Var422 = new t1(getContext(), R.drawable.iv_align_vert_top, b6Var22);
                                        t1Var422.e = 4;
                                        t1Var422.d();
                                        t1Var422.b();
                                        t1Var422.c(i3722);
                                        linearLayout222.addView(t1Var422, e6.n(32, 32));
                                        t1 t1Var522 = new t1(getContext(), R.drawable.iv_align_vert_middle, b6Var22);
                                        t1Var522.e = 4;
                                        t1Var522.d();
                                        t1Var522.b();
                                        t1Var522.c(i3722);
                                        linearLayout222.addView(t1Var522, e6.n(32, 32));
                                        t1 t1Var622 = new t1(getContext(), R.drawable.iv_align_vert_bottom, b6Var22);
                                        t1Var622.e = 4;
                                        t1Var622.d();
                                        t1Var622.b();
                                        t1Var622.c(i3722);
                                        final t1[] t1VarArr222 = {t1Var422, t1Var522, t1Var622};
                                        linearLayout222.addView(t1Var622, e6.n(32, 32));
                                        J122.q(linearLayout32);
                                        it3 = linkedHashSet.iterator();
                                        int i3822 = -1;
                                        while (true) {
                                            if (!it3.hasNext()) {
                                            }
                                        }
                                        it4 = linkedHashSet.iterator();
                                        int i3922 = -1;
                                        while (true) {
                                            if (!it4.hasNext()) {
                                            }
                                        }
                                        i17 = 0;
                                        while (i17 < 3) {
                                        }
                                        i19 = 0;
                                        while (i19 < 3) {
                                        }
                                        while (i20 < 3) {
                                        }
                                        i21 = 0;
                                        while (i21 < i18) {
                                        }
                                        J122.o();
                                        J122.S = 208;
                                        if (!linkedHashSet.isEmpty()) {
                                        }
                                        z18 = false;
                                        if (!z18) {
                                        }
                                        J122.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new np0(this, f5Var2, z18, 13), false);
                                        if (i13 != 0) {
                                        }
                                        if (i15 != 0) {
                                        }
                                        if (z14) {
                                        }
                                        if (z15) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i16 != 0) {
                                        }
                                        if (z17) {
                                        }
                                        x60Var2.p = new pf.a(this, x60Var2, f5Var2, i22);
                                        this.f4 = x60Var2;
                                        x60Var2.Z();
                                    }
                                    z11 = false;
                                    if (selectedCells.isEmpty()) {
                                    }
                                    z12 = false;
                                    if (z12) {
                                    }
                                    if (z10) {
                                    }
                                    c10 = 1;
                                    i11 = 0;
                                    if (z11) {
                                    }
                                    i12 = 0;
                                    if (z13) {
                                    }
                                    if (z13) {
                                    }
                                    x60Var = this.f4;
                                    if (x60Var != null) {
                                    }
                                    i13 = i9;
                                    dp = AndroidUtilities.dp(((i9 + 1 + i10 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i12 + i11 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                    FrameLayout P4222 = P4(f5Var2, false);
                                    iArr = new int[2];
                                    P4222.getLocationOnScreen(iArr);
                                    if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                    }
                                    x60 J1222 = this.d3.J1(P4222);
                                    J1222.s = 0;
                                    J1222.t = false;
                                    J1222.Z = z16;
                                    LinearLayout linearLayout322 = new LinearLayout(getContext());
                                    linearLayout322.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                    linearLayout322.setOrientation(1);
                                    i14 = i12;
                                    TextView textView222 = new TextView(getContext());
                                    textView222.setText(LocaleController.getString(R.string.ArticleAlignment));
                                    textView222.setTextSize(1, 12.0f);
                                    textView222.setGravity(17);
                                    textView222.setTextColor(f6.v0(f6.y6, this.l2));
                                    linearLayout322.addView(textView222, e6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                    LinearLayout linearLayout2222 = new LinearLayout(getContext());
                                    i15 = i10;
                                    i16 = i11;
                                    linearLayout2222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    linearLayout2222.setOrientation(0);
                                    linearLayout322.addView(linearLayout2222, e6.q(-2, -2, 17));
                                    Context context222 = getContext();
                                    int i36222 = R.drawable.iv_align_horiz_left;
                                    b6 b6Var222 = this.c3;
                                    t1 t1Var722 = new t1(context222, i36222, b6Var222);
                                    t1Var722.e = 4;
                                    t1Var722.d();
                                    t1Var722.b();
                                    int i37222 = f6.G8;
                                    t1Var722.c(i37222);
                                    boolean z20222 = z10;
                                    linearLayout2222.addView(t1Var722, e6.n(32, 32));
                                    t1 t1Var2222 = new t1(getContext(), R.drawable.iv_align_horiz_middle, b6Var222);
                                    t1Var2222.e = 4;
                                    t1Var2222.d();
                                    t1Var2222.b();
                                    t1Var2222.c(i37222);
                                    linearLayout2222.addView(t1Var2222, e6.n(32, 32));
                                    t1 t1Var3222 = new t1(getContext(), R.drawable.iv_align_horiz_right, b6Var222);
                                    t1Var3222.e = 4;
                                    t1Var3222.d();
                                    t1Var3222.b();
                                    t1Var3222.c(i37222);
                                    final t1[] t1VarArr322 = {t1Var722, t1Var2222, t1Var3222};
                                    boolean z21222 = z11;
                                    linearLayout2222.addView(t1Var3222, e6.n(32, 32));
                                    z17 = z12;
                                    linearLayout2222.addView(new Space(getContext()), e6.n(8, 0));
                                    t1 t1Var4222 = new t1(getContext(), R.drawable.iv_align_vert_top, b6Var222);
                                    t1Var4222.e = 4;
                                    t1Var4222.d();
                                    t1Var4222.b();
                                    t1Var4222.c(i37222);
                                    linearLayout2222.addView(t1Var4222, e6.n(32, 32));
                                    t1 t1Var5222 = new t1(getContext(), R.drawable.iv_align_vert_middle, b6Var222);
                                    t1Var5222.e = 4;
                                    t1Var5222.d();
                                    t1Var5222.b();
                                    t1Var5222.c(i37222);
                                    linearLayout2222.addView(t1Var5222, e6.n(32, 32));
                                    t1 t1Var6222 = new t1(getContext(), R.drawable.iv_align_vert_bottom, b6Var222);
                                    t1Var6222.e = 4;
                                    t1Var6222.d();
                                    t1Var6222.b();
                                    t1Var6222.c(i37222);
                                    final t1[] t1VarArr2222 = {t1Var4222, t1Var5222, t1Var6222};
                                    linearLayout2222.addView(t1Var6222, e6.n(32, 32));
                                    J1222.q(linearLayout322);
                                    it3 = linkedHashSet.iterator();
                                    int i38222 = -1;
                                    while (true) {
                                        if (!it3.hasNext()) {
                                        }
                                    }
                                    it4 = linkedHashSet.iterator();
                                    int i39222 = -1;
                                    while (true) {
                                        if (!it4.hasNext()) {
                                        }
                                    }
                                    i17 = 0;
                                    while (i17 < 3) {
                                    }
                                    i19 = 0;
                                    while (i19 < 3) {
                                    }
                                    while (i20 < 3) {
                                    }
                                    i21 = 0;
                                    while (i21 < i18) {
                                    }
                                    J1222.o();
                                    J1222.S = 208;
                                    if (!linkedHashSet.isEmpty()) {
                                    }
                                    z18 = false;
                                    if (!z18) {
                                    }
                                    J1222.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new np0(this, f5Var2, z18, 13), false);
                                    if (i13 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (z14) {
                                    }
                                    if (z15) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    if (z17) {
                                    }
                                    x60Var2.p = new pf.a(this, x60Var2, f5Var2, i22);
                                    this.f4 = x60Var2;
                                    x60Var2.Z();
                                }
                                z10 = false;
                                hashSet2 = new HashSet();
                                it2 = selectedCells.iterator();
                                while (it2.hasNext()) {
                                }
                                if (!hashSet2.isEmpty()) {
                                }
                                z11 = false;
                                if (selectedCells.isEmpty()) {
                                }
                                z12 = false;
                                if (z12) {
                                }
                                if (z10) {
                                }
                                c10 = 1;
                                i11 = 0;
                                if (z11) {
                                }
                                i12 = 0;
                                if (z13) {
                                }
                                if (z13) {
                                }
                                x60Var = this.f4;
                                if (x60Var != null) {
                                }
                                i13 = i9;
                                dp = AndroidUtilities.dp(((i9 + 1 + i10 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i12 + i11 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                FrameLayout P42222 = P4(f5Var2, false);
                                iArr = new int[2];
                                P42222.getLocationOnScreen(iArr);
                                if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                }
                                x60 J12222 = this.d3.J1(P42222);
                                J12222.s = 0;
                                J12222.t = false;
                                J12222.Z = z16;
                                LinearLayout linearLayout3222 = new LinearLayout(getContext());
                                linearLayout3222.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                linearLayout3222.setOrientation(1);
                                i14 = i12;
                                TextView textView2222 = new TextView(getContext());
                                textView2222.setText(LocaleController.getString(R.string.ArticleAlignment));
                                textView2222.setTextSize(1, 12.0f);
                                textView2222.setGravity(17);
                                textView2222.setTextColor(f6.v0(f6.y6, this.l2));
                                linearLayout3222.addView(textView2222, e6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                LinearLayout linearLayout22222 = new LinearLayout(getContext());
                                i15 = i10;
                                i16 = i11;
                                linearLayout22222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                linearLayout22222.setOrientation(0);
                                linearLayout3222.addView(linearLayout22222, e6.q(-2, -2, 17));
                                Context context2222 = getContext();
                                int i362222 = R.drawable.iv_align_horiz_left;
                                b6 b6Var2222 = this.c3;
                                t1 t1Var7222 = new t1(context2222, i362222, b6Var2222);
                                t1Var7222.e = 4;
                                t1Var7222.d();
                                t1Var7222.b();
                                int i372222 = f6.G8;
                                t1Var7222.c(i372222);
                                boolean z202222 = z10;
                                linearLayout22222.addView(t1Var7222, e6.n(32, 32));
                                t1 t1Var22222 = new t1(getContext(), R.drawable.iv_align_horiz_middle, b6Var2222);
                                t1Var22222.e = 4;
                                t1Var22222.d();
                                t1Var22222.b();
                                t1Var22222.c(i372222);
                                linearLayout22222.addView(t1Var22222, e6.n(32, 32));
                                t1 t1Var32222 = new t1(getContext(), R.drawable.iv_align_horiz_right, b6Var2222);
                                t1Var32222.e = 4;
                                t1Var32222.d();
                                t1Var32222.b();
                                t1Var32222.c(i372222);
                                final t1[] t1VarArr3222 = {t1Var7222, t1Var22222, t1Var32222};
                                boolean z212222 = z11;
                                linearLayout22222.addView(t1Var32222, e6.n(32, 32));
                                z17 = z12;
                                linearLayout22222.addView(new Space(getContext()), e6.n(8, 0));
                                t1 t1Var42222 = new t1(getContext(), R.drawable.iv_align_vert_top, b6Var2222);
                                t1Var42222.e = 4;
                                t1Var42222.d();
                                t1Var42222.b();
                                t1Var42222.c(i372222);
                                linearLayout22222.addView(t1Var42222, e6.n(32, 32));
                                t1 t1Var52222 = new t1(getContext(), R.drawable.iv_align_vert_middle, b6Var2222);
                                t1Var52222.e = 4;
                                t1Var52222.d();
                                t1Var52222.b();
                                t1Var52222.c(i372222);
                                linearLayout22222.addView(t1Var52222, e6.n(32, 32));
                                t1 t1Var62222 = new t1(getContext(), R.drawable.iv_align_vert_bottom, b6Var2222);
                                t1Var62222.e = 4;
                                t1Var62222.d();
                                t1Var62222.b();
                                t1Var62222.c(i372222);
                                final t1[] t1VarArr22222 = {t1Var42222, t1Var52222, t1Var62222};
                                linearLayout22222.addView(t1Var62222, e6.n(32, 32));
                                J12222.q(linearLayout3222);
                                it3 = linkedHashSet.iterator();
                                int i382222 = -1;
                                while (true) {
                                    if (!it3.hasNext()) {
                                    }
                                }
                                it4 = linkedHashSet.iterator();
                                int i392222 = -1;
                                while (true) {
                                    if (!it4.hasNext()) {
                                    }
                                }
                                i17 = 0;
                                while (i17 < 3) {
                                }
                                i19 = 0;
                                while (i19 < 3) {
                                }
                                while (i20 < 3) {
                                }
                                i21 = 0;
                                while (i21 < i18) {
                                }
                                J12222.o();
                                J12222.S = 208;
                                if (!linkedHashSet.isEmpty()) {
                                }
                                z18 = false;
                                if (!z18) {
                                }
                                J12222.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new np0(this, f5Var2, z18, 13), false);
                                if (i13 != 0) {
                                }
                                if (i15 != 0) {
                                }
                                if (z14) {
                                }
                                if (z15) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (z17) {
                                }
                                x60Var2.p = new pf.a(this, x60Var2, f5Var2, i22);
                                this.f4 = x60Var2;
                                x60Var2.Z();
                            }
                        }
                    }
                    z19 = true;
                    if (z19) {
                    }
                }
                i10 = 0;
                hashSet = new HashSet();
                it = selectedCells.iterator();
                while (it.hasNext()) {
                }
                if (!hashSet.isEmpty()) {
                }
                z10 = false;
                hashSet2 = new HashSet();
                it2 = selectedCells.iterator();
                while (it2.hasNext()) {
                }
                if (!hashSet2.isEmpty()) {
                }
                z11 = false;
                if (selectedCells.isEmpty()) {
                }
                z12 = false;
                if (z12) {
                }
                if (z10) {
                }
                c10 = 1;
                i11 = 0;
                if (z11) {
                }
                i12 = 0;
                if (z13) {
                }
                if (z13) {
                }
                x60Var = this.f4;
                if (x60Var != null) {
                }
                i13 = i9;
                dp = AndroidUtilities.dp(((i9 + 1 + i10 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i12 + i11 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                FrameLayout P422222 = P4(f5Var2, false);
                iArr = new int[2];
                P422222.getLocationOnScreen(iArr);
                if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                }
                x60 J122222 = this.d3.J1(P422222);
                J122222.s = 0;
                J122222.t = false;
                J122222.Z = z16;
                LinearLayout linearLayout32222 = new LinearLayout(getContext());
                linearLayout32222.setMinimumWidth(AndroidUtilities.dp(208.0f));
                linearLayout32222.setOrientation(1);
                i14 = i12;
                TextView textView22222 = new TextView(getContext());
                textView22222.setText(LocaleController.getString(R.string.ArticleAlignment));
                textView22222.setTextSize(1, 12.0f);
                textView22222.setGravity(17);
                textView22222.setTextColor(f6.v0(f6.y6, this.l2));
                linearLayout32222.addView(textView22222, e6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                LinearLayout linearLayout222222 = new LinearLayout(getContext());
                i15 = i10;
                i16 = i11;
                linearLayout222222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                linearLayout222222.setOrientation(0);
                linearLayout32222.addView(linearLayout222222, e6.q(-2, -2, 17));
                Context context22222 = getContext();
                int i3622222 = R.drawable.iv_align_horiz_left;
                b6 b6Var22222 = this.c3;
                t1 t1Var72222 = new t1(context22222, i3622222, b6Var22222);
                t1Var72222.e = 4;
                t1Var72222.d();
                t1Var72222.b();
                int i3722222 = f6.G8;
                t1Var72222.c(i3722222);
                boolean z2022222 = z10;
                linearLayout222222.addView(t1Var72222, e6.n(32, 32));
                t1 t1Var222222 = new t1(getContext(), R.drawable.iv_align_horiz_middle, b6Var22222);
                t1Var222222.e = 4;
                t1Var222222.d();
                t1Var222222.b();
                t1Var222222.c(i3722222);
                linearLayout222222.addView(t1Var222222, e6.n(32, 32));
                t1 t1Var322222 = new t1(getContext(), R.drawable.iv_align_horiz_right, b6Var22222);
                t1Var322222.e = 4;
                t1Var322222.d();
                t1Var322222.b();
                t1Var322222.c(i3722222);
                final t1[] t1VarArr32222 = {t1Var72222, t1Var222222, t1Var322222};
                boolean z2122222 = z11;
                linearLayout222222.addView(t1Var322222, e6.n(32, 32));
                z17 = z12;
                linearLayout222222.addView(new Space(getContext()), e6.n(8, 0));
                t1 t1Var422222 = new t1(getContext(), R.drawable.iv_align_vert_top, b6Var22222);
                t1Var422222.e = 4;
                t1Var422222.d();
                t1Var422222.b();
                t1Var422222.c(i3722222);
                linearLayout222222.addView(t1Var422222, e6.n(32, 32));
                t1 t1Var522222 = new t1(getContext(), R.drawable.iv_align_vert_middle, b6Var22222);
                t1Var522222.e = 4;
                t1Var522222.d();
                t1Var522222.b();
                t1Var522222.c(i3722222);
                linearLayout222222.addView(t1Var522222, e6.n(32, 32));
                t1 t1Var622222 = new t1(getContext(), R.drawable.iv_align_vert_bottom, b6Var22222);
                t1Var622222.e = 4;
                t1Var622222.d();
                t1Var622222.b();
                t1Var622222.c(i3722222);
                final t1[] t1VarArr222222 = {t1Var422222, t1Var522222, t1Var622222};
                linearLayout222222.addView(t1Var622222, e6.n(32, 32));
                J122222.q(linearLayout32222);
                it3 = linkedHashSet.iterator();
                int i3822222 = -1;
                while (true) {
                    if (!it3.hasNext()) {
                    }
                }
                it4 = linkedHashSet.iterator();
                int i3922222 = -1;
                while (true) {
                    if (!it4.hasNext()) {
                    }
                }
                i17 = 0;
                while (i17 < 3) {
                }
                i19 = 0;
                while (i19 < 3) {
                }
                while (i20 < 3) {
                }
                i21 = 0;
                while (i21 < i18) {
                }
                J122222.o();
                J122222.S = 208;
                if (!linkedHashSet.isEmpty()) {
                }
                z18 = false;
                if (!z18) {
                }
                J122222.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new np0(this, f5Var2, z18, 13), false);
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (z14) {
                }
                if (z15) {
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                }
                if (z17) {
                }
                x60Var2.p = new pf.a(this, x60Var2, f5Var2, i22);
                this.f4 = x60Var2;
                x60Var2.Z();
            }
        }
        i9 = 0;
        if (size == 1) {
        }
        i10 = 0;
        hashSet = new HashSet();
        it = selectedCells.iterator();
        while (it.hasNext()) {
        }
        if (!hashSet.isEmpty()) {
        }
        z10 = false;
        hashSet2 = new HashSet();
        it2 = selectedCells.iterator();
        while (it2.hasNext()) {
        }
        if (!hashSet2.isEmpty()) {
        }
        z11 = false;
        if (selectedCells.isEmpty()) {
        }
        z12 = false;
        if (z12) {
        }
        if (z10) {
        }
        c10 = 1;
        i11 = 0;
        if (z11) {
        }
        i12 = 0;
        if (z13) {
        }
        if (z13) {
        }
        x60Var = this.f4;
        if (x60Var != null) {
        }
        i13 = i9;
        dp = AndroidUtilities.dp(((i9 + 1 + i10 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i12 + i11 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
        FrameLayout P4222222 = P4(f5Var2, false);
        iArr = new int[2];
        P4222222.getLocationOnScreen(iArr);
        if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
        }
        x60 J1222222 = this.d3.J1(P4222222);
        J1222222.s = 0;
        J1222222.t = false;
        J1222222.Z = z16;
        LinearLayout linearLayout322222 = new LinearLayout(getContext());
        linearLayout322222.setMinimumWidth(AndroidUtilities.dp(208.0f));
        linearLayout322222.setOrientation(1);
        i14 = i12;
        TextView textView222222 = new TextView(getContext());
        textView222222.setText(LocaleController.getString(R.string.ArticleAlignment));
        textView222222.setTextSize(1, 12.0f);
        textView222222.setGravity(17);
        textView222222.setTextColor(f6.v0(f6.y6, this.l2));
        linearLayout322222.addView(textView222222, e6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
        LinearLayout linearLayout2222222 = new LinearLayout(getContext());
        i15 = i10;
        i16 = i11;
        linearLayout2222222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        linearLayout2222222.setOrientation(0);
        linearLayout322222.addView(linearLayout2222222, e6.q(-2, -2, 17));
        Context context222222 = getContext();
        int i36222222 = R.drawable.iv_align_horiz_left;
        b6 b6Var222222 = this.c3;
        t1 t1Var722222 = new t1(context222222, i36222222, b6Var222222);
        t1Var722222.e = 4;
        t1Var722222.d();
        t1Var722222.b();
        int i37222222 = f6.G8;
        t1Var722222.c(i37222222);
        boolean z20222222 = z10;
        linearLayout2222222.addView(t1Var722222, e6.n(32, 32));
        t1 t1Var2222222 = new t1(getContext(), R.drawable.iv_align_horiz_middle, b6Var222222);
        t1Var2222222.e = 4;
        t1Var2222222.d();
        t1Var2222222.b();
        t1Var2222222.c(i37222222);
        linearLayout2222222.addView(t1Var2222222, e6.n(32, 32));
        t1 t1Var3222222 = new t1(getContext(), R.drawable.iv_align_horiz_right, b6Var222222);
        t1Var3222222.e = 4;
        t1Var3222222.d();
        t1Var3222222.b();
        t1Var3222222.c(i37222222);
        final t1[] t1VarArr322222 = {t1Var722222, t1Var2222222, t1Var3222222};
        boolean z21222222 = z11;
        linearLayout2222222.addView(t1Var3222222, e6.n(32, 32));
        z17 = z12;
        linearLayout2222222.addView(new Space(getContext()), e6.n(8, 0));
        t1 t1Var4222222 = new t1(getContext(), R.drawable.iv_align_vert_top, b6Var222222);
        t1Var4222222.e = 4;
        t1Var4222222.d();
        t1Var4222222.b();
        t1Var4222222.c(i37222222);
        linearLayout2222222.addView(t1Var4222222, e6.n(32, 32));
        t1 t1Var5222222 = new t1(getContext(), R.drawable.iv_align_vert_middle, b6Var222222);
        t1Var5222222.e = 4;
        t1Var5222222.d();
        t1Var5222222.b();
        t1Var5222222.c(i37222222);
        linearLayout2222222.addView(t1Var5222222, e6.n(32, 32));
        t1 t1Var6222222 = new t1(getContext(), R.drawable.iv_align_vert_bottom, b6Var222222);
        t1Var6222222.e = 4;
        t1Var6222222.d();
        t1Var6222222.b();
        t1Var6222222.c(i37222222);
        final t1[] t1VarArr2222222 = {t1Var4222222, t1Var5222222, t1Var6222222};
        linearLayout2222222.addView(t1Var6222222, e6.n(32, 32));
        J1222222.q(linearLayout322222);
        it3 = linkedHashSet.iterator();
        int i38222222 = -1;
        while (true) {
            if (!it3.hasNext()) {
            }
        }
        it4 = linkedHashSet.iterator();
        int i39222222 = -1;
        while (true) {
            if (!it4.hasNext()) {
            }
        }
        i17 = 0;
        while (i17 < 3) {
        }
        i19 = 0;
        while (i19 < 3) {
        }
        while (i20 < 3) {
        }
        i21 = 0;
        while (i21 < i18) {
        }
        J1222222.o();
        J1222222.S = 208;
        if (!linkedHashSet.isEmpty()) {
        }
        z18 = false;
        if (!z18) {
        }
        J1222222.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new np0(this, f5Var2, z18, 13), false);
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (z14) {
        }
        if (z15) {
        }
        if (i14 == 0) {
        }
        if (i16 != 0) {
        }
        if (z17) {
        }
        x60Var2.p = new pf.a(this, x60Var2, f5Var2, i22);
        this.f4 = x60Var2;
        x60Var2.Z();
    }

    @Override // org.telegram.ui.Components.i51
    public final void G1(f2.q1 q1Var) {
        int b10;
        l41 G;
        a aVar = null;
        if (q1Var != null && (b10 = q1Var.b()) >= 0 && (G = this.U2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.O3 = aVar;
        this.P3 = false;
        m3 m3Var = this.d3;
        if (m3Var != null) {
            m3Var.C0();
        }
    }

    public final void G2() {
        c3 c3Var = this.j3;
        if (c3Var != null) {
            c3Var.f(true);
        }
        M2();
        n3();
        IdentityHashMap identityHashMap = this.V3;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((r4) it.next()).b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.W3;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((n4) it2.next()).a();
        }
        identityHashMap2.clear();
    }

    public final boolean G3() {
        int i9;
        a y42;
        c3 c3Var = this.j3;
        return c3Var != null && c3Var.y() && (i9 = c3Var.u0) == c3Var.x0 && i9 >= 0 && i9 < this.l4.size() && c3Var.v0 == 1 && c3Var.y0 == 1 && (y42 = y4(i9)) != null && s5.p(y42.b);
    }

    public final s5 G4() {
        c3 c3Var = this.j3;
        if (c3Var == null || !c3Var.y()) {
            return null;
        }
        int i9 = c3Var.u0;
        int i10 = c3Var.x0;
        a y42 = y4(i9);
        if (i9 == i10 && y42 != null && A3(y42.b)) {
            return u2(i9);
        }
        return null;
    }

    public final int H2(int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            ArrayList arrayList = this.h3;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (x3((a) arrayList.get(i11))) {
                i10++;
            } else if (((a) arrayList.get(i11)).i) {
                i10--;
            }
        }
        return i10;
    }

    public final boolean H3(int i9, int i10) {
        if (i9 >= 0) {
            ArrayList arrayList = this.h3;
            if (i10 < arrayList.size() && i9 <= i10) {
                boolean z10 = false;
                while (i9 <= i10) {
                    a aVar = (a) arrayList.get(i9);
                    if (!aVar.i && !x3(aVar)) {
                        if (!aVar.k.isEmpty() || s5.p(aVar.b)) {
                            z10 = true;
                        }
                    }
                    i9++;
                }
                return z10;
            }
        }
        return false;
    }

    public final Editable H4(int i9, int i10, int i11, int i12) {
        if (i9 != i11) {
            return null;
        }
        if (x3(y4(i9))) {
            d1 I2 = I2(i9);
            if (I2 != null) {
                return I2.getText();
            }
            return null;
        }
        if (G3()) {
            d1 j42 = j4(i9);
            if (j42 != null) {
                return j42.getText();
            }
            return null;
        }
        a y42 = y4(i9);
        if (y42 == null || !A3(y42.b)) {
            return null;
        }
        int i22 = i2(i9);
        if (org.telegram.ui.Cells.j2.w(i10, i12, i22, 0) >= org.telegram.ui.Cells.j2.d(i10, i12, i22, 0)) {
            return null;
        }
        s5 u22 = u2(i9);
        return u22 != null ? u22.getEditText().getText() : s5.A(y42.b);
    }

    public final d1 I2(int i9) {
        if (!x3(y4(i9))) {
            return null;
        }
        View A4 = A4(i9);
        if (A4 instanceof q0) {
            return ((q0) A4).getEditText();
        }
        return null;
    }

    public final boolean I3() {
        c3 c3Var = this.j3;
        if (c3Var != null && c3Var.y()) {
            int i9 = c3Var.u0;
            int i10 = c3Var.x0;
            if (i9 >= 0 && i10 >= 0 && i10 >= i9) {
                boolean z10 = false;
                while (i9 <= i10) {
                    a y42 = y4(i9);
                    if (y42 != null) {
                        if (C3(y42.b)) {
                            z10 = true;
                        }
                    }
                    i9++;
                }
                return z10;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0020, code lost:
    
        if (r12 > r13) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[LOOP:2: B:68:0x0160->B:69:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f A[LOOP:3: B:72:0x0169->B:74:0x016f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I4(int i9, int i10, int i11, int i12, ArrayList arrayList) {
        int i13;
        a aVar;
        CharSequence A;
        CharSequence A2;
        CharSequence subSequence;
        CharSequence subSequence2;
        b2 b2Var;
        ArrayList arrayList2;
        SpannableStringBuilder A3;
        int length;
        int i14;
        b2 b2Var2;
        if (i9 >= 0 && i10 >= 0) {
            ArrayList arrayList3 = this.h3;
            if (i9 < arrayList3.size() && i10 < arrayList3.size()) {
                if (i9 <= i10) {
                    if (i9 == i10) {
                    }
                    for (i13 = i9; i13 <= i10; i13++) {
                        a aVar2 = (a) arrayList3.get(i13);
                        if (!aVar2.i && !x3(aVar2) && !E3(aVar2.b) && !l3(aVar2.b) && !(aVar2.b instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    aVar = (a) arrayList3.get(i9);
                    a aVar3 = (a) arrayList3.get(i10);
                    A = s5.A(aVar.b);
                    A2 = i9 != i10 ? A : s5.A(aVar3.b);
                    if (A == null) {
                        A = "";
                    }
                    if (A2 == null) {
                        A2 = "";
                    }
                    int max = Math.max(0, Math.min(i11, A.length()));
                    int max2 = Math.max(0, Math.min(i12, A2.length()));
                    subSequence = A.subSequence(0, max);
                    subSequence2 = A2.subSequence(max2, A2.length());
                    b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    if (arrayList.size() == 1 || !F3((a) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (subSequence.length() > 0) {
                            TL_iv.PageBlock S3 = S3(aVar.b);
                            s5.e(S3, subSequence);
                            arrayList2.add(0, new a(S3, aVar.c, aVar.d));
                        }
                        aVar = (a) j3.r0.j(1, arrayList);
                        if (aVar != null) {
                            if (x3(aVar)) {
                                length = u5.r(((TL_iv.pageBlockDetails) aVar.b).title, null, true).length();
                            } else {
                                TL_iv.PageBlock pageBlock = aVar.b;
                                if (((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || C3(pageBlock)) && (A3 = s5.A(aVar.b)) != null) {
                                    length = A3.length();
                                }
                            }
                            if (subSequence2.length() > 0) {
                                TL_iv.PageBlock S32 = S3(aVar3.b);
                                s5.e(S32, subSequence2);
                                arrayList2.add(new a(S32, aVar3.c, aVar3.d));
                            }
                            while (i10 >= i9) {
                                arrayList3.remove(i10);
                                i10--;
                            }
                            for (i14 = 0; i14 < arrayList2.size(); i14++) {
                                arrayList3.add(i9 + i14, (a) arrayList2.get(i14));
                            }
                        }
                        length = 0;
                        if (subSequence2.length() > 0) {
                        }
                        while (i10 >= i9) {
                        }
                        while (i14 < arrayList2.size()) {
                        }
                    } else {
                        CharSequence A4 = s5.A(((a) arrayList.get(0)).b);
                        CharSequence charSequence = A4 != null ? A4 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder.append(charSequence);
                        length = spannableStringBuilder.length();
                        spannableStringBuilder.append(subSequence2);
                        s5.e(aVar.b, spannableStringBuilder);
                        while (i10 > i9) {
                            arrayList3.remove(i10);
                            i10--;
                        }
                    }
                    s4();
                    this.j3.f(false);
                    this.U2.N(false);
                    b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    post(new k2(this, aVar, length, 1));
                    return true;
                }
                i10 = i9;
                i9 = i10;
                i12 = i11;
                i11 = i12;
                while (i13 <= i10) {
                }
                aVar = (a) arrayList3.get(i9);
                a aVar32 = (a) arrayList3.get(i10);
                A = s5.A(aVar.b);
                if (i9 != i10) {
                }
                if (A == null) {
                }
                if (A2 == null) {
                }
                int max3 = Math.max(0, Math.min(i11, A.length()));
                int max22 = Math.max(0, Math.min(i12, A2.length()));
                subSequence = A.subSequence(0, max3);
                subSequence2 = A2.subSequence(max22, A2.length());
                b2Var = this.F3;
                if (b2Var != null) {
                }
                if (arrayList.size() == 1) {
                }
                arrayList2 = new ArrayList(arrayList);
                if (subSequence.length() > 0) {
                }
                aVar = (a) j3.r0.j(1, arrayList);
                if (aVar != null) {
                }
                length = 0;
                if (subSequence2.length() > 0) {
                }
                while (i10 >= i9) {
                }
                while (i14 < arrayList2.size()) {
                }
                s4();
                this.j3.f(false);
                this.U2.N(false);
                b2Var2 = this.F3;
                if (b2Var2 != null) {
                }
                post(new k2(this, aVar, length, 1));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J3(int i9, int i10, int i11, int i12, int i13) {
        int length;
        int w8;
        int d;
        int max;
        int max2;
        if (y3()) {
            d1 I2 = I2(i10);
            return (I2 == null || (max = Math.max(0, Math.min(Math.min(i11, i13), I2.length()))) >= (max2 = Math.max(0, Math.min(Math.max(i11, i13), I2.length()))) || (i9 & I2.getCurrentStyle(max, max2)) == 0) ? false : true;
        }
        if (!G3()) {
            int i14 = i10;
            boolean z10 = false;
            while (i14 <= i12) {
                a y42 = y4(i14);
                if (y42 != null) {
                    TL_iv.PageBlock pageBlock = y42.b;
                    if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int i22 = i2(i14);
                        int i15 = i14 == i10 ? i11 : 0;
                        int i16 = i14 == i12 ? i13 : i22;
                        int max3 = Math.max(0, Math.min(i15, i22));
                        int max4 = Math.max(0, Math.min(i16, i22));
                        if (max3 < max4) {
                            s5 u22 = u2(i14);
                            if (u22 != null ? (u22.getStyleDelegate().getCurrentStyle(max3, max4) & i9) != 0 : u5.i(max3, max4, i9, s5.A(y4(i14).b))) {
                                z10 = true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i14++;
            }
            return z10;
        }
        d1 j42 = j4(i10);
        if (j42 != null && (w8 = org.telegram.ui.Cells.j2.w(i11, i13, (length = j42.length()), 0)) < (d = org.telegram.ui.Cells.j2.d(i11, i13, length, 0)) && (i9 & j42.getCurrentStyle(w8, d)) != 0) {
        }
    }

    public final void J4(View view) {
        f2.q1 T;
        int b10;
        if (view == null || this.V2 == null || !this.Y2 || (T = T(view)) == null || (b10 = T.b()) < 0 || this.U2.H(b10) < 0) {
            return;
        }
        this.w3 = true;
        c3 c3Var = this.j3;
        if (c3Var.y()) {
            c3Var.f(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.V2.r(T);
    }

    public final boolean K3(int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15 = i11;
        boolean z10 = false;
        while (i15 <= i13) {
            d1 N4 = N4(i10, i15);
            if (N4 != null) {
                int length = N4.length();
                int i16 = i15 == i11 ? i12 : 0;
                int i17 = i15 == i13 ? i14 : length;
                if (i11 == i13) {
                    i16 = Math.min(i12, i14);
                    i17 = Math.max(i12, i14);
                }
                int max = Math.max(0, Math.min(i16, length));
                int max2 = Math.max(0, Math.min(i17, length));
                if (max >= max2) {
                    continue;
                } else {
                    if ((N4.getCurrentStyle(max, max2) & i9) == 0) {
                        return false;
                    }
                    z10 = true;
                }
            }
            i15++;
        }
        return z10;
    }

    public final void K4(a aVar, s sVar, MediaController.PhotoEntry photoEntry) {
        long j10;
        r4 r4Var = (r4) this.V3.remove(sVar);
        if (r4Var != null) {
            r4Var.b();
        }
        IdentityHashMap identityHashMap = this.W3;
        n4 n4Var = (n4) identityHashMap.remove(sVar);
        if (n4Var != null) {
            n4Var.a();
        }
        sVar.a = 1;
        sVar.f = 0.0f;
        n4 n4Var2 = new n4(this.b3, photoEntry, new a3(aVar, sVar, this));
        identityHashMap.put(sVar, n4Var2);
        if (n4Var2.f || n4Var2.h || n4Var2.n) {
            return;
        }
        n4Var2.f = true;
        int i9 = photoEntry.width;
        int i10 = photoEntry.height;
        if (i9 <= 0 || i10 <= 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(photoEntry.path, options);
                i9 = options.outWidth;
                i10 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        VideoEditedInfo videoEditedInfo = null;
        r7 = null;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
        videoEditedInfo = null;
        if (i9 > 0 && i10 > 0) {
            int i11 = photoEntry.orientation;
            if (i11 == 90 || i11 == 270) {
                int i12 = i10;
                i10 = i9;
                i9 = i12;
            }
            VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
            videoEditedInfo2.startTime = 0L;
            videoEditedInfo2.start = 0L;
            videoEditedInfo2.endTime = Math.min(3000L, photoEntry.averageDuration);
            while (true) {
                j10 = videoEditedInfo2.endTime;
                if (j10 <= 0 || j10 >= 1000) {
                    break;
                } else {
                    videoEditedInfo2.endTime = j10 * 2;
                }
            }
            if (j10 <= 0) {
                videoEditedInfo2.endTime = 3000L;
            }
            long j11 = videoEditedInfo2.endTime;
            videoEditedInfo2.end = j11;
            videoEditedInfo2.compressQuality = 1;
            videoEditedInfo2.rotationValue = 0;
            videoEditedInfo2.originalPath = photoEntry.path;
            videoEditedInfo2.estimatedSize = (int) ((r13 / 1000.0f) * 115200.0f);
            videoEditedInfo2.estimatedDuration = j11;
            videoEditedInfo2.framerate = 30;
            videoEditedInfo2.originalDuration = j11;
            videoEditedInfo2.filterState = photoEntry.savedFilterState;
            String str = photoEntry.croppedPaintPath;
            if (str != null) {
                videoEditedInfo2.paintPath = str;
                ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = photoEntry.croppedMediaEntities;
                }
                videoEditedInfo2.mediaEntities = arrayList;
            } else {
                videoEditedInfo2.paintPath = photoEntry.paintPath;
                videoEditedInfo2.mediaEntities = photoEntry.mediaEntities;
            }
            videoEditedInfo2.isPhoto = true;
            MediaController.CropState cropState = photoEntry.cropState;
            if (cropState != null) {
                int i13 = cropState.transformRotation;
                if (i13 == 90 || i13 == 270) {
                    int i14 = i10;
                    i10 = i9;
                    i9 = i14;
                }
                i9 = (int) (i9 * cropState.cropPw);
                i10 = (int) (i10 * cropState.cropPh);
            }
            float f10 = i9;
            float f11 = i10;
            float max = Math.max(f10 / 854.0f, f11 / 854.0f);
            if (max < 1.0f) {
                max = 1.0f;
            }
            int i15 = (int) (f10 / max);
            int i16 = (int) (f11 / max);
            if (i15 % 16 != 0) {
                i15 = Math.max(1, Math.round(i15 / 16.0f)) * 16;
            }
            if (i16 % 16 != 0) {
                i16 = Math.max(1, Math.round(i16 / 16.0f)) * 16;
            }
            videoEditedInfo2.resultWidth = i15;
            videoEditedInfo2.originalWidth = i15;
            videoEditedInfo2.resultHeight = i16;
            videoEditedInfo2.originalHeight = i16;
            videoEditedInfo2.bitrate = -1;
            videoEditedInfo2.muted = true;
            videoEditedInfo2.avatarStartTime = 0L;
            videoEditedInfo = videoEditedInfo2;
        }
        n4Var2.d = videoEditedInfo;
        if (videoEditedInfo == null || !videoEditedInfo.needConvert()) {
            n4Var2.b();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
        n4Var2.e = absolutePath;
        tL_message.attachPath = absolutePath;
        MessageObject messageObject = new MessageObject(n4Var2.a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        n4Var2.c = messageObject;
        messageObject.videoEditedInfo = n4Var2.d;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(n4Var2.a);
        notificationCenter.addObserver(n4Var2, NotificationCenter.filePreparingStarted);
        notificationCenter.addObserver(n4Var2, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.addObserver(n4Var2, NotificationCenter.filePreparingFailed);
        MediaController.getInstance().scheduleVideoConvert(n4Var2.c, false, false, false);
    }

    public final boolean L3() {
        c3 c3Var = this.j3;
        if (c3Var == null || !c3Var.y()) {
            return false;
        }
        int i9 = c3Var.u0;
        int i10 = c3Var.x0;
        a y42 = y4(i9);
        return i9 == i10 && y42 != null && (y42.b instanceof TL_iv.pageBlockTable);
    }

    public final void L4(a aVar, s sVar, String str, boolean z10, int i9, int i10, int i11) {
        IdentityHashMap identityHashMap = this.V3;
        r4 r4Var = (r4) identityHashMap.remove(sVar);
        if (r4Var != null) {
            r4Var.b();
        }
        r4 r4Var2 = new r4(this.b3, str, z10, i9, i10, i11, new b3(aVar, sVar, this));
        identityHashMap.put(sVar, r4Var2);
        r4Var2.d();
    }

    public final void M2() {
        if (this.x3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.x3 = false;
        this.y3 = false;
        this.z3 = null;
        this.A3 = null;
        x60 x60Var = this.f4;
        if (x60Var != null) {
            this.f4 = null;
            x60Var.u();
        }
        f5 f5Var = this.e4;
        if (f5Var != null) {
            LinkedHashSet linkedHashSet = f5Var.D;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                f5Var.v.invalidate();
                f5Var.t();
            }
            this.e4 = null;
        }
        this.h4 = -1;
        this.g4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean M3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.b3).config;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h3;
            if (i9 >= arrayList.size()) {
                break;
            }
            i10 += Q3((a) arrayList.get(i9)).size();
            i9++;
        }
        ArrayList Z2 = Z2();
        c2 c2Var = new c2();
        c2Var.d = i10;
        c2Var.b = Z2.size() + c2Var.b;
        for (int i11 = 0; i11 < Z2.size(); i11++) {
            c2.b((TL_iv.PageBlock) Z2.get(i11), 1, c2Var);
        }
        return c2Var.a <= appGlobalConfig.richMessageLengthLimit.get() && c2Var.b <= appGlobalConfig.richMessageMaxBlocks.get() && c2Var.c <= appGlobalConfig.richMessageMaxDepth.get() && c2Var.d <= appGlobalConfig.richMessageMaxMedia.get() && c2Var.e <= appGlobalConfig.richMessageMaxTableCols.get();
    }

    public final Editable M4(a aVar) {
        View z12 = z1(aVar);
        return z12 instanceof s5 ? ((s5) z12).getEditText().getText() : s5.A(aVar.b);
    }

    public final d1 N4(int i9, int i10) {
        View A4 = A4(i9);
        if (A4 instanceof f5) {
            return ((f5) A4).l(i10);
        }
        return null;
    }

    public final int[] O3(int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.J3.size(); i11++) {
            int length = s5.z(((a) this.J3.get(i11)).b).length();
            if (i9 <= i10 + length) {
                return new int[]{i11, i9 - i10};
            }
            i10 += length + 1;
        }
        int size = this.J3.size() - 1;
        return new int[]{size, s5.z(((a) this.J3.get(size)).b).length()};
    }

    public final d1 P2() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return (d1) findFocus;
        }
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                return ((s5) childAt).getEditText();
            }
        }
        return null;
    }

    public final int P3(int i9) {
        int i10 = 1;
        int i11 = i9 + 1;
        while (true) {
            ArrayList arrayList = this.h3;
            if (i11 >= arrayList.size()) {
                return arrayList.size();
            }
            a aVar = (a) arrayList.get(i11);
            if (x3(aVar)) {
                i10++;
            } else if (aVar.i && i10 - 1 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public final a Q2() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                s5 s5Var = (s5) childAt;
                if (s5Var.getEditText().isFocused() || (s5Var.n() && s5Var.h.isFocused())) {
                    return s5Var.getRow();
                }
            }
        }
        return null;
    }

    public final void Q4() {
        int[] B4 = B4();
        if (B4 == null) {
            return;
        }
        int i9 = B4[0];
        int i10 = B4[1];
        if (i9 >= 0) {
            ArrayList arrayList = this.h3;
            if (i10 >= arrayList.size() || i9 > i10) {
                return;
            }
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            if (H3(i9, i10)) {
                for (int i11 = i9; i11 <= i10; i11++) {
                    a aVar = (a) arrayList.get(i11);
                    boolean z10 = aVar.i;
                    ArrayList arrayList2 = aVar.k;
                    if (!z10 && !x3(aVar)) {
                        if (s5.p(aVar.b)) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = aVar.b.text;
                            aVar.b = pageblockparagraph;
                        } else if (!arrayList2.isEmpty()) {
                            aa.d.u(1, arrayList2);
                        }
                    }
                }
            } else {
                long a2 = m0.a();
                for (int i12 = i9; i12 <= i10; i12++) {
                    a aVar2 = (a) arrayList.get(i12);
                    boolean z11 = aVar2.i;
                    ArrayList arrayList3 = aVar2.k;
                    if (!z11 && !x3(aVar2)) {
                        if (s5.p(aVar2.b)) {
                            long a3 = m0.a();
                            TL_iv.RichText k10 = s5.k(aVar2.b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                this.i3.put(Long.valueOf(a3), k10);
                            }
                            arrayList3.add(Long.valueOf(a3));
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph2.text = aVar2.b.text;
                            aVar2.b = pageblockparagraph2;
                        }
                        arrayList3.add(0, Long.valueOf(a2));
                    }
                }
            }
            x2();
            V3();
            s4();
            c3 c3Var = this.j3;
            boolean z12 = c3Var != null && c3Var.y();
            a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i9, arrayList.size() - 1)));
            a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
            this.U2.N(false);
            b2 b2Var2 = this.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            if (z12) {
                post(new pf.a(this, aVar3, aVar4, 9));
            } else {
                post(new i2(this, aVar3, 9));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(TL_iv.PageBlock pageBlock) {
        b2 b2Var;
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.d();
        }
        a Q2 = Q2();
        if (Q2 == null) {
            Q2 = this.Y3;
        }
        ArrayList arrayList = this.h3;
        int indexOf = Q2 != null ? arrayList.indexOf(Q2) : -1;
        if (indexOf >= 0 && (Q2.b instanceof TL_iv.pageBlockBlockquote)) {
            long a2 = m0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) Q2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.i3.put(Long.valueOf(a2), richText);
            }
            Q2.k.add(Long.valueOf(a2));
            Q2.b = new TL_iv.pageBlockParagraph();
        }
        boolean z10 = indexOf >= 0 && !Q2.k.isEmpty();
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = Q2.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && Q2.g == null && s5.z(pageBlock2).isEmpty()) {
                Q2.b = pageBlock;
                this.Y3 = Q2;
                if (l3(pageBlock)) {
                    int indexOf2 = arrayList.indexOf(Q2) + 1;
                    if (indexOf2 >= arrayList.size() || E3(((a) arrayList.get(indexOf2)).b)) {
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        if (z10) {
                            aVar.k.addAll(Q2.k);
                        }
                        arrayList.add(indexOf2, aVar);
                        Q2 = aVar;
                    } else {
                        Q2 = (a) arrayList.get(indexOf2);
                    }
                }
                this.U2.N(false);
                b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.h();
                }
                post(new i2(this, Q2, 1));
            }
        }
        a aVar2 = new a(pageBlock, 0, 0);
        if (z10) {
            aVar2.k.addAll(Q2.k);
        }
        if (indexOf >= 0) {
            arrayList.add(indexOf + 1, aVar2);
        } else {
            arrayList.add(aVar2);
        }
        Q2 = aVar2;
        this.Y3 = Q2;
        if (l3(pageBlock)) {
        }
        this.U2.N(false);
        b2Var = this.F3;
        if (b2Var != null) {
        }
        post(new i2(this, Q2, 1));
    }

    public final f5 R2() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return U2((d1) findFocus);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R4(a aVar, TL_iv.PageBlock pageBlock, int i9, int i10, boolean z10, boolean z11) {
        a aVar2;
        b2 b2Var;
        ArrayList arrayList = this.h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.d();
        }
        aVar.b = pageBlock;
        aVar.c = i9;
        aVar.d = i10;
        aVar.e = z10;
        aVar.f = z11;
        s4();
        boolean z12 = pageBlock instanceof TL_iv.pageBlockTable;
        if (z12) {
            int i11 = indexOf + 1;
            if (i11 >= arrayList.size() || E3(((a) arrayList.get(i11)).b)) {
                arrayList.add(i11, new a(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        } else if (E3(pageBlock)) {
            if (D3(pageBlock) && aVar.g == null) {
                aVar.g = new s();
            }
            int i12 = indexOf + 1;
            if (i12 >= arrayList.size() || E3(((a) arrayList.get(i12)).b)) {
                aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(i12, aVar2);
            } else {
                aVar2 = (a) arrayList.get(i12);
            }
            if (aVar2 == aVar || z12 || E3(pageBlock) || !(findFocus() instanceof d1)) {
                this.U2.N(false);
                b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.h();
                }
                post(new i2(this, aVar2, 18));
            }
            X1();
            b2 b2Var3 = this.F3;
            if (b2Var3 != null) {
                b2Var3.h();
            }
            View z13 = z1(aVar);
            if (z13 instanceof s5) {
                s5 s5Var = (s5) z13;
                s5Var.B();
                s5Var.getEditText().setSelection(s5Var.getEditText().length());
                return;
            }
            return;
        }
        aVar2 = aVar;
        if (aVar2 == aVar) {
        }
        this.U2.N(false);
        b2Var = this.F3;
        if (b2Var != null) {
        }
        post(new i2(this, aVar2, 18));
    }

    public final TLRPC.Document S2(long j10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document2;
        if (j10 == 0) {
            return null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.h3.size(); i10++) {
            for (s sVar : Q3((a) this.h3.get(i10))) {
                if (sVar != null && (document2 = sVar.h) != null && document2.id == j10) {
                    return document2;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.g3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i9 < size) {
                TLRPC.Document document3 = arrayList.get(i9);
                i9++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = m4.a;
        synchronized (m4.class) {
            document = j10 != 0 ? (TLRPC.Document) m4.b.get(Long.valueOf(j10)) : null;
        }
        return document;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0185, code lost:
    
        if (r2 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (r2 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0189, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x018a, code lost:
    
        r7 = r14.l4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0193, code lost:
    
        if (r2 >= r7.size()) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0195, code lost:
    
        r7 = (qh.a) r7.get(r2);
        r12 = r7.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019f, code lost:
    
        if (r12 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01a1, code lost:
    
        r0.Y(r2, qh.u5.l((org.telegram.tgnet.tl.TL_iv.RichText) r14.i3.get(java.lang.Long.valueOf(r12))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ed, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b5, code lost:
    
        r0.Y(r2, qh.s5.z(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c4, code lost:
    
        if (qh.s5.p(r7.b) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c6, code lost:
    
        r7 = qh.u5.l(qh.s5.k(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d4, code lost:
    
        if (r7.isEmpty() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d6, code lost:
    
        r0.B0.put(65536 + r2, org.telegram.ui.Cells.n9.Z(r7));
        r3.put(r2, java.lang.Math.max(2, r3.get(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f0, code lost:
    
        r2 = r7.size() - 1;
        r7 = (qh.a) r7.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ff, code lost:
    
        if (r7.t != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0207, code lost:
    
        if (qh.s5.p(r7.b) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0209, code lost:
    
        r7 = qh.u5.l(qh.s5.k(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x021a, code lost:
    
        if (r7.isEmpty() != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x021c, code lost:
    
        r7 = r7.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0220, code lost:
    
        if (r2 < 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0224, code lost:
    
        if (r0.F == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0226, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022d, code lost:
    
        if (r8 >= r0.F.getChildCount()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x022f, code lost:
    
        r10 = r0.F.getChildAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0237, code lost:
    
        if ((r10 instanceof org.telegram.ui.Cells.m9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0239, code lost:
    
        r10 = (org.telegram.ui.Cells.m9) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x023f, code lost:
    
        if (r0.e0(r10) != r2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0241, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0243, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0246, code lost:
    
        r0.W = r5;
        r0.u = 0;
        r0.v = r7;
        r0.u0 = 0;
        r0.x0 = r2;
        r0.v0 = 0;
        r0.y0 = 1;
        r0.w0 = 0;
        r0.z0 = r7;
        r3.put(0, java.lang.Math.max(1, r3.get(0)));
        r3.put(r2, java.lang.Math.max(2, r3.get(r2)));
        r0.G0 = 0;
        r0.I0 = 0;
        r0.H0 = 0;
        r2 = r0.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0276, code lost:
    
        if (r2 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0278, code lost:
    
        r2.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027b, code lost:
    
        r0.V();
        r0.x();
        r0.v();
        org.telegram.messenger.AndroidUtilities.cancelRunOnUIThread(r4);
        org.telegram.messenger.AndroidUtilities.runOnUIThread(r4);
        r0 = r0.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x028c, code lost:
    
        if (r0 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x028e, code lost:
    
        r0.a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0292, code lost:
    
        r0.j0(0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0295, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0214, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0291, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S4() {
        f5 f5Var;
        int[] a52;
        int[] a53;
        boolean z10;
        boolean z11;
        int length;
        i0 i0Var;
        s5 s5Var;
        int k10;
        if (this.h3.isEmpty()) {
            return false;
        }
        c3 c3Var = this.j3;
        boolean y10 = c3Var.y();
        SparseIntArray sparseIntArray = c3Var.D0;
        org.telegram.ui.Cells.g gVar = c3Var.r0;
        m9 m9Var = null;
        if (y10) {
            int i9 = c3Var.u0;
            if (i9 == c3Var.x0) {
                View A4 = A4(i9);
                if ((A4 instanceof f5) && (((a52 = a5((f5Var = (f5) A4))) == null || c3Var.v0 != 0 || c3Var.w0 != 0 || c3Var.y0 != a52[0] || c3Var.z0 != a52[1]) && (a53 = a5(f5Var)) != null)) {
                    int i10 = a53[0];
                    int i11 = a53[1];
                    ArrayList arrayList = c3Var.F0;
                    int e02 = c3Var.e0(f5Var);
                    if (e02 >= 0 && (i10 != 0 || i11 != 0)) {
                        c3Var.W = f5Var;
                        c3Var.x0 = e02;
                        c3Var.u0 = e02;
                        c3Var.v0 = 0;
                        c3Var.y0 = i10;
                        c3Var.w0 = 0;
                        c3Var.z0 = i11;
                        c3Var.u = 0;
                        c3Var.v = i11;
                        c3Var.G0 = e02;
                        c3Var.I0 = 0;
                        c3Var.H0 = 0;
                        c3Var.i0(f5Var, e02);
                        arrayList.clear();
                        f5Var.fillTextLayoutBlocks(arrayList);
                        if (!arrayList.isEmpty() && arrayList.size() > 0) {
                            c3Var.a = ((y9) arrayList.get(0)).getX();
                            c3Var.b = ((y9) arrayList.get(0)).getY();
                        } else if (!arrayList.isEmpty()) {
                            c3Var.a = ((y9) arrayList.get(0)).getX();
                            c3Var.b = ((y9) arrayList.get(0)).getY();
                        }
                        z9 z9Var = c3Var.C;
                        if (z9Var != null) {
                            z9Var.setVisibility(0);
                        }
                        c3Var.V();
                        c3Var.x();
                        c3Var.v();
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar);
                        a6 a6Var = c3Var.D;
                        if (a6Var != null) {
                            a6Var.a(true);
                        }
                        f5Var.invalidate();
                        z10 = true;
                    }
                }
            }
            z10 = false;
        } else {
            d1 P2 = P2();
            if (P2 != 0 && P2.getText() != null && (length = P2.getText().length()) > 0) {
                f5 U2 = U2(P2);
                if (U2 != null) {
                    if (P2 == U2.getTitleEditText()) {
                        k10 = 0;
                    } else {
                        i5 o6 = U2.o(P2);
                        k10 = o6 != null ? U2.k(o6.b) : -1;
                    }
                    if (k10 >= 0) {
                        P2.setSelection(P2.getSelectionEnd());
                        z11 = c3Var.k0(U2, k10, 0, length);
                    }
                } else {
                    if (!(P2 instanceof i0)) {
                        ViewParent parent = P2.getParent();
                        while (true) {
                            if (parent == null) {
                                i0Var = null;
                                break;
                            }
                            if (parent instanceof i0) {
                                i0Var = (i0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        }
                    } else {
                        i0Var = (i0) P2;
                    }
                    if (i0Var instanceof m9) {
                        P2.setSelection(P2.getSelectionEnd());
                        z11 = c3Var.k0((m9) i0Var, 0, 0, length);
                    } else {
                        ViewParent parent2 = P2.getParent();
                        while (true) {
                            if (parent2 == null) {
                                s5Var = null;
                                break;
                            }
                            if (parent2 instanceof s5) {
                                s5Var = (s5) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (s5Var != null) {
                            int i12 = P2 == s5Var.getAuthorEditText() ? 1 : 0;
                            P2.setSelection(P2.getSelectionEnd());
                            z11 = c3Var.k0(s5Var, i12, 0, length);
                        }
                    }
                }
            }
            z11 = false;
        }
    }

    public final void T1(a aVar, MediaController.PhotoEntry photoEntry) {
        o3 o3Var;
        if (aVar != null && D3(aVar.b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                s T3 = T3(photoEntry, str2);
                boolean c10 = n4.c(photoEntry);
                TL_iv.PageBlock pageblockvideo = (photoEntry.isVideo || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
                if (B3(aVar.b)) {
                    g3(aVar.b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(T3);
                } else {
                    s sVar = aVar.g;
                    if (sVar == null || sVar.a == 0) {
                        aVar.b = pageblockvideo;
                        aVar.g = T3;
                    } else {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.b.caption;
                        h0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.g);
                        aVar.h.add(T3);
                        aVar.g = null;
                        aVar.b = pageblockcollage;
                    }
                }
                this.U2.N(false);
                n4(aVar);
                if (c10) {
                    K4(aVar, T3, photoEntry);
                    o3Var = this;
                } else {
                    o3Var = this;
                    o3Var.L4(aVar, T3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                b2 b2Var2 = o3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                o3Var.d3.onContentChanged();
            }
        }
    }

    public final int T2(int i9, int i10) {
        while (i9 >= 0) {
            ArrayList arrayList = this.h3;
            if (i9 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i9);
            if (!aVar.i) {
                int i11 = 0;
                int i12 = -1;
                for (int i13 = 0; i13 < i9; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    if (x3(aVar2)) {
                        i11++;
                        if (i12 == -1 && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                            i12 = i11;
                        }
                    } else if (aVar2.i) {
                        if (i12 != -1 && i11 == i12) {
                            i12 = -1;
                        }
                        i11--;
                    }
                }
                if (i12 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (!E3(pageBlock) || l3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i9;
                    }
                }
            }
            i9 += i10;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        if (r4 <= r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0141, code lost:
    
        r1.l0(r11, r12, r13);
        r1.m0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0147, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013f, code lost:
    
        if (r5 <= r4.getLineRight(r2)) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T4(View view, float f10, float f11) {
        int lineForVertical;
        int lineForVertical2;
        i5 m10;
        int lineForVertical3;
        if (view != 0) {
            c3 c3Var = this.j3;
            if (!c3Var.y()) {
                int left = (int) ((f10 - view.getLeft()) - getLeft());
                int top = (int) ((f11 - view.getTop()) - getTop());
                if (view instanceof s5) {
                    s5 s5Var = (s5) view;
                    d1 d1Var = s5Var.h;
                    d1 d1Var2 = s5Var.f;
                    LinearLayout linearLayout = s5Var.b;
                    if (s5.y(d1Var2, d1Var2.getLeft() + linearLayout.getLeft(), d1Var2.getTop() + linearLayout.getTop(), left, top) || (d1Var.getVisibility() == 0 && s5.y(d1Var, d1Var.getLeft(), d1Var.getTop(), left, top))) {
                        c3Var.l0(s5Var, left, top);
                        c3Var.m0();
                        return true;
                    }
                } else if (view instanceof f5) {
                    f5 f5Var = (f5) view;
                    e5 e5Var = f5Var.w;
                    org.telegram.ui.h2 h2Var = f5Var.s;
                    h5 h5Var = f5Var.v;
                    TL_iv.pageTableCell m11 = f5Var.m(left, top);
                    if (m11 != null && (m10 = h5Var.m(m11)) != null) {
                        d1 d1Var3 = m10.a;
                        int scrollX = h2Var.getScrollX() + (((left - h2Var.getLeft()) - e5Var.getLeft()) - h5Var.getLeft());
                        int top2 = ((top - h2Var.getTop()) - e5Var.getTop()) - h5Var.getTop();
                        int left2 = (scrollX - m10.getLeft()) - d1Var3.getLeft();
                        int top3 = (top2 - m10.getTop()) - d1Var3.getTop();
                        Layout layout = d1Var3.getLayout();
                        if (layout != null) {
                            int paddingTop = top3 - d1Var3.getPaddingTop();
                            int paddingLeft = left2 - d1Var3.getPaddingLeft();
                            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical3 = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical3 < layout.getLineCount()) {
                                float lineLeft = layout.getLineLeft(lineForVertical3);
                                float lineRight = layout.getLineRight(lineForVertical3);
                                float f12 = paddingLeft;
                                if (f12 >= lineLeft) {
                                }
                            }
                        }
                    }
                    d1 d1Var4 = f5Var.r;
                    Layout layout2 = d1Var4.getLayout();
                    if (layout2 != null) {
                        int paddingLeft2 = left - (d1Var4.getPaddingLeft() + d1Var4.getLeft());
                        int paddingTop2 = top - (d1Var4.getPaddingTop() + d1Var4.getTop());
                        if (paddingTop2 >= 0 && paddingTop2 < layout2.getHeight() && (lineForVertical2 = layout2.getLineForVertical(paddingTop2)) >= 0 && lineForVertical2 < layout2.getLineCount()) {
                            float f13 = paddingLeft2;
                            if (f13 >= layout2.getLineLeft(lineForVertical2)) {
                            }
                        }
                    }
                } else if (view instanceof i0) {
                    if (((i0) view).a(left, top)) {
                        c3Var.l0(view, left, top);
                        c3Var.m0();
                        return true;
                    }
                } else if (view instanceof q0) {
                    q0 q0Var = (q0) view;
                    d1 d1Var5 = q0Var.d;
                    Layout layout3 = d1Var5.getLayout();
                    if (layout3 != null && d1Var5.length() != 0) {
                        int paddingLeft3 = left - (d1Var5.getPaddingLeft() + d1Var5.getLeft());
                        int paddingTop3 = top - (d1Var5.getPaddingTop() + d1Var5.getTop());
                        if (paddingTop3 >= 0 && paddingTop3 < layout3.getHeight() && (lineForVertical = layout3.getLineForVertical(paddingTop3)) >= 0 && lineForVertical < layout3.getLineCount()) {
                            int dp = AndroidUtilities.dp(24.0f);
                            int max = Math.max(0, (d1Var5.getWidth() - d1Var5.getPaddingLeft()) - d1Var5.getPaddingRight());
                            float f14 = dp;
                            float max2 = Math.max(0.0f, layout3.getLineLeft(lineForVertical) - f14);
                            float min = Math.min(max, layout3.getLineRight(lineForVertical) + f14);
                            float f15 = paddingLeft3;
                            if (f15 >= max2 && f15 <= min) {
                                c3Var.l0(q0Var, left, top);
                                c3Var.m0();
                                return true;
                            }
                        }
                    }
                } else if (view instanceof h4) {
                    h4 h4Var = (h4) view;
                    if (h4Var.w != null) {
                        int[] iArr = new int[4];
                        h4Var.i(iArr);
                        if (left >= iArr[0] && left <= iArr[2] && top >= iArr[1] && top <= iArr[3]) {
                            c3Var.l0(view, left, top);
                            c3Var.m0();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void U1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        TL_iv.RichMessage richMessage2 = this.g3;
        if (richMessage2 == null) {
            this.g3 = richMessage;
        } else {
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null) {
                richMessage2.photos.addAll(arrayList2);
            }
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null) {
                this.g3.documents.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        W2(arrayList4, richMessage.blocks, this.i3);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < arrayList4.size(); i9++) {
            v4((a) arrayList4.get(i9));
        }
        ArrayList arrayList5 = this.h3;
        int size = arrayList5.size();
        a Q2 = Q2();
        if (Q2 != null && (indexOf = arrayList5.indexOf(Q2)) >= 0) {
            TL_iv.PageBlock pageBlock = Q2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && s5.z(pageBlock).isEmpty()) {
                arrayList5.remove(indexOf);
                size = indexOf;
            } else {
                size = indexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        V3();
        s4();
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        m3 m3Var = this.d3;
        if (m3Var != null) {
            m3Var.onContentChanged();
        }
    }

    public final a U3(int i9, int i10) {
        while (i9 >= 0) {
            ArrayList arrayList = this.l4;
            if (i9 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i9);
            if (!aVar.i) {
                if (aVar.t == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (E3(pageBlock) && !l3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return aVar;
            }
            i9 += i10;
        }
        return null;
    }

    public final void U4(a aVar, TL_iv.PageBlock pageBlock, int i9, int i10, boolean z10, boolean z11) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.h3;
        if (arrayList.indexOf(aVar2) < 0 || x3(aVar2) || aVar2.i) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        if (pageBlock != pageBlock2 && A3(pageBlock2) && A3(pageBlock)) {
            s5 u22 = u2(arrayList.indexOf(aVar2));
            s5.e(pageBlock, u22 != null ? u22.getEditText().getText() : s5.A(aVar2.b));
            TL_iv.RichText k10 = s5.k(aVar2.b);
            if (k10 != null && s5.k(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                }
            }
        }
        R4(aVar2, pageBlock, i9, i10, z10, z11);
    }

    public final a V1(a aVar, int i9) {
        int i10;
        ArrayList arrayList = this.l4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || (i10 = indexOf + i9) < 0 || i10 >= arrayList.size()) {
            return null;
        }
        a aVar2 = (a) arrayList.get(i10);
        if (aVar2.t != 0) {
            return aVar2;
        }
        return null;
    }

    public final void V2() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            KeyEvent.Callback childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                s5 s5Var = (s5) childAt;
                s5Var.f.n();
                s5Var.h.n();
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof q0) {
                ((q0) childAt).getEditText().n();
            }
        }
    }

    public final void V3() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h3;
            if (i9 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i9);
            if (!aVar.k.isEmpty() && s5.p(aVar.b)) {
                long a2 = m0.a();
                TL_iv.RichText k10 = s5.k(aVar.b);
                if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                    this.i3.put(Long.valueOf(a2), k10);
                }
                aVar.k.add(Long.valueOf(a2));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = aVar.b.text;
                aVar.b = pageblockparagraph;
            }
            i9++;
        }
    }

    public final void V4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        U4(aVar2, pageBlock, aVar2.c, aVar2.d, aVar2.e, aVar2.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0122, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        if (r8 <= 0) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (H2(r8) <= 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        r12 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
    
        if (r12 >= r5.size()) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0101, code lost:
    
        if (H2(r12) <= 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        r13 = (qh.a) r5.get(r4);
        r7 = (qh.a) r5.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        if (r8 != r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0119, code lost:
    
        if (x3(r13) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011d, code lost:
    
        if (r13.i == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0120, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
    
        if (r9 != r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
    
        if (x3(r7) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        if (r7.i == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0130, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        r10 = new java.lang.StringBuilder();
        r17 = r4;
        r18 = r6;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
    
        if (r4 >= r25.length) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
    
        if (r4 <= 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
    
        r10.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0147, code lost:
    
        r10.append(r25[r4]);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        r3 = r10.toString();
        r4 = r20.F3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0155, code lost:
    
        if (r4 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
    
        r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015a, code lost:
    
        if (r17 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015c, code lost:
    
        r4 = qh.s5.z(r13.b);
        r1 = r4.substring(0, java.lang.Math.max(0, java.lang.Math.min(r1, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
    
        if (r18 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0175, code lost:
    
        r4 = qh.s5.z(r7.b);
        r15 = r4.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018b, code lost:
    
        qh.s5.f(r13.b, r1 + r3 + r15);
        r5.subList(r8 + 1, r12).clear();
        r1 = r3.length() + r1.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b5, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0219, code lost:
    
        if (r5.isEmpty() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021b, code lost:
    
        r13 = new qh.a(new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph(), r6, r6);
        r5.add(r13);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0229, code lost:
    
        s4();
        r11.f(r6);
        r14.N(r6);
        r2 = r20.F3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0234, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0236, code lost:
    
        r2.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0239, code lost:
    
        post(new qh.k2(r20, r13, r1, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0242, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b7, code lost:
    
        if (r18 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        r1 = qh.s5.z(r7.b);
        r1 = r1.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r1.length())));
        qh.s5.f(r7.b, r3 + r1);
        r5.subList(r8, r9).clear();
        r1 = r3.length();
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f1, code lost:
    
        r5.subList(r8, r12).clear();
        r1 = new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph();
        Z1(r1, r3);
        r6 = 0;
        r13 = new qh.a(r1, 0, 0);
        r5.add(java.lang.Math.min(r8, r5.size()), r13);
        r1 = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0132, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W1(int i9, int i10, int i11, int i12, String[] strArr) {
        String str;
        f5 f5Var;
        w5 model;
        int max;
        int length;
        int length2;
        int i13 = i10;
        int i14 = i12;
        a y42 = y4(i9);
        ArrayList arrayList = this.h3;
        int indexOf = arrayList.indexOf(y42);
        int indexOf2 = arrayList.indexOf(y4(i11));
        if (indexOf >= 0 && indexOf2 >= 0 && indexOf < arrayList.size() && indexOf2 < arrayList.size()) {
            a aVar = (a) arrayList.get(indexOf);
            a aVar2 = (a) arrayList.get(indexOf2);
            c3 c3Var = this.j3;
            if (indexOf == indexOf2 && x3(aVar)) {
                View z12 = z1(aVar);
                if ((z12 instanceof q0) && (aVar.b instanceof TL_iv.pageBlockDetails)) {
                    d1 editText = ((q0) z12).getEditText();
                    b2 b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i15 = 0; i15 < strArr.length; i15++) {
                        if (i15 > 0) {
                            sb2.append(' ');
                        }
                        sb2.append(strArr[i15]);
                    }
                    String sb3 = sb2.toString();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editText.getText());
                    int length3 = spannableStringBuilder.length();
                    int w8 = org.telegram.ui.Cells.j2.w(i13, i14, length3, 0);
                    spannableStringBuilder.replace(w8, org.telegram.ui.Cells.j2.d(i13, i14, length3, 0), (CharSequence) sb3);
                    editText.setTextSilently(spannableStringBuilder);
                    editText.invalidateEffects();
                    ((TL_iv.pageBlockDetails) aVar.b).title = u5.f(spannableStringBuilder);
                    int length4 = sb3.length() + w8;
                    c3Var.f(false);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    post(new o2(editText, length4, 0));
                    return true;
                }
            } else {
                int i16 = indexOf;
                while (true) {
                    z41 z41Var = this.U2;
                    str = "";
                    if (i16 > indexOf2) {
                        b2 b2Var3 = this.F3;
                        if (b2Var3 != null) {
                            b2Var3.d();
                        }
                        TL_iv.PageBlock pageBlock = aVar.b;
                        boolean z10 = pageBlock instanceof TL_iv.pageBlockTable;
                        boolean z11 = aVar2.b instanceof TL_iv.pageBlockTable;
                        m3 m3Var = this.d3;
                        if (!z10 && !z11) {
                            boolean l32 = l3(pageBlock);
                            boolean l33 = l3(aVar2.b);
                            if (!l32 && !l33) {
                                if (indexOf != indexOf2 || !s5.p(aVar.b) || c3Var.v0 != 1 || c3Var.y0 != 1) {
                                    String z13 = s5.z(aVar.b);
                                    String z14 = indexOf == indexOf2 ? z13 : s5.z(aVar2.b);
                                    int max2 = Math.max(0, Math.min(i13, z13.length()));
                                    int max3 = Math.max(0, Math.min(i14, z14.length()));
                                    String substring = z13.substring(0, max2);
                                    String substring2 = z14.substring(max3);
                                    if (strArr.length <= 1) {
                                        str = strArr.length != 0 ? strArr[0] : "";
                                        s5.f(aVar.b, substring + str + substring2);
                                        if (indexOf2 > indexOf) {
                                            while (indexOf2 > indexOf) {
                                                arrayList.remove(indexOf2);
                                                indexOf2--;
                                            }
                                        }
                                        length2 = str.length() + substring.length();
                                    } else {
                                        TL_iv.PageBlock pageBlock2 = aVar.b;
                                        StringBuilder n10 = e2.c.n(substring);
                                        n10.append(strArr[0]);
                                        s5.f(pageBlock2, n10.toString());
                                        if (indexOf2 > indexOf) {
                                            while (indexOf2 > indexOf) {
                                                arrayList.remove(indexOf2);
                                                indexOf2--;
                                            }
                                        }
                                        for (int i17 = 1; i17 < strArr.length - 1; i17++) {
                                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                            Z1(pageblockparagraph, strArr[i17]);
                                            int i18 = indexOf + i17;
                                            int i19 = aVar.c;
                                            int i20 = aVar.d;
                                            if (i20 > 0) {
                                                i20 += i17;
                                            }
                                            arrayList.add(i18, new a(pageblockparagraph, i19, i20));
                                        }
                                        String str2 = strArr[strArr.length - 1];
                                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                        Z1(pageblockparagraph2, str2 + substring2);
                                        int length5 = (strArr.length + indexOf) - 1;
                                        int i21 = aVar.c;
                                        int i22 = aVar.d;
                                        if (i22 > 0) {
                                            i22 = (i22 + strArr.length) - 1;
                                        }
                                        arrayList.add(length5, new a(pageblockparagraph2, i21, i22));
                                        indexOf = (indexOf + strArr.length) - 1;
                                        length2 = str2.length();
                                    }
                                    s4();
                                    a aVar3 = (indexOf < 0 || indexOf >= arrayList.size()) ? null : (a) arrayList.get(indexOf);
                                    c3Var.f(false);
                                    z41Var.N(false);
                                    b2 b2Var4 = this.F3;
                                    if (b2Var4 != null) {
                                        b2Var4.h();
                                    }
                                    post(new k2(this, aVar3, length2, 0));
                                    return true;
                                }
                                View z15 = z1(aVar);
                                if (z15 instanceof s5) {
                                    s5 s5Var = (s5) z15;
                                    d1 authorEditText = s5Var.getAuthorEditText();
                                    b2 b2Var5 = this.F3;
                                    if (b2Var5 != null) {
                                        b2Var5.d();
                                    }
                                    StringBuilder sb4 = new StringBuilder();
                                    for (int i23 = 0; i23 < strArr.length; i23++) {
                                        if (i23 > 0) {
                                            sb4.append(' ');
                                        }
                                        sb4.append(strArr[i23]);
                                    }
                                    String sb5 = sb4.toString();
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(authorEditText.getText());
                                    int length6 = spannableStringBuilder2.length();
                                    int w10 = org.telegram.ui.Cells.j2.w(i13, i14, length6, 0);
                                    spannableStringBuilder2.replace(w10, org.telegram.ui.Cells.j2.d(i13, i14, length6, 0), (CharSequence) sb5);
                                    authorEditText.setTextSilently(spannableStringBuilder2);
                                    authorEditText.invalidateEffects();
                                    s5Var.w();
                                    int length7 = sb5.length() + w10;
                                    c3Var.f(false);
                                    b2 b2Var6 = this.F3;
                                    if (b2Var6 != null) {
                                        b2Var6.h();
                                    }
                                    m3Var.onContentChanged();
                                    post(new o2(authorEditText, length7, 1));
                                    return true;
                                }
                            } else if (l32 && l33 && indexOf == indexOf2) {
                                KeyEvent.Callback z16 = z1(aVar);
                                if (z16 instanceof i0) {
                                    i0 i0Var = (i0) z16;
                                    d1 captionEditText = i0Var.getCaptionEditText();
                                    b2 b2Var7 = this.F3;
                                    if (b2Var7 != null) {
                                        b2Var7.d();
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    for (int i24 = 0; i24 < strArr.length; i24++) {
                                        if (i24 > 0) {
                                            sb6.append(' ');
                                        }
                                        sb6.append(strArr[i24]);
                                    }
                                    String sb7 = sb6.toString();
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(captionEditText.getText());
                                    int length8 = spannableStringBuilder3.length();
                                    int w11 = org.telegram.ui.Cells.j2.w(i13, i14, length8, 0);
                                    spannableStringBuilder3.replace(w11, org.telegram.ui.Cells.j2.d(i13, i14, length8, 0), (CharSequence) sb7);
                                    captionEditText.setTextSilently(spannableStringBuilder3);
                                    captionEditText.invalidateEffects();
                                    i0Var.b();
                                    int length9 = sb7.length() + w11;
                                    c3Var.f(false);
                                    b2 b2Var8 = this.F3;
                                    if (b2Var8 != null) {
                                        b2Var8.h();
                                    }
                                    post(new o2(captionEditText, length9, 2));
                                    return true;
                                }
                            }
                        } else if (z10 && z11 && indexOf == indexOf2) {
                            int i25 = c3Var.v0;
                            int i26 = c3Var.y0;
                            View z17 = z1(aVar);
                            if ((z17 instanceof f5) && (model = (f5Var = (f5) z17).getModel()) != null) {
                                ArrayList arrayList2 = model.g;
                                if (i25 == 0 && i26 == 0) {
                                    TL_iv.PageBlock pageBlock3 = aVar.b;
                                    if (pageBlock3 instanceof TL_iv.pageBlockTable) {
                                        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock3;
                                        b2 b2Var9 = this.F3;
                                        if (b2Var9 != null) {
                                            b2Var9.d();
                                        }
                                        String l10 = u5.l(pageblocktable.title);
                                        int max4 = Math.max(0, Math.min(Math.min(i13, i14), l10.length()));
                                        int max5 = Math.max(0, Math.min(Math.max(i13, i14), l10.length()));
                                        StringBuilder sb8 = new StringBuilder();
                                        for (int i27 = 0; i27 < strArr.length; i27++) {
                                            if (i27 > 0) {
                                                sb8.append(' ');
                                            }
                                            sb8.append(strArr[i27]);
                                        }
                                        String sb9 = sb8.toString();
                                        String str3 = l10.substring(0, max4) + sb9 + l10.substring(max5);
                                        TL_iv.textPlain textplain = new TL_iv.textPlain();
                                        textplain.text = str3;
                                        pageblocktable.title = textplain;
                                        d1 titleEditText = f5Var.getTitleEditText();
                                        titleEditText.setTextSilently(str3);
                                        titleEditText.invalidateEffects();
                                        int length10 = sb9.length() + max4;
                                        c3Var.f(false);
                                        b2 b2Var10 = this.F3;
                                        if (b2Var10 != null) {
                                            b2Var10.h();
                                        }
                                        m3Var.onContentChanged();
                                        post(new o2(titleEditText, length10, 4));
                                        return true;
                                    }
                                } else {
                                    int i28 = i25 - 1;
                                    int i29 = i26 - 1;
                                    int size = arrayList2.size();
                                    if (i28 >= 0 && i28 < size && i29 >= 0 && i29 < size) {
                                        b2 b2Var11 = this.F3;
                                        if (b2Var11 != null) {
                                            b2Var11.d();
                                        }
                                        if (i28 > i29 || (i28 == i29 && i13 > i14)) {
                                            i14 = i13;
                                            i13 = i14;
                                            i29 = i28;
                                            i28 = i29;
                                        }
                                        StringBuilder sb10 = new StringBuilder();
                                        for (int i30 = 0; i30 < strArr.length; i30++) {
                                            if (i30 > 0) {
                                                sb10.append('\n');
                                            }
                                            sb10.append(strArr[i30]);
                                        }
                                        String sb11 = sb10.toString();
                                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i28);
                                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i29);
                                        if (i28 == i29) {
                                            String g10 = w5.g(pagetablecell);
                                            max = Math.max(0, Math.min(i13, g10.length()));
                                            String str4 = g10.substring(0, max) + sb11 + g10.substring(Math.max(0, Math.min(i14, g10.length())));
                                            w5.c(pagetablecell, str4);
                                            i5 m10 = f5Var.getGrid().m(pagetablecell);
                                            if (m10 != null) {
                                                m10.a.setTextSilently(str4);
                                            }
                                            length = sb11.length();
                                        } else {
                                            String g11 = w5.g(pagetablecell);
                                            max = Math.max(0, Math.min(i13, g11.length()));
                                            String str5 = g11.substring(0, max) + sb11;
                                            w5.c(pagetablecell, str5);
                                            i5 m11 = f5Var.getGrid().m(pagetablecell);
                                            if (m11 != null) {
                                                m11.a.setTextSilently(str5);
                                            }
                                            for (int i31 = i28 + 1; i31 < i29; i31++) {
                                                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i31);
                                                w5.c(pagetablecell3, "");
                                                i5 m12 = f5Var.getGrid().m(pagetablecell3);
                                                if (m12 != null) {
                                                    m12.a.setTextSilently("");
                                                }
                                            }
                                            String g12 = w5.g(pagetablecell2);
                                            String substring3 = g12.substring(Math.max(0, Math.min(i14, g12.length())));
                                            w5.c(pagetablecell2, substring3);
                                            i5 m13 = f5Var.getGrid().m(pagetablecell2);
                                            if (m13 != null) {
                                                m13.a.setTextSilently(substring3);
                                            }
                                            length = sb11.length();
                                        }
                                        int i32 = length + max;
                                        c3Var.f(false);
                                        b2 b2Var12 = this.F3;
                                        if (b2Var12 != null) {
                                            b2Var12.h();
                                        }
                                        post(new jh0(f5Var, pagetablecell, i32, 14));
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        if (((a) arrayList.get(i16)).i || x3((a) arrayList.get(i16))) {
                            break;
                        }
                        i16++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W3(a aVar, boolean z10) {
        int i9;
        b2 b2Var;
        int indexOf = this.h3.indexOf(aVar);
        if (indexOf >= 0) {
            View z12 = z1(aVar);
            if (z12 instanceof s5) {
                s5 s5Var = (s5) z12;
                if (s5Var.getEditText().isFocused()) {
                    i9 = s5Var.getEditText().getSelectionEnd();
                    b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    if (q3(indexOf, z10, false)) {
                        s4();
                        if (findFocus() instanceof d1) {
                            X1();
                        } else {
                            this.U2.N(false);
                        }
                        b2 b2Var2 = this.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        if (i9 < 0) {
                            return true;
                        }
                        post(new k2(this, aVar, i9, 2));
                        return true;
                    }
                }
            }
            i9 = -1;
            b2Var = this.F3;
            if (b2Var != null) {
            }
            if (q3(indexOf, z10, false)) {
            }
        }
        return false;
    }

    public final void W4(a aVar, int i9) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i9 == 0) {
            U4(aVar2, aVar2.b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.c);
        int max2 = i9 == 2 ? Math.max(1, aVar2.d) : 0;
        boolean z10 = i9 == 3;
        TL_iv.PageBlock pageBlock = aVar2.b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        U4(aVar2, pageBlock, max, max2, z10, z10 && aVar2.f);
    }

    public final void X1() {
        s5 s5Var;
        a aVar;
        p5 p5Var;
        this.U2.S();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if ((childAt instanceof s5) && (aVar = (s5Var = (s5) childAt).x) != null && (p5Var = s5Var.y) != null) {
                s5Var.g(aVar, p5Var, s5Var.A);
            }
        }
    }

    public final void X3() {
        int length;
        int w8;
        int d;
        int length2;
        int w10;
        int d9;
        int length3;
        int w11;
        int d10;
        int length4;
        int w12;
        int d11;
        d1 N4;
        int length5;
        int w13;
        int d12;
        boolean L3 = L3();
        c3 c3Var = this.j3;
        if (L3) {
            int i9 = c3Var.u0;
            int i10 = c3Var.v0;
            if (i10 == c3Var.y0 && (N4 = N4(i9, i10)) != null && (w13 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length5 = N4.length()), 0)) < (d12 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length5, 0))) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (u5.h(N4.getText(), w13, d12)) {
                    u5.n(N4.getText(), w13, d12);
                    N4.invalidateEffects();
                    g4(i9, i10);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(w13, d12);
                N4.makeSelectedDate();
                return;
            }
            return;
        }
        if (y3()) {
            int i11 = c3Var.u0;
            d1 I2 = I2(i11);
            if (I2 != null && (w12 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length4 = I2.length()), 0)) < (d11 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length4, 0))) {
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                if (u5.h(I2.getText(), w12, d11)) {
                    u5.n(I2.getText(), w12, d11);
                    I2.invalidateEffects();
                    e4(i11);
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(w12, d11);
                I2.makeSelectedDate();
                return;
            }
            return;
        }
        if (w3()) {
            int i12 = c3Var.u0;
            d1 s22 = s2(i12);
            if (s22 != null && (w11 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length3 = s22.length()), 0)) < (d10 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length3, 0))) {
                b2 b2Var5 = this.F3;
                if (b2Var5 != null) {
                    b2Var5.d();
                }
                if (u5.h(s22.getText(), w11, d10)) {
                    u5.n(s22.getText(), w11, d10);
                    s22.invalidateEffects();
                    d4(i12);
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(w11, d10);
                s22.makeSelectedDate();
                return;
            }
            return;
        }
        if (!G3()) {
            s5 G4 = G4();
            if (G4 != null && (w8 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length = G4.getEditText().length()), 0)) < (d = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length, 0))) {
                b2 b2Var7 = this.F3;
                if (b2Var7 != null) {
                    b2Var7.d();
                }
                if (u5.h(G4.getEditText().getText(), w8, d)) {
                    u5.n(G4.getEditText().getText(), w8, d);
                    G4.getEditText().invalidateEffects();
                    G4.x();
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.h();
                    }
                    o4();
                }
                G4.getEditText().setSelectionOverride(w8, d);
                G4.getEditText().makeSelectedDate();
                return;
            }
            return;
        }
        int i13 = c3Var.u0;
        d1 j42 = j4(i13);
        if (j42 != null && (w10 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length2 = j42.length()), 0)) < (d9 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length2, 0))) {
            b2 b2Var9 = this.F3;
            if (b2Var9 != null) {
                b2Var9.d();
            }
            if (u5.h(j42.getText(), w10, d9)) {
                u5.n(j42.getText(), w10, d9);
                j42.invalidateEffects();
                f4(i13);
                b2 b2Var10 = this.F3;
                if (b2Var10 != null) {
                    b2Var10.h();
                }
                o4();
            }
            j42.setSelectionOverride(w10, d9);
            j42.makeSelectedDate();
        }
    }

    public final a X4() {
        c3 c3Var;
        int i9;
        a Q2 = Q2();
        return (Q2 == null && (c3Var = this.j3) != null && c3Var.y() && (i9 = c3Var.u0) == c3Var.x0) ? y4(i9) : Q2;
    }

    public final boolean Y1(int i9, int i10) {
        c3 c3Var;
        ArrayList arrayList = this.J3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i9, i10));
            int max2 = Math.max(0, Math.max(i9, i10));
            int[] O3 = O3(max);
            int[] O32 = O3(max2);
            a aVar = (a) this.J3.get(O3[0]);
            if (O3[0] == O32[0] || max == max2) {
                View z12 = z1(aVar);
                if (z12 instanceof s5) {
                    s5 s5Var = (s5) z12;
                    s5Var.B();
                    d1 editText = s5Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.min(O3[1], length), Math.min(O32[1], length));
                }
            } else {
                View z13 = z1(aVar);
                View z14 = z1(this.J3.get(O32[0]));
                if ((z13 instanceof s5) && (z14 instanceof s5)) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.h3;
                        int size = arrayList2.size();
                        c3Var = this.j3;
                        if (i11 >= size) {
                            break;
                        }
                        c3Var.Y(i11, s5.z(((a) arrayList2.get(i11)).b));
                        i11++;
                    }
                    s5 s5Var2 = (s5) z13;
                    int length2 = s5Var2.getEditText().length();
                    if (O3[1] >= length2) {
                        length2 = Math.max(0, length2 - 1);
                    }
                    if (!c3Var.k0(s5Var2, 0, O3[1], length2)) {
                        s5Var2.B();
                        return true;
                    }
                    c3Var.c0(0, O32[1], (s5) z14);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList Y2(int i9, int i10, int i11, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        int i14 = i9;
        while (i14 < i10) {
            ArrayList arrayList2 = this.h3;
            a aVar = (a) arrayList2.get(i14);
            boolean z11 = aVar.i;
            ArrayList arrayList3 = aVar.k;
            if (z11) {
                i14++;
            } else if (arrayList3.size() > i11) {
                Long l10 = (Long) arrayList3.get(i11);
                long longValue = l10.longValue();
                int i15 = i14 + 1;
                while (i15 < i10) {
                    a aVar2 = (a) arrayList2.get(i15);
                    if (aVar2.k.size() <= i11 || ((Long) aVar2.k.get(i11)).longValue() != longValue) {
                        break;
                    }
                    i15++;
                }
                ArrayList<TL_iv.PageBlock> Y2 = Y2(i14, i15, i11 + 1, true);
                if (Y2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.i3.get(l10);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (Y2.size() == 1 && (Y2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = Y2.get(0).text != null ? Y2.get(0).text : new TL_iv.textEmpty();
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = Y2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i14 = i15;
            } else if (x3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int P3 = P3(i14);
                pageblockdetails.blocks = Y2(i14 + 1, Math.min(P3, i10), i11, true);
                arrayList.add(pageblockdetails);
                i14 = P3 + 1;
            } else {
                int i16 = aVar.c;
                if (i16 <= 0) {
                    J2(arrayList, aVar);
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    int[] iArr = {i14};
                    boolean z12 = aVar.d > 0;
                    i12 = i10;
                    i13 = i11;
                    TL_iv.PageBlock k22 = k2(i14, i16, i12, i13, z12, iArr);
                    if (k22 != null) {
                        arrayList.add(k22);
                    }
                    int i17 = iArr[0];
                    i14 = i17 <= 0 ? i12 : i17;
                }
                i10 = i12;
                i11 = i13;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) j3.r0.j(1, arrayList))) {
                aa.d.u(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void Y3(int i9) {
        b2 b2Var;
        int i10;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i11;
        int length;
        int w8;
        int d;
        int length2;
        int w10;
        int d9;
        int length3;
        int w11;
        int d10;
        b2 b2Var2;
        int i12;
        c3 c3Var = this.j3;
        if (c3Var != null && c3Var.y()) {
            boolean L3 = L3();
            m3 m3Var = this.d3;
            int i13 = 0;
            if (L3) {
                int i14 = c3Var.u0;
                int i15 = c3Var.v0;
                int i16 = c3Var.y0;
                int i17 = c3Var.w0;
                int i18 = c3Var.z0;
                boolean K3 = K3(i9, i14, i15, i17, i16, i18);
                int w22 = !K3 ? w2(i9) : 0;
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                this.E3 = true;
                int i19 = i15;
                boolean z11 = false;
                while (i19 <= i16) {
                    d1 N4 = N4(i14, i19);
                    if (N4 == null) {
                        i12 = i15;
                    } else {
                        int length4 = N4.length();
                        int i20 = i19 == i15 ? i17 : 0;
                        int i21 = i19 == i16 ? i18 : length4;
                        if (i15 == i16) {
                            i20 = Math.min(i17, i18);
                            i21 = Math.max(i17, i18);
                        }
                        int i22 = i20;
                        i12 = i15;
                        int max = Math.max(0, Math.min(i22, length4));
                        int max2 = Math.max(0, Math.min(i21, length4));
                        if (max < max2) {
                            if (K3) {
                                N4.removeStyle(i9, max, max2);
                            } else {
                                if (w22 != 0) {
                                    N4.removeStyle(w22, max, max2);
                                }
                                N4.addStyle(i9, max, max2);
                            }
                            N4.invalidateEffects();
                            N4.requestLayout();
                            g4(i14, i19);
                            z11 = true;
                        }
                    }
                    i19++;
                    i15 = i12;
                }
                this.E3 = false;
                if (z11 && (b2Var2 = this.F3) != null) {
                    b2Var2.h();
                }
                m3Var.h0();
                if (z11) {
                    o4();
                }
            } else if (y3()) {
                int i23 = c3Var.u0;
                d1 I2 = I2(i23);
                if (I2 != null && (w11 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length3 = I2.length()), 0)) < (d10 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length3, 0))) {
                    boolean z12 = (I2.getCurrentStyle(w11, d10) & i9) == 0;
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.d();
                    }
                    this.E3 = true;
                    if (z12) {
                        int w23 = w2(i9);
                        if (w23 != 0) {
                            I2.removeStyle(w23, w11, d10);
                        }
                        I2.addStyle(i9, w11, d10);
                    } else {
                        I2.removeStyle(i9, w11, d10);
                    }
                    this.E3 = false;
                    e4(i23);
                    I2.invalidateEffects();
                    I2.requestLayout();
                    b2 b2Var5 = this.F3;
                    if (b2Var5 != null) {
                        b2Var5.h();
                    }
                    m3Var.h0();
                    o4();
                }
            } else if (w3()) {
                int i24 = c3Var.u0;
                d1 s22 = s2(i24);
                if (s22 != null && (w10 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length2 = s22.length()), 0)) < (d9 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length2, 0))) {
                    boolean z13 = (s22.getCurrentStyle(w10, d9) & i9) == 0;
                    int w24 = z13 ? w2(i9) : 0;
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.d();
                    }
                    this.E3 = true;
                    if (z13) {
                        if (w24 != 0) {
                            s22.removeStyle(w24, w10, d9);
                        }
                        s22.addStyle(i9, w10, d9);
                    } else {
                        s22.removeStyle(i9, w10, d9);
                    }
                    s22.invalidateEffects();
                    s22.requestLayout();
                    d4(i24);
                    this.E3 = false;
                    b2 b2Var7 = this.F3;
                    if (b2Var7 != null) {
                        b2Var7.h();
                    }
                    m3Var.h0();
                    o4();
                }
            } else if (G3()) {
                int i25 = c3Var.u0;
                d1 j42 = j4(i25);
                if (j42 != null && (w8 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length = j42.length()), 0)) < (d = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length, 0))) {
                    boolean z14 = (j42.getCurrentStyle(w8, d) & i9) == 0;
                    int w25 = z14 ? w2(i9) : 0;
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.d();
                    }
                    this.E3 = true;
                    if (z14) {
                        if (w25 != 0) {
                            j42.removeStyle(w25, w8, d);
                        }
                        j42.addStyle(i9, w8, d);
                    } else {
                        j42.removeStyle(i9, w8, d);
                    }
                    j42.invalidateEffects();
                    j42.requestLayout();
                    f4(i25);
                    this.E3 = false;
                    b2 b2Var9 = this.F3;
                    if (b2Var9 != null) {
                        b2Var9.h();
                    }
                    m3Var.h0();
                    o4();
                }
            } else {
                int i26 = c3Var.u0;
                int i27 = c3Var.x0;
                int i28 = c3Var.w0;
                int i29 = c3Var.z0;
                if (i26 >= 0 && i27 >= 0 && i27 >= i26 && i27 < this.l4.size()) {
                    int i30 = i9;
                    boolean J3 = J3(i30, i26, i28, i27, i29);
                    boolean z15 = !J3;
                    int w26 = !J3 ? w2(i30) : 0;
                    b2 b2Var10 = this.F3;
                    if (b2Var10 != null) {
                        b2Var10.d();
                    }
                    this.E3 = true;
                    int i31 = i26;
                    boolean z16 = false;
                    while (i31 <= i27) {
                        a y42 = y4(i31);
                        if (y42 != null) {
                            TL_iv.PageBlock pageBlock = y42.b;
                            if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int i210 = i2(i31);
                                int i32 = i31 == i26 ? i28 : 0;
                                z10 = z16;
                                int i33 = i31 == i27 ? i29 : i210;
                                int max3 = Math.max(i13, Math.min(i32, i210));
                                int max4 = Math.max(i13, Math.min(i33, i210));
                                if (max3 >= max4) {
                                    i10 = w26;
                                    z16 = z10;
                                    i31++;
                                    i30 = i9;
                                    w26 = i10;
                                    i13 = 0;
                                } else {
                                    s5 u22 = u2(i31);
                                    if (u22 != null) {
                                        org.telegram.ui.ActionBar.u4 styleDelegate = u22.getStyleDelegate();
                                        if (J3) {
                                            styleDelegate.removeStyle(i30, max3, max4);
                                        } else {
                                            if (w26 != 0) {
                                                styleDelegate.removeStyle(w26, max3, max4);
                                            }
                                            styleDelegate.addStyle(i30, max3, max4);
                                        }
                                        u22.getEditText().invalidateEffects();
                                        u22.getEditText().requestLayout();
                                        u22.x();
                                        i10 = w26;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(s5.A(y42.b));
                                        if (J3 || w26 == 0) {
                                            i10 = w26;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i11 = max3;
                                        } else {
                                            i10 = w26;
                                            i11 = max3;
                                            u5.o(spannableStringBuilder2, i11, max4, i10, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        u5.o(spannableStringBuilder, i11, max4, i30, z15, null);
                                        s5.e(y42.b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i31++;
                                    i30 = i9;
                                    w26 = i10;
                                    i13 = 0;
                                }
                            }
                        }
                        i10 = w26;
                        z10 = z16;
                        z16 = z10;
                        i31++;
                        i30 = i9;
                        w26 = i10;
                        i13 = 0;
                    }
                    boolean z17 = z16;
                    this.E3 = false;
                    if (z17 && (b2Var = this.F3) != null) {
                        b2Var.h();
                    }
                    m3Var.h0();
                    if (z17) {
                        o4();
                    }
                }
            }
        }
    }

    public final void Y4(float f10, float f11) {
        TL_iv.pageTableCell m10;
        f5 f5Var = this.e4;
        if (!this.x3 || f5Var == null || this.t3 != f5Var || (m10 = f5Var.m((int) ((f10 - f5Var.getLeft()) - getLeft()), (int) ((f11 - f5Var.getTop()) - getTop()))) == null || m10 == this.A3) {
            return;
        }
        this.A3 = m10;
        f5Var.w(this.z3, m10);
    }

    public final ArrayList Z2() {
        return Y2(0, this.h3.size(), 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z3(View view) {
        d1 editText;
        d1 d1Var;
        o3 o3Var;
        n3 n3Var = null;
        if (l2()) {
            boolean L3 = L3();
            c3 c3Var = this.j3;
            if (L3) {
                int i9 = c3Var.u0;
                int i10 = c3Var.v0;
                if (i10 == c3Var.y0) {
                    editText = N4(i9, i10);
                    d1Var = editText;
                    if (d1Var != null) {
                        int length = d1Var.length();
                        o3Var = this;
                        n3Var = new n3(o3Var, d1Var, org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, length, 0), org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length, 0), null);
                    }
                }
            } else {
                if (y3()) {
                    editText = I2(c3Var.u0);
                } else if (w3()) {
                    editText = s2(c3Var.u0);
                } else if (G3()) {
                    editText = j4(c3Var.u0);
                } else {
                    s5 G4 = G4();
                    if (G4 != null) {
                        editText = G4.getEditText();
                    }
                }
                d1Var = editText;
                if (d1Var != null) {
                }
            }
            if (n3Var == null) {
                o3(false);
                o3Var.d3.X1(n3Var, view);
                return;
            }
            return;
        }
        o3Var = this;
        if (n3Var == null) {
        }
    }

    public final void Z4(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                pageblockpreformatted.language = str;
                s5 u22 = u2(this.h3.indexOf(aVar));
                if (u22 != null && (aVar2 = u22.x) != null) {
                    u22.I(aVar2.b, true);
                    u22.D = null;
                    u22.C();
                }
                b2 b2Var2 = this.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
            }
        }
    }

    public final void a2() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList6 = this.h3;
            if (i10 >= arrayList6.size()) {
                return;
            }
            a aVar = (a) arrayList6.get(i10);
            ArrayList arrayList7 = aVar.j;
            ArrayList arrayList8 = aVar.k;
            arrayList7.clear();
            if (aVar.i) {
                if (!arrayList.isEmpty()) {
                    aa.d.u(1, arrayList);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
            } else {
                for (int i11 = 0; i11 < arrayList8.size(); i11++) {
                    ((Long) arrayList8.get(i11)).getClass();
                    arrayList7.add(new m0());
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    arrayList7.add((m0) arrayList.get(i12));
                }
                int max = Math.max(i9, aVar.c);
                if (max == 0) {
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    boolean z10 = aVar.d > 0;
                    while (arrayList2.size() > max) {
                        arrayList2.remove(arrayList2.size() - 1);
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList4.remove(arrayList4.size() - 1);
                        arrayList5.remove(arrayList5.size() - 1);
                    }
                    int i13 = 1;
                    while (i13 <= max) {
                        int i14 = i13 - 1;
                        boolean z11 = i13 == max;
                        boolean z12 = i14 < arrayList2.size();
                        if (z12 && z11) {
                            if (((Boolean) arrayList3.get(i14)).booleanValue() != z10) {
                                z12 = false;
                            }
                        }
                        if (!z12) {
                            while (arrayList2.size() > i14) {
                                arrayList2.remove(arrayList2.size() - 1);
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList4.remove(arrayList4.size() - 1);
                                arrayList5.remove(arrayList5.size() - 1);
                            }
                            arrayList2.add(Long.valueOf(m0.a()));
                            arrayList3.add(Boolean.valueOf(z11 ? z10 : false));
                            arrayList4.add(0);
                            arrayList5.add(0L);
                        }
                        ((Long) arrayList2.get(i14)).getClass();
                        if (z11) {
                            if (((Long) arrayList5.get(i14)).longValue() == 0 || !E3(aVar.b)) {
                                arrayList4.set(i14, Integer.valueOf(((Integer) arrayList4.get(i14)).intValue() + 1));
                                arrayList5.set(i14, Long.valueOf(aVar.a));
                            } else {
                                ((Integer) arrayList4.get(i14)).getClass();
                                ((Long) arrayList5.get(i14)).getClass();
                            }
                            arrayList7.add(new m0());
                        } else {
                            ((Boolean) arrayList3.get(i14)).getClass();
                            arrayList7.add(new m0());
                        }
                        i13++;
                    }
                }
                if (x3(aVar)) {
                    boolean z13 = ((TL_iv.pageBlockDetails) aVar.b).open;
                    m0.a();
                    arrayList.add(new m0());
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (s5.p(aVar.b)) {
                    m0.a();
                    arrayList7.add(new m0());
                }
            }
            i10++;
            i9 = 0;
        }
    }

    public final boolean a3() {
        ArrayList arrayList = this.h3;
        a aVar = arrayList.isEmpty() ? null : (a) j3.r0.j(1, arrayList);
        if (aVar != null && !E3(aVar.b) && !aVar.i && !x3(aVar) && !K2(aVar.b)) {
            if (!(z1(aVar) instanceof s5)) {
                return false;
            }
            e3(aVar);
            return true;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        post(new i2(this, aVar2, 21));
        return true;
    }

    public final void a4() {
        int length;
        int w8;
        int d;
        int length2;
        int w10;
        int d9;
        int length3;
        int w11;
        int d10;
        int length4;
        int w12;
        int d11;
        d1 N4;
        int length5;
        int w13;
        int d12;
        boolean L3 = L3();
        m3 m3Var = this.d3;
        c3 c3Var = this.j3;
        if (L3) {
            int i9 = c3Var.u0;
            int i10 = c3Var.v0;
            if (i10 == c3Var.y0 && (N4 = N4(i9, i10)) != null && (w13 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length5 = N4.length()), 0)) < (d12 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length5, 0))) {
                if (u5.h(N4.getText(), w13, d12)) {
                    b2 b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    u5.n(N4.getText(), w13, d12);
                    N4.invalidateEffects();
                    g4(i9, i10);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    m3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                if (u5.g(N4.getText(), w13, d12)) {
                    u5.m(N4.getText(), w13, d12);
                    N4.invalidateEffects();
                    g4(i9, i10);
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(w13, d12);
                o3(false);
                E4(N4);
                return;
            }
            return;
        }
        if (y3()) {
            int i11 = c3Var.u0;
            d1 I2 = I2(i11);
            if (I2 != null && (w12 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length4 = I2.length()), 0)) < (d11 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length4, 0))) {
                if (u5.h(I2.getText(), w12, d11)) {
                    b2 b2Var5 = this.F3;
                    if (b2Var5 != null) {
                        b2Var5.d();
                    }
                    u5.n(I2.getText(), w12, d11);
                    I2.invalidateEffects();
                    e4(i11);
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.h();
                    }
                    m3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var7 = this.F3;
                if (b2Var7 != null) {
                    b2Var7.d();
                }
                if (u5.g(I2.getText(), w12, d11)) {
                    u5.m(I2.getText(), w12, d11);
                    I2.invalidateEffects();
                    e4(i11);
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(w12, d11);
                o3(false);
                E4(I2);
                return;
            }
            return;
        }
        if (w3()) {
            int i12 = c3Var.u0;
            d1 s22 = s2(i12);
            if (s22 != null && (w11 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length3 = s22.length()), 0)) < (d10 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length3, 0))) {
                if (u5.h(s22.getText(), w11, d10)) {
                    b2 b2Var9 = this.F3;
                    if (b2Var9 != null) {
                        b2Var9.d();
                    }
                    u5.n(s22.getText(), w11, d10);
                    s22.invalidateEffects();
                    d4(i12);
                    b2 b2Var10 = this.F3;
                    if (b2Var10 != null) {
                        b2Var10.h();
                    }
                    m3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var11 = this.F3;
                if (b2Var11 != null) {
                    b2Var11.d();
                }
                if (u5.g(s22.getText(), w11, d10)) {
                    u5.m(s22.getText(), w11, d10);
                    s22.invalidateEffects();
                    d4(i12);
                    b2 b2Var12 = this.F3;
                    if (b2Var12 != null) {
                        b2Var12.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(w11, d10);
                o3(false);
                E4(s22);
                return;
            }
            return;
        }
        if (!G3()) {
            s5 G4 = G4();
            if (G4 != null && (w8 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length = G4.getEditText().length()), 0)) < (d = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length, 0))) {
                if (u5.h(G4.getEditText().getText(), w8, d)) {
                    b2 b2Var13 = this.F3;
                    if (b2Var13 != null) {
                        b2Var13.d();
                    }
                    u5.n(G4.getEditText().getText(), w8, d);
                    G4.getEditText().invalidateEffects();
                    G4.x();
                    b2 b2Var14 = this.F3;
                    if (b2Var14 != null) {
                        b2Var14.h();
                    }
                    m3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var15 = this.F3;
                if (b2Var15 != null) {
                    b2Var15.d();
                }
                if (u5.g(G4.getEditText().getText(), w8, d)) {
                    u5.m(G4.getEditText().getText(), w8, d);
                    G4.getEditText().invalidateEffects();
                    G4.x();
                    b2 b2Var16 = this.F3;
                    if (b2Var16 != null) {
                        b2Var16.h();
                    }
                    o4();
                }
                G4.getEditText().setSelectionOverride(w8, d);
                o3(false);
                E4(G4.getEditText());
                return;
            }
            return;
        }
        int i13 = c3Var.u0;
        d1 j42 = j4(i13);
        if (j42 != null && (w10 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length2 = j42.length()), 0)) < (d9 = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length2, 0))) {
            if (u5.h(j42.getText(), w10, d9)) {
                b2 b2Var17 = this.F3;
                if (b2Var17 != null) {
                    b2Var17.d();
                }
                u5.n(j42.getText(), w10, d9);
                j42.invalidateEffects();
                f4(i13);
                b2 b2Var18 = this.F3;
                if (b2Var18 != null) {
                    b2Var18.h();
                }
                m3Var.h0();
                o4();
                return;
            }
            b2 b2Var19 = this.F3;
            if (b2Var19 != null) {
                b2Var19.d();
            }
            if (u5.g(j42.getText(), w10, d9)) {
                u5.m(j42.getText(), w10, d9);
                j42.invalidateEffects();
                f4(i13);
                b2 b2Var20 = this.F3;
                if (b2Var20 != null) {
                    b2Var20.h();
                }
                o4();
            }
            j42.setSelectionOverride(w10, d9);
            o3(false);
            E4(j42);
        }
    }

    public final void b2(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        a aVar = new a(pageblockaudio, 0, 0);
        s sVar = new s();
        aVar.g = sVar;
        sVar.c = true;
        long j10 = document.id;
        boolean z10 = j10 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (z10) {
            TLRPC.Message message = messageObject.messageOwner;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            s sVar2 = aVar.g;
            sVar2.i = document;
            sVar2.e = str;
            sVar2.a = 1;
            sVar2.f = 0.0f;
        } else {
            sVar.h = document;
            sVar.i = document;
            sVar.a = 2;
            pageblockaudio.audio_id = j10;
        }
        u3(aVar);
        if (z10) {
            s sVar3 = aVar.g;
            String str2 = sVar3.e;
            IdentityHashMap identityHashMap = this.V3;
            r4 r4Var = (r4) identityHashMap.remove(sVar3);
            if (r4Var != null) {
                r4Var.b();
            }
            r4 r4Var2 = new r4(this.b3, str2, document, new z2(aVar, sVar3, this));
            identityHashMap.put(sVar3, r4Var2);
            r4Var2.d();
        }
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        this.d3.onContentChanged();
    }

    public final void b3(a aVar, boolean z10) {
        View z12 = z1(aVar);
        if (!(z12 instanceof x4)) {
            c3(aVar, z10);
            return;
        }
        d1 d1Var = ((x4) z12).r;
        d1Var.r();
        d1Var.setSelection(z10 ? d1Var.length() : 0);
    }

    public final void b4() {
        d1 editText;
        Runnable e2Var;
        int length;
        final int w8;
        final int d;
        c3 c3Var = this.j3;
        if (c3Var == null || !c3Var.y()) {
            return;
        }
        int i9 = 1;
        int i10 = 0;
        if (L3()) {
            int i11 = c3Var.u0;
            int i12 = c3Var.v0;
            if (i12 != c3Var.y0) {
                return;
            }
            editText = N4(i11, i12);
            e2Var = new j2(this, i11, i12, 1);
        } else if (y3()) {
            int i13 = c3Var.u0;
            editText = I2(i13);
            e2Var = new d2(this, i13, 3);
        } else if (w3()) {
            int i14 = c3Var.u0;
            editText = s2(i14);
            e2Var = new d2(this, i14, i10);
        } else if (G3()) {
            int i15 = c3Var.u0;
            editText = j4(i15);
            e2Var = new d2(this, i15, i9);
        } else {
            s5 G4 = G4();
            if (G4 == null) {
                return;
            }
            editText = G4.getEditText();
            e2Var = new e2(G4, i10);
        }
        final d1 d1Var = editText;
        final Runnable runnable = e2Var;
        if (d1Var != null && (w8 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length = d1Var.length()), 0)) <= (d = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length, 0))) {
            Editable text = d1Var.getText();
            int i16 = r.h;
            String str = null;
            if (text != null) {
                r[] rVarArr = (r[]) text.getSpans(w8, d, r.class);
                if (rVarArr.length > 0) {
                    str = rVarArr[0].a;
                }
            }
            if (str == null) {
                str = d1Var.getText().subSequence(w8, d).toString();
            }
            final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
            int i17 = f6.G6;
            b6 b6Var = this.c3;
            final int v02 = f6.v0(i17, b6Var);
            p.T(getContext(), str, new Utilities.Callback() { // from class: qh.q2
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    r a2;
                    String str2 = (String) obj;
                    o3 o3Var = o3.this;
                    o3Var.getClass();
                    if (TextUtils.isEmpty(str2) || (a2 = r.a(str2, v02, dp)) == null) {
                        return;
                    }
                    b2 b2Var = o3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    c3 c3Var2 = o3Var.j3;
                    if (c3Var2 != null) {
                        c3Var2.f(false);
                    }
                    d1 d1Var2 = d1Var;
                    d1Var2.setLocked(false);
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(a2, 0, 1, 33);
                    Editable text2 = d1Var2.getText();
                    int max = Math.max(0, Math.min(w8, text2.length()));
                    text2.replace(max, Math.max(max, Math.min(d, text2.length())), spannableString);
                    runnable.run();
                    b2 b2Var2 = o3Var.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    o3Var.d3.onContentChanged();
                    int min = Math.min(max + 1, d1Var2.length());
                    d1Var2.r();
                    o3Var.post(new o2(d1Var2, min, 3));
                }
            }, b6Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(1:9)(1:(4:37|11|12|(4:14|16|17|(1:27)(4:19|(1:21)(1:26)|22|24)))(1:36))|10|11|12|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #0 {Exception -> 0x0079, blocks: (B:12:0x0046, B:14:0x006d), top: B:11:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b5(CharSequence charSequence) {
        String str;
        ClipboardManager clipboardManager;
        int i9;
        int i10;
        int i11;
        int i12;
        c3 c3Var = this.j3;
        a y42 = y4(c3Var.u0);
        ArrayList arrayList = this.h3;
        int indexOf = arrayList.indexOf(y42);
        int indexOf2 = arrayList.indexOf(y4(c3Var.x0));
        int i13 = c3Var.w0;
        int i14 = c3Var.z0;
        try {
            if (indexOf >= 0 && indexOf2 >= 0 && indexOf < arrayList.size() && indexOf2 < arrayList.size()) {
                if (indexOf > indexOf2) {
                    i12 = i14;
                    i11 = indexOf;
                    i10 = indexOf2;
                } else if (indexOf != indexOf2 || i13 <= i14) {
                    i9 = i14;
                    i10 = indexOf;
                    i11 = indexOf2;
                    i12 = i13;
                    HashMap hashMap = this.i3;
                    StringBuilder sb2 = new StringBuilder();
                    c2.u uVar = new c2.u(2);
                    u3.F(sb2, arrayList, new int[]{i10}, i11, i10, i11, i12, i9, uVar, false, 0, hashMap);
                    uVar.c(sb2);
                    str = sb2.toString();
                    if (!TextUtils.isEmpty(str)) {
                        m4.a(A2(i10, i11), z2(i10, i11));
                        clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                        if (clipboardManager != null) {
                            return;
                        }
                        clipboardManager.setPrimaryClip(str != null ? ClipData.newHtmlText("label", charSequence, str) : ClipData.newPlainText("label", charSequence));
                        return;
                    }
                } else {
                    i12 = i14;
                    i10 = indexOf;
                    i11 = indexOf2;
                }
                i9 = i13;
                HashMap hashMap2 = this.i3;
                StringBuilder sb22 = new StringBuilder();
                c2.u uVar2 = new c2.u(2);
                u3.F(sb22, arrayList, new int[]{i10}, i11, i10, i11, i12, i9, uVar2, false, 0, hashMap2);
                uVar2.c(sb22);
                str = sb22.toString();
                if (!TextUtils.isEmpty(str)) {
                }
            }
            clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager != null) {
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            return;
        }
        str = null;
    }

    public final void c2(String str) {
        int i9;
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
            String mimeTypeFromExtension = (lastIndexOf < 0 || (i9 = lastIndexOf + 1) >= name.length()) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i9).toLowerCase());
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                mimeTypeFromExtension = "application/octet-stream";
            }
            tL_document.mime_type = mimeTypeFromExtension;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            d2(tL_document, str);
        }
    }

    public final void c3(a aVar, boolean z10) {
        View z12 = z1(aVar);
        if (!(z12 instanceof f5)) {
            if (z10 && (z12 instanceof s5)) {
                s5 s5Var = (s5) z12;
                if (s5Var.n()) {
                    s5Var.i();
                    return;
                }
            }
            d1 R3 = R3(z12);
            if (R3 == null) {
                d3(aVar);
                return;
            }
            R3.r();
            if (z10) {
                R3.setSelection(R3.length());
                return;
            }
            return;
        }
        f5 f5Var = (f5) z12;
        d1 d1Var = f5Var.r;
        w5 w5Var = f5Var.B;
        if (w5Var == null) {
            return;
        }
        if (!z10) {
            d1Var.r();
            d1Var.setSelection(0);
        } else {
            if (w5Var.g.isEmpty()) {
                return;
            }
            i5 m10 = f5Var.v.m((TL_iv.pageTableCell) j3.r0.j(1, f5Var.B.g));
            if (m10 == null) {
                return;
            }
            d1 d1Var2 = m10.a;
            d1Var2.r();
            d1Var2.setSelection(d1Var2.length());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c4() {
        ClipData primaryClip;
        String str;
        boolean isEmpty;
        o3 o3Var;
        HashMap hashMap;
        ArrayList w42;
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
            c3 c3Var = this.j3;
            if (!isEmpty) {
                try {
                    hashMap = new HashMap();
                    w42 = w4(u3.z(str, hashMap));
                } catch (Exception e10) {
                    e = e10;
                    o3Var = this;
                }
                if (!w42.isEmpty()) {
                    ArrayList arrayList = this.h3;
                    o3Var = this;
                    try {
                        if (o3Var.I4(arrayList.indexOf(y4(c3Var.u0)), arrayList.indexOf(y4(c3Var.x0)), c3Var.w0, c3Var.z0, w42)) {
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            o3Var.i3.putAll(hashMap);
                            return;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        FileLog.e(e);
                        coerceToText = itemAt.coerceToText(getContext());
                        if (coerceToText == null) {
                        }
                        o3Var.W1(c3Var.u0, c3Var.w0, c3Var.x0, c3Var.z0, coerceToText.toString().split("\n", -1));
                    }
                    coerceToText = itemAt.coerceToText(getContext());
                    if (coerceToText == null) {
                        coerceToText = "";
                    }
                    o3Var.W1(c3Var.u0, c3Var.w0, c3Var.x0, c3Var.z0, coerceToText.toString().split("\n", -1));
                }
            }
            o3Var = this;
            coerceToText = itemAt.coerceToText(getContext());
            if (coerceToText == null) {
            }
            o3Var.W1(c3Var.u0, c3Var.w0, c3Var.x0, c3Var.z0, coerceToText.toString().split("\n", -1));
        }
        str = null;
        isEmpty = TextUtils.isEmpty(str);
        c3 c3Var2 = this.j3;
        if (!isEmpty) {
        }
        o3Var = this;
        coerceToText = itemAt.coerceToText(getContext());
        if (coerceToText == null) {
        }
        o3Var.W1(c3Var2.u0, c3Var2.w0, c3Var2.x0, c3Var2.z0, coerceToText.toString().split("\n", -1));
    }

    public final void d2(TLRPC.Document document, String str) {
        if (document == null) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
        a aVar = new a(pageblockdocument, 0, 0);
        s sVar = new s();
        aVar.g = sVar;
        sVar.d = true;
        long j10 = document.id;
        boolean z10 = j10 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (!z10) {
            sVar.h = document;
            sVar.a = 2;
            pageblockdocument.document_id = j10;
        } else {
            if (TextUtils.isEmpty(str) || !e2.c.w(str)) {
                return;
            }
            s sVar2 = aVar.g;
            sVar2.h = document;
            sVar2.e = str;
            sVar2.a = 1;
            sVar2.f = 0.0f;
        }
        u3(aVar);
        if (z10) {
            s sVar3 = aVar.g;
            IdentityHashMap identityHashMap = this.V3;
            r4 r4Var = (r4) identityHashMap.remove(sVar3);
            if (r4Var != null) {
                r4Var.b();
            }
            r4 r4Var2 = new r4(this.b3, str, document, new y2(this, sVar3, aVar, str));
            identityHashMap.put(sVar3, r4Var2);
            r4Var2.d();
        }
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        this.d3.onContentChanged();
    }

    public final void d3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof s5) {
            ((s5) z12).B();
        } else if (z12 instanceof q0) {
            ((q0) z12).d.r();
        }
    }

    public final void d4(int i9) {
        KeyEvent.Callback A4 = A4(i9);
        if (A4 instanceof i0) {
            ((i0) A4).b();
        }
    }

    @Override // org.telegram.ui.Components.i51, org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i9;
        Long l10;
        a aVar;
        View view;
        Long l11;
        int i10;
        int i11;
        ArrayList arrayList2;
        a aVar2;
        a aVar3;
        float f10;
        boolean z10;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                arrayList = this.l4;
                if (i12 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i12));
                a aVar4 = (R < 0 || R >= arrayList.size()) ? null : (a) arrayList.get(R);
                if (aVar4 != null) {
                    ArrayList arrayList3 = aVar4.k;
                    if (arrayList3.size() > i13) {
                        i13 = arrayList3.size();
                    }
                }
                i12++;
            }
            if (i13 != 0) {
                if (this.m4 == null) {
                    dl0 dl0Var = new dl0(this);
                    this.m4 = dl0Var;
                    dl0Var.a(null, null, null, this.c3, 1);
                    v6.a(this.m4, this.c3);
                }
                int i14 = 0;
                while (i14 < i13) {
                    float f11 = 0.0f;
                    long j10 = 0;
                    float f12 = 0.0f;
                    int i15 = 0;
                    boolean z11 = false;
                    a aVar5 = null;
                    a aVar6 = null;
                    float f13 = 1.0f;
                    while (i15 <= childCount) {
                        if (i15 < childCount) {
                            View childAt = getChildAt(i15);
                            int R2 = RecyclerView.R(childAt);
                            aVar = (R2 < 0 || R2 >= arrayList.size()) ? null : (a) arrayList.get(R2);
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.k;
                                if (i14 < arrayList4.size()) {
                                    l10 = (Long) arrayList4.get(i14);
                                    i9 = childCount;
                                    view = childAt;
                                }
                            }
                            i9 = childCount;
                            view = childAt;
                            l10 = null;
                        } else {
                            i9 = childCount;
                            l10 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z11 || (l10 != null && l10.longValue() == j10)) {
                            l11 = l10;
                            i10 = i14;
                            i11 = i13;
                            arrayList2 = arrayList;
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f10 = f13;
                        } else {
                            int k42 = k4(i14, aVar5, true);
                            l11 = l10;
                            int k43 = k4(i14, aVar6, false);
                            if (f12 - f11 <= AndroidUtilities.dp(4.0f)) {
                                i10 = i14;
                                i11 = i13;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i14;
                                i10 = i14;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i11 = i13;
                                arrayList2 = arrayList;
                                int B = org.telegram.messenger.l0.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, k42 + f11, B, f12 - k43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.m4.b(canvas, rectF, floor, floor, floor, f13);
                                    f10 = f13;
                                    this.m4.e(canvas, rectF, f10);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f10 = f13;
                            z11 = false;
                        }
                        if (view == null || l11 == null) {
                            aVar5 = aVar2;
                            aVar = aVar3;
                        } else {
                            if (z11) {
                                aVar5 = aVar2;
                                z10 = z11;
                            } else {
                                j10 = l11.longValue();
                                f11 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar5 = aVar;
                                z10 = true;
                                f10 = 1.0f;
                            }
                            if (aVar == null || aVar != this.O3) {
                                float y10 = view.getY();
                                float height = view.getHeight() + y10;
                                if (y10 < f11) {
                                    f11 = y10;
                                }
                                if (height > f12) {
                                    f12 = height;
                                }
                                f13 = Math.min(f10, view.getAlpha());
                                z11 = z10;
                                i15++;
                                aVar6 = aVar;
                                childCount = i9;
                                i14 = i10;
                                i13 = i11;
                                arrayList = arrayList2;
                            } else {
                                z11 = z10;
                            }
                        }
                        f13 = f10;
                        i15++;
                        aVar6 = aVar;
                        childCount = i9;
                        i14 = i10;
                        i13 = i11;
                        arrayList = arrayList2;
                    }
                    i14++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e2(Uri uri) {
        if (uri == null) {
            return;
        }
        a aVar = this.X3;
        String str = null;
        this.X3 = null;
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            str = context.getContentResolver().getType(uri);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        String str2 = str;
        boolean startsWith = str2 != null ? str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) : uri.toString().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
        int i9 = this.n4;
        this.n4 = i9 - 1;
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.s1(this, uri, startsWith, str2, i9, aVar));
    }

    public final void e3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof s5) {
            s5 s5Var = (s5) z12;
            s5Var.B();
            d1 editText = s5Var.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (z12 instanceof q0) {
            q0 q0Var = (q0) z12;
            q0Var.d.r();
            d1 editText2 = q0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void e4(int i9) {
        a y42 = y4(i9);
        d1 I2 = I2(i9);
        if (!x3(y42) || I2 == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) y42.b).title = u5.f(I2.getText());
    }

    public final void f2(MediaController.PhotoEntry photoEntry) {
        o3 o3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        boolean c10 = n4.c(photoEntry);
        a aVar = new a((photoEntry.isVideo || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        aVar.g = T3(photoEntry, str2);
        u3(aVar);
        if (c10) {
            K4(aVar, aVar.g, photoEntry);
            o3Var = this;
        } else {
            o3Var = this;
            o3Var.L4(aVar, aVar.g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        b2 b2Var2 = o3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        o3Var.d3.onContentChanged();
    }

    public final void f3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof s5) {
            s5 s5Var = (s5) z12;
            s5Var.B();
            s5Var.getEditText().setSelection(0);
        } else if (z12 instanceof q0) {
            q0 q0Var = (q0) z12;
            q0Var.d.r();
            q0Var.getEditText().setSelection(0);
        }
    }

    public final void f4(int i9) {
        View A4 = A4(i9);
        if (A4 instanceof s5) {
            ((s5) A4).w();
        }
    }

    public final void g2(f5 f5Var) {
        f5 f5Var2 = this.e4;
        if (f5Var2 != null && f5Var2 != f5Var) {
            LinkedHashSet linkedHashSet = f5Var2.D;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                f5Var2.v.invalidate();
                f5Var2.t();
            }
        }
        this.e4 = f5Var;
        this.y3 = false;
        this.h4 = -1;
        this.g4 = -1;
        f5Var.setCellSelectionListener(this.i4);
        c3 c3Var = this.j3;
        if (c3Var != null && c3Var.y()) {
            c3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void g4(int i9, int i10) {
        i5 m10;
        View A4 = A4(i9);
        if (A4 instanceof f5) {
            f5 f5Var = (f5) A4;
            if (i10 == 0) {
                f5Var.u();
                return;
            }
            TL_iv.pageTableCell h = f5Var.h(i10);
            if (h == null || (m10 = f5Var.getGrid().m(h)) == null) {
                return;
            }
            w5.d(h, m10.a.getText());
        }
    }

    public d1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return (d1) findFocus;
        }
        return null;
    }

    public d4 getMapDelegate() {
        return this.Z3;
    }

    public View getOverlayView() {
        return this.k3;
    }

    public n9 getTextSelectionHelper() {
        return this.j3;
    }

    public final f3 h2() {
        int i9;
        int i10;
        c3 c3Var = this.j3;
        if (c3Var == null || !c3Var.y() || G3()) {
            return null;
        }
        a y42 = y4(c3Var.u0);
        ArrayList arrayList = this.h3;
        int indexOf = arrayList.indexOf(y42);
        int indexOf2 = arrayList.indexOf(y4(c3Var.x0));
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            i10 = indexOf;
            i9 = indexOf2;
        } else {
            i9 = indexOf;
            i10 = indexOf2;
        }
        for (int i11 = i9; i11 <= i10; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.i || x3(aVar)) {
                return null;
            }
        }
        return new f3(this, i9, i10, c3Var.w0, c3Var.z0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x056f, code lost:
    
        if (r0 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x08ed, code lost:
    
        if (r6 == false) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x06b1, code lost:
    
        if (r3 < (r5.getLineCount() - 1)) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x072c, code lost:
    
        r13 = r4.getRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x07a8, code lost:
    
        if (r15.getLineForOffset(r6.getEditText().getSelectionEnd()) >= (r15.getLineCount() - 1)) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x02c4, code lost:
    
        if (r3 < r14.size()) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x048b, code lost:
    
        if (r3 < r14.size()) goto L332;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:600:0x052f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0174 A[LOOP:0: B:128:0x016e->B:130:0x0174, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x057b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x092c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:419:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h3(KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        View findFocus;
        f5 U2;
        int i9;
        f5 f5Var;
        x4 x4Var;
        a aVar;
        int indexOf;
        boolean z12;
        d1 R3;
        Layout layout;
        Layout layout2;
        int i10;
        final float primaryHorizontal;
        a U3;
        int i11;
        boolean z13;
        int i12;
        int i13;
        int i42;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean c02;
        Layout layout3;
        int i18;
        int length;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int max;
        a Q2;
        int indexOf2;
        boolean z14;
        int i24;
        int i25;
        int unicodeChar;
        boolean z15;
        b2 b2Var;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isAltPressed = keyEvent.isAltPressed();
        c3 c3Var = this.j3;
        boolean y10 = c3Var.y();
        if (isCtrlPressed && !isAltPressed && (b2Var = this.F3) != null) {
            if (keyCode == 54 && !isShiftPressed) {
                b2Var.k();
                return true;
            }
            if ((keyCode == 54 && isShiftPressed) || keyCode == 53) {
                b2Var.i();
                return true;
            }
        }
        if (isCtrlPressed && !isAltPressed) {
            int i26 = 4;
            if (isShiftPressed) {
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i26 = 8;
                        }
                        i26 = 0;
                    } else {
                        i26 = 256;
                    }
                }
                z15 = false;
            } else {
                if (keyCode == 30) {
                    i26 = 1;
                } else if (keyCode != 33) {
                    if (keyCode == 37) {
                        i26 = 2;
                    } else if (keyCode != 39) {
                        if (keyCode == 49) {
                            i26 = 16;
                        }
                        i26 = 0;
                    } else {
                        i26 = 0;
                        z15 = true;
                    }
                }
                z15 = false;
            }
            if (z15) {
                a4();
                return true;
            }
            if (i26 != 0) {
                Y3(i26);
                return true;
            }
        }
        if (keyCode == 111 && y10) {
            c3Var.f(false);
            return true;
        }
        if (y10) {
            if (isCtrlPressed && !isShiftPressed && keyCode == 31) {
                CharSequence s10 = c3Var.s();
                if (s10 != null && s10.length() != 0) {
                    b5(s10);
                    return true;
                }
                return true;
            }
            if (isCtrlPressed && !isShiftPressed && keyCode == 52) {
                CharSequence s11 = c3Var.s();
                if (s11 != null && s11.length() > 0) {
                    b5(s11);
                }
                E2();
                return true;
            }
            if (isCtrlPressed && keyCode == 50) {
                c4();
                return true;
            }
            if (keyCode == 67 || keyCode == 112) {
                E2();
                return true;
            }
            if (keyCode == 66) {
                t4("\n");
                return true;
            }
            if (!isCtrlPressed && !isAltPressed && (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) >= 32) {
                t4(String.valueOf((char) unicodeChar));
                return true;
            }
        }
        ArrayList arrayList = this.h3;
        if (!y10 && isShiftPressed && v3(keyCode) && (Q2 = Q2()) != null && (indexOf2 = arrayList.indexOf(Q2)) >= 0) {
            View z16 = z1(Q2);
            if (z16 instanceof s5) {
                s5 s5Var = (s5) z16;
                d1 editText = s5Var.getEditText();
                if (editText.getLayout() != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    int length2 = editText.length();
                    switch (keyCode) {
                        case 19:
                        case 21:
                            if (selectionEnd <= 0) {
                                z14 = false;
                                i24 = !z14 ? indexOf2 + 1 : indexOf2 - 1;
                                if (i24 >= 0 && i24 < arrayList.size()) {
                                    a aVar2 = (a) arrayList.get(i24);
                                    for (i25 = 0; i25 < arrayList.size(); i25++) {
                                        c3Var.Y(i25, s5.z(((a) arrayList.get(i25)).b));
                                    }
                                    if (length2 != 0) {
                                        int max2 = Math.max(0, Math.min(editText.getSelectionStart(), length2));
                                        if (z14) {
                                            if (max2 >= length2) {
                                                length2--;
                                            }
                                            if (c3Var.k0(s5Var, 0, max2, length2)) {
                                                KeyEvent.Callback z17 = z1(aVar2);
                                                if (z17 instanceof m9) {
                                                    c3Var.c0(0, 0, (m9) z17);
                                                    return true;
                                                }
                                                u0(i24);
                                                post(new i2(this, aVar2, 14));
                                                return true;
                                            }
                                        } else if (c3Var.k0(s5Var, 0, max2, max2 > 0 ? 0 : 1)) {
                                            KeyEvent.Callback z18 = z1(aVar2);
                                            if (z18 instanceof m9) {
                                                c3Var.c0(0, z18 instanceof s5 ? ((s5) z18).getEditText().length() : 0, (m9) z18);
                                                return true;
                                            }
                                            u0(i24);
                                            post(new i2(this, aVar2, 15));
                                            return true;
                                        }
                                    }
                                    if (!y10 && isShiftPressed && v3(keyCode)) {
                                        boolean z19 = isCtrlPressed || isAltPressed;
                                        int i27 = c3Var.G0;
                                        int i28 = c3Var.I0;
                                        int i29 = c3Var.H0;
                                        int i30 = c3Var.u0;
                                        int i31 = c3Var.v0;
                                        int i32 = c3Var.w0;
                                        int i33 = c3Var.x0;
                                        boolean z20 = z19;
                                        int i34 = c3Var.y0;
                                        int i35 = c3Var.z0;
                                        if (i27 == i30 && i28 == i31 && i29 == i32) {
                                            i30 = i33;
                                            i31 = i34;
                                        } else {
                                            i35 = i32;
                                        }
                                        View A4 = A4(i30);
                                        if (A4 != null) {
                                            if (!(A4 instanceof f5)) {
                                                z10 = isCtrlPressed;
                                                z11 = isAltPressed;
                                                if (A4 instanceof s5) {
                                                    Layout layout4 = ((s5) A4).getEditText().getLayout();
                                                    if (layout4 != null) {
                                                        CharSequence text = layout4.getText();
                                                        int length3 = text.length();
                                                        switch (keyCode) {
                                                            case 19:
                                                                int lineForOffset = layout4.getLineForOffset(i35) - 1;
                                                                if (lineForOffset >= 0) {
                                                                    i12 = layout4.getOffsetForHorizontal(lineForOffset, layout4.getPrimaryHorizontal(i35));
                                                                    i14 = i30;
                                                                    break;
                                                                } else {
                                                                    i13 = i30 - 1;
                                                                    if (i13 >= 0) {
                                                                        i42 = i4(i13);
                                                                        int i36 = i42;
                                                                        i14 = i13;
                                                                        i12 = i36;
                                                                        break;
                                                                    } else {
                                                                        i14 = i30;
                                                                        i12 = 0;
                                                                        break;
                                                                    }
                                                                }
                                                            case 20:
                                                                int lineForOffset2 = layout4.getLineForOffset(i35) + 1;
                                                                if (lineForOffset2 < layout4.getLineCount()) {
                                                                    i12 = layout4.getOffsetForHorizontal(lineForOffset2, layout4.getPrimaryHorizontal(i35));
                                                                } else {
                                                                    int i37 = i30 + 1;
                                                                    if (i37 < arrayList.size()) {
                                                                        i14 = i37;
                                                                        i12 = 0;
                                                                        break;
                                                                    } else {
                                                                        i12 = length3;
                                                                    }
                                                                }
                                                                i14 = i30;
                                                                break;
                                                            case 21:
                                                                if (z20) {
                                                                    BreakIterator wordInstance = BreakIterator.getWordInstance();
                                                                    wordInstance.setText(text.toString());
                                                                    int preceding = wordInstance.preceding(Math.max(0, Math.min(i35, text.length())));
                                                                    i12 = preceding == -1 ? 0 : preceding;
                                                                } else {
                                                                    i12 = Math.max(0, i35 - 1);
                                                                }
                                                                if (i12 == i35 && i35 <= 0 && i30 - 1 >= 0) {
                                                                    i12 = i4(i14);
                                                                    break;
                                                                }
                                                                i14 = i30;
                                                                break;
                                                            case 22:
                                                                if (z20) {
                                                                    BreakIterator wordInstance2 = BreakIterator.getWordInstance();
                                                                    wordInstance2.setText(text.toString());
                                                                    i12 = wordInstance2.following(Math.min(i35, text.length()));
                                                                    if (i12 == -1) {
                                                                        i12 = text.length();
                                                                    }
                                                                } else {
                                                                    i12 = Math.min(length3, i35 + 1);
                                                                }
                                                                if (i12 == i35) {
                                                                    if (i35 >= length3) {
                                                                        i14 = i30 + 1;
                                                                        break;
                                                                    }
                                                                }
                                                                i14 = i30;
                                                                break;
                                                            default:
                                                                i12 = i35;
                                                                i14 = i30;
                                                                break;
                                                        }
                                                        i15 = i12;
                                                        i16 = i14;
                                                        i17 = i31;
                                                    }
                                                    c02 = false;
                                                    break;
                                                } else {
                                                    if ((A4 instanceof u0) || (A4 instanceof l4) || (A4 instanceof x) || (A4 instanceof f4) || (A4 instanceof h4)) {
                                                        switch (keyCode) {
                                                            case 19:
                                                            case 21:
                                                                i13 = i30 - 1;
                                                                if (i13 >= 0) {
                                                                    i42 = i4(i13);
                                                                    int i362 = i42;
                                                                    i14 = i13;
                                                                    i12 = i362;
                                                                    break;
                                                                }
                                                                i12 = i35;
                                                                i14 = i30;
                                                                break;
                                                            case 20:
                                                            case 22:
                                                                int i38 = i30 + 1;
                                                                if (i38 < arrayList.size()) {
                                                                    i14 = i38;
                                                                    i12 = 0;
                                                                    break;
                                                                }
                                                                i12 = i35;
                                                                i14 = i30;
                                                                break;
                                                            default:
                                                                i12 = i35;
                                                                i14 = i30;
                                                                break;
                                                        }
                                                        i15 = i12;
                                                        i16 = i14;
                                                        i17 = i31;
                                                    }
                                                    c02 = false;
                                                }
                                                return true;
                                            }
                                            f5 f5Var2 = (f5) A4;
                                            w5 model = f5Var2.getModel();
                                            if (model != null) {
                                                ArrayList arrayList2 = model.g;
                                                if (!arrayList2.isEmpty()) {
                                                    int size = arrayList2.size() + 1;
                                                    int i39 = (i31 < 0 || i31 >= size) ? 0 : i31;
                                                    d1 l10 = f5Var2.l(i39);
                                                    if (l10 != null) {
                                                        Layout layout5 = l10.getLayout();
                                                        z10 = isCtrlPressed;
                                                        layout3 = layout5;
                                                    } else {
                                                        z10 = isCtrlPressed;
                                                        layout3 = null;
                                                    }
                                                    if (layout3 != null) {
                                                        CharSequence text2 = layout3.getText();
                                                        z11 = isAltPressed;
                                                        int length4 = text2.length();
                                                        switch (keyCode) {
                                                            case 19:
                                                                int lineForOffset3 = layout3.getLineForOffset(i35) - 1;
                                                                if (lineForOffset3 >= 0) {
                                                                    length = layout3.getOffsetForHorizontal(lineForOffset3, layout3.getPrimaryHorizontal(i35));
                                                                } else if (i39 == 0) {
                                                                    i20 = i30 - 1;
                                                                    if (i20 >= 0) {
                                                                        length = i4(i20);
                                                                        i31 = 0;
                                                                        break;
                                                                    }
                                                                    i20 = i30;
                                                                    length = 0;
                                                                    break;
                                                                } else {
                                                                    int i40 = i39 - 1;
                                                                    if (i40 >= 0 && i40 < arrayList2.size()) {
                                                                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i40);
                                                                        int b10 = model.b(pagetablecell);
                                                                        int a2 = model.a(pagetablecell);
                                                                        int i41 = b10 - 1;
                                                                        if (i41 >= 0) {
                                                                            i18 = arrayList2.indexOf(model.d[i41][Math.min(a2, model.c - 1)]);
                                                                            if (i18 < 0) {
                                                                                i19 = i18 + 1;
                                                                                d1 l11 = f5Var2.l(i19);
                                                                                Layout layout6 = l11 != null ? l11.getLayout() : null;
                                                                                length = layout6 != null ? layout6.getText().length() : 0;
                                                                            } else {
                                                                                length = f5Var2.getTitleEditText().length();
                                                                                i19 = 0;
                                                                            }
                                                                            i31 = i19;
                                                                        }
                                                                    }
                                                                    i18 = -1;
                                                                    if (i18 < 0) {
                                                                    }
                                                                    i31 = i19;
                                                                }
                                                                i20 = i30;
                                                                break;
                                                            case 20:
                                                                int lineForOffset4 = layout3.getLineForOffset(i35) + 1;
                                                                int i43 = length4;
                                                                if (lineForOffset4 < layout3.getLineCount()) {
                                                                    length = layout3.getOffsetForHorizontal(lineForOffset4, layout3.getPrimaryHorizontal(i35));
                                                                    i20 = i30;
                                                                    break;
                                                                } else {
                                                                    if (i39 == 0) {
                                                                        if (size > 1) {
                                                                            i20 = i30;
                                                                            length = 0;
                                                                            i31 = 1;
                                                                            break;
                                                                        } else {
                                                                            i20 = i30 + 1;
                                                                            if (i20 >= arrayList.size()) {
                                                                                i20 = i30;
                                                                            }
                                                                            length = 0;
                                                                            i31 = 0;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        int i44 = i39 - 1;
                                                                        if (i44 < 0 || i44 >= arrayList2.size()) {
                                                                            i21 = 1;
                                                                        } else {
                                                                            TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i44);
                                                                            int b11 = model.b(pagetablecell2);
                                                                            int a3 = model.a(pagetablecell2);
                                                                            i21 = 1;
                                                                            int max3 = Math.max(1, w5.o(pagetablecell2)) + b11;
                                                                            if (max3 < model.b) {
                                                                                i22 = arrayList2.indexOf(model.d[max3][Math.min(a3, model.c - 1)]);
                                                                                if (i22 < 0) {
                                                                                    i23 = i22 + i21;
                                                                                    i20 = i30;
                                                                                } else {
                                                                                    int i45 = i30 + 1;
                                                                                    if (i45 < arrayList.size()) {
                                                                                        i20 = i45;
                                                                                        i23 = 0;
                                                                                    } else {
                                                                                        i20 = i30;
                                                                                        i23 = i31;
                                                                                        i31 = i23;
                                                                                    }
                                                                                }
                                                                                i43 = 0;
                                                                                i31 = i23;
                                                                            }
                                                                        }
                                                                        i22 = -1;
                                                                        if (i22 < 0) {
                                                                        }
                                                                        i43 = 0;
                                                                        i31 = i23;
                                                                    }
                                                                    length = i43;
                                                                    break;
                                                                }
                                                            case 21:
                                                                if (z20) {
                                                                    BreakIterator wordInstance3 = BreakIterator.getWordInstance();
                                                                    wordInstance3.setText(text2.toString());
                                                                    int preceding2 = wordInstance3.preceding(Math.max(0, Math.min(i35, text2.length())));
                                                                    max = preceding2 == -1 ? 0 : preceding2;
                                                                } else {
                                                                    max = Math.max(0, i35 - 1);
                                                                }
                                                                if (max == i35 && i35 <= 0) {
                                                                    int i46 = i39 - 1;
                                                                    if (i46 >= 0) {
                                                                        d1 l12 = f5Var2.l(i46);
                                                                        Layout layout7 = l12 != null ? l12.getLayout() : null;
                                                                        length = layout7 != null ? layout7.getText().length() : 0;
                                                                        i31 = i46;
                                                                        i20 = i30;
                                                                        break;
                                                                    } else {
                                                                        int i47 = i30 - 1;
                                                                        if (i47 >= 0) {
                                                                            i20 = i47;
                                                                            length = i4(i47);
                                                                            i31 = 0;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                length = max;
                                                                i20 = i30;
                                                            case 22:
                                                                if (z20) {
                                                                    BreakIterator wordInstance4 = BreakIterator.getWordInstance();
                                                                    wordInstance4.setText(text2.toString());
                                                                    length = wordInstance4.following(Math.min(i35, text2.length()));
                                                                    if (length == -1) {
                                                                        length = text2.length();
                                                                    }
                                                                } else {
                                                                    length = Math.min(length4, i35 + 1);
                                                                }
                                                                if (length == i35 && i35 >= length4) {
                                                                    int i48 = i39 + 1;
                                                                    if (i48 < size) {
                                                                        i31 = i48;
                                                                        i20 = i30;
                                                                        length = 0;
                                                                        break;
                                                                    } else {
                                                                        i20 = i30 + 1;
                                                                        break;
                                                                    }
                                                                }
                                                                i20 = i30;
                                                                break;
                                                            default:
                                                                length = i35;
                                                                i20 = i30;
                                                                break;
                                                        }
                                                        i15 = length;
                                                        i16 = i20;
                                                        i17 = i31;
                                                        i31 = i39;
                                                    }
                                                }
                                            }
                                            z10 = isCtrlPressed;
                                            if (i16 != i30 || i17 != i31 || i15 != i35) {
                                                if (i16 != i30) {
                                                    u0(i16);
                                                }
                                                KeyEvent.Callback A42 = A4(i16);
                                                if (A42 instanceof m9) {
                                                    c02 = c3Var.c0(i17, i15, (m9) A42);
                                                    break;
                                                } else {
                                                    post(new kh.c0(this, i16, i17, i15, 2));
                                                }
                                            }
                                            c02 = true;
                                            break;
                                        } else {
                                            z10 = isCtrlPressed;
                                        }
                                        z11 = isAltPressed;
                                        c02 = false;
                                    } else {
                                        z10 = isCtrlPressed;
                                        z11 = isAltPressed;
                                    }
                                    if (!y10 && !isShiftPressed && !z10 && !z11 && v3(keyCode)) {
                                        boolean z21 = keyCode == 22 || keyCode == 20;
                                        this.l3 = z21 ? c3Var.x0 : c3Var.u0;
                                        this.m3 = z21 ? c3Var.z0 : c3Var.w0;
                                        this.n3 = z21 ? c3Var.y0 : c3Var.v0;
                                        c3Var.f(false);
                                        return true;
                                    }
                                    if (z10 || keyCode != 29 || (!c3Var.b0() && !S4())) {
                                        if (!y10 && !isShiftPressed && !z10 && !z11 && (keyCode == 20 || keyCode == 19)) {
                                            boolean z22 = keyCode != 20;
                                            i9 = 0;
                                            while (true) {
                                                if (i9 >= getChildCount()) {
                                                    View childAt = getChildAt(i9);
                                                    if (childAt instanceof f5) {
                                                        f5Var = (f5) childAt;
                                                        if (f5Var.getTitleEditText().isFocused()) {
                                                        }
                                                    }
                                                    i9++;
                                                } else {
                                                    f5Var = null;
                                                }
                                            }
                                            z41 z41Var = this.U2;
                                            if (f5Var == null) {
                                                int indexOf3 = arrayList.indexOf(f5Var.getRow());
                                                if (indexOf3 >= 0) {
                                                    if (!z22) {
                                                        int T2 = T2(indexOf3 - 1, -1);
                                                        if (T2 >= 0) {
                                                            post(new i2(this, (a) arrayList.get(T2), 5));
                                                        }
                                                    } else if (!f5Var.r()) {
                                                        int T22 = T2(indexOf3 + 1, 1);
                                                        if (T22 < 0) {
                                                            a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                            arrayList.add(aVar3);
                                                            z41Var.N(false);
                                                            post(new i2(this, aVar3, 2));
                                                        } else {
                                                            post(new i2(this, (a) arrayList.get(T22), 4));
                                                        }
                                                    }
                                                    z13 = true;
                                                    break;
                                                }
                                                z13 = false;
                                                break;
                                            } else {
                                                int i49 = 0;
                                                while (true) {
                                                    if (i49 < getChildCount()) {
                                                        View childAt2 = getChildAt(i49);
                                                        if (childAt2 instanceof x4) {
                                                            x4Var = (x4) childAt2;
                                                            if (x4Var.r.isFocused()) {
                                                            }
                                                        }
                                                        i49++;
                                                    } else {
                                                        x4Var = null;
                                                    }
                                                }
                                                if (x4Var != null) {
                                                    d1 d1Var = x4Var.r;
                                                    int indexOf4 = this.l4.indexOf(x4Var.getRow());
                                                    if (indexOf4 >= 0) {
                                                        Layout layout8 = d1Var.getLayout();
                                                        int lineForOffset5 = layout8 != null ? layout8.getLineForOffset(d1Var.getSelectionEnd()) : 0;
                                                        if (z22) {
                                                            if (layout8 != null) {
                                                                i11 = 1;
                                                                break;
                                                            } else {
                                                                i11 = 1;
                                                            }
                                                            a U32 = U3(indexOf4 + i11, i11);
                                                            if (U32 == null) {
                                                                a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(aVar4);
                                                                z41Var.N(false);
                                                                post(new i2(this, aVar4, 6));
                                                            } else {
                                                                post(new i2(this, U32, 7));
                                                            }
                                                            z13 = true;
                                                        } else if ((layout8 == null || lineForOffset5 <= 0) && (U3 = U3(indexOf4 - 1, -1)) != null) {
                                                            post(new i2(this, U3, 8));
                                                            z13 = true;
                                                        }
                                                    }
                                                    z13 = false;
                                                } else {
                                                    int i50 = 0;
                                                    while (true) {
                                                        if (i50 < getChildCount()) {
                                                            KeyEvent.Callback childAt3 = getChildAt(i50);
                                                            if (childAt3 instanceof s5) {
                                                                s5 s5Var2 = (s5) childAt3;
                                                                if (s5Var2.getEditText().isFocused() || (s5Var2.n() && s5Var2.h.isFocused())) {
                                                                }
                                                                i50++;
                                                            } else if (childAt3 instanceof i0) {
                                                                i0 i0Var = (i0) childAt3;
                                                                if (i0Var.getCaptionEditText().isFocused()) {
                                                                    aVar = i0Var.getRow();
                                                                } else {
                                                                    i50++;
                                                                }
                                                            } else {
                                                                if (childAt3 instanceof q0) {
                                                                    q0 q0Var = (q0) childAt3;
                                                                    if (q0Var.getEditText().isFocused()) {
                                                                        aVar = q0Var.getRow();
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                                i50++;
                                                            }
                                                        } else {
                                                            aVar = null;
                                                        }
                                                    }
                                                    if (aVar != null && (indexOf = arrayList.indexOf(aVar)) >= 0) {
                                                        View z110 = z1(aVar);
                                                        boolean z23 = z110 instanceof s5;
                                                        if (z23) {
                                                            final s5 s5Var3 = (s5) z110;
                                                            d1 d1Var2 = s5Var3.f;
                                                            d1 d1Var3 = s5Var3.h;
                                                            if (s5Var3.n()) {
                                                                if (!z22 || d1Var3.isFocused()) {
                                                                    z12 = z22;
                                                                    if (!z12 && d1Var3.isFocused() && ((layout2 = s5Var3.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(s5Var3.getAuthorEditText().getSelectionEnd()) <= 0)) {
                                                                        Layout layout9 = d1Var3.getLayout();
                                                                        final float primaryHorizontal2 = layout9 == null ? 0.0f : layout9.getPrimaryHorizontal(Math.max(0, Math.min(d1Var3.getSelectionEnd(), d1Var3.length())));
                                                                        d1Var2.r();
                                                                        final int i51 = 0;
                                                                        d1Var2.post(new Runnable() { // from class: qh.j5
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                switch (i51) {
                                                                                    case 0:
                                                                                        d1 d1Var4 = s5Var3.f;
                                                                                        Layout layout10 = d1Var4.getLayout();
                                                                                        int length5 = d1Var4.length();
                                                                                        if (layout10 != null) {
                                                                                            length5 = layout10.getOffsetForHorizontal(Math.max(0, layout10.getLineCount() - 1), primaryHorizontal2);
                                                                                        }
                                                                                        d1Var4.setSelection(Math.max(0, Math.min(length5, d1Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        d1 d1Var5 = s5Var3.h;
                                                                                        Layout layout11 = d1Var5.getLayout();
                                                                                        int length6 = d1Var5.length();
                                                                                        if (layout11 != null) {
                                                                                            length6 = layout11.getOffsetForHorizontal(0, primaryHorizontal2);
                                                                                        }
                                                                                        d1Var5.setSelection(Math.max(0, Math.min(length6, d1Var5.length())));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        z13 = true;
                                                                    }
                                                                    if (z23) {
                                                                        R3 = R3(z110);
                                                                    } else {
                                                                        s5 s5Var4 = (s5) z110;
                                                                        R3 = (s5Var4.n() && s5Var4.h.isFocused()) ? s5Var4.getAuthorEditText() : s5Var4.getEditText();
                                                                    }
                                                                    if (R3 != null && (layout = R3.getLayout()) != null) {
                                                                        int lineForOffset6 = layout.getLineForOffset(R3.getSelectionEnd());
                                                                        if (z12) {
                                                                            if (lineForOffset6 <= 0) {
                                                                                a V1 = V1(aVar, -1);
                                                                                if (V1 != null) {
                                                                                    post(new i2(this, V1, 13));
                                                                                } else {
                                                                                    int T23 = T2(indexOf - 1, -1);
                                                                                    if (T23 >= 0) {
                                                                                        post(new i2(this, (a) arrayList.get(T23), 3));
                                                                                    }
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        } else if (lineForOffset6 >= layout.getLineCount() - 1) {
                                                                            a V12 = V1(aVar, 1);
                                                                            if (V12 != null) {
                                                                                post(new i2(this, V12, 10));
                                                                            } else {
                                                                                int T24 = T2(indexOf + 1, 1);
                                                                                if (T24 < 0) {
                                                                                    a aVar5 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                                    arrayList.add(aVar5);
                                                                                    z41Var.N(false);
                                                                                    post(new i2(this, aVar5, 11));
                                                                                } else {
                                                                                    post(new i2(this, (a) arrayList.get(T24), 12));
                                                                                }
                                                                            }
                                                                            z13 = true;
                                                                        }
                                                                    }
                                                                } else {
                                                                    Layout layout10 = s5Var3.getEditText().getLayout();
                                                                    if (layout10 != null) {
                                                                        z12 = z22;
                                                                        break;
                                                                    }
                                                                    Layout layout11 = d1Var2.getLayout();
                                                                    if (layout11 == null) {
                                                                        i10 = 0;
                                                                        primaryHorizontal = 0.0f;
                                                                    } else {
                                                                        i10 = 0;
                                                                        primaryHorizontal = layout11.getPrimaryHorizontal(Math.max(0, Math.min(d1Var2.getSelectionEnd(), d1Var2.length())));
                                                                    }
                                                                    if (d1Var3.getVisibility() != 0) {
                                                                        d1Var3.setVisibility(i10);
                                                                        s5Var3.requestLayout();
                                                                    }
                                                                    d1Var3.r();
                                                                    final int i52 = 1;
                                                                    d1Var3.post(new Runnable() { // from class: qh.j5
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i52) {
                                                                                case 0:
                                                                                    d1 d1Var4 = s5Var3.f;
                                                                                    Layout layout102 = d1Var4.getLayout();
                                                                                    int length5 = d1Var4.length();
                                                                                    if (layout102 != null) {
                                                                                        length5 = layout102.getOffsetForHorizontal(Math.max(0, layout102.getLineCount() - 1), primaryHorizontal);
                                                                                    }
                                                                                    d1Var4.setSelection(Math.max(0, Math.min(length5, d1Var4.length())));
                                                                                    break;
                                                                                default:
                                                                                    d1 d1Var5 = s5Var3.h;
                                                                                    Layout layout112 = d1Var5.getLayout();
                                                                                    int length6 = d1Var5.length();
                                                                                    if (layout112 != null) {
                                                                                        length6 = layout112.getOffsetForHorizontal(0, primaryHorizontal);
                                                                                    }
                                                                                    d1Var5.setSelection(Math.max(0, Math.min(length6, d1Var5.length())));
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    z13 = true;
                                                                }
                                                            }
                                                        }
                                                        z12 = z22;
                                                        if (z23) {
                                                        }
                                                        if (R3 != null) {
                                                            int lineForOffset62 = layout.getLineForOffset(R3.getSelectionEnd());
                                                            if (z12) {
                                                            }
                                                        }
                                                    }
                                                    z13 = false;
                                                }
                                            }
                                        }
                                        if (!y10 && !z10 && !z11 && keyCode == 61) {
                                            findFocus = findFocus();
                                            if (findFocus instanceof d1) {
                                                if ((U2 = U2((r3 = (d1) findFocus))) != null) {
                                                    if (findFocus != U2.getTitleEditText()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (keyCode == 61 && y10) {
                                            int i53 = c3Var.u0;
                                            int i54 = c3Var.x0;
                                            if (i53 >= 0 && i54 >= i53) {
                                                if (i53 != i54) {
                                                    int indexOf5 = arrayList.indexOf(y4(i53));
                                                    int indexOf6 = arrayList.indexOf(y4(i54));
                                                    if (indexOf5 < 0 || indexOf6 < indexOf5) {
                                                        return true;
                                                    }
                                                    m4(indexOf5, indexOf6, isShiftPressed);
                                                    return true;
                                                }
                                                a y42 = y4(i53);
                                                if (y42 != null) {
                                                    W3(y42, isShiftPressed);
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                            break;
                        case 20:
                        case 22:
                            if (selectionEnd >= length2) {
                                z14 = true;
                                if (!z14) {
                                }
                                if (i24 >= 0) {
                                    a aVar22 = (a) arrayList.get(i24);
                                    while (i25 < arrayList.size()) {
                                    }
                                    if (length2 != 0) {
                                    }
                                    if (!y10) {
                                    }
                                    z10 = isCtrlPressed;
                                    z11 = isAltPressed;
                                    if (!y10) {
                                    }
                                    if (z10) {
                                        break;
                                    }
                                    if (!y10) {
                                        if (keyCode != 20) {
                                        }
                                        i9 = 0;
                                        while (true) {
                                            if (i9 >= getChildCount()) {
                                            }
                                            i9++;
                                        }
                                        z41 z41Var2 = this.U2;
                                        if (f5Var == null) {
                                        }
                                    }
                                    if (!y10) {
                                        findFocus = findFocus();
                                        if ((findFocus instanceof d1) && (U2 = U2((r3 = (d1) findFocus))) != null) {
                                        }
                                    }
                                    return keyCode == 61 ? false : false;
                                }
                            }
                            break;
                    }
                }
            }
        }
        if (!y10) {
        }
        z10 = isCtrlPressed;
        z11 = isAltPressed;
        if (!y10) {
        }
        if (z10) {
        }
        if (!y10) {
        }
        if (!y10) {
        }
        if (keyCode == 61) {
        }
    }

    public final int i2(int i9) {
        d1 I2 = I2(i9);
        if (I2 != null) {
            return I2.length();
        }
        s5 u22 = u2(i9);
        if (u22 != null) {
            return u22.getEditText().length();
        }
        a y42 = y4(i9);
        if (y42 == null) {
            return 0;
        }
        return s5.z(y42.b).length();
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x043b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i3(MotionEvent motionEvent) {
        boolean z10;
        a row;
        int i9;
        f5 f5Var;
        int action = motionEvent.getAction();
        c3 c3Var = this.j3;
        View view = null;
        if (action == 0) {
            this.r3 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.s3 = y10;
            this.v3 = false;
            this.w3 = false;
            int i10 = (int) this.r3;
            int top = ((int) y10) - getTop();
            f5 f5Var2 = this.e4;
            if (f5Var2 == null) {
                f5Var2 = R2();
            }
            if (f5Var2 != null && f5Var2.getParent() == this) {
                int left = i10 - f5Var2.getLeft();
                int top2 = top - f5Var2.getTop();
                if (f5Var2.p(left, top2) >= 0 || f5Var2.n(left, top2) >= 0) {
                    view = f5Var2;
                    this.t3 = view;
                    long eventTime = motionEvent.getEventTime();
                    z10 = c3Var.y() && eventTime - this.B3 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.r3 - this.C3) <= ((float) AndroidUtilities.dp(24.0f)) && Math.abs(this.s3 - this.D3) <= ((float) AndroidUtilities.dp(24.0f));
                    this.B3 = eventTime;
                    float f10 = this.r3;
                    this.C3 = f10;
                    float f11 = this.s3;
                    this.D3 = f11;
                    if (!z10 && T4(this.t3, f10, f11)) {
                        this.w3 = true;
                        this.B3 = 0L;
                        org.telegram.ui.Cells.g gVar = c3Var.r0;
                        if (!c3Var.y()) {
                            return true;
                        }
                        c3Var.i = false;
                        c3Var.R = false;
                        c3Var.k = false;
                        z9 z9Var = c3Var.C;
                        if (z9Var != null) {
                            z9Var.invalidate();
                        }
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar);
                        return true;
                    }
                    if (this.t3 != null) {
                        Runnable runnable = this.u3;
                        if (runnable != null) {
                            removeCallbacks(runnable);
                        }
                        b bVar = new b(this, 2);
                        this.u3 = bVar;
                        postDelayed(bVar, ViewConfiguration.getLongPressTimeout());
                    }
                }
            }
            int i11 = 0;
            while (true) {
                if (i11 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i11);
                if (top >= childAt.getTop() && top < childAt.getBottom() && i10 >= childAt.getLeft() && i10 < childAt.getRight()) {
                    view = childAt;
                    break;
                }
                i11++;
            }
            this.t3 = view;
            long eventTime2 = motionEvent.getEventTime();
            if (c3Var.y()) {
            }
            this.B3 = eventTime2;
            float f102 = this.r3;
            this.C3 = f102;
            float f112 = this.s3;
            this.D3 = f112;
            if (!z10) {
            }
            if (this.t3 != null) {
            }
        } else {
            if (action == 1) {
                Runnable runnable2 = this.u3;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                    this.u3 = null;
                }
                if (this.x3) {
                    Y4(motionEvent.getX(), motionEvent.getY());
                    f5 f5Var3 = this.e4;
                    if (this.x3) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.x3 = false;
                    this.z3 = null;
                    this.A3 = null;
                    this.y3 = f5Var3 != null && f5Var3.getSelectedCells().size() > 1;
                    if (f5Var3 != null && !f5Var3.D.isEmpty()) {
                        F4(f5Var3);
                    }
                    this.t3 = null;
                    this.w3 = false;
                    return true;
                }
                if (!this.v3 && !this.w3) {
                    View view2 = this.t3;
                    if (view2 instanceof f5) {
                        if (j3((f5) view2, (int) ((motionEvent.getX() - r0.getLeft()) - getLeft()), (int) ((motionEvent.getY() - r0.getTop()) - getTop()))) {
                            this.t3 = null;
                            this.w3 = false;
                            return false;
                        }
                    }
                }
                if (!this.v3 && !this.w3 && (f5Var = this.e4) != null) {
                    View view3 = this.t3;
                    if (view3 == f5Var) {
                        f5 f5Var4 = (f5) view3;
                        TL_iv.pageTableCell m10 = f5Var4.m((int) ((motionEvent.getX() - f5Var4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - f5Var4.getTop()) - getTop()));
                        if (m10 != null) {
                            if (this.g4 >= 0 || this.h4 >= 0) {
                                M2();
                            } else {
                                LinkedHashSet linkedHashSet = f5Var4.D;
                                if (!linkedHashSet.remove(m10)) {
                                    linkedHashSet.add(m10);
                                }
                                f5Var4.v.invalidate();
                                f5Var4.t();
                            }
                        }
                    } else if (view3 != null) {
                        M2();
                    }
                }
                boolean z11 = this.v3;
                z41 z41Var = this.U2;
                ArrayList arrayList = this.h3;
                if (!z11 && !this.w3 && this.t3 == null && !c3Var.y() && this.e4 == null) {
                    float x10 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x10 >= getLeft() && x10 <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i12 = 0; i12 < getChildCount(); i12++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i12).getBottom() + getTop());
                        }
                        int B = org.telegram.messenger.l0.B(60.0f, view4.getHeight(), Math.max(Math.max(this.M3, this.K3), this.L3));
                        if (y11 >= paddingTop && y11 <= B) {
                            a aVar = arrayList.isEmpty() ? null : (a) j3.r0.j(1, arrayList);
                            if (aVar == null || !aVar.k.isEmpty() || E3(aVar.b) || aVar.i || x3(aVar) || K2(aVar.b)) {
                                b2 b2Var = this.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(aVar2);
                                z41Var.N(false);
                                b2 b2Var2 = this.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                post(new i2(this, aVar2, 19));
                            } else {
                                e3(aVar);
                            }
                        }
                    }
                }
                if (!this.v3 && !this.w3 && this.t3 == null && !c3Var.y() && this.e4 == null) {
                    float x11 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    if (this.N3 && x11 >= getLeft() && x11 <= getRight()) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= getChildCount()) {
                                i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                break;
                            }
                            View childAt2 = getChildAt(i13);
                            if (RecyclerView.R(childAt2) == 0) {
                                i9 = childAt2.getTop() + getTop();
                                break;
                            }
                            i13++;
                        }
                        if (i9 != Integer.MAX_VALUE) {
                            if (y12 >= AndroidUtilities.dp(60.0f) + getTop() && y12 <= i9) {
                                a aVar3 = arrayList.isEmpty() ? null : (a) arrayList.get(0);
                                if (aVar3 == null || E3(aVar3.b) || aVar3.i || x3(aVar3) || K2(aVar3.b)) {
                                    b2 b2Var3 = this.F3;
                                    if (b2Var3 != null) {
                                        b2Var3.d();
                                    }
                                    a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, aVar4);
                                    z41Var.N(false);
                                    b2 b2Var4 = this.F3;
                                    if (b2Var4 != null) {
                                        b2Var4.h();
                                    }
                                    post(new i2(this, aVar4, 16));
                                } else {
                                    f3(aVar3);
                                }
                            }
                        }
                    }
                }
                if (!this.v3 && !this.w3 && (this.t3 instanceof h4) && !c3Var.y() && this.e4 == null && (row = ((h4) this.t3).getRow()) != null) {
                    TL_iv.PageBlock pageBlock = row.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        p.T(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new eb0(23, this, pageblockmath), this.c3);
                    }
                }
                this.t3 = null;
                this.w3 = false;
                return false;
            }
            if (action == 2) {
                if (this.x3 && this.t3 == this.e4) {
                    Y4(motionEvent.getX(), motionEvent.getY());
                    this.v3 = true;
                    return true;
                }
                float x12 = motionEvent.getX() - this.r3;
                float y13 = motionEvent.getY() - this.s3;
                if ((y13 * y13) + (x12 * x12) > AndroidUtilities.dp(8.0f) * AndroidUtilities.dp(8.0f)) {
                    this.v3 = true;
                    Runnable runnable3 = this.u3;
                    if (runnable3 != null) {
                        removeCallbacks(runnable3);
                        this.u3 = null;
                        return false;
                    }
                }
            } else if (action == 3) {
                Runnable runnable4 = this.u3;
                if (runnable4 != null) {
                    removeCallbacks(runnable4);
                    this.u3 = null;
                }
                if (this.x3) {
                    M2();
                }
                this.t3 = null;
                this.w3 = false;
                return false;
            }
        }
        return false;
    }

    public final int i4(int i9) {
        Layout layout;
        View A4 = A4(i9);
        if (!(A4 instanceof s5) || (layout = ((s5) A4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage j2() {
        if (!k3()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> Z2 = Z2();
        if (Z2.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = Z2;
        richMessage.photos = B2();
        richMessage.documents = y2();
        return richMessage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d8, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j3(f5 f5Var, int i9, int i10) {
        w5 w5Var;
        w5 w5Var2;
        int p6 = f5Var.p(i9, i10);
        LinkedHashSet linkedHashSet = f5Var.D;
        h5 h5Var = f5Var.v;
        if (p6 >= 0) {
            int r10 = (h5Var.v() && p6 == h5Var.k()) ? h5Var.r() : p6;
            if (f5Var == this.e4 && (w5Var2 = f5Var.B) != null && p6 >= 0 && r10 >= p6 && r10 < w5Var2.b && !linkedHashSet.isEmpty()) {
                int i11 = p6;
                loop0: while (i11 <= r10) {
                    int i12 = 0;
                    while (true) {
                        w5 w5Var3 = f5Var.B;
                        if (i12 < w5Var3.c) {
                            if (!linkedHashSet.contains(w5Var3.d[i11][i12])) {
                                break loop0;
                            }
                            i12++;
                        }
                    }
                }
                F4(f5Var);
                return true;
            }
            g2(f5Var);
            w5 w5Var4 = f5Var.B;
            if (w5Var4 != null && p6 >= 0 && r10 >= p6 && r10 < w5Var4.b) {
                linkedHashSet.clear();
                for (int i13 = p6; i13 <= r10; i13++) {
                    int i14 = 0;
                    while (true) {
                        w5 w5Var5 = f5Var.B;
                        if (i14 < w5Var5.c) {
                            TL_iv.pageTableCell pagetablecell = w5Var5.d[i13][i14];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i14++;
                        }
                    }
                }
                h5Var.invalidate();
                f5Var.t();
            }
            this.g4 = p6;
            return true;
        }
        int n10 = f5Var.n(i9, i10);
        if (n10 < 0) {
            return false;
        }
        int q10 = (h5Var.u() && n10 == h5Var.j()) ? h5Var.q() : n10;
        if (f5Var == this.e4 && (w5Var = f5Var.B) != null && n10 >= 0 && q10 >= n10 && q10 < w5Var.c && !linkedHashSet.isEmpty()) {
            int i15 = n10;
            loop4: while (i15 <= q10) {
                int i16 = 0;
                while (true) {
                    w5 w5Var6 = f5Var.B;
                    if (i16 < w5Var6.b) {
                        if (!linkedHashSet.contains(w5Var6.d[i16][i15])) {
                            break loop4;
                        }
                        i16++;
                    }
                }
            }
            F4(f5Var);
            return true;
        }
        g2(f5Var);
        w5 w5Var7 = f5Var.B;
        if (w5Var7 != null && n10 >= 0 && q10 >= n10 && q10 < w5Var7.c) {
            linkedHashSet.clear();
            for (int i17 = n10; i17 <= q10; i17++) {
                int i18 = 0;
                while (true) {
                    w5 w5Var8 = f5Var.B;
                    if (i18 < w5Var8.b) {
                        TL_iv.pageTableCell pagetablecell2 = w5Var8.d[i18][i17];
                        if (pagetablecell2 != null) {
                            linkedHashSet.add(pagetablecell2);
                        }
                        i18++;
                    }
                }
            }
            h5Var.invalidate();
            f5Var.t();
        }
        this.h4 = n10;
        return true;
    }

    public final d1 j4(int i9) {
        View A4 = A4(i9);
        if (A4 instanceof s5) {
            return ((s5) A4).getAuthorEditText();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0091, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0088, code lost:
    
        r9 = r6;
        r14 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TL_iv.PageBlock k2(int i9, int i10, int i11, int i12, boolean z10, int[] iArr) {
        int i13;
        TL_iv.RichText richText;
        int i14;
        a aVar;
        TL_iv.RichText richText2;
        ArrayList arrayList;
        boolean z11;
        int i15 = i11;
        int i16 = i12;
        TL_iv.pageBlockOrderedList pageblockorderedlist = z10 ? new TL_iv.pageBlockOrderedList() : null;
        TL_iv.pageBlockList pageblocklist = z10 ? null : new TL_iv.pageBlockList();
        int i17 = i9;
        int i18 = 1;
        while (i17 < i15) {
            o3 o3Var = this;
            ArrayList arrayList2 = o3Var.h3;
            a aVar2 = (a) arrayList2.get(i17);
            if (aVar2.k.size() > i16 || (i13 = aVar2.c) < i10) {
                break;
            }
            if (i13 == i10) {
                if ((aVar2.d > 0) != z10) {
                    break;
                }
            }
            if (i13 > i10) {
                break;
            }
            boolean E3 = E3(aVar2.b);
            if (E3) {
                richText = null;
            } else {
                TL_iv.PageBlock pageBlock = aVar2.b;
                richText = pageBlock == null ? null : pageBlock.text;
                if (richText == null) {
                    richText = new TL_iv.textEmpty();
                }
            }
            int i19 = i17 + 1;
            ArrayList arrayList3 = new ArrayList();
            if (E3) {
                J2(arrayList3, aVar2);
            }
            while (true) {
                if (i19 >= i15) {
                    i14 = i19;
                    aVar = aVar2;
                    richText2 = richText;
                    arrayList = arrayList3;
                    break;
                }
                a aVar3 = (a) arrayList2.get(i19);
                if (aVar3.k.size() <= i16) {
                    aVar = aVar2;
                    int i20 = aVar3.c;
                    if (i20 < i10) {
                        break;
                    }
                    if (i20 != i10) {
                        if (aVar3.d > 0) {
                            richText2 = richText;
                            z11 = true;
                        } else {
                            richText2 = richText;
                            z11 = false;
                        }
                        ArrayList arrayList4 = arrayList3;
                        int[] iArr2 = {i19};
                        o3 o3Var2 = o3Var;
                        i14 = i19;
                        arrayList = arrayList4;
                        TL_iv.PageBlock k22 = o3Var2.k2(i14, i20, i15, i16, z11, iArr2);
                        if (k22 != null) {
                            arrayList.add(k22);
                        }
                        i19 = iArr2[0];
                        if (i19 <= i14) {
                            break;
                        }
                        o3Var = this;
                        i15 = i11;
                        i16 = i12;
                        richText = richText2;
                        aVar2 = aVar;
                        arrayList3 = arrayList;
                    } else {
                        if (!E3(aVar3.b)) {
                            break;
                        }
                        J2(arrayList3, aVar3);
                        i19++;
                        aVar2 = aVar;
                    }
                } else {
                    i14 = i19;
                    aVar = aVar2;
                    break;
                }
            }
            if (E3 || !arrayList.isEmpty()) {
                ArrayList<TL_iv.PageBlock> arrayList5 = new ArrayList<>();
                if (!E3) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = richText2;
                    arrayList5.add(pageblockparagraph);
                }
                arrayList5.addAll(arrayList);
                if (arrayList5.isEmpty()) {
                    i15 = i11;
                    i16 = i12;
                    i17 = i14;
                } else if (z10) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                    tL_pageListOrderedItemBlocks.num = ta.b.c(i18, ".");
                    tL_pageListOrderedItemBlocks.blocks = arrayList5;
                    tL_pageListOrderedItemBlocks.checkbox = aVar.e;
                    tL_pageListOrderedItemBlocks.checked = aVar.f;
                    pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                } else {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                    tL_pageListItemBlocks.blocks = arrayList5;
                    tL_pageListItemBlocks.checkbox = aVar.e;
                    tL_pageListItemBlocks.checked = aVar.f;
                    pageblocklist.items.add(tL_pageListItemBlocks);
                }
            } else if (z10) {
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                tL_pageListOrderedItemText.num = ta.b.c(i18, ".");
                tL_pageListOrderedItemText.text = richText2;
                tL_pageListOrderedItemText.checkbox = aVar.e;
                tL_pageListOrderedItemText.checked = aVar.f;
                pageblockorderedlist.items.add(tL_pageListOrderedItemText);
            } else {
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                tL_pageListItemText.text = richText2;
                tL_pageListItemText.checkbox = aVar.e;
                tL_pageListItemText.checked = aVar.f;
                pageblocklist.items.add(tL_pageListItemText);
            }
            i18++;
            i15 = i11;
            i16 = i12;
            i17 = i14;
        }
        iArr[0] = i17;
        if (z10) {
            if (!pageblockorderedlist.items.isEmpty()) {
                return pageblockorderedlist;
            }
        } else if (!pageblocklist.items.isEmpty()) {
            return pageblocklist;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockDocument) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k3() {
        int i9 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.h3;
            if (i9 >= arrayList.size()) {
                return false;
            }
            a aVar = (a) arrayList.get(i9);
            if (!s5.z(aVar.b).isEmpty()) {
                break;
            }
            if (!D3(aVar.b)) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if (!(pageBlock instanceof TL_iv.pageBlockAudio)) {
                }
            }
            for (s sVar : Q3(aVar)) {
                if (sVar.b() || sVar.a()) {
                    break loop0;
                }
            }
            TL_iv.PageBlock pageBlock2 = aVar.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock2).source)) {
                break;
            }
            TL_iv.PageBlock pageBlock3 = aVar.b;
            if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                int i10 = f4.I;
                if (((TL_iv.pageBlockMap) pageBlock3).geo instanceof TLRPC.TL_geoPoint) {
                    return true;
                }
            }
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && O4((TL_iv.pageBlockTable) pageBlock3)) {
                break;
            }
            TL_iv.PageBlock pageBlock4 = aVar.b;
            if ((pageBlock4 instanceof TL_iv.pageBlockButtonRow) && !((TL_iv.pageBlockButtonRow) pageBlock4).buttons.isEmpty()) {
                break;
            }
            i9++;
        }
        return true;
    }

    public final boolean l2() {
        d1 editText;
        int length;
        int w8;
        int d;
        c3 c3Var = this.j3;
        if (c3Var == null || !c3Var.y() || c3Var.u0 != c3Var.x0) {
            return false;
        }
        if (L3()) {
            int i9 = c3Var.u0;
            int i10 = c3Var.v0;
            if (i10 != c3Var.y0) {
                return false;
            }
            editText = N4(i9, i10);
        } else if (y3()) {
            editText = I2(c3Var.u0);
        } else if (w3()) {
            editText = s2(c3Var.u0);
        } else if (G3()) {
            editText = j4(c3Var.u0);
        } else {
            s5 G4 = G4();
            if (G4 == null) {
                return false;
            }
            editText = G4.getEditText();
        }
        if (editText == null || (w8 = org.telegram.ui.Cells.j2.w(c3Var.w0, c3Var.z0, (length = editText.length()), 0)) >= (d = org.telegram.ui.Cells.j2.d(c3Var.w0, c3Var.z0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && w8 < d) {
            for (b4 b4Var : (b4[]) text.getSpans(w8, d, b4.class)) {
                if (text.getSpanStart(b4Var) < d && text.getSpanEnd(b4Var) > w8) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean m2() {
        int[] D4 = D4();
        if (D4 == null) {
            return n2(D2());
        }
        for (int i9 = D4[0]; i9 <= D4[1]; i9++) {
            if (n2((a) this.h3.get(i9))) {
                return true;
            }
        }
        return false;
    }

    public final boolean m3() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h3;
            if (i9 >= arrayList.size()) {
                return false;
            }
            Iterator it = Q3((a) arrayList.get(i9)).iterator();
            while (it.hasNext()) {
                if (((s) it.next()).a()) {
                    return true;
                }
            }
            i9++;
        }
    }

    public final boolean m4(int i9, int i10, boolean z10) {
        boolean z11;
        if (i9 >= 0 && i10 >= i9) {
            ArrayList arrayList = this.h3;
            if (i10 < arrayList.size()) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i10 >= i9) {
                        if (q3(i10, true, true)) {
                            z11 = true;
                        }
                        i10--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i9);
                    if (aVar.c >= 1 && (i9 == 0 || ((a) arrayList.get(i9 - 1)).c < aVar.c)) {
                        return false;
                    }
                    z11 = false;
                    while (i9 <= i10) {
                        if (q3(i9, false, true)) {
                            z11 = true;
                        }
                        i9++;
                    }
                }
                if (z11) {
                    s4();
                    if (findFocus() instanceof d1) {
                        X1();
                    } else {
                        this.U2.N(false);
                    }
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean n2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.h3).indexOf(aVar)) < 0 || indexOf < 0 || indexOf >= arrayList.size()) {
            return false;
        }
        a aVar2 = (a) arrayList.get(indexOf);
        if (aVar2.c == 0) {
            TL_iv.PageBlock pageBlock = aVar2.b;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !o2(indexOf)) {
                return false;
            }
        } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).c < aVar2.c) {
            return false;
        }
        return p3(indexOf);
    }

    public final void n3() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            KeyEvent.Callback childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                s5 s5Var = (s5) childAt;
                s5Var.f.hideActionMode();
                s5Var.h.hideActionMode();
            } else if (childAt instanceof f5) {
                f5 f5Var = (f5) childAt;
                h5 h5Var = f5Var.v;
                f5Var.r.hideActionMode();
                for (int i10 = 0; i10 < h5Var.getChildCount(); i10++) {
                    View childAt2 = h5Var.getChildAt(i10);
                    if (childAt2 instanceof i5) {
                        ((i5) childAt2).a.hideActionMode();
                    }
                }
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof q0) {
                ((q0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void n4(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof l4) {
            l4 l4Var = (l4) z12;
            ArrayList arrayList = l4Var.y;
            if (l4Var.a == null) {
                return;
            }
            l4Var.n();
            if (l4Var.S >= arrayList.size()) {
                l4Var.S = Math.max(0, arrayList.size() - 1);
            }
            l4Var.o(false);
            l4Var.requestLayout();
            l4Var.invalidate();
        }
    }

    public final boolean o2(int i9) {
        if (i9 <= 0) {
            return false;
        }
        ArrayList arrayList = this.h3;
        return i9 < arrayList.size() && E3(((a) arrayList.get(i9)).b) && ((a) arrayList.get(i9 - 1)).c >= 1;
    }

    public final void o3(boolean z10) {
        c3 c3Var = this.j3;
        if (c3Var != null) {
            if (z10) {
                c3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(c3Var.r0);
                c3Var.v();
            }
        }
        if (z10) {
            V2();
        } else {
            n3();
        }
    }

    public final void o4() {
        post(new b(this, 3));
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.I3);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.I3);
        this.W2 = false;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i12 - i10;
        int i14 = this.G3;
        boolean z11 = i14 > 0 && i13 < i14;
        super.onLayout(z10, i9, i10, i11, i12);
        if (z11) {
            View findFocus = findFocus();
            View F = findFocus == null ? null : F(findFocus);
            if (F != null) {
                int dp = (AndroidUtilities.dp(8.0f) + F.getBottom()) - (i13 - getPaddingBottom());
                if (dp > 0) {
                    post(new d2(this, dp, 2));
                }
            }
        }
        this.G3 = i13;
    }

    public final boolean p2() {
        int[] D4 = D4();
        if (D4 == null) {
            return q2(D2());
        }
        for (int i9 = D4[0]; i9 <= D4[1]; i9++) {
            if (q2((a) this.h3.get(i9))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3(int i9) {
        return ((a) this.h3.get(i9)).c + 1 <= MessagesController.getInstance(this.b3).config.richMessageMaxDepth.get() + (-6);
    }

    public final void p4(int i9) {
        ArrayList arrayList = this.h3;
        int min = Math.min(arrayList.size() - 1, i9 + 1);
        for (int max = Math.max(0, i9 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.c > 0) {
                View z12 = z1(aVar);
                if (z12 instanceof s5) {
                    ((s5) z12).F();
                }
            }
        }
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        return aVar != null && (indexOf = (arrayList = this.h3).indexOf(aVar)) >= 0 && aVar.c > 0 && indexOf >= 0 && indexOf < arrayList.size() && ((a) arrayList.get(indexOf)).c > 0;
    }

    public final boolean q3(int i9, boolean z10, boolean z11) {
        int i10 = 0;
        if (i9 >= 0) {
            ArrayList arrayList = this.h3;
            if (i9 < arrayList.size()) {
                a aVar = (a) arrayList.get(i9);
                if (z10) {
                    if (aVar.c > 0) {
                        t2(i9);
                        return true;
                    }
                } else if (aVar.c == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    boolean z12 = (pageBlock instanceof TL_iv.pageBlockParagraph) || C3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z12 || o2(i9)) && p3(i9)) {
                        a aVar2 = i9 > 0 ? (a) arrayList.get(i9 - 1) : null;
                        if (!z12) {
                            aVar.c = aVar2.c;
                            aVar.d = aVar2.d > 0 ? 1 : 0;
                            aVar.e = false;
                            aVar.f = false;
                            return true;
                        }
                        aVar.c = 1;
                        if (aVar2 != null && aVar2.d > 0) {
                            i10 = 1;
                        }
                        aVar.d = i10;
                        return true;
                    }
                } else if ((z11 || (i9 != 0 && ((a) arrayList.get(i9 - 1)).c >= aVar.c)) && p3(i9)) {
                    aVar.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void q4(a aVar, s sVar) {
        if (aVar == null) {
            return;
        }
        if (!B3(aVar.b)) {
            r4(aVar);
            return;
        }
        ArrayList g32 = g3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(sVar) : -1;
        if (indexOf >= 0) {
            aVar.h.remove(indexOf);
            if (g32 != null && indexOf < g32.size()) {
                g32.remove(indexOf);
            }
        }
        if (aVar.h.isEmpty()) {
            r4(aVar);
            return;
        }
        int size = aVar.h.size();
        z41 z41Var = this.U2;
        if (size != 1) {
            z41Var.N(true);
            n4(aVar);
            return;
        }
        TL_iv.PageCaption pageCaption = aVar.b.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) g32.get(0);
        aVar.b = pageBlock;
        pageBlock.caption = pageCaption;
        aVar.g = (s) aVar.h.get(0);
        aVar.h = null;
        z41Var.N(true);
        n4(aVar);
    }

    public final boolean r2() {
        b2 b2Var = this.F3;
        if (b2Var != null) {
            return b2Var.e || !b2Var.b.isEmpty();
        }
        return false;
    }

    public final void r3(boolean z10) {
        int i9;
        int i10;
        int[] D4 = D4();
        if (D4 != null && (i9 = D4[0]) != (i10 = D4[1])) {
            m4(i9, i10, z10);
            return;
        }
        a D2 = D4 == null ? D2() : (a) this.h3.get(D4[0]);
        if (D2 != null) {
            W3(D2, z10);
        }
    }

    public final void r4(a aVar) {
        ArrayList arrayList = this.h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.U2.N(true);
        }
    }

    public final d1 s2(int i9) {
        KeyEvent.Callback A4 = A4(i9);
        if (A4 instanceof i0) {
            return ((i0) A4).getCaptionEditText();
        }
        return null;
    }

    public final void s3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.k;
        int size = arrayList3.size();
        int i9 = 0;
        while (i9 < size && i9 < arrayList.size() && ((Long) arrayList3.get(i9)).equals(arrayList.get(i9))) {
            i9++;
        }
        for (int i10 = size - 1; i10 >= i9; i10--) {
            Long l10 = (Long) arrayList3.get(i10);
            long longValue = l10.longValue();
            Integer num = (Integer) hashMap.get(l10);
            if (num != null && (num.intValue() >= 2 || i10 != 0 || this.i3.containsKey(l10))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.t = longValue;
                for (int i11 = 0; i11 <= i10; i11++) {
                    aVar2.k.add((Long) arrayList3.get(i11));
                }
                int i12 = w4.a;
                l41 J = l41.J(w4.class);
                J.G = aVar2;
                J.H = this.b4;
                arrayList2.add(J);
                this.l4.add(aVar2);
            }
        }
    }

    public final void s4() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h3;
            if (i9 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i9);
            if (aVar.c > 0 && aVar.d > 0 && !E3(aVar.b)) {
                int i10 = aVar.c;
                int i11 = 1;
                for (int i12 = i9 - 1; i12 >= 0; i12--) {
                    a aVar2 = (a) arrayList.get(i12);
                    int i13 = aVar2.c;
                    if (i13 < i10) {
                        break;
                    }
                    if (i13 == i10 && !E3(aVar2.b)) {
                        if (aVar2.d <= 0) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                aVar.d = i11;
            }
            i9++;
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.N3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.e3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.J3 = new ArrayList();
        ArrayList arrayList = this.h3;
        W2(arrayList, t4.b(charSequence), this.i3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.J3.add((a) arrayList.get(size));
        }
        this.U2.N(false);
    }

    public final void t2(int i9) {
        a aVar;
        int i10;
        ArrayList arrayList = this.h3;
        a aVar2 = (a) arrayList.get(i9);
        int i11 = aVar2.c;
        if (i11 <= 0) {
            return;
        }
        int i12 = i11 - 1;
        aVar2.c = i12;
        if (i12 == 0) {
            aVar2.d = 0;
            aVar2.e = false;
            aVar2.f = false;
        }
        while (true) {
            i9++;
            if (i9 >= arrayList.size() || (i10 = (aVar = (a) arrayList.get(i9)).c) <= i11) {
                return;
            } else {
                aVar.c = i10 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t3() {
        b2 b2Var;
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.d();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        a aVar = new a(pageblockdetails, 0, 0);
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar3.i = true;
        a Q2 = Q2();
        ArrayList arrayList = this.h3;
        int indexOf = Q2 != null ? arrayList.indexOf(Q2) : -1;
        if (Q2 != null) {
            TL_iv.PageBlock pageBlock = Q2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && Q2.g == null && !Q2.i && s5.z(pageBlock).isEmpty()) {
                arrayList.remove(indexOf);
                arrayList.add(indexOf, aVar3);
                arrayList.add(indexOf, aVar2);
                arrayList.add(indexOf, aVar);
                this.U2.N(false);
                b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.h();
                }
                post(new i2(this, aVar, 20));
            }
        }
        indexOf = indexOf >= 0 ? indexOf + 1 : arrayList.size();
        arrayList.add(indexOf, aVar3);
        arrayList.add(indexOf, aVar2);
        arrayList.add(indexOf, aVar);
        this.U2.N(false);
        b2Var = this.F3;
        if (b2Var != null) {
        }
        post(new i2(this, aVar, 20));
    }

    public final void t4(String str) {
        c3 c3Var = this.j3;
        W1(c3Var.u0, c3Var.w0, c3Var.x0, c3Var.z0, str.split("\n", -1));
    }

    public final s5 u2(int i9) {
        if (i9 < 0) {
            return null;
        }
        View m10 = this.T2.m(i9);
        if (m10 instanceof s5) {
            return (s5) m10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u3(a aVar) {
        boolean z10;
        int indexOf;
        int indexOf2;
        ArrayList arrayList = aVar.k;
        a Q2 = Q2();
        if (Q2 == null) {
            Q2 = this.Y3;
        }
        ArrayList arrayList2 = this.h3;
        int indexOf3 = Q2 != null ? arrayList2.indexOf(Q2) : -1;
        if (indexOf3 < 0 || !(Q2.b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = false;
        } else {
            long a2 = m0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) Q2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.i3.put(Long.valueOf(a2), richText);
            }
            Q2.k.add(Long.valueOf(a2));
            Q2.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        }
        boolean z11 = indexOf3 >= 0 && !Q2.k.isEmpty();
        if (z11) {
            arrayList.clear();
            arrayList.addAll(Q2.k);
        }
        if (indexOf3 >= 0) {
            TL_iv.PageBlock pageBlock = Q2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && Q2.g == null && s5.z(pageBlock).isEmpty()) {
                arrayList2.set(indexOf3, aVar);
                this.Y3 = aVar;
                indexOf = arrayList2.indexOf(aVar);
                if (indexOf < arrayList2.size() - 1 || E3(((a) arrayList2.get(indexOf + 1)).b)) {
                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                    if (z11) {
                        aVar2.k.addAll(arrayList);
                    }
                    arrayList2.add(indexOf + 1, aVar2);
                }
                this.U2.N(!z10);
                indexOf2 = arrayList2.indexOf(aVar) + 1;
                if (indexOf2 > 0 || indexOf2 >= arrayList2.size() || E3(((a) arrayList2.get(indexOf2)).b)) {
                    return;
                }
                post(new i2(this, (a) arrayList2.get(indexOf2), 17));
                return;
            }
        }
        if (indexOf3 >= 0) {
            arrayList2.add(indexOf3 + 1, aVar);
        } else {
            arrayList2.add(aVar);
        }
        this.Y3 = aVar;
        indexOf = arrayList2.indexOf(aVar);
        if (indexOf < arrayList2.size() - 1) {
        }
        a aVar22 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        if (z11) {
        }
        arrayList2.add(indexOf + 1, aVar22);
        this.U2.N(!z10);
        indexOf2 = arrayList2.indexOf(aVar) + 1;
        if (indexOf2 > 0) {
        }
    }

    public final s u4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document S2 = S2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (S2 == null) {
                return null;
            }
            s sVar = new s();
            sVar.c = true;
            sVar.a = 2;
            sVar.h = S2;
            sVar.i = S2;
            return sVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document S22 = S2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (S22 == null) {
                return null;
            }
            s sVar2 = new s();
            sVar2.d = true;
            sVar2.a = 2;
            sVar2.h = S22;
            return sVar2;
        }
        int i9 = 0;
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document S23 = S2(pageblockvideo.video_id);
            if (S23 == null) {
                return null;
            }
            s sVar3 = new s();
            sVar3.b = true;
            sVar3.a = 2;
            sVar3.h = S23;
            sVar3.n = pageblockvideo.spoiler;
            while (i9 < S23.attributes.size()) {
                if (S23.attributes.get(i9) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) S23.attributes.get(i9);
                    sVar3.j = tL_documentAttributeVideo.w;
                    sVar3.k = tL_documentAttributeVideo.h;
                    return sVar3;
                }
                i9++;
            }
            return sVar3;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
            return null;
        }
        TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
        long j10 = pageblockphoto.photo_id;
        if (j10 == 0) {
            photo = null;
        } else {
            int i10 = 0;
            loop1: while (true) {
                if (i10 < this.h3.size()) {
                    for (s sVar4 : Q3((a) this.h3.get(i10))) {
                        if (sVar4 != null && (photo = sVar4.g) != null && photo.id == j10) {
                            break loop1;
                        }
                    }
                    i10++;
                } else {
                    TL_iv.RichMessage richMessage = this.g3;
                    if (richMessage != null && (arrayList = richMessage.photos) != null) {
                        int size = arrayList.size();
                        while (i9 < size) {
                            TLRPC.Photo photo2 = arrayList.get(i9);
                            i9++;
                            photo = photo2;
                            if (photo != null && photo.id == j10) {
                                break;
                            }
                        }
                    }
                    HashMap hashMap = m4.a;
                    synchronized (m4.class) {
                        photo = j10 == 0 ? null : (TLRPC.Photo) m4.a.get(Long.valueOf(j10));
                    }
                }
            }
        }
        if (photo == null) {
            return null;
        }
        s sVar5 = new s();
        sVar5.a = 2;
        sVar5.g = photo;
        sVar5.n = pageblockphoto.spoiler;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            sVar5.j = closestPhotoSizeWithSize.w;
            sVar5.k = closestPhotoSizeWithSize.h;
        }
        return sVar5;
    }

    public final void v2() {
        G2();
        this.g3 = null;
        this.X3 = null;
        this.Y3 = null;
        this.F3 = new b2(this.k4);
        z4();
        this.F3.j();
        m3 m3Var = this.d3;
        if (m3Var != null) {
            m3Var.N1();
        }
    }

    public final void v4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.g3 == null || aVar == null || (pageBlock = aVar.b) == null) {
            return;
        }
        if (!B3(pageBlock)) {
            s u42 = u4(aVar.b);
            if (u42 != null) {
                aVar.g = u42;
                return;
            }
            return;
        }
        ArrayList g32 = g3(aVar.b);
        aVar.h = new ArrayList();
        if (g32 != null) {
            for (int i9 = 0; i9 < g32.size(); i9++) {
                s u43 = u4((TL_iv.PageBlock) g32.get(i9));
                ArrayList arrayList = aVar.h;
                if (u43 == null) {
                    u43 = new s();
                }
                arrayList.add(u43);
            }
        }
    }

    public final boolean w3() {
        int i9;
        c3 c3Var = this.j3;
        if (c3Var == null || !c3Var.y() || (i9 = c3Var.u0) != c3Var.x0 || i9 < 0 || i9 >= this.l4.size()) {
            return false;
        }
        return A4(i9) instanceof i0;
    }

    public final ArrayList w4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            a aVar = (a) obj;
            if (B3(aVar.b)) {
                ArrayList g32 = g3(aVar.b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (g32 != null) {
                    int size2 = g32.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = g32.get(i10);
                        i10++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        s u42 = u4(pageBlock);
                        if (u42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(u42);
                        }
                    }
                    g32.clear();
                    g32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.b;
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio) || (pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    s u43 = u4(pageBlock2);
                    if (u43 != null) {
                        aVar.g = u43;
                        arrayList2.add(aVar);
                    }
                } else {
                    arrayList2.add(aVar);
                }
            }
        }
        return arrayList2;
    }

    public final boolean x2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i9 = 0;
        while (true) {
            arrayList = this.h3;
            if (i9 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i9);
            boolean z10 = aVar.i;
            ArrayList arrayList2 = aVar.k;
            if (!z10) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Map.-EL.merge(hashMap, (Long) arrayList2.get(i10), 1, new p2());
                }
            }
            i9++;
        }
        boolean z11 = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a aVar2 = (a) arrayList.get(i11);
            ArrayList arrayList3 = aVar2.k;
            if (arrayList3.size() == 1 && (aVar2.b instanceof TL_iv.pageBlockParagraph)) {
                Long l10 = (Long) arrayList3.get(0);
                l10.getClass();
                Integer num = (Integer) hashMap.get(l10);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.i3.remove(l10);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void x4() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            KeyEvent.Callback childAt = getChildAt(i9);
            if (childAt instanceof c4) {
                y yVar = (y) ((c4) childAt);
                yVar.b.a(yVar.a, new kh.p(yVar, 20));
            }
        }
        invalidate();
    }

    public final ArrayList y2() {
        TLRPC.Document document;
        s sVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.h3;
            if (i9 >= arrayList2.size()) {
                return arrayList;
            }
            a aVar = (a) arrayList2.get(i9);
            if ((aVar.b instanceof TL_iv.pageBlockDocument) && (sVar = aVar.g) != null && sVar.b() && (document2 = aVar.g.h) != null) {
                ((TL_iv.pageBlockDocument) aVar.b).document_id = document2.id;
            }
            for (s sVar2 : Q3(aVar)) {
                if (sVar2.b() && (document = sVar2.h) != null) {
                    long j10 = document.id;
                    if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                        arrayList.add(sVar2.h);
                    }
                }
            }
            i9++;
        }
    }

    public final boolean y3() {
        int i9;
        c3 c3Var = this.j3;
        return c3Var != null && c3Var.y() && (i9 = c3Var.u0) == c3Var.x0 && x3(y4(i9));
    }

    public final a y4(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.l4;
        if (i9 < arrayList.size()) {
            return (a) arrayList.get(i9);
        }
        return null;
    }

    public final ArrayList z2(int i9, int i10) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i9 <= i10) {
            ArrayList arrayList2 = this.h3;
            if (i9 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i9))) {
                if (sVar.b() && (document = sVar.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(sVar.h);
                }
            }
            i9++;
        }
        return arrayList;
    }

    public final void z4() {
        ArrayList arrayList = this.h3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.U2.N(false);
    }
}
