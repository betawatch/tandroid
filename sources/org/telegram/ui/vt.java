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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vt extends org.telegram.ui.Components.pl0 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final /* synthetic */ zt w;

    public vt(zt ztVar, Context context, ArrayList arrayList, boolean z4) {
        Comparator fVar;
        this.w = ztVar;
        this.r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tt ttVar = (tt) arrayList.get(i10);
                String upperCase = ttVar.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(ttVar);
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
                    tt ttVar2 = new tt();
                    ttVar2.a = split[2];
                    ttVar2.c = split[0];
                    String str = split[1];
                    ttVar2.d = str;
                    if (!str.equals("FT") || !z4) {
                        String upperCase2 = ttVar2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.v.add(upperCase2);
                        }
                        arrayList3.add(ttVar2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
            Objects.requireNonNull(collator);
            fVar = new d4.t(collator, 2);
        } else {
            fVar = new e5.f(13);
        }
        Collections.sort(this.v, fVar);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new ut(fVar, 0));
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        int S = S(i10);
        ArrayList arrayList = this.v;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(org.telegram.ui.Components.tl0 tl0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.pl0
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.s.get(arrayList.get(i10))).size();
        return i10 != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // org.telegram.ui.Components.pl0
    public final int P(int i10, int i11) {
        return i11 < ((ArrayList) this.s.get(this.v.get(i10))).size() ? 0 : 1;
    }

    @Override // org.telegram.ui.Components.pl0
    public final int R() {
        return this.v.size();
    }

    @Override // org.telegram.ui.Components.pl0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.pl0
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        return i11 < ((ArrayList) this.s.get(this.v.get(i10))).size();
    }

    @Override // org.telegram.ui.Components.pl0
    public final void W(int i10, int i11, f2.m1 m1Var) {
        String str;
        if (m1Var.f == 0) {
            tt ttVar = (tt) ((ArrayList) this.s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) m1Var.a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(zt.V(ttVar), aaVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.w.h) {
                str = "+" + ttVar.c;
            } else {
                str = null;
            }
            aaVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override // org.telegram.ui.Components.pl0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final tt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (tt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View U;
        Context context = this.r;
        if (i10 != 0) {
            U = new org.telegram.ui.Cells.c3(context, null);
            U.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            U = zt.U(context);
        }
        return new org.telegram.ui.Components.fl0(U);
    }
}
