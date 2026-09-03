package ra;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {
    public final Type a;
    public final Type b;
    public final Type[] c;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for " + type2);
            }
        }
        this.a = type == null ? null : d.a(type);
        this.b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.c[i10]);
            d.c(this.c[i10]);
            Type[] typeArr3 = this.c;
            typeArr3[i10] = d.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
        Type type = this.a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Type type = this.b;
        if (length == 0) {
            return d.k(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.k(type));
        sb.append("<");
        sb.append(d.k(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb.append(", ");
            sb.append(d.k(typeArr[i10]));
        }
        sb.append(">");
        return sb.toString();
    }
}
