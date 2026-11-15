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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rs extends org.telegram.ui.Components.pj0 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public final /* synthetic */ ts x;

    public rs(ts tsVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator qv0Var;
        this.x = tsVar;
        this.r = context;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ps psVar = (ps) arrayList.get(i7);
                String upperCase = psVar.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.w.add(upperCase);
                }
                arrayList2.add(psVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.t0.b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ps psVar2 = new ps();
                    psVar2.a = split[2];
                    psVar2.c = split[0];
                    String str = split[1];
                    psVar2.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = psVar2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.w.add(upperCase2);
                        }
                        arrayList3.add(psVar2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(org.telegram.messenger.hd.E0().y != null ? org.telegram.messenger.hd.E0().y : Locale.getDefault());
            Objects.requireNonNull(collator);
            qv0Var = new di.p4(collator, 6);
        } else {
            qv0Var = new qv0(14);
        }
        Collections.sort(this.w, qv0Var);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new qs(qv0Var, 0));
        }
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        int S = S(i7);
        ArrayList arrayList = this.w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(org.telegram.ui.Components.uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int M(int i7) {
        ArrayList arrayList = this.w;
        int size = ((ArrayList) this.s.get(arrayList.get(i7))).size();
        return i7 != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int P(int i7, int i10) {
        return i10 < ((ArrayList) this.s.get(this.w.get(i7))).size() ? 0 : 1;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int R() {
        return this.w.size();
    }

    @Override // org.telegram.ui.Components.pj0
    public final View T(int i7, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        return i10 < ((ArrayList) this.s.get(this.w.get(i7))).size();
    }

    @Override // org.telegram.ui.Components.pj0
    public final void W(int i7, int i10, v4.e1 e1Var) {
        if (e1Var.f == 0) {
            ps psVar = (ps) ((ArrayList) this.s.get(this.w.get(i7))).get(i10);
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) e1Var.a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.j6.m(ts.a0(psVar), v9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.x.h) {
                str = "+" + psVar.c;
            }
            v9Var.c(m10, str, false, false);
        }
    }

    @Override // org.telegram.ui.Components.pj0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final ps O(int i7, int i10) {
        if (i7 >= 0) {
            ArrayList arrayList = this.w;
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i7));
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    return (ps) arrayList2.get(i10);
                }
            }
        }
        return null;
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View Z;
        Context context = this.r;
        if (i7 != 0) {
            Z = new org.telegram.ui.Cells.e3(context, null);
            Z.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        } else {
            Z = ts.Z(context);
        }
        return new org.telegram.ui.Components.cj0(Z);
    }
}
