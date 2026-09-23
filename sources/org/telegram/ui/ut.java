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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ut extends org.telegram.ui.Components.il0 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final /* synthetic */ xt w;

    public ut(xt xtVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator cb1Var;
        this.w = xtVar;
        this.r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                st stVar = (st) arrayList.get(i10);
                String upperCase = stVar.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(stVar);
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
                    st stVar2 = new st();
                    stVar2.a = split[2];
                    stVar2.c = split[0];
                    String str = split[1];
                    stVar2.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = stVar2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.v.add(upperCase2);
                        }
                        arrayList3.add(stVar2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
            Objects.requireNonNull(collator);
            cb1Var = new ai.e8(collator, 5);
        } else {
            cb1Var = new cb1(7);
        }
        Collections.sort(this.v, cb1Var);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new tt(cb1Var, 0));
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public final String F(int i10) {
        int S = S(i10);
        ArrayList arrayList = this.v;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.uk0
    public final void G(org.telegram.ui.Components.ml0 ml0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.il0
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.s.get(arrayList.get(i10))).size();
        return i10 != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // org.telegram.ui.Components.il0
    public final int P(int i10, int i11) {
        return i11 < ((ArrayList) this.s.get(this.v.get(i10))).size() ? 0 : 1;
    }

    @Override // org.telegram.ui.Components.il0
    public final int R() {
        return this.v.size();
    }

    @Override // org.telegram.ui.Components.il0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return i11 < ((ArrayList) this.s.get(this.v.get(i10))).size();
    }

    @Override // org.telegram.ui.Components.il0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        String str;
        if (c1Var.f == 0) {
            st stVar = (st) ((ArrayList) this.s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) c1Var.a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(xt.V(stVar), faVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.w.h) {
                str = "+" + stVar.c;
            } else {
                str = null;
            }
            faVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override // org.telegram.ui.Components.il0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final st O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (st) arrayList2.get(i11);
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
            U = xt.U(context);
        }
        return new org.telegram.ui.Components.wk0(U);
    }
}
