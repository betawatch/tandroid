package pa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends u {
    public final /* synthetic */ int a;

    @Override // pa.u
    public final Object read(xa.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.x() != 9) {
                    return Double.valueOf(aVar.o());
                }
                aVar.t();
                return null;
            case 1:
                if (aVar.x() != 9) {
                    return Float.valueOf((float) aVar.o());
                }
                aVar.t();
                return null;
            default:
                aVar.C();
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double doubleValue = number.doubleValue();
                    g.a(doubleValue);
                    bVar.n(doubleValue);
                    break;
                } else {
                    bVar.i();
                    break;
                }
            case 1:
                Number number2 = (Number) obj;
                if (number2 != null) {
                    float floatValue = number2.floatValue();
                    g.a(floatValue);
                    if (!(number2 instanceof Float)) {
                        number2 = Float.valueOf(floatValue);
                    }
                    bVar.q(number2);
                    break;
                } else {
                    bVar.i();
                    break;
                }
            default:
                bVar.i();
                break;
        }
    }
}
