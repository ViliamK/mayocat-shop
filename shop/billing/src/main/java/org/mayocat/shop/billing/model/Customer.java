package org.mayocat.shop.billing.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.mayocat.model.Entity;
import org.mayocat.model.Identifiable;
import org.mayocat.model.annotation.SearchIndex;

/**
 * @version $Id$
 */
public class Customer implements Entity
{
    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    @SearchIndex
    @NotNull
    @Size(min = 1)
    private String slug;

    public String getSlug()
    {
        return slug;
    }

    public void setSlug(String slug)
    {
        this.slug = slug;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}