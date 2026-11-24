// default package

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
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xy2 extends m59 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public final /* synthetic */ az2 x;

    public xy2(az2 az2Var, Context context, ArrayList arrayList, boolean z) {
        Comparator saVar;
        this.x = az2Var;
        this.r = context;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                wy2 wy2Var = (wy2) arrayList.get(i);
                String upperCase = wy2Var.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.w.add(upperCase);
                }
                arrayList2.add(wy2Var);
            }
        } else {
            try {
                InputStream open = a.b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    wy2 wy2Var2 = new wy2();
                    wy2Var2.a = split[2];
                    wy2Var2.c = split[0];
                    String str = split[1];
                    wy2Var2.d = str;
                    if (!str.equals("FT") || !z) {
                        String upperCase2 = wy2Var2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.w.add(upperCase2);
                        }
                        arrayList3.add(wy2Var2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(jb6.D0().y != null ? jb6.D0().y : Locale.getDefault());
            Objects.requireNonNull(collator);
            saVar = new io0(collator, (byte) 0);
        } else {
            saVar = new sa((byte) 9);
        }
        Collections.sort(this.w, saVar);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new jo0(saVar, (byte) 2));
        }
    }

    @Override // z49
    public final String F(int i) {
        int S = S(i);
        ArrayList arrayList = this.w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    @Override // m59
    public final int M(int i) {
        ArrayList arrayList = this.w;
        int size = ((ArrayList) this.s.get(arrayList.get(i))).size();
        return i != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // m59
    public final int P(int i, int i2) {
        return i2 < ((ArrayList) this.s.get(this.w.get(i))).size() ? 0 : 1;
    }

    @Override // m59
    public final int R() {
        return this.w.size();
    }

    @Override // m59
    public final View T(int i, View view) {
        return null;
    }

    @Override // m59
    public final boolean V(int i, int i2, u69 u69Var) {
        return i2 < ((ArrayList) this.s.get(this.w.get(i))).size();
    }

    @Override // m59
    public final void W(int i, int i2, u69 u69Var) {
        if (u69Var.f == 0) {
            wy2 wy2Var = (wy2) ((ArrayList) this.s.get(this.w.get(i))).get(i2);
            vkb vkbVar = (vkb) u69Var.a;
            String str = null;
            CharSequence m = gw3.m(az2.a0(wy2Var), vkbVar.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.x.h) {
                str = "+" + wy2Var.c;
            }
            vkbVar.c(m, str, false, false);
        }
    }

    @Override // m59
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final wy2 O(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.w;
            if (i < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i));
                if (i2 >= 0 && i2 < arrayList2.size()) {
                    return (wy2) arrayList2.get(i2);
                }
            }
        }
        return null;
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View Z;
        Context context = this.r;
        if (i != 0) {
            Z = new aq3(context, null);
            Z.setPadding(gm.L(24.0f), gm.L(8.0f), gm.L(24.0f), gm.L(8.0f));
        } else {
            Z = az2.Z(context);
        }
        return new b59(Z);
    }
}
