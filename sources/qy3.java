// default package

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qy3 extends q59 {
    public final /* synthetic */ az3 c;

    public qy3(az3 az3Var) {
        this.c = az3Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 1;
    }

    public final int E(int i) {
        az3 az3Var = this.c;
        my3 my3Var = az3Var.o1;
        int i2 = az3Var.C1 ? 2 : 1;
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = my3Var.c;
            if (i3 >= arrayListArr.length || i3 == i) {
                break;
            }
            int size = arrayListArr[i3].size();
            if (my3Var.c.length > 1) {
                size = Math.min(az3Var.x1.J << 1, size);
            }
            i2 += size + 2;
            i3++;
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    @Override // y59
    public final int b() {
        int i;
        ArrayList arrayList;
        az3 az3Var = this.c;
        my3 my3Var = az3Var.o1;
        ?? r1 = (z8c.h(az3Var.a).p() || (arrayList = my3Var.b) == null || arrayList.size() != 1 || !k47.U3((TLRPC.TL_messages_stickerSet) my3Var.b.get(0))) ? 0 : 1;
        az3Var.C1 = r1;
        int i2 = r1 + 1;
        if (my3Var.c != null) {
            int i3 = 0;
            i = 0;
            while (true) {
                ArrayList[] arrayListArr = my3Var.c;
                if (i3 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i3];
                if (arrayList2 != null) {
                    i = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(my3Var.f.x1.J << 1, arrayList2.size())) + i + 1;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        return Math.max(0, my3Var.c.length - 1) + i2 + i;
    }

    @Override // y59
    public final int d(int i) {
        az3 az3Var = this.c;
        my3 my3Var = az3Var.o1;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        if (az3Var.C1) {
            if (i3 == 1) {
                return 3;
            }
            if (i3 > 0) {
                i3 = i - 2;
            }
        }
        int i4 = 0;
        while (true) {
            ArrayList[] arrayListArr = my3Var.c;
            if (i2 >= arrayListArr.length) {
                return 1;
            }
            if (i3 == i4) {
                return 2;
            }
            int size = arrayListArr[i2].size();
            if (my3Var.c.length > 1) {
                size = Math.min(az3Var.x1.J << 1, size);
            }
            int i5 = size + 1 + i4;
            if (i3 == i5) {
                return 4;
            }
            i4 = i5 + 1;
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5  */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        k14 k14Var;
        TLRPC.Document document;
        boolean z;
        TextView textView;
        boolean z2;
        TLRPC.StickerSet stickerSet;
        ?? r7;
        ArrayList<TLRPC.Document> arrayList;
        az3 az3Var = this.c;
        q55 q55Var = az3Var.x1;
        my3 my3Var = az3Var.o1;
        int i2 = i - 1;
        int i3 = u69Var.f;
        View view = u69Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        byte b = 1;
        if (i3 == 1) {
            if (az3Var.C1) {
                i2 = i - 2;
            }
            ty3 ty3Var = (ty3) view;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                ArrayList[] arrayListArr = my3Var.c;
                if (i4 >= arrayListArr.length) {
                    k14Var = null;
                    break;
                }
                int size = arrayListArr[i4].size();
                if (my3Var.c.length > 1) {
                    size = Math.min(q55Var.J << 1, size);
                }
                if (i2 > i5 && i2 <= i5 + size) {
                    k14Var = (k14) my3Var.c[i4].get((i2 - i5) - 1);
                    break;
                } else {
                    i5 += size + 2;
                    i4++;
                }
            }
            gn gnVar = ty3Var.c;
            if (gnVar != null || k14Var == null) {
                if (k14Var == null) {
                    if (gnVar == null) {
                        return;
                    }
                } else if (gnVar.documentId == k14Var.b) {
                    return;
                }
            }
            if (k14Var == null) {
                ty3Var.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = k14Var.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i6 = 0; i6 < k14Var.a.documents.size(); i6++) {
                    document = k14Var.a.documents.get(i6);
                    if (document != null && document.id == k14Var.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                ty3Var.c = new gn(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                ty3Var.c = new gn(k14Var.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i3 != 2) {
            if (i3 == 3) {
                TextView textView2 = (TextView) view;
                textView2.setTextSize(1, 13.0f);
                anb.X(textView2, cmb.Nf, az3Var.J0);
                textView2.setText(gm.S2(jb6.M0(2131746740, null)));
                textView2.setPadding(gm.L(14.0f), 0, gm.L(30.0f), gm.L(14.0f));
                return;
            }
            return;
        }
        if (az3Var.C1 && i2 > 0) {
            i2 = i - 2;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = my3Var.c;
            if (i7 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i7].size();
            if (my3Var.c.length > 1) {
                size2 = Math.min(q55Var.J << 1, size2);
            }
            if (i2 == i8) {
                break;
            }
            i8 += size2 + 2;
            i7++;
        }
        ArrayList arrayList2 = my3Var.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i7 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) my3Var.b.get(i7);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i9 = 0; i9 < tL_messages_stickerSet2.documents.size(); i9++) {
                if (!k47.m3(tL_messages_stickerSet2.documents.get(i9))) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (i7 < my3Var.c.length) {
            wy3 wy3Var = (wy3) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = wy3Var.d;
            TextView textView4 = wy3Var.c;
            az3 az3Var2 = wy3Var.y;
            cj8 cj8Var = wy3Var.e;
            l66 l66Var = wy3Var.a;
            wy3Var.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                l66Var.setText((CharSequence) null);
            } else {
                try {
                    Pattern pattern = az3.P1;
                    if (pattern == null) {
                        try {
                            pattern = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                            az3.P1 = pattern;
                        } catch (Exception e) {
                            e = e;
                            r7 = b;
                            charSequence = charSequence;
                            fc4.g(e, r7);
                            if (charSequence == null) {
                            }
                            l66Var.setText(charSequence);
                            textView = wy3Var.b;
                            if (textView != null) {
                            }
                            if (z) {
                            }
                            if (cj8Var != null) {
                            }
                            if (textView4 != null) {
                            }
                            if (textView3 != null) {
                            }
                            if (tL_messages_stickerSet2 != null) {
                            }
                            z2 = false;
                            wy3Var.a(z2, false);
                        }
                    }
                    Matcher matcher = pattern.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r6 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                l66Var.setMovementMethod(new cm(b));
                                r6 = spannableStringBuilder;
                            } catch (Exception e2) {
                                e = e2;
                                r7 = b;
                                charSequence = spannableStringBuilder;
                                fc4.g(e, r7);
                                if (charSequence == null) {
                                }
                                l66Var.setText(charSequence);
                                textView = wy3Var.b;
                                if (textView != null) {
                                }
                                if (z) {
                                    Pattern pattern2 = az3.P1;
                                    if (!z8c.h(az3Var2.a).p()) {
                                    }
                                }
                                if (cj8Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z2 = false;
                                wy3Var.a(z2, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        r6.setSpan(new vy3(wy3Var, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
                        b = 1;
                        charSequence = r6;
                    }
                } catch (Exception e3) {
                    e = e3;
                    r7 = 1;
                    charSequence = charSequence;
                }
                if (charSequence == null) {
                    charSequence = tL_messages_stickerSet2.set.title;
                }
                l66Var.setText(charSequence);
            }
            textView = wy3Var.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(jb6.G(size3, "EmojiCount", new Object[0]));
                } else {
                    textView.setText(jb6.G(size3, "Stickers", new Object[0]));
                }
            }
            if (z && cj8Var != null) {
                Pattern pattern22 = az3.P1;
                if (!z8c.h(az3Var2.a).p()) {
                    cj8Var.setVisibility(0);
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            if (cj8Var != null) {
                cj8Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                Pattern pattern3 = az3.P1;
                if (hs6.d0(az3Var2.a).D0(tL_messages_stickerSet2.set.id, true)) {
                    z2 = true;
                    wy3Var.a(z2, false);
                }
            }
            z2 = false;
            wy3Var.a(z2, false);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View zy3Var;
        az3 az3Var = this.c;
        if (i == 0) {
            view = az3Var.n1;
        } else {
            if (i == 1) {
                ty3 ty3Var = new ty3(az3Var.getContext());
                ty3Var.a = new in5[2];
                view = ty3Var;
            } else {
                if (i == 2) {
                    zy3Var = new wy3(az3Var, az3Var.getContext(), az3Var.o1.c.length <= 1);
                } else if (i == 3) {
                    zy3Var = new TextView(az3Var.getContext());
                } else if (i == 4) {
                    zy3Var = new zy3(az3Var.getContext());
                    int i2 = cmb.Bf;
                    Pattern pattern = az3.P1;
                    anb.h(i2, az3Var.J0, zy3Var);
                    g69 g69Var = new g69(-1, gm.e1());
                    ((ViewGroup.MarginLayoutParams) g69Var).topMargin = gm.L(14.0f);
                    zy3Var.setLayoutParams(g69Var);
                } else {
                    view = null;
                }
                view = zy3Var;
            }
        }
        return new b59(view);
    }
}
