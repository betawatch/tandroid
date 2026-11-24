// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pne {
    public static final void a(cy2 cy2Var) {
        av5 av5Var = (av5) cy2Var.get(nf5.c);
        if (av5Var != null && !av5Var.isActive()) {
            throw av5Var.getCancellationException();
        }
    }

    public static final av5 b(cy2 cy2Var) {
        av5 av5Var = (av5) cy2Var.get(nf5.c);
        if (av5Var != null) {
            return av5Var;
        }
        zo4.p(cy2Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final xp3 c(av5 av5Var, boolean z, ev5 ev5Var) {
        return av5Var instanceof ov5 ? ((ov5) av5Var).z(z, ev5Var) : av5Var.invokeOnCompletion(ev5Var.k(), z, new dv5(1, ev5Var, ev5.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }
}
