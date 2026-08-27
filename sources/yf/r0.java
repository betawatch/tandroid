package yf;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r0 {
    public static final List m;
    public static final List n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final r0[] r;
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
        r = new r0[4];
    }

    public r0(int i10) {
        int i11 = q;
        this.b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.a.size());
        this.c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.a = sharedPreferences;
        this.f = sharedPreferences.getInt("brush", 0);
        this.i = sharedPreferences.getFloat("weight", 0.5f);
        this.j = sharedPreferences.getString("typeface", "roboto");
        this.g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < o) {
            i13 = i0.a.f((int) sharedPreferences.getLong(i0.a.k(i13, "color_"), ((Integer) m.get(i13)).intValue()), i13, 1, this.b);
        }
        while (true) {
            if (i12 >= m.a.size()) {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            } else {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(i0.a.k(i12, "brush_color_"), ((m) r1.get(i12)).c())));
                i12++;
            }
        }
    }

    public static r0 e(int i10) {
        r0[] r0VarArr = r;
        if (r0VarArr[i10] == null) {
            r0VarArr[i10] = new r0(i10);
        }
        return r0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(m);
        SharedPreferences.Editor edit = this.a.edit();
        for (int i10 = 0; i10 < m.a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = q;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(i0.a.k(i11, "Color palette index should be in range 0 ... "));
        }
        List list = n;
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(this.b);
        if (i10 < arrayList.size()) {
            return ((Integer) arrayList.get(i10)).intValue();
        }
        int i12 = p;
        return i10 < i12 ? ((Integer) list.get(i10)).intValue() : ((Integer) m.get(i10 - i12)).intValue();
    }

    public final int c() {
        Integer valueOf = Integer.valueOf(this.f);
        HashMap hashMap = this.c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            num = Integer.valueOf((int) this.a.getLong("brush_color_" + this.f, this.f == -1 ? -1L : ((m) m.a.get(r2)).c()));
            hashMap.put(Integer.valueOf(this.f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(n);
        arrayList.addAll(this.b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
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
                int i10 = 0;
                while (i10 < o) {
                    edit.putLong(i0.a.k(i10, "color_"), ((Integer) (i10 < this.d.size() ? this.d : m).get(i10)).intValue());
                    i10++;
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

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(n);
        Collection collection = this.b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
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
        this.d.add(Integer.valueOf(i10));
        for (int i11 = 0; i11 < arrayList2.size() - 1; i11++) {
            this.d.add((Integer) arrayList2.get(i11));
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
            hashMap.put(Integer.valueOf(this.f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f = i10;
        if (z10) {
            this.a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.c.get(Integer.valueOf(i10));
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
