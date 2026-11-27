// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vp3 implements hx5 {
    public static final vp3 a = new vp3();
    public static final om8 b = new om8("kotlin.Double", nm8.c);

    @Override // hx5
    public final void b(d30 d30Var, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        wj1 wj1Var = (wj1) ((n31) d30Var.b).c;
        if (d30Var.a) {
            d30Var.k(String.valueOf(doubleValue));
        } else {
            wj1Var.c(String.valueOf(doubleValue));
        }
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            throw new ww5("Unexpected special floating-point value " + Double.valueOf(doubleValue) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) hqe.b(-1, wj1Var.toString())));
        }
    }

    @Override // hx5
    public final Object c(ykf ykfVar) {
        d2c d2cVar = (d2c) ykfVar.d;
        String k = d2cVar.k();
        try {
            double parseDouble = Double.parseDouble(k);
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            d2c.m(d2cVar, "Unexpected special floating-point value " + Double.valueOf(parseDouble) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            d2c.m(d2cVar, "Failed to parse type 'double' for input '" + k + '\'', 0, 6);
            throw null;
        }
    }

    @Override // hx5
    public final o8a d() {
        return b;
    }
}
