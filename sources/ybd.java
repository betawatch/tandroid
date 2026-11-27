// default package

import j$.util.Map;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class ybd implements Map, Serializable, j$.util.Map {
    public final /* synthetic */ byte a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public /* synthetic */ ybd(byte b) {
        this.a = b;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r5v5 ??, r5v11 ??, r5v6 ??, r5v8 ??, r5v7 ??, r5v9 ??, r5v10 ??, r5v13 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:695)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public static void b(java.util.Set r18) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ybd.b(java.util.Set):void");
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        byte b = this.a;
        return Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        byte b = this.a;
        return Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        byte b = this.a;
        return Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            case 1:
                if (get(obj) != null) {
                }
                break;
            case 2:
                if (get(obj) != null) {
                }
                break;
            case 3:
                if (get(obj) != null) {
                }
                break;
            case 4:
                if (get(obj) != null) {
                }
                break;
            case 5:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                ldd lddVar = (ldd) this.d;
                if (lddVar == null) {
                    odd oddVar = (odd) this;
                    ldd lddVar2 = new ldd(1, oddVar.h, oddVar.f);
                    this.d = lddVar2;
                    lddVar = lddVar2;
                }
                return lddVar.contains(obj);
            case 1:
                ajd ajdVar = (ajd) this.d;
                if (ajdVar == null) {
                    ajd ajdVar2 = new ajd(1, ((djd) this).e);
                    this.d = ajdVar2;
                    ajdVar = ajdVar2;
                }
                return ajdVar.contains(obj);
            case 2:
                rkd rkdVar = (rkd) this.d;
                if (rkdVar == null) {
                    rkd rkdVar2 = new rkd(1, ((xkd) this).e);
                    this.d = rkdVar2;
                    rkdVar = rkdVar2;
                }
                return rkdVar.contains(obj);
            case 3:
                bnd bndVar = (bnd) this.d;
                if (bndVar == null) {
                    hnd hndVar = (hnd) this;
                    bnd bndVar2 = new bnd(1, hndVar.h, hndVar.f);
                    this.d = bndVar2;
                    bndVar = bndVar2;
                }
                return bndVar.contains(obj);
            case 4:
                kbe kbeVar = (kbe) this.d;
                if (kbeVar == null) {
                    qbe qbeVar = (qbe) this;
                    kbe kbeVar2 = new kbe(1, qbeVar.h, qbeVar.f);
                    this.d = kbeVar2;
                    kbeVar = kbeVar2;
                }
                return kbeVar.contains(obj);
            case 5:
                jmf jmfVar = (jmf) this.d;
                if (jmfVar == null) {
                    jmf jmfVar2 = new jmf(1, ((qmf) this).e);
                    this.d = jmfVar2;
                    jmfVar = jmfVar2;
                }
                return jmfVar.contains(obj);
            default:
                lad ladVar = (lad) this.d;
                if (ladVar == null) {
                    lad ladVar2 = new lad(1, ((vad) this).e);
                    this.d = ladVar2;
                    ladVar = ladVar2;
                }
                return ladVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                edd eddVar = (edd) this.b;
                if (eddVar != null) {
                    return eddVar;
                }
                odd oddVar = (odd) this;
                edd eddVar2 = new edd(oddVar, oddVar.f, oddVar.h);
                this.b = eddVar2;
                return eddVar2;
            case 1:
                tid tidVar = (tid) this.b;
                if (tidVar != null) {
                    return tidVar;
                }
                djd djdVar = (djd) this;
                tid tidVar2 = new tid(djdVar, djdVar.e);
                this.b = tidVar2;
                return tidVar2;
            case 2:
                ikd ikdVar = (ikd) this.b;
                if (ikdVar != null) {
                    return ikdVar;
                }
                xkd xkdVar = (xkd) this;
                ikd ikdVar2 = new ikd(xkdVar, xkdVar.e);
                this.b = ikdVar2;
                return ikdVar2;
            case 3:
                smd smdVar = (smd) this.b;
                if (smdVar != null) {
                    return smdVar;
                }
                hnd hndVar = (hnd) this;
                smd smdVar2 = new smd(hndVar, hndVar.f, hndVar.h);
                this.b = smdVar2;
                return smdVar2;
            case 4:
                kae kaeVar = (kae) this.b;
                if (kaeVar != null) {
                    return kaeVar;
                }
                qbe qbeVar = (qbe) this;
                kae kaeVar2 = new kae(qbeVar, qbeVar.f, qbeVar.h);
                this.b = kaeVar2;
                return kaeVar2;
            case 5:
                llf llfVar = (llf) this.b;
                if (llfVar != null) {
                    return llfVar;
                }
                qmf qmfVar = (qmf) this;
                llf llfVar2 = new llf(qmfVar, qmfVar.e);
                this.b = llfVar2;
                return llfVar2;
            default:
                v9d v9dVar = (v9d) this.b;
                if (v9dVar != null) {
                    return v9dVar;
                }
                vad vadVar = (vad) this;
                v9d v9dVar2 = new v9d(vadVar, vadVar.e);
                this.b = v9dVar2;
                return v9dVar2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 3:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 4:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 5:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return entrySet().equals(((java.util.Map) obj).entrySet());
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        byte b = this.a;
        Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            case 2:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
            case 3:
                Object obj6 = get(obj);
                return obj6 != null ? obj6 : obj2;
            case 4:
                Object obj7 = get(obj);
                return obj7 != null ? obj7 : obj2;
            case 5:
                Object obj8 = get(obj);
                return obj8 != null ? obj8 : obj2;
            default:
                Object obj9 = get(obj);
                return obj9 != null ? obj9 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                edd eddVar = (edd) this.b;
                if (eddVar == null) {
                    odd oddVar = (odd) this;
                    edd eddVar2 = new edd(oddVar, oddVar.f, oddVar.h);
                    this.b = eddVar2;
                    eddVar = eddVar2;
                }
                Iterator it = eddVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i += next != null ? next.hashCode() : 0;
                }
                return i;
            case 1:
                tid tidVar = (tid) this.b;
                if (tidVar == null) {
                    djd djdVar = (djd) this;
                    tid tidVar2 = new tid(djdVar, djdVar.e);
                    this.b = tidVar2;
                    tidVar = tidVar2;
                }
                Iterator it2 = tidVar.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i2 += next2 != null ? next2.hashCode() : 0;
                }
                return i2;
            case 2:
                ikd ikdVar = (ikd) this.b;
                if (ikdVar == null) {
                    xkd xkdVar = (xkd) this;
                    ikd ikdVar2 = new ikd(xkdVar, xkdVar.e);
                    this.b = ikdVar2;
                    ikdVar = ikdVar2;
                }
                Iterator it3 = ikdVar.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    i3 += next3 != null ? next3.hashCode() : 0;
                }
                return i3;
            case 3:
                smd smdVar = (smd) this.b;
                if (smdVar == null) {
                    hnd hndVar = (hnd) this;
                    smd smdVar2 = new smd(hndVar, hndVar.f, hndVar.h);
                    this.b = smdVar2;
                    smdVar = smdVar2;
                }
                Iterator it4 = smdVar.iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    i4 += next4 != null ? next4.hashCode() : 0;
                }
                return i4;
            case 4:
                kae kaeVar = (kae) this.b;
                if (kaeVar == null) {
                    qbe qbeVar = (qbe) this;
                    kae kaeVar2 = new kae(qbeVar, qbeVar.f, qbeVar.h);
                    this.b = kaeVar2;
                    kaeVar = kaeVar2;
                }
                Iterator it5 = kaeVar.iterator();
                int i5 = 0;
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    i5 += next5 != null ? next5.hashCode() : 0;
                }
                return i5;
            case 5:
                llf llfVar = (llf) this.b;
                if (llfVar == null) {
                    qmf qmfVar = (qmf) this;
                    llf llfVar2 = new llf(qmfVar, qmfVar.e);
                    this.b = llfVar2;
                    llfVar = llfVar2;
                }
                Iterator it6 = llfVar.iterator();
                int i6 = 0;
                while (it6.hasNext()) {
                    Object next6 = it6.next();
                    i6 += next6 != null ? next6.hashCode() : 0;
                }
                return i6;
            default:
                v9d v9dVar = (v9d) this.b;
                if (v9dVar == null) {
                    vad vadVar = (vad) this;
                    v9d v9dVar2 = new v9d(vadVar, vadVar.e);
                    this.b = v9dVar2;
                    v9dVar = v9dVar2;
                }
                Iterator it7 = v9dVar.iterator();
                int i7 = 0;
                while (it7.hasNext()) {
                    Object next7 = it7.next();
                    i7 += next7 != null ? next7.hashCode() : 0;
                }
                return i7;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (((odd) this).size() == 0) {
                }
                break;
            case 3:
                if (((hnd) this).size() == 0) {
                }
                break;
            case 4:
                if (((qbe) this).size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                gdd gddVar = (gdd) this.c;
                if (gddVar != null) {
                    return gddVar;
                }
                odd oddVar = (odd) this;
                gdd gddVar2 = new gdd(oddVar, new ldd(0, oddVar.h, oddVar.f));
                this.c = gddVar2;
                return gddVar2;
            case 1:
                xid xidVar = (xid) this.c;
                if (xidVar != null) {
                    return xidVar;
                }
                djd djdVar = (djd) this;
                xid xidVar2 = new xid(djdVar, new ajd(0, djdVar.e));
                this.c = xidVar2;
                return xidVar2;
            case 2:
                nkd nkdVar = (nkd) this.c;
                if (nkdVar != null) {
                    return nkdVar;
                }
                xkd xkdVar = (xkd) this;
                nkd nkdVar2 = new nkd(xkdVar, new rkd(0, xkdVar.e));
                this.c = nkdVar2;
                return nkdVar2;
            case 3:
                ymd ymdVar = (ymd) this.c;
                if (ymdVar != null) {
                    return ymdVar;
                }
                hnd hndVar = (hnd) this;
                ymd ymdVar2 = new ymd(hndVar, new bnd(0, hndVar.h, hndVar.f));
                this.c = ymdVar2;
                return ymdVar2;
            case 4:
                ebe ebeVar = (ebe) this.c;
                if (ebeVar != null) {
                    return ebeVar;
                }
                qbe qbeVar = (qbe) this;
                ebe ebeVar2 = new ebe(qbeVar, new kbe(0, qbeVar.h, qbeVar.f));
                this.c = ebeVar2;
                return ebeVar2;
            case 5:
                amf amfVar = (amf) this.c;
                if (amfVar != null) {
                    return amfVar;
                }
                qmf qmfVar = (qmf) this;
                amf amfVar2 = new amf(qmfVar, new jmf(0, qmfVar.e));
                this.c = amfVar2;
                return amfVar2;
            default:
                jad jadVar = (jad) this.c;
                if (jadVar != null) {
                    return jadVar;
                }
                vad vadVar = (vad) this;
                jad jadVar2 = new jad(vadVar, new lad(0, vadVar.e));
                this.c = jadVar2;
                return jadVar2;
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        byte b = this.a;
        return Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        byte b = this.a;
        return Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        byte b = this.a;
        return Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        byte b = this.a;
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        boolean z = true;
        switch (this.a) {
            case 0:
                int i = ((odd) this).h;
                if (i < 0) {
                    lq5.j(uh9.k(i, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb = new StringBuilder((int) Math.min(i << 3, 1073741824L));
                sb.append('{');
                Iterator it = ((edd) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder((int) 8);
                sb2.append('{');
                Iterator it2 = ((tid) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder((int) 8);
                sb3.append('{');
                Iterator it3 = ((ikd) entrySet()).iterator();
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!z) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z = false;
                }
                sb3.append('}');
                return sb3.toString();
            case 3:
                int i2 = ((hnd) this).h;
                if (i2 < 0) {
                    lq5.j(uh9.k(i2, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb4 = new StringBuilder((int) Math.min(i2 << 3, 1073741824L));
                sb4.append('{');
                Iterator it4 = ((smd) entrySet()).iterator();
                while (it4.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it4.next();
                    if (!z) {
                        sb4.append(", ");
                    }
                    sb4.append(entry4.getKey());
                    sb4.append('=');
                    sb4.append(entry4.getValue());
                    z = false;
                }
                sb4.append('}');
                return sb4.toString();
            case 4:
                int i3 = ((qbe) this).h;
                if (i3 < 0) {
                    lq5.j(uh9.k(i3, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb5 = new StringBuilder((int) Math.min(i3 << 3, 1073741824L));
                sb5.append('{');
                Iterator it5 = ((kae) entrySet()).iterator();
                while (it5.hasNext()) {
                    Map.Entry entry5 = (Map.Entry) it5.next();
                    if (!z) {
                        sb5.append(", ");
                    }
                    sb5.append(entry5.getKey());
                    sb5.append('=');
                    sb5.append(entry5.getValue());
                    z = false;
                }
                sb5.append('}');
                return sb5.toString();
            case 5:
                StringBuilder sb6 = new StringBuilder((int) 8);
                sb6.append('{');
                Iterator it6 = ((llf) entrySet()).iterator();
                while (it6.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it6.next();
                    if (!z) {
                        sb6.append(", ");
                    }
                    sb6.append(entry6.getKey());
                    sb6.append('=');
                    sb6.append(entry6.getValue());
                    z = false;
                }
                sb6.append('}');
                return sb6.toString();
            default:
                StringBuilder sb7 = new StringBuilder((int) 8);
                sb7.append('{');
                Iterator it7 = ((v9d) entrySet()).iterator();
                while (it7.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it7.next();
                    if (!z) {
                        sb7.append(", ");
                    }
                    sb7.append(entry7.getKey());
                    sb7.append('=');
                    sb7.append(entry7.getValue());
                    z = false;
                }
                sb7.append('}');
                return sb7.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                ldd lddVar = (ldd) this.d;
                if (lddVar != null) {
                    return lddVar;
                }
                odd oddVar = (odd) this;
                ldd lddVar2 = new ldd(1, oddVar.h, oddVar.f);
                this.d = lddVar2;
                return lddVar2;
            case 1:
                ajd ajdVar = (ajd) this.d;
                if (ajdVar != null) {
                    return ajdVar;
                }
                ajd ajdVar2 = new ajd(1, ((djd) this).e);
                this.d = ajdVar2;
                return ajdVar2;
            case 2:
                rkd rkdVar = (rkd) this.d;
                if (rkdVar != null) {
                    return rkdVar;
                }
                rkd rkdVar2 = new rkd(1, ((xkd) this).e);
                this.d = rkdVar2;
                return rkdVar2;
            case 3:
                bnd bndVar = (bnd) this.d;
                if (bndVar != null) {
                    return bndVar;
                }
                hnd hndVar = (hnd) this;
                bnd bndVar2 = new bnd(1, hndVar.h, hndVar.f);
                this.d = bndVar2;
                return bndVar2;
            case 4:
                kbe kbeVar = (kbe) this.d;
                if (kbeVar != null) {
                    return kbeVar;
                }
                qbe qbeVar = (qbe) this;
                kbe kbeVar2 = new kbe(1, qbeVar.h, qbeVar.f);
                this.d = kbeVar2;
                return kbeVar2;
            case 5:
                jmf jmfVar = (jmf) this.d;
                if (jmfVar != null) {
                    return jmfVar;
                }
                jmf jmfVar2 = new jmf(1, ((qmf) this).e);
                this.d = jmfVar2;
                return jmfVar2;
            default:
                lad ladVar = (lad) this.d;
                if (ladVar != null) {
                    return ladVar;
                }
                lad ladVar2 = new lad(1, ((vad) this).e);
                this.d = ladVar2;
                return ladVar2;
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        return Map.-CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        byte b = this.a;
        return Map.-CC.$default$remove(this, obj, obj2);
    }
}
