// default package

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class sa1 implements yw5, Serializable {
    public static final Object NO_RECEIVER = ra1.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient yw5 reflected;
    private final String signature;

    public sa1(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // yw5
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // yw5
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public yw5 compute() {
        yw5 yw5Var = this.reflected;
        if (yw5Var != null) {
            return yw5Var;
        }
        yw5 computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public yw5 computeReflected() {
        h79.a.getClass();
        return this;
    }

    @Override // xw5
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public zw5 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return h79.a(cls);
        }
        h79.a.getClass();
        return new kt7(cls);
    }

    @Override // yw5
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract yw5 getReflected();

    @Override // yw5
    public dx5 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // yw5
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // yw5
    public ex5 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // yw5
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // yw5
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // yw5
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
