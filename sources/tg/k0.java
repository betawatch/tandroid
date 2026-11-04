package tg;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k0 {
    public static final List m;
    public static final List n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final k0[] r;
    public final SharedPreferences a;
    public final ArrayList b;
    public final HashMap c;
    public List d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public float i;
    public String j;
    public boolean k;
    public boolean l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        n = asList2;
        int size = asList.size();
        o = size;
        int size2 = asList2.size();
        p = size2;
        q = size + size2;
        r = new k0[4];
    }

    public k0(int i3) {
        int i10 = q;
        this.b = new ArrayList(i10);
        HashMap hashMap = new HashMap(h.a.size());
        this.c = hashMap;
        this.d = new ArrayList(i10);
        int i11 = 0;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("photo_color_palette_" + i3, 0);
        this.a = sharedPreferences;
        this.f = sharedPreferences.getInt("brush", 0);
        this.i = sharedPreferences.getFloat("weight", 0.5f);
        this.j = sharedPreferences.getString("typeface", "roboto");
        this.g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.k = sharedPreferences.getBoolean("fill_shapes", false);
        int i12 = 0;
        while (i12 < o) {
            i12 = com.google.android.recaptcha.internal.a.f((int) sharedPreferences.getLong(p1.i(i12, "color_"), ((Integer) m.get(i12)).intValue()), i12, 1, this.b);
        }
        while (true) {
            if (i11 >= h.a.size()) {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            } else {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf((int) sharedPreferences.getLong(p1.i(i11, "brush_color_"), ((h) r1.get(i11)).c())));
                i11++;
            }
        }
    }

    public static k0 e(int i3) {
        k0[] k0VarArr = r;
        if (k0VarArr[i3] == null) {
            k0VarArr[i3] = new k0(i3);
        }
        return k0VarArr[i3];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(m);
        SharedPreferences.Editor edit = this.a.edit();
        for (int i3 = 0; i3 < h.a.size(); i3++) {
            edit.remove("brush_color_" + i3);
        }
        edit.remove("brush_color_-1");
        this.c.clear();
        edit.apply();
        g();
    }

    public final int b(int i3) {
        int i10 = q;
        if (i3 < 0 || i3 >= i10) {
            throw new IndexOutOfBoundsException(p1.i(i10, "Color palette index should be in range 0 ... "));
        }
        List list = n;
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(this.b);
        if (i3 < arrayList.size()) {
            return ((Integer) arrayList.get(i3)).intValue();
        }
        int i11 = p;
        return i3 < i11 ? ((Integer) list.get(i3)).intValue() : ((Integer) m.get(i3 - i11)).intValue();
    }

    public final int c() {
        Integer valueOf = Integer.valueOf(this.f);
        HashMap hashMap = this.c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            num = Integer.valueOf((int) this.a.getLong("brush_color_" + this.f, this.f == -1 ? -1L : ((h) h.a.get(r2)).c()));
            hashMap.put(Integer.valueOf(this.f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c2 = c();
        ArrayList arrayList = new ArrayList(n);
        arrayList.addAll(this.b);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((Integer) arrayList.get(i3)).intValue() == c2) {
                return i3;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        if (!this.d.isEmpty() || this.e) {
            SharedPreferences.Editor edit = this.a.edit();
            if (!this.d.isEmpty()) {
                int i3 = 0;
                while (i3 < o) {
                    edit.putLong(p1.i(i3, "color_"), ((Integer) (i3 < this.d.size() ? this.d : m).get(i3)).intValue());
                    i3++;
                }
                ArrayList arrayList = this.b;
                arrayList.clear();
                arrayList.addAll(this.d);
                this.d.clear();
            }
            if (this.e) {
                if (((Integer) this.c.get(Integer.valueOf(this.f))) != null) {
                    edit.putLong("brush_color_" + this.f, r1.intValue());
                }
                this.e = false;
            }
            edit.apply();
        }
    }

    public final void h(int i3, boolean z10) {
        ArrayList arrayList = new ArrayList(n);
        Collection collection = this.b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i3));
        HashMap hashMap = this.c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f), Integer.valueOf(b(indexOf)));
                this.e = true;
                return;
            }
            return;
        }
        if (!this.d.isEmpty()) {
            collection = this.d;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        this.d.clear();
        this.d.add(Integer.valueOf(i3));
        for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
            this.d.add((Integer) arrayList2.get(i10));
        }
        int size = this.d.size();
        List list = m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f), Integer.valueOf(i3));
            this.e = true;
        }
    }

    public final void i(int i3, boolean z10) {
        this.f = i3;
        if (z10) {
            this.a.edit().putInt("brush", i3).apply();
        }
        Integer num = (Integer) this.c.get(Integer.valueOf(i3));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.i = f10;
        this.a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        this.a.edit().putFloat("weight_" + str, f10).apply();
    }
}
