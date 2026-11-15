package qe;

import c8.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class j {
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final /* synthetic */ j[] h;
    public static final /* synthetic */ ld.b n;
    public final char a;
    public final char b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        n = l1.a(jVarArr);
    }

    public j(String str, int i7, char c10, char c11) {
        this.a = c10;
        this.b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
