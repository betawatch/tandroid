// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class y04 extends c79 {
    public int E;
    public int F;
    public final /* synthetic */ o24 G;
    public ArrayList h;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public final ArrayList n = new ArrayList();
    public final SparseIntArray r = new SparseIntArray();
    public final SparseIntArray s = new SparseIntArray();
    public final SparseIntArray w = new SparseIntArray();
    public final SparseIntArray x = new SparseIntArray();
    public final ArrayList y = new ArrayList();

    public y04(o24 o24Var) {
        this.G = o24Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 0 || i == 4 || i == 3 || i == 6;
    }

    public final void E(int i, View view) {
        o24 o24Var = this.G;
        ArrayList arrayList = o24Var.r1;
        int i2 = this.x.get(i);
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        c14 c14Var = (c14) arrayList.get(i2);
        if (c14Var.h) {
            return;
        }
        byte b = 0;
        boolean z = i2 + 1 == arrayList.size();
        int intValue = ((Integer) this.y.get(i2)).intValue();
        o24Var.p1.add(Long.valueOf(c14Var.b.id));
        boolean z2 = yac.h(o24Var.d1).p() || o24Var.V0;
        int i3 = o24Var.R.J * 3;
        int size = ((c14Var.f && !c14Var.g && (c14Var.e || z2)) || c14Var.h) ? c14Var.c.size() : Math.min(i3, c14Var.c.size());
        Integer num = null;
        Integer valueOf = c14Var.c.size() > i3 ? Integer.valueOf(intValue + 1 + size) : null;
        c14Var.h = true;
        int size2 = c14Var.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        o24Var.s2 = view;
        o24Var.t2 = valueOf.intValue();
        o24Var.u2 = num.intValue() + valueOf.intValue();
        o24Var.v2 = SystemClock.elapsedRealtime();
        p(valueOf.intValue(), num.intValue());
        g(valueOf.intValue());
        if (z) {
            o24Var.post(new x04(this, num.intValue() > i3 / 2 ? 1.5f : 4.0f, valueOf.intValue(), b));
        }
    }

    public final void F(boolean z) {
        o24 o24Var = this.G;
        ArrayList arrayList = o24Var.o1;
        if (o24Var.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        ls6 d0 = ls6.d0(o24Var.d1);
        ArrayList arrayList3 = d0.t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i);
            if (!d0.D0(stickerSetCovered.set.id, true) || o24Var.q1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z);
        H();
        m24 m24Var = o24Var.U;
        if (m24Var != null) {
            m24Var.f();
        }
        cy7.a(new ak3(this, arrayList2, (byte) 1), false).c(this);
    }

    public final void G(boolean z) {
        ArrayList arrayList;
        boolean z2;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a0;
        o24 o24Var = this.G;
        ArrayList arrayList2 = o24Var.o1;
        ArrayList arrayList3 = o24Var.p1;
        int i = o24Var.d1;
        ArrayList arrayList4 = o24Var.r1;
        arrayList4.clear();
        if (o24Var.d2) {
            ls6 d0 = ls6.d0(i);
            if (z || (arrayList = this.h) == null) {
                arrayList = new ArrayList(d0.t0(5));
                this.h = arrayList;
            }
            boolean z3 = yac.h(i).p() || o24Var.V0;
            TLRPC.ChatFull chatFull = o24Var.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a0 = d0.a0(stickerSet)) != null) {
                c14 c14Var = new c14();
                c14Var.b = o24Var.K1.emojiset;
                c14Var.c = new ArrayList(a0.documents);
                c14Var.e = true;
                c14Var.f = true;
                c14Var.g = false;
                c14Var.h = true;
                c14Var.i = true;
                arrayList4.add(c14Var);
                TLRPC.StickerSet stickerSet2 = c14Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i2);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.id == stickerSet2.id) {
                        arrayList.remove(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (!z3) {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                    if (tL_messages_stickerSet2 != null && !r47.U3(tL_messages_stickerSet2)) {
                        c14 c14Var2 = new c14();
                        c14Var2.b = tL_messages_stickerSet2.set;
                        c14Var2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        c14Var2.e = true;
                        c14Var2.f = d0.D0(tL_messages_stickerSet2.set.id, true);
                        c14Var2.g = false;
                        c14Var2.h = true;
                        arrayList4.add(c14Var2);
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList.get(i4);
                if (z3) {
                    c14 c14Var3 = new c14();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    c14Var3.b = stickerSet3;
                    c14Var3.c = tL_messages_stickerSet3.documents;
                    c14Var3.e = false;
                    c14Var3.f = d0.D0(stickerSet3.id, true);
                    c14Var3.g = false;
                    c14Var3.h = true;
                    arrayList4.add(c14Var3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i5 = 0; i5 < tL_messages_stickerSet3.documents.size(); i5++) {
                            boolean m3 = r47.m3(tL_messages_stickerSet3.documents.get(i5));
                            ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet3.documents;
                            if (m3) {
                                arrayList5.add(arrayList7.get(i5));
                            } else {
                                arrayList6.add(arrayList7.get(i5));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        c14 c14Var4 = new c14();
                        c14Var4.b = tL_messages_stickerSet3.set;
                        c14Var4.c = new ArrayList(arrayList5);
                        c14Var4.e = true;
                        c14Var4.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        c14Var4.g = false;
                        c14Var4.h = true;
                        arrayList4.add(c14Var4);
                    }
                    if (arrayList6.size() > 0) {
                        c14 c14Var5 = new c14();
                        c14Var5.b = tL_messages_stickerSet3.set;
                        c14Var5.c = new ArrayList(arrayList6);
                        c14Var5.e = false;
                        c14Var5.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        c14Var5.g = false;
                        c14Var5.h = arrayList3.contains(Long.valueOf(c14Var5.b.id));
                        arrayList4.add(c14Var5);
                    }
                }
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i6);
                c14 c14Var6 = new c14();
                c14Var6.f = d0.D0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                c14Var6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    c14Var6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet m0 = d0.m0(ls6.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (m0 != null) {
                        c14Var6.c = m0.documents;
                    } else {
                        c14Var6.d = ls6.b0(stickerSetCovered.set);
                    }
                } else {
                    c14Var6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList8 = c14Var6.c;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= c14Var6.c.size()) {
                            z2 = false;
                            break;
                        } else {
                            if (!r47.m3((TLRPC.Document) c14Var6.c.get(i7))) {
                                z2 = true;
                                break;
                            }
                            i7++;
                        }
                    }
                    c14Var6.e = !z2;
                    c14Var6.h = arrayList3.contains(Long.valueOf(c14Var6.b.id));
                    c14Var6.g = true;
                    arrayList4.add(c14Var6);
                }
            }
            t04 t04Var = o24Var.J;
            if (t04Var != null) {
                t04Var.p(o24Var.getEmojipacks());
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v28 boolean, still in use, count: 3, list:
          (r11v28 boolean) from 0x00d9: IF  (r11v28 boolean) == true  -> B:29:0x00dd A[HIDDEN] (LINE:218)
          (r11v28 boolean) from 0x00e5: IF  (r11v28 boolean) == true  -> B:41:0x00e9 A[HIDDEN] (LINE:230)
          (r11v28 boolean) from 0x00fe: IF  (r11v28 boolean) == true  -> B:32:0x0100 A[HIDDEN] (LINE:255)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125 A[LOOP:0: B:43:0x011e->B:45:0x0125, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146 A[EDGE_INSN: B:46:0x0146->B:47:0x0146 BREAK  A[LOOP:0: B:43:0x011e->B:45:0x0125], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d A[EDGE_INSN: B:56:0x019d->B:57:0x019d BREAK  A[LOOP:1: B:48:0x0148->B:55:0x0198], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y04.H():void");
    }

    @Override // j79
    public final int b() {
        return this.E;
    }

    @Override // j79
    public final long c(int i) {
        return i;
    }

    @Override // j79
    public final int d(int i) {
        if (i == this.d) {
            return 4;
        }
        if (i == this.c || i == this.f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.r;
        if (sparseIntArray.indexOfKey(i) >= 0) {
            int i2 = sparseIntArray.get(i);
            char[] cArr = jx3.a;
            return i2 >= 8 ? 5 : 1;
        }
        if (this.G.e0 && i == 0) {
            return 2;
        }
        if (this.w.indexOfKey(i) >= 0) {
            return 3;
        }
        return this.x.indexOfKey(i) >= 0 ? 6 : 0;
    }

    @Override // j79
    public final void f() {
        F(false);
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        String str;
        String str2;
        Long l;
        TLRPC.Document document;
        int i2;
        int i3 = i;
        o24 o24Var = this.G;
        String[] strArr = o24Var.b1;
        p04 p04Var = o24Var.R;
        int i4 = o24Var.d1;
        ArrayList arrayList = o24Var.r1;
        int i5 = f89Var.f;
        View view = f89Var.a;
        boolean z = true;
        c14 c14Var = null;
        if (i5 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i5 == 1) {
                u3b u3bVar = (u3b) view;
                u3bVar.getClass();
                int i6 = sparseIntArray.get(i3);
                if (i3 == this.c) {
                    u3bVar.b(ob6.M0(2131750800, null), R.drawable.msg_close, ob6.M0(2131754895, null), 0, 0);
                    return;
                }
                if (i3 == this.f) {
                    u3bVar.a(0, ob6.M0(2131746088, null));
                    return;
                } else {
                    if (i6 < strArr.length) {
                        u3bVar.a(0, strArr[i6]);
                        return;
                    }
                    try {
                        u3bVar.a(0, ((c14) arrayList.get(i6 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        u3bVar.a(0, "");
                        return;
                    }
                }
            }
            byte b = 6;
            byte b2 = 5;
            if (i5 != 5) {
                if (i5 == 6) {
                    e14 e14Var = (e14) view;
                    int i7 = this.x.get(i3);
                    int i8 = p04Var.J * 3;
                    if (i7 >= 0 && i7 < arrayList.size()) {
                        c14Var = (c14) arrayList.get(i7);
                    }
                    if (c14Var != null) {
                        e14Var.a.setText("+" + ((c14Var.c.size() - i8) + 1));
                        return;
                    }
                    return;
                }
                return;
            }
            g14 g14Var = (g14) view;
            int length = sparseIntArray.get(i3) - strArr.length;
            c14 c14Var2 = (c14) arrayList.get(length);
            int i9 = length - 1;
            c14 c14Var3 = i9 >= 0 ? (c14) arrayList.get(i9) : null;
            if (c14Var2 == null || !c14Var2.g || (c14Var3 != null && !c14Var3.e && c14Var3.f && !yac.h(i4).p())) {
                z = false;
            }
            if (c14Var2 != null && c14Var2.d != null) {
                ls6.d0(i4).n0(c14Var2.d, false);
                c14Var2.d = null;
            }
            ok8 ok8Var = g14Var.r;
            if (c14Var2 != null) {
                g14Var.x = c14Var2;
                g14Var.y = z;
                g14Var.d.l(c14Var2.b.title, false);
                g14Var.e.setVisibility(c14Var2.i ? 0 : 8);
                if (!c14Var2.f || c14Var2.b.official) {
                    ok8Var.b(ob6.M0(2131743531, null), new f14(g14Var, b), false);
                } else {
                    ok8Var.b(ob6.M0(2131745809, null), new f14(g14Var, b2), false);
                }
                g14Var.a(false);
                return;
            }
            return;
        }
        x14 x14Var = (x14) view;
        x14Var.a = i3;
        x14Var.e = null;
        if (o24Var.e0) {
            i3--;
        }
        if (this.f >= 0) {
            i3--;
        }
        if (this.d >= 0) {
            i3 -= 2;
        }
        int size = o24Var.getRecentEmoji().size();
        if (i3 < size) {
            String str3 = o24Var.getRecentEmoji().get(i3);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l = null;
            str2 = str;
            document = null;
        } else {
            int i10 = 0;
            while (true) {
                String[][] strArr2 = jx3.f;
                if (i10 >= 8) {
                    str = null;
                    break;
                }
                String[] strArr3 = strArr2[i10];
                int length2 = strArr3.length + 1;
                int i11 = (i3 - size) - 1;
                if (i11 < 0 || i3 >= size + length2) {
                    size += length2;
                    i10++;
                } else {
                    str = strArr3[i11];
                    String str4 = (String) pv3.j.get(str);
                    if (str4 != null) {
                        String c = o24.c(str, str4);
                        str2 = str;
                        str = c;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean p = yac.h(i4).p();
                int i12 = p04Var.J * 3;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    c14 c14Var4 = (c14) arrayList.get(i13);
                    int intValue = ((Integer) arrayList2.get(i13)).intValue() + 1;
                    int size2 = ((c14Var4.f && !c14Var4.g && (c14Var4.e || p)) || c14Var4.h) ? c14Var4.c.size() : Math.min(i12, c14Var4.c.size());
                    int i14 = x14Var.a;
                    if (i14 < intValue || (i2 = i14 - intValue) >= size2) {
                        i13++;
                    } else {
                        x14Var.e = c14Var4;
                        TLRPC.Document document2 = (TLRPC.Document) c14Var4.c.get(i2);
                        document = document2;
                        l = document2 == null ? null : Long.valueOf(document2.id);
                    }
                }
            }
            l = null;
            document = null;
            z = false;
        }
        if (l != null) {
            x14Var.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
            x14Var.a(null, z);
            if (x14Var.getSpan() == null || x14Var.getSpan().getDocumentId() != l.longValue()) {
                if (document != null) {
                    x14Var.setSpan(new hm(document, (Paint.FontMetricsInt) null));
                } else {
                    x14Var.setSpan(new hm(l.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            x14Var.setPadding(0, 0, 0, 0);
            x14Var.a(pv3.f(str), z);
            x14Var.setSpan(null);
        }
        x14Var.setTag(str2);
        x14Var.setContentDescription(str);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        o24 o24Var = this.G;
        if (i == 0) {
            view = new x14(o24Var.getContext());
        } else if (i == 1) {
            u3b u3bVar = new u3b(o24Var.getContext(), true, false, o24Var.a2, o24Var.j2);
            u3bVar.setOnIconClickListener(new mh3(this, (byte) 7));
            view = u3bVar;
        } else if (i == 3) {
            view = new d14(o24Var, o24Var.getContext());
        } else if (i == 4) {
            Context context = o24Var.getContext();
            m24 m24Var = new m24(o24Var, true);
            o24Var.U = m24Var;
            gu guVar = new gu(o24Var, context, m24Var);
            guVar.setPadding(hl.L(8.0f), hl.L(4.0f), hl.L(8.0f), 0);
            guVar.setClipToPadding(false);
            guVar.i(new br1((byte) 2));
            guVar.setOnItemClickListener(new u(this, (byte) 24));
            view = guVar;
        } else if (i == 5) {
            view = new g14(o24Var, o24Var.getContext());
        } else if (i != 6) {
            View view2 = new View(o24Var.getContext());
            view2.setLayoutParams(new r79(-1, o24Var.c1));
            view = view2;
        } else {
            Context context2 = o24Var.getContext();
            vnb vnbVar = o24Var.a2;
            e14 e14Var = new e14(context2);
            TextView textView = new TextView(context2);
            e14Var.a = textView;
            textView.setTextSize(1, 13.0f);
            yob.X(textView, aob.d6, vnbVar);
            int L = hl.L(11.0f);
            int i2 = aob.Lf;
            ShapeDrawable b0 = aob.b0(L, vm2.o(aob.v0(i2, vnbVar), 99));
            uob g = yob.g(i2, 99);
            textView.setBackground(b0);
            yob.j(textView, b0, g, null, vnbVar);
            textView.setTypeface(hl.o());
            textView.setPadding(hl.L(6.0f), hl.L(1.66f), hl.L(6.0f), hl.L(2.0f));
            e14Var.addView(textView, tre.e(-2, -2, 17));
            view = e14Var;
        }
        return new n69(view);
    }
}
