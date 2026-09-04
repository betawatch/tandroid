package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xt extends org.telegram.ui.Components.hl0 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final /* synthetic */ bu w;

    public xt(bu buVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator f11Var;
        this.w = buVar;
        this.r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                vt vtVar = (vt) arrayList.get(i10);
                String upperCase = vtVar.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(vtVar);
            }
        } else {
            try {
                InputStream open = ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    vt vtVar2 = new vt();
                    vtVar2.a = split[2];
                    vtVar2.c = split[0];
                    String str = split[1];
                    vtVar2.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = vtVar2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.v.add(upperCase2);
                        }
                        arrayList3.add(vtVar2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
            Objects.requireNonNull(collator);
            f11Var = new bi.l7(collator, 5);
        } else {
            f11Var = new f11(9);
        }
        Collections.sort(this.v, f11Var);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new wt(f11Var, 0));
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        int S = S(i10);
        ArrayList arrayList = this.v;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(org.telegram.ui.Components.ll0 ll0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.hl0
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.s.get(arrayList.get(i10))).size();
        return i10 != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // org.telegram.ui.Components.hl0
    public final int P(int i10, int i11) {
        return i11 < ((ArrayList) this.s.get(this.v.get(i10))).size() ? 0 : 1;
    }

    @Override // org.telegram.ui.Components.hl0
    public final int R() {
        return this.v.size();
    }

    @Override // org.telegram.ui.Components.hl0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.hl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return i11 < ((ArrayList) this.s.get(this.v.get(i10))).size();
    }

    @Override // org.telegram.ui.Components.hl0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        String str;
        if (c1Var.f == 0) {
            vt vtVar = (vt) ((ArrayList) this.s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(bu.V(vtVar), eaVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.w.h) {
                str = "+" + vtVar.c;
            } else {
                str = null;
            }
            eaVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override // org.telegram.ui.Components.hl0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final vt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (vt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View U;
        Context context = this.r;
        if (i10 != 0) {
            U = new org.telegram.ui.Cells.c3(context, null);
            U.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            U = bu.U(context);
        }
        return new org.telegram.ui.Components.vk0(U);
    }
}
